package org.bme.common.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Yhxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YHXXB", schema = "C##SIMSDBA")
public class Yhxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yhbh;
	private BigDecimal ssjglb;
	private String ssjgbh;
	private String mm;
	private String xm;
	private String xb;
	private Timestamp csrq;
	private String dhhm;
	private String email;
	private String qq;
	private String bz;
	private Set<Bldcjlb> bldcjlbs = new HashSet<Bldcjlb>(0);
	private Set<Blxxb> blxxbs = new HashSet<Blxxb>(0);
	private Set<Yhgwglxxb> yhgwglxxbs = new HashSet<Yhgwglxxb>(0);

	// Constructors

	/** default constructor */
	public Yhxxb() {
	}

	/** full constructor */
	public Yhxxb(BigDecimal ssjglb, String ssjgbh, String mm, String xm,
			String xb, Timestamp csrq, String dhhm, String email, String qq,
			String bz, Set<Bldcjlb> bldcjlbs, Set<Blxxb> blxxbs,
			Set<Yhgwglxxb> yhgwglxxbs) {
		this.ssjglb = ssjglb;
		this.ssjgbh = ssjgbh;
		this.mm = mm;
		this.xm = xm;
		this.xb = xb;
		this.csrq = csrq;
		this.dhhm = dhhm;
		this.email = email;
		this.qq = qq;
		this.bz = bz;
		this.bldcjlbs = bldcjlbs;
		this.blxxbs = blxxbs;
		this.yhgwglxxbs = yhgwglxxbs;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "org.bme.common.utils.GeneratePK", parameters = {
			   @Parameter(name = "classname", value = "Yhxxb"),
			   @Parameter(name = "pk", value = "yhbh"),
			   @Parameter(name = "sign", value = "Y"),
			   @Parameter(name = "idLength", value = "11") })
	@GeneratedValue(generator = "generator")
	@Id
	@Column(name = "YHBH", unique = true, nullable = false, length = 11)
	public String getYhbh() {
		return this.yhbh;
	}

	public void setYhbh(String yhbh) {
		this.yhbh = yhbh;
	}

	@Column(name = "SSJGLB", precision = 22, scale = 0)
	public BigDecimal getSsjglb() {
		return this.ssjglb;
	}

	public void setSsjglb(BigDecimal ssjglb) {
		this.ssjglb = ssjglb;
	}

	@Column(name = "SSJGBH", length = 20)
	public String getSsjgbh() {
		return this.ssjgbh;
	}

	public void setSsjgbh(String ssjgbh) {
		this.ssjgbh = ssjgbh;
	}

	@Column(name = "MM", length = 21)
	public String getMm() {
		return this.mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	@Column(name = "XM", length = 20)
	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	@Column(name = "XB", length = 4)
	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	@Column(name = "CSRQ", length = 7)
	public Timestamp getCsrq() {
		return this.csrq;
	}

	public void setCsrq(Timestamp csrq) {
		this.csrq = csrq;
	}

	@Column(name = "DHHM", length = 20)
	public String getDhhm() {
		return this.dhhm;
	}

	public void setDhhm(String dhhm) {
		this.dhhm = dhhm;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "QQ", length = 20)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "BZ", length = 50)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "yhxxb")
	public Set<Bldcjlb> getBldcjlbs() {
		return this.bldcjlbs;
	}

	public void setBldcjlbs(Set<Bldcjlb> bldcjlbs) {
		this.bldcjlbs = bldcjlbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "yhxxb")
	public Set<Blxxb> getBlxxbs() {
		return this.blxxbs;
	}

	public void setBlxxbs(Set<Blxxb> blxxbs) {
		this.blxxbs = blxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "yhxxb")
	public Set<Yhgwglxxb> getYhgwglxxbs() {
		return this.yhgwglxxbs;
	}

	public void setYhgwglxxbs(Set<Yhgwglxxb> yhgwglxxbs) {
		this.yhgwglxxbs = yhgwglxxbs;
	}

}