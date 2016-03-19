package org.bme.common.utils.hql;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONObject;

import org.bme.common.model.SortableField_QueryHQL;
import org.bme.common.utils.JsonBuilder;
import org.bme.common.utils.StringUtil;
import org.bme.common.utils.Util;
import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

/**
 * 
 * 项目名称：TEMS（教学评价管理系统）   
 * 类名称：GeneratorHQL   
 * 类描述：HQL语句生成类
 * 创建人：张俊   
 * 创建时间：2016年2月5日 下午4:24:55   
 * 修改人：张俊   
 * 修改时间：2016年2月5日 下午4:24:55   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class GeneratorHQL {

	FieldJoint fieldJoint = new FieldJoint();

	/**
	 * 
	 * 方法名 ： commonGenerateBeanClass
	 * 功能描述：类的实例化
	 * 输入参数：<按照参数定义顺序> 
	 *     @param obj 所需实例化的类对象
	 *     @param classPath 所需实例化的类路径
	 * 返回值：Class<?>类型的数据
	 * 异常：Exception
	 * 创建人：张俊   
	 * 创建时间：2016年2月5日 下午5:52:40   
	 * 修改人：张俊   
	 * 修改时间：2016年2月5日 下午5:52:40
	 *
	 */
	public static Class<?> generateBeanClass(Object obj, String classPath)
			throws Exception {
		Class<?> beanClass = null;
		Object objLocal = obj;
		if (classPath.intern() != "") {
			// 通过类的路径获取类
			beanClass = Class.forName(classPath);
			objLocal = beanClass.newInstance();
		} else if (objLocal != null) {
			// 通过实例化的类对象获取类
			beanClass = objLocal.getClass();
		}
		return beanClass;
	}
	
	/**
	 * 
	 * 方法名 ： generalQueryHQL
	 * 功能描述： 一般HQL查询的生成类
	 * 输入参数：<按照参数定义顺序> 
	 *     @param obj Model类
	 *     @param entity 查询的实体类
	 *     @param queryCondition 查询条件
	 * 返回值：String类型的数据
	 * 异常：无
	 * 创建人：张俊   
	 * 创建时间：2016年2月5日 下午6:26:01   
	 * 修改人：张俊   
	 * 修改时间：2016年2月5日 下午6:26:01
	 *
	 */
	public static String generalQueryHQL(Object obj, String entity,
			String queryCondition) throws Exception {
		List<SortableField_QueryHQL> list = getFieldAndAnnotation(obj, "");
		String hql = generQueryHQL_NoCondition(obj, "", entity, list);
		if (!Util.isNull(queryCondition)) {
			StringBuilder conditionPartHQL = new StringBuilder(" where ");
			if (list.size() > 0) {
				String aliasStr = "";
				for (SortableField_QueryHQL field : list) {
					aliasStr = field.getMeta().alias();
					if (!"".equals(aliasStr)) {
						conditionPartHQL.append(aliasStr + " like '%"
								+ queryCondition + "%' or ");
					}else{
						conditionPartHQL.append(field.getName() + " like '%"
								+ queryCondition + "%' or ");
					}
				}
			}
			// 判断是否存在条件语句
			if (conditionPartHQL.toString().contains("or")) {
				// 删除最后一个“ or ”字符串
				conditionPartHQL = StringUtil.deleteString(
						conditionPartHQL.toString(), "after", 3);
				hql += conditionPartHQL;
			}
		}
		return hql;
	}
	
	/**
	 * 
	 * 方法名 ： exactQueryHQL
	 * 功能描述： 精确HQL查询的生成类
	 * 输入参数：<按照参数定义顺序> 
	 *     <@param后面空格后跟着参数的变量名字（不是类型），空格后跟着对该参数的描述。> 
	 * 返回值：String类型的数据
	 * 异常：无
	 * 创建人：张俊   
	 * 创建时间：2016年2月5日 下午7:58:20   
	 * 修改人：张俊   
	 * 修改时间：2016年2月5日 下午7:58:20
	 *
	 */
	@SuppressWarnings("unchecked")
	public static String exactQueryHQL(Object obj, String entity, String paramPairs)
			throws Exception {
		List<SortableField_QueryHQL> list = getFieldAndAnnotation(obj, "");
		HashMap<String, String> KeyPrefixMap = queryHQLAliasReplace(list);
		String hql = generQueryHQL_NoCondition(obj, "", entity, list);
		// 根据所传入的字符串，转换成JSONObject
		JSONObject jsonObj = JsonBuilder.strToJsonObj(paramPairs);
		// 获取jsonObj中的所有键
		List<String> keyList = jsonObj.names();
		// jsonObj中键所对应的值
		String valueStr = "";
		// KeyPrefixMap中键所对应的值
		String mapValueStr = "";
		// 条件语句部分初始化
		StringBuilder conditionPartHQL = new StringBuilder(" where ");
		// 以下foreach循环主要是根据键将键所对应的值按照字段的连接符（or、and）进行拼接
		for (String keyStr : keyList) {
			// 根据键获得值
			valueStr = jsonObj.getString(keyStr);
			if (valueStr.intern() != "") {
				mapValueStr = KeyPrefixMap.get(keyStr) != null ? KeyPrefixMap
						.get(keyStr).toString() : "";
				if ("" != mapValueStr.intern()) {
					keyStr = mapValueStr;
				}
				conditionPartHQL.append(keyStr + " like '%" + valueStr
						+ "%' and ");
			}
		}
		// 判断是否存在条件语句
		if (conditionPartHQL.toString().contains("and")) {
			// 删除最后一个“ and ”字符串
			conditionPartHQL = StringUtil.deleteString(
					conditionPartHQL.toString(), "after", 4);
			hql += conditionPartHQL;
		}
		return hql;
	}
	
	
	/**
	 * 
	 * 方法名 ： queryHQLAliasReplace
	 * 功能描述： 对于查询语句中查询条件部分的条件，如果字段存在别名则将字段名替换成别名，
	 * 		      并存放在HashMap中形成键值对。
	 * 输入参数：<按照参数定义顺序> 
	 *      @param list 
	 * 返回值：HashMap<String,String>类型的数据
	 * 异常：Exception
	 * 创建人：张俊   
	 * 创建时间：2016年2月5日 下午4:29:53   
	 * 修改人：张俊   
	 * 修改时间：2016年2月5日 下午4:29:53
	 *
	 */
	public static HashMap<String, String> queryHQLAliasReplace(List<SortableField_QueryHQL> list)
			throws Exception {
		HashMap<String, String> KeyPrefixMap = new HashMap<String, String>();
		if (list.size() > 0) {
			String aliasStr = "";
			for (SortableField_QueryHQL field : list) {
				aliasStr = field.getMeta().alias();
				if (!"".equals(aliasStr)) {
					KeyPrefixMap.put(field.getName(), aliasStr);
				}
			}
		}
		return KeyPrefixMap;
	}
	
	/**
	 * 根据Model或类的路径生成不带条件的HQL语句(主要是生成指定字段的HQL查询语句)
	 * 
	 * @param obj
	 *            Model
	 * @param classPath
	 *            Model的位置
	 * @param entityName
	 *            所需查询的实体名称（与数据库表对应的实体名称）
	 * @return
	 * @throws Exception
	 */
	public static String generQueryHQL_NoCondition(Object obj, String classPath,
			String entityName, List<SortableField_QueryHQL> list) throws Exception {
		String returnHQLStr = "";
		if (list.size() > 0) {
			String path = "";
			if (classPath.intern() != "") {
				path = classPath;
			} else {
				path = obj.getClass().getName();
			}
			StringBuilder hQL = new StringBuilder("select new " + path
					+ "(");
			int hQLInitLength = hQL.length();
			String aliasStr = "";
			for (SortableField_QueryHQL field : list) {
				aliasStr = field.getMeta().alias();
				if (!aliasStr.equals("")) {
					hQL.append(aliasStr + ", ");
				} else {
					hQL.append(field.getName() + ", ");
				}
			}
			if (hQLInitLength != hQL.length()) {
				hQL = StringUtil.deleteString(hQL.toString(), "after", 2);
				hQL.append(") from " + entityName);
				returnHQLStr = hQL.toString();
			}
		}
		return returnHQLStr;
	}

	/**
	 * 
	 * 方法名 ： initQueryHQL
	 * 功能描述： 通过Java反射获取Model中的属性和注解，主要用于查询语句的拼接
	 * 输入参数：<按照参数定义顺序> 
	 *     @param obj 
	 *     @param classPath
	 * 返回值：List<SortableField_QueryHQL>类型的数据
	 * 异常：Exception
	 * 创建人：张俊   
	 * 创建时间：2016年2月5日 下午6:06:20   
	 * 修改人：张俊   
	 * 修改时间：2016年2月5日 下午6:06:20
	 *
	 */
	public static List<SortableField_QueryHQL> getFieldAndAnnotation(Object obj,
			String classPath) throws Exception {
		List<SortableField_QueryHQL> list = new ArrayList<SortableField_QueryHQL>();
		Class<?> beanclass = generateBeanClass(obj, classPath);
		if (null != beanclass) {
			// 获取类中的所有属性
			Field[] fields = beanclass.getDeclaredFields();
			// 实例化接口
			FieldMeta_QueryHQL meta;
			// 实例化类
			SortableField_QueryHQL sf;
			// 属性的名
			String propName = "";
			if (fields.length > 0) {
				for (Field f : fields) {
					// 获取字段中包含fieldMeta的注解
					meta = f.getAnnotation(FieldMeta_QueryHQL.class);
					propName = f.getName();
					if (meta != null && !meta.subsidiary()) {
						sf = new SortableField_QueryHQL(meta, propName);
						list.add(sf);
					}
				}
			}
			// 运用Comparator接口，来重写compare方法实现排序
			Collections.sort(list, new Comparator<SortableField_QueryHQL>() {
				@Override
				public int compare(SortableField_QueryHQL s1,
						SortableField_QueryHQL s2) {
					return s1.getMeta().order() - s2.getMeta().order();
				}
			});
		}
		return list;
	}
}
