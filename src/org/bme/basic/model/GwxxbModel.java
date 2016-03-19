package org.bme.basic.model;

import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：GwxxbModel   
 * 类描述：岗位信息表自定义model，用于查询
 * 创建人：朱俊杰   
 * 创建时间：Mar 14, 2016 11:10:54 AM   
 * 修改人：朱俊杰   
 * 修改时间：Mar 14, 2016 11:10:54 AM   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class GwxxbModel {

	@FieldMeta_QueryHQL(description = "岗位编号", order = 1)
	private String gwbh;
	@FieldMeta_QueryHQL(description = "岗位名称", order = 2)
	private String gwmc;
	@FieldMeta_QueryHQL(description = "岗位职责", order = 3)
	private String gwzz;
	
	public GwxxbModel(){
		super();
	}
	public GwxxbModel(String gwbh, String gwmc, String gwzz) {
		super();
		this.gwbh = gwbh;
		this.gwmc = gwmc;
		this.gwzz = gwzz;
	}
	public String getGwbh() {
		return gwbh;
	}
	public void setGwbh(String gwbh) {
		this.gwbh = gwbh;
	}
	public String getGwmc() {
		return gwmc;
	}
	public void setGwmc(String gwmc) {
		this.gwmc = gwmc;
	}
	public String getGwzz() {
		return gwzz;
	}
	public void setGwzz(String gwzz) {
		this.gwzz = gwzz;
	}
	
}
