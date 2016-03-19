package org.bme.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Xfxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "XFXXB", schema = "C##SIMSDBA")
public class Xfxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String xfbh;
	private Dqxxb dqxxb;
	private String xfmc;
	private String xfbz;

	// Constructors

	/** default constructor */
	public Xfxxb() {
	}

	/** full constructor */
	public Xfxxb(Dqxxb dqxxb, String xfmc, String xfbz) {
		this.dqxxb = dqxxb;
		this.xfmc = xfmc;
		this.xfbz = xfbz;
	}

	// Property accessors
	@Id
	//@GeneratedValue
	@Column(name = "XFBH", unique = true, nullable = false, length = 11)
	public String getXfbh() {
		return this.xfbh;
	}

	public void setXfbh(String xfbh) {
		this.xfbh = xfbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SSDQBH")
	public Dqxxb getDqxxb() {
		return this.dqxxb;
	}

	public void setDqxxb(Dqxxb dqxxb) {
		this.dqxxb = dqxxb;
	}

	@Column(name = "XFMC", length = 20)
	public String getXfmc() {
		return this.xfmc;
	}

	public void setXfmc(String xfmc) {
		this.xfmc = xfmc;
	}

	@Column(name = "XFBZ", length = 50)
	public String getXfbz() {
		return this.xfbz;
	}

	public void setXfbz(String xfbz) {
		this.xfbz = xfbz;
	}

}