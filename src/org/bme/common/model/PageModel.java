package org.bme.common.model;

import java.util.List;

/**
 * 分页对象Model
 * 
 * @author 曦予
 * 
 * @param <T>
 */
public class PageModel<T> {
	/** 分页的大小
	 * 
	 */
	private int limit;
	/** 分页的起始页
	 * 
	 */
	private int offset;
	/** 总记录数
	 * 
	 */
	private long total;
	/** 分页的数据
	 * 
	 */
	private List<T> datas;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	@Override
	public String toString() {
		return "PageModel [limit=" + limit + ", offset=" + offset + ", total="
				+ total + ", datas=" + datas + "]";
	}
	
}
