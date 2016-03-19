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
 * SysGgnJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_GGN_JCXXB", schema = "SCOTT")
public class SysGgnJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysGgnJcbh;
	private Blxxb blxxb;
	private Timestamp sysGgnJcsj;
	private BigDecimal sysGgnAst;
	private BigDecimal sysGgnAlt;
	private BigDecimal sysGgnAlb;
	private BigDecimal sysGgnTbil;
	private BigDecimal sysGgnDbil;
	private BigDecimal sysGgnUbil;

	// Constructors

	/** default constructor */
	public SysGgnJcxxb() {
	}

	/** full constructor */
	public SysGgnJcxxb(Blxxb blxxb, Timestamp sysGgnJcsj, BigDecimal sysGgnAst,
			BigDecimal sysGgnAlt, BigDecimal sysGgnAlb, BigDecimal sysGgnTbil,
			BigDecimal sysGgnDbil, BigDecimal sysGgnUbil) {
		this.blxxb = blxxb;
		this.sysGgnJcsj = sysGgnJcsj;
		this.sysGgnAst = sysGgnAst;
		this.sysGgnAlt = sysGgnAlt;
		this.sysGgnAlb = sysGgnAlb;
		this.sysGgnTbil = sysGgnTbil;
		this.sysGgnDbil = sysGgnDbil;
		this.sysGgnUbil = sysGgnUbil;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_GGN_JCBH", unique = true, nullable = false, length = 31)
	public String getSysGgnJcbh() {
		return this.sysGgnJcbh;
	}

	public void setSysGgnJcbh(String sysGgnJcbh) {
		this.sysGgnJcbh = sysGgnJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_GGN_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_GGN_JCSJ", length = 7)
	public Timestamp getSysGgnJcsj() {
		return this.sysGgnJcsj;
	}

	public void setSysGgnJcsj(Timestamp sysGgnJcsj) {
		this.sysGgnJcsj = sysGgnJcsj;
	}

	@Column(name = "SYS_GGN_AST", precision = 22, scale = 0)
	public BigDecimal getSysGgnAst() {
		return this.sysGgnAst;
	}

	public void setSysGgnAst(BigDecimal sysGgnAst) {
		this.sysGgnAst = sysGgnAst;
	}

	@Column(name = "SYS_GGN_ALT", precision = 22, scale = 0)
	public BigDecimal getSysGgnAlt() {
		return this.sysGgnAlt;
	}

	public void setSysGgnAlt(BigDecimal sysGgnAlt) {
		this.sysGgnAlt = sysGgnAlt;
	}

	@Column(name = "SYS_GGN_ALB", precision = 22, scale = 0)
	public BigDecimal getSysGgnAlb() {
		return this.sysGgnAlb;
	}

	public void setSysGgnAlb(BigDecimal sysGgnAlb) {
		this.sysGgnAlb = sysGgnAlb;
	}

	@Column(name = "SYS_GGN_TBIL", precision = 22, scale = 0)
	public BigDecimal getSysGgnTbil() {
		return this.sysGgnTbil;
	}

	public void setSysGgnTbil(BigDecimal sysGgnTbil) {
		this.sysGgnTbil = sysGgnTbil;
	}

	@Column(name = "SYS_GGN_DBIL", precision = 22, scale = 0)
	public BigDecimal getSysGgnDbil() {
		return this.sysGgnDbil;
	}

	public void setSysGgnDbil(BigDecimal sysGgnDbil) {
		this.sysGgnDbil = sysGgnDbil;
	}

	@Column(name = "SYS_GGN_UBIL", precision = 22, scale = 0)
	public BigDecimal getSysGgnUbil() {
		return this.sysGgnUbil;
	}

	public void setSysGgnUbil(BigDecimal sysGgnUbil) {
		this.sysGgnUbil = sysGgnUbil;
	}

}