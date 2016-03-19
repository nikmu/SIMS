package org.bme.common.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Shfxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SHFXXB", schema = "C##SIMSDBA")
public class Shfxxb implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sfbh;
	private String sfmc;
	private String sfbz;
	private Set<Dqxxb> dqxxbs = new HashSet<Dqxxb>(0);

	// Constructors

	/** default constructor */
	public Shfxxb() {
	}

	/** full constructor */
	public Shfxxb(String sfmc, String sfbz, Set<Dqxxb> dqxxbs) {
		this.sfmc = sfmc;
		this.sfbz = sfbz;
		this.dqxxbs = dqxxbs;
	}

	// Property accessors
	@Id
	//@GeneratedValue 省份编号是国家规定的
	@Column(name = "SFBH", unique = true, nullable = false, length = 11)
	public String getSfbh() {
		return this.sfbh;
	}

	public void setSfbh(String sfbh) {
		this.sfbh = sfbh;
	}

	@Column(name = "SFMC", length = 20)
	public String getSfmc() {
		return this.sfmc;
	}

	public void setSfmc(String sfmc) {
		this.sfmc = sfmc;
	}

	@Column(name = "SFBZ", length = 50)
	public String getSfbz() {
		return this.sfbz;
	}

	public void setSfbz(String sfbz) {
		this.sfbz = sfbz;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "shfxxb")
	public Set<Dqxxb> getDqxxbs() {
		return this.dqxxbs;
	}

	public void setDqxxbs(Set<Dqxxb> dqxxbs) {
		this.dqxxbs = dqxxbs;
	}

}