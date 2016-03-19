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
 * SysNcgJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_NCG_JCXXB", schema = "SCOTT")
public class SysNcgJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sysNcgJcbh;
	private Blxxb blxxb;
	private Timestamp sysNcgJcsj;
	private String sysNcgNdb;
	private String sysNcgNyx;
	private String sysNcgNbdb;

	// Constructors

	/** default constructor */
	public SysNcgJcxxb() {
	}

	/** full constructor */
	public SysNcgJcxxb(Blxxb blxxb, Timestamp sysNcgJcsj, String sysNcgNdb,
			String sysNcgNyx, String sysNcgNbdb) {
		this.blxxb = blxxb;
		this.sysNcgJcsj = sysNcgJcsj;
		this.sysNcgNdb = sysNcgNdb;
		this.sysNcgNyx = sysNcgNyx;
		this.sysNcgNbdb = sysNcgNbdb;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SYS_NCG_JCBH", unique = true, nullable = false, length = 31)
	public String getSysNcgJcbh() {
		return this.sysNcgJcbh;
	}

	public void setSysNcgJcbh(String sysNcgJcbh) {
		this.sysNcgJcbh = sysNcgJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYS_NCG_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SYS_NCG_JCSJ", length = 7)
	public Timestamp getSysNcgJcsj() {
		return this.sysNcgJcsj;
	}

	public void setSysNcgJcsj(Timestamp sysNcgJcsj) {
		this.sysNcgJcsj = sysNcgJcsj;
	}

	@Column(name = "SYS_NCG_NDB", length = 10)
	public String getSysNcgNdb() {
		return this.sysNcgNdb;
	}

	public void setSysNcgNdb(String sysNcgNdb) {
		this.sysNcgNdb = sysNcgNdb;
	}

	@Column(name = "SYS_NCG_NYX", length = 10)
	public String getSysNcgNyx() {
		return this.sysNcgNyx;
	}

	public void setSysNcgNyx(String sysNcgNyx) {
		this.sysNcgNyx = sysNcgNyx;
	}

	@Column(name = "SYS_NCG_NBDB", length = 10)
	public String getSysNcgNbdb() {
		return this.sysNcgNbdb;
	}

	public void setSysNcgNbdb(String sysNcgNbdb) {
		this.sysNcgNbdb = sysNcgNbdb;
	}

}