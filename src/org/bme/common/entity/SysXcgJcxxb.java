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
 * SysXcgJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_XCG_JCXXB", schema = "SCOTT")
public class SysXcgJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysXcgJcbh;
	private Blxxb blxxb;
	private Timestamp sysXcgJcsj;
	private BigDecimal sysXcgWbc;
	private BigDecimal sysXcgN;
	private BigDecimal sysXcgRbc;
	private BigDecimal sysXcgHb;
	private BigDecimal sysXcgHct;
	private BigDecimal sysXcgMcv;
	private BigDecimal sysXcgMch;
	private BigDecimal sysXcgMchc;
	private BigDecimal sysXcgPlt;
	private BigDecimal sysXcgMpv;
	private BigDecimal sysXcgPct;
	private BigDecimal sysXcgPdw;
	private BigDecimal sysXcgPlcr;

	// Constructors

	/** default constructor */
	public SysXcgJcxxb() {
	}

	/** full constructor */
	public SysXcgJcxxb(Blxxb blxxb, Timestamp sysXcgJcsj, BigDecimal sysXcgWbc,
			BigDecimal sysXcgN, BigDecimal sysXcgRbc, BigDecimal sysXcgHb,
			BigDecimal sysXcgHct, BigDecimal sysXcgMcv, BigDecimal sysXcgMch,
			BigDecimal sysXcgMchc, BigDecimal sysXcgPlt, BigDecimal sysXcgMpv,
			BigDecimal sysXcgPct, BigDecimal sysXcgPdw, BigDecimal sysXcgPlcr) {
		this.blxxb = blxxb;
		this.sysXcgJcsj = sysXcgJcsj;
		this.sysXcgWbc = sysXcgWbc;
		this.sysXcgN = sysXcgN;
		this.sysXcgRbc = sysXcgRbc;
		this.sysXcgHb = sysXcgHb;
		this.sysXcgHct = sysXcgHct;
		this.sysXcgMcv = sysXcgMcv;
		this.sysXcgMch = sysXcgMch;
		this.sysXcgMchc = sysXcgMchc;
		this.sysXcgPlt = sysXcgPlt;
		this.sysXcgMpv = sysXcgMpv;
		this.sysXcgPct = sysXcgPct;
		this.sysXcgPdw = sysXcgPdw;
		this.sysXcgPlcr = sysXcgPlcr;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_XCG_JCBH", unique = true, nullable = false, length = 31)
	public String getSysXcgJcbh() {
		return this.sysXcgJcbh;
	}

	public void setSysXcgJcbh(String sysXcgJcbh) {
		this.sysXcgJcbh = sysXcgJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_XCG_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_XCG_JCSJ", length = 7)
	public Timestamp getSysXcgJcsj() {
		return this.sysXcgJcsj;
	}

	public void setSysXcgJcsj(Timestamp sysXcgJcsj) {
		this.sysXcgJcsj = sysXcgJcsj;
	}

	@Column(name = "SYS_XCG_WBC", precision = 22, scale = 0)
	public BigDecimal getSysXcgWbc() {
		return this.sysXcgWbc;
	}

	public void setSysXcgWbc(BigDecimal sysXcgWbc) {
		this.sysXcgWbc = sysXcgWbc;
	}

	@Column(name = "SYS_XCG_N", precision = 22, scale = 0)
	public BigDecimal getSysXcgN() {
		return this.sysXcgN;
	}

	public void setSysXcgN(BigDecimal sysXcgN) {
		this.sysXcgN = sysXcgN;
	}

	@Column(name = "SYS_XCG_RBC", precision = 22, scale = 0)
	public BigDecimal getSysXcgRbc() {
		return this.sysXcgRbc;
	}

	public void setSysXcgRbc(BigDecimal sysXcgRbc) {
		this.sysXcgRbc = sysXcgRbc;
	}

	@Column(name = "SYS_XCG_HB", precision = 22, scale = 0)
	public BigDecimal getSysXcgHb() {
		return this.sysXcgHb;
	}

	public void setSysXcgHb(BigDecimal sysXcgHb) {
		this.sysXcgHb = sysXcgHb;
	}

	@Column(name = "SYS_XCG_HCT", precision = 22, scale = 0)
	public BigDecimal getSysXcgHct() {
		return this.sysXcgHct;
	}

	public void setSysXcgHct(BigDecimal sysXcgHct) {
		this.sysXcgHct = sysXcgHct;
	}

	@Column(name = "SYS_XCG_MCV", precision = 22, scale = 0)
	public BigDecimal getSysXcgMcv() {
		return this.sysXcgMcv;
	}

	public void setSysXcgMcv(BigDecimal sysXcgMcv) {
		this.sysXcgMcv = sysXcgMcv;
	}

	@Column(name = "SYS_XCG_MCH", precision = 22, scale = 0)
	public BigDecimal getSysXcgMch() {
		return this.sysXcgMch;
	}

	public void setSysXcgMch(BigDecimal sysXcgMch) {
		this.sysXcgMch = sysXcgMch;
	}

	@Column(name = "SYS_XCG_MCHC", precision = 22, scale = 0)
	public BigDecimal getSysXcgMchc() {
		return this.sysXcgMchc;
	}

	public void setSysXcgMchc(BigDecimal sysXcgMchc) {
		this.sysXcgMchc = sysXcgMchc;
	}

	@Column(name = "SYS_XCG_PLT", precision = 22, scale = 0)
	public BigDecimal getSysXcgPlt() {
		return this.sysXcgPlt;
	}

	public void setSysXcgPlt(BigDecimal sysXcgPlt) {
		this.sysXcgPlt = sysXcgPlt;
	}

	@Column(name = "SYS_XCG_MPV", precision = 22, scale = 0)
	public BigDecimal getSysXcgMpv() {
		return this.sysXcgMpv;
	}

	public void setSysXcgMpv(BigDecimal sysXcgMpv) {
		this.sysXcgMpv = sysXcgMpv;
	}

	@Column(name = "SYS_XCG_PCT", precision = 22, scale = 0)
	public BigDecimal getSysXcgPct() {
		return this.sysXcgPct;
	}

	public void setSysXcgPct(BigDecimal sysXcgPct) {
		this.sysXcgPct = sysXcgPct;
	}

	@Column(name = "SYS_XCG_PDW", precision = 22, scale = 0)
	public BigDecimal getSysXcgPdw() {
		return this.sysXcgPdw;
	}

	public void setSysXcgPdw(BigDecimal sysXcgPdw) {
		this.sysXcgPdw = sysXcgPdw;
	}

	@Column(name = "SYS_XCG_PLCR", precision = 22, scale = 0)
	public BigDecimal getSysXcgPlcr() {
		return this.sysXcgPlcr;
	}

	public void setSysXcgPlcr(BigDecimal sysXcgPlcr) {
		this.sysXcgPlcr = sysXcgPlcr;
	}

}