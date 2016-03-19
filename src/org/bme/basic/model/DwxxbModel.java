package org.bme.basic.model;

import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：DwxxbModel   
 * 类描述：自定义Model：单位信息表
 * 创建人：朱俊杰   
 * 创建时间：Mar 15, 2016 3:13:54 PM   
 * 修改人：朱俊杰   
 * 修改时间：Mar 15, 2016 3:13:54 PM   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class DwxxbModel {

	@FieldMeta_QueryHQL(description = "单位编号", order = 1)
	private String dwbh;
	@FieldMeta_QueryHQL(description = "所属中心名称", order = 2, alias="zxxxb.zxmc")
	private String sszxmc;
	@FieldMeta_QueryHQL(description = "单位名称", order = 3)
	private String dwmc;
	@FieldMeta_QueryHQL(description = "单位名称拼音码", order = 4)
	private String dwmcpym;
	@FieldMeta_QueryHQL(description = "单位等级", order = 5)
	private String dwdj;
	@FieldMeta_QueryHQL(description = "单位性质", order = 6)
	private String dwxz;
	@FieldMeta_QueryHQL(description = "所属省份", order = 7)
	private String sssf;
	@FieldMeta_QueryHQL(description = "所属地区", order = 8)
	private String ssdq;
	@FieldMeta_QueryHQL(description = "单位地址", order = 9)
	private String dwdz;
	@FieldMeta_QueryHQL(description = "备注", order = 10)
	private String bz;
	@FieldMeta_QueryHQL(description = "所属中心编号", order = 11, alias="zxxxb.zxbh")
	private String sszxbh;
	
	public DwxxbModel() {
		super();
	}

	public DwxxbModel(String dwbh, String sszxmc, String dwmc, String dwmcpym, String dwdj, String dwxz, String sssf,
			String ssdq, String dwdz, String bz, String sszxbh) {
		super();
		this.dwbh = dwbh;
		this.sszxmc = sszxmc;
		this.dwmc = dwmc;
		this.dwmcpym = dwmcpym;
		this.dwdj = dwdj;
		this.dwxz = dwxz;
		this.sssf = sssf;
		this.ssdq = ssdq;
		this.dwdz = dwdz;
		this.bz = bz;
		this.sszxbh = sszxbh;
	}

	public String getDwbh() {
		return dwbh;
	}

	public void setDwbh(String dwbh) {
		this.dwbh = dwbh;
	}

	public String getSszxmc() {
		return sszxmc;
	}

	public void setSszxmc(String sszxmc) {
		this.sszxmc = sszxmc;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getDwmcpym() {
		return dwmcpym;
	}

	public void setDwmcpym(String dwmcpym) {
		this.dwmcpym = dwmcpym;
	}

	public String getDwdj() {
		return dwdj;
	}

	public void setDwdj(String dwdj) {
		this.dwdj = dwdj;
	}

	public String getDwxz() {
		return dwxz;
	}

	public void setDwxz(String dwxz) {
		this.dwxz = dwxz;
	}

	public String getSssf() {
		return sssf;
	}

	public void setSssf(String sssf) {
		this.sssf = sssf;
	}

	public String getSsdq() {
		return ssdq;
	}

	public void setSsdq(String ssdq) {
		this.ssdq = ssdq;
	}

	public String getDwdz() {
		return dwdz;
	}

	public void setDwdz(String dwdz) {
		this.dwdz = dwdz;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSszxbh() {
		return sszxbh;
	}

	public void setSszxbh(String sszxbh) {
		this.sszxbh = sszxbh;
	}
}
