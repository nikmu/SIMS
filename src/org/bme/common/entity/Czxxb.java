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
 * Czxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CZXXB", schema = "SCOTT")
public class Czxxb implements java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String czbh;
	private Zmkxxb zmkxxb;
	private String czmc;
	private Set<Gwqxxxb> gwqxxxbs = new HashSet<Gwqxxxb>(0);

	// Constructors

	/** default constructor */
	public Czxxb() {
	}

	/** full constructor */
	public Czxxb(Zmkxxb zmkxxb, String czmc, Set<Gwqxxxb> gwqxxxbs) {
		this.zmkxxb = zmkxxb;
		this.czmc = czmc;
		this.gwqxxxbs = gwqxxxbs;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "CZBH", unique = true, nullable = false, length = 7)
	public String getCzbh() {
		return this.czbh;
	}

	public void setCzbh(String czbh) {
		this.czbh = czbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SSZMKBH")
	public Zmkxxb getZmkxxb() {
		return this.zmkxxb;
	}

	public void setZmkxxb(Zmkxxb zmkxxb) {
		this.zmkxxb = zmkxxb;
	}

	@Column(name = "CZMC", length = 20)
	public String getCzmc() {
		return this.czmc;
	}

	public void setCzmc(String czmc) {
		this.czmc = czmc;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "czxxb")
	public Set<Gwqxxxb> getGwqxxxbs() {
		return this.gwqxxxbs;
	}

	public void setGwqxxxbs(Set<Gwqxxxb> gwqxxxbs) {
		this.gwqxxxbs = gwqxxxbs;
	}

}