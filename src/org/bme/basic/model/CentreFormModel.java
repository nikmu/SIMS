package org.bme.basic.model;

import org.bme.system.model.YhxxbModel;

/**   
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：FormModal   
 * 类描述：表单的model，结合用户信息表和中心信息表
 * 创建人：朱俊杰   
 * 创建时间：Mar 13, 2016 10:00:38 AM   
 * 修改人：朱俊杰   
 * 修改时间：Mar 13, 2016 10:00:38 AM   
 * 修改备注：   
 * @version 1.0  
 *    
 */
public class CentreFormModel {
	
	private ZxxxbModel zxxxbModel;
	private YhxxbModel yhxxbModel;
	
	public CentreFormModel(){
		super();
	}
	public CentreFormModel(ZxxxbModel zxxxbModel, YhxxbModel yhxxbModel){
		this.zxxxbModel = zxxxbModel;
		this.yhxxbModel = yhxxbModel;
	}
	
	public ZxxxbModel getZxxxbModel() {
		return zxxxbModel;
	}
	public void setZxxxbModel(ZxxxbModel zxxxbModel) {
		this.zxxxbModel = zxxxbModel;
	}
	public YhxxbModel getYhxxbModel() {
		return yhxxbModel;
	}
	public void setYhxxbModel(YhxxbModel yhxxbModel) {
		this.yhxxbModel = yhxxbModel;
	}
	
	

}
