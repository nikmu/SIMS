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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Zmkxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ZMKXXB", schema = "SCOTT")
public class Zmkxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String zmkbh;
	private Mkxxb mkxxb;
	private String zmkmc;
	private Set<Czxxb> czxxbs = new HashSet<Czxxb>(0);

	// Constructors

	/** default constructor */
	public Zmkxxb() {
	}

	/** full constructor */
	public Zmkxxb(Mkxxb mkxxb, String zmkmc, Set<Czxxb> czxxbs) {
		this.mkxxb = mkxxb;
		this.zmkmc = zmkmc;
		this.czxxbs = czxxbs;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "ZMKBH", unique = true, nullable = false, length = 5)
	public String getZmkbh() {
		return this.zmkbh;
	}

	public void setZmkbh(String zmkbh) {
		this.zmkbh = zmkbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SSMKBH")
	public Mkxxb getMkxxb() {
		return this.mkxxb;
	}

	public void setMkxxb(Mkxxb mkxxb) {
		this.mkxxb = mkxxb;
	}

	@Column(name = "ZMKMC", length = 20)
	public String getZmkmc() {
		return this.zmkmc;
	}

	public void setZmkmc(String zmkmc) {
		this.zmkmc = zmkmc;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "zmkxxb")
	public Set<Czxxb> getCzxxbs() {
		return this.czxxbs;
	}

	public void setCzxxbs(Set<Czxxb> czxxbs) {
		this.czxxbs = czxxbs;
	}

}