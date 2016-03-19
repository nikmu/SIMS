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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Blxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "BLXXB", schema = "C##SIMSDBA")
public class Blxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String xjblBlbh;
	private Yhxxb yhxxb;
	private String xjblHzbh;
	private String xjblHzzyyy;
	private Timestamp xjblXxlrsj;
	private String xjblZyh;
	private Timestamp xjblRyrq;
	private String xjblXm;
	private String xjblZjlx;
	private String xjblZjhm;
	private String xjblXb;
	private Timestamp xjblCsrq;
	private String xjblZyzd;
	private BigDecimal jbxxNl;
	private String jbxxMz;
	private String jbxxHyzk;
	private String jbxxWhcd;
	private String jbxxYblx;
	private String jbxxZy;
	private String jbxxJgsf;
	private String jbxxJgdq;
	private String jbxxJgx;
	private String jbxxXzzsf;
	private String jbxxXzzdq;
	private String jbxxXzzx;
	private String jbxxXzz;
	private String jbxxLxdh01;
	private String jbxxLxdh02;
	private String jwsNgs;
	private Timestamp jwsNgsfbsj;
	private String jwsNcx;
	private Timestamp jwsNcxfbsj;
	private String jwsZwmxqcx;
	private Timestamp jwsZwmxqcxfbsj;
	private String jwsLnjmxtxsxc;
	private Timestamp jwsLnjmxtxsxcfbsj;
	private String jwsLndml;
	private Timestamp jwsLndmlfbsj;
	private String jwsLnxgjx;
	private Timestamp jwsLnxgjxfbsj;
	private String jwsTia;
	private Timestamp jwsTiafbsj;
	private String jwsXzb;
	private String jwsXzblx;
	private String jwsXzblxzqt;
	private String jwsTnb;
	private BigDecimal jwsTnbbc;
	private String jwsTnbzl;
	private String jwsGxy;
	private BigDecimal jwsGxybc;
	private String jwsGxyzl;
	private String jwsXzyc;
	private BigDecimal jwsXzycbc;
	private String jwsXzyczl;
	private String jwsSss;
	private String jwsSssxq;
	private String grsXy;
	private String grsYj;
	private String grsTydl;
	private String jzsNzz;
	private String jzsGxy;
	private String jzsTnb;
	private String jzsGxb;
	private String jzsYcbs;
	private String yyqkJy;
	private String yyqkJyywlx;
	private String yyqkJt;
	private String yyqkJtywlx;
	private String yyqkTz;
	private String yyqkTzywlx;
	private String yyqkKxxb;
	private String yyqkKxxbywlx;
	private String yyqkKn;
	private String yyqkKnywlx;
	private String yyqkJtxbgas;
	private String yyqkJtxbgasywlx;
	private String yyqkRs;
	private String yyqkRsywlx;
	private Timestamp bltdQbsj;
	private Timestamp bltdJzsj;
	private BigDecimal bltdBc;
	private String bltdDysyszt;
	private String bltdZs;
	private String bltdOscpfx;
	private BigDecimal bltdJzsnihsspf;
	private BigDecimal bltdJz24hnihsspf;
	private BigDecimal bltdQbqmrspf;
	private BigDecimal bltdJzsmrspf;
	private BigDecimal bltdJzsgcspf;
	private BigDecimal bltdJzsmmsepf;
	private BigDecimal tgjcSg;
	private BigDecimal tgjcTz;
	private BigDecimal tgjcBmi;
	private BigDecimal tgjcTw;
	private BigDecimal tgjcHx;
	private BigDecimal tgjcMb;
	private BigDecimal tgjcXl;
	private BigDecimal tgjcSsy;
	private BigDecimal tgjcSzy;
	private String tgjcTygnza;
	private String rszlRs;
	private String rszlWrsyy;
	private String rszlWrsyyzrsjjz;
	private Timestamp rszlRssj;
	private String rszlGylb;
	private String rszlGylbzqt;
	private String rszlGytj;
	private BigDecimal rszlNihsspf;
	private BigDecimal rszlGyqssy;
	private BigDecimal rszlGyqszy;
	private String rszlRsqsfjyzl;
	private String rszlBfyzdqscx;
	private String rszlSfbflncx;
	private String rszlBflncxzsfwzzxcx;
	private BigDecimal rszlRtpazjl;
	private BigDecimal rszlHztz;
	private BigDecimal rszlMgjtzrtpajl;
	private String rszlRtpasfgzjl;
	private String rszlWngzjlyy;
	private String rszlWngzjlyyzqt;
	private String ywzlKszl;
	private String ywzlWzlyy;
	private String ywzlKszlgyzl;
	private String ywzlElkxxb;
	private BigDecimal ywzlElkxxbzlsj;
	private String ywzlJy;
	private String ywzlJyywlx;
	private String ywzlJygytj;
	private String ywzlJt;
	private String ywzlJtywlx;
	private String ywzlTz;
	private String ywzlTzywlx;
	private String ywzlJtxbgas;
	private String ywzlJtxbgasywlx;
	private String ywzlJq;
	private String ywzlJqywlxjjl;
	private String ywzlJdlny;
	private String ywzlJdlnyywlx;
	private String ywzlZxyw;
	private String ywzlZxywywlx;
	private String ywzlSx;
	private String ywzlSxsxlx;
	private String ywzlYfnxgjl;
	private String ywzlJszl;
	private String ywzlKdxzl;
	private String ywzlKgrzl;
	private String ywzlZyzcyzl;
	private String fywzlJdmnmbts;
	private Timestamp fywzlJdmnmbtssssj;
	private String fywzlJdmnmbtssswz;
	private String fywzlJdmnmbtsbfz;
	private String fywzlJdmzjzrs;
	private Timestamp fywzlJdmzjzrssssj;
	private String fywzlJdmzjzrssswz;
	private String fywzlJdmzjzrssswzzcxq;
	private String fywzlJdmzjzrssswyzcxq;
	private String fywzlJdmzjzrsbfz;
	private String fywzlJdmzjzrsbfzxq;
	private String fywzlNcxsszl;
	private Timestamp fywzlNcxsszlsssj;
	private String fywzlNcxsszlssfs;
	private String fywzlLndmlsszl;
	private Timestamp fywzlLndmlsszlsssj;
	private String fywzlLndmlsszlssfs;
	private String fywzlXgnzlxq;
	private String fywzlCjxzlxq;
	private String fywzlFcjxzlxq;
	private String fywzlLndjmjxsszl;
	private Timestamp fywzlLndjmjxsszlsssj;
	private String fywzlLndjmjxsszlssfs;
	private String fywzlLnyjc;
	private Timestamp fywzlLnyjcczsj;
	private String fywzlQgcg;
	private Timestamp fywzlQgcgczsj;
	private String fywzlQgqk;
	private Timestamp fywzlQgqkczsj;
	private String fywzlJxtq;
	private Timestamp fywzlJxtqczsj;
	private String fywzlWzls;
	private Timestamp fywzlWzlsczsj;
	private String fywzlBwgfz;
	private Timestamp fywzlBwgfzczsj;
	private String bfzhbzDx;
	private String bfzhbzYy;
	private String bfzhbzFc;
	private String bfzhbzXjgs;
	private String bfzhbzXtjt;
	private String bfzhbzFbgr;
	private String bfzhbzFss;
	private String bfzhbzHxjt;
	private String bfzhbzXhdcx;
	private String bfzhbzMnxtgr;
	private String bfzhbzSjmxs;
	private String bfzhbzRc;
	private String bfzhbzNdxz;
	private String bfzhbzDs;
	private Timestamp cyqkCysj;
	private BigDecimal cyqkZyts;
	private String cyqkCyzyzd;
	private String cyqkNgsby;
	private String cyqkNgsbyzqt;
	private String cyqkQtcyzd;
	private BigDecimal cyqkNihsspf;
	private BigDecimal cyqkMrspf;
	private BigDecimal cyqkGcspf;
	private BigDecimal cyqkMmsepf;
	private BigDecimal cyqkHJllbpf;
	private BigDecimal cyqkHYylbpf;
	private Timestamp xdtJcsj;
	private String xdtJg;
	private String xdtSfwzcxdt;
	private String xdtYcxq;
	private String xdtYcxqzqt;
	private String jyTgjy;
	private Timestamp jyTgjysj;
	private Set<Sfxxb> sfxxbs = new HashSet<Sfxxb>(0);
	private Set<YxxQndsaJcxxb> yxxQndsaJcxxbs = new HashSet<YxxQndsaJcxxb>(0);
	private Set<SysDjzJcxxb> sysDjzJcxxbs = new HashSet<SysDjzJcxxb>(0);
	private Set<YxxJldpltcdJcxxb> yxxJldpltcdJcxxbs = new HashSet<YxxJldpltcdJcxxb>(
			0);
	private Set<SysSgnJcxxb> sysSgnJcxxbs = new HashSet<SysSgnJcxxb>(0);
	private Set<SysXjssbjwJcxxb> sysXjssbjwJcxxbs = new HashSet<SysXjssbjwJcxxb>(
			0);
	private Set<Dicomxxb> dicomxxbs = new HashSet<Dicomxxb>(0);
	private Set<SysXcgJcxxb> sysXcgJcxxbs = new HashSet<SysXcgJcxxb>(0);
	private Set<YxxTlctJcxxb> yxxTlctJcxxbs = new HashSet<YxxTlctJcxxb>(0);
	private Set<YxxXzxgccJcxxb> yxxXzxgccJcxxbs = new HashSet<YxxXzxgccJcxxb>(0);
	private Set<SysTdxJcxxb> sysTdxJcxxbs = new HashSet<SysTdxJcxxb>(0);
	private Set<SysXgyzbJcxxb> sysXgyzbJcxxbs = new HashSet<SysXgyzbJcxxb>(0);
	private Set<YxxLnxgmraJcxxb> yxxLnxgmraJcxxbs = new HashSet<YxxLnxgmraJcxxb>(
			0);
	private Set<YxxJbxgccJcxxb> yxxJbxgccJcxxbs = new HashSet<YxxJbxgccJcxxb>(0);
	private Set<YxxLnxgctaJcxxb> yxxLnxgctaJcxxbs = new HashSet<YxxLnxgctaJcxxb>(
			0);
	private Set<YxxTlmriJcxxb> yxxTlmriJcxxbs = new HashSet<YxxTlmriJcxxb>(0);
	private Set<SysNcgJcxxb> sysNcgJcxxbs = new HashSet<SysNcgJcxxb>(0);
	private Set<SysNxgnJcxxb> sysNxgnJcxxbs = new HashSet<SysNxgnJcxxb>(0);
	private Set<YxxJbxgctaJcxxb> yxxJbxgctaJcxxbs = new HashSet<YxxJbxgctaJcxxb>(
			0);
	private Set<SysXzJcxxb> sysXzJcxxbs = new HashSet<SysXzJcxxb>(0);
	private Set<SysGgnJcxxb> sysGgnJcxxbs = new HashSet<SysGgnJcxxb>(0);
	private Set<SysQtJcxxb> sysQtJcxxbs = new HashSet<SysQtJcxxb>(0);

	// Constructors

	/** default constructor */
	public Blxxb() {
	}

	/** full constructor */
	public Blxxb(Yhxxb yhxxb, String xjblHzbh, String xjblHzzyyy,
			Timestamp xjblXxlrsj, String xjblZyh, Timestamp xjblRyrq,
			String xjblXm, String xjblZjlx, String xjblZjhm, String xjblXb,
			Timestamp xjblCsrq, String xjblZyzd, BigDecimal jbxxNl,
			String jbxxMz, String jbxxHyzk, String jbxxWhcd, String jbxxYblx,
			String jbxxZy, String jbxxJgsf, String jbxxJgdq, String jbxxJgx,
			String jbxxXzzsf, String jbxxXzzdq, String jbxxXzzx,
			String jbxxXzz, String jbxxLxdh01, String jbxxLxdh02,
			String jwsNgs, Timestamp jwsNgsfbsj, String jwsNcx,
			Timestamp jwsNcxfbsj, String jwsZwmxqcx, Timestamp jwsZwmxqcxfbsj,
			String jwsLnjmxtxsxc, Timestamp jwsLnjmxtxsxcfbsj, String jwsLndml,
			Timestamp jwsLndmlfbsj, String jwsLnxgjx, Timestamp jwsLnxgjxfbsj,
			String jwsTia, Timestamp jwsTiafbsj, String jwsXzb,
			String jwsXzblx, String jwsXzblxzqt, String jwsTnb,
			BigDecimal jwsTnbbc, String jwsTnbzl, String jwsGxy,
			BigDecimal jwsGxybc, String jwsGxyzl, String jwsXzyc,
			BigDecimal jwsXzycbc, String jwsXzyczl, String jwsSss,
			String jwsSssxq, String grsXy, String grsYj, String grsTydl,
			String jzsNzz, String jzsGxy, String jzsTnb, String jzsGxb,
			String jzsYcbs, String yyqkJy, String yyqkJyywlx, String yyqkJt,
			String yyqkJtywlx, String yyqkTz, String yyqkTzywlx,
			String yyqkKxxb, String yyqkKxxbywlx, String yyqkKn,
			String yyqkKnywlx, String yyqkJtxbgas, String yyqkJtxbgasywlx,
			String yyqkRs, String yyqkRsywlx, Timestamp bltdQbsj,
			Timestamp bltdJzsj, BigDecimal bltdBc, String bltdDysyszt,
			String bltdZs, String bltdOscpfx, BigDecimal bltdJzsnihsspf,
			BigDecimal bltdJz24hnihsspf, BigDecimal bltdQbqmrspf,
			BigDecimal bltdJzsmrspf, BigDecimal bltdJzsgcspf,
			BigDecimal bltdJzsmmsepf, BigDecimal tgjcSg, BigDecimal tgjcTz,
			BigDecimal tgjcBmi, BigDecimal tgjcTw, BigDecimal tgjcHx,
			BigDecimal tgjcMb, BigDecimal tgjcXl, BigDecimal tgjcSsy,
			BigDecimal tgjcSzy, String tgjcTygnza, String rszlRs,
			String rszlWrsyy, String rszlWrsyyzrsjjz, Timestamp rszlRssj,
			String rszlGylb, String rszlGylbzqt, String rszlGytj,
			BigDecimal rszlNihsspf, BigDecimal rszlGyqssy,
			BigDecimal rszlGyqszy, String rszlRsqsfjyzl, String rszlBfyzdqscx,
			String rszlSfbflncx, String rszlBflncxzsfwzzxcx,
			BigDecimal rszlRtpazjl, BigDecimal rszlHztz,
			BigDecimal rszlMgjtzrtpajl, String rszlRtpasfgzjl,
			String rszlWngzjlyy, String rszlWngzjlyyzqt, String ywzlKszl,
			String ywzlWzlyy, String ywzlKszlgyzl, String ywzlElkxxb,
			BigDecimal ywzlElkxxbzlsj, String ywzlJy, String ywzlJyywlx,
			String ywzlJygytj, String ywzlJt, String ywzlJtywlx, String ywzlTz,
			String ywzlTzywlx, String ywzlJtxbgas, String ywzlJtxbgasywlx,
			String ywzlJq, String ywzlJqywlxjjl, String ywzlJdlny,
			String ywzlJdlnyywlx, String ywzlZxyw, String ywzlZxywywlx,
			String ywzlSx, String ywzlSxsxlx, String ywzlYfnxgjl,
			String ywzlJszl, String ywzlKdxzl, String ywzlKgrzl,
			String ywzlZyzcyzl, String fywzlJdmnmbts,
			Timestamp fywzlJdmnmbtssssj, String fywzlJdmnmbtssswz,
			String fywzlJdmnmbtsbfz, String fywzlJdmzjzrs,
			Timestamp fywzlJdmzjzrssssj, String fywzlJdmzjzrssswz,
			String fywzlJdmzjzrssswzzcxq, String fywzlJdmzjzrssswyzcxq,
			String fywzlJdmzjzrsbfz, String fywzlJdmzjzrsbfzxq,
			String fywzlNcxsszl, Timestamp fywzlNcxsszlsssj,
			String fywzlNcxsszlssfs, String fywzlLndmlsszl,
			Timestamp fywzlLndmlsszlsssj, String fywzlLndmlsszlssfs,
			String fywzlXgnzlxq, String fywzlCjxzlxq, String fywzlFcjxzlxq,
			String fywzlLndjmjxsszl, Timestamp fywzlLndjmjxsszlsssj,
			String fywzlLndjmjxsszlssfs, String fywzlLnyjc,
			Timestamp fywzlLnyjcczsj, String fywzlQgcg,
			Timestamp fywzlQgcgczsj, String fywzlQgqk, Timestamp fywzlQgqkczsj,
			String fywzlJxtq, Timestamp fywzlJxtqczsj, String fywzlWzls,
			Timestamp fywzlWzlsczsj, String fywzlBwgfz,
			Timestamp fywzlBwgfzczsj, String bfzhbzDx, String bfzhbzYy,
			String bfzhbzFc, String bfzhbzXjgs, String bfzhbzXtjt,
			String bfzhbzFbgr, String bfzhbzFss, String bfzhbzHxjt,
			String bfzhbzXhdcx, String bfzhbzMnxtgr, String bfzhbzSjmxs,
			String bfzhbzRc, String bfzhbzNdxz, String bfzhbzDs,
			Timestamp cyqkCysj, BigDecimal cyqkZyts, String cyqkCyzyzd,
			String cyqkNgsby, String cyqkNgsbyzqt, String cyqkQtcyzd,
			BigDecimal cyqkNihsspf, BigDecimal cyqkMrspf, BigDecimal cyqkGcspf,
			BigDecimal cyqkMmsepf, BigDecimal cyqkHJllbpf,
			BigDecimal cyqkHYylbpf, Timestamp xdtJcsj, String xdtJg,
			String xdtSfwzcxdt, String xdtYcxq, String xdtYcxqzqt,
			String jyTgjy, Timestamp jyTgjysj, Set<Sfxxb> sfxxbs,
			Set<YxxQndsaJcxxb> yxxQndsaJcxxbs, Set<SysDjzJcxxb> sysDjzJcxxbs,
			Set<YxxJldpltcdJcxxb> yxxJldpltcdJcxxbs,
			Set<SysSgnJcxxb> sysSgnJcxxbs,
			Set<SysXjssbjwJcxxb> sysXjssbjwJcxxbs, Set<Dicomxxb> dicomxxbs,
			Set<SysXcgJcxxb> sysXcgJcxxbs, Set<YxxTlctJcxxb> yxxTlctJcxxbs,
			Set<YxxXzxgccJcxxb> yxxXzxgccJcxxbs, Set<SysTdxJcxxb> sysTdxJcxxbs,
			Set<SysXgyzbJcxxb> sysXgyzbJcxxbs,
			Set<YxxLnxgmraJcxxb> yxxLnxgmraJcxxbs,
			Set<YxxJbxgccJcxxb> yxxJbxgccJcxxbs,
			Set<YxxLnxgctaJcxxb> yxxLnxgctaJcxxbs,
			Set<YxxTlmriJcxxb> yxxTlmriJcxxbs, Set<SysNcgJcxxb> sysNcgJcxxbs,
			Set<SysNxgnJcxxb> sysNxgnJcxxbs,
			Set<YxxJbxgctaJcxxb> yxxJbxgctaJcxxbs, Set<SysXzJcxxb> sysXzJcxxbs,
			Set<SysGgnJcxxb> sysGgnJcxxbs, Set<SysQtJcxxb> sysQtJcxxbs) {
		this.yhxxb = yhxxb;
		this.xjblHzbh = xjblHzbh;
		this.xjblHzzyyy = xjblHzzyyy;
		this.xjblXxlrsj = xjblXxlrsj;
		this.xjblZyh = xjblZyh;
		this.xjblRyrq = xjblRyrq;
		this.xjblXm = xjblXm;
		this.xjblZjlx = xjblZjlx;
		this.xjblZjhm = xjblZjhm;
		this.xjblXb = xjblXb;
		this.xjblCsrq = xjblCsrq;
		this.xjblZyzd = xjblZyzd;
		this.jbxxNl = jbxxNl;
		this.jbxxMz = jbxxMz;
		this.jbxxHyzk = jbxxHyzk;
		this.jbxxWhcd = jbxxWhcd;
		this.jbxxYblx = jbxxYblx;
		this.jbxxZy = jbxxZy;
		this.jbxxJgsf = jbxxJgsf;
		this.jbxxJgdq = jbxxJgdq;
		this.jbxxJgx = jbxxJgx;
		this.jbxxXzzsf = jbxxXzzsf;
		this.jbxxXzzdq = jbxxXzzdq;
		this.jbxxXzzx = jbxxXzzx;
		this.jbxxXzz = jbxxXzz;
		this.jbxxLxdh01 = jbxxLxdh01;
		this.jbxxLxdh02 = jbxxLxdh02;
		this.jwsNgs = jwsNgs;
		this.jwsNgsfbsj = jwsNgsfbsj;
		this.jwsNcx = jwsNcx;
		this.jwsNcxfbsj = jwsNcxfbsj;
		this.jwsZwmxqcx = jwsZwmxqcx;
		this.jwsZwmxqcxfbsj = jwsZwmxqcxfbsj;
		this.jwsLnjmxtxsxc = jwsLnjmxtxsxc;
		this.jwsLnjmxtxsxcfbsj = jwsLnjmxtxsxcfbsj;
		this.jwsLndml = jwsLndml;
		this.jwsLndmlfbsj = jwsLndmlfbsj;
		this.jwsLnxgjx = jwsLnxgjx;
		this.jwsLnxgjxfbsj = jwsLnxgjxfbsj;
		this.jwsTia = jwsTia;
		this.jwsTiafbsj = jwsTiafbsj;
		this.jwsXzb = jwsXzb;
		this.jwsXzblx = jwsXzblx;
		this.jwsXzblxzqt = jwsXzblxzqt;
		this.jwsTnb = jwsTnb;
		this.jwsTnbbc = jwsTnbbc;
		this.jwsTnbzl = jwsTnbzl;
		this.jwsGxy = jwsGxy;
		this.jwsGxybc = jwsGxybc;
		this.jwsGxyzl = jwsGxyzl;
		this.jwsXzyc = jwsXzyc;
		this.jwsXzycbc = jwsXzycbc;
		this.jwsXzyczl = jwsXzyczl;
		this.jwsSss = jwsSss;
		this.jwsSssxq = jwsSssxq;
		this.grsXy = grsXy;
		this.grsYj = grsYj;
		this.grsTydl = grsTydl;
		this.jzsNzz = jzsNzz;
		this.jzsGxy = jzsGxy;
		this.jzsTnb = jzsTnb;
		this.jzsGxb = jzsGxb;
		this.jzsYcbs = jzsYcbs;
		this.yyqkJy = yyqkJy;
		this.yyqkJyywlx = yyqkJyywlx;
		this.yyqkJt = yyqkJt;
		this.yyqkJtywlx = yyqkJtywlx;
		this.yyqkTz = yyqkTz;
		this.yyqkTzywlx = yyqkTzywlx;
		this.yyqkKxxb = yyqkKxxb;
		this.yyqkKxxbywlx = yyqkKxxbywlx;
		this.yyqkKn = yyqkKn;
		this.yyqkKnywlx = yyqkKnywlx;
		this.yyqkJtxbgas = yyqkJtxbgas;
		this.yyqkJtxbgasywlx = yyqkJtxbgasywlx;
		this.yyqkRs = yyqkRs;
		this.yyqkRsywlx = yyqkRsywlx;
		this.bltdQbsj = bltdQbsj;
		this.bltdJzsj = bltdJzsj;
		this.bltdBc = bltdBc;
		this.bltdDysyszt = bltdDysyszt;
		this.bltdZs = bltdZs;
		this.bltdOscpfx = bltdOscpfx;
		this.bltdJzsnihsspf = bltdJzsnihsspf;
		this.bltdJz24hnihsspf = bltdJz24hnihsspf;
		this.bltdQbqmrspf = bltdQbqmrspf;
		this.bltdJzsmrspf = bltdJzsmrspf;
		this.bltdJzsgcspf = bltdJzsgcspf;
		this.bltdJzsmmsepf = bltdJzsmmsepf;
		this.tgjcSg = tgjcSg;
		this.tgjcTz = tgjcTz;
		this.tgjcBmi = tgjcBmi;
		this.tgjcTw = tgjcTw;
		this.tgjcHx = tgjcHx;
		this.tgjcMb = tgjcMb;
		this.tgjcXl = tgjcXl;
		this.tgjcSsy = tgjcSsy;
		this.tgjcSzy = tgjcSzy;
		this.tgjcTygnza = tgjcTygnza;
		this.rszlRs = rszlRs;
		this.rszlWrsyy = rszlWrsyy;
		this.rszlWrsyyzrsjjz = rszlWrsyyzrsjjz;
		this.rszlRssj = rszlRssj;
		this.rszlGylb = rszlGylb;
		this.rszlGylbzqt = rszlGylbzqt;
		this.rszlGytj = rszlGytj;
		this.rszlNihsspf = rszlNihsspf;
		this.rszlGyqssy = rszlGyqssy;
		this.rszlGyqszy = rszlGyqszy;
		this.rszlRsqsfjyzl = rszlRsqsfjyzl;
		this.rszlBfyzdqscx = rszlBfyzdqscx;
		this.rszlSfbflncx = rszlSfbflncx;
		this.rszlBflncxzsfwzzxcx = rszlBflncxzsfwzzxcx;
		this.rszlRtpazjl = rszlRtpazjl;
		this.rszlHztz = rszlHztz;
		this.rszlMgjtzrtpajl = rszlMgjtzrtpajl;
		this.rszlRtpasfgzjl = rszlRtpasfgzjl;
		this.rszlWngzjlyy = rszlWngzjlyy;
		this.rszlWngzjlyyzqt = rszlWngzjlyyzqt;
		this.ywzlKszl = ywzlKszl;
		this.ywzlWzlyy = ywzlWzlyy;
		this.ywzlKszlgyzl = ywzlKszlgyzl;
		this.ywzlElkxxb = ywzlElkxxb;
		this.ywzlElkxxbzlsj = ywzlElkxxbzlsj;
		this.ywzlJy = ywzlJy;
		this.ywzlJyywlx = ywzlJyywlx;
		this.ywzlJygytj = ywzlJygytj;
		this.ywzlJt = ywzlJt;
		this.ywzlJtywlx = ywzlJtywlx;
		this.ywzlTz = ywzlTz;
		this.ywzlTzywlx = ywzlTzywlx;
		this.ywzlJtxbgas = ywzlJtxbgas;
		this.ywzlJtxbgasywlx = ywzlJtxbgasywlx;
		this.ywzlJq = ywzlJq;
		this.ywzlJqywlxjjl = ywzlJqywlxjjl;
		this.ywzlJdlny = ywzlJdlny;
		this.ywzlJdlnyywlx = ywzlJdlnyywlx;
		this.ywzlZxyw = ywzlZxyw;
		this.ywzlZxywywlx = ywzlZxywywlx;
		this.ywzlSx = ywzlSx;
		this.ywzlSxsxlx = ywzlSxsxlx;
		this.ywzlYfnxgjl = ywzlYfnxgjl;
		this.ywzlJszl = ywzlJszl;
		this.ywzlKdxzl = ywzlKdxzl;
		this.ywzlKgrzl = ywzlKgrzl;
		this.ywzlZyzcyzl = ywzlZyzcyzl;
		this.fywzlJdmnmbts = fywzlJdmnmbts;
		this.fywzlJdmnmbtssssj = fywzlJdmnmbtssssj;
		this.fywzlJdmnmbtssswz = fywzlJdmnmbtssswz;
		this.fywzlJdmnmbtsbfz = fywzlJdmnmbtsbfz;
		this.fywzlJdmzjzrs = fywzlJdmzjzrs;
		this.fywzlJdmzjzrssssj = fywzlJdmzjzrssssj;
		this.fywzlJdmzjzrssswz = fywzlJdmzjzrssswz;
		this.fywzlJdmzjzrssswzzcxq = fywzlJdmzjzrssswzzcxq;
		this.fywzlJdmzjzrssswyzcxq = fywzlJdmzjzrssswyzcxq;
		this.fywzlJdmzjzrsbfz = fywzlJdmzjzrsbfz;
		this.fywzlJdmzjzrsbfzxq = fywzlJdmzjzrsbfzxq;
		this.fywzlNcxsszl = fywzlNcxsszl;
		this.fywzlNcxsszlsssj = fywzlNcxsszlsssj;
		this.fywzlNcxsszlssfs = fywzlNcxsszlssfs;
		this.fywzlLndmlsszl = fywzlLndmlsszl;
		this.fywzlLndmlsszlsssj = fywzlLndmlsszlsssj;
		this.fywzlLndmlsszlssfs = fywzlLndmlsszlssfs;
		this.fywzlXgnzlxq = fywzlXgnzlxq;
		this.fywzlCjxzlxq = fywzlCjxzlxq;
		this.fywzlFcjxzlxq = fywzlFcjxzlxq;
		this.fywzlLndjmjxsszl = fywzlLndjmjxsszl;
		this.fywzlLndjmjxsszlsssj = fywzlLndjmjxsszlsssj;
		this.fywzlLndjmjxsszlssfs = fywzlLndjmjxsszlssfs;
		this.fywzlLnyjc = fywzlLnyjc;
		this.fywzlLnyjcczsj = fywzlLnyjcczsj;
		this.fywzlQgcg = fywzlQgcg;
		this.fywzlQgcgczsj = fywzlQgcgczsj;
		this.fywzlQgqk = fywzlQgqk;
		this.fywzlQgqkczsj = fywzlQgqkczsj;
		this.fywzlJxtq = fywzlJxtq;
		this.fywzlJxtqczsj = fywzlJxtqczsj;
		this.fywzlWzls = fywzlWzls;
		this.fywzlWzlsczsj = fywzlWzlsczsj;
		this.fywzlBwgfz = fywzlBwgfz;
		this.fywzlBwgfzczsj = fywzlBwgfzczsj;
		this.bfzhbzDx = bfzhbzDx;
		this.bfzhbzYy = bfzhbzYy;
		this.bfzhbzFc = bfzhbzFc;
		this.bfzhbzXjgs = bfzhbzXjgs;
		this.bfzhbzXtjt = bfzhbzXtjt;
		this.bfzhbzFbgr = bfzhbzFbgr;
		this.bfzhbzFss = bfzhbzFss;
		this.bfzhbzHxjt = bfzhbzHxjt;
		this.bfzhbzXhdcx = bfzhbzXhdcx;
		this.bfzhbzMnxtgr = bfzhbzMnxtgr;
		this.bfzhbzSjmxs = bfzhbzSjmxs;
		this.bfzhbzRc = bfzhbzRc;
		this.bfzhbzNdxz = bfzhbzNdxz;
		this.bfzhbzDs = bfzhbzDs;
		this.cyqkCysj = cyqkCysj;
		this.cyqkZyts = cyqkZyts;
		this.cyqkCyzyzd = cyqkCyzyzd;
		this.cyqkNgsby = cyqkNgsby;
		this.cyqkNgsbyzqt = cyqkNgsbyzqt;
		this.cyqkQtcyzd = cyqkQtcyzd;
		this.cyqkNihsspf = cyqkNihsspf;
		this.cyqkMrspf = cyqkMrspf;
		this.cyqkGcspf = cyqkGcspf;
		this.cyqkMmsepf = cyqkMmsepf;
		this.cyqkHJllbpf = cyqkHJllbpf;
		this.cyqkHYylbpf = cyqkHYylbpf;
		this.xdtJcsj = xdtJcsj;
		this.xdtJg = xdtJg;
		this.xdtSfwzcxdt = xdtSfwzcxdt;
		this.xdtYcxq = xdtYcxq;
		this.xdtYcxqzqt = xdtYcxqzqt;
		this.jyTgjy = jyTgjy;
		this.jyTgjysj = jyTgjysj;
		this.sfxxbs = sfxxbs;
		this.yxxQndsaJcxxbs = yxxQndsaJcxxbs;
		this.sysDjzJcxxbs = sysDjzJcxxbs;
		this.yxxJldpltcdJcxxbs = yxxJldpltcdJcxxbs;
		this.sysSgnJcxxbs = sysSgnJcxxbs;
		this.sysXjssbjwJcxxbs = sysXjssbjwJcxxbs;
		this.dicomxxbs = dicomxxbs;
		this.sysXcgJcxxbs = sysXcgJcxxbs;
		this.yxxTlctJcxxbs = yxxTlctJcxxbs;
		this.yxxXzxgccJcxxbs = yxxXzxgccJcxxbs;
		this.sysTdxJcxxbs = sysTdxJcxxbs;
		this.sysXgyzbJcxxbs = sysXgyzbJcxxbs;
		this.yxxLnxgmraJcxxbs = yxxLnxgmraJcxxbs;
		this.yxxJbxgccJcxxbs = yxxJbxgccJcxxbs;
		this.yxxLnxgctaJcxxbs = yxxLnxgctaJcxxbs;
		this.yxxTlmriJcxxbs = yxxTlmriJcxxbs;
		this.sysNcgJcxxbs = sysNcgJcxxbs;
		this.sysNxgnJcxxbs = sysNxgnJcxxbs;
		this.yxxJbxgctaJcxxbs = yxxJbxgctaJcxxbs;
		this.sysXzJcxxbs = sysXzJcxxbs;
		this.sysGgnJcxxbs = sysGgnJcxxbs;
		this.sysQtJcxxbs = sysQtJcxxbs;
	}

