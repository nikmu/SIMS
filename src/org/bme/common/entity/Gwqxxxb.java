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
 * Gwqxxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GWQXXXB", schema = "SCOTT")
public class Gwqxxxb implements java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String gwqxbh;
	private Gwxxb gwxxb;
	private Czxxb czxxb;
	private String zmkbh;

	// Constructors

	/** default constructor */
	public Gwqxxxb() {
	}

	/** full constructor */
	public Gwqxxxb(Gwxxb gwxxb, Czxxb czxxb, String zmkbh) {
		this.gwxxb = gwxxb;
		this.czxxb = czxxb;
		this.zmkbh = zmkbh;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "GWQXBH", unique = true, nullable = false, length = 10)
	public String getGwqxbh() {
		return this.gwqxbh;
	}

	public void setGwqxbh(String gwqxbh) {
		this.gwqxbh = gwqxbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GWBH")
	public Gwxxb getGwxxb() {
		return this.gwxxb;
	}

	public void setGwxxb(Gwxxb gwxxb) {
		this.gwxxb = gwxxb;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CZBH")
	public Czxxb getCzxxb() {
		return this.czxxb;
	}

	public void setCzxxb(Czxxb czxxb) {
		this.czxxb = czxxb;
	}

	@Column(name = "ZMKBH", length = 5)
	public String getZmkbh() {
		return this.zmkbh;
	}

	public void setZmkbh(String zmkbh) {
		this.zmkbh = zmkbh;
	}

}