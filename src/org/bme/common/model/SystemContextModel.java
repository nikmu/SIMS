package org.bme.common.model;

/** 用来传递表对象的ThreadLocal数据
 * 
 * @author 曦予
 * 
 */
public class SystemContextModel {
	/** 分页大小
	 * 
	 */
	private static ThreadLocal<Integer> limit = new ThreadLocal<Integer>();
	/** 分页的起始页
	 * 
	 */
	private static ThreadLocal<Integer> offset = new ThreadLocal<Integer>();
	/** 分页的排序字段
	 * 
	 */
	private static ThreadLocal<String> sort = new ThreadLocal<String>();
	/** 列表的排序方式
	 * 
	 */
	private static ThreadLocal<String> order = new ThreadLocal<String>();

	public static Integer getLimit() {
		return limit.get();
	}

	public static void setLimit(Integer _limit) {
		limit.set(_limit);
	}

	public static Integer getOffset() {
		return offset.get();
	}

	public static void setOffset(Integer _offset) {
		offset.set(_offset);
	}

	public static String getSort() {
		return sort.get();
	}

	public static void setSort(String _sort) {
		sort.set(_sort);
	}

	public static String getOrder() {
		return order.get();
	}

	public static void setOrder(String _order) {
		order.set(_order);
	}

	public static void removeLimit() {
		limit.remove();
	}

	public static void removeOffset() {
		offset.remove();
	}

	public static void removeSort() {
		sort.remove();
	}

	public static void removeOrder() {
		order.remove();
	}
}
