package org.bme.common.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Dczdxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DCZDXXB", schema = "SCOTT")
public class Dczdxxb implements java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String zdbh;
	private String ssbf;
	private String zdmc;
	private Set<Bldcjlb> bldcjlbs = new HashSet<Bldcjlb>(0);

	// Constructors

	/** default constructor */
	public Dczdxxb() {
	}

	/** full constructor */
	public Dczdxxb(String ssbf, String zdmc, Set<Bldcjlb> bldcjlbs) {
		this.ssbf = ssbf;
		this.zdmc = zdmc;
		this.bldcjlbs = bldcjlbs;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "ZDBH", unique = true, nullable = false, length = 5)
	public String getZdbh() {
		return this.zdbh;
	}

	public void setZdbh(String zdbh) {
		this.zdbh = zdbh;
	}

	@Column(name = "SSBF", length = 30)
	public String getSsbf() {
		return this.ssbf;
	}

	public void setSsbf(String ssbf) {
		this.ssbf = ssbf;
	}

	@Column(name = "ZDMC", length = 30)
	public String getZdmc() {
		return this.zdmc;
	}

	public void setZdmc(String zdmc) {
		this.zdmc = zdmc;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "BLDCSZB", schema = "SCOTT", joinColumns = { @JoinColumn(name = "ZDBH", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "DCBH", nullable = false, updatable = false) })
	public Set<Bldcjlb> getBldcjlbs() {
		return this.bldcjlbs;
	}

	public void setBldcjlbs(Set<Bldcjlb> bldcjlbs) {
		this.bldcjlbs = bldcjlbs;
	}

}