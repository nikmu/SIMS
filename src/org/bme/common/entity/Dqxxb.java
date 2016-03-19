package org.bme.common.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Dqxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DQXXB", schema = "C##SIMSDBA")
public class Dqxxb implements java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String dqbh;
	private Shfxxb shfxxb;
	private String dqmc;
	private String dqbz;
	private Set<Xfxxb> xfxxbs = new HashSet<Xfxxb>(0);

	// Constructors

	/** default constructor */
	public Dqxxb() {
	}

	/** full constructor */
	public Dqxxb(Shfxxb shfxxb, String dqmc, String dqbz, Set<Xfxxb> xfxxbs) {
		this.shfxxb = shfxxb;
		this.dqmc = dqmc;
		this.dqbz = dqbz;
		this.xfxxbs = xfxxbs;
	}

	// Property accessors
	@Id
	//@GeneratedValue
	@Column(name = "DQBH", unique = true, nullable = false, length = 11)
	public String getDqbh() {
		return this.dqbh;
	}

	public void setDqbh(String dqbh) {
		this.dqbh = dqbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SSSFBH")
	public Shfxxb getShfxxb() {
		return this.shfxxb;
	}

	public void setShfxxb(Shfxxb shfxxb) {
		this.shfxxb = shfxxb;
	}
	
	@Column(name = "DQMC", length = 20)
	public String getDqmc() {
		return this.dqmc;
	}

	public void setDqmc(String dqmc) {
		this.dqmc = dqmc;
	}

	@Column(name = "DQBZ", length = 50)
	public String getDqbz() {
		return this.dqbz;
	}

	public void setDqbz(String dqbz) {
		this.dqbz = dqbz;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dqxxb")
	public Set<Xfxxb> getXfxxbs() {
		return this.xfxxbs;
	}

	public void setXfxxbs(Set<Xfxxb> xfxxbs) {
		this.xfxxbs = xfxxbs;
	}

}