package org.bme.common.entity;

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
 * YxxXzxgccJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_XZXGCC_JCXXB", schema = "SCOTT")
public class YxxXzxgccJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxXzxgccJcbh;
	private Blxxb blxxb;
	private Timestamp yxxXzxgccJcsj;
	private String yxxXzxgccGzdmzcbkxz;
	private String yxxXzxgccGzdmzcgqxz;
	private String yxxXzxgccGzdmycbkxz;
	private String yxxXzxgccGzdmycgqxz;
	private String yxxXzxgccGqdmzcbkxz;
	private String yxxXzxgccGqdmzcgqxz;
	private String yxxXzxgccGqdmycbkxz;
	private String yxxXzxgccGqdmycgqxz;
	private String yxxXzxgccGsdmzcbkxz;
	private String yxxXzxgccGsdmzcgqxz;
	private String yxxXzxgccGsdmycbkxz;
	private String yxxXzxgccGsdmycgqxz;
	private String yxxXzxgccGdmzcbkxz;
	private String yxxXzxgccGdmzcgqxz;
	private String yxxXzxgccGdmycbkxz;
	private String yxxXzxgccGdmycgqxz;

	// Constructors

	/** default constructor */
	public YxxXzxgccJcxxb() {
	}

	/** full constructor */
	public YxxXzxgccJcxxb(Blxxb blxxb, Timestamp yxxXzxgccJcsj,
			String yxxXzxgccGzdmzcbkxz, String yxxXzxgccGzdmzcgqxz,
			String yxxXzxgccGzdmycbkxz, String yxxXzxgccGzdmycgqxz,
			String yxxXzxgccGqdmzcbkxz, String yxxXzxgccGqdmzcgqxz,
			String yxxXzxgccGqdmycbkxz, String yxxXzxgccGqdmycgqxz,
			String yxxXzxgccGsdmzcbkxz, String yxxXzxgccGsdmzcgqxz,
			String yxxXzxgccGsdmycbkxz, String yxxXzxgccGsdmycgqxz,
			String yxxXzxgccGdmzcbkxz, String yxxXzxgccGdmzcgqxz,
			String yxxXzxgccGdmycbkxz, String yxxXzxgccGdmycgqxz) {
		this.blxxb = blxxb;
		this.yxxXzxgccJcsj = yxxXzxgccJcsj;
		this.yxxXzxgccGzdmzcbkxz = yxxXzxgccGzdmzcbkxz;
		this.yxxXzxgccGzdmzcgqxz = yxxXzxgccGzdmzcgqxz;
		this.yxxXzxgccGzdmycbkxz = yxxXzxgccGzdmycbkxz;
		this.yxxXzxgccGzdmycgqxz = yxxXzxgccGzdmycgqxz;
		this.yxxXzxgccGqdmzcbkxz = yxxXzxgccGqdmzcbkxz;
		this.yxxXzxgccGqdmzcgqxz = yxxXzxgccGqdmzcgqxz;
		this.yxxXzxgccGqdmycbkxz = yxxXzxgccGqdmycbkxz;
		this.yxxXzxgccGqdmycgqxz = yxxXzxgccGqdmycgqxz;
		this.yxxXzxgccGsdmzcbkxz = yxxXzxgccGsdmzcbkxz;
		this.yxxXzxgccGsdmzcgqxz = yxxXzxgccGsdmzcgqxz;
		this.yxxXzxgccGsdmycbkxz = yxxXzxgccGsdmycbkxz;
		this.yxxXzxgccGsdmycgqxz = yxxXzxgccGsdmycgqxz;
		this.yxxXzxgccGdmzcbkxz = yxxXzxgccGdmzcbkxz;
		this.yxxXzxgccGdmzcgqxz = yxxXzxgccGdmzcgqxz;
		this.yxxXzxgccGdmycbkxz = yxxXzxgccGdmycbkxz;
		this.yxxXzxgccGdmycgqxz = yxxXzxgccGdmycgqxz;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_XZXGCC_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxXzxgccJcbh() {
		return this.yxxXzxgccJcbh;
	}

	public void setYxxXzxgccJcbh(String yxxXzxgccJcbh) {
		this.yxxXzxgccJcbh = yxxXzxgccJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_XZXGCC_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_XZXGCC_JCSJ", length = 7)
	public Timestamp getYxxXzxgccJcsj() {
		return this.yxxXzxgccJcsj;
	}

	public void setYxxXzxgccJcsj(Timestamp yxxXzxgccJcsj) {
		this.yxxXzxgccJcsj = yxxXzxgccJcsj;
	}

	@Column(name = "YXX_XZXGCC_GZDMZCBKXZ", length = 20)
	public String getYxxXzxgccGzdmzcbkxz() {
		return this.yxxXzxgccGzdmzcbkxz;
	}

	public void setYxxXzxgccGzdmzcbkxz(String yxxXzxgccGzdmzcbkxz) {
		this.yxxXzxgccGzdmzcbkxz = yxxXzxgccGzdmzcbkxz;
	}

	@Column(name = "YXX_XZXGCC_GZDMZCGQXZ", length = 20)
	public String getYxxXzxgccGzdmzcgqxz() {
		return this.yxxXzxgccGzdmzcgqxz;
	}

	public void setYxxXzxgccGzdmzcgqxz(String yxxXzxgccGzdmzcgqxz) {
		this.yxxXzxgccGzdmzcgqxz = yxxXzxgccGzdmzcgqxz;
	}

	@Column(name = "YXX_XZXGCC_GZDMYCBKXZ", length = 20)
	public String getYxxXzxgccGzdmycbkxz() {
		return this.yxxXzxgccGzdmycbkxz;
	}

	public void setYxxXzxgccGzdmycbkxz(String yxxXzxgccGzdmycbkxz) {
		this.yxxXzxgccGzdmycbkxz = yxxXzxgccGzdmycbkxz;
	}

	@Column(name = "YXX_XZXGCC_GZDMYCGQXZ", length = 20)
	public String getYxxXzxgccGzdmycgqxz() {
		return this.yxxXzxgccGzdmycgqxz;
	}

	public void setYxxXzxgccGzdmycgqxz(String yxxXzxgccGzdmycgqxz) {
		this.yxxXzxgccGzdmycgqxz = yxxXzxgccGzdmycgqxz;
	}

	@Column(name = "YXX_XZXGCC_GQDMZCBKXZ", length = 20)
	public String getYxxXzxgccGqdmzcbkxz() {
		return this.yxxXzxgccGqdmzcbkxz;
	}

	public void setYxxXzxgccGqdmzcbkxz(String yxxXzxgccGqdmzcbkxz) {
		this.yxxXzxgccGqdmzcbkxz = yxxXzxgccGqdmzcbkxz;
	}

	@Column(name = "YXX_XZXGCC_GQDMZCGQXZ", length = 20)
	public String getYxxXzxgccGqdmzcgqxz() {
		return this.yxxXzxgccGqdmzcgqxz;
	}

	public void setYxxXzxgccGqdmzcgqxz(String yxxXzxgccGqdmzcgqxz) {
		this.yxxXzxgccGqdmzcgqxz = yxxXzxgccGqdmzcgqxz;
	}

	@Column(name = "YXX_XZXGCC_GQDMYCBKXZ", length = 20)
	public String getYxxXzxgccGqdmycbkxz() {
		return this.yxxXzxgccGqdmycbkxz;
	}

	public void setYxxXzxgccGqdmycbkxz(String yxxXzxgccGqdmycbkxz) {
		this.yxxXzxgccGqdmycbkxz = yxxXzxgccGqdmycbkxz;
	}

	@Column(name = "YXX_XZXGCC_GQDMYCGQXZ", length = 20)
	public String getYxxXzxgccGqdmycgqxz() {
		return this.yxxXzxgccGqdmycgqxz;
	}

	public void setYxxXzxgccGqdmycgqxz(String yxxXzxgccGqdmycgqxz) {
		this.yxxXzxgccGqdmycgqxz = yxxXzxgccGqdmycgqxz;
	}

	@Column(name = "YXX_XZXGCC_GSDMZCBKXZ", length = 20)
	public String getYxxXzxgccGsdmzcbkxz() {
		return this.yxxXzxgccGsdmzcbkxz;
	}

	public void setYxxXzxgccGsdmzcbkxz(String yxxXzxgccGsdmzcbkxz) {
		this.yxxXzxgccGsdmzcbkxz = yxxXzxgccGsdmzcbkxz;
	}

	@Column(name = "YXX_XZXGCC_GSDMZCGQXZ", length = 20)
	public String getYxxXzxgccGsdmzcgqxz() {
		return this.yxxXzxgccGsdmzcgqxz;
	}

	public void setYxxXzxgccGsdmzcgqxz(String yxxXzxgccGsdmzcgqxz) {
		this.yxxXzxgccGsdmzcgqxz = yxxXzxgccGsdmzcgqxz;
	}

	@Column(name = "YXX_XZXGCC_GSDMYCBKXZ", length = 20)
	public String getYxxXzxgccGsdmycbkxz() {
		return this.yxxXzxgccGsdmycbkxz;
	}

	public void setYxxXzxgccGsdmycbkxz(String yxxXzxgccGsdmycbkxz) {
		this.yxxXzxgccGsdmycbkxz = yxxXzxgccGsdmycbkxz;
	}

	@Column(name = "YXX_XZXGCC_GSDMYCGQXZ", length = 20)
	public String getYxxXzxgccGsdmycgqxz() {
		return this.yxxXzxgccGsdmycgqxz;
	}

	public void setYxxXzxgccGsdmycgqxz(String yxxXzxgccGsdmycgqxz) {
		this.yxxXzxgccGsdmycgqxz = yxxXzxgccGsdmycgqxz;
	}

	@Column(name = "YXX_XZXGCC_GDMZCBKXZ", length = 20)
	public String getYxxXzxgccGdmzcbkxz() {
		return this.yxxXzxgccGdmzcbkxz;
	}

	public void setYxxXzxgccGdmzcbkxz(String yxxXzxgccGdmzcbkxz) {
		this.yxxXzxgccGdmzcbkxz = yxxXzxgccGdmzcbkxz;
	}

	@Column(name = "YXX_XZXGCC_GDMZCGQXZ", length = 20)
	public String getYxxXzxgccGdmzcgqxz() {
		return this.yxxXzxgccGdmzcgqxz;
	}

	public void setYxxXzxgccGdmzcgqxz(String yxxXzxgccGdmzcgqxz) {
		this.yxxXzxgccGdmzcgqxz = yxxXzxgccGdmzcgqxz;
	}

	@Column(name = "YXX_XZXGCC_GDMYCBKXZ", length = 20)
	public String getYxxXzxgccGdmycbkxz() {
		return this.yxxXzxgccGdmycbkxz;
	}

	public void setYxxXzxgccGdmycbkxz(String yxxXzxgccGdmycbkxz) {
		this.yxxXzxgccGdmycbkxz = yxxXzxgccGdmycbkxz;
	}

	@Column(name = "YXX_XZXGCC_GDMYCGQXZ", length = 20)
	public String getYxxXzxgccGdmycgqxz() {
		return this.yxxXzxgccGdmycgqxz;
	}

	public void setYxxXzxgccGdmycgqxz(String yxxXzxgccGdmycgqxz) {
		this.yxxXzxgccGdmycgqxz = yxxXzxgccGdmycgqxz;
	}

}