package org.bme.common.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Mkxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MKXXB", schema = "SCOTT")
public class Mkxxb implements java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String mkbh;
	private String mkmc;
	private Set<Zmkxxb> zmkxxbs = new HashSet<Zmkxxb>(0);

	// Constructors

	/** default constructor */
	public Mkxxb() {
	}

	/** full constructor */
	public Mkxxb(String mkmc, Set<Zmkxxb> zmkxxbs) {
		this.mkmc = mkmc;
		this.zmkxxbs = zmkxxbs;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "MKBH", unique = true, nullable = false, length = 3)
	public String getMkbh() {
		return this.mkbh;
	}

	public void setMkbh(String mkbh) {
		this.mkbh = mkbh;
	}

	@Column(name = "MKMC", length = 20)
	public String getMkmc() {
		return this.mkmc;
	}

	public void setMkmc(String mkmc) {
		this.mkmc = mkmc;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mkxxb")
	public Set<Zmkxxb> getZmkxxbs() {
		return this.zmkxxbs;
	}

	public void setZmkxxbs(Set<Zmkxxb> zmkxxbs) {
		this.zmkxxbs = zmkxxbs;
	}

}