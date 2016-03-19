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
 * SysTdxJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_TDX_JCXXB", schema = "SCOTT")
public class SysTdxJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysTdxJcbh;
	private Blxxb blxxb;
	private Timestamp sysTdxJcsj;
	private BigDecimal sysTdxKfxt;
	private BigDecimal sysTdxCh2hxt;
	private BigDecimal sysTdxGta;
	private BigDecimal sysTdxThxhdb;

	// Constructors

	/** default constructor */
	public SysTdxJcxxb() {
	}

	/** full constructor */
	public SysTdxJcxxb(Blxxb blxxb, Timestamp sysTdxJcsj,
			BigDecimal sysTdxKfxt, BigDecimal sysTdxCh2hxt,
			BigDecimal sysTdxGta, BigDecimal sysTdxThxhdb) {
		this.blxxb = blxxb;
		this.sysTdxJcsj = sysTdxJcsj;
		this.sysTdxKfxt = sysTdxKfxt;
		this.sysTdxCh2hxt = sysTdxCh2hxt;
		this.sysTdxGta = sysTdxGta;
		this.sysTdxThxhdb = sysTdxThxhdb;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_TDX_JCBH", unique = true, nullable = false, length = 31)
	public String getSysTdxJcbh() {
		return this.sysTdxJcbh;
	}

	public void setSysTdxJcbh(String sysTdxJcbh) {
		this.sysTdxJcbh = sysTdxJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_TDX_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_TDX_JCSJ", length = 7)
	public Timestamp getSysTdxJcsj() {
		return this.sysTdxJcsj;
	}

	public void setSysTdxJcsj(Timestamp sysTdxJcsj) {
		this.sysTdxJcsj = sysTdxJcsj;
	}

	@Column(name = "SYS_TDX_KFXT", precision = 22, scale = 0)
	public BigDecimal getSysTdxKfxt() {
		return this.sysTdxKfxt;
	}

	public void setSysTdxKfxt(BigDecimal sysTdxKfxt) {
		this.sysTdxKfxt = sysTdxKfxt;
	}

	@Column(name = "SYS_TDX_CH2HXT", precision = 22, scale = 0)
	public BigDecimal getSysTdxCh2hxt() {
		return this.sysTdxCh2hxt;
	}

	public void setSysTdxCh2hxt(BigDecimal sysTdxCh2hxt) {
		this.sysTdxCh2hxt = sysTdxCh2hxt;
	}

	@Column(name = "SYS_TDX_GTA", precision = 22, scale = 0)
	public BigDecimal getSysTdxGta() {
		return this.sysTdxGta;
	}

	public void setSysTdxGta(BigDecimal sysTdxGta) {
		this.sysTdxGta = sysTdxGta;
	}

	@Column(name = "SYS_TDX_THXHDB", precision = 22, scale = 0)
	public BigDecimal getSysTdxThxhdb() {
		return this.sysTdxThxhdb;
	}

	public void setSysTdxThxhdb(BigDecimal sysTdxThxhdb) {
		this.sysTdxThxhdb = sysTdxThxhdb;
	}

}