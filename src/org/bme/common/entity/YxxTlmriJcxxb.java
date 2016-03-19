package org.bme.common.entity;

import java.math.BigDecimal;
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
 * YxxTlmriJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_TLMRI_JCXXB", schema = "SCOTT")
public class YxxTlmriJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxTlmriJcbh;
	private Blxxb blxxb;
	private Timestamp yxxTlmriJcsj;
	private String yxxTlmriSmxl;
	private String yxxTlmriXfngs;
	private String yxxTlmriXfngsbw;
	private String yxxTlmriXfngszcxq;
	private String yxxTlmriXfngsycxq;
	private BigDecimal yxxTlmriNgstj;
	private String yxxTlmriXfncx;
	private String yxxTlmriXfncxbw;
	private String yxxTlmriXfncxzcxq;
	private String yxxTlmriXfncxycxq;
	private BigDecimal yxxTlmriNcxdcxl;
	private String yxxTlmriXfzwmxqcx;
	private String yxxTlmriBsbz;

	// Constructors

	/** default constructor */
	public YxxTlmriJcxxb() {
	}

	/** full constructor */
	public YxxTlmriJcxxb(Blxxb blxxb, Timestamp yxxTlmriJcsj,
			String yxxTlmriSmxl, String yxxTlmriXfngs, String yxxTlmriXfngsbw,
			String yxxTlmriXfngszcxq, String yxxTlmriXfngsycxq,
			BigDecimal yxxTlmriNgstj, String yxxTlmriXfncx,
			String yxxTlmriXfncxbw, String yxxTlmriXfncxzcxq,
			String yxxTlmriXfncxycxq, BigDecimal yxxTlmriNcxdcxl,
			String yxxTlmriXfzwmxqcx, String yxxTlmriBsbz) {
		this.blxxb = blxxb;
		this.yxxTlmriJcsj = yxxTlmriJcsj;
		this.yxxTlmriSmxl = yxxTlmriSmxl;
		this.yxxTlmriXfngs = yxxTlmriXfngs;
		this.yxxTlmriXfngsbw = yxxTlmriXfngsbw;
		this.yxxTlmriXfngszcxq = yxxTlmriXfngszcxq;
		this.yxxTlmriXfngsycxq = yxxTlmriXfngsycxq;
		this.yxxTlmriNgstj = yxxTlmriNgstj;
		this.yxxTlmriXfncx = yxxTlmriXfncx;
		this.yxxTlmriXfncxbw = yxxTlmriXfncxbw;
		this.yxxTlmriXfncxzcxq = yxxTlmriXfncxzcxq;
		this.yxxTlmriXfncxycxq = yxxTlmriXfncxycxq;
		this.yxxTlmriNcxdcxl = yxxTlmriNcxdcxl;
		this.yxxTlmriXfzwmxqcx = yxxTlmriXfzwmxqcx;
		this.yxxTlmriBsbz = yxxTlmriBsbz;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_TLMRI_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxTlmriJcbh() {
		return this.yxxTlmriJcbh;
	}

	public void setYxxTlmriJcbh(String yxxTlmriJcbh) {
		this.yxxTlmriJcbh = yxxTlmriJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_TLMRI_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_TLMRI_JCSJ", length = 7)
	public Timestamp getYxxTlmriJcsj() {
		return this.yxxTlmriJcsj;
	}

	public void setYxxTlmriJcsj(Timestamp yxxTlmriJcsj) {
		this.yxxTlmriJcsj = yxxTlmriJcsj;
	}

	@Column(name = "YXX_TLMRI_SMXL", length = 50)
	public String getYxxTlmriSmxl() {
		return this.yxxTlmriSmxl;
	}

	public void setYxxTlmriSmxl(String yxxTlmriSmxl) {
		this.yxxTlmriSmxl = yxxTlmriSmxl;
	}

	@Column(name = "YXX_TLMRI_XFNGS", length = 4)
	public String getYxxTlmriXfngs() {
		return this.yxxTlmriXfngs;
	}

	public void setYxxTlmriXfngs(String yxxTlmriXfngs) {
		this.yxxTlmriXfngs = yxxTlmriXfngs;
	}

	@Column(name = "YXX_TLMRI_XFNGSBW", length = 10)
	public String getYxxTlmriXfngsbw() {
		return this.yxxTlmriXfngsbw;
	}

	public void setYxxTlmriXfngsbw(String yxxTlmriXfngsbw) {
		this.yxxTlmriXfngsbw = yxxTlmriXfngsbw;
	}

	@Column(name = "YXX_TLMRI_XFNGSZCXQ", length = 50)
	public String getYxxTlmriXfngszcxq() {
		return this.yxxTlmriXfngszcxq;
	}

	public void setYxxTlmriXfngszcxq(String yxxTlmriXfngszcxq) {
		this.yxxTlmriXfngszcxq = yxxTlmriXfngszcxq;
	}

	@Column(name = "YXX_TLMRI_XFNGSYCXQ", length = 50)
	public String getYxxTlmriXfngsycxq() {
		return this.yxxTlmriXfngsycxq;
	}

	public void setYxxTlmriXfngsycxq(String yxxTlmriXfngsycxq) {
		this.yxxTlmriXfngsycxq = yxxTlmriXfngsycxq;
	}

	@Column(name = "YXX_TLMRI_NGSTJ", precision = 22, scale = 0)
	public BigDecimal getYxxTlmriNgstj() {
		return this.yxxTlmriNgstj;
	}

	public void setYxxTlmriNgstj(BigDecimal yxxTlmriNgstj) {
		this.yxxTlmriNgstj = yxxTlmriNgstj;
	}

	@Column(name = "YXX_TLMRI_XFNCX", length = 4)
	public String getYxxTlmriXfncx() {
		return this.yxxTlmriXfncx;
	}

	public void setYxxTlmriXfncx(String yxxTlmriXfncx) {
		this.yxxTlmriXfncx = yxxTlmriXfncx;
	}

	@Column(name = "YXX_TLMRI_XFNCXBW", length = 10)
	public String getYxxTlmriXfncxbw() {
		return this.yxxTlmriXfncxbw;
	}

	public void setYxxTlmriXfncxbw(String yxxTlmriXfncxbw) {
		this.yxxTlmriXfncxbw = yxxTlmriXfncxbw;
	}

	@Column(name = "YXX_TLMRI_XFNCXZCXQ", length = 50)
	public String getYxxTlmriXfncxzcxq() {
		return this.yxxTlmriXfncxzcxq;
	}

	public void setYxxTlmriXfncxzcxq(String yxxTlmriXfncxzcxq) {
		this.yxxTlmriXfncxzcxq = yxxTlmriXfncxzcxq;
	}

	@Column(name = "YXX_TLMRI_XFNCXYCXQ", length = 50)
	public String getYxxTlmriXfncxycxq() {
		return this.yxxTlmriXfncxycxq;
	}

	public void setYxxTlmriXfncxycxq(String yxxTlmriXfncxycxq) {
		this.yxxTlmriXfncxycxq = yxxTlmriXfncxycxq;
	}

	@Column(name = "YXX_TLMRI_NCXDCXL", precision = 22, scale = 0)
	public BigDecimal getYxxTlmriNcxdcxl() {
		return this.yxxTlmriNcxdcxl;
	}

	public void setYxxTlmriNcxdcxl(BigDecimal yxxTlmriNcxdcxl) {
		this.yxxTlmriNcxdcxl = yxxTlmriNcxdcxl;
	}

	@Column(name = "YXX_TLMRI_XFZWMXQCX", length = 4)
	public String getYxxTlmriXfzwmxqcx() {
		return this.yxxTlmriXfzwmxqcx;
	}

	public void setYxxTlmriXfzwmxqcx(String yxxTlmriXfzwmxqcx) {
		this.yxxTlmriXfzwmxqcx = yxxTlmriXfzwmxqcx;
	}

	@Column(name = "YXX_TLMRI_BSBZ", length = 50)
	public String getYxxTlmriBsbz() {
		return this.yxxTlmriBsbz;
	}

	public void setYxxTlmriBsbz(String yxxTlmriBsbz) {
		this.yxxTlmriBsbz = yxxTlmriBsbz;
	}

}