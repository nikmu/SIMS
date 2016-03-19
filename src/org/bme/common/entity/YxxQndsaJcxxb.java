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
 * YxxQndsaJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_QNDSA_JCXXB", schema = "SCOTT")
public class YxxQndsaJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxQndsaJcbh;
	private Blxxb blxxb;
	private Timestamp yxxQndsaJcsj;
	private String yxxQndsaJzdmzcxq;
	private String yxxQndsaJzdmycxq;
	private String yxxQndsaJzdmfcczcxq;
	private String yxxQndsaJzdmfccycxq;
	private String yxxQndsaJndmlwdzcxq;
	private String yxxQndsaJndmlwdycxq;
	private String yxxQndsaJwdmzcxq;
	private String yxxQndsaJwdmycxq;
	private String yxxQndsaZdmlwdzcxq;
	private String yxxQndsaZdmlwdycxq;
	private String yxxQndsaSgxdmqsdzcxq;
	private String yxxQndsaSgxdmqsdycxq;
	private String yxxQndsaDnzdmzcxq;
	private String yxxQndsaDnzdmycxq;
	private String yxxQndsaDnqdmzcxq;
	private String yxxQndsaDnqdmycxq;
	private String yxxQndsaDnhdmzcxq;
	private String yxxQndsaDnhdmycxq;
	private String yxxQndsaJndmlndzcxq;
	private String yxxQndsaJndmlndycxq;
	private String yxxQndsaZdmzcxq;
	private String yxxQndsaZdmycxq;

	// Constructors

	/** default constructor */
	public YxxQndsaJcxxb() {
	}

	/** full constructor */
	public YxxQndsaJcxxb(Blxxb blxxb, Timestamp yxxQndsaJcsj,
			String yxxQndsaJzdmzcxq, String yxxQndsaJzdmycxq,
			String yxxQndsaJzdmfcczcxq, String yxxQndsaJzdmfccycxq,
			String yxxQndsaJndmlwdzcxq, String yxxQndsaJndmlwdycxq,
			String yxxQndsaJwdmzcxq, String yxxQndsaJwdmycxq,
			String yxxQndsaZdmlwdzcxq, String yxxQndsaZdmlwdycxq,
			String yxxQndsaSgxdmqsdzcxq, String yxxQndsaSgxdmqsdycxq,
			String yxxQndsaDnzdmzcxq, String yxxQndsaDnzdmycxq,
			String yxxQndsaDnqdmzcxq, String yxxQndsaDnqdmycxq,
			String yxxQndsaDnhdmzcxq, String yxxQndsaDnhdmycxq,
			String yxxQndsaJndmlndzcxq, String yxxQndsaJndmlndycxq,
			String yxxQndsaZdmzcxq, String yxxQndsaZdmycxq) {
		this.blxxb = blxxb;
		this.yxxQndsaJcsj = yxxQndsaJcsj;
		this.yxxQndsaJzdmzcxq = yxxQndsaJzdmzcxq;
		this.yxxQndsaJzdmycxq = yxxQndsaJzdmycxq;
		this.yxxQndsaJzdmfcczcxq = yxxQndsaJzdmfcczcxq;
		this.yxxQndsaJzdmfccycxq = yxxQndsaJzdmfccycxq;
		this.yxxQndsaJndmlwdzcxq = yxxQndsaJndmlwdzcxq;
		this.yxxQndsaJndmlwdycxq = yxxQndsaJndmlwdycxq;
		this.yxxQndsaJwdmzcxq = yxxQndsaJwdmzcxq;
		this.yxxQndsaJwdmycxq = yxxQndsaJwdmycxq;
		this.yxxQndsaZdmlwdzcxq = yxxQndsaZdmlwdzcxq;
		this.yxxQndsaZdmlwdycxq = yxxQndsaZdmlwdycxq;
		this.yxxQndsaSgxdmqsdzcxq = yxxQndsaSgxdmqsdzcxq;
		this.yxxQndsaSgxdmqsdycxq = yxxQndsaSgxdmqsdycxq;
		this.yxxQndsaDnzdmzcxq = yxxQndsaDnzdmzcxq;
		this.yxxQndsaDnzdmycxq = yxxQndsaDnzdmycxq;
		this.yxxQndsaDnqdmzcxq = yxxQndsaDnqdmzcxq;
		this.yxxQndsaDnqdmycxq = yxxQndsaDnqdmycxq;
		this.yxxQndsaDnhdmzcxq = yxxQndsaDnhdmzcxq;
		this.yxxQndsaDnhdmycxq = yxxQndsaDnhdmycxq;
		this.yxxQndsaJndmlndzcxq = yxxQndsaJndmlndzcxq;
		this.yxxQndsaJndmlndycxq = yxxQndsaJndmlndycxq;
		this.yxxQndsaZdmzcxq = yxxQndsaZdmzcxq;
		this.yxxQndsaZdmycxq = yxxQndsaZdmycxq;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_QNDSA_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxQndsaJcbh() {
		return this.yxxQndsaJcbh;
	}

	public void setYxxQndsaJcbh(String yxxQndsaJcbh) {
		this.yxxQndsaJcbh = yxxQndsaJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_QNDSA_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_QNDSA_JCSJ", length = 7)
	public Timestamp getYxxQndsaJcsj() {
		return this.yxxQndsaJcsj;
	}

	public void setYxxQndsaJcsj(Timestamp yxxQndsaJcsj) {
		this.yxxQndsaJcsj = yxxQndsaJcsj;
	}

	@Column(name = "YXX_QNDSA_JZDMZCXQ", length = 20)
	public String getYxxQndsaJzdmzcxq() {
		return this.yxxQndsaJzdmzcxq;
	}

	public void setYxxQndsaJzdmzcxq(String yxxQndsaJzdmzcxq) {
		this.yxxQndsaJzdmzcxq = yxxQndsaJzdmzcxq;
	}

	@Column(name = "YXX_QNDSA_JZDMYCXQ", length = 20)
	public String getYxxQndsaJzdmycxq() {
		return this.yxxQndsaJzdmycxq;
	}

	public void setYxxQndsaJzdmycxq(String yxxQndsaJzdmycxq) {
		this.yxxQndsaJzdmycxq = yxxQndsaJzdmycxq;
	}

	@Column(name = "YXX_QNDSA_JZDMFCCZCXQ", length = 20)
	public String getYxxQndsaJzdmfcczcxq() {
		return this.yxxQndsaJzdmfcczcxq;
	}

	public void setYxxQndsaJzdmfcczcxq(String yxxQndsaJzdmfcczcxq) {
		this.yxxQndsaJzdmfcczcxq = yxxQndsaJzdmfcczcxq;
	}

	@Column(name = "YXX_QNDSA_JZDMFCCYCXQ", length = 20)
	public String getYxxQndsaJzdmfccycxq() {
		return this.yxxQndsaJzdmfccycxq;
	}

	public void setYxxQndsaJzdmfccycxq(String yxxQndsaJzdmfccycxq) {
		this.yxxQndsaJzdmfccycxq = yxxQndsaJzdmfccycxq;
	}

	@Column(name = "YXX_QNDSA_JNDMLWDZCXQ", length = 20)
	public String getYxxQndsaJndmlwdzcxq() {
		return this.yxxQndsaJndmlwdzcxq;
	}

	public void setYxxQndsaJndmlwdzcxq(String yxxQndsaJndmlwdzcxq) {
		this.yxxQndsaJndmlwdzcxq = yxxQndsaJndmlwdzcxq;
	}

	@Column(name = "YXX_QNDSA_JNDMLWDYCXQ", length = 20)
	public String getYxxQndsaJndmlwdycxq() {
		return this.yxxQndsaJndmlwdycxq;
	}

	public void setYxxQndsaJndmlwdycxq(String yxxQndsaJndmlwdycxq) {
		this.yxxQndsaJndmlwdycxq = yxxQndsaJndmlwdycxq;
	}

	@Column(name = "YXX_QNDSA_JWDMZCXQ", length = 20)
	public String getYxxQndsaJwdmzcxq() {
		return this.yxxQndsaJwdmzcxq;
	}

	public void setYxxQndsaJwdmzcxq(String yxxQndsaJwdmzcxq) {
		this.yxxQndsaJwdmzcxq = yxxQndsaJwdmzcxq;
	}

	@Column(name = "YXX_QNDSA_JWDMYCXQ", length = 20)
	public String getYxxQndsaJwdmycxq() {
		return this.yxxQndsaJwdmycxq;
	}

	public void setYxxQndsaJwdmycxq(String yxxQndsaJwdmycxq) {
		this.yxxQndsaJwdmycxq = yxxQndsaJwdmycxq;
	}

	@Column(name = "YXX_QNDSA_ZDMLWDZCXQ", length = 20)
	public String getYxxQndsaZdmlwdzcxq() {
		return this.yxxQndsaZdmlwdzcxq;
	}

	public void setYxxQndsaZdmlwdzcxq(String yxxQndsaZdmlwdzcxq) {
		this.yxxQndsaZdmlwdzcxq = yxxQndsaZdmlwdzcxq;
	}

	@Column(name = "YXX_QNDSA_ZDMLWDYCXQ", length = 20)
	public String getYxxQndsaZdmlwdycxq() {
		return this.yxxQndsaZdmlwdycxq;
	}

	public void setYxxQndsaZdmlwdycxq(String yxxQndsaZdmlwdycxq) {
		this.yxxQndsaZdmlwdycxq = yxxQndsaZdmlwdycxq;
	}

	@Column(name = "YXX_QNDSA_SGXDMQSDZCXQ", length = 20)
	public String getYxxQndsaSgxdmqsdzcxq() {
		return this.yxxQndsaSgxdmqsdzcxq;
	}

	public void setYxxQndsaSgxdmqsdzcxq(String yxxQndsaSgxdmqsdzcxq) {
		this.yxxQndsaSgxdmqsdzcxq = yxxQndsaSgxdmqsdzcxq;
	}

	@Column(name = "YXX_QNDSA_SGXDMQSDYCXQ", length = 20)
	public String getYxxQndsaSgxdmqsdycxq() {
		return this.yxxQndsaSgxdmqsdycxq;
	}

	public void setYxxQndsaSgxdmqsdycxq(String yxxQndsaSgxdmqsdycxq) {
		this.yxxQndsaSgxdmqsdycxq = yxxQndsaSgxdmqsdycxq;
	}

	@Column(name = "YXX_QNDSA_DNZDMZCXQ", length = 20)
	public String getYxxQndsaDnzdmzcxq() {
		return this.yxxQndsaDnzdmzcxq;
	}

	public void setYxxQndsaDnzdmzcxq(String yxxQndsaDnzdmzcxq) {
		this.yxxQndsaDnzdmzcxq = yxxQndsaDnzdmzcxq;
	}

	@Column(name = "YXX_QNDSA_DNZDMYCXQ", length = 20)
	public String getYxxQndsaDnzdmycxq() {
		return this.yxxQndsaDnzdmycxq;
	}

	public void setYxxQndsaDnzdmycxq(String yxxQndsaDnzdmycxq) {
		this.yxxQndsaDnzdmycxq = yxxQndsaDnzdmycxq;
	}

	@Column(name = "YXX_QNDSA_DNQDMZCXQ", length = 20)
	public String getYxxQndsaDnqdmzcxq() {
		return this.yxxQndsaDnqdmzcxq;
	}

	public void setYxxQndsaDnqdmzcxq(String yxxQndsaDnqdmzcxq) {
		this.yxxQndsaDnqdmzcxq = yxxQndsaDnqdmzcxq;
	}

	@Column(name = "YXX_QNDSA_DNQDMYCXQ", length = 20)
	public String getYxxQndsaDnqdmycxq() {
		return this.yxxQndsaDnqdmycxq;
	}

	public void setYxxQndsaDnqdmycxq(String yxxQndsaDnqdmycxq) {
		this.yxxQndsaDnqdmycxq = yxxQndsaDnqdmycxq;
	}

	@Column(name = "YXX_QNDSA_DNHDMZCXQ", length = 20)
	public String getYxxQndsaDnhdmzcxq() {
		return this.yxxQndsaDnhdmzcxq;
	}

	public void setYxxQndsaDnhdmzcxq(String yxxQndsaDnhdmzcxq) {
		this.yxxQndsaDnhdmzcxq = yxxQndsaDnhdmzcxq;
	}

	@Column(name = "YXX_QNDSA_DNHDMYCXQ", length = 20)
	public String getYxxQndsaDnhdmycxq() {
		return this.yxxQndsaDnhdmycxq;
	}

	public void setYxxQndsaDnhdmycxq(String yxxQndsaDnhdmycxq) {
		this.yxxQndsaDnhdmycxq = yxxQndsaDnhdmycxq;
	}

	@Column(name = "YXX_QNDSA_JNDMLNDZCXQ", length = 20)
	public String getYxxQndsaJndmlndzcxq() {
		return this.yxxQndsaJndmlndzcxq;
	}

	public void setYxxQndsaJndmlndzcxq(String yxxQndsaJndmlndzcxq) {
		this.yxxQndsaJndmlndzcxq = yxxQndsaJndmlndzcxq;
	}

	@Column(name = "YXX_QNDSA_JNDMLNDYCXQ", length = 20)
	public String getYxxQndsaJndmlndycxq() {
		return this.yxxQndsaJndmlndycxq;
	}

	public void setYxxQndsaJndmlndycxq(String yxxQndsaJndmlndycxq) {
		this.yxxQndsaJndmlndycxq = yxxQndsaJndmlndycxq;
	}

	@Column(name = "YXX_QNDSA_ZDMZCXQ", length = 20)
	public String getYxxQndsaZdmzcxq() {
		return this.yxxQndsaZdmzcxq;
	}

	public void setYxxQndsaZdmzcxq(String yxxQndsaZdmzcxq) {
		this.yxxQndsaZdmzcxq = yxxQndsaZdmzcxq;
	}

	@Column(name = "YXX_QNDSA_ZDMYCXQ", length = 20)
	public String getYxxQndsaZdmycxq() {
		return this.yxxQndsaZdmycxq;
	}

	public void setYxxQndsaZdmycxq(String yxxQndsaZdmycxq) {
		this.yxxQndsaZdmycxq = yxxQndsaZdmycxq;
	}

}