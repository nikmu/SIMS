package org.bme.common.utils.hql;

import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONObject;

import org.bme.common.utils.DateUtil;
import org.bme.common.utils.JsonBuilder;
import org.bme.common.utils.StringUtil;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：FieldJoint   
 * 类描述：HQL语句中字段的拼接
 * 创建人：张俊   
 * 创建时间：2016年3月8日 下午3:32:21   
 * 修改人：张俊   
 * 修改时间：2016年3月8日 下午3:32:21   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class FieldJoint {

	/**
	 * 拼装条件部分的精确和模糊查询语句
	 * 
	 * @param isAccurate
	 *            判断是精确查询还是模糊查询
	 * @param paramStr
	 *            需要拼装的字符串（如果是精确查询则该字段为json格式的String，如果是模糊查询则该字段是String[]
	 *            格式的String）
	 * @param queryValue
	 * 			      所需查询值，只有是模糊查询时，则该字段才存在，否则为“”
	 * @param fieldConnSign
	 *            字段之间的连接符
	 * @param KeyPrefixMap
	 *            由于HQL语句是根据类来查询，所以将字段作为条件查询时需要以字段所在类结构为标准
	 * @return 拼装条件部分的查询语句
	 */
	@SuppressWarnings("unchecked")
	public String handleField(boolean isAccurate, String paramStr,
			String queryValue, String fieldConnSignStr,
			HashMap<String, String> KeyPrefixMap) {
		// 封装条件部分的SQL语句
		StringBuilder conditionPartSQL = new StringBuilder("");
		// KeyPrefixMap中键所对应的值
		String mapValueStr = "";
		// 判断是精确查询还是模糊查询；true为精确查询，false为模糊查询
		if(isAccurate){
			// 根据所传入的字符串，转换成JSONObject
			JSONObject jsonObj = JsonBuilder.strToJsonObj(paramStr);
			// 获取jsonObj中的所有键
			List<String> keyList = jsonObj.names();
			// jsonObj中键所对应的值
			String valueStr = "";
			// 起止时间
			String[] dateTimeStrs;
			// 以下foreach循环主要是根据键将键所对应的值按照字段的连接符（or、and）进行拼接
			for (String keyStr : keyList) {
				// 根据键获得值
				valueStr = jsonObj.getString(keyStr);
				
				if (valueStr.intern() != "") {
					mapValueStr = KeyPrefixMap.get(keyStr) != null ? KeyPrefixMap
							.get(keyStr).toString() : "";
					if (mapValueStr.intern() != "") {
						keyStr = mapValueStr;
					}
					// 用来判断字段中是否包含日期段的查询
					if(!valueStr.contains(",")){
						conditionPartSQL.append(keyStr + HQLConnSign.STR_HQL_CONN_LIKE
								+ "'%" + valueStr + "%'" + fieldConnSignStr);
					} else {
						dateTimeStrs = valueStr.split(",");
						if(dateTimeStrs.length > 0){
							if(dateTimeStrs.length == 2 && !dateTimeStrs[0].equals("") && !dateTimeStrs[1].equals("")){
								conditionPartSQL.append(keyStr + HQLConnSign.betweenDate(
										dateTimeStrs[0], dateTimeStrs[1])
										+ fieldConnSignStr);
							}else if(!dateTimeStrs[0].equals("")){
								conditionPartSQL.append(HQLConnSign.greaterThanDate(
										keyStr, dateTimeStrs[0])
										+ fieldConnSignStr);
							}else if(!dateTimeStrs[1].equals("")){
								conditionPartSQL.append(HQLConnSign.lessThanDate(
										keyStr, dateTimeStrs[1])
										+ fieldConnSignStr);
							}
						}
					}
				}
			}
		} else {
			// 将String[]格式的String转换为String[]
			String[] fieldsStrArr = DateUtil.getArraystr(paramStr);
			// 以下foreach循环主要是根据键将键所对应的值按照字段的连接符（or、and）进行拼接
			for (String keyStr : fieldsStrArr) {
				if (queryValue.intern() != "") {
					mapValueStr = KeyPrefixMap.get(keyStr) != null ? KeyPrefixMap
							.get(keyStr).toString() : "";
					if (mapValueStr.intern() != "") {
						keyStr = mapValueStr;
					}
					conditionPartSQL.append(keyStr + HQLConnSign.STR_HQL_CONN_LIKE
							+ "'%" + queryValue + "%'" + fieldConnSignStr);
				}
			}
		}
		// 判断字段所对应的
		if (conditionPartSQL.length() > 0) {
			// 字段之间的连接字符为“and”
			if (fieldConnSignStr.equals(HQLConnSign.STR_HQL_CONN_AND)) {
				// 删除最后一个“ and ”字符串
				conditionPartSQL = StringUtil.deleteString(
						conditionPartSQL.toString(), "after", 4);
				// 字段之间的连接字符为“or”
			} else if (fieldConnSignStr.equals(HQLConnSign.STR_HQL_CONN_OR)) {
				// 删除最后一个“ or ”字符串
				conditionPartSQL = StringUtil.deleteString(
						conditionPartSQL.toString(), "after", 3);
			}
		}
		return conditionPartSQL.toString();
	}

	public String orderBySQL(String orderStr, String fieldStr) {
		String orderBySQLStr = "";
		if (orderStr.intern() == HQLConnSign.STR_HQL_CONN_ASC) {
			orderBySQLStr = " ORDER BY " + fieldStr + " asc";
		} else if (orderStr.intern() == HQLConnSign.STR_HQL_CONN_DESC) {
			orderBySQLStr = " ORDER BY " + fieldStr + " desc";
		}
		return orderBySQLStr;
	}
}
