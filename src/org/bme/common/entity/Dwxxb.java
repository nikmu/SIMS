package org.bme.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Dwxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DWXXB", schema = "C##SIMSDBA")
public class Dwxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String dwbh;
	private Zxxxb zxxxb;
	private String dwmc;
	private String dwmcpym;
	private String dwdj;
	private String dwxz;
	private String sssf;
	private String ssdq;
	private String dwdz;
	private String bz;

	// Constructors

	/** default constructor */
	public Dwxxb() {
	}

	/** full constructor */
	public Dwxxb(Zxxxb zxxxb, String dwmc, String dwmcpym, String dwdj,
			String dwxz, String sssf, String ssdq, String dwdz, String bz) {
		this.zxxxb = zxxxb;
		this.dwmc = dwmc;
		this.dwmcpym = dwmcpym;
		this.dwdj = dwdj;
		this.dwxz = dwxz;
		this.sssf = sssf;
		this.ssdq = ssdq;
		this.dwdz = dwdz;
		this.bz = bz;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "org.bme.common.utils.GeneratePK", parameters = {
			   @Parameter(name = "classname", value = "Dwxxb"),
			   @Parameter(name = "pk", value = "dwbh"),
			   @Parameter(name = "sign", value = "D"),
			   @Parameter(name = "idLength", value = "21") })
	@GeneratedValue(generator = "generator")
	@Id
	@Column(name = "DWBH", unique = true, nullable = false, length = 21)
	public String getDwbh() {
		return this.dwbh;
	}

	public void setDwbh(String dwbh) {
		this.dwbh = dwbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SSZXBH")
	public Zxxxb getZxxxb() {
		return this.zxxxb;
	}

	public void setZxxxb(Zxxxb zxxxb) {
		this.zxxxb = zxxxb;
	}

	@Column(name = "DWMC", length = 50)
	public String getDwmc() {
		return this.dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	@Column(name = "DWMCPYM", length = 50)
	public String getDwmcpym() {
		return this.dwmcpym;
	}

	public void setDwmcpym(String dwmcpym) {
		this.dwmcpym = dwmcpym;
	}

	@Column(name = "DWDJ", length = 20)
	public String getDwdj() {
		return this.dwdj;
	}

	public void setDwdj(String dwdj) {
		this.dwdj = dwdj;
	}

	@Column(name = "DWXZ", length = 20)
	public String getDwxz() {
		return this.dwxz;
	}

	public void setDwxz(String dwxz) {
		this.dwxz = dwxz;
	}

	@Column(name = "SSSF", length = 20)
	public String getSssf() {
		return this.sssf;
	}

	public void setSssf(String sssf) {
		this.sssf = sssf;
	}

	@Column(name = "SSDQ", length = 20)
	public String getSsdq() {
		return this.ssdq;
	}

	public void setSsdq(String ssdq) {
		this.ssdq = ssdq;
	}

	@Column(name = "DWDZ", length = 50)
	public String getDwdz() {
		return this.dwdz;
	}

	public void setDwdz(String dwdz) {
		this.dwdz = dwdz;
	}

	@Column(name = "BZ", length = 50)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}