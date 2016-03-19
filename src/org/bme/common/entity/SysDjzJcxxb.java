package org.bme.common.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SysDjzJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_DJZ_JCXXB", schema = "SCOTT")
public class SysDjzJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysDjzJcbh;
	private Blxxb blxxb;
	private Timestamp sysDjzJcsj;
	private BigDecimal sysDjzN;
	private BigDecimal sysDjzL;
	private BigDecimal sysDjzJ;
	private BigDecimal sysDjzG;
	private BigDecimal sysDjzRs;

	// Constructors

	/** default constructor */
	public SysDjzJcxxb() {
	}

	/** full constructor */
	public SysDjzJcxxb(Blxxb blxxb, Timestamp sysDjzJcsj, BigDecimal sysDjzN,
			BigDecimal sysDjzL, BigDecimal sysDjzJ, BigDecimal sysDjzG,
			BigDecimal sysDjzRs) {
		this.blxxb = blxxb;
		this.sysDjzJcsj = sysDjzJcsj;
		this.sysDjzN = sysDjzN;
		this.sysDjzL = sysDjzL;
		this.sysDjzJ = sysDjzJ;
		this.sysDjzG = sysDjzG;
		this.sysDjzRs = sysDjzRs;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_DJZ_JCBH", unique = true, nullable = false, length = 31)
	public String getSysDjzJcbh() {
		return this.sysDjzJcbh;
	}

	public void setSysDjzJcbh(String sysDjzJcbh) {
		this.sysDjzJcbh = sysDjzJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_DJZ_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_DJZ_JCSJ", length = 7)
	public Timestamp getSysDjzJcsj() {
		return this.sysDjzJcsj;
	}

	public void setSysDjzJcsj(Timestamp sysDjzJcsj) {
		this.sysDjzJcsj = sysDjzJcsj;
	}

	@Column(name = "SYS_DJZ_N", precision = 22, scale = 0)
	public BigDecimal getSysDjzN() {
		return this.sysDjzN;
	}

	public void setSysDjzN(BigDecimal sysDjzN) {
		this.sysDjzN = sysDjzN;
	}

	@Column(name = "SYS_DJZ_L", precision = 22, scale = 0)
	public BigDecimal getSysDjzL() {
		return this.sysDjzL;
	}

	public void setSysDjzL(BigDecimal sysDjzL) {
		this.sysDjzL = sysDjzL;
	}

	@Column(name = "SYS_DJZ_J", precision = 22, scale = 0)
	public BigDecimal getSysDjzJ() {
		return this.sysDjzJ;
	}

	public void setSysDjzJ(BigDecimal sysDjzJ) {
		this.sysDjzJ = sysDjzJ;
	}

	@Column(name = "SYS_DJZ_G", precision = 22, scale = 0)
	public BigDecimal getSysDjzG() {
		return this.sysDjzG;
	}

	public void setSysDjzG(BigDecimal sysDjzG) {
		this.sysDjzG = sysDjzG;
	}

	@Column(name = "SYS_DJZ_RS", precision = 22, scale = 0)
	public BigDecimal getSysDjzRs() {
		return this.sysDjzRs;
	}

	public void setSysDjzRs(BigDecimal sysDjzRs) {
		this.sysDjzRs = sysDjzRs;
	}

}