package org.bme.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Yhgwglxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YHGWGLXXB", schema = "C##SIMSDBA")
public class Yhgwglxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yhgwglbh;
	private Yhxxb yhxxb;
	private Gwxxb gwxxb;

	// Constructors

	/** default constructor */
	public Yhgwglxxb() {
	}

	/** full constructor */
	public Yhgwglxxb(Yhxxb yhxxb, Gwxxb gwxxb) {
		this.yhxxb = yhxxb;
		this.gwxxb = gwxxb;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "org.bme.common.utils.GeneratePK", parameters = {
			   @Parameter(name = "classname", value = "Yhgwglxxb"),
			   @Parameter(name = "pk", value = "yhgwglbh"),
			   @Parameter(name = "sign", value = "YG"),
			   @Parameter(name = "idLength", value = "12") })
	@GeneratedValue(generator = "generator")
	@Id
	@Column(name = "YHGWGLBH", unique = true, nullable = false, length = 12)
	public String getYhgwglbh() {
		return this.yhgwglbh;
	}

	public void setYhgwglbh(String yhgwglbh) {
		this.yhgwglbh = yhgwglbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YHBH")
	public Yhxxb getYhxxb() {
		return this.yhxxb;
	}

	public void setYhxxb(Yhxxb yhxxb) {
		this.yhxxb = yhxxb;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GWBH")
	public Gwxxb getGwxxb() {
		return this.gwxxb;
	}

	public void setGwxxb(Gwxxb gwxxb) {
		this.gwxxb = gwxxb;
	}

}