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
 * SysXjssbjwJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_XJSSBJW_JCXXB", schema = "SCOTT")
public class SysXjssbjwJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysXjssbjwJcbh;
	private Blxxb blxxb;
	private Timestamp sysXjssbjwJcsj;
	private BigDecimal sysXjssbjwCtnl;
	private BigDecimal sysXjssbjwCkmb;
	private BigDecimal sysXjssbjwMyo;

	// Constructors

	/** default constructor */
	public SysXjssbjwJcxxb() {
	}

	/** full constructor */
	public SysXjssbjwJcxxb(Blxxb blxxb, Timestamp sysXjssbjwJcsj,
			BigDecimal sysXjssbjwCtnl, BigDecimal sysXjssbjwCkmb,
			BigDecimal sysXjssbjwMyo) {
		this.blxxb = blxxb;
		this.sysXjssbjwJcsj = sysXjssbjwJcsj;
		this.sysXjssbjwCtnl = sysXjssbjwCtnl;
		this.sysXjssbjwCkmb = sysXjssbjwCkmb;
		this.sysXjssbjwMyo = sysXjssbjwMyo;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_XJSSBJW_JCBH", unique = true, nullable = false, length = 31)
	public String getSysXjssbjwJcbh() {
		return this.sysXjssbjwJcbh;
	}

	public void setSysXjssbjwJcbh(String sysXjssbjwJcbh) {
		this.sysXjssbjwJcbh = sysXjssbjwJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_XJSSBJW_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_XJSSBJW_JCSJ", length = 7)
	public Timestamp getSysXjssbjwJcsj() {
		return this.sysXjssbjwJcsj;
	}

	public void setSysXjssbjwJcsj(Timestamp sysXjssbjwJcsj) {
		this.sysXjssbjwJcsj = sysXjssbjwJcsj;
	}

	@Column(name = "SYS_XJSSBJW_CTNL", precision = 22, scale = 0)
	public BigDecimal getSysXjssbjwCtnl() {
		return this.sysXjssbjwCtnl;
	}

	public void setSysXjssbjwCtnl(BigDecimal sysXjssbjwCtnl) {
		this.sysXjssbjwCtnl = sysXjssbjwCtnl;
	}

	@Column(name = "SYS_XJSSBJW_CKMB", precision = 22, scale = 0)
	public BigDecimal getSysXjssbjwCkmb() {
		return this.sysXjssbjwCkmb;
	}

	public void setSysXjssbjwCkmb(BigDecimal sysXjssbjwCkmb) {
		this.sysXjssbjwCkmb = sysXjssbjwCkmb;
	}

	@Column(name = "SYS_XJSSBJW_MYO", precision = 22, scale = 0)
	public BigDecimal getSysXjssbjwMyo() {
		return this.sysXjssbjwMyo;
	}

	public void setSysXjssbjwMyo(BigDecimal sysXjssbjwMyo) {
		this.sysXjssbjwMyo = sysXjssbjwMyo;
	}

}