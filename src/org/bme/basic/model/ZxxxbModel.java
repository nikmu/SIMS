package org.bme.basic.model;

import java.math.BigDecimal;

import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统） 类名称：ZxxxbModel 类描述：中心信息表自定义Model，主要用于与前台进行数据交互。 创建人：张俊
 * 创建时间：2016年3月10日 下午8:43:41 修改人：张俊 修改时间：2016年3月10日 下午8:43:41 修改备注：
 * 
 * @version 1.0
 * 
 */
public class ZxxxbModel {

	@FieldMeta_QueryHQL(description = "中心编号", order = 1)
	private String zxbh;
	@FieldMeta_QueryHQL(description = "中心名称", order = 2)
	private String zxmc;
	@FieldMeta_QueryHQL(description = "中心级别", order = 3)
	private BigDecimal zxjb;
	@FieldMeta_QueryHQL(description = "上级中心", order = 4)
	private String sjzxbh;
	@FieldMeta_QueryHQL(description = "备注", order = 5)
	private String bz;
	//存储上级中心名称用于显示
	private String sjzxmc;

	public ZxxxbModel() {
		super();
	}

	public ZxxxbModel(String zxbh, String zxmc, BigDecimal zxjb, String sjzxbh,
			String bz) {
		super();
		this.zxbh = zxbh;
		this.zxmc = zxmc;
		this.zxjb = zxjb;
		this.sjzxbh = sjzxbh;
		this.bz = bz;
	}

	public String getZxbh() {
		return zxbh;
	}

	public void setZxbh(String zxbh) {
		this.zxbh = zxbh;
	}

	public String getZxmc() {
		return zxmc;
	}

	public void setZxmc(String zxmc) {
		this.zxmc = zxmc;
	}

	public BigDecimal getZxjb() {
		return zxjb;
	}

	public void setZxjb(BigDecimal zxjb) {
		this.zxjb = zxjb;
	}

	public String getSjzxbh() {
		return sjzxbh;
	}

	public void setSjzxbh(String sjzxbh) {
		this.sjzxbh = sjzxbh;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSjzxmc() {
		return sjzxmc;
	}

	public void setSjzxmc(String sjzxmc) {
		this.sjzxmc = sjzxmc;
	}

	
}
