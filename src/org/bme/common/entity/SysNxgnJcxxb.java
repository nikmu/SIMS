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
 * SysNxgnJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_NXGN_JCXXB", schema = "SCOTT")
public class SysNxgnJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysNxgnJcbh;
	private Blxxb blxxb;
	private Timestamp sysNxgnJcsj;
	private BigDecimal sysNxgnAptt;
	private BigDecimal sysNxgnPt;
	private BigDecimal sysNxgnInr;
	private BigDecimal sysNxgnTt;
	private BigDecimal sysNxgnFbg;

	// Constructors

	/** default constructor */
	public SysNxgnJcxxb() {
	}

	/** full constructor */
	public SysNxgnJcxxb(Blxxb blxxb, Timestamp sysNxgnJcsj,
			BigDecimal sysNxgnAptt, BigDecimal sysNxgnPt,
			BigDecimal sysNxgnInr, BigDecimal sysNxgnTt, BigDecimal sysNxgnFbg) {
		this.blxxb = blxxb;
		this.sysNxgnJcsj = sysNxgnJcsj;
		this.sysNxgnAptt = sysNxgnAptt;
		this.sysNxgnPt = sysNxgnPt;
		this.sysNxgnInr = sysNxgnInr;
		this.sysNxgnTt = sysNxgnTt;
		this.sysNxgnFbg = sysNxgnFbg;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_NXGN_JCBH", unique = true, nullable = false, length = 31)
	public String getSysNxgnJcbh() {
		return this.sysNxgnJcbh;
	}

	public void setSysNxgnJcbh(String sysNxgnJcbh) {
		this.sysNxgnJcbh = sysNxgnJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_NXGN_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_NXGN_JCSJ", length = 7)
	public Timestamp getSysNxgnJcsj() {
		return this.sysNxgnJcsj;
	}

	public void setSysNxgnJcsj(Timestamp sysNxgnJcsj) {
		this.sysNxgnJcsj = sysNxgnJcsj;
	}

	@Column(name = "SYS_NXGN_APTT", precision = 22, scale = 0)
	public BigDecimal getSysNxgnAptt() {
		return this.sysNxgnAptt;
	}

	public void setSysNxgnAptt(BigDecimal sysNxgnAptt) {
		this.sysNxgnAptt = sysNxgnAptt;
	}

	@Column(name = "SYS_NXGN_PT", precision = 22, scale = 0)
	public BigDecimal getSysNxgnPt() {
		return this.sysNxgnPt;
	}

	public void setSysNxgnPt(BigDecimal sysNxgnPt) {
		this.sysNxgnPt = sysNxgnPt;
	}

	@Column(name = "SYS_NXGN_INR", precision = 22, scale = 0)
	public BigDecimal getSysNxgnInr() {
		return this.sysNxgnInr;
	}

	public void setSysNxgnInr(BigDecimal sysNxgnInr) {
		this.sysNxgnInr = sysNxgnInr;
	}

	@Column(name = "SYS_NXGN_TT", precision = 22, scale = 0)
	public BigDecimal getSysNxgnTt() {
		return this.sysNxgnTt;
	}

	public void setSysNxgnTt(BigDecimal sysNxgnTt) {
		this.sysNxgnTt = sysNxgnTt;
	}

	@Column(name = "SYS_NXGN_FBG", precision = 22, scale = 0)
	public BigDecimal getSysNxgnFbg() {
		return this.sysNxgnFbg;
	}

	public void setSysNxgnFbg(BigDecimal sysNxgnFbg) {
		this.sysNxgnFbg = sysNxgnFbg;
	}

}