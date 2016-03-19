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
 * YxxLnxgmraJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_LNXGMRA_JCXXB", schema = "SCOTT")
public class YxxLnxgmraJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxLnxgmraJcbh;
	private Blxxb blxxb;
	private Timestamp yxxLnxgmraJcsj;
	private String yxxLnxgmraDnzdmzcxq;
	private String yxxLnxgmraDnzdmycxq;
	private String yxxLnxgmraDnqdmzcxq;
	private String yxxLnxgmraDnqdmycxq;
	private String yxxLnxgmraDnhdmzcxq;
	private String yxxLnxgmraDnhdmycxq;
	private String yxxLnxgmraJndmlndzcxq;
	private String yxxLnxgmraJndmlndycxq;
	private String yxxLnxgmraZdmzcxq;
	private String yxxLnxgmraZdmycxq;
	private String yxxLnxgmraJddm;
	private String yxxLnxgmraCzxhpg;
	private String yxxLnxgmraCzxhpgzqt;

	// Constructors

	/** default constructor */
	public YxxLnxgmraJcxxb() {
	}

	/** full constructor */
	public YxxLnxgmraJcxxb(Blxxb blxxb, Timestamp yxxLnxgmraJcsj,
			String yxxLnxgmraDnzdmzcxq, String yxxLnxgmraDnzdmycxq,
			String yxxLnxgmraDnqdmzcxq, String yxxLnxgmraDnqdmycxq,
			String yxxLnxgmraDnhdmzcxq, String yxxLnxgmraDnhdmycxq,
			String yxxLnxgmraJndmlndzcxq, String yxxLnxgmraJndmlndycxq,
			String yxxLnxgmraZdmzcxq, String yxxLnxgmraZdmycxq,
			String yxxLnxgmraJddm, String yxxLnxgmraCzxhpg,
			String yxxLnxgmraCzxhpgzqt) {
		this.blxxb = blxxb;
		this.yxxLnxgmraJcsj = yxxLnxgmraJcsj;
		this.yxxLnxgmraDnzdmzcxq = yxxLnxgmraDnzdmzcxq;
		this.yxxLnxgmraDnzdmycxq = yxxLnxgmraDnzdmycxq;
		this.yxxLnxgmraDnqdmzcxq = yxxLnxgmraDnqdmzcxq;
		this.yxxLnxgmraDnqdmycxq = yxxLnxgmraDnqdmycxq;
		this.yxxLnxgmraDnhdmzcxq = yxxLnxgmraDnhdmzcxq;
		this.yxxLnxgmraDnhdmycxq = yxxLnxgmraDnhdmycxq;
		this.yxxLnxgmraJndmlndzcxq = yxxLnxgmraJndmlndzcxq;
		this.yxxLnxgmraJndmlndycxq = yxxLnxgmraJndmlndycxq;
		this.yxxLnxgmraZdmzcxq = yxxLnxgmraZdmzcxq;
		this.yxxLnxgmraZdmycxq = yxxLnxgmraZdmycxq;
		this.yxxLnxgmraJddm = yxxLnxgmraJddm;
		this.yxxLnxgmraCzxhpg = yxxLnxgmraCzxhpg;
		this.yxxLnxgmraCzxhpgzqt = yxxLnxgmraCzxhpgzqt;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_LNXGMRA_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxLnxgmraJcbh() {
		return this.yxxLnxgmraJcbh;
	}

	public void setYxxLnxgmraJcbh(String yxxLnxgmraJcbh) {
		this.yxxLnxgmraJcbh = yxxLnxgmraJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_LNXGMRA_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_LNXGMRA_JCSJ", length = 7)
	public Timestamp getYxxLnxgmraJcsj() {
		return this.yxxLnxgmraJcsj;
	}

	public void setYxxLnxgmraJcsj(Timestamp yxxLnxgmraJcsj) {
		this.yxxLnxgmraJcsj = yxxLnxgmraJcsj;
	}

	@Column(name = "YXX_LNXGMRA_DNZDMZCXQ", length = 20)
	public String getYxxLnxgmraDnzdmzcxq() {
		return this.yxxLnxgmraDnzdmzcxq;
	}

	public void setYxxLnxgmraDnzdmzcxq(String yxxLnxgmraDnzdmzcxq) {
		this.yxxLnxgmraDnzdmzcxq = yxxLnxgmraDnzdmzcxq;
	}

	@Column(name = "YXX_LNXGMRA_DNZDMYCXQ", length = 20)
	public String getYxxLnxgmraDnzdmycxq() {
		return this.yxxLnxgmraDnzdmycxq;
	}

	public void setYxxLnxgmraDnzdmycxq(String yxxLnxgmraDnzdmycxq) {
		this.yxxLnxgmraDnzdmycxq = yxxLnxgmraDnzdmycxq;
	}

	@Column(name = "YXX_LNXGMRA_DNQDMZCXQ", length = 20)
	public String getYxxLnxgmraDnqdmzcxq() {
		return this.yxxLnxgmraDnqdmzcxq;
	}

	public void setYxxLnxgmraDnqdmzcxq(String yxxLnxgmraDnqdmzcxq) {
		this.yxxLnxgmraDnqdmzcxq = yxxLnxgmraDnqdmzcxq;
	}

	@Column(name = "YXX_LNXGMRA_DNQDMYCXQ", length = 20)
	public String getYxxLnxgmraDnqdmycxq() {
		return this.yxxLnxgmraDnqdmycxq;
	}

	public void setYxxLnxgmraDnqdmycxq(String yxxLnxgmraDnqdmycxq) {
		this.yxxLnxgmraDnqdmycxq = yxxLnxgmraDnqdmycxq;
	}

	@Column(name = "YXX_LNXGMRA_DNHDMZCXQ", length = 20)
	public String getYxxLnxgmraDnhdmzcxq() {
		return this.yxxLnxgmraDnhdmzcxq;
	}

	public void setYxxLnxgmraDnhdmzcxq(String yxxLnxgmraDnhdmzcxq) {
		this.yxxLnxgmraDnhdmzcxq = yxxLnxgmraDnhdmzcxq;
	}

	@Column(name = "YXX_LNXGMRA_DNHDMYCXQ", length = 20)
	public String getYxxLnxgmraDnhdmycxq() {
		return this.yxxLnxgmraDnhdmycxq;
	}

	public void setYxxLnxgmraDnhdmycxq(String yxxLnxgmraDnhdmycxq) {
		this.yxxLnxgmraDnhdmycxq = yxxLnxgmraDnhdmycxq;
	}

	@Column(name = "YXX_LNXGMRA_JNDMLNDZCXQ", length = 20)
	public String getYxxLnxgmraJndmlndzcxq() {
		return this.yxxLnxgmraJndmlndzcxq;
	}

	public void setYxxLnxgmraJndmlndzcxq(String yxxLnxgmraJndmlndzcxq) {
		this.yxxLnxgmraJndmlndzcxq = yxxLnxgmraJndmlndzcxq;
	}

	@Column(name = "YXX_LNXGMRA_JNDMLNDYCXQ", length = 20)
	public String getYxxLnxgmraJndmlndycxq() {
		return this.yxxLnxgmraJndmlndycxq;
	}

	public void setYxxLnxgmraJndmlndycxq(String yxxLnxgmraJndmlndycxq) {
		this.yxxLnxgmraJndmlndycxq = yxxLnxgmraJndmlndycxq;
	}

	@Column(name = "YXX_LNXGMRA_ZDMZCXQ", length = 20)
	public String getYxxLnxgmraZdmzcxq() {
		return this.yxxLnxgmraZdmzcxq;
	}

	public void setYxxLnxgmraZdmzcxq(String yxxLnxgmraZdmzcxq) {
		this.yxxLnxgmraZdmzcxq = yxxLnxgmraZdmzcxq;
	}

	@Column(name = "YXX_LNXGMRA_ZDMYCXQ", length = 20)
	public String getYxxLnxgmraZdmycxq() {
		return this.yxxLnxgmraZdmycxq;
	}

	public void setYxxLnxgmraZdmycxq(String yxxLnxgmraZdmycxq) {
		this.yxxLnxgmraZdmycxq = yxxLnxgmraZdmycxq;
	}

	@Column(name = "YXX_LNXGMRA_JDDM", length = 20)
	public String getYxxLnxgmraJddm() {
		return this.yxxLnxgmraJddm;
	}

	public void setYxxLnxgmraJddm(String yxxLnxgmraJddm) {
		this.yxxLnxgmraJddm = yxxLnxgmraJddm;
	}

	@Column(name = "YXX_LNXGMRA_CZXHPG", length = 100)
	public String getYxxLnxgmraCzxhpg() {
		return this.yxxLnxgmraCzxhpg;
	}

	public void setYxxLnxgmraCzxhpg(String yxxLnxgmraCzxhpg) {
		this.yxxLnxgmraCzxhpg = yxxLnxgmraCzxhpg;
	}

	@Column(name = "YXX_LNXGMRA_CZXHPGZQT", length = 100)
	public String getYxxLnxgmraCzxhpgzqt() {
		return this.yxxLnxgmraCzxhpgzqt;
	}

	public void setYxxLnxgmraCzxhpgzqt(String yxxLnxgmraCzxhpgzqt) {
		this.yxxLnxgmraCzxhpgzqt = yxxLnxgmraCzxhpgzqt;
	}

}