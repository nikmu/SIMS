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
 * YxxTlctJcxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "YXX_TLCT_JCXXB", schema = "SCOTT")
public class YxxTlctJcxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String yxxTlctJcbh;
	private Blxxb blxxb;
	private Timestamp yxxTlctJcsj;
	private String yxxTlctXfngs;
	private String yxxTlctXfngsbw;
	private String yxxTlctXfngszcxq;
	private String yxxTlctXfngsycxq;
	private BigDecimal yxxTlctNgstj;
	private String yxxTlctXfncx;
	private String yxxTlctXfncxbw;
	private String yxxTlctXfncxzcxq;
	private String yxxTlctXfncxycxq;
	private BigDecimal yxxTlctNcxdcxl;
	private String yxxTlctXfzwmxqcx;
	private String yxxTlctBsbz;

	// Constructors

	/** default constructor */
	public YxxTlctJcxxb() {
	}

	/** full constructor */
	public YxxTlctJcxxb(Blxxb blxxb, Timestamp yxxTlctJcsj,
			String yxxTlctXfngs, String yxxTlctXfngsbw,
			String yxxTlctXfngszcxq, String yxxTlctXfngsycxq,
			BigDecimal yxxTlctNgstj, String yxxTlctXfncx,
			String yxxTlctXfncxbw, String yxxTlctXfncxzcxq,
			String yxxTlctXfncxycxq, BigDecimal yxxTlctNcxdcxl,
			String yxxTlctXfzwmxqcx, String yxxTlctBsbz) {
		this.blxxb = blxxb;
		this.yxxTlctJcsj = yxxTlctJcsj;
		this.yxxTlctXfngs = yxxTlctXfngs;
		this.yxxTlctXfngsbw = yxxTlctXfngsbw;
		this.yxxTlctXfngszcxq = yxxTlctXfngszcxq;
		this.yxxTlctXfngsycxq = yxxTlctXfngsycxq;
		this.yxxTlctNgstj = yxxTlctNgstj;
		this.yxxTlctXfncx = yxxTlctXfncx;
		this.yxxTlctXfncxbw = yxxTlctXfncxbw;
		this.yxxTlctXfncxzcxq = yxxTlctXfncxzcxq;
		this.yxxTlctXfncxycxq = yxxTlctXfncxycxq;
		this.yxxTlctNcxdcxl = yxxTlctNcxdcxl;
		this.yxxTlctXfzwmxqcx = yxxTlctXfzwmxqcx;
		this.yxxTlctBsbz = yxxTlctBsbz;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "YXX_TLCT_JCBH", unique = true, nullable = false, length = 31)
	public String getYxxTlctJcbh() {
		return this.yxxTlctJcbh;
	}

	public void setYxxTlctJcbh(String yxxTlctJcbh) {
		this.yxxTlctJcbh = yxxTlctJcbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "YXX_TLCT_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "YXX_TLCT_JCSJ", length = 7)
	public Timestamp getYxxTlctJcsj() {
		return this.yxxTlctJcsj;
	}

	public void setYxxTlctJcsj(Timestamp yxxTlctJcsj) {
		this.yxxTlctJcsj = yxxTlctJcsj;
	}

	@Column(name = "YXX_TLCT_XFNGS", length = 4)
	public String getYxxTlctXfngs() {
		return this.yxxTlctXfngs;
	}

	public void setYxxTlctXfngs(String yxxTlctXfngs) {
		this.yxxTlctXfngs = yxxTlctXfngs;
	}

	@Column(name = "YXX_TLCT_XFNGSBW", length = 10)
	public String getYxxTlctXfngsbw() {
		return this.yxxTlctXfngsbw;
	}

	public void setYxxTlctXfngsbw(String yxxTlctXfngsbw) {
		this.yxxTlctXfngsbw = yxxTlctXfngsbw;
	}

	@Column(name = "YXX_TLCT_XFNGSZCXQ", length = 50)
	public String getYxxTlctXfngszcxq() {
		return this.yxxTlctXfngszcxq;
	}

	public void setYxxTlctXfngszcxq(String yxxTlctXfngszcxq) {
		this.yxxTlctXfngszcxq = yxxTlctXfngszcxq;
	}

	@Column(name = "YXX_TLCT_XFNGSYCXQ", length = 50)
	public String getYxxTlctXfngsycxq() {
		return this.yxxTlctXfngsycxq;
	}

	public void setYxxTlctXfngsycxq(String yxxTlctXfngsycxq) {
		this.yxxTlctXfngsycxq = yxxTlctXfngsycxq;
	}

	@Column(name = "YXX_TLCT_NGSTJ", precision = 22, scale = 0)
	public BigDecimal getYxxTlctNgstj() {
		return this.yxxTlctNgstj;
	}

	public void setYxxTlctNgstj(BigDecimal yxxTlctNgstj) {
		this.yxxTlctNgstj = yxxTlctNgstj;
	}

	@Column(name = "YXX_TLCT_XFNCX", length = 4)
	public String getYxxTlctXfncx() {
		return this.yxxTlctXfncx;
	}

	public void setYxxTlctXfncx(String yxxTlctXfncx) {
		this.yxxTlctXfncx = yxxTlctXfncx;
	}

	@Column(name = "YXX_TLCT_XFNCXBW", length = 10)
	public String getYxxTlctXfncxbw() {
		return this.yxxTlctXfncxbw;
	}

	public void setYxxTlctXfncxbw(String yxxTlctXfncxbw) {
		this.yxxTlctXfncxbw = yxxTlctXfncxbw;
	}

	@Column(name = "YXX_TLCT_XFNCXZCXQ", length = 50)
	public String getYxxTlctXfncxzcxq() {
		return this.yxxTlctXfncxzcxq;
	}

	public void setYxxTlctXfncxzcxq(String yxxTlctXfncxzcxq) {
		this.yxxTlctXfncxzcxq = yxxTlctXfncxzcxq;
	}

	@Column(name = "YXX_TLCT_XFNCXYCXQ", length = 50)
	public String getYxxTlctXfncxycxq() {
		return this.yxxTlctXfncxycxq;
	}

	public void setYxxTlctXfncxycxq(String yxxTlctXfncxycxq) {
		this.yxxTlctXfncxycxq = yxxTlctXfncxycxq;
	}

	@Column(name = "YXX_TLCT_NCXDCXL", precision = 22, scale = 0)
	public BigDecimal getYxxTlctNcxdcxl() {
		return this.yxxTlctNcxdcxl;
	}

	public void setYxxTlctNcxdcxl(BigDecimal yxxTlctNcxdcxl) {
		this.yxxTlctNcxdcxl = yxxTlctNcxdcxl;
	}

	@Column(name = "YXX_TLCT_XFZWMXQCX", length = 4)
	public String getYxxTlctXfzwmxqcx() {
		return this.yxxTlctXfzwmxqcx;
	}

	public void setYxxTlctXfzwmxqcx(String yxxTlctXfzwmxqcx) {
		this.yxxTlctXfzwmxqcx = yxxTlctXfzwmxqcx;
	}

	@Column(name = "YXX_TLCT_BSBZ", length = 50)
	public String getYxxTlctBsbz() {
		return this.yxxTlctBsbz;
	}

	public void setYxxTlctBsbz(String yxxTlctBsbz) {
		this.yxxTlctBsbz = yxxTlctBsbz;
	}

}