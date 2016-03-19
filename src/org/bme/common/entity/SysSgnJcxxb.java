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
 * SysSgnJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_SGN_JCXXB", schema = "SCOTT")
public class SysSgnJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysSgnJcbh;
	private Blxxb blxxb;
	private Timestamp sysSgnJcsj;
	private BigDecimal sysSgnCr;
	private BigDecimal sysSgnBun;
	private BigDecimal sysSgnEgfr;
	private BigDecimal sysSgnNs;

	// Constructors

	/** default constructor */
	public SysSgnJcxxb() {
	}

	/** full constructor */
	public SysSgnJcxxb(Blxxb blxxb, Timestamp sysSgnJcsj, BigDecimal sysSgnCr,
			BigDecimal sysSgnBun, BigDecimal sysSgnEgfr, BigDecimal sysSgnNs) {
		this.blxxb = blxxb;
		this.sysSgnJcsj = sysSgnJcsj;
		this.sysSgnCr = sysSgnCr;
		this.sysSgnBun = sysSgnBun;
		this.sysSgnEgfr = sysSgnEgfr;
		this.sysSgnNs = sysSgnNs;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_SGN_JCBH", unique = true, nullable = false, length = 31)
	public String getSysSgnJcbh() {
		return this.sysSgnJcbh;
	}

	public void setSysSgnJcbh(String sysSgnJcbh) {
		this.sysSgnJcbh = sysSgnJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_SGN_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_SGN_JCSJ", length = 7)
	public Timestamp getSysSgnJcsj() {
		return this.sysSgnJcsj;
	}

	public void setSysSgnJcsj(Timestamp sysSgnJcsj) {
		this.sysSgnJcsj = sysSgnJcsj;
	}

	@Column(name = "SYS_SGN_CR", precision = 22, scale = 0)
	public BigDecimal getSysSgnCr() {
		return this.sysSgnCr;
	}

	public void setSysSgnCr(BigDecimal sysSgnCr) {
		this.sysSgnCr = sysSgnCr;
	}

	@Column(name = "SYS_SGN_BUN", precision = 22, scale = 0)
	public BigDecimal getSysSgnBun() {
		return this.sysSgnBun;
	}

	public void setSysSgnBun(BigDecimal sysSgnBun) {
		this.sysSgnBun = sysSgnBun;
	}

	@Column(name = "SYS_SGN_EGFR", precision = 22, scale = 0)
	public BigDecimal getSysSgnEgfr() {
		return this.sysSgnEgfr;
	}

	public void setSysSgnEgfr(BigDecimal sysSgnEgfr) {
		this.sysSgnEgfr = sysSgnEgfr;
	}

	@Column(name = "SYS_SGN_NS", precision = 22, scale = 0)
	public BigDecimal getSysSgnNs() {
		return this.sysSgnNs;
	}

	public void setSysSgnNs(BigDecimal sysSgnNs) {
		this.sysSgnNs = sysSgnNs;
	}

}