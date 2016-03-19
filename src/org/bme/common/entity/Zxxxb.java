package org.bme.common.entity;

import java.math.BigDecimal;
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
 * Zxxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ZXXXB", schema = "C##SIMSDBA")
public class Zxxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String zxbh;
	private String zxmc;
	private BigDecimal zxjb;
	private String sjzxbh;
	private String bz;
	private Set<Dwxxb> dwxxbs = new HashSet<Dwxxb>(0);

	// Constructors

	/** default constructor */
	public Zxxxb() {
	}

	/** full constructor */
	public Zxxxb(String zxmc, BigDecimal zxjb, String sjzxbh, String bz,
			Set<Dwxxb> dwxxbs) {
		this.zxmc = zxmc;
		this.zxjb = zxjb;
		this.sjzxbh = sjzxbh;
		this.bz = bz;
		this.dwxxbs = dwxxbs;
	}

	@GenericGenerator(name = "generator", strategy = "org.bme.common.utils.GeneratePK", parameters = {
			   @Parameter(name = "classname", value = "Zxxxb"),
			   @Parameter(name = "pk", value = "zxbh"),
			   @Parameter(name = "sign", value = "Z"),
			   @Parameter(name = "idLength", value = "11") })
	@GeneratedValue(generator = "generator")
	@Id
	@Column(name = "ZXBH", unique = true, nullable = false, length = 11)
	public String getZxbh() {
		return this.zxbh;
	}

	public void setZxbh(String zxbh) {
		this.zxbh = zxbh;
	}

	@Column(name = "ZXMC", length = 50)
	public String getZxmc() {
		return this.zxmc;
	}

	public void setZxmc(String zxmc) {
		this.zxmc = zxmc;
	}

	@Column(name = "ZXJB", precision = 22, scale = 0)
	public BigDecimal getZxjb() {
		return this.zxjb;
	}

	public void setZxjb(BigDecimal zxjb) {
		this.zxjb = zxjb;
	}

	@Column(name = "SJZXBH", length = 11)
	public String getSjzxbh() {
		return this.sjzxbh;
	}

	public void setSjzxbh(String sjzxbh) {
		this.sjzxbh = sjzxbh;
	}

	@Column(name = "BZ", length = 50)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "zxxxb")
	public Set<Dwxxb> getDwxxbs() {
		return this.dwxxbs;
	}

	public void setDwxxbs(Set<Dwxxb> dwxxbs) {
		this.dwxxbs = dwxxbs;
	}

}