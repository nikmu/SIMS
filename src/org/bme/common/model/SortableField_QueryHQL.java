package org.bme.common.model;

import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

/**
 * 
 * 项目名称：TEMS（教学评价管理系统）   
 * 类名称：SortableField_QueryHQL   
 * 类描述：获取到注解的帮助类
 * 创建人：张俊   
 * 创建时间：2016年2月5日 下午5:04:20   
 * 修改人：张俊   
 * 修改时间：2016年2月5日 下午5:04:20   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class SortableField_QueryHQL {

	private FieldMeta_QueryHQL meta;
	/** 类中的属性名
	 * 
	 */
	private String name;

	public SortableField_QueryHQL() {

	}

	public SortableField_QueryHQL(FieldMeta_QueryHQL meta, String name) {
		this.meta = meta;
		this.name = name;
	}

	public FieldMeta_QueryHQL getMeta() {
		return meta;
	}

	public void setMeta(FieldMeta_QueryHQL meta) {
		this.meta = meta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
