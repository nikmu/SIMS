package org.bme.common.utils.hql;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：HQLConnSign   
 * 类描述：HQL连接符
 * 创建人：张俊   
 * 创建时间：2016年3月8日 下午3:31:09   
 * 修改人：张俊   
 * 修改时间：2016年3月8日 下午3:31:09   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class HQLConnSign {

	/** HQL语句字段之间的连接字符——where
	 * 
	 */
	public static final String STR_HQL_CONN_WHERE = " where ";

	/** HQL语句字段之间的连接字符——and
	 * 
	 */
	public static final String STR_HQL_CONN_AND = " and ";

	/** HQL语句字段之间的连接字符——or
	 * 
	 */
	public static final String STR_HQL_CONN_OR = " or ";

	/** HQL语句字段之间的连接字符——“=”
	 * 
	 */
	public static final String STR_HQL_CONN_EQUAL = " = ";

	/** HQL语句字段之间的连接字符——like
	 * 
	 */
	public static final String STR_HQL_CONN_LIKE = " like ";

	/** HQL语句字段之间的连接字符——between
	 * 
	 */
	public static final String STR_HQL_CONN_BETWEEN = " between ";

	/** HQL语句字段之间的字符——“desc”
	 * 
	 */
	public static final String STR_HQL_CONN_DESC = "desc";

	/** HQL语句字段之间的字符——“asc”
	 * 
	 */
	public static final String STR_HQL_CONN_ASC = "asc";

	/** HQL语句字段之间的字符——“from”
	 * 
	 */
	public static final String STR_HQL_CONN_FROM = " from ";
	
	/**
	 * 
	 * 日期段查询（之间）
	 * 
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            截止时间
	 * @return
	 */
	public static String betweenDate(String startTime, String endTime) {
		return STR_HQL_CONN_BETWEEN + "TO_DATE('" + startTime
				+ "','yyyy-MM-dd')" + STR_HQL_CONN_AND + "to_date('"
				+ endTime + "','yyyy-MM-dd')+1";
	}
	
	/**
	 * 
	 * 日期段查询（大于）
	 * 
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            截止时间
	 * @return
	 */
	public static String greaterThanDate(String fieldName, String startTime) {
		return " to_char(" + fieldName + ",'yyyy-MM-dd') >= '"+startTime+"' ";
	}
	
	/**
	 * 
	 * 日期段查询（小于）
	 * 
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            截止时间
	 * @return
	 */
	public static String lessThanDate(String fieldName, String endTime) {
		return " to_char(" + fieldName + ",'yyyy-MM-dd') <= '"+endTime+"' ";
	}
}