//	@GenericGenerator(name = "generator", strategy = "org.yxnu.common.util.GeneratePK", parameters = {
//			   @Parameter(name = "classname", value = "JcJsxxb"),
//			   @Parameter(name = "pk", value = "jsbh"),
//			   @Parameter(name = "sign", value = "JS"),
//			   @Parameter(name = "idLength", value = "10") })
//	@GeneratedValue(generator = "generator")
	@Id
	@GeneratedValue
	@Column(name = "XJBL_BLBH", unique = true, nullable = false, length = 21)
	public String getXjblBlbh() {
		return this.xjblBlbh;
	}

	public void setXjblBlbh(String xjblBlbh) {
		this.xjblBlbh = xjblBlbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "XJBL_XXLRRBH")
	public Yhxxb getYhxxb() {
		return this.yhxxb;
	}

	public void setYhxxb(Yhxxb yhxxb) {
		this.yhxxb = yhxxb;
	}

	@Column(name = "XJBL_HZBH", length = 32)
	public String getXjblHzbh() {
		return this.xjblHzbh;
	}

	public void setXjblHzbh(String xjblHzbh) {
		this.xjblHzbh = xjblHzbh;
	}

	@Column(name = "XJBL_HZZYYY", length = 50)
	public String getXjblHzzyyy() {
		return this.xjblHzzyyy;
	}

	public void setXjblHzzyyy(String xjblHzzyyy) {
		this.xjblHzzyyy = xjblHzzyyy;
	}

	@Column(name = "XJBL_XXLRSJ", length = 7)
	public Timestamp getXjblXxlrsj() {
		return this.xjblXxlrsj;
	}

	public void setXjblXxlrsj(Timestamp xjblXxlrsj) {
		this.xjblXxlrsj = xjblXxlrsj;
	}

	@Column(name = "XJBL_ZYH", length = 30)
	public String getXjblZyh() {
		return this.xjblZyh;
	}

	public void setXjblZyh(String xjblZyh) {
		this.xjblZyh = xjblZyh;
	}

	@Column(name = "XJBL_RYRQ", length = 7)
	public Timestamp getXjblRyrq() {
		return this.xjblRyrq;
	}

	public void setXjblRyrq(Timestamp xjblRyrq) {
		this.xjblRyrq = xjblRyrq;
	}

	@Column(name = "XJBL_XM", length = 20)
	public String getXjblXm() {
		return this.xjblXm;
	}

	public void setXjblXm(String xjblXm) {
		this.xjblXm = xjblXm;
	}

	@Column(name = "XJBL_ZJLX", length = 20)
	public String getXjblZjlx() {
		return this.xjblZjlx;
	}

	public void setXjblZjlx(String xjblZjlx) {
		this.xjblZjlx = xjblZjlx;
	}

	@Column(name = "XJBL_ZJHM", length = 30)
	public String getXjblZjhm() {
		return this.xjblZjhm;
	}

	public void setXjblZjhm(String xjblZjhm) {
		this.xjblZjhm = xjblZjhm;
	}

	@Column(name = "XJBL_XB", length = 4)
	public String getXjblXb() {
		return this.xjblXb;
	}

	public void setXjblXb(String xjblXb) {
		this.xjblXb = xjblXb;
	}

	@Column(name = "XJBL_CSRQ", length = 7)
	public Timestamp getXjblCsrq() {
		return this.xjblCsrq;
	}

	public void setXjblCsrq(Timestamp xjblCsrq) {
		this.xjblCsrq = xjblCsrq;
	}

	@Column(name = "XJBL_ZYZD", length = 20)
	public String getXjblZyzd() {
		return this.xjblZyzd;
	}

	public void setXjblZyzd(String xjblZyzd) {
		this.xjblZyzd = xjblZyzd;
	}

	@Column(name = "JBXX_NL", precision = 22, scale = 0)
	public BigDecimal getJbxxNl() {
		return this.jbxxNl;
	}

	public void setJbxxNl(BigDecimal jbxxNl) {
		this.jbxxNl = jbxxNl;
	}

	@Column(name = "JBXX_MZ", length = 20)
	public String getJbxxMz() {
		return this.jbxxMz;
	}

	public void setJbxxMz(String jbxxMz) {
		this.jbxxMz = jbxxMz;
	}

	@Column(name = "JBXX_HYZK", length = 10)
	public String getJbxxHyzk() {
		return this.jbxxHyzk;
	}

	public void setJbxxHyzk(String jbxxHyzk) {
		this.jbxxHyzk = jbxxHyzk;
	}

	@Column(name = "JBXX_WHCD", length = 20)
	public String getJbxxWhcd() {
		return this.jbxxWhcd;
	}

	public void setJbxxWhcd(String jbxxWhcd) {
		this.jbxxWhcd = jbxxWhcd;
	}

	@Column(name = "JBXX_YBLX", length = 20)
	public String getJbxxYblx() {
		return this.jbxxYblx;
	}

	public void setJbxxYblx(String jbxxYblx) {
		this.jbxxYblx = jbxxYblx;
	}

	@Column(name = "JBXX_ZY", length = 20)
	public String getJbxxZy() {
		return this.jbxxZy;
	}

	public void setJbxxZy(String jbxxZy) {
		this.jbxxZy = jbxxZy;
	}

	@Column(name = "JBXX_JGSF", length = 20)
	public String getJbxxJgsf() {
		return this.jbxxJgsf;
	}

	public void setJbxxJgsf(String jbxxJgsf) {
		this.jbxxJgsf = jbxxJgsf;
	}

	@Column(name = "JBXX_JGDQ", length = 20)
	public String getJbxxJgdq() {
		return this.jbxxJgdq;
	}

	public void setJbxxJgdq(String jbxxJgdq) {
		this.jbxxJgdq = jbxxJgdq;
	}

	@Column(name = "JBXX_JGX", length = 20)
	public String getJbxxJgx() {
		return this.jbxxJgx;
	}

	public void setJbxxJgx(String jbxxJgx) {
		this.jbxxJgx = jbxxJgx;
	}

	@Column(name = "JBXX_XZZSF", length = 20)
	public String getJbxxXzzsf() {
		return this.jbxxXzzsf;
	}

	public void setJbxxXzzsf(String jbxxXzzsf) {
		this.jbxxXzzsf = jbxxXzzsf;
	}

	@Column(name = "JBXX_XZZDQ", length = 20)
	public String getJbxxXzzdq() {
		return this.jbxxXzzdq;
	}

	public void setJbxxXzzdq(String jbxxXzzdq) {
		this.jbxxXzzdq = jbxxXzzdq;
	}

	@Column(name = "JBXX_XZZX", length = 20)
	public String getJbxxXzzx() {
		return this.jbxxXzzx;
	}

	public void setJbxxXzzx(String jbxxXzzx) {
		this.jbxxXzzx = jbxxXzzx;
	}

	@Column(name = "JBXX_XZZ", length = 100)
	public String getJbxxXzz() {
		return this.jbxxXzz;
	}

	public void setJbxxXzz(String jbxxXzz) {
		this.jbxxXzz = jbxxXzz;
	}

	@Column(name = "JBXX_LXDH01", length = 20)
	public String getJbxxLxdh01() {
		return this.jbxxLxdh01;
	}

	public void setJbxxLxdh01(String jbxxLxdh01) {
		this.jbxxLxdh01 = jbxxLxdh01;
	}

	@Column(name = "JBXX_LXDH02", length = 20)
	public String getJbxxLxdh02() {
		return this.jbxxLxdh02;
	}

	public void setJbxxLxdh02(String jbxxLxdh02) {
		this.jbxxLxdh02 = jbxxLxdh02;
	}

	@Column(name = "JWS_NGS", length = 4)
	public String getJwsNgs() {
		return this.jwsNgs;
	}

	public void setJwsNgs(String jwsNgs) {
		this.jwsNgs = jwsNgs;
	}

	@Column(name = "JWS_NGSFBSJ", length = 7)
	public Timestamp getJwsNgsfbsj() {
		return this.jwsNgsfbsj;
	}

	public void setJwsNgsfbsj(Timestamp jwsNgsfbsj) {
		this.jwsNgsfbsj = jwsNgsfbsj;
	}

	@Column(name = "JWS_NCX", length = 4)
	public String getJwsNcx() {
		return this.jwsNcx;
	}

	public void setJwsNcx(String jwsNcx) {
		this.jwsNcx = jwsNcx;
	}

	@Column(name = "JWS_NCXFBSJ", length = 7)
	public Timestamp getJwsNcxfbsj() {
		return this.jwsNcxfbsj;
	}

	public void setJwsNcxfbsj(Timestamp jwsNcxfbsj) {
		this.jwsNcxfbsj = jwsNcxfbsj;
	}

	@Column(name = "JWS_ZWMXQCX", length = 4)
	public String getJwsZwmxqcx() {
		return this.jwsZwmxqcx;
	}

	public void setJwsZwmxqcx(String jwsZwmxqcx) {
		this.jwsZwmxqcx = jwsZwmxqcx;
	}

	@Column(name = "JWS_ZWMXQCXFBSJ", length = 7)
	public Timestamp getJwsZwmxqcxfbsj() {
		return this.jwsZwmxqcxfbsj;
	}

	public void setJwsZwmxqcxfbsj(Timestamp jwsZwmxqcxfbsj) {
		this.jwsZwmxqcxfbsj = jwsZwmxqcxfbsj;
	}

	@Column(name = "JWS_LNJMXTXSXC", length = 4)
	public String getJwsLnjmxtxsxc() {
		return this.jwsLnjmxtxsxc;
	}

	public void setJwsLnjmxtxsxc(String jwsLnjmxtxsxc) {
		this.jwsLnjmxtxsxc = jwsLnjmxtxsxc;
	}

	@Column(name = "JWS_LNJMXTXSXCFBSJ", length = 7)
	public Timestamp getJwsLnjmxtxsxcfbsj() {
		return this.jwsLnjmxtxsxcfbsj;
	}

	public void setJwsLnjmxtxsxcfbsj(Timestamp jwsLnjmxtxsxcfbsj) {
		this.jwsLnjmxtxsxcfbsj = jwsLnjmxtxsxcfbsj;
	}

	@Column(name = "JWS_LNDML", length = 4)
	public String getJwsLndml() {
		return this.jwsLndml;
	}

	public void setJwsLndml(String jwsLndml) {
		this.jwsLndml = jwsLndml;
	}

	@Column(name = "JWS_LNDMLFBSJ", length = 7)
	public Timestamp getJwsLndmlfbsj() {
		return this.jwsLndmlfbsj;
	}

	public void setJwsLndmlfbsj(Timestamp jwsLndmlfbsj) {
		this.jwsLndmlfbsj = jwsLndmlfbsj;
	}

	@Column(name = "JWS_LNXGJX", length = 4)
	public String getJwsLnxgjx() {
		return this.jwsLnxgjx;
	}

	public void setJwsLnxgjx(String jwsLnxgjx) {
		this.jwsLnxgjx = jwsLnxgjx;
	}

	@Column(name = "JWS_LNXGJXFBSJ", length = 7)
	public Timestamp getJwsLnxgjxfbsj() {
		return this.jwsLnxgjxfbsj;
	}

	public void setJwsLnxgjxfbsj(Timestamp jwsLnxgjxfbsj) {
		this.jwsLnxgjxfbsj = jwsLnxgjxfbsj;
	}

	@Column(name = "JWS_TIA", length = 4)
	public String getJwsTia() {
		return this.jwsTia;
	}

	public void setJwsTia(String jwsTia) {
		this.jwsTia = jwsTia;
	}

	@Column(name = "JWS_TIAFBSJ", length = 7)
	public Timestamp getJwsTiafbsj() {
		return this.jwsTiafbsj;
	}

	public void setJwsTiafbsj(Timestamp jwsTiafbsj) {
		this.jwsTiafbsj = jwsTiafbsj;
	}

	@Column(name = "JWS_XZB", length = 4)
	public String getJwsXzb() {
		return this.jwsXzb;
	}

	public void setJwsXzb(String jwsXzb) {
		this.jwsXzb = jwsXzb;
	}

	@Column(name = "JWS_XZBLX", length = 30)
	public String getJwsXzblx() {
		return this.jwsXzblx;
	}

	public void setJwsXzblx(String jwsXzblx) {
		this.jwsXzblx = jwsXzblx;
	}

	@Column(name = "JWS_XZBLXZQT", length = 100)
	public String getJwsXzblxzqt() {
		return this.jwsXzblxzqt;
	}

	public void setJwsXzblxzqt(String jwsXzblxzqt) {
		this.jwsXzblxzqt = jwsXzblxzqt;
	}

	@Column(name = "JWS_TNB", length = 4)
	public String getJwsTnb() {
		return this.jwsTnb;
	}

	public void setJwsTnb(String jwsTnb) {
		this.jwsTnb = jwsTnb;
	}

	@Column(name = "JWS_TNBBC", precision = 22, scale = 0)
	public BigDecimal getJwsTnbbc() {
		return this.jwsTnbbc;
	}

	public void setJwsTnbbc(BigDecimal jwsTnbbc) {
		this.jwsTnbbc = jwsTnbbc;
	}

	@Column(name = "JWS_TNBZL", length = 10)
	public String getJwsTnbzl() {
		return this.jwsTnbzl;
	}

	public void setJwsTnbzl(String jwsTnbzl) {
		this.jwsTnbzl = jwsTnbzl;
	}

	@Column(name = "JWS_GXY", length = 4)
	public String getJwsGxy() {
		return this.jwsGxy;
	}

	public void setJwsGxy(String jwsGxy) {
		this.jwsGxy = jwsGxy;
	}

	@Column(name = "JWS_GXYBC", precision = 22, scale = 0)
	public BigDecimal getJwsGxybc() {
		return this.jwsGxybc;
	}

	public void setJwsGxybc(BigDecimal jwsGxybc) {
		this.jwsGxybc = jwsGxybc;
	}

	@Column(name = "JWS_GXYZL", length = 10)
	public String getJwsGxyzl() {
		return this.jwsGxyzl;
	}

	public void setJwsGxyzl(String jwsGxyzl) {
		this.jwsGxyzl = jwsGxyzl;
	}

	@Column(name = "JWS_XZYC", length = 4)
	public String getJwsXzyc() {
		return this.jwsXzyc;
	}

	public void setJwsXzyc(String jwsXzyc) {
		this.jwsXzyc = jwsXzyc;
	}

	@Column(name = "JWS_XZYCBC", precision = 22, scale = 0)
	public BigDecimal getJwsXzycbc() {
		return this.jwsXzycbc;
	}

	public void setJwsXzycbc(BigDecimal jwsXzycbc) {
		this.jwsXzycbc = jwsXzycbc;
	}

	@Column(name = "JWS_XZYCZL", length = 10)
	public String getJwsXzyczl() {
		return this.jwsXzyczl;
	}

	public void setJwsXzyczl(String jwsXzyczl) {
		this.jwsXzyczl = jwsXzyczl;
	}

	@Column(name = "JWS_SSS", length = 4)
	public String getJwsSss() {
		return this.jwsSss;
	}

	public void setJwsSss(String jwsSss) {
		this.jwsSss = jwsSss;
	}

	@Column(name = "JWS_SSSXQ", length = 100)
	public String getJwsSssxq() {
		return this.jwsSssxq;
	}

	public void setJwsSssxq(String jwsSssxq) {
		this.jwsSssxq = jwsSssxq;
	}

	@Column(name = "GRS_XY", length = 10)
	public String getGrsXy() {
		return this.grsXy;
	}

	public void setGrsXy(String grsXy) {
		this.grsXy = grsXy;
	}

	@Column(name = "GRS_YJ", length = 10)
	public String getGrsYj() {
		return this.grsYj;
	}

	public void setGrsYj(String grsYj) {
		this.grsYj = grsYj;
	}

	@Column(name = "GRS_TYDL", length = 20)
	public String getGrsTydl() {
		return this.grsTydl;
	}

	public void setGrsTydl(String grsTydl) {
		this.grsTydl = grsTydl;
	}

	@Column(name = "JZS_NZZ", length = 4)
	public String getJzsNzz() {
		return this.jzsNzz;
	}

	public void setJzsNzz(String jzsNzz) {
		this.jzsNzz = jzsNzz;
	}

	@Column(name = "JZS_GXY", length = 4)
	public String getJzsGxy() {
		return this.jzsGxy;
	}

	public void setJzsGxy(String jzsGxy) {
		this.jzsGxy = jzsGxy;
	}

	@Column(name = "JZS_TNB", length = 4)
	public String getJzsTnb() {
		return this.jzsTnb;
	}

	public void setJzsTnb(String jzsTnb) {
		this.jzsTnb = jzsTnb;
	}

	@Column(name = "JZS_GXB", length = 4)
	public String getJzsGxb() {
		return this.jzsGxb;
	}

	public void setJzsGxb(String jzsGxb) {
		this.jzsGxb = jzsGxb;
	}

	@Column(name = "JZS_YCBS", length = 4)
	public String getJzsYcbs() {
		return this.jzsYcbs;
	}

	public void setJzsYcbs(String jzsYcbs) {
		this.jzsYcbs = jzsYcbs;
	}

	@Column(name = "YYQK_JY", length = 4)
	public String getYyqkJy() {
		return this.yyqkJy;
	}

	public void setYyqkJy(String yyqkJy) {
		this.yyqkJy = yyqkJy;
	}

	@Column(name = "YYQK_JYYWLX", length = 200)
	public String getYyqkJyywlx() {
		return this.yyqkJyywlx;
	}

	public void setYyqkJyywlx(String yyqkJyywlx) {
		this.yyqkJyywlx = yyqkJyywlx;
	}

	@Column(name = "YYQK_JT", length = 4)
	public String getYyqkJt() {
		return this.yyqkJt;
	}

	public void setYyqkJt(String yyqkJt) {
		this.yyqkJt = yyqkJt;
	}

	@Column(name = "YYQK_JTYWLX", length = 200)
	public String getYyqkJtywlx() {
		return this.yyqkJtywlx;
	}

	public void setYyqkJtywlx(String yyqkJtywlx) {
		this.yyqkJtywlx = yyqkJtywlx;
	}

	@Column(name = "YYQK_TZ", length = 4)
	public String getYyqkTz() {
		return this.yyqkTz;
	}

	public void setYyqkTz(String yyqkTz) {
		this.yyqkTz = yyqkTz;
	}

	@Column(name = "YYQK_TZYWLX", length = 200)
	public String getYyqkTzywlx() {
		return this.yyqkTzywlx;
	}

	public void setYyqkTzywlx(String yyqkTzywlx) {
		this.yyqkTzywlx = yyqkTzywlx;
	}

	@Column(name = "YYQK_KXXB", length = 4)
	public String getYyqkKxxb() {
		return this.yyqkKxxb;
	}

	public void setYyqkKxxb(String yyqkKxxb) {
		this.yyqkKxxb = yyqkKxxb;
	}

	@Column(name = "YYQK_KXXBYWLX", length = 200)
	public String getYyqkKxxbywlx() {
		return this.yyqkKxxbywlx;
	}

	public void setYyqkKxxbywlx(String yyqkKxxbywlx) {
		this.yyqkKxxbywlx = yyqkKxxbywlx;
	}

	@Column(name = "YYQK_KN", length = 4)
	public String getYyqkKn() {
		return this.yyqkKn;
	}

	public void setYyqkKn(String yyqkKn) {
		this.yyqkKn = yyqkKn;
	}

	@Column(name = "YYQK_KNYWLX", length = 200)
	public String getYyqkKnywlx() {
		return this.yyqkKnywlx;
	}

	public void setYyqkKnywlx(String yyqkKnywlx) {
		this.yyqkKnywlx = yyqkKnywlx;
	}

	@Column(name = "YYQK_JTXBGAS", length = 4)
	public String getYyqkJtxbgas() {
		return this.yyqkJtxbgas;
	}

	public void setYyqkJtxbgas(String yyqkJtxbgas) {
		this.yyqkJtxbgas = yyqkJtxbgas;
	}

	@Column(name = "YYQK_JTXBGASYWLX", length = 200)
	public String getYyqkJtxbgasywlx() {
		return this.yyqkJtxbgasywlx;
	}

	public void setYyqkJtxbgasywlx(String yyqkJtxbgasywlx) {
		this.yyqkJtxbgasywlx = yyqkJtxbgasywlx;
	}

	@Column(name = "YYQK_RS", length = 4)
	public String getYyqkRs() {
		return this.yyqkRs;
	}

	public void setYyqkRs(String yyqkRs) {
		this.yyqkRs = yyqkRs;
	}

	@Column(name = "YYQK_RSYWLX", length = 200)
	public String getYyqkRsywlx() {
		return this.yyqkRsywlx;
	}

	public void setYyqkRsywlx(String yyqkRsywlx) {
		this.yyqkRsywlx = yyqkRsywlx;
	}

	@Column(name = "BLTD_QBSJ", length = 7)
	public Timestamp getBltdQbsj() {
		return this.bltdQbsj;
	}

	public void setBltdQbsj(Timestamp bltdQbsj) {
		this.bltdQbsj = bltdQbsj;
	}

	@Column(name = "BLTD_JZSJ", length = 7)
	public Timestamp getBltdJzsj() {
		return this.bltdJzsj;
	}

	public void setBltdJzsj(Timestamp bltdJzsj) {
		this.bltdJzsj = bltdJzsj;
	}

	@Column(name = "BLTD_BC", precision = 22, scale = 0)
	public BigDecimal getBltdBc() {
		return this.bltdBc;
	}

	public void setBltdBc(BigDecimal bltdBc) {
		this.bltdBc = bltdBc;
	}

	@Column(name = "BLTD_DYSYSZT", length = 10)
	public String getBltdDysyszt() {
		return this.bltdDysyszt;
	}

	public void setBltdDysyszt(String bltdDysyszt) {
		this.bltdDysyszt = bltdDysyszt;
	}

	@Column(name = "BLTD_ZS", length = 200)
	public String getBltdZs() {
		return this.bltdZs;
	}

	public void setBltdZs(String bltdZs) {
		this.bltdZs = bltdZs;
	}

	@Column(name = "BLTD_OSCPFX", length = 20)
	public String getBltdOscpfx() {
		return this.bltdOscpfx;
	}

	public void setBltdOscpfx(String bltdOscpfx) {
		this.bltdOscpfx = bltdOscpfx;
	}

	@Column(name = "BLTD_JZSNIHSSPF", precision = 22, scale = 0)
	public BigDecimal getBltdJzsnihsspf() {
		return this.bltdJzsnihsspf;
	}

	public void setBltdJzsnihsspf(BigDecimal bltdJzsnihsspf) {
		this.bltdJzsnihsspf = bltdJzsnihsspf;
	}

	@Column(name = "BLTD_JZ24HNIHSSPF", precision = 22, scale = 0)
	public BigDecimal getBltdJz24hnihsspf() {
		return this.bltdJz24hnihsspf;
	}

	public void setBltdJz24hnihsspf(BigDecimal bltdJz24hnihsspf) {
		this.bltdJz24hnihsspf = bltdJz24hnihsspf;
	}

	@Column(name = "BLTD_QBQMRSPF", precision = 22, scale = 0)
	public BigDecimal getBltdQbqmrspf() {
		return this.bltdQbqmrspf;
	}

	public void setBltdQbqmrspf(BigDecimal bltdQbqmrspf) {
		this.bltdQbqmrspf = bltdQbqmrspf;
	}

	@Column(name = "BLTD_JZSMRSPF", precision = 22, scale = 0)
	public BigDecimal getBltdJzsmrspf() {
		return this.bltdJzsmrspf;
	}

	public void setBltdJzsmrspf(BigDecimal bltdJzsmrspf) {
		this.bltdJzsmrspf = bltdJzsmrspf;
	}

	@Column(name = "BLTD_JZSGCSPF", precision = 22, scale = 0)
	public BigDecimal getBltdJzsgcspf() {
		return this.bltdJzsgcspf;
	}

	public void setBltdJzsgcspf(BigDecimal bltdJzsgcspf) {
		this.bltdJzsgcspf = bltdJzsgcspf;
	}

	@Column(name = "BLTD_JZSMMSEPF", precision = 22, scale = 0)
	public BigDecimal getBltdJzsmmsepf() {
		return this.bltdJzsmmsepf;
	}

	public void setBltdJzsmmsepf(BigDecimal bltdJzsmmsepf) {
		this.bltdJzsmmsepf = bltdJzsmmsepf;
	}

	@Column(name = "TGJC_SG", precision = 22, scale = 0)
	public BigDecimal getTgjcSg() {
		return this.tgjcSg;
	}

	public void setTgjcSg(BigDecimal tgjcSg) {
		this.tgjcSg = tgjcSg;
	}

	@Column(name = "TGJC_TZ", precision = 22, scale = 0)
	public BigDecimal getTgjcTz() {
		return this.tgjcTz;
	}

	public void setTgjcTz(BigDecimal tgjcTz) {
		this.tgjcTz = tgjcTz;
	}

	@Column(name = "TGJC_BMI", precision = 22, scale = 0)
	public BigDecimal getTgjcBmi() {
		return this.tgjcBmi;
	}

	public void setTgjcBmi(BigDecimal tgjcBmi) {
		this.tgjcBmi = tgjcBmi;
	}

	@Column(name = "TGJC_TW", precision = 22, scale = 0)
	public BigDecimal getTgjcTw() {
		return this.tgjcTw;
	}

	public void setTgjcTw(BigDecimal tgjcTw) {
		this.tgjcTw = tgjcTw;
	}

	@Column(name = "TGJC_HX", precision = 22, scale = 0)
	public BigDecimal getTgjcHx() {
		return this.tgjcHx;
	}

	public void setTgjcHx(BigDecimal tgjcHx) {
		this.tgjcHx = tgjcHx;
	}

	@Column(name = "TGJC_MB", precision = 22, scale = 0)
	public BigDecimal getTgjcMb() {
		return this.tgjcMb;
	}

	public void setTgjcMb(BigDecimal tgjcMb) {
		this.tgjcMb = tgjcMb;
	}

	@Column(name = "TGJC_XL", precision = 22, scale = 0)
	public BigDecimal getTgjcXl() {
		return this.tgjcXl;
	}

	public void setTgjcXl(BigDecimal tgjcXl) {
		this.tgjcXl = tgjcXl;
	}

	@Column(name = "TGJC_SSY", precision = 22, scale = 0)
	public BigDecimal getTgjcSsy() {
		return this.tgjcSsy;
	}

	public void setTgjcSsy(BigDecimal tgjcSsy) {
		this.tgjcSsy = tgjcSsy;
	}

	@Column(name = "TGJC_SZY", precision = 22, scale = 0)
	public BigDecimal getTgjcSzy() {
		return this.tgjcSzy;
	}

	public void setTgjcSzy(BigDecimal tgjcSzy) {
		this.tgjcSzy = tgjcSzy;
	}

	@Column(name = "TGJC_TYGNZA", length = 5)
	public String getTgjcTygnza() {
		return this.tgjcTygnza;
	}

	public void setTgjcTygnza(String tgjcTygnza) {
		this.tgjcTygnza = tgjcTygnza;
	}

	@Column(name = "RSZL_RS", length = 4)
	public String getRszlRs() {
		return this.rszlRs;
	}

	public void setRszlRs(String rszlRs) {
		this.rszlRs = rszlRs;
	}

	@Column(name = "RSZL_WRSYY", length = 50)
	public String getRszlWrsyy() {
		return this.rszlWrsyy;
	}

	public void setRszlWrsyy(String rszlWrsyy) {
		this.rszlWrsyy = rszlWrsyy;
	}

	@Column(name = "RSZL_WRSYYZRSJJZ", length = 300)
	public String getRszlWrsyyzrsjjz() {
		return this.rszlWrsyyzrsjjz;
	}

	public void setRszlWrsyyzrsjjz(String rszlWrsyyzrsjjz) {
		this.rszlWrsyyzrsjjz = rszlWrsyyzrsjjz;
	}

	@Column(name = "RSZL_RSSJ", length = 7)
	public Timestamp getRszlRssj() {
		return this.rszlRssj;
	}

	public void setRszlRssj(Timestamp rszlRssj) {
		this.rszlRssj = rszlRssj;
	}

	@Column(name = "RSZL_GYLB", length = 10)
	public String getRszlGylb() {
		return this.rszlGylb;
	}

	public void setRszlGylb(String rszlGylb) {
		this.rszlGylb = rszlGylb;
	}

	@Column(name = "RSZL_GYLBZQT", length = 100)
	public String getRszlGylbzqt() {
		return this.rszlGylbzqt;
	}

	public void setRszlGylbzqt(String rszlGylbzqt) {
		this.rszlGylbzqt = rszlGylbzqt;
	}

	@Column(name = "RSZL_GYTJ", length = 20)
	public String getRszlGytj() {
		return this.rszlGytj;
	}

	public void setRszlGytj(String rszlGytj) {
		this.rszlGytj = rszlGytj;
	}

	@Column(name = "RSZL_NIHSSPF", precision = 22, scale = 0)
	public BigDecimal getRszlNihsspf() {
		return this.rszlNihsspf;
	}

	public void setRszlNihsspf(BigDecimal rszlNihsspf) {
		this.rszlNihsspf = rszlNihsspf;
	}

	@Column(name = "RSZL_GYQSSY", precision = 22, scale = 0)
	public BigDecimal getRszlGyqssy() {
		return this.rszlGyqssy;
	}

	public void setRszlGyqssy(BigDecimal rszlGyqssy) {
		this.rszlGyqssy = rszlGyqssy;
	}

	@Column(name = "RSZL_GYQSZY", precision = 22, scale = 0)
	public BigDecimal getRszlGyqszy() {
		return this.rszlGyqszy;
	}

	public void setRszlGyqszy(BigDecimal rszlGyqszy) {
		this.rszlGyqszy = rszlGyqszy;
	}

	@Column(name = "RSZL_RSQSFJYZL", length = 4)
	public String getRszlRsqsfjyzl() {
		return this.rszlRsqsfjyzl;
	}

	public void setRszlRsqsfjyzl(String rszlRsqsfjyzl) {
		this.rszlRsqsfjyzl = rszlRsqsfjyzl;
	}

	@Column(name = "RSZL_BFYZDQSCX", length = 4)
	public String getRszlBfyzdqscx() {
		return this.rszlBfyzdqscx;
	}

	public void setRszlBfyzdqscx(String rszlBfyzdqscx) {
		this.rszlBfyzdqscx = rszlBfyzdqscx;
	}

	@Column(name = "RSZL_SFBFLNCX", length = 4)
	public String getRszlSfbflncx() {
		return this.rszlSfbflncx;
	}

	public void setRszlSfbflncx(String rszlSfbflncx) {
		this.rszlSfbflncx = rszlSfbflncx;
	}

	@Column(name = "RSZL_BFLNCXZSFWZZXCX", length = 4)
	public String getRszlBflncxzsfwzzxcx() {
		return this.rszlBflncxzsfwzzxcx;
	}

	public void setRszlBflncxzsfwzzxcx(String rszlBflncxzsfwzzxcx) {
		this.rszlBflncxzsfwzzxcx = rszlBflncxzsfwzzxcx;
	}

	@Column(name = "RSZL_RTPAZJL", precision = 22, scale = 0)
	public BigDecimal getRszlRtpazjl() {
		return this.rszlRtpazjl;
	}

	public void setRszlRtpazjl(BigDecimal rszlRtpazjl) {
		this.rszlRtpazjl = rszlRtpazjl;
	}

	@Column(name = "RSZL_HZTZ", precision = 22, scale = 0)
	public BigDecimal getRszlHztz() {
		return this.rszlHztz;
	}

	public void setRszlHztz(BigDecimal rszlHztz) {
		this.rszlHztz = rszlHztz;
	}

	@Column(name = "RSZL_MGJTZRTPAJL", precision = 22, scale = 0)
	public BigDecimal getRszlMgjtzrtpajl() {
		return this.rszlMgjtzrtpajl;
	}

	public void setRszlMgjtzrtpajl(BigDecimal rszlMgjtzrtpajl) {
		this.rszlMgjtzrtpajl = rszlMgjtzrtpajl;
	}

	@Column(name = "RSZL_RTPASFGZJL", length = 4)
	public String getRszlRtpasfgzjl() {
		return this.rszlRtpasfgzjl;
	}

	public void setRszlRtpasfgzjl(String rszlRtpasfgzjl) {
		this.rszlRtpasfgzjl = rszlRtpasfgzjl;
	}

	@Column(name = "RSZL_WNGZJLYY", length = 20)
	public String getRszlWngzjlyy() {
		return this.rszlWngzjlyy;
	}

	public void setRszlWngzjlyy(String rszlWngzjlyy) {
		this.rszlWngzjlyy = rszlWngzjlyy;
	}

	@Column(name = "RSZL_WNGZJLYYZQT", length = 100)
	public String getRszlWngzjlyyzqt() {
		return this.rszlWngzjlyyzqt;
	}

	public void setRszlWngzjlyyzqt(String rszlWngzjlyyzqt) {
		this.rszlWngzjlyyzqt = rszlWngzjlyyzqt;
	}

	@Column(name = "YWZL_KSZL", length = 4)
	public String getYwzlKszl() {
		return this.ywzlKszl;
	}

	public void setYwzlKszl(String ywzlKszl) {
		this.ywzlKszl = ywzlKszl;
	}

	@Column(name = "YWZL_WZLYY", length = 100)
	public String getYwzlWzlyy() {
		return this.ywzlWzlyy;
	}

	public void setYwzlWzlyy(String ywzlWzlyy) {
		this.ywzlWzlyy = ywzlWzlyy;
	}

	@Column(name = "YWZL_KSZLGYZL", length = 200)
	public String getYwzlKszlgyzl() {
		return this.ywzlKszlgyzl;
	}

	public void setYwzlKszlgyzl(String ywzlKszlgyzl) {
		this.ywzlKszlgyzl = ywzlKszlgyzl;
	}

	@Column(name = "YWZL_ELKXXB", length = 4)
	public String getYwzlElkxxb() {
		return this.ywzlElkxxb;
	}

	public void setYwzlElkxxb(String ywzlElkxxb) {
		this.ywzlElkxxb = ywzlElkxxb;
	}

	@Column(name = "YWZL_ELKXXBZLSJ", precision = 22, scale = 0)
	public BigDecimal getYwzlElkxxbzlsj() {
		return this.ywzlElkxxbzlsj;
	}

	public void setYwzlElkxxbzlsj(BigDecimal ywzlElkxxbzlsj) {
		this.ywzlElkxxbzlsj = ywzlElkxxbzlsj;
	}

	@Column(name = "YWZL_JY", length = 4)
	public String getYwzlJy() {
		return this.ywzlJy;
	}

	public void setYwzlJy(String ywzlJy) {
		this.ywzlJy = ywzlJy;
	}

	@Column(name = "YWZL_JYYWLX", length = 200)
	public String getYwzlJyywlx() {
		return this.ywzlJyywlx;
	}

	public void setYwzlJyywlx(String ywzlJyywlx) {
		this.ywzlJyywlx = ywzlJyywlx;
	}

	@Column(name = "YWZL_JYGYTJ", length = 10)
	public String getYwzlJygytj() {
		return this.ywzlJygytj;
	}

	public void setYwzlJygytj(String ywzlJygytj) {
		this.ywzlJygytj = ywzlJygytj;
	}

	@Column(name = "YWZL_JT", length = 4)
	public String getYwzlJt() {
		return this.ywzlJt;
	}

	public void setYwzlJt(String ywzlJt) {
		this.ywzlJt = ywzlJt;
	}

	@Column(name = "YWZL_JTYWLX", length = 200)
	public String getYwzlJtywlx() {
		return this.ywzlJtywlx;
	}

	public void setYwzlJtywlx(String ywzlJtywlx) {
		this.ywzlJtywlx = ywzlJtywlx;
	}

	@Column(name = "YWZL_TZ", length = 4)
	public String getYwzlTz() {
		return this.ywzlTz;
	}

	public void setYwzlTz(String ywzlTz) {
		this.ywzlTz = ywzlTz;
	}

	@Column(name = "YWZL_TZYWLX", length = 200)
	public String getYwzlTzywlx() {
		return this.ywzlTzywlx;
	}

	public void setYwzlTzywlx(String ywzlTzywlx) {
		this.ywzlTzywlx = ywzlTzywlx;
	}

	@Column(name = "YWZL_JTXBGAS", length = 4)
	public String getYwzlJtxbgas() {
		return this.ywzlJtxbgas;
	}

	public void setYwzlJtxbgas(String ywzlJtxbgas) {
		this.ywzlJtxbgas = ywzlJtxbgas;
	}

	@Column(name = "YWZL_JTXBGASYWLX", length = 200)
	public String getYwzlJtxbgasywlx() {
		return this.ywzlJtxbgasywlx;
	}

	public void setYwzlJtxbgasywlx(String ywzlJtxbgasywlx) {
		this.ywzlJtxbgasywlx = ywzlJtxbgasywlx;
	}

	@Column(name = "YWZL_JQ", length = 4)
	public String getYwzlJq() {
		return this.ywzlJq;
	}

	public void setYwzlJq(String ywzlJq) {
		this.ywzlJq = ywzlJq;
	}

	@Column(name = "YWZL_JQYWLXJJL", length = 200)
	public String getYwzlJqywlxjjl() {
		return this.ywzlJqywlxjjl;
	}

	public void setYwzlJqywlxjjl(String ywzlJqywlxjjl) {
		this.ywzlJqywlxjjl = ywzlJqywlxjjl;
	}

	@Column(name = "YWZL_JDLNY", length = 4)
	public String getYwzlJdlny() {
		return this.ywzlJdlny;
	}

	public void setYwzlJdlny(String ywzlJdlny) {
		this.ywzlJdlny = ywzlJdlny;
	}

	@Column(name = "YWZL_JDLNYYWLX", length = 200)
	public String getYwzlJdlnyywlx() {
		return this.ywzlJdlnyywlx;
	}

	public void setYwzlJdlnyywlx(String ywzlJdlnyywlx) {
		this.ywzlJdlnyywlx = ywzlJdlnyywlx;
	}

	@Column(name = "YWZL_ZXYW", length = 4)
	public String getYwzlZxyw() {
		return this.ywzlZxyw;
	}

	public void setYwzlZxyw(String ywzlZxyw) {
		this.ywzlZxyw = ywzlZxyw;
	}

	@Column(name = "YWZL_ZXYWYWLX", length = 200)
	public String getYwzlZxywywlx() {
		return this.ywzlZxywywlx;
	}

	public void setYwzlZxywywlx(String ywzlZxywywlx) {
		this.ywzlZxywywlx = ywzlZxywywlx;
	}

	@Column(name = "YWZL_SX", length = 4)
	public String getYwzlSx() {
		return this.ywzlSx;
	}

	public void setYwzlSx(String ywzlSx) {
		this.ywzlSx = ywzlSx;
	}

	@Column(name = "YWZL_SXSXLX", length = 100)
	public String getYwzlSxsxlx() {
		return this.ywzlSxsxlx;
	}

	public void setYwzlSxsxlx(String ywzlSxsxlx) {
		this.ywzlSxsxlx = ywzlSxsxlx;
	}

	@Column(name = "YWZL_YFNXGJL", length = 4)
	public String getYwzlYfnxgjl() {
		return this.ywzlYfnxgjl;
	}

	public void setYwzlYfnxgjl(String ywzlYfnxgjl) {
		this.ywzlYfnxgjl = ywzlYfnxgjl;
	}

	@Column(name = "YWZL_JSZL", length = 4)
	public String getYwzlJszl() {
		return this.ywzlJszl;
	}

	public void setYwzlJszl(String ywzlJszl) {
		this.ywzlJszl = ywzlJszl;
	}

	@Column(name = "YWZL_KDXZL", length = 4)
	public String getYwzlKdxzl() {
		return this.ywzlKdxzl;
	}

	public void setYwzlKdxzl(String ywzlKdxzl) {
		this.ywzlKdxzl = ywzlKdxzl;
	}

	@Column(name = "YWZL_KGRZL", length = 4)
	public String getYwzlKgrzl() {
		return this.ywzlKgrzl;
	}

	public void setYwzlKgrzl(String ywzlKgrzl) {
		this.ywzlKgrzl = ywzlKgrzl;
	}

	@Column(name = "YWZL_ZYZCYZL", length = 4)
	public String getYwzlZyzcyzl() {
		return this.ywzlZyzcyzl;
	}

	public void setYwzlZyzcyzl(String ywzlZyzcyzl) {
		this.ywzlZyzcyzl = ywzlZyzcyzl;
	}

	@Column(name = "FYWZL_JDMNMBTS", length = 4)
	public String getFywzlJdmnmbts() {
		return this.fywzlJdmnmbts;
	}

	public void setFywzlJdmnmbts(String fywzlJdmnmbts) {
		this.fywzlJdmnmbts = fywzlJdmnmbts;
	}

	@Column(name = "FYWZL_JDMNMBTSSSSJ", length = 7)
	public Timestamp getFywzlJdmnmbtssssj() {
		return this.fywzlJdmnmbtssssj;
	}

	public void setFywzlJdmnmbtssssj(Timestamp fywzlJdmnmbtssssj) {
		this.fywzlJdmnmbtssssj = fywzlJdmnmbtssssj;
	}

	@Column(name = "FYWZL_JDMNMBTSSSWZ", length = 10)
	public String getFywzlJdmnmbtssswz() {
		return this.fywzlJdmnmbtssswz;
	}

	public void setFywzlJdmnmbtssswz(String fywzlJdmnmbtssswz) {
		this.fywzlJdmnmbtssswz = fywzlJdmnmbtssswz;
	}

	@Column(name = "FYWZL_JDMNMBTSBFZ", length = 4)
	public String getFywzlJdmnmbtsbfz() {
		return this.fywzlJdmnmbtsbfz;
	}

	public void setFywzlJdmnmbtsbfz(String fywzlJdmnmbtsbfz) {
		this.fywzlJdmnmbtsbfz = fywzlJdmnmbtsbfz;
	}

	@Column(name = "FYWZL_JDMZJZRS", length = 4)
	public String getFywzlJdmzjzrs() {
		return this.fywzlJdmzjzrs;
	}

	public void setFywzlJdmzjzrs(String fywzlJdmzjzrs) {
		this.fywzlJdmzjzrs = fywzlJdmzjzrs;
	}

	@Column(name = "FYWZL_JDMZJZRSSSSJ", length = 7)
	public Timestamp getFywzlJdmzjzrssssj() {
		return this.fywzlJdmzjzrssssj;
	}

	public void setFywzlJdmzjzrssssj(Timestamp fywzlJdmzjzrssssj) {
		this.fywzlJdmzjzrssssj = fywzlJdmzjzrssssj;
	}

	@Column(name = "FYWZL_JDMZJZRSSSWZ", length = 20)
	public String getFywzlJdmzjzrssswz() {
		return this.fywzlJdmzjzrssswz;
	}

	public void setFywzlJdmzjzrssswz(String fywzlJdmzjzrssswz) {
		this.fywzlJdmzjzrssswz = fywzlJdmzjzrssswz;
	}

	@Column(name = "FYWZL_JDMZJZRSSSWZZCXQ", length = 10)
	public String getFywzlJdmzjzrssswzzcxq() {
		return this.fywzlJdmzjzrssswzzcxq;
	}

	public void setFywzlJdmzjzrssswzzcxq(String fywzlJdmzjzrssswzzcxq) {
		this.fywzlJdmzjzrssswzzcxq = fywzlJdmzjzrssswzzcxq;
	}

	@Column(name = "FYWZL_JDMZJZRSSSWYZCXQ", length = 10)
	public String getFywzlJdmzjzrssswyzcxq() {
		return this.fywzlJdmzjzrssswyzcxq;
	}

	public void setFywzlJdmzjzrssswyzcxq(String fywzlJdmzjzrssswyzcxq) {
		this.fywzlJdmzjzrssswyzcxq = fywzlJdmzjzrssswyzcxq;
	}

	@Column(name = "FYWZL_JDMZJZRSBFZ", length = 4)
	public String getFywzlJdmzjzrsbfz() {
		return this.fywzlJdmzjzrsbfz;
	}

	public void setFywzlJdmzjzrsbfz(String fywzlJdmzjzrsbfz) {
		this.fywzlJdmzjzrsbfz = fywzlJdmzjzrsbfz;
	}

	@Column(name = "FYWZL_JDMZJZRSBFZXQ", length = 100)
	public String getFywzlJdmzjzrsbfzxq() {
		return this.fywzlJdmzjzrsbfzxq;
	}

	public void setFywzlJdmzjzrsbfzxq(String fywzlJdmzjzrsbfzxq) {
		this.fywzlJdmzjzrsbfzxq = fywzlJdmzjzrsbfzxq;
	}

	@Column(name = "FYWZL_NCXSSZL", length = 4)
	public String getFywzlNcxsszl() {
		return this.fywzlNcxsszl;
	}

	public void setFywzlNcxsszl(String fywzlNcxsszl) {
		this.fywzlNcxsszl = fywzlNcxsszl;
	}

	@Column(name = "FYWZL_NCXSSZLSSSJ", length = 7)
	public Timestamp getFywzlNcxsszlsssj() {
		return this.fywzlNcxsszlsssj;
	}

	public void setFywzlNcxsszlsssj(Timestamp fywzlNcxsszlsssj) {
		this.fywzlNcxsszlsssj = fywzlNcxsszlsssj;
	}

	@Column(name = "FYWZL_NCXSSZLSSFS", length = 50)
	public String getFywzlNcxsszlssfs() {
		return this.fywzlNcxsszlssfs;
	}

	public void setFywzlNcxsszlssfs(String fywzlNcxsszlssfs) {
		this.fywzlNcxsszlssfs = fywzlNcxsszlssfs;
	}

	@Column(name = "FYWZL_LNDMLSSZL", length = 4)
	public String getFywzlLndmlsszl() {
		return this.fywzlLndmlsszl;
	}

	public void setFywzlLndmlsszl(String fywzlLndmlsszl) {
		this.fywzlLndmlsszl = fywzlLndmlsszl;
	}

	@Column(name = "FYWZL_LNDMLSSZLSSSJ", length = 7)
	public Timestamp getFywzlLndmlsszlsssj() {
		return this.fywzlLndmlsszlsssj;
	}

	public void setFywzlLndmlsszlsssj(Timestamp fywzlLndmlsszlsssj) {
		this.fywzlLndmlsszlsssj = fywzlLndmlsszlsssj;
	}

	@Column(name = "FYWZL_LNDMLSSZLSSFS", length = 10)
	public String getFywzlLndmlsszlssfs() {
		return this.fywzlLndmlsszlssfs;
	}

	public void setFywzlLndmlsszlssfs(String fywzlLndmlsszlssfs) {
		this.fywzlLndmlsszlssfs = fywzlLndmlsszlssfs;
	}

	@Column(name = "FYWZL_XGNZLXQ", length = 50)
	public String getFywzlXgnzlxq() {
		return this.fywzlXgnzlxq;
	}

	public void setFywzlXgnzlxq(String fywzlXgnzlxq) {
		this.fywzlXgnzlxq = fywzlXgnzlxq;
	}

	@Column(name = "FYWZL_CJXZLXQ", length = 10)
	public String getFywzlCjxzlxq() {
		return this.fywzlCjxzlxq;
	}

	public void setFywzlCjxzlxq(String fywzlCjxzlxq) {
		this.fywzlCjxzlxq = fywzlCjxzlxq;
	}

	@Column(name = "FYWZL_FCJXZLXQ", length = 50)
	public String getFywzlFcjxzlxq() {
		return this.fywzlFcjxzlxq;
	}

	public void setFywzlFcjxzlxq(String fywzlFcjxzlxq) {
		this.fywzlFcjxzlxq = fywzlFcjxzlxq;
	}

	@Column(name = "FYWZL_LNDJMJXSSZL", length = 4)
	public String getFywzlLndjmjxsszl() {
		return this.fywzlLndjmjxsszl;
	}

	public void setFywzlLndjmjxsszl(String fywzlLndjmjxsszl) {
		this.fywzlLndjmjxsszl = fywzlLndjmjxsszl;
	}

	@Column(name = "FYWZL_LNDJMJXSSZLSSSJ", length = 7)
	public Timestamp getFywzlLndjmjxsszlsssj() {
		return this.fywzlLndjmjxsszlsssj;
	}

	public void setFywzlLndjmjxsszlsssj(Timestamp fywzlLndjmjxsszlsssj) {
		this.fywzlLndjmjxsszlsssj = fywzlLndjmjxsszlsssj;
	}

	@Column(name = "FYWZL_LNDJMJXSSZLSSFS", length = 50)
	public String getFywzlLndjmjxsszlssfs() {
		return this.fywzlLndjmjxsszlssfs;
	}

	public void setFywzlLndjmjxsszlssfs(String fywzlLndjmjxsszlssfs) {
		this.fywzlLndjmjxsszlssfs = fywzlLndjmjxsszlssfs;
	}

	@Column(name = "FYWZL_LNYJC", length = 4)
	public String getFywzlLnyjc() {
		return this.fywzlLnyjc;
	}

	public void setFywzlLnyjc(String fywzlLnyjc) {
		this.fywzlLnyjc = fywzlLnyjc;
	}

	@Column(name = "FYWZL_LNYJCCZSJ", length = 7)
	public Timestamp getFywzlLnyjcczsj() {
		return this.fywzlLnyjcczsj;
	}

	public void setFywzlLnyjcczsj(Timestamp fywzlLnyjcczsj) {
		this.fywzlLnyjcczsj = fywzlLnyjcczsj;
	}

	@Column(name = "FYWZL_QGCG", length = 4)
	public String getFywzlQgcg() {
		return this.fywzlQgcg;
	}

	public void setFywzlQgcg(String fywzlQgcg) {
		this.fywzlQgcg = fywzlQgcg;
	}

	@Column(name = "FYWZL_QGCGCZSJ", length = 7)
	public Timestamp getFywzlQgcgczsj() {
		return this.fywzlQgcgczsj;
	}

	public void setFywzlQgcgczsj(Timestamp fywzlQgcgczsj) {
		this.fywzlQgcgczsj = fywzlQgcgczsj;
	}

	@Column(name = "FYWZL_QGQK", length = 4)
	public String getFywzlQgqk() {
		return this.fywzlQgqk;
	}

	public void setFywzlQgqk(String fywzlQgqk) {
		this.fywzlQgqk = fywzlQgqk;
	}

	@Column(name = "FYWZL_QGQKCZSJ", length = 7)
	public Timestamp getFywzlQgqkczsj() {
		return this.fywzlQgqkczsj;
	}

	public void setFywzlQgqkczsj(Timestamp fywzlQgqkczsj) {
		this.fywzlQgqkczsj = fywzlQgqkczsj;
	}

	@Column(name = "FYWZL_JXTQ", length = 4)
	public String getFywzlJxtq() {
		return this.fywzlJxtq;
	}

	public void setFywzlJxtq(String fywzlJxtq) {
		this.fywzlJxtq = fywzlJxtq;
	}

	@Column(name = "FYWZL_JXTQCZSJ", length = 7)
	public Timestamp getFywzlJxtqczsj() {
		return this.fywzlJxtqczsj;
	}

	public void setFywzlJxtqczsj(Timestamp fywzlJxtqczsj) {
		this.fywzlJxtqczsj = fywzlJxtqczsj;
	}

	@Column(name = "FYWZL_WZLS", length = 4)
	public String getFywzlWzls() {
		return this.fywzlWzls;
	}

	public void setFywzlWzls(String fywzlWzls) {
		this.fywzlWzls = fywzlWzls;
	}

	@Column(name = "FYWZL_WZLSCZSJ", length = 7)
	public Timestamp getFywzlWzlsczsj() {
		return this.fywzlWzlsczsj;
	}

	public void setFywzlWzlsczsj(Timestamp fywzlWzlsczsj) {
		this.fywzlWzlsczsj = fywzlWzlsczsj;
	}

	@Column(name = "FYWZL_BWGFZ", length = 4)
	public String getFywzlBwgfz() {
		return this.fywzlBwgfz;
	}

	public void setFywzlBwgfz(String fywzlBwgfz) {
		this.fywzlBwgfz = fywzlBwgfz;
	}

	@Column(name = "FYWZL_BWGFZCZSJ", length = 7)
	public Timestamp getFywzlBwgfzczsj() {
		return this.fywzlBwgfzczsj;
	}

	public void setFywzlBwgfzczsj(Timestamp fywzlBwgfzczsj) {
		this.fywzlBwgfzczsj = fywzlBwgfzczsj;
	}

	@Column(name = "BFZHBZ_DX", length = 4)
	public String getBfzhbzDx() {
		return this.bfzhbzDx;
	}

	public void setBfzhbzDx(String bfzhbzDx) {
		this.bfzhbzDx = bfzhbzDx;
	}

	@Column(name = "BFZHBZ_YY", length = 4)
	public String getBfzhbzYy() {
		return this.bfzhbzYy;
	}

	public void setBfzhbzYy(String bfzhbzYy) {
		this.bfzhbzYy = bfzhbzYy;
	}

	@Column(name = "BFZHBZ_FC", length = 4)
	public String getBfzhbzFc() {
		return this.bfzhbzFc;
	}

	public void setBfzhbzFc(String bfzhbzFc) {
		this.bfzhbzFc = bfzhbzFc;
	}

	@Column(name = "BFZHBZ_XJGS", length = 4)
	public String getBfzhbzXjgs() {
		return this.bfzhbzXjgs;
	}

	public void setBfzhbzXjgs(String bfzhbzXjgs) {
		this.bfzhbzXjgs = bfzhbzXjgs;
	}

	@Column(name = "BFZHBZ_XTJT", length = 4)
	public String getBfzhbzXtjt() {
		return this.bfzhbzXtjt;
	}

	public void setBfzhbzXtjt(String bfzhbzXtjt) {
		this.bfzhbzXtjt = bfzhbzXtjt;
	}

	@Column(name = "BFZHBZ_FBGR", length = 4)
	public String getBfzhbzFbgr() {
		return this.bfzhbzFbgr;
	}

	public void setBfzhbzFbgr(String bfzhbzFbgr) {
		this.bfzhbzFbgr = bfzhbzFbgr;
	}

	@Column(name = "BFZHBZ_FSS", length = 4)
	public String getBfzhbzFss() {
		return this.bfzhbzFss;
	}

	public void setBfzhbzFss(String bfzhbzFss) {
		this.bfzhbzFss = bfzhbzFss;
	}

	@Column(name = "BFZHBZ_HXJT", length = 4)
	public String getBfzhbzHxjt() {
		return this.bfzhbzHxjt;
	}

	public void setBfzhbzHxjt(String bfzhbzHxjt) {
		this.bfzhbzHxjt = bfzhbzHxjt;
	}

	@Column(name = "BFZHBZ_XHDCX", length = 4)
	public String getBfzhbzXhdcx() {
		return this.bfzhbzXhdcx;
	}

	public void setBfzhbzXhdcx(String bfzhbzXhdcx) {
		this.bfzhbzXhdcx = bfzhbzXhdcx;
	}

	@Column(name = "BFZHBZ_MNXTGR", length = 4)
	public String getBfzhbzMnxtgr() {
		return this.bfzhbzMnxtgr;
	}

	public void setBfzhbzMnxtgr(String bfzhbzMnxtgr) {
		this.bfzhbzMnxtgr = bfzhbzMnxtgr;
	}

	@Column(name = "BFZHBZ_SJMXS", length = 4)
	public String getBfzhbzSjmxs() {
		return this.bfzhbzSjmxs;
	}

	public void setBfzhbzSjmxs(String bfzhbzSjmxs) {
		this.bfzhbzSjmxs = bfzhbzSjmxs;
	}

	@Column(name = "BFZHBZ_RC", length = 4)
	public String getBfzhbzRc() {
		return this.bfzhbzRc;
	}

	public void setBfzhbzRc(String bfzhbzRc) {
		this.bfzhbzRc = bfzhbzRc;
	}

	@Column(name = "BFZHBZ_NDXZ", length = 4)
	public String getBfzhbzNdxz() {
		return this.bfzhbzNdxz;
	}

	public void setBfzhbzNdxz(String bfzhbzNdxz) {
		this.bfzhbzNdxz = bfzhbzNdxz;
	}

	@Column(name = "BFZHBZ_DS", length = 4)
	public String getBfzhbzDs() {
		return this.bfzhbzDs;
	}

	public void setBfzhbzDs(String bfzhbzDs) {
		this.bfzhbzDs = bfzhbzDs;
	}

	@Column(name = "CYQK_CYSJ", length = 7)
	public Timestamp getCyqkCysj() {
		return this.cyqkCysj;
	}

	public void setCyqkCysj(Timestamp cyqkCysj) {
		this.cyqkCysj = cyqkCysj;
	}

	@Column(name = "CYQK_ZYTS", precision = 22, scale = 0)
	public BigDecimal getCyqkZyts() {
		return this.cyqkZyts;
	}

	public void setCyqkZyts(BigDecimal cyqkZyts) {
		this.cyqkZyts = cyqkZyts;
	}

	@Column(name = "CYQK_CYZYZD", length = 20)
	public String getCyqkCyzyzd() {
		return this.cyqkCyzyzd;
	}

	public void setCyqkCyzyzd(String cyqkCyzyzd) {
		this.cyqkCyzyzd = cyqkCyzyzd;
	}

	@Column(name = "CYQK_NGSBY", length = 30)
	public String getCyqkNgsby() {
		return this.cyqkNgsby;
	}

	public void setCyqkNgsby(String cyqkNgsby) {
		this.cyqkNgsby = cyqkNgsby;
	}

	@Column(name = "CYQK_NGSBYZQT", length = 100)
	public String getCyqkNgsbyzqt() {
		return this.cyqkNgsbyzqt;
	}

	public void setCyqkNgsbyzqt(String cyqkNgsbyzqt) {
		this.cyqkNgsbyzqt = cyqkNgsbyzqt;
	}

	@Column(name = "CYQK_QTCYZD", length = 200)
	public String getCyqkQtcyzd() {
		return this.cyqkQtcyzd;
	}

	public void setCyqkQtcyzd(String cyqkQtcyzd) {
		this.cyqkQtcyzd = cyqkQtcyzd;
	}

	@Column(name = "CYQK_NIHSSPF", precision = 22, scale = 0)
	public BigDecimal getCyqkNihsspf() {
		return this.cyqkNihsspf;
	}

	public void setCyqkNihsspf(BigDecimal cyqkNihsspf) {
		this.cyqkNihsspf = cyqkNihsspf;
	}

	@Column(name = "CYQK_MRSPF", precision = 22, scale = 0)
	public BigDecimal getCyqkMrspf() {
		return this.cyqkMrspf;
	}

	public void setCyqkMrspf(BigDecimal cyqkMrspf) {
		this.cyqkMrspf = cyqkMrspf;
	}

	@Column(name = "CYQK_GCSPF", precision = 22, scale = 0)
	public BigDecimal getCyqkGcspf() {
		return this.cyqkGcspf;
	}

	public void setCyqkGcspf(BigDecimal cyqkGcspf) {
		this.cyqkGcspf = cyqkGcspf;
	}

	@Column(name = "CYQK_MMSEPF", precision = 22, scale = 0)
	public BigDecimal getCyqkMmsepf() {
		return this.cyqkMmsepf;
	}

	public void setCyqkMmsepf(BigDecimal cyqkMmsepf) {
		this.cyqkMmsepf = cyqkMmsepf;
	}

	@Column(name = "CYQK_H_JLLBPF", precision = 22, scale = 0)
	public BigDecimal getCyqkHJllbpf() {
		return this.cyqkHJllbpf;
	}

	public void setCyqkHJllbpf(BigDecimal cyqkHJllbpf) {
		this.cyqkHJllbpf = cyqkHJllbpf;
	}

	@Column(name = "CYQK_H_YYLBPF", precision = 22, scale = 0)
	public BigDecimal getCyqkHYylbpf() {
		return this.cyqkHYylbpf;
	}

	public void setCyqkHYylbpf(BigDecimal cyqkHYylbpf) {
		this.cyqkHYylbpf = cyqkHYylbpf;
	}

	@Column(name = "XDT_JCSJ", length = 7)
	public Timestamp getXdtJcsj() {
		return this.xdtJcsj;
	}

	public void setXdtJcsj(Timestamp xdtJcsj) {
		this.xdtJcsj = xdtJcsj;
	}

	@Column(name = "XDT_JG", length = 200)
	public String getXdtJg() {
		return this.xdtJg;
	}

	public void setXdtJg(String xdtJg) {
		this.xdtJg = xdtJg;
	}

	@Column(name = "XDT_SFWZCXDT", length = 4)
	public String getXdtSfwzcxdt() {
		return this.xdtSfwzcxdt;
	}

	public void setXdtSfwzcxdt(String xdtSfwzcxdt) {
		this.xdtSfwzcxdt = xdtSfwzcxdt;
	}

	@Column(name = "XDT_YCXQ", length = 100)
	public String getXdtYcxq() {
		return this.xdtYcxq;
	}

	public void setXdtYcxq(String xdtYcxq) {
		this.xdtYcxq = xdtYcxq;
	}

	@Column(name = "XDT_YCXQZQT", length = 100)
	public String getXdtYcxqzqt() {
		return this.xdtYcxqzqt;
	}

	public void setXdtYcxqzqt(String xdtYcxqzqt) {
		this.xdtYcxqzqt = xdtYcxqzqt;
	}

	@Column(name = "JY_TGJY", length = 4)
	public String getJyTgjy() {
		return this.jyTgjy;
	}

	public void setJyTgjy(String jyTgjy) {
		this.jyTgjy = jyTgjy;
	}

	@Column(name = "JY_TGJYSJ", length = 7)
	public Timestamp getJyTgjysj() {
		return this.jyTgjysj;
	}

	public void setJyTgjysj(Timestamp jyTgjysj) {
		this.jyTgjysj = jyTgjysj;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<Sfxxb> getSfxxbs() {
		return this.sfxxbs;
	}

	public void setSfxxbs(Set<Sfxxb> sfxxbs) {
		this.sfxxbs = sfxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxQndsaJcxxb> getYxxQndsaJcxxbs() {
		return this.yxxQndsaJcxxbs;
	}

	public void setYxxQndsaJcxxbs(Set<YxxQndsaJcxxb> yxxQndsaJcxxbs) {
		this.yxxQndsaJcxxbs = yxxQndsaJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysDjzJcxxb> getSysDjzJcxxbs() {
		return this.sysDjzJcxxbs;
	}

	public void setSysDjzJcxxbs(Set<SysDjzJcxxb> sysDjzJcxxbs) {
		this.sysDjzJcxxbs = sysDjzJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxJldpltcdJcxxb> getYxxJldpltcdJcxxbs() {
		return this.yxxJldpltcdJcxxbs;
	}

	public void setYxxJldpltcdJcxxbs(Set<YxxJldpltcdJcxxb> yxxJldpltcdJcxxbs) {
		this.yxxJldpltcdJcxxbs = yxxJldpltcdJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysSgnJcxxb> getSysSgnJcxxbs() {
		return this.sysSgnJcxxbs;
	}

	public void setSysSgnJcxxbs(Set<SysSgnJcxxb> sysSgnJcxxbs) {
		this.sysSgnJcxxbs = sysSgnJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysXjssbjwJcxxb> getSysXjssbjwJcxxbs() {
		return this.sysXjssbjwJcxxbs;
	}

	public void setSysXjssbjwJcxxbs(Set<SysXjssbjwJcxxb> sysXjssbjwJcxxbs) {
		this.sysXjssbjwJcxxbs = sysXjssbjwJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<Dicomxxb> getDicomxxbs() {
		return this.dicomxxbs;
	}

	public void setDicomxxbs(Set<Dicomxxb> dicomxxbs) {
		this.dicomxxbs = dicomxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysXcgJcxxb> getSysXcgJcxxbs() {
		return this.sysXcgJcxxbs;
	}

	public void setSysXcgJcxxbs(Set<SysXcgJcxxb> sysXcgJcxxbs) {
		this.sysXcgJcxxbs = sysXcgJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxTlctJcxxb> getYxxTlctJcxxbs() {
		return this.yxxTlctJcxxbs;
	}

	public void setYxxTlctJcxxbs(Set<YxxTlctJcxxb> yxxTlctJcxxbs) {
		this.yxxTlctJcxxbs = yxxTlctJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxXzxgccJcxxb> getYxxXzxgccJcxxbs() {
		return this.yxxXzxgccJcxxbs;
	}

	public void setYxxXzxgccJcxxbs(Set<YxxXzxgccJcxxb> yxxXzxgccJcxxbs) {
		this.yxxXzxgccJcxxbs = yxxXzxgccJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysTdxJcxxb> getSysTdxJcxxbs() {
		return this.sysTdxJcxxbs;
	}

	public void setSysTdxJcxxbs(Set<SysTdxJcxxb> sysTdxJcxxbs) {
		this.sysTdxJcxxbs = sysTdxJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysXgyzbJcxxb> getSysXgyzbJcxxbs() {
		return this.sysXgyzbJcxxbs;
	}

	public void setSysXgyzbJcxxbs(Set<SysXgyzbJcxxb> sysXgyzbJcxxbs) {
		this.sysXgyzbJcxxbs = sysXgyzbJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxLnxgmraJcxxb> getYxxLnxgmraJcxxbs() {
		return this.yxxLnxgmraJcxxbs;
	}

	public void setYxxLnxgmraJcxxbs(Set<YxxLnxgmraJcxxb> yxxLnxgmraJcxxbs) {
		this.yxxLnxgmraJcxxbs = yxxLnxgmraJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxJbxgccJcxxb> getYxxJbxgccJcxxbs() {
		return this.yxxJbxgccJcxxbs;
	}

	public void setYxxJbxgccJcxxbs(Set<YxxJbxgccJcxxb> yxxJbxgccJcxxbs) {
		this.yxxJbxgccJcxxbs = yxxJbxgccJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxLnxgctaJcxxb> getYxxLnxgctaJcxxbs() {
		return this.yxxLnxgctaJcxxbs;
	}

	public void setYxxLnxgctaJcxxbs(Set<YxxLnxgctaJcxxb> yxxLnxgctaJcxxbs) {
		this.yxxLnxgctaJcxxbs = yxxLnxgctaJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxTlmriJcxxb> getYxxTlmriJcxxbs() {
		return this.yxxTlmriJcxxbs;
	}

	public void setYxxTlmriJcxxbs(Set<YxxTlmriJcxxb> yxxTlmriJcxxbs) {
		this.yxxTlmriJcxxbs = yxxTlmriJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysNcgJcxxb> getSysNcgJcxxbs() {
		return this.sysNcgJcxxbs;
	}

	public void setSysNcgJcxxbs(Set<SysNcgJcxxb> sysNcgJcxxbs) {
		this.sysNcgJcxxbs = sysNcgJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysNxgnJcxxb> getSysNxgnJcxxbs() {
		return this.sysNxgnJcxxbs;
	}

	public void setSysNxgnJcxxbs(Set<SysNxgnJcxxb> sysNxgnJcxxbs) {
		this.sysNxgnJcxxbs = sysNxgnJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<YxxJbxgctaJcxxb> getYxxJbxgctaJcxxbs() {
		return this.yxxJbxgctaJcxxbs;
	}

	public void setYxxJbxgctaJcxxbs(Set<YxxJbxgctaJcxxb> yxxJbxgctaJcxxbs) {
		this.yxxJbxgctaJcxxbs = yxxJbxgctaJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysXzJcxxb> getSysXzJcxxbs() {
		return this.sysXzJcxxbs;
	}

	public void setSysXzJcxxbs(Set<SysXzJcxxb> sysXzJcxxbs) {
		this.sysXzJcxxbs = sysXzJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysGgnJcxxb> getSysGgnJcxxbs() {
		return this.sysGgnJcxxbs;
	}

	public void setSysGgnJcxxbs(Set<SysGgnJcxxb> sysGgnJcxxbs) {
		this.sysGgnJcxxbs = sysGgnJcxxbs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blxxb")
	public Set<SysQtJcxxb> getSysQtJcxxbs() {
		return this.sysQtJcxxbs;
	}

	public void setSysQtJcxxbs(Set<SysQtJcxxb> sysQtJcxxbs) {
		this.sysQtJcxxbs = sysQtJcxxbs;
	}

}