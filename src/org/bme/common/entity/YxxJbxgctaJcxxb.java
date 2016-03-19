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
 * YxxJbxgctaJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_JBXGCTA_JCXXB", schema = "SCOTT")
public class YxxJbxgctaJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxJbxgctaJcbh;
	private Blxxb blxxb;
	private Timestamp yxxJbxgctaJcsj;
	private String yxxJbxgctaJzdmzcxq;
	private String yxxJbxgctaJzdmycxq;
	private String yxxJbxgctaJzdmfcczcxq;
	private String yxxJbxgctaJzdmfccycxq;
	private String yxxJbxgctaJndmlwdzcxq;
	private String yxxJbxgctaJndmlwdycxq;
	private String yxxJbxgctaJwdmzcxq;
	private String yxxJbxgctaJwdmycxq;
	private String yxxJbxgctaZdmlwdzcxq;
	private String yxxJbxgctaZdmlwdycxq;
	private String yxxJbxgctaSgxdmqsdzcxq;
	private String yxxJbxgctaSgxdmqsdycxq;

	// Constructors

	/** default constructor */
	public YxxJbxgctaJcxxb() {
	}

	/** full constructor */
	public YxxJbxgctaJcxxb(Blxxb blxxb, Timestamp yxxJbxgctaJcsj,
			String yxxJbxgctaJzdmzcxq, String yxxJbxgctaJzdmycxq,
			String yxxJbxgctaJzdmfcczcxq, String yxxJbxgctaJzdmfccycxq,
			String yxxJbxgctaJndmlwdzcxq, String yxxJbxgctaJndmlwdycxq,
			String yxxJbxgctaJwdmzcxq, String yxxJbxgctaJwdmycxq,
			String yxxJbxgctaZdmlwdzcxq, String yxxJbxgctaZdmlwdycxq,
			String yxxJbxgctaSgxdmqsdzcxq, String yxxJbxgctaSgxdmqsdycxq) {
		this.blxxb = blxxb;
		this.yxxJbxgctaJcsj = yxxJbxgctaJcsj;
		this.yxxJbxgctaJzdmzcxq = yxxJbxgctaJzdmzcxq;
		this.yxxJbxgctaJzdmycxq = yxxJbxgctaJzdmycxq;
		this.yxxJbxgctaJzdmfcczcxq = yxxJbxgctaJzdmfcczcxq;
		this.yxxJbxgctaJzdmfccycxq = yxxJbxgctaJzdmfccycxq;
		this.yxxJbxgctaJndmlwdzcxq = yxxJbxgctaJndmlwdzcxq;
		this.yxxJbxgctaJndmlwdycxq = yxxJbxgctaJndmlwdycxq;
		this.yxxJbxgctaJwdmzcxq = yxxJbxgctaJwdmzcxq;
		this.yxxJbxgctaJwdmycxq = yxxJbxgctaJwdmycxq;
		this.yxxJbxgctaZdmlwdzcxq = yxxJbxgctaZdmlwdzcxq;
		this.yxxJbxgctaZdmlwdycxq = yxxJbxgctaZdmlwdycxq;
		this.yxxJbxgctaSgxdmqsdzcxq = yxxJbxgctaSgxdmqsdzcxq;
		this.yxxJbxgctaSgxdmqsdycxq = yxxJbxgctaSgxdmqsdycxq;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_JBXGCTA_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxJbxgctaJcbh() {
		return this.yxxJbxgctaJcbh;
	}

	public void setYxxJbxgctaJcbh(String yxxJbxgctaJcbh) {
		this.yxxJbxgctaJcbh = yxxJbxgctaJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_JBXGCTA_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_JBXGCTA_JCSJ", length = 7)
	public Timestamp getYxxJbxgctaJcsj() {
		return this.yxxJbxgctaJcsj;
	}

	public void setYxxJbxgctaJcsj(Timestamp yxxJbxgctaJcsj) {
		this.yxxJbxgctaJcsj = yxxJbxgctaJcsj;
	}

	@Column(name = "YXX_JBXGCTA_JZDMZCXQ", length = 20)
	public String getYxxJbxgctaJzdmzcxq() {
		return this.yxxJbxgctaJzdmzcxq;
	}

	public void setYxxJbxgctaJzdmzcxq(String yxxJbxgctaJzdmzcxq) {
		this.yxxJbxgctaJzdmzcxq = yxxJbxgctaJzdmzcxq;
	}

	@Column(name = "YXX_JBXGCTA_JZDMYCXQ", length = 20)
	public String getYxxJbxgctaJzdmycxq() {
		return this.yxxJbxgctaJzdmycxq;
	}

	public void setYxxJbxgctaJzdmycxq(String yxxJbxgctaJzdmycxq) {
		this.yxxJbxgctaJzdmycxq = yxxJbxgctaJzdmycxq;
	}

	@Column(name = "YXX_JBXGCTA_JZDMFCCZCXQ", length = 20)
	public String getYxxJbxgctaJzdmfcczcxq() {
		return this.yxxJbxgctaJzdmfcczcxq;
	}

	public void setYxxJbxgctaJzdmfcczcxq(String yxxJbxgctaJzdmfcczcxq) {
		this.yxxJbxgctaJzdmfcczcxq = yxxJbxgctaJzdmfcczcxq;
	}

	@Column(name = "YXX_JBXGCTA_JZDMFCCYCXQ", length = 20)
	public String getYxxJbxgctaJzdmfccycxq() {
		return this.yxxJbxgctaJzdmfccycxq;
	}

	public void setYxxJbxgctaJzdmfccycxq(String yxxJbxgctaJzdmfccycxq) {
		this.yxxJbxgctaJzdmfccycxq = yxxJbxgctaJzdmfccycxq;
	}

	@Column(name = "YXX_JBXGCTA_JNDMLWDZCXQ", length = 20)
	public String getYxxJbxgctaJndmlwdzcxq() {
		return this.yxxJbxgctaJndmlwdzcxq;
	}

	public void setYxxJbxgctaJndmlwdzcxq(String yxxJbxgctaJndmlwdzcxq) {
		this.yxxJbxgctaJndmlwdzcxq = yxxJbxgctaJndmlwdzcxq;
	}

	@Column(name = "YXX_JBXGCTA_JNDMLWDYCXQ", length = 20)
	public String getYxxJbxgctaJndmlwdycxq() {
		return this.yxxJbxgctaJndmlwdycxq;
	}

	public void setYxxJbxgctaJndmlwdycxq(String yxxJbxgctaJndmlwdycxq) {
		this.yxxJbxgctaJndmlwdycxq = yxxJbxgctaJndmlwdycxq;
	}

	@Column(name = "YXX_JBXGCTA_JWDMZCXQ", length = 20)
	public String getYxxJbxgctaJwdmzcxq() {
		return this.yxxJbxgctaJwdmzcxq;
	}

	public void setYxxJbxgctaJwdmzcxq(String yxxJbxgctaJwdmzcxq) {
		this.yxxJbxgctaJwdmzcxq = yxxJbxgctaJwdmzcxq;
	}

	@Column(name = "YXX_JBXGCTA_JWDMYCXQ", length = 20)
	public String getYxxJbxgctaJwdmycxq() {
		return this.yxxJbxgctaJwdmycxq;
	}

	public void setYxxJbxgctaJwdmycxq(String yxxJbxgctaJwdmycxq) {
		this.yxxJbxgctaJwdmycxq = yxxJbxgctaJwdmycxq;
	}

	@Column(name = "YXX_JBXGCTA_ZDMLWDZCXQ", length = 20)
	public String getYxxJbxgctaZdmlwdzcxq() {
		return this.yxxJbxgctaZdmlwdzcxq;
	}

	public void setYxxJbxgctaZdmlwdzcxq(String yxxJbxgctaZdmlwdzcxq) {
		this.yxxJbxgctaZdmlwdzcxq = yxxJbxgctaZdmlwdzcxq;
	}

	@Column(name = "YXX_JBXGCTA_ZDMLWDYCXQ", length = 20)
	public String getYxxJbxgctaZdmlwdycxq() {
		return this.yxxJbxgctaZdmlwdycxq;
	}

	public void setYxxJbxgctaZdmlwdycxq(String yxxJbxgctaZdmlwdycxq) {
		this.yxxJbxgctaZdmlwdycxq = yxxJbxgctaZdmlwdycxq;
	}

	@Column(name = "YXX_JBXGCTA_SGXDMQSDZCXQ", length = 20)
	public String getYxxJbxgctaSgxdmqsdzcxq() {
		return this.yxxJbxgctaSgxdmqsdzcxq;
	}

	public void setYxxJbxgctaSgxdmqsdzcxq(String yxxJbxgctaSgxdmqsdzcxq) {
		this.yxxJbxgctaSgxdmqsdzcxq = yxxJbxgctaSgxdmqsdzcxq;
	}

	@Column(name = "YXX_JBXGCTA_SGXDMQSDYCXQ", length = 20)
	public String getYxxJbxgctaSgxdmqsdycxq() {
		return this.yxxJbxgctaSgxdmqsdycxq;
	}

	public void setYxxJbxgctaSgxdmqsdycxq(String yxxJbxgctaSgxdmqsdycxq) {
		this.yxxJbxgctaSgxdmqsdycxq = yxxJbxgctaSgxdmqsdycxq;
	}

}