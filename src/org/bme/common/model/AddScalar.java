package org.bme.common.model;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.BooleanType;
import org.hibernate.type.CharacterType;
import org.hibernate.type.DoubleType;
import org.hibernate.type.FloatType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.ShortType;
import org.hibernate.type.StringType;
import org.hibernate.type.TimestampType;

/**
 * 
 * 项目名称：TEMS（教学评价管理系统）   
 * 类名称：AddScalar   
 * 类描述：
 * 创建人：张俊   
 * 创建时间：2016年2月5日 下午3:57:45   
 * 修改人：张俊   
 * 修改时间：2016年2月5日 下午3:57:45   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class AddScalar {
	/**
	 * 将field type 和 Hibernate的类型进行了对应。这里其实不是多余的，如果不进行一定的对应可能会有问题。 问题有两个： 1.
	 * 在oracle中我们可能把一些字段设为NUMBER(%)，而在Bean中的字段定的是long。那么查询时可能会报：
	 * java.math.BeigDecimal不能转换成long等错误 2.
	 * 如果不这样写的话，可能Bean中的field就得是大写的，如：name就得写成NAME,userCount就得写成USERCOUNT
	 * 
	 * @param <T>
	 * @param sqlQuery
	 *            SQLQuery
	 * @param clazz
	 *            T.class
	 * @param fieldList
	 *            要查询的成员变量名称
	 */
	public static <T> void addSclar(SQLQuery sqlQuery, Class<T> clazz,
			List<String> fieldList) {
		if (clazz == null) {
			throw new NullPointerException("[clazz] could not be null!");
		}

		if ((fieldList != null) && (fieldList.size() > 0)) {
			Field[] fields = clazz.getDeclaredFields();
			for (String fieldName : fieldList) {
				for (Field field : fields) {
					if (fieldName.equals(field.getName())) {
						if ((field.getType() == BigDecimal.class)) {
							sqlQuery.addScalar(field.getName(),
									 BigDecimalType.INSTANCE);
						}else if ((field.getType() == long.class)
								|| (field.getType() == Long.class)) {
							sqlQuery.addScalar(field.getName(),
									LongType.INSTANCE);
						} else if ((field.getType() == int.class)
								|| (field.getType() == Integer.class)) {
							sqlQuery.addScalar(field.getName(),
									 IntegerType.INSTANCE);
						} else if ((field.getType() == char.class)
								|| (field.getType() == Character.class)) {
							sqlQuery.addScalar(field.getName(),
									CharacterType.INSTANCE);
						} else if ((field.getType() == short.class)
								|| (field.getType() == Short.class)) {
							sqlQuery.addScalar(field.getName(),
									 ShortType.INSTANCE);
						} else if ((field.getType() == double.class)
								|| (field.getType() == Double.class)) {
							sqlQuery.addScalar(field.getName(),
									 DoubleType.INSTANCE);
						} else if ((field.getType() == float.class)
								|| (field.getType() == Float.class)) {
							sqlQuery.addScalar(field.getName(),
									FloatType.INSTANCE);
						} else if ((field.getType() == boolean.class)
								|| (field.getType() == Boolean.class)) {
							sqlQuery.addScalar(field.getName(),
									 BooleanType.INSTANCE);
						} else if (field.getType() == String.class) {
							sqlQuery.addScalar(field.getName(),
									StringType.INSTANCE);
						} else if (field.getType() == Date.class) {
							sqlQuery.addScalar(field.getName(),
									TimestampType.INSTANCE);
						}
					}
				}
			}
		}
	}
}
