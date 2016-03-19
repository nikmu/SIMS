package org.bme.common.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Bldcjlb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "BLDCJLB", schema = "C##SIMSDBA")
public class Bldcjlb implements java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String dcbh;
	private Yhxxb yhxxb;
	private Timestamp sqsj;
	private String sfydc;
	private Timestamp dcsj;
	private String dctj;
	private BigDecimal dcjls;
	private String dcyzm;
	private Set<Dczdxxb> dczdxxbs = new HashSet<Dczdxxb>(0);

	// Constructors

	/** default constructor */
	public Bldcjlb() {
	}

	/** full constructor */
	public Bldcjlb(Yhxxb yhxxb, Timestamp sqsj, String sfydc, Timestamp dcsj,
			String dctj, BigDecimal dcjls, String dcyzm, Set<Dczdxxb> dczdxxbs) {
		this.yhxxb = yhxxb;
		this.sqsj = sqsj;
		this.sfydc = sfydc;
		this.dcsj = dcsj;
		this.dctj = dctj;
		this.dcjls = dcjls;
		this.dcyzm = dcyzm;
		this.dczdxxbs = dczdxxbs;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "DCBH", unique = true, nullable = false, length = 21)
	public String getDcbh() {
		return this.dcbh;
	}

	public void setDcbh(String dcbh) {
		this.dcbh = dcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DCRBH")
	public Yhxxb getYhxxb() {
		return this.yhxxb;
	}

	public void setYhxxb(Yhxxb yhxxb) {
		this.yhxxb = yhxxb;
	}

	@Column(name = "SQSJ", length = 7)
	public Timestamp getSqsj() {
		return this.sqsj;
	}

	public void setSqsj(Timestamp sqsj) {
		this.sqsj = sqsj;
	}

	@Column(name = "SFYDC", length = 2)
	public String getSfydc() {
		return this.sfydc;
	}

	public void setSfydc(String sfydc) {
		this.sfydc = sfydc;
	}

	@Column(name = "DCSJ", length = 7)
	public Timestamp getDcsj() {
		return this.dcsj;
	}

	public void setDcsj(Timestamp dcsj) {
		this.dcsj = dcsj;
	}

	@Column(name = "DCTJ", length = 500)
	public String getDctj() {
		return this.dctj;
	}

	public void setDctj(String dctj) {
		this.dctj = dctj;
	}

	@Column(name = "DCJLS", precision = 22, scale = 0)
	public BigDecimal getDcjls() {
		return this.dcjls;
	}

	public void setDcjls(BigDecimal dcjls) {
		this.dcjls = dcjls;
	}

	@Column(name = "DCYZM", length = 20)
	public String getDcyzm() {
		return this.dcyzm;
	}

	public void setDcyzm(String dcyzm) {
		this.dcyzm = dcyzm;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bldcjlbs")
	public Set<Dczdxxb> getDczdxxbs() {
		return this.dczdxxbs;
	}

	public void setDczdxxbs(Set<Dczdxxb> dczdxxbs) {
		this.dczdxxbs = dczdxxbs;
	}

}