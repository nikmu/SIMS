package org.bme.system.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：YhxxbModel   
 * 类描述：
 * 创建人：张俊   
 * 创建时间：2016年3月10日 下午8:16:44   
 * 修改人：张俊   
 * 修改时间：2016年3月10日 下午8:16:44   
 * 修改备注：   
 * @version 1.0  
 *
 */
public class YhxxbModel {
	@FieldMeta_QueryHQL(description = "用户编号", order = 1)
	private String yhbh;
	@FieldMeta_QueryHQL(description = "所属机构类别", order = 2)
	private BigDecimal ssjglb;
	@FieldMeta_QueryHQL(description = "所属机构编号", order = 3)
	private String ssjgbh;
	@FieldMeta_QueryHQL(description = "密码", order = 4)
	private String mm;
	@FieldMeta_QueryHQL(description = "姓名", order = 5)
	private String xm;
	@FieldMeta_QueryHQL(description = "性别", order = 6)
	private String xb;
	@FieldMeta_QueryHQL(description = "出生日期", order = 7)
	private Timestamp csrq;
	@FieldMeta_QueryHQL(description = "电话号码", order = 8)
	private String dhhm;
	@FieldMeta_QueryHQL(description = "email", order = 9)
	private String email;
	@FieldMeta_QueryHQL(description = "QQ号码", order = 10)
	private String qq;
	@FieldMeta_QueryHQL(description = "备注", order = 11)
	private String bz;

	public String getYhbh() {
		return yhbh;
	}

	public void setYhbh(String yhbh) {
		this.yhbh = yhbh;
	}

	public BigDecimal getSsjglb() {
		return ssjglb;
	}

	public void setSsjglb(BigDecimal ssjglb) {
		this.ssjglb = ssjglb;
	}

	public String getSsjgbh() {
		return ssjgbh;
	}

	public void setSsjgbh(String ssjgbh) {
		this.ssjgbh = ssjgbh;
	}

	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public Timestamp getCsrq() {
		return csrq;
	}

	public void setCsrq(Timestamp csrq) {
		this.csrq = csrq;
	}

	public String getDhhm() {
		return dhhm;
	}

	public void setDhhm(String dhhm) {
		this.dhhm = dhhm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}
