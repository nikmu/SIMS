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
 * SysXzJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_XZ_JCXXB", schema = "SCOTT")
public class SysXzJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysXzJcbh;
	private Blxxb blxxb;
	private Timestamp sysXzJcsj;
	private BigDecimal sysXzTc;
	private BigDecimal sysXzTg;
	private BigDecimal sysXzHdlc;
	private BigDecimal sysXzLdlc;

	// Constructors

	/** default constructor */
	public SysXzJcxxb() {
	}

	/** full constructor */
	public SysXzJcxxb(Blxxb blxxb, Timestamp sysXzJcsj, BigDecimal sysXzTc,
			BigDecimal sysXzTg, BigDecimal sysXzHdlc, BigDecimal sysXzLdlc) {
		this.blxxb = blxxb;
		this.sysXzJcsj = sysXzJcsj;
		this.sysXzTc = sysXzTc;
		this.sysXzTg = sysXzTg;
		this.sysXzHdlc = sysXzHdlc;
		this.sysXzLdlc = sysXzLdlc;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_XZ_JCBH", unique = true, nullable = false, length = 31)
	public String getSysXzJcbh() {
		return this.sysXzJcbh;
	}

	public void setSysXzJcbh(String sysXzJcbh) {
		this.sysXzJcbh = sysXzJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_XZ_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_XZ_JCSJ", length = 7)
	public Timestamp getSysXzJcsj() {
		return this.sysXzJcsj;
	}

	public void setSysXzJcsj(Timestamp sysXzJcsj) {
		this.sysXzJcsj = sysXzJcsj;
	}

	@Column(name = "SYS_XZ_TC", precision = 22, scale = 0)
	public BigDecimal getSysXzTc() {
		return this.sysXzTc;
	}

	public void setSysXzTc(BigDecimal sysXzTc) {
		this.sysXzTc = sysXzTc;
	}

	@Column(name = "SYS_XZ_TG", precision = 22, scale = 0)
	public BigDecimal getSysXzTg() {
		return this.sysXzTg;
	}

	public void setSysXzTg(BigDecimal sysXzTg) {
		this.sysXzTg = sysXzTg;
	}

	@Column(name = "SYS_XZ_HDLC", precision = 22, scale = 0)
	public BigDecimal getSysXzHdlc() {
		return this.sysXzHdlc;
	}

	public void setSysXzHdlc(BigDecimal sysXzHdlc) {
		this.sysXzHdlc = sysXzHdlc;
	}

	@Column(name = "SYS_XZ_LDLC", precision = 22, scale = 0)
	public BigDecimal getSysXzLdlc() {
		return this.sysXzLdlc;
	}

	public void setSysXzLdlc(BigDecimal sysXzLdlc) {
		this.sysXzLdlc = sysXzLdlc;
	}

}