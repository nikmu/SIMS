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
 * YxxLnxgctaJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_LNXGCTA_JCXXB", schema = "SCOTT")
public class YxxLnxgctaJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxLnxgctaJcbh;
	private Blxxb blxxb;
	private Timestamp yxxLnxgctaJcsj;
	private String yxxLnxgctaDnzdmzcxq;
	private String yxxLnxgctaDnzdmycxq;
	private String yxxLnxgctaDnqdmzcxq;
	private String yxxLnxgctaDnqdmycxq;
	private String yxxLnxgctaDnhdmzcxq;
	private String yxxLnxgctaDnhdmycxq;
	private String yxxLnxgctaJndmlndzcxq;
	private String yxxLnxgctaJndmlndycxq;
	private String yxxLnxgctaZdmzcxq;
	private String yxxLnxgctaZdmycxq;
	private String yxxLnxgctaJddm;
	private String yxxLnxgctaCzxhpg;
	private String yxxLnxgctaCzxhpgzqt;

	// Constructors

	/** default constructor */
	public YxxLnxgctaJcxxb() {
	}

	/** full constructor */
	public YxxLnxgctaJcxxb(Blxxb blxxb, Timestamp yxxLnxgctaJcsj,
			String yxxLnxgctaDnzdmzcxq, String yxxLnxgctaDnzdmycxq,
			String yxxLnxgctaDnqdmzcxq, String yxxLnxgctaDnqdmycxq,
			String yxxLnxgctaDnhdmzcxq, String yxxLnxgctaDnhdmycxq,
			String yxxLnxgctaJndmlndzcxq, String yxxLnxgctaJndmlndycxq,
			String yxxLnxgctaZdmzcxq, String yxxLnxgctaZdmycxq,
			String yxxLnxgctaJddm, String yxxLnxgctaCzxhpg,
			String yxxLnxgctaCzxhpgzqt) {
		this.blxxb = blxxb;
		this.yxxLnxgctaJcsj = yxxLnxgctaJcsj;
		this.yxxLnxgctaDnzdmzcxq = yxxLnxgctaDnzdmzcxq;
		this.yxxLnxgctaDnzdmycxq = yxxLnxgctaDnzdmycxq;
		this.yxxLnxgctaDnqdmzcxq = yxxLnxgctaDnqdmzcxq;
		this.yxxLnxgctaDnqdmycxq = yxxLnxgctaDnqdmycxq;
		this.yxxLnxgctaDnhdmzcxq = yxxLnxgctaDnhdmzcxq;
		this.yxxLnxgctaDnhdmycxq = yxxLnxgctaDnhdmycxq;
		this.yxxLnxgctaJndmlndzcxq = yxxLnxgctaJndmlndzcxq;
		this.yxxLnxgctaJndmlndycxq = yxxLnxgctaJndmlndycxq;
		this.yxxLnxgctaZdmzcxq = yxxLnxgctaZdmzcxq;
		this.yxxLnxgctaZdmycxq = yxxLnxgctaZdmycxq;
		this.yxxLnxgctaJddm = yxxLnxgctaJddm;
		this.yxxLnxgctaCzxhpg = yxxLnxgctaCzxhpg;
		this.yxxLnxgctaCzxhpgzqt = yxxLnxgctaCzxhpgzqt;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_LNXGCTA_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxLnxgctaJcbh() {
		return this.yxxLnxgctaJcbh;
	}

	public void setYxxLnxgctaJcbh(String yxxLnxgctaJcbh) {
		this.yxxLnxgctaJcbh = yxxLnxgctaJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_LNXGCTA_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_LNXGCTA_JCSJ", length = 7)
	public Timestamp getYxxLnxgctaJcsj() {
		return this.yxxLnxgctaJcsj;
	}

	public void setYxxLnxgctaJcsj(Timestamp yxxLnxgctaJcsj) {
		this.yxxLnxgctaJcsj = yxxLnxgctaJcsj;
	}

	@Column(name = "YXX_LNXGCTA_DNZDMZCXQ", length = 20)
	public String getYxxLnxgctaDnzdmzcxq() {
		return this.yxxLnxgctaDnzdmzcxq;
	}

	public void setYxxLnxgctaDnzdmzcxq(String yxxLnxgctaDnzdmzcxq) {
		this.yxxLnxgctaDnzdmzcxq = yxxLnxgctaDnzdmzcxq;
	}

	@Column(name = "YXX_LNXGCTA_DNZDMYCXQ", length = 20)
	public String getYxxLnxgctaDnzdmycxq() {
		return this.yxxLnxgctaDnzdmycxq;
	}

	public void setYxxLnxgctaDnzdmycxq(String yxxLnxgctaDnzdmycxq) {
		this.yxxLnxgctaDnzdmycxq = yxxLnxgctaDnzdmycxq;
	}

	@Column(name = "YXX_LNXGCTA_DNQDMZCXQ", length = 20)
	public String getYxxLnxgctaDnqdmzcxq() {
		return this.yxxLnxgctaDnqdmzcxq;
	}

	public void setYxxLnxgctaDnqdmzcxq(String yxxLnxgctaDnqdmzcxq) {
		this.yxxLnxgctaDnqdmzcxq = yxxLnxgctaDnqdmzcxq;
	}

	@Column(name = "YXX_LNXGCTA_DNQDMYCXQ", length = 20)
	public String getYxxLnxgctaDnqdmycxq() {
		return this.yxxLnxgctaDnqdmycxq;
	}

	public void setYxxLnxgctaDnqdmycxq(String yxxLnxgctaDnqdmycxq) {
		this.yxxLnxgctaDnqdmycxq = yxxLnxgctaDnqdmycxq;
	}

	@Column(name = "YXX_LNXGCTA_DNHDMZCXQ", length = 20)
	public String getYxxLnxgctaDnhdmzcxq() {
		return this.yxxLnxgctaDnhdmzcxq;
	}

	public void setYxxLnxgctaDnhdmzcxq(String yxxLnxgctaDnhdmzcxq) {
		this.yxxLnxgctaDnhdmzcxq = yxxLnxgctaDnhdmzcxq;
	}

	@Column(name = "YXX_LNXGCTA_DNHDMYCXQ", length = 20)
	public String getYxxLnxgctaDnhdmycxq() {
		return this.yxxLnxgctaDnhdmycxq;
	}

	public void setYxxLnxgctaDnhdmycxq(String yxxLnxgctaDnhdmycxq) {
		this.yxxLnxgctaDnhdmycxq = yxxLnxgctaDnhdmycxq;
	}

	@Column(name = "YXX_LNXGCTA_JNDMLNDZCXQ", length = 20)
	public String getYxxLnxgctaJndmlndzcxq() {
		return this.yxxLnxgctaJndmlndzcxq;
	}

	public void setYxxLnxgctaJndmlndzcxq(String yxxLnxgctaJndmlndzcxq) {
		this.yxxLnxgctaJndmlndzcxq = yxxLnxgctaJndmlndzcxq;
	}

	@Column(name = "YXX_LNXGCTA_JNDMLNDYCXQ", length = 20)
	public String getYxxLnxgctaJndmlndycxq() {
		return this.yxxLnxgctaJndmlndycxq;
	}

	public void setYxxLnxgctaJndmlndycxq(String yxxLnxgctaJndmlndycxq) {
		this.yxxLnxgctaJndmlndycxq = yxxLnxgctaJndmlndycxq;
	}

	@Column(name = "YXX_LNXGCTA_ZDMZCXQ", length = 20)
	public String getYxxLnxgctaZdmzcxq() {
		return this.yxxLnxgctaZdmzcxq;
	}

	public void setYxxLnxgctaZdmzcxq(String yxxLnxgctaZdmzcxq) {
		this.yxxLnxgctaZdmzcxq = yxxLnxgctaZdmzcxq;
	}

	@Column(name = "YXX_LNXGCTA_ZDMYCXQ", length = 20)
	public String getYxxLnxgctaZdmycxq() {
		return this.yxxLnxgctaZdmycxq;
	}

	public void setYxxLnxgctaZdmycxq(String yxxLnxgctaZdmycxq) {
		this.yxxLnxgctaZdmycxq = yxxLnxgctaZdmycxq;
	}

	@Column(name = "YXX_LNXGCTA_JDDM", length = 20)
	public String getYxxLnxgctaJddm() {
		return this.yxxLnxgctaJddm;
	}

	public void setYxxLnxgctaJddm(String yxxLnxgctaJddm) {
		this.yxxLnxgctaJddm = yxxLnxgctaJddm;
	}

	@Column(name = "YXX_LNXGCTA_CZXHPG", length = 100)
	public String getYxxLnxgctaCzxhpg() {
		return this.yxxLnxgctaCzxhpg;
	}

	public void setYxxLnxgctaCzxhpg(String yxxLnxgctaCzxhpg) {
		this.yxxLnxgctaCzxhpg = yxxLnxgctaCzxhpg;
	}

	@Column(name = "YXX_LNXGCTA_CZXHPGZQT", length = 100)
	public String getYxxLnxgctaCzxhpgzqt() {
		return this.yxxLnxgctaCzxhpgzqt;
	}

	public void setYxxLnxgctaCzxhpgzqt(String yxxLnxgctaCzxhpgzqt) {
		this.yxxLnxgctaCzxhpgzqt = yxxLnxgctaCzxhpgzqt;
	}

}