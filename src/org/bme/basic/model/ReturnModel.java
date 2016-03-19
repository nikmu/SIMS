package org.bme.basic.model;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：ReturnModel   
 * 类描述：用于信息创建修改后的返回。例如：中心名称和中心管理员。
 * 创建人：朱俊杰   
 * 创建时间：Mar 13, 2016 10:23:45 AM   
 * 修改人：朱俊杰   
 * 修改时间：Mar 13, 2016 10:23:45 AM   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class ReturnModel {

	private String name;
	private String manager;
	
	public ReturnModel() {
		super();
	}
	public ReturnModel(String name, String manager){
		this.name = name;
		this.manager = manager;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
}
