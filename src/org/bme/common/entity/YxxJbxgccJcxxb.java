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
 * YxxJbxgccJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_JBXGCC_JCXXB", schema = "SCOTT")
public class YxxJbxgccJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxJbxgccJcbh;
	private Blxxb blxxb;
	private Timestamp yxxJbxgccJcsj;
	private BigDecimal yxxJbxgccJzdmzcimt;
	private String yxxJbxgccJzdmzcbkxz;
	private String yxxJbxgccJzdmzcgqxz;
	private BigDecimal yxxJbxgccJzdmycimt;
	private String yxxJbxgccJzdmycbkxz;
	private String yxxJbxgccJzdmycgqxz;
	private BigDecimal yxxJbxgccJndmzcimt;
	private String yxxJbxgccJndmzcbkxz;
	private String yxxJbxgccJndmzcgqxz;
	private BigDecimal yxxJbxgccJndmycimt;
	private String yxxJbxgccJndmycbkxz;
	private String yxxJbxgccJndmycgqxz;
	private BigDecimal yxxJbxgccJwdmzcimt;
	private String yxxJbxgccJwdmzcbkxz;
	private String yxxJbxgccJwdmzcgqxz;
	private BigDecimal yxxJbxgccJwdmycimt;
	private String yxxJbxgccJwdmycbkxz;
	private String yxxJbxgccJwdmycgqxz;

	// Constructors

	/** default constructor */
	public YxxJbxgccJcxxb() {
	}

	/** full constructor */
	public YxxJbxgccJcxxb(Blxxb blxxb, Timestamp yxxJbxgccJcsj,
			BigDecimal yxxJbxgccJzdmzcimt, String yxxJbxgccJzdmzcbkxz,
			String yxxJbxgccJzdmzcgqxz, BigDecimal yxxJbxgccJzdmycimt,
			String yxxJbxgccJzdmycbkxz, String yxxJbxgccJzdmycgqxz,
			BigDecimal yxxJbxgccJndmzcimt, String yxxJbxgccJndmzcbkxz,
			String yxxJbxgccJndmzcgqxz, BigDecimal yxxJbxgccJndmycimt,
			String yxxJbxgccJndmycbkxz, String yxxJbxgccJndmycgqxz,
			BigDecimal yxxJbxgccJwdmzcimt, String yxxJbxgccJwdmzcbkxz,
			String yxxJbxgccJwdmzcgqxz, BigDecimal yxxJbxgccJwdmycimt,
			String yxxJbxgccJwdmycbkxz, String yxxJbxgccJwdmycgqxz) {
		this.blxxb = blxxb;
		this.yxxJbxgccJcsj = yxxJbxgccJcsj;
		this.yxxJbxgccJzdmzcimt = yxxJbxgccJzdmzcimt;
		this.yxxJbxgccJzdmzcbkxz = yxxJbxgccJzdmzcbkxz;
		this.yxxJbxgccJzdmzcgqxz = yxxJbxgccJzdmzcgqxz;
		this.yxxJbxgccJzdmycimt = yxxJbxgccJzdmycimt;
		this.yxxJbxgccJzdmycbkxz = yxxJbxgccJzdmycbkxz;
		this.yxxJbxgccJzdmycgqxz = yxxJbxgccJzdmycgqxz;
		this.yxxJbxgccJndmzcimt = yxxJbxgccJndmzcimt;
		this.yxxJbxgccJndmzcbkxz = yxxJbxgccJndmzcbkxz;
		this.yxxJbxgccJndmzcgqxz = yxxJbxgccJndmzcgqxz;
		this.yxxJbxgccJndmycimt = yxxJbxgccJndmycimt;
		this.yxxJbxgccJndmycbkxz = yxxJbxgccJndmycbkxz;
		this.yxxJbxgccJndmycgqxz = yxxJbxgccJndmycgqxz;
		this.yxxJbxgccJwdmzcimt = yxxJbxgccJwdmzcimt;
		this.yxxJbxgccJwdmzcbkxz = yxxJbxgccJwdmzcbkxz;
		this.yxxJbxgccJwdmzcgqxz = yxxJbxgccJwdmzcgqxz;
		this.yxxJbxgccJwdmycimt = yxxJbxgccJwdmycimt;
		this.yxxJbxgccJwdmycbkxz = yxxJbxgccJwdmycbkxz;
		this.yxxJbxgccJwdmycgqxz = yxxJbxgccJwdmycgqxz;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_JBXGCC_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxJbxgccJcbh() {
		return this.yxxJbxgccJcbh;
	}

	public void setYxxJbxgccJcbh(String yxxJbxgccJcbh) {
		this.yxxJbxgccJcbh = yxxJbxgccJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_JBXGCC_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_JBXGCC_JCSJ", length = 7)
	public Timestamp getYxxJbxgccJcsj() {
		return this.yxxJbxgccJcsj;
	}

	public void setYxxJbxgccJcsj(Timestamp yxxJbxgccJcsj) {
		this.yxxJbxgccJcsj = yxxJbxgccJcsj;
	}

	@Column(name = "YXX_JBXGCC_JZDMZCIMT", precision = 22, scale = 0)
	public BigDecimal getYxxJbxgccJzdmzcimt() {
		return this.yxxJbxgccJzdmzcimt;
	}

	public void setYxxJbxgccJzdmzcimt(BigDecimal yxxJbxgccJzdmzcimt) {
		this.yxxJbxgccJzdmzcimt = yxxJbxgccJzdmzcimt;
	}

	@Column(name = "YXX_JBXGCC_JZDMZCBKXZ", length = 20)
	public String getYxxJbxgccJzdmzcbkxz() {
		return this.yxxJbxgccJzdmzcbkxz;
	}

	public void setYxxJbxgccJzdmzcbkxz(String yxxJbxgccJzdmzcbkxz) {
		this.yxxJbxgccJzdmzcbkxz = yxxJbxgccJzdmzcbkxz;
	}

	@Column(name = "YXX_JBXGCC_JZDMZCGQXZ", length = 20)
	public String getYxxJbxgccJzdmzcgqxz() {
		return this.yxxJbxgccJzdmzcgqxz;
	}

	public void setYxxJbxgccJzdmzcgqxz(String yxxJbxgccJzdmzcgqxz) {
		this.yxxJbxgccJzdmzcgqxz = yxxJbxgccJzdmzcgqxz;
	}

	@Column(name = "YXX_JBXGCC_JZDMYCIMT", precision = 22, scale = 0)
	public BigDecimal getYxxJbxgccJzdmycimt() {
		return this.yxxJbxgccJzdmycimt;
	}

	public void setYxxJbxgccJzdmycimt(BigDecimal yxxJbxgccJzdmycimt) {
		this.yxxJbxgccJzdmycimt = yxxJbxgccJzdmycimt;
	}

	@Column(name = "YXX_JBXGCC_JZDMYCBKXZ", length = 20)
	public String getYxxJbxgccJzdmycbkxz() {
		return this.yxxJbxgccJzdmycbkxz;
	}

	public void setYxxJbxgccJzdmycbkxz(String yxxJbxgccJzdmycbkxz) {
		this.yxxJbxgccJzdmycbkxz = yxxJbxgccJzdmycbkxz;
	}

	@Column(name = "YXX_JBXGCC_JZDMYCGQXZ", length = 20)
	public String getYxxJbxgccJzdmycgqxz() {
		return this.yxxJbxgccJzdmycgqxz;
	}

	public void setYxxJbxgccJzdmycgqxz(String yxxJbxgccJzdmycgqxz) {
		this.yxxJbxgccJzdmycgqxz = yxxJbxgccJzdmycgqxz;
	}

	@Column(name = "YXX_JBXGCC_JNDMZCIMT", precision = 22, scale = 0)
	public BigDecimal getYxxJbxgccJndmzcimt() {
		return this.yxxJbxgccJndmzcimt;
	}

	public void setYxxJbxgccJndmzcimt(BigDecimal yxxJbxgccJndmzcimt) {
		this.yxxJbxgccJndmzcimt = yxxJbxgccJndmzcimt;
	}

	@Column(name = "YXX_JBXGCC_JNDMZCBKXZ", length = 20)
	public String getYxxJbxgccJndmzcbkxz() {
		return this.yxxJbxgccJndmzcbkxz;
	}

	public void setYxxJbxgccJndmzcbkxz(String yxxJbxgccJndmzcbkxz) {
		this.yxxJbxgccJndmzcbkxz = yxxJbxgccJndmzcbkxz;
	}

	@Column(name = "YXX_JBXGCC_JNDMZCGQXZ", length = 20)
	public String getYxxJbxgccJndmzcgqxz() {
		return this.yxxJbxgccJndmzcgqxz;
	}

	public void setYxxJbxgccJndmzcgqxz(String yxxJbxgccJndmzcgqxz) {
		this.yxxJbxgccJndmzcgqxz = yxxJbxgccJndmzcgqxz;
	}

	@Column(name = "YXX_JBXGCC_JNDMYCIMT", precision = 22, scale = 0)
	public BigDecimal getYxxJbxgccJndmycimt() {
		return this.yxxJbxgccJndmycimt;
	}

	public void setYxxJbxgccJndmycimt(BigDecimal yxxJbxgccJndmycimt) {
		this.yxxJbxgccJndmycimt = yxxJbxgccJndmycimt;
	}

	@Column(name = "YXX_JBXGCC_JNDMYCBKXZ", length = 20)
	public String getYxxJbxgccJndmycbkxz() {
		return this.yxxJbxgccJndmycbkxz;
	}

	public void setYxxJbxgccJndmycbkxz(String yxxJbxgccJndmycbkxz) {
		this.yxxJbxgccJndmycbkxz = yxxJbxgccJndmycbkxz;
	}

	@Column(name = "YXX_JBXGCC_JNDMYCGQXZ", length = 20)
	public String getYxxJbxgccJndmycgqxz() {
		return this.yxxJbxgccJndmycgqxz;
	}

	public void setYxxJbxgccJndmycgqxz(String yxxJbxgccJndmycgqxz) {
		this.yxxJbxgccJndmycgqxz = yxxJbxgccJndmycgqxz;
	}

	@Column(name = "YXX_JBXGCC_JWDMZCIMT", precision = 22, scale = 0)
	public BigDecimal getYxxJbxgccJwdmzcimt() {
		return this.yxxJbxgccJwdmzcimt;
	}

	public void setYxxJbxgccJwdmzcimt(BigDecimal yxxJbxgccJwdmzcimt) {
		this.yxxJbxgccJwdmzcimt = yxxJbxgccJwdmzcimt;
	}

	@Column(name = "YXX_JBXGCC_JWDMZCBKXZ", length = 20)
	public String getYxxJbxgccJwdmzcbkxz() {
		return this.yxxJbxgccJwdmzcbkxz;
	}

	public void setYxxJbxgccJwdmzcbkxz(String yxxJbxgccJwdmzcbkxz) {
		this.yxxJbxgccJwdmzcbkxz = yxxJbxgccJwdmzcbkxz;
	}

	@Column(name = "YXX_JBXGCC_JWDMZCGQXZ", length = 20)
	public String getYxxJbxgccJwdmzcgqxz() {
		return this.yxxJbxgccJwdmzcgqxz;
	}

	public void setYxxJbxgccJwdmzcgqxz(String yxxJbxgccJwdmzcgqxz) {
		this.yxxJbxgccJwdmzcgqxz = yxxJbxgccJwdmzcgqxz;
	}

	@Column(name = "YXX_JBXGCC_JWDMYCIMT", precision = 22, scale = 0)
	public BigDecimal getYxxJbxgccJwdmycimt() {
		return this.yxxJbxgccJwdmycimt;
	}

	public void setYxxJbxgccJwdmycimt(BigDecimal yxxJbxgccJwdmycimt) {
		this.yxxJbxgccJwdmycimt = yxxJbxgccJwdmycimt;
	}

	@Column(name = "YXX_JBXGCC_JWDMYCBKXZ", length = 20)
	public String getYxxJbxgccJwdmycbkxz() {
		return this.yxxJbxgccJwdmycbkxz;
	}

	public void setYxxJbxgccJwdmycbkxz(String yxxJbxgccJwdmycbkxz) {
		this.yxxJbxgccJwdmycbkxz = yxxJbxgccJwdmycbkxz;
	}

	@Column(name = "YXX_JBXGCC_JWDMYCGQXZ", length = 20)
	public String getYxxJbxgccJwdmycgqxz() {
		return this.yxxJbxgccJwdmycgqxz;
	}

	public void setYxxJbxgccJwdmycgqxz(String yxxJbxgccJwdmycgqxz) {
		this.yxxJbxgccJwdmycgqxz = yxxJbxgccJwdmycgqxz;
	}

}