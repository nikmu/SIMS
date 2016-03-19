package org.bme.common.entity;

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
 * Gwxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GWXXB", schema = "C##SIMSDBA")
public class Gwxxb implements java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String gwbh;
	private String gwmc;
	private String gwzz;
	private Set<Yhgwglxxb> yhgwglxxbs = new HashSet<Yhgwglxxb>(0);
	private Set<Gwqxxxb> gwqxxxbs = new HashSet<Gwqxxxb>(0);

	// Constructors

	/** default constructor */
	public Gwxxb() {
	}

	/** full constructor */
	public Gwxxb(String gwmc, String gwzz, Set<Yhgwglxxb> yhgwglxxbs,
			Set<Gwqxxxb> gwqxxxbs) {
		this.gwmc = gwmc;
		this.gwzz = gwzz;
		this.yhgwglxxbs = yhgwglxxbs;
		this.gwqxxxbs = gwqxxxbs;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "org.bme.common.utils.GeneratePK", parameters = {
			   @Parameter(name = "classname", value = "Gwxxb"),
			   @Parameter(name = "pk", value = "gwbh"),
			   @Parameter(name = "sign", value = "G"),
			   @Parameter(name = "idLength", value = "6") })
	@GeneratedValue(generator = "generator")
	@Id
	@Column(name = "GWBH", unique = true, nullable = false, length = 6)
	public String getGwbh() {
		return this.gwbh;
	}

	public void setGwbh(String gwbh) {
		this.gwbh = gwbh;
	}

	@Column(name = "GWMC", length = 20)
	public String getGwmc() {
		return this.gwmc;
	}

	public void setGwmc(String gwmc) {
		this.gwmc = gwmc;
	}

	@Column(name = "GWZZ", length = 50)
	public String getGwzz() {
		return this.gwzz;
	}

	public void setGwzz(String gwzz) {
		this.gwzz = gwzz;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gwxxb")
	public Set<Yhgwglxxb> getYhgwglxxbs() {
		return this.yhgwglxxbs;
	}

	public void setYhgwglxxbs(Set<Yhgwglxxb> yhgwglxxbs) {
		this.yhgwglxxbs = yhgwglxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gwxxb")
	public Set<Gwqxxxb> getGwqxxxbs() {
		return this.gwqxxxbs;
	}

	public void setGwqxxxbs(Set<Gwqxxxb> gwqxxxbs) {
		this.gwqxxxbs = gwqxxxbs;
	}

}