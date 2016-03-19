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
 * SysQtJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_QT_JCXXB", schema = "SCOTT")
public class SysQtJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysQtJcbh;
	private Blxxb blxxb;
	private Timestamp sysQtJcsj;
	private BigDecimal sysQtTxbgas;
	private BigDecimal sysQtHscrp;
	private BigDecimal sysQtJgsy;
	private BigDecimal sysQtProbnp;
	private BigDecimal sysQtXdfm;

	// Constructors

	/** default constructor */
	public SysQtJcxxb() {
	}

	/** full constructor */
	public SysQtJcxxb(Blxxb blxxb, Timestamp sysQtJcsj, BigDecimal sysQtTxbgas,
			BigDecimal sysQtHscrp, BigDecimal sysQtJgsy,
			BigDecimal sysQtProbnp, BigDecimal sysQtXdfm) {
		this.blxxb = blxxb;
		this.sysQtJcsj = sysQtJcsj;
		this.sysQtTxbgas = sysQtTxbgas;
		this.sysQtHscrp = sysQtHscrp;
		this.sysQtJgsy = sysQtJgsy;
		this.sysQtProbnp = sysQtProbnp;
		this.sysQtXdfm = sysQtXdfm;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_QT_JCBH", unique = true, nullable = false, length = 31)
	public String getSysQtJcbh() {
		return this.sysQtJcbh;
	}

	public void setSysQtJcbh(String sysQtJcbh) {
		this.sysQtJcbh = sysQtJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_QT_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_QT_JCSJ", length = 7)
	public Timestamp getSysQtJcsj() {
		return this.sysQtJcsj;
	}

	public void setSysQtJcsj(Timestamp sysQtJcsj) {
		this.sysQtJcsj = sysQtJcsj;
	}

	@Column(name = "SYS_QT_TXBGAS", precision = 22, scale = 0)
	public BigDecimal getSysQtTxbgas() {
		return this.sysQtTxbgas;
	}

	public void setSysQtTxbgas(BigDecimal sysQtTxbgas) {
		this.sysQtTxbgas = sysQtTxbgas;
	}

	@Column(name = "SYS_QT_HSCRP", precision = 22, scale = 0)
	public BigDecimal getSysQtHscrp() {
		return this.sysQtHscrp;
	}

	public void setSysQtHscrp(BigDecimal sysQtHscrp) {
		this.sysQtHscrp = sysQtHscrp;
	}

	@Column(name = "SYS_QT_JGSY", precision = 22, scale = 0)
	public BigDecimal getSysQtJgsy() {
		return this.sysQtJgsy;
	}

	public void setSysQtJgsy(BigDecimal sysQtJgsy) {
		this.sysQtJgsy = sysQtJgsy;
	}

	@Column(name = "SYS_QT_PROBNP", precision = 22, scale = 0)
	public BigDecimal getSysQtProbnp() {
		return this.sysQtProbnp;
	}

	public void setSysQtProbnp(BigDecimal sysQtProbnp) {
		this.sysQtProbnp = sysQtProbnp;
	}

	@Column(name = "SYS_QT_XDFM", precision = 22, scale = 0)
	public BigDecimal getSysQtXdfm() {
		return this.sysQtXdfm;
	}

	public void setSysQtXdfm(BigDecimal sysQtXdfm) {
		this.sysQtXdfm = sysQtXdfm;
	}

}