package org.bme.common.utils.hql;

import java.math.BigDecimal;

import org.bme.common.utils.DateUtil;
import org.bme.common.utils.constants.JavaType;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：FieldType   
 * 类描述：字段类型处理类
 * 创建人：张俊   
 * 创建时间：2016年3月8日 下午3:31:24   
 * 修改人：张俊   
 * 修改时间：2016年3月8日 下午3:31:24   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class FieldType {
	/**
	 * 判断值的类型并将值转换为指定类型
	 * 
	 * @param type
	 * @param value
	 * @return
	 */
	public static Object typeChange(String type, String value) throws Exception {
		Object obj = new Object();
		switch (type) {
		case JavaType.SHORT:
			obj = Short.valueOf(value);
			break;
		case JavaType.UTIL_DATE:
			if (value.indexOf("-") >= 0 && value.indexOf(":") >= 0) {
				// 将value转换为日期时间格式（即：yyyy-MM-dd HH:mm:ss）
				obj = DateUtil.formatDateTime(value);
			} else if(value.indexOf("-") >= 0){
				// 将value转换为日期时间格式（即：yyyy-MM-dd）
				obj = DateUtil.formatDate(value);
			}else {
				// 将String型的毫秒数value转换为指定日期格式
				obj = DateUtil.timeToDateTime(value,
						DateUtil.DEFAULT_DATETIME_FORMAT);
			}
			break;
		case JavaType.TIMESTAMP:
			if (value.indexOf("-") >= 0) {
				obj = DateUtil.formatDateTime(value);
			} else {
				obj = DateUtil.timeToDateTime(value,
						DateUtil.DEFAULT_DATETIME_FORMAT);
			}
			break;
		case JavaType.STRING:
			if (value.equals("true")) {
				value = "1";
			} else if (value.equals("false")) {
				value = "0";
			}
			obj = value;
			break;
		case JavaType.BIGDECIMAL:
			obj = new BigDecimal(value);
			break;
		case JavaType.CHAR:
			obj = value.toCharArray()[0];
			break;
		case JavaType.DOUBLE:
			obj = Double.parseDouble(value);
			break;
		case JavaType.LONG:
			obj = Long.parseLong(value);
			break;
		default:
			System.out.println("在org.bme.mdms.common.hql.FieldType类中有新的类型出现，需要添加：" + type);
			obj = null;
			break;
		}
		return obj;
	}
}
