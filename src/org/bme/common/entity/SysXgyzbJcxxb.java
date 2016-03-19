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
 * SysXgyzbJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_XGYZB_JCXXB", schema = "SCOTT")
public class SysXgyzbJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysXgyzbJcbh;
	private Blxxb blxxb;
	private Timestamp sysXgyzbJcsj;
	private String sysXgyzbAna;
	private String sysXgyzbAnca;
	private String sysXgyzbDsdna;
	private String sysXgyzbSsa;
	private String sysXgyzbSsb;
	private String sysXgyzbKxlzkt;
	private String sysXgyzbKsxqjdmkt;
	private BigDecimal sysXgyzbEsr;

	// Constructors

	/** default constructor */
	public SysXgyzbJcxxb() {
	}

	/** full constructor */
	public SysXgyzbJcxxb(Blxxb blxxb, Timestamp sysXgyzbJcsj,
			String sysXgyzbAna, String sysXgyzbAnca, String sysXgyzbDsdna,
			String sysXgyzbSsa, String sysXgyzbSsb, String sysXgyzbKxlzkt,
			String sysXgyzbKsxqjdmkt, BigDecimal sysXgyzbEsr) {
		this.blxxb = blxxb;
		this.sysXgyzbJcsj = sysXgyzbJcsj;
		this.sysXgyzbAna = sysXgyzbAna;
		this.sysXgyzbAnca = sysXgyzbAnca;
		this.sysXgyzbDsdna = sysXgyzbDsdna;
		this.sysXgyzbSsa = sysXgyzbSsa;
		this.sysXgyzbSsb = sysXgyzbSsb;
		this.sysXgyzbKxlzkt = sysXgyzbKxlzkt;
		this.sysXgyzbKsxqjdmkt = sysXgyzbKsxqjdmkt;
		this.sysXgyzbEsr = sysXgyzbEsr;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_XGYZB_JCBH", unique = true, nullable = false, length = 31)
	public String getSysXgyzbJcbh() {
		return this.sysXgyzbJcbh;
	}

	public void setSysXgyzbJcbh(String sysXgyzbJcbh) {
		this.sysXgyzbJcbh = sysXgyzbJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_XGYZB_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_XGYZB_JCSJ", length = 7)
	public Timestamp getSysXgyzbJcsj() {
		return this.sysXgyzbJcsj;
	}

	public void setSysXgyzbJcsj(Timestamp sysXgyzbJcsj) {
		this.sysXgyzbJcsj = sysXgyzbJcsj;
	}

	@Column(name = "SYS_XGYZB_ANA", length = 10)
	public String getSysXgyzbAna() {
		return this.sysXgyzbAna;
	}

	public void setSysXgyzbAna(String sysXgyzbAna) {
		this.sysXgyzbAna = sysXgyzbAna;
	}

	@Column(name = "SYS_XGYZB_ANCA", length = 10)
	public String getSysXgyzbAnca() {
		return this.sysXgyzbAnca;
	}

	public void setSysXgyzbAnca(String sysXgyzbAnca) {
		this.sysXgyzbAnca = sysXgyzbAnca;
	}

	@Column(name = "SYS_XGYZB_DSDNA", length = 10)
	public String getSysXgyzbDsdna() {
		return this.sysXgyzbDsdna;
	}

	public void setSysXgyzbDsdna(String sysXgyzbDsdna) {
		this.sysXgyzbDsdna = sysXgyzbDsdna;
	}

	@Column(name = "SYS_XGYZB_SSA", length = 10)
	public String getSysXgyzbSsa() {
		return this.sysXgyzbSsa;
	}

	public void setSysXgyzbSsa(String sysXgyzbSsa) {
		this.sysXgyzbSsa = sysXgyzbSsa;
	}

	@Column(name = "SYS_XGYZB_SSB", length = 10)
	public String getSysXgyzbSsb() {
		return this.sysXgyzbSsb;
	}

	public void setSysXgyzbSsb(String sysXgyzbSsb) {
		this.sysXgyzbSsb = sysXgyzbSsb;
	}

	@Column(name = "SYS_XGYZB_KXLZKT", length = 10)
	public String getSysXgyzbKxlzkt() {
		return this.sysXgyzbKxlzkt;
	}

	public void setSysXgyzbKxlzkt(String sysXgyzbKxlzkt) {
		this.sysXgyzbKxlzkt = sysXgyzbKxlzkt;
	}

	@Column(name = "SYS_XGYZB_KSXQJDMKT", length = 10)
	public String getSysXgyzbKsxqjdmkt() {
		return this.sysXgyzbKsxqjdmkt;
	}

	public void setSysXgyzbKsxqjdmkt(String sysXgyzbKsxqjdmkt) {
		this.sysXgyzbKsxqjdmkt = sysXgyzbKsxqjdmkt;
	}

	@Column(name = "SYS_XGYZB_ESR", precision = 22, scale = 0)
	public BigDecimal getSysXgyzbEsr() {
		return this.sysXgyzbEsr;
	}

	public void setSysXgyzbEsr(BigDecimal sysXgyzbEsr) {
		this.sysXgyzbEsr = sysXgyzbEsr;
	}

}