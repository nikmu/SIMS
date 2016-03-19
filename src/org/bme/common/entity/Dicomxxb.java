package org.bme.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Dicomxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DICOMXXB", schema = "SCOTT")
public class Dicomxxb implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String wjbh;
	private Blxxb blxxb;
	private String wjlx;
	private String wjsm;
	private String wjlj;

	// Constructors

	/** default constructor */
	public Dicomxxb() {
	}

	/** full constructor */
	public Dicomxxb(Blxxb blxxb, String wjlx, String wjsm, String wjlj) {
		this.blxxb = blxxb;
		this.wjlx = wjlx;
		this.wjsm = wjsm;
		this.wjlj = wjlj;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "WJBH", unique = true, nullable = false, length = 31)
	public String getWjbh() {
		return this.wjbh;
	}

	public void setWjbh(String wjbh) {
		this.wjbh = wjbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DICOM_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "WJLX", length = 20)
	public String getWjlx() {
		return this.wjlx;
	}

	public void setWjlx(String wjlx) {
		this.wjlx = wjlx;
	}

	@Column(name = "WJSM", length = 50)
	public String getWjsm() {
		return this.wjsm;
	}

	public void setWjsm(String wjsm) {
		this.wjsm = wjsm;
	}

	@Column(name = "WJLJ", length = 100)
	public String getWjlj() {
		return this.wjlj;
	}

	public void setWjlj(String wjlj) {
		this.wjlj = wjlj;
	}

}