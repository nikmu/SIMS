package org.bme.basic.model;

import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：ShfxxbModel   
 * 类描述：自定义Model：省份信息表
 * 创建人：张俊   
 * 创建时间：2016年3月8日 下午3:20:28   
 * 修改人：张俊   
 * 修改时间：2016年3月8日 下午3:20:28   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class ShfxxbModel {
	@FieldMeta_QueryHQL(description = "省份编号", order = 1, alias="sfbh")
	private String id;
	@FieldMeta_QueryHQL(description = "省份名称", order = 2, alias="sfmc")
	private String name;
	@FieldMeta_QueryHQL(description = "省份备注", order = 3, alias="sfbz")
	private String bz;
 
	/** 构造方法：无参
	 * 
	 */
	public ShfxxbModel() {

	}

	/** 构造方法：有参
	 * 
	 * @param id
	 *            省份编号
	 * @param name
	 *            省份名称
	 * @param bz
	 *            省份备注
	 */
	public ShfxxbModel(String id, String name, String bz) {
		super();
		this.id = id;
		this.name = name;
		this.bz = bz;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}
	
}