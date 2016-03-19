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
 * YxxJldpltcdJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_JLDPLTCD_JCXXB", schema = "SCOTT")
public class YxxJldpltcdJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxJldpltcdJcbh;
	private Blxxb blxxb;
	private Timestamp yxxJldpltcdJcsj;
	private String yxxJldpltcdDnzdmzcxq;
	private String yxxJldpltcdDnzdmycxq;
	private String yxxJldpltcdDnqdmzcxq;
	private String yxxJldpltcdDnqdmycxq;
	private String yxxJldpltcdDnhdmzcxq;
	private String yxxJldpltcdDnhdmycxq;
	private String yxxJldpltcdJndmlwdzcxq;
	private String yxxJldpltcdJndmlwdycxq;
	private String yxxJldpltcdZdmzcxq;
	private String yxxJldpltcdZdmycxq;
	private String yxxJldpltcdCzxhpg;
	private String yxxJldpltcdCzxhpgzqt;

	// Constructors

	/** default constructor */
	public YxxJldpltcdJcxxb() {
	}

	/** full constructor */
	public YxxJldpltcdJcxxb(Blxxb blxxb, Timestamp yxxJldpltcdJcsj,
			String yxxJldpltcdDnzdmzcxq, String yxxJldpltcdDnzdmycxq,
			String yxxJldpltcdDnqdmzcxq, String yxxJldpltcdDnqdmycxq,
			String yxxJldpltcdDnhdmzcxq, String yxxJldpltcdDnhdmycxq,
			String yxxJldpltcdJndmlwdzcxq, String yxxJldpltcdJndmlwdycxq,
			String yxxJldpltcdZdmzcxq, String yxxJldpltcdZdmycxq,
			String yxxJldpltcdCzxhpg, String yxxJldpltcdCzxhpgzqt) {
		this.blxxb = blxxb;
		this.yxxJldpltcdJcsj = yxxJldpltcdJcsj;
		this.yxxJldpltcdDnzdmzcxq = yxxJldpltcdDnzdmzcxq;
		this.yxxJldpltcdDnzdmycxq = yxxJldpltcdDnzdmycxq;
		this.yxxJldpltcdDnqdmzcxq = yxxJldpltcdDnqdmzcxq;
		this.yxxJldpltcdDnqdmycxq = yxxJldpltcdDnqdmycxq;
		this.yxxJldpltcdDnhdmzcxq = yxxJldpltcdDnhdmzcxq;
		this.yxxJldpltcdDnhdmycxq = yxxJldpltcdDnhdmycxq;
		this.yxxJldpltcdJndmlwdzcxq = yxxJldpltcdJndmlwdzcxq;
		this.yxxJldpltcdJndmlwdycxq = yxxJldpltcdJndmlwdycxq;
		this.yxxJldpltcdZdmzcxq = yxxJldpltcdZdmzcxq;
		this.yxxJldpltcdZdmycxq = yxxJldpltcdZdmycxq;
		this.yxxJldpltcdCzxhpg = yxxJldpltcdCzxhpg;
		this.yxxJldpltcdCzxhpgzqt = yxxJldpltcdCzxhpgzqt;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_JLDPLTCD_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxJldpltcdJcbh() {
		return this.yxxJldpltcdJcbh;
	}

	public void setYxxJldpltcdJcbh(String yxxJldpltcdJcbh) {
		this.yxxJldpltcdJcbh = yxxJldpltcdJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_JLDPLTCD_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_JLDPLTCD_JCSJ", length = 7)
	public Timestamp getYxxJldpltcdJcsj() {
		return this.yxxJldpltcdJcsj;
	}

	public void setYxxJldpltcdJcsj(Timestamp yxxJldpltcdJcsj) {
		this.yxxJldpltcdJcsj = yxxJldpltcdJcsj;
	}

	@Column(name = "YXX_JLDPLTCD_DNZDMZCXQ", length = 10)
	public String getYxxJldpltcdDnzdmzcxq() {
		return this.yxxJldpltcdDnzdmzcxq;
	}

	public void setYxxJldpltcdDnzdmzcxq(String yxxJldpltcdDnzdmzcxq) {
		this.yxxJldpltcdDnzdmzcxq = yxxJldpltcdDnzdmzcxq;
	}

	@Column(name = "YXX_JLDPLTCD_DNZDMYCXQ", length = 10)
	public String getYxxJldpltcdDnzdmycxq() {
		return this.yxxJldpltcdDnzdmycxq;
	}

	public void setYxxJldpltcdDnzdmycxq(String yxxJldpltcdDnzdmycxq) {
		this.yxxJldpltcdDnzdmycxq = yxxJldpltcdDnzdmycxq;
	}

	@Column(name = "YXX_JLDPLTCD_DNQDMZCXQ", length = 10)
	public String getYxxJldpltcdDnqdmzcxq() {
		return this.yxxJldpltcdDnqdmzcxq;
	}

	public void setYxxJldpltcdDnqdmzcxq(String yxxJldpltcdDnqdmzcxq) {
		this.yxxJldpltcdDnqdmzcxq = yxxJldpltcdDnqdmzcxq;
	}

	@Column(name = "YXX_JLDPLTCD_DNQDMYCXQ", length = 10)
	public String getYxxJldpltcdDnqdmycxq() {
		return this.yxxJldpltcdDnqdmycxq;
	}

	public void setYxxJldpltcdDnqdmycxq(String yxxJldpltcdDnqdmycxq) {
		this.yxxJldpltcdDnqdmycxq = yxxJldpltcdDnqdmycxq;
	}

	@Column(name = "YXX_JLDPLTCD_DNHDMZCXQ", length = 10)
	public String getYxxJldpltcdDnhdmzcxq() {
		return this.yxxJldpltcdDnhdmzcxq;
	}

	public void setYxxJldpltcdDnhdmzcxq(String yxxJldpltcdDnhdmzcxq) {
		this.yxxJldpltcdDnhdmzcxq = yxxJldpltcdDnhdmzcxq;
	}

	@Column(name = "YXX_JLDPLTCD_DNHDMYCXQ", length = 10)
	public String getYxxJldpltcdDnhdmycxq() {
		return this.yxxJldpltcdDnhdmycxq;
	}

	public void setYxxJldpltcdDnhdmycxq(String yxxJldpltcdDnhdmycxq) {
		this.yxxJldpltcdDnhdmycxq = yxxJldpltcdDnhdmycxq;
	}

	@Column(name = "YXX_JLDPLTCD_JNDMLWDZCXQ", length = 10)
	public String getYxxJldpltcdJndmlwdzcxq() {
		return this.yxxJldpltcdJndmlwdzcxq;
	}

	public void setYxxJldpltcdJndmlwdzcxq(String yxxJldpltcdJndmlwdzcxq) {
		this.yxxJldpltcdJndmlwdzcxq = yxxJldpltcdJndmlwdzcxq;
	}

	@Column(name = "YXX_JLDPLTCD_JNDMLWDYCXQ", length = 10)
	public String getYxxJldpltcdJndmlwdycxq() {
		return this.yxxJldpltcdJndmlwdycxq;
	}

	public void setYxxJldpltcdJndmlwdycxq(String yxxJldpltcdJndmlwdycxq) {
		this.yxxJldpltcdJndmlwdycxq = yxxJldpltcdJndmlwdycxq;
	}

	@Column(name = "YXX_JLDPLTCD_ZDMZCXQ", length = 10)
	public String getYxxJldpltcdZdmzcxq() {
		return this.yxxJldpltcdZdmzcxq;
	}

	public void setYxxJldpltcdZdmzcxq(String yxxJldpltcdZdmzcxq) {
		this.yxxJldpltcdZdmzcxq = yxxJldpltcdZdmzcxq;
	}

	@Column(name = "YXX_JLDPLTCD_ZDMYCXQ", length = 10)
	public String getYxxJldpltcdZdmycxq() {
		return this.yxxJldpltcdZdmycxq;
	}

	public void setYxxJldpltcdZdmycxq(String yxxJldpltcdZdmycxq) {
		this.yxxJldpltcdZdmycxq = yxxJldpltcdZdmycxq;
	}

	@Column(name = "YXX_JLDPLTCD_CZXHPG", length = 100)
	public String getYxxJldpltcdCzxhpg() {
		return this.yxxJldpltcdCzxhpg;
	}

	public void setYxxJldpltcdCzxhpg(String yxxJldpltcdCzxhpg) {
		this.yxxJldpltcdCzxhpg = yxxJldpltcdCzxhpg;
	}

	@Column(name = "YXX_JLDPLTCD_CZXHPGZQT", length = 100)
	public String getYxxJldpltcdCzxhpgzqt() {
		return this.yxxJldpltcdCzxhpgzqt;
	}

	public void setYxxJldpltcdCzxhpgzqt(String yxxJldpltcdCzxhpgzqt) {
		this.yxxJldpltcdCzxhpgzqt = yxxJldpltcdCzxhpgzqt;
	}

}