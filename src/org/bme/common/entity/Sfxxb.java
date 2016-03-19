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
 * Sfxxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SFXXB", schema = "SCOTT")
public class Sfxxb implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String sfSfbh;
	private Blxxb blxxb;
	private Timestamp sfJbxxSfsj;
	private BigDecimal sfJbxxNl;
	private BigDecimal sfJbxxSfsx;
	private BigDecimal sfJbxxBc;
	private String sfJbxxMqzt;
	private String sfZlxxJy;
	private String sfZlxxJyywlx;
	private String sfZlxxJt;
	private String sfZlxxJtywlx;
	private String sfZlxxTz;
	private String sfZlxxTzywlx;
	private String sfZlxxKxxb;
	private String sfZlxxKxxbywlx;
	private String sfZlxxKn;
	private String sfZlxxKnywlx;
	private String sfZlxxJtxbgas;
	private String sfZlxxJtxbgasywlx;
	private String sfZlxxRs;
	private String sfZlxxRsywlx;
	private Timestamp sfSysXcgJcsj;
	private BigDecimal sfSysXcgWbc;
	private BigDecimal sfSysXcgN;
	private BigDecimal sfSysXcgRbc;
	private BigDecimal sfSysXcgHb;
	private BigDecimal sfSysXcgHct;
	private BigDecimal sfSysXcgMcv;
	private BigDecimal sfSysXcgMch;
	private BigDecimal sfSysXcgMchc;
	private BigDecimal sfSysXcgPlt;
	private BigDecimal sfSysXcgMpv;
	private BigDecimal sfSysXcgPct;
	private BigDecimal sfSysXcgPdw;
	private BigDecimal sfSysXcgPlcr;
	private Timestamp sfSysNcgJcsj;
	private String sfSysNcgNdb;
	private String sfSysNcgNyx;
	private String sfSysNcgNbdb;
	private Timestamp sfSysTdxJcsj;
	private BigDecimal sfSysTdxKfxt;
	private BigDecimal sfSysTdxCh2hxt;
	private BigDecimal sfSysTdxGta;
	private BigDecimal sfSysTdxThxhdb;
	private Timestamp sfSysXzJcsj;
	private BigDecimal sfSysXzTc;
	private BigDecimal sfSysXzTg;
	private BigDecimal sfSysXzHdlc;
	private BigDecimal sfSysXzLdlc;
	private Timestamp sfSysSgnJcsj;
	private BigDecimal sfSysSgnCr;
	private BigDecimal sfSysSgnBun;
	private BigDecimal sfSysSgnEgfr;
	private BigDecimal sfSysSgnNs;
	private Timestamp sfSysNxgnJcsj;
	private BigDecimal sfSysNxgnAptt;
	private BigDecimal sfSysNxgnPt;
	private BigDecimal sfSysNxgnInr;
	private BigDecimal sfSysNxgnTt;
	private BigDecimal sfSysNxgnFbg;
	private Timestamp sfSysGgnJcsj;
	private BigDecimal sfSysGgnAst;
	private BigDecimal sfSysGgnAlt;
	private BigDecimal sfSysGgnAlb;
	private BigDecimal sfSysGgnTbil;
	private BigDecimal sfSysGgnDbil;
	private BigDecimal sfSysGgnUbil;
	private Timestamp sfSysDjzJcsj;
	private BigDecimal sfSysDjzN;
	private BigDecimal sfSysDjzL;
	private BigDecimal sfSysDjzJ;
	private BigDecimal sfSysDjzG;
	private BigDecimal sfSysDjzRs;
	private Timestamp sfSysXjssbjwJcsj;
	private BigDecimal sfSysXjssbjwCtnl;
	private BigDecimal sfSysXjssbjwCkmb;
	private BigDecimal sfSysXjssbjwMyo;
	private Timestamp sfSysXgyzbJcsj;
	private String sfSysXgyzbAna;
	private String sfSysXgyzbAnca;
	private String sfSysXgyzbDsdna;
	private String sfSysXgyzbSsa;
	private String sfSysXgyzbSsb;
	private String sfSysXgyzbKxlzkt;
	private String sfSysXgyzbKsxqjdmkt;
	private BigDecimal sfSysXgyzbEsr;
	private Timestamp sfSysQtJcsj;
	private BigDecimal sfSysQtTxbgas;
	private BigDecimal sfSysQtHscrp;
	private BigDecimal sfSysQtJgsy;
	private BigDecimal sfSysQtProbnp;
	private BigDecimal sfSysQtXdfm;
	private String sfYxxTlctTlct;
	private Timestamp sfYxxTlctJcsj;
	private String sfYxxTlctXfngs;
	private String sfYxxTlctXfngsbw;
	private String sfYxxTlctXfngszcxq;
	private String sfYxxTlctXfngsycxq;
	private BigDecimal sfYxxTlctNgstj;
	private String sfYxxTlctXfncx;
	private String sfYxxTlctXfncxbw;
	private String sfYxxTlctXfncxzcxq;
	private String sfYxxTlctXfncxycxq;
	private BigDecimal sfYxxTlctNcxdcxl;
	private String sfYxxTlctXfzwmxqcx;
	private String sfYxxTlctBsbz;
	private String sfYxxTlmriTlmri;
	private Timestamp sfYxxTlmriJcsj;
	private String sfYxxTlmriSmxl;
	private String sfYxxTlmriXfngs;
	private String sfYxxTlmriXfngsbw;
	private String sfYxxTlmriXfngszcxq;
	private String sfYxxTlmriXfngsycxq;
	private BigDecimal sfYxxTlmriNgstj;
	private String sfYxxTlmriXfncx;
	private String sfYxxTlmriXfncxbw;
	private String sfYxxTlmriXfncxzcxq;
	private String sfYxxTlmriXfncxycxq;
	private String sfYxxTlmriXfzwmxqcx;
	private String sfYxxTlmriBsbz;
	private String sfYxxLnxgmraLnxgmra;
	private Timestamp sfYxxLnxgmraJcsj;
	private String sfYxxLnxgmraDnzdmzcxq;
	private String sfYxxLnxgmraDnzdmycxq;
	private String sfYxxLnxgmraDnqdmzcxq;
	private String sfYxxLnxgmraDnqdmycxq;
	private String sfYxxLnxgmraDnhdmzcxq;
	private String sfYxxLnxgmraDnhdmycxq;
	private String sfYxxLnxgmraJndmlndzcxq;
	private String sfYxxLnxgmraJndmlndycxq;
	private String sfYxxLnxgmraZdmzcxq;
	private String sfYxxLnxgmraZdmycxq;
	private String sfYxxLnxgmraJddm;
	private String sfYxxLnxgmraCzxhpg;
	private String sfYxxLnxgmraCzxhpgzqt;
	private String sfYxxLnxgctaLnxgcta;
	private Timestamp sfYxxLnxgctaJcsj;
	private String sfYxxLnxgctaDnzdmzcxq;
	private String sfYxxLnxgctaDnzdmycxq;
	private String sfYxxLnxgctaDnqdmzcxq;
	private String sfYxxLnxgctaDnqdmycxq;
	private String sfYxxLnxgctaDnhdmzcxq;
	private String sfYxxLnxgctaDnhdmycxq;
	private String sfYxxLnxgctaJndmlndzcxq;
	private String sfYxxLnxgctaJndmlndycxq;
	private String sfYxxLnxgctaZdmzcxq;
	private String sfYxxLnxgctaZdmycxq;
	private String sfYxxLnxgctaJddm;
	private String sfYxxLnxgctaCzxhpg;
	private String sfYxxLnxgctaCzxhpgzqt;
	private String sfYxxJbxgctaJbxgcta;
	private Timestamp sfYxxJbxgctaJcsj;
	private String sfYxxJbxgctaJzdmzcxq;
	private String sfYxxJbxgctaJzdmycxq;
	private String sfYxxJbxgctaJzdmfcczcxq;
	private String sfYxxJbxgctaJzdmfccycxq;
	private String sfYxxJbxgctaJndmlwdzcxq;
	private String sfYxxJbxgctaJndmlwdycxq;
	private String sfYxxJbxgctaJwdmzcxq;
	private String sfYxxJbxgctaJwdmycxq;
	private String sfYxxJbxgctaZdmlwdzcxq;
	private String sfYxxJbxgctaZdmlwdycxq;
	private String sfYxxJbxgctaSgxdmqsdzcxq;
	private String sfYxxJbxgctaSgxdmqsdycxq;
	private String sfYxxQndsaQndsa;
	private Timestamp sfYxxQndsaJcsj;
	private String sfYxxQndsaJzdmzcxq;
	private String sfYxxQndsaJzdmycxq;
	private String sfYxxQndsaJzdmfcczcxq;
	private String sfYxxQndsaJzdmfccycxq;
	private String sfYxxQndsaJndmlwdzcxq;
	private String sfYxxQndsaJndmlwdycxq;
	private String sfYxxQndsaJwdmzcxq;
	private String sfYxxQndsaJwdmycxq;
	private String sfYxxQndsaZdmlwdzcxq;
	private String sfYxxQndsaZdmlwdycxq;
	private String sfYxxQndsaSgxdmqsdzcxq;
	private String sfYxxQndsaSgxdmqsdycxq;
	private String sfYxxQndsaDnzdmzcxq;
	private String sfYxxQndsaDnzdmycxq;
	private String sfYxxQndsaDnqdmzcxq;
	private String sfYxxQndsaDnqdmycxq;
	private String sfYxxQndsaDnhdmzcxq;
	private String sfYxxQndsaDnhdmycxq;
	private String sfYxxQndsaJndmlndzcxq;
	private String sfYxxQndsaJndmlndycxq;
	private String sfYxxQndsaZdmzcxq;
	private String sfYxxQndsaZdmycxq;
	private String sfYxxJbxgccJbxgcc;
	private Timestamp sfYxxJbxgccJcsj;
	private BigDecimal sfYxxJbxgccJzdmzcimt;
	private String sfYxxJbxgccJzdmzcbkxz;
	private String sfYxxJbxgccJzdmzcgqxz;
	private BigDecimal sfYxxJbxgccJzdmycimt;
	private String sfYxxJbxgccJzdmycbkxz;
	private String sfYxxJbxgccJzdmycgqxz;
	private BigDecimal sfYxxJbxgccJndmzcimt;
	private String sfYxxJbxgccJndmzcbkxz;
	private String sfYxxJbxgccJndmzcgqxz;
	private BigDecimal sfYxxJbxgccJndmycimt;
	private String sfYxxJbxgccJndmycbkxz;
	private String sfYxxJbxgccJndmycgqxz;
	private BigDecimal sfYxxJbxgccJwdmzcimt;
	private String sfYxxJbxgccJwdmzcbkxz;
	private String sfYxxJbxgccJwdmzcgqxz;
	private BigDecimal sfYxxJbxgccJwdmycimt;
	private String sfYxxJbxgccJwdmycbkxz;
	private String sfYxxJbxgccJwdmycgqxz;
	private String sfYxxJldpltcdJldpltcd;
	private Timestamp sfYxxJldpltcdJcsj;
	private String sfYxxJldpltcdDnzdmzcxq;
	private String sfYxxJldpltcdDnzdmycxq;
	private String sfYxxJldpltcdDnqdmzcxq;
	private String sfYxxJldpltcdDnqdmycxq;
	private String sfYxxJldpltcdDnhdmzcxq;
	private String sfYxxJldpltcdDnhdmycxq;
	private String sfYxxJldpltcdJndmlwdzcxq;
	private String sfYxxJldpltcdJndmlwdycxq;
	private String sfYxxJldpltcdZdmzcxq;
	private String sfYxxJldpltcdZdmycxq;
	private String sfYxxJldpltcdCzxhpg;
	private String sfYxxJldpltcdCzxhpgzqt;
	private String sfYxxXzxgccXzxgcc;
	private Timestamp sfYxxXzxgccJcsj;
	private String sfYxxXzxgccGzdmzcbkxz;
	private String sfYxxXzxgccGzdmzcgqxz;
	private String sfYxxXzxgccGzdmycbkxz;
	private String sfYxxXzxgccGzdmycgqxz;
	private String sfYxxXzxgccGqdmzcbkxz;
	private String sfYxxXzxgccGqdmzcgqxz;
	private String sfYxxXzxgccGqdmycbkxz;
	private String sfYxxXzxgccGqdmycgqxz;
	private String sfYxxXzxgccGsdmzcbkxz;
	private String sfYxxXzxgccGsdmzcgqxz;
	private String sfYxxXzxgccGsdmycbkxz;
	private String sfYxxXzxgccGsdmycgqxz;
	private String sfYxxXzxgccGdmzcbkxz;
	private String sfYxxXzxgccGdmzcgqxz;
	private String sfYxxXzxgccGdmycbkxz;
	private String sfYxxXzxgccGdmycgqxz;
	private BigDecimal sfSjgnpfMrspf;
	private BigDecimal sfSjgnpfNihsspf;
	private BigDecimal sfSjgnpfMmsepf;

	// Constructors

	/** default constructor */
	public Sfxxb() {
	}

	/** full constructor */
	public Sfxxb(Blxxb blxxb, Timestamp sfJbxxSfsj, BigDecimal sfJbxxNl,
			BigDecimal sfJbxxSfsx, BigDecimal sfJbxxBc, String sfJbxxMqzt,
			String sfZlxxJy, String sfZlxxJyywlx, String sfZlxxJt,
			String sfZlxxJtywlx, String sfZlxxTz, String sfZlxxTzywlx,
			String sfZlxxKxxb, String sfZlxxKxxbywlx, String sfZlxxKn,
			String sfZlxxKnywlx, String sfZlxxJtxbgas,
			String sfZlxxJtxbgasywlx, String sfZlxxRs, String sfZlxxRsywlx,
			Timestamp sfSysXcgJcsj, BigDecimal sfSysXcgWbc,
			BigDecimal sfSysXcgN, BigDecimal sfSysXcgRbc,
			BigDecimal sfSysXcgHb, BigDecimal sfSysXcgHct,
			BigDecimal sfSysXcgMcv, BigDecimal sfSysXcgMch,
			BigDecimal sfSysXcgMchc, BigDecimal sfSysXcgPlt,
			BigDecimal sfSysXcgMpv, BigDecimal sfSysXcgPct,
			BigDecimal sfSysXcgPdw, BigDecimal sfSysXcgPlcr,
			Timestamp sfSysNcgJcsj, String sfSysNcgNdb, String sfSysNcgNyx,
			String sfSysNcgNbdb, Timestamp sfSysTdxJcsj,
			BigDecimal sfSysTdxKfxt, BigDecimal sfSysTdxCh2hxt,
			BigDecimal sfSysTdxGta, BigDecimal sfSysTdxThxhdb,
			Timestamp sfSysXzJcsj, BigDecimal sfSysXzTc, BigDecimal sfSysXzTg,
			BigDecimal sfSysXzHdlc, BigDecimal sfSysXzLdlc,
			Timestamp sfSysSgnJcsj, BigDecimal sfSysSgnCr,
			BigDecimal sfSysSgnBun, BigDecimal sfSysSgnEgfr,
			BigDecimal sfSysSgnNs, Timestamp sfSysNxgnJcsj,
			BigDecimal sfSysNxgnAptt, BigDecimal sfSysNxgnPt,
			BigDecimal sfSysNxgnInr, BigDecimal sfSysNxgnTt,
			BigDecimal sfSysNxgnFbg, Timestamp sfSysGgnJcsj,
			BigDecimal sfSysGgnAst, BigDecimal sfSysGgnAlt,
			BigDecimal sfSysGgnAlb, BigDecimal sfSysGgnTbil,
			BigDecimal sfSysGgnDbil, BigDecimal sfSysGgnUbil,
			Timestamp sfSysDjzJcsj, BigDecimal sfSysDjzN, BigDecimal sfSysDjzL,
			BigDecimal sfSysDjzJ, BigDecimal sfSysDjzG, BigDecimal sfSysDjzRs,
			Timestamp sfSysXjssbjwJcsj, BigDecimal sfSysXjssbjwCtnl,
			BigDecimal sfSysXjssbjwCkmb, BigDecimal sfSysXjssbjwMyo,
			Timestamp sfSysXgyzbJcsj, String sfSysXgyzbAna,
			String sfSysXgyzbAnca, String sfSysXgyzbDsdna,
			String sfSysXgyzbSsa, String sfSysXgyzbSsb,
			String sfSysXgyzbKxlzkt, String sfSysXgyzbKsxqjdmkt,
			BigDecimal sfSysXgyzbEsr, Timestamp sfSysQtJcsj,
			BigDecimal sfSysQtTxbgas, BigDecimal sfSysQtHscrp,
			BigDecimal sfSysQtJgsy, BigDecimal sfSysQtProbnp,
			BigDecimal sfSysQtXdfm, String sfYxxTlctTlct,
			Timestamp sfYxxTlctJcsj, String sfYxxTlctXfngs,
			String sfYxxTlctXfngsbw, String sfYxxTlctXfngszcxq,
			String sfYxxTlctXfngsycxq, BigDecimal sfYxxTlctNgstj,
			String sfYxxTlctXfncx, String sfYxxTlctXfncxbw,
			String sfYxxTlctXfncxzcxq, String sfYxxTlctXfncxycxq,
			BigDecimal sfYxxTlctNcxdcxl, String sfYxxTlctXfzwmxqcx,
			String sfYxxTlctBsbz, String sfYxxTlmriTlmri,
			Timestamp sfYxxTlmriJcsj, String sfYxxTlmriSmxl,
			String sfYxxTlmriXfngs, String sfYxxTlmriXfngsbw,
			String sfYxxTlmriXfngszcxq, String sfYxxTlmriXfngsycxq,
			BigDecimal sfYxxTlmriNgstj, String sfYxxTlmriXfncx,
			String sfYxxTlmriXfncxbw, String sfYxxTlmriXfncxzcxq,
			String sfYxxTlmriXfncxycxq, String sfYxxTlmriXfzwmxqcx,
			String sfYxxTlmriBsbz, String sfYxxLnxgmraLnxgmra,
			Timestamp sfYxxLnxgmraJcsj, String sfYxxLnxgmraDnzdmzcxq,
			String sfYxxLnxgmraDnzdmycxq, String sfYxxLnxgmraDnqdmzcxq,
			String sfYxxLnxgmraDnqdmycxq, String sfYxxLnxgmraDnhdmzcxq,
			String sfYxxLnxgmraDnhdmycxq, String sfYxxLnxgmraJndmlndzcxq,
			String sfYxxLnxgmraJndmlndycxq, String sfYxxLnxgmraZdmzcxq,
			String sfYxxLnxgmraZdmycxq, String sfYxxLnxgmraJddm,
			String sfYxxLnxgmraCzxhpg, String sfYxxLnxgmraCzxhpgzqt,
			String sfYxxLnxgctaLnxgcta, Timestamp sfYxxLnxgctaJcsj,
			String sfYxxLnxgctaDnzdmzcxq, String sfYxxLnxgctaDnzdmycxq,
			String sfYxxLnxgctaDnqdmzcxq, String sfYxxLnxgctaDnqdmycxq,
			String sfYxxLnxgctaDnhdmzcxq, String sfYxxLnxgctaDnhdmycxq,
			String sfYxxLnxgctaJndmlndzcxq, String sfYxxLnxgctaJndmlndycxq,
			String sfYxxLnxgctaZdmzcxq, String sfYxxLnxgctaZdmycxq,
			String sfYxxLnxgctaJddm, String sfYxxLnxgctaCzxhpg,
			String sfYxxLnxgctaCzxhpgzqt, String sfYxxJbxgctaJbxgcta,
			Timestamp sfYxxJbxgctaJcsj, String sfYxxJbxgctaJzdmzcxq,
			String sfYxxJbxgctaJzdmycxq, String sfYxxJbxgctaJzdmfcczcxq,
			String sfYxxJbxgctaJzdmfccycxq, String sfYxxJbxgctaJndmlwdzcxq,
			String sfYxxJbxgctaJndmlwdycxq, String sfYxxJbxgctaJwdmzcxq,
			String sfYxxJbxgctaJwdmycxq, String sfYxxJbxgctaZdmlwdzcxq,
			String sfYxxJbxgctaZdmlwdycxq, String sfYxxJbxgctaSgxdmqsdzcxq,
			String sfYxxJbxgctaSgxdmqsdycxq, String sfYxxQndsaQndsa,
			Timestamp sfYxxQndsaJcsj, String sfYxxQndsaJzdmzcxq,
			String sfYxxQndsaJzdmycxq, String sfYxxQndsaJzdmfcczcxq,
			String sfYxxQndsaJzdmfccycxq, String sfYxxQndsaJndmlwdzcxq,
			String sfYxxQndsaJndmlwdycxq, String sfYxxQndsaJwdmzcxq,
			String sfYxxQndsaJwdmycxq, String sfYxxQndsaZdmlwdzcxq,
			String sfYxxQndsaZdmlwdycxq, String sfYxxQndsaSgxdmqsdzcxq,
			String sfYxxQndsaSgxdmqsdycxq, String sfYxxQndsaDnzdmzcxq,
			String sfYxxQndsaDnzdmycxq, String sfYxxQndsaDnqdmzcxq,
			String sfYxxQndsaDnqdmycxq, String sfYxxQndsaDnhdmzcxq,
			String sfYxxQndsaDnhdmycxq, String sfYxxQndsaJndmlndzcxq,
			String sfYxxQndsaJndmlndycxq, String sfYxxQndsaZdmzcxq,
			String sfYxxQndsaZdmycxq, String sfYxxJbxgccJbxgcc,
			Timestamp sfYxxJbxgccJcsj, BigDecimal sfYxxJbxgccJzdmzcimt,
			String sfYxxJbxgccJzdmzcbkxz, String sfYxxJbxgccJzdmzcgqxz,
			BigDecimal sfYxxJbxgccJzdmycimt, String sfYxxJbxgccJzdmycbkxz,
			String sfYxxJbxgccJzdmycgqxz, BigDecimal sfYxxJbxgccJndmzcimt,
			String sfYxxJbxgccJndmzcbkxz, String sfYxxJbxgccJndmzcgqxz,
			BigDecimal sfYxxJbxgccJndmycimt, String sfYxxJbxgccJndmycbkxz,
			String sfYxxJbxgccJndmycgqxz, BigDecimal sfYxxJbxgccJwdmzcimt,
			String sfYxxJbxgccJwdmzcbkxz, String sfYxxJbxgccJwdmzcgqxz,
			BigDecimal sfYxxJbxgccJwdmycimt, String sfYxxJbxgccJwdmycbkxz,
			String sfYxxJbxgccJwdmycgqxz, String sfYxxJldpltcdJldpltcd,
			Timestamp sfYxxJldpltcdJcsj, String sfYxxJldpltcdDnzdmzcxq,
			String sfYxxJldpltcdDnzdmycxq, String sfYxxJldpltcdDnqdmzcxq,
			String sfYxxJldpltcdDnqdmycxq, String sfYxxJldpltcdDnhdmzcxq,
			String sfYxxJldpltcdDnhdmycxq, String sfYxxJldpltcdJndmlwdzcxq,
			String sfYxxJldpltcdJndmlwdycxq, String sfYxxJldpltcdZdmzcxq,
			String sfYxxJldpltcdZdmycxq, String sfYxxJldpltcdCzxhpg,
			String sfYxxJldpltcdCzxhpgzqt, String sfYxxXzxgccXzxgcc,
			Timestamp sfYxxXzxgccJcsj, String sfYxxXzxgccGzdmzcbkxz,
			String sfYxxXzxgccGzdmzcgqxz, String sfYxxXzxgccGzdmycbkxz,
			String sfYxxXzxgccGzdmycgqxz, String sfYxxXzxgccGqdmzcbkxz,
			String sfYxxXzxgccGqdmzcgqxz, String sfYxxXzxgccGqdmycbkxz,
			String sfYxxXzxgccGqdmycgqxz, String sfYxxXzxgccGsdmzcbkxz,
			String sfYxxXzxgccGsdmzcgqxz, String sfYxxXzxgccGsdmycbkxz,
			String sfYxxXzxgccGsdmycgqxz, String sfYxxXzxgccGdmzcbkxz,
			String sfYxxXzxgccGdmzcgqxz, String sfYxxXzxgccGdmycbkxz,
			String sfYxxXzxgccGdmycgqxz, BigDecimal sfSjgnpfMrspf,
			BigDecimal sfSjgnpfNihsspf, BigDecimal sfSjgnpfMmsepf) {
		this.blxxb = blxxb;
		this.sfJbxxSfsj = sfJbxxSfsj;
		this.sfJbxxNl = sfJbxxNl;
		this.sfJbxxSfsx = sfJbxxSfsx;
		this.sfJbxxBc = sfJbxxBc;
		this.sfJbxxMqzt = sfJbxxMqzt;
		this.sfZlxxJy = sfZlxxJy;
		this.sfZlxxJyywlx = sfZlxxJyywlx;
		this.sfZlxxJt = sfZlxxJt;
		this.sfZlxxJtywlx = sfZlxxJtywlx;
		this.sfZlxxTz = sfZlxxTz;
		this.sfZlxxTzywlx = sfZlxxTzywlx;
		this.sfZlxxKxxb = sfZlxxKxxb;
		this.sfZlxxKxxbywlx = sfZlxxKxxbywlx;
		this.sfZlxxKn = sfZlxxKn;
		this.sfZlxxKnywlx = sfZlxxKnywlx;
		this.sfZlxxJtxbgas = sfZlxxJtxbgas;
		this.sfZlxxJtxbgasywlx = sfZlxxJtxbgasywlx;
		this.sfZlxxRs = sfZlxxRs;
		this.sfZlxxRsywlx = sfZlxxRsywlx;
		this.sfSysXcgJcsj = sfSysXcgJcsj;
		this.sfSysXcgWbc = sfSysXcgWbc;
		this.sfSysXcgN = sfSysXcgN;
		this.sfSysXcgRbc = sfSysXcgRbc;
		this.sfSysXcgHb = sfSysXcgHb;
		this.sfSysXcgHct = sfSysXcgHct;
		this.sfSysXcgMcv = sfSysXcgMcv;
		this.sfSysXcgMch = sfSysXcgMch;
		this.sfSysXcgMchc = sfSysXcgMchc;
		this.sfSysXcgPlt = sfSysXcgPlt;
		this.sfSysXcgMpv = sfSysXcgMpv;
		this.sfSysXcgPct = sfSysXcgPct;
		this.sfSysXcgPdw = sfSysXcgPdw;
		this.sfSysXcgPlcr = sfSysXcgPlcr;
		this.sfSysNcgJcsj = sfSysNcgJcsj;
		this.sfSysNcgNdb = sfSysNcgNdb;
		this.sfSysNcgNyx = sfSysNcgNyx;
		this.sfSysNcgNbdb = sfSysNcgNbdb;
		this.sfSysTdxJcsj = sfSysTdxJcsj;
		this.sfSysTdxKfxt = sfSysTdxKfxt;
		this.sfSysTdxCh2hxt = sfSysTdxCh2hxt;
		this.sfSysTdxGta = sfSysTdxGta;
		this.sfSysTdxThxhdb = sfSysTdxThxhdb;
		this.sfSysXzJcsj = sfSysXzJcsj;
		this.sfSysXzTc = sfSysXzTc;
		this.sfSysXzTg = sfSysXzTg;
		this.sfSysXzHdlc = sfSysXzHdlc;
		this.sfSysXzLdlc = sfSysXzLdlc;
		this.sfSysSgnJcsj = sfSysSgnJcsj;
		this.sfSysSgnCr = sfSysSgnCr;
		this.sfSysSgnBun = sfSysSgnBun;
		this.sfSysSgnEgfr = sfSysSgnEgfr;
		this.sfSysSgnNs = sfSysSgnNs;
		this.sfSysNxgnJcsj = sfSysNxgnJcsj;
		this.sfSysNxgnAptt = sfSysNxgnAptt;
		this.sfSysNxgnPt = sfSysNxgnPt;
		this.sfSysNxgnInr = sfSysNxgnInr;
		this.sfSysNxgnTt = sfSysNxgnTt;
		this.sfSysNxgnFbg = sfSysNxgnFbg;
		this.sfSysGgnJcsj = sfSysGgnJcsj;
		this.sfSysGgnAst = sfSysGgnAst;
		this.sfSysGgnAlt = sfSysGgnAlt;
		this.sfSysGgnAlb = sfSysGgnAlb;
		this.sfSysGgnTbil = sfSysGgnTbil;
		this.sfSysGgnDbil = sfSysGgnDbil;
		this.sfSysGgnUbil = sfSysGgnUbil;
		this.sfSysDjzJcsj = sfSysDjzJcsj;
		this.sfSysDjzN = sfSysDjzN;
		this.sfSysDjzL = sfSysDjzL;
		this.sfSysDjzJ = sfSysDjzJ;
		this.sfSysDjzG = sfSysDjzG;
		this.sfSysDjzRs = sfSysDjzRs;
		this.sfSysXjssbjwJcsj = sfSysXjssbjwJcsj;
		this.sfSysXjssbjwCtnl = sfSysXjssbjwCtnl;
		this.sfSysXjssbjwCkmb = sfSysXjssbjwCkmb;
		this.sfSysXjssbjwMyo = sfSysXjssbjwMyo;
		this.sfSysXgyzbJcsj = sfSysXgyzbJcsj;
		this.sfSysXgyzbAna = sfSysXgyzbAna;
		this.sfSysXgyzbAnca = sfSysXgyzbAnca;
		this.sfSysXgyzbDsdna = sfSysXgyzbDsdna;
		this.sfSysXgyzbSsa = sfSysXgyzbSsa;
		this.sfSysXgyzbSsb = sfSysXgyzbSsb;
		this.sfSysXgyzbKxlzkt = sfSysXgyzbKxlzkt;
		this.sfSysXgyzbKsxqjdmkt = sfSysXgyzbKsxqjdmkt;
		this.sfSysXgyzbEsr = sfSysXgyzbEsr;
		this.sfSysQtJcsj = sfSysQtJcsj;
		this.sfSysQtTxbgas = sfSysQtTxbgas;
		this.sfSysQtHscrp = sfSysQtHscrp;
		this.sfSysQtJgsy = sfSysQtJgsy;
		this.sfSysQtProbnp = sfSysQtProbnp;
		this.sfSysQtXdfm = sfSysQtXdfm;
		this.sfYxxTlctTlct = sfYxxTlctTlct;
		this.sfYxxTlctJcsj = sfYxxTlctJcsj;
		this.sfYxxTlctXfngs = sfYxxTlctXfngs;
		this.sfYxxTlctXfngsbw = sfYxxTlctXfngsbw;
		this.sfYxxTlctXfngszcxq = sfYxxTlctXfngszcxq;
		this.sfYxxTlctXfngsycxq = sfYxxTlctXfngsycxq;
		this.sfYxxTlctNgstj = sfYxxTlctNgstj;
		this.sfYxxTlctXfncx = sfYxxTlctXfncx;
		this.sfYxxTlctXfncxbw = sfYxxTlctXfncxbw;
		this.sfYxxTlctXfncxzcxq = sfYxxTlctXfncxzcxq;
		this.sfYxxTlctXfncxycxq = sfYxxTlctXfncxycxq;
		this.sfYxxTlctNcxdcxl = sfYxxTlctNcxdcxl;
		this.sfYxxTlctXfzwmxqcx = sfYxxTlctXfzwmxqcx;
		this.sfYxxTlctBsbz = sfYxxTlctBsbz;
		this.sfYxxTlmriTlmri = sfYxxTlmriTlmri;
		this.sfYxxTlmriJcsj = sfYxxTlmriJcsj;
		this.sfYxxTlmriSmxl = sfYxxTlmriSmxl;
		this.sfYxxTlmriXfngs = sfYxxTlmriXfngs;
		this.sfYxxTlmriXfngsbw = sfYxxTlmriXfngsbw;
		this.sfYxxTlmriXfngszcxq = sfYxxTlmriXfngszcxq;
		this.sfYxxTlmriXfngsycxq = sfYxxTlmriXfngsycxq;
		this.sfYxxTlmriNgstj = sfYxxTlmriNgstj;
		this.sfYxxTlmriXfncx = sfYxxTlmriXfncx;
		this.sfYxxTlmriXfncxbw = sfYxxTlmriXfncxbw;
		this.sfYxxTlmriXfncxzcxq = sfYxxTlmriXfncxzcxq;
		this.sfYxxTlmriXfncxycxq = sfYxxTlmriXfncxycxq;
		this.sfYxxTlmriXfzwmxqcx = sfYxxTlmriXfzwmxqcx;
		this.sfYxxTlmriBsbz = sfYxxTlmriBsbz;
		this.sfYxxLnxgmraLnxgmra = sfYxxLnxgmraLnxgmra;
		this.sfYxxLnxgmraJcsj = sfYxxLnxgmraJcsj;
		this.sfYxxLnxgmraDnzdmzcxq = sfYxxLnxgmraDnzdmzcxq;
		this.sfYxxLnxgmraDnzdmycxq = sfYxxLnxgmraDnzdmycxq;
		this.sfYxxLnxgmraDnqdmzcxq = sfYxxLnxgmraDnqdmzcxq;
		this.sfYxxLnxgmraDnqdmycxq = sfYxxLnxgmraDnqdmycxq;
		this.sfYxxLnxgmraDnhdmzcxq = sfYxxLnxgmraDnhdmzcxq;
		this.sfYxxLnxgmraDnhdmycxq = sfYxxLnxgmraDnhdmycxq;
		this.sfYxxLnxgmraJndmlndzcxq = sfYxxLnxgmraJndmlndzcxq;
		this.sfYxxLnxgmraJndmlndycxq = sfYxxLnxgmraJndmlndycxq;
		this.sfYxxLnxgmraZdmzcxq = sfYxxLnxgmraZdmzcxq;
		this.sfYxxLnxgmraZdmycxq = sfYxxLnxgmraZdmycxq;
		this.sfYxxLnxgmraJddm = sfYxxLnxgmraJddm;
		this.sfYxxLnxgmraCzxhpg = sfYxxLnxgmraCzxhpg;
		this.sfYxxLnxgmraCzxhpgzqt = sfYxxLnxgmraCzxhpgzqt;
		this.sfYxxLnxgctaLnxgcta = sfYxxLnxgctaLnxgcta;
		this.sfYxxLnxgctaJcsj = sfYxxLnxgctaJcsj;
		this.sfYxxLnxgctaDnzdmzcxq = sfYxxLnxgctaDnzdmzcxq;
		this.sfYxxLnxgctaDnzdmycxq = sfYxxLnxgctaDnzdmycxq;
		this.sfYxxLnxgctaDnqdmzcxq = sfYxxLnxgctaDnqdmzcxq;
		this.sfYxxLnxgctaDnqdmycxq = sfYxxLnxgctaDnqdmycxq;
		this.sfYxxLnxgctaDnhdmzcxq = sfYxxLnxgctaDnhdmzcxq;
		this.sfYxxLnxgctaDnhdmycxq = sfYxxLnxgctaDnhdmycxq;
		this.sfYxxLnxgctaJndmlndzcxq = sfYxxLnxgctaJndmlndzcxq;
		this.sfYxxLnxgctaJndmlndycxq = sfYxxLnxgctaJndmlndycxq;
		this.sfYxxLnxgctaZdmzcxq = sfYxxLnxgctaZdmzcxq;
		this.sfYxxLnxgctaZdmycxq = sfYxxLnxgctaZdmycxq;
		this.sfYxxLnxgctaJddm = sfYxxLnxgctaJddm;
		this.sfYxxLnxgctaCzxhpg = sfYxxLnxgctaCzxhpg;
		this.sfYxxLnxgctaCzxhpgzqt = sfYxxLnxgctaCzxhpgzqt;
		this.sfYxxJbxgctaJbxgcta = sfYxxJbxgctaJbxgcta;
		this.sfYxxJbxgctaJcsj = sfYxxJbxgctaJcsj;
		this.sfYxxJbxgctaJzdmzcxq = sfYxxJbxgctaJzdmzcxq;
		this.sfYxxJbxgctaJzdmycxq = sfYxxJbxgctaJzdmycxq;
		this.sfYxxJbxgctaJzdmfcczcxq = sfYxxJbxgctaJzdmfcczcxq;
		this.sfYxxJbxgctaJzdmfccycxq = sfYxxJbxgctaJzdmfccycxq;
		this.sfYxxJbxgctaJndmlwdzcxq = sfYxxJbxgctaJndmlwdzcxq;
		this.sfYxxJbxgctaJndmlwdycxq = sfYxxJbxgctaJndmlwdycxq;
		this.sfYxxJbxgctaJwdmzcxq = sfYxxJbxgctaJwdmzcxq;
		this.sfYxxJbxgctaJwdmycxq = sfYxxJbxgctaJwdmycxq;
		this.sfYxxJbxgctaZdmlwdzcxq = sfYxxJbxgctaZdmlwdzcxq;
		this.sfYxxJbxgctaZdmlwdycxq = sfYxxJbxgctaZdmlwdycxq;
		this.sfYxxJbxgctaSgxdmqsdzcxq = sfYxxJbxgctaSgxdmqsdzcxq;
		this.sfYxxJbxgctaSgxdmqsdycxq = sfYxxJbxgctaSgxdmqsdycxq;
		this.sfYxxQndsaQndsa = sfYxxQndsaQndsa;
		this.sfYxxQndsaJcsj = sfYxxQndsaJcsj;
		this.sfYxxQndsaJzdmzcxq = sfYxxQndsaJzdmzcxq;
		this.sfYxxQndsaJzdmycxq = sfYxxQndsaJzdmycxq;
		this.sfYxxQndsaJzdmfcczcxq = sfYxxQndsaJzdmfcczcxq;
		this.sfYxxQndsaJzdmfccycxq = sfYxxQndsaJzdmfccycxq;
		this.sfYxxQndsaJndmlwdzcxq = sfYxxQndsaJndmlwdzcxq;
		this.sfYxxQndsaJndmlwdycxq = sfYxxQndsaJndmlwdycxq;
		this.sfYxxQndsaJwdmzcxq = sfYxxQndsaJwdmzcxq;
		this.sfYxxQndsaJwdmycxq = sfYxxQndsaJwdmycxq;
		this.sfYxxQndsaZdmlwdzcxq = sfYxxQndsaZdmlwdzcxq;
		this.sfYxxQndsaZdmlwdycxq = sfYxxQndsaZdmlwdycxq;
		this.sfYxxQndsaSgxdmqsdzcxq = sfYxxQndsaSgxdmqsdzcxq;
		this.sfYxxQndsaSgxdmqsdycxq = sfYxxQndsaSgxdmqsdycxq;
		this.sfYxxQndsaDnzdmzcxq = sfYxxQndsaDnzdmzcxq;
		this.sfYxxQndsaDnzdmycxq = sfYxxQndsaDnzdmycxq;
		this.sfYxxQndsaDnqdmzcxq = sfYxxQndsaDnqdmzcxq;
		this.sfYxxQndsaDnqdmycxq = sfYxxQndsaDnqdmycxq;
		this.sfYxxQndsaDnhdmzcxq = sfYxxQndsaDnhdmzcxq;
		this.sfYxxQndsaDnhdmycxq = sfYxxQndsaDnhdmycxq;
		this.sfYxxQndsaJndmlndzcxq = sfYxxQndsaJndmlndzcxq;
		this.sfYxxQndsaJndmlndycxq = sfYxxQndsaJndmlndycxq;
		this.sfYxxQndsaZdmzcxq = sfYxxQndsaZdmzcxq;
		this.sfYxxQndsaZdmycxq = sfYxxQndsaZdmycxq;
		this.sfYxxJbxgccJbxgcc = sfYxxJbxgccJbxgcc;
		this.sfYxxJbxgccJcsj = sfYxxJbxgccJcsj;
		this.sfYxxJbxgccJzdmzcimt = sfYxxJbxgccJzdmzcimt;
		this.sfYxxJbxgccJzdmzcbkxz = sfYxxJbxgccJzdmzcbkxz;
		this.sfYxxJbxgccJzdmzcgqxz = sfYxxJbxgccJzdmzcgqxz;
		this.sfYxxJbxgccJzdmycimt = sfYxxJbxgccJzdmycimt;
		this.sfYxxJbxgccJzdmycbkxz = sfYxxJbxgccJzdmycbkxz;
		this.sfYxxJbxgccJzdmycgqxz = sfYxxJbxgccJzdmycgqxz;
		this.sfYxxJbxgccJndmzcimt = sfYxxJbxgccJndmzcimt;
		this.sfYxxJbxgccJndmzcbkxz = sfYxxJbxgccJndmzcbkxz;
		this.sfYxxJbxgccJndmzcgqxz = sfYxxJbxgccJndmzcgqxz;
		this.sfYxxJbxgccJndmycimt = sfYxxJbxgccJndmycimt;
		this.sfYxxJbxgccJndmycbkxz = sfYxxJbxgccJndmycbkxz;
		this.sfYxxJbxgccJndmycgqxz = sfYxxJbxgccJndmycgqxz;
		this.sfYxxJbxgccJwdmzcimt = sfYxxJbxgccJwdmzcimt;
		this.sfYxxJbxgccJwdmzcbkxz = sfYxxJbxgccJwdmzcbkxz;
		this.sfYxxJbxgccJwdmzcgqxz = sfYxxJbxgccJwdmzcgqxz;
		this.sfYxxJbxgccJwdmycimt = sfYxxJbxgccJwdmycimt;
		this.sfYxxJbxgccJwdmycbkxz = sfYxxJbxgccJwdmycbkxz;
		this.sfYxxJbxgccJwdmycgqxz = sfYxxJbxgccJwdmycgqxz;
		this.sfYxxJldpltcdJldpltcd = sfYxxJldpltcdJldpltcd;
		this.sfYxxJldpltcdJcsj = sfYxxJldpltcdJcsj;
		this.sfYxxJldpltcdDnzdmzcxq = sfYxxJldpltcdDnzdmzcxq;
		this.sfYxxJldpltcdDnzdmycxq = sfYxxJldpltcdDnzdmycxq;
		this.sfYxxJldpltcdDnqdmzcxq = sfYxxJldpltcdDnqdmzcxq;
		this.sfYxxJldpltcdDnqdmycxq = sfYxxJldpltcdDnqdmycxq;
		this.sfYxxJldpltcdDnhdmzcxq = sfYxxJldpltcdDnhdmzcxq;
		this.sfYxxJldpltcdDnhdmycxq = sfYxxJldpltcdDnhdmycxq;
		this.sfYxxJldpltcdJndmlwdzcxq = sfYxxJldpltcdJndmlwdzcxq;
		this.sfYxxJldpltcdJndmlwdycxq = sfYxxJldpltcdJndmlwdycxq;
		this.sfYxxJldpltcdZdmzcxq = sfYxxJldpltcdZdmzcxq;
		this.sfYxxJldpltcdZdmycxq = sfYxxJldpltcdZdmycxq;
		this.sfYxxJldpltcdCzxhpg = sfYxxJldpltcdCzxhpg;
		this.sfYxxJldpltcdCzxhpgzqt = sfYxxJldpltcdCzxhpgzqt;
		this.sfYxxXzxgccXzxgcc = sfYxxXzxgccXzxgcc;
		this.sfYxxXzxgccJcsj = sfYxxXzxgccJcsj;
		this.sfYxxXzxgccGzdmzcbkxz = sfYxxXzxgccGzdmzcbkxz;
		this.sfYxxXzxgccGzdmzcgqxz = sfYxxXzxgccGzdmzcgqxz;
		this.sfYxxXzxgccGzdmycbkxz = sfYxxXzxgccGzdmycbkxz;
		this.sfYxxXzxgccGzdmycgqxz = sfYxxXzxgccGzdmycgqxz;
		this.sfYxxXzxgccGqdmzcbkxz = sfYxxXzxgccGqdmzcbkxz;
		this.sfYxxXzxgccGqdmzcgqxz = sfYxxXzxgccGqdmzcgqxz;
		this.sfYxxXzxgccGqdmycbkxz = sfYxxXzxgccGqdmycbkxz;
		this.sfYxxXzxgccGqdmycgqxz = sfYxxXzxgccGqdmycgqxz;
		this.sfYxxXzxgccGsdmzcbkxz = sfYxxXzxgccGsdmzcbkxz;
		this.sfYxxXzxgccGsdmzcgqxz = sfYxxXzxgccGsdmzcgqxz;
		this.sfYxxXzxgccGsdmycbkxz = sfYxxXzxgccGsdmycbkxz;
		this.sfYxxXzxgccGsdmycgqxz = sfYxxXzxgccGsdmycgqxz;
		this.sfYxxXzxgccGdmzcbkxz = sfYxxXzxgccGdmzcbkxz;
		this.sfYxxXzxgccGdmzcgqxz = sfYxxXzxgccGdmzcgqxz;
		this.sfYxxXzxgccGdmycbkxz = sfYxxXzxgccGdmycbkxz;
		this.sfYxxXzxgccGdmycgqxz = sfYxxXzxgccGdmycgqxz;
		this.sfSjgnpfMrspf = sfSjgnpfMrspf;
		this.sfSjgnpfNihsspf = sfSjgnpfNihsspf;
		this.sfSjgnpfMmsepf = sfSjgnpfMmsepf;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "SF_SFBH", unique = true, nullable = false, length = 31)
	public String getSfSfbh() {
		return this.sfSfbh;
	}

	public void setSfSfbh(String sfSfbh) {
		this.sfSfbh = sfSfbh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SF_BLBH")
	public Blxxb getBlxxb() {
		return this.blxxb;
	}

	public void setBlxxb(Blxxb blxxb) {
		this.blxxb = blxxb;
	}

	@Column(name = "SF_JBXX_SFSJ", length = 7)
	public Timestamp getSfJbxxSfsj() {
		return this.sfJbxxSfsj;
	}

	public void setSfJbxxSfsj(Timestamp sfJbxxSfsj) {
		this.sfJbxxSfsj = sfJbxxSfsj;
	}

	@Column(name = "SF_JBXX_NL", precision = 22, scale = 0)
	public BigDecimal getSfJbxxNl() {
		return this.sfJbxxNl;
	}

	public void setSfJbxxNl(BigDecimal sfJbxxNl) {
		this.sfJbxxNl = sfJbxxNl;
	}

	@Column(name = "SF_JBXX_SFSX", precision = 22, scale = 0)
	public BigDecimal getSfJbxxSfsx() {
		return this.sfJbxxSfsx;
	}

	public void setSfJbxxSfsx(BigDecimal sfJbxxSfsx) {
		this.sfJbxxSfsx = sfJbxxSfsx;
	}

	@Column(name = "SF_JBXX_BC", precision = 22, scale = 0)
	public BigDecimal getSfJbxxBc() {
		return this.sfJbxxBc;
	}

	public void setSfJbxxBc(BigDecimal sfJbxxBc) {
		this.sfJbxxBc = sfJbxxBc;
	}

	@Column(name = "SF_JBXX_MQZT", length = 10)
	public String getSfJbxxMqzt() {
		return this.sfJbxxMqzt;
	}

	public void setSfJbxxMqzt(String sfJbxxMqzt) {
		this.sfJbxxMqzt = sfJbxxMqzt;
	}

	@Column(name = "SF_ZLXX_JY", length = 4)
	public String getSfZlxxJy() {
		return this.sfZlxxJy;
	}

	public void setSfZlxxJy(String sfZlxxJy) {
		this.sfZlxxJy = sfZlxxJy;
	}

	@Column(name = "SF_ZLXX_JYYWLX", length = 200)
	public String getSfZlxxJyywlx() {
		return this.sfZlxxJyywlx;
	}

	public void setSfZlxxJyywlx(String sfZlxxJyywlx) {
		this.sfZlxxJyywlx = sfZlxxJyywlx;
	}

	@Column(name = "SF_ZLXX_JT", length = 4)
	public String getSfZlxxJt() {
		return this.sfZlxxJt;
	}

	public void setSfZlxxJt(String sfZlxxJt) {
		this.sfZlxxJt = sfZlxxJt;
	}

	@Column(name = "SF_ZLXX_JTYWLX", length = 200)
	public String getSfZlxxJtywlx() {
		return this.sfZlxxJtywlx;
	}

	public void setSfZlxxJtywlx(String sfZlxxJtywlx) {
		this.sfZlxxJtywlx = sfZlxxJtywlx;
	}

	@Column(name = "SF_ZLXX_TZ", length = 4)
	public String getSfZlxxTz() {
		return this.sfZlxxTz;
	}

	public void setSfZlxxTz(String sfZlxxTz) {
		this.sfZlxxTz = sfZlxxTz;
	}

	@Column(name = "SF_ZLXX_TZYWLX", length = 200)
	public String getSfZlxxTzywlx() {
		return this.sfZlxxTzywlx;
	}

	public void setSfZlxxTzywlx(String sfZlxxTzywlx) {
		this.sfZlxxTzywlx = sfZlxxTzywlx;
	}

	@Column(name = "SF_ZLXX_KXXB", length = 4)
	public String getSfZlxxKxxb() {
		return this.sfZlxxKxxb;
	}

	public void setSfZlxxKxxb(String sfZlxxKxxb) {
		this.sfZlxxKxxb = sfZlxxKxxb;
	}

	@Column(name = "SF_ZLXX_KXXBYWLX", length = 200)
	public String getSfZlxxKxxbywlx() {
		return this.sfZlxxKxxbywlx;
	}

	public void setSfZlxxKxxbywlx(String sfZlxxKxxbywlx) {
		this.sfZlxxKxxbywlx = sfZlxxKxxbywlx;
	}

	@Column(name = "SF_ZLXX_KN", length = 4)
	public String getSfZlxxKn() {
		return this.sfZlxxKn;
	}

	public void setSfZlxxKn(String sfZlxxKn) {
		this.sfZlxxKn = sfZlxxKn;
	}

	@Column(name = "SF_ZLXX_KNYWLX", length = 200)
	public String getSfZlxxKnywlx() {
		return this.sfZlxxKnywlx;
	}

	public void setSfZlxxKnywlx(String sfZlxxKnywlx) {
		this.sfZlxxKnywlx = sfZlxxKnywlx;
	}

	@Column(name = "SF_ZLXX_JTXBGAS", length = 4)
	public String getSfZlxxJtxbgas() {
		return this.sfZlxxJtxbgas;
	}

	public void setSfZlxxJtxbgas(String sfZlxxJtxbgas) {
		this.sfZlxxJtxbgas = sfZlxxJtxbgas;
	}

	@Column(name = "SF_ZLXX_JTXBGASYWLX", length = 200)
	public String getSfZlxxJtxbgasywlx() {
		return this.sfZlxxJtxbgasywlx;
	}

	public void setSfZlxxJtxbgasywlx(String sfZlxxJtxbgasywlx) {
		this.sfZlxxJtxbgasywlx = sfZlxxJtxbgasywlx;
	}

	@Column(name = "SF_ZLXX_RS", length = 4)
	public String getSfZlxxRs() {
		return this.sfZlxxRs;
	}

	public void setSfZlxxRs(String sfZlxxRs) {
		this.sfZlxxRs = sfZlxxRs;
	}

	@Column(name = "SF_ZLXX_RSYWLX", length = 200)
	public String getSfZlxxRsywlx() {
		return this.sfZlxxRsywlx;
	}

	public void setSfZlxxRsywlx(String sfZlxxRsywlx) {
		this.sfZlxxRsywlx = sfZlxxRsywlx;
	}

	@Column(name = "SF_SYS_XCG_JCSJ", length = 7)
	public Timestamp getSfSysXcgJcsj() {
		return this.sfSysXcgJcsj;
	}

	public void setSfSysXcgJcsj(Timestamp sfSysXcgJcsj) {
		this.sfSysXcgJcsj = sfSysXcgJcsj;
	}

	@Column(name = "SF_SYS_XCG_WBC", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgWbc() {
		return this.sfSysXcgWbc;
	}

	public void setSfSysXcgWbc(BigDecimal sfSysXcgWbc) {
		this.sfSysXcgWbc = sfSysXcgWbc;
	}

	@Column(name = "SF_SYS_XCG_N", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgN() {
		return this.sfSysXcgN;
	}

	public void setSfSysXcgN(BigDecimal sfSysXcgN) {
		this.sfSysXcgN = sfSysXcgN;
	}

	@Column(name = "SF_SYS_XCG_RBC", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgRbc() {
		return this.sfSysXcgRbc;
	}

	public void setSfSysXcgRbc(BigDecimal sfSysXcgRbc) {
		this.sfSysXcgRbc = sfSysXcgRbc;
	}

	@Column(name = "SF_SYS_XCG_HB", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgHb() {
		return this.sfSysXcgHb;
	}

	public void setSfSysXcgHb(BigDecimal sfSysXcgHb) {
		this.sfSysXcgHb = sfSysXcgHb;
	}

	@Column(name = "SF_SYS_XCG_HCT", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgHct() {
		return this.sfSysXcgHct;
	}

	public void setSfSysXcgHct(BigDecimal sfSysXcgHct) {
		this.sfSysXcgHct = sfSysXcgHct;
	}

	@Column(name = "SF_SYS_XCG_MCV", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgMcv() {
		return this.sfSysXcgMcv;
	}

	public void setSfSysXcgMcv(BigDecimal sfSysXcgMcv) {
		this.sfSysXcgMcv = sfSysXcgMcv;
	}

	@Column(name = "SF_SYS_XCG_MCH", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgMch() {
		return this.sfSysXcgMch;
	}

	public void setSfSysXcgMch(BigDecimal sfSysXcgMch) {
		this.sfSysXcgMch = sfSysXcgMch;
	}

	@Column(name = "SF_SYS_XCG_MCHC", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgMchc() {
		return this.sfSysXcgMchc;
	}

	public void setSfSysXcgMchc(BigDecimal sfSysXcgMchc) {
		this.sfSysXcgMchc = sfSysXcgMchc;
	}

	@Column(name = "SF_SYS_XCG_PLT", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgPlt() {
		return this.sfSysXcgPlt;
	}

	public void setSfSysXcgPlt(BigDecimal sfSysXcgPlt) {
		this.sfSysXcgPlt = sfSysXcgPlt;
	}

	@Column(name = "SF_SYS_XCG_MPV", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgMpv() {
		return this.sfSysXcgMpv;
	}

	public void setSfSysXcgMpv(BigDecimal sfSysXcgMpv) {
		this.sfSysXcgMpv = sfSysXcgMpv;
	}

	@Column(name = "SF_SYS_XCG_PCT", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgPct() {
		return this.sfSysXcgPct;
	}

	public void setSfSysXcgPct(BigDecimal sfSysXcgPct) {
		this.sfSysXcgPct = sfSysXcgPct;
	}

	@Column(name = "SF_SYS_XCG_PDW", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgPdw() {
		return this.sfSysXcgPdw;
	}

	public void setSfSysXcgPdw(BigDecimal sfSysXcgPdw) {
		this.sfSysXcgPdw = sfSysXcgPdw;
	}

	@Column(name = "SF_SYS_XCG_PLCR", precision = 22, scale = 0)
	public BigDecimal getSfSysXcgPlcr() {
		return this.sfSysXcgPlcr;
	}

	public void setSfSysXcgPlcr(BigDecimal sfSysXcgPlcr) {
		this.sfSysXcgPlcr = sfSysXcgPlcr;
	}

	@Column(name = "SF_SYS_NCG_JCSJ", length = 7)
	public Timestamp getSfSysNcgJcsj() {
		return this.sfSysNcgJcsj;
	}

	public void setSfSysNcgJcsj(Timestamp sfSysNcgJcsj) {
		this.sfSysNcgJcsj = sfSysNcgJcsj;
	}

	@Column(name = "SF_SYS_NCG_NDB", length = 10)
	public String getSfSysNcgNdb() {
		return this.sfSysNcgNdb;
	}

	public void setSfSysNcgNdb(String sfSysNcgNdb) {
		this.sfSysNcgNdb = sfSysNcgNdb;
	}

	@Column(name = "SF_SYS_NCG_NYX", length = 10)
	public String getSfSysNcgNyx() {
		return this.sfSysNcgNyx;
	}

	public void setSfSysNcgNyx(String sfSysNcgNyx) {
		this.sfSysNcgNyx = sfSysNcgNyx;
	}

	@Column(name = "SF_SYS_NCG_NBDB", length = 10)
	public String getSfSysNcgNbdb() {
		return this.sfSysNcgNbdb;
	}

	public void setSfSysNcgNbdb(String sfSysNcgNbdb) {
		this.sfSysNcgNbdb = sfSysNcgNbdb;
	}

	@Column(name = "SF_SYS_TDX_JCSJ", length = 7)
	public Timestamp getSfSysTdxJcsj() {
		return this.sfSysTdxJcsj;
	}

	public void setSfSysTdxJcsj(Timestamp sfSysTdxJcsj) {
		this.sfSysTdxJcsj = sfSysTdxJcsj;
	}

	@Column(name = "SF_SYS_TDX_KFXT", precision = 22, scale = 0)
	public BigDecimal getSfSysTdxKfxt() {
		return this.sfSysTdxKfxt;
	}

	public void setSfSysTdxKfxt(BigDecimal sfSysTdxKfxt) {
		this.sfSysTdxKfxt = sfSysTdxKfxt;
	}

	@Column(name = "SF_SYS_TDX_CH2HXT", precision = 22, scale = 0)
	public BigDecimal getSfSysTdxCh2hxt() {
		return this.sfSysTdxCh2hxt;
	}

	public void setSfSysTdxCh2hxt(BigDecimal sfSysTdxCh2hxt) {
		this.sfSysTdxCh2hxt = sfSysTdxCh2hxt;
	}

	@Column(name = "SF_SYS_TDX_GTA", precision = 22, scale = 0)
	public BigDecimal getSfSysTdxGta() {
		return this.sfSysTdxGta;
	}

	public void setSfSysTdxGta(BigDecimal sfSysTdxGta) {
		this.sfSysTdxGta = sfSysTdxGta;
	}

	@Column(name = "SF_SYS_TDX_THXHDB", precision = 22, scale = 0)
	public BigDecimal getSfSysTdxThxhdb() {
		return this.sfSysTdxThxhdb;
	}

	public void setSfSysTdxThxhdb(BigDecimal sfSysTdxThxhdb) {
		this.sfSysTdxThxhdb = sfSysTdxThxhdb;
	}

	@Column(name = "SF_SYS_XZ_JCSJ", length = 7)
	public Timestamp getSfSysXzJcsj() {
		return this.sfSysXzJcsj;
	}

	public void setSfSysXzJcsj(Timestamp sfSysXzJcsj) {
		this.sfSysXzJcsj = sfSysXzJcsj;
	}

	@Column(name = "SF_SYS_XZ_TC", precision = 22, scale = 0)
	public BigDecimal getSfSysXzTc() {
		return this.sfSysXzTc;
	}

	public void setSfSysXzTc(BigDecimal sfSysXzTc) {
		this.sfSysXzTc = sfSysXzTc;
	}

	@Column(name = "SF_SYS_XZ_TG", precision = 22, scale = 0)
	public BigDecimal getSfSysXzTg() {
		return this.sfSysXzTg;
	}

	public void setSfSysXzTg(BigDecimal sfSysXzTg) {
		this.sfSysXzTg = sfSysXzTg;
	}

	@Column(name = "SF_SYS_XZ_HDLC", precision = 22, scale = 0)
	public BigDecimal getSfSysXzHdlc() {
		return this.sfSysXzHdlc;
	}

	public void setSfSysXzHdlc(BigDecimal sfSysXzHdlc) {
		this.sfSysXzHdlc = sfSysXzHdlc;
	}

	@Column(name = "SF_SYS_XZ_LDLC", precision = 22, scale = 0)
	public BigDecimal getSfSysXzLdlc() {
		return this.sfSysXzLdlc;
	}

	public void setSfSysXzLdlc(BigDecimal sfSysXzLdlc) {
		this.sfSysXzLdlc = sfSysXzLdlc;
	}

	@Column(name = "SF_SYS_SGN_JCSJ", length = 7)
	public Timestamp getSfSysSgnJcsj() {
		return this.sfSysSgnJcsj;
	}

	public void setSfSysSgnJcsj(Timestamp sfSysSgnJcsj) {
		this.sfSysSgnJcsj = sfSysSgnJcsj;
	}

	@Column(name = "SF_SYS_SGN_CR", precision = 22, scale = 0)
	public BigDecimal getSfSysSgnCr() {
		return this.sfSysSgnCr;
	}

	public void setSfSysSgnCr(BigDecimal sfSysSgnCr) {
		this.sfSysSgnCr = sfSysSgnCr;
	}

	@Column(name = "SF_SYS_SGN_BUN", precision = 22, scale = 0)
	public BigDecimal getSfSysSgnBun() {
		return this.sfSysSgnBun;
	}

	public void setSfSysSgnBun(BigDecimal sfSysSgnBun) {
		this.sfSysSgnBun = sfSysSgnBun;
	}

	@Column(name = "SF_SYS_SGN_EGFR", precision = 22, scale = 0)
	public BigDecimal getSfSysSgnEgfr() {
		return this.sfSysSgnEgfr;
	}

	public void setSfSysSgnEgfr(BigDecimal sfSysSgnEgfr) {
		this.sfSysSgnEgfr = sfSysSgnEgfr;
	}

	@Column(name = "SF_SYS_SGN_NS", precision = 22, scale = 0)
	public BigDecimal getSfSysSgnNs() {
		return this.sfSysSgnNs;
	}

	public void setSfSysSgnNs(BigDecimal sfSysSgnNs) {
		this.sfSysSgnNs = sfSysSgnNs;
	}

	@Column(name = "SF_SYS_NXGN_JCSJ", length = 7)
	public Timestamp getSfSysNxgnJcsj() {
		return this.sfSysNxgnJcsj;
	}

	public void setSfSysNxgnJcsj(Timestamp sfSysNxgnJcsj) {
		this.sfSysNxgnJcsj = sfSysNxgnJcsj;
	}

	@Column(name = "SF_SYS_NXGN_APTT", precision = 22, scale = 0)
	public BigDecimal getSfSysNxgnAptt() {
		return this.sfSysNxgnAptt;
	}

	public void setSfSysNxgnAptt(BigDecimal sfSysNxgnAptt) {
		this.sfSysNxgnAptt = sfSysNxgnAptt;
	}

	@Column(name = "SF_SYS_NXGN_PT", precision = 22, scale = 0)
	public BigDecimal getSfSysNxgnPt() {
		return this.sfSysNxgnPt;
	}

	public void setSfSysNxgnPt(BigDecimal sfSysNxgnPt) {
		this.sfSysNxgnPt = sfSysNxgnPt;
	}

	@Column(name = "SF_SYS_NXGN_INR", precision = 22, scale = 0)
	public BigDecimal getSfSysNxgnInr() {
		return this.sfSysNxgnInr;
	}

	public void setSfSysNxgnInr(BigDecimal sfSysNxgnInr) {
		this.sfSysNxgnInr = sfSysNxgnInr;
	}

	@Column(name = "SF_SYS_NXGN_TT", precision = 22, scale = 0)
	public BigDecimal getSfSysNxgnTt() {
		return this.sfSysNxgnTt;
	}

	public void setSfSysNxgnTt(BigDecimal sfSysNxgnTt) {
		this.sfSysNxgnTt = sfSysNxgnTt;
	}

	@Column(name = "SF_SYS_NXGN_FBG", precision = 22, scale = 0)
	public BigDecimal getSfSysNxgnFbg() {
		return this.sfSysNxgnFbg;
	}

	public void setSfSysNxgnFbg(BigDecimal sfSysNxgnFbg) {
		this.sfSysNxgnFbg = sfSysNxgnFbg;
	}

	@Column(name = "SF_SYS_GGN_JCSJ", length = 7)
	public Timestamp getSfSysGgnJcsj() {
		return this.sfSysGgnJcsj;
	}

	public void setSfSysGgnJcsj(Timestamp sfSysGgnJcsj) {
		this.sfSysGgnJcsj = sfSysGgnJcsj;
	}

	@Column(name = "SF_SYS_GGN_AST", precision = 22, scale = 0)
	public BigDecimal getSfSysGgnAst() {
		return this.sfSysGgnAst;
	}

	public void setSfSysGgnAst(BigDecimal sfSysGgnAst) {
		this.sfSysGgnAst = sfSysGgnAst;
	}

	@Column(name = "SF_SYS_GGN_ALT", precision = 22, scale = 0)
	public BigDecimal getSfSysGgnAlt() {
		return this.sfSysGgnAlt;
	}

	public void setSfSysGgnAlt(BigDecimal sfSysGgnAlt) {
		this.sfSysGgnAlt = sfSysGgnAlt;
	}

	@Column(name = "SF_SYS_GGN_ALB", precision = 22, scale = 0)
	public BigDecimal getSfSysGgnAlb() {
		return this.sfSysGgnAlb;
	}

	public void setSfSysGgnAlb(BigDecimal sfSysGgnAlb) {
		this.sfSysGgnAlb = sfSysGgnAlb;
	}

	@Column(name = "SF_SYS_GGN_TBIL", precision = 22, scale = 0)
	public BigDecimal getSfSysGgnTbil() {
		return this.sfSysGgnTbil;
	}

	public void setSfSysGgnTbil(BigDecimal sfSysGgnTbil) {
		this.sfSysGgnTbil = sfSysGgnTbil;
	}

	@Column(name = "SF_SYS_GGN_DBIL", precision = 22, scale = 0)
	public BigDecimal getSfSysGgnDbil() {
		return this.sfSysGgnDbil;
	}

	public void setSfSysGgnDbil(BigDecimal sfSysGgnDbil) {
		this.sfSysGgnDbil = sfSysGgnDbil;
	}

	@Column(name = "SF_SYS_GGN_UBIL", precision = 22, scale = 0)
	public BigDecimal getSfSysGgnUbil() {
		return this.sfSysGgnUbil;
	}

	public void setSfSysGgnUbil(BigDecimal sfSysGgnUbil) {
		this.sfSysGgnUbil = sfSysGgnUbil;
	}

	@Column(name = "SF_SYS_DJZ_JCSJ", length = 7)
	public Timestamp getSfSysDjzJcsj() {
		return this.sfSysDjzJcsj;
	}

	public void setSfSysDjzJcsj(Timestamp sfSysDjzJcsj) {
		this.sfSysDjzJcsj = sfSysDjzJcsj;
	}

	@Column(name = "SF_SYS_DJZ_N", precision = 22, scale = 0)
	public BigDecimal getSfSysDjzN() {
		return this.sfSysDjzN;
	}

	public void setSfSysDjzN(BigDecimal sfSysDjzN) {
		this.sfSysDjzN = sfSysDjzN;
	}

	@Column(name = "SF_SYS_DJZ_L", precision = 22, scale = 0)
	public BigDecimal getSfSysDjzL() {
		return this.sfSysDjzL;
	}

	public void setSfSysDjzL(BigDecimal sfSysDjzL) {
		this.sfSysDjzL = sfSysDjzL;
	}

	@Column(name = "SF_SYS_DJZ_J", precision = 22, scale = 0)
	public BigDecimal getSfSysDjzJ() {
		return this.sfSysDjzJ;
	}

	public void setSfSysDjzJ(BigDecimal sfSysDjzJ) {
		this.sfSysDjzJ = sfSysDjzJ;
	}

	@Column(name = "SF_SYS_DJZ_G", precision = 22, scale = 0)
	public BigDecimal getSfSysDjzG() {
		return this.sfSysDjzG;
	}

	public void setSfSysDjzG(BigDecimal sfSysDjzG) {
		this.sfSysDjzG = sfSysDjzG;
	}

	@Column(name = "SF_SYS_DJZ_RS", precision = 22, scale = 0)
	public BigDecimal getSfSysDjzRs() {
		return this.sfSysDjzRs;
	}

	public void setSfSysDjzRs(BigDecimal sfSysDjzRs) {
		this.sfSysDjzRs = sfSysDjzRs;
	}

	@Column(name = "SF_SYS_XJSSBJW_JCSJ", length = 7)
	public Timestamp getSfSysXjssbjwJcsj() {
		return this.sfSysXjssbjwJcsj;
	}

	public void setSfSysXjssbjwJcsj(Timestamp sfSysXjssbjwJcsj) {
		this.sfSysXjssbjwJcsj = sfSysXjssbjwJcsj;
	}

	@Column(name = "SF_SYS_XJSSBJW_CTNL", precision = 22, scale = 0)
	public BigDecimal getSfSysXjssbjwCtnl() {
		return this.sfSysXjssbjwCtnl;
	}

	public void setSfSysXjssbjwCtnl(BigDecimal sfSysXjssbjwCtnl) {
		this.sfSysXjssbjwCtnl = sfSysXjssbjwCtnl;
	}

	@Column(name = "SF_SYS_XJSSBJW_CKMB", precision = 22, scale = 0)
	public BigDecimal getSfSysXjssbjwCkmb() {
		return this.sfSysXjssbjwCkmb;
	}

	public void setSfSysXjssbjwCkmb(BigDecimal sfSysXjssbjwCkmb) {
		this.sfSysXjssbjwCkmb = sfSysXjssbjwCkmb;
	}

	@Column(name = "SF_SYS_XJSSBJW_MYO", precision = 22, scale = 0)
	public BigDecimal getSfSysXjssbjwMyo() {
		return this.sfSysXjssbjwMyo;
	}

	public void setSfSysXjssbjwMyo(BigDecimal sfSysXjssbjwMyo) {
		this.sfSysXjssbjwMyo = sfSysXjssbjwMyo;
	}

	@Column(name = "SF_SYS_XGYZB_JCSJ", length = 7)
	public Timestamp getSfSysXgyzbJcsj() {
		return this.sfSysXgyzbJcsj;
	}

	public void setSfSysXgyzbJcsj(Timestamp sfSysXgyzbJcsj) {
		this.sfSysXgyzbJcsj = sfSysXgyzbJcsj;
	}

	@Column(name = "SF_SYS_XGYZB_ANA", length = 10)
	public String getSfSysXgyzbAna() {
		return this.sfSysXgyzbAna;
	}

	public void setSfSysXgyzbAna(String sfSysXgyzbAna) {
		this.sfSysXgyzbAna = sfSysXgyzbAna;
	}

	@Column(name = "SF_SYS_XGYZB_ANCA", length = 10)
	public String getSfSysXgyzbAnca() {
		return this.sfSysXgyzbAnca;
	}

	public void setSfSysXgyzbAnca(String sfSysXgyzbAnca) {
		this.sfSysXgyzbAnca = sfSysXgyzbAnca;
	}

	@Column(name = "SF_SYS_XGYZB_DSDNA", length = 10)
	public String getSfSysXgyzbDsdna() {
		return this.sfSysXgyzbDsdna;
	}

	public void setSfSysXgyzbDsdna(String sfSysXgyzbDsdna) {
		this.sfSysXgyzbDsdna = sfSysXgyzbDsdna;
	}

	@Column(name = "SF_SYS_XGYZB_SSA", length = 10)
	public String getSfSysXgyzbSsa() {
		return this.sfSysXgyzbSsa;
	}

	public void setSfSysXgyzbSsa(String sfSysXgyzbSsa) {
		this.sfSysXgyzbSsa = sfSysXgyzbSsa;
	}

	@Column(name = "SF_SYS_XGYZB_SSB", length = 10)
	public String getSfSysXgyzbSsb() {
		return this.sfSysXgyzbSsb;
	}

	public void setSfSysXgyzbSsb(String sfSysXgyzbSsb) {
		this.sfSysXgyzbSsb = sfSysXgyzbSsb;
	}

	@Column(name = "SF_SYS_XGYZB_KXLZKT", length = 10)
	public String getSfSysXgyzbKxlzkt() {
		return this.sfSysXgyzbKxlzkt;
	}

	public void setSfSysXgyzbKxlzkt(String sfSysXgyzbKxlzkt) {
		this.sfSysXgyzbKxlzkt = sfSysXgyzbKxlzkt;
	}

	@Column(name = "SF_SYS_XGYZB_KSXQJDMKT", length = 10)
	public String getSfSysXgyzbKsxqjdmkt() {
		return this.sfSysXgyzbKsxqjdmkt;
	}

	public void setSfSysXgyzbKsxqjdmkt(String sfSysXgyzbKsxqjdmkt) {
		this.sfSysXgyzbKsxqjdmkt = sfSysXgyzbKsxqjdmkt;
	}

	@Column(name = "SF_SYS_XGYZB_ESR", precision = 22, scale = 0)
	public BigDecimal getSfSysXgyzbEsr() {
		return this.sfSysXgyzbEsr;
	}

	public void setSfSysXgyzbEsr(BigDecimal sfSysXgyzbEsr) {
		this.sfSysXgyzbEsr = sfSysXgyzbEsr;
	}

	@Column(name = "SF_SYS_QT_JCSJ", length = 7)
	public Timestamp getSfSysQtJcsj() {
		return this.sfSysQtJcsj;
	}

	public void setSfSysQtJcsj(Timestamp sfSysQtJcsj) {
		this.sfSysQtJcsj = sfSysQtJcsj;
	}

	@Column(name = "SF_SYS_QT_TXBGAS", precision = 22, scale = 0)
	public BigDecimal getSfSysQtTxbgas() {
		return this.sfSysQtTxbgas;
	}

	public void setSfSysQtTxbgas(BigDecimal sfSysQtTxbgas) {
		this.sfSysQtTxbgas = sfSysQtTxbgas;
	}

	@Column(name = "SF_SYS_QT_HSCRP", precision = 22, scale = 0)
	public BigDecimal getSfSysQtHscrp() {
		return this.sfSysQtHscrp;
	}

	public void setSfSysQtHscrp(BigDecimal sfSysQtHscrp) {
		this.sfSysQtHscrp = sfSysQtHscrp;
	}

	@Column(name = "SF_SYS_QT_JGSY", precision = 22, scale = 0)
	public BigDecimal getSfSysQtJgsy() {
		return this.sfSysQtJgsy;
	}

	public void setSfSysQtJgsy(BigDecimal sfSysQtJgsy) {
		this.sfSysQtJgsy = sfSysQtJgsy;
	}

	@Column(name = "SF_SYS_QT_PROBNP", precision = 22, scale = 0)
	public BigDecimal getSfSysQtProbnp() {
		return this.sfSysQtProbnp;
	}

	public void setSfSysQtProbnp(BigDecimal sfSysQtProbnp) {
		this.sfSysQtProbnp = sfSysQtProbnp;
	}

	@Column(name = "SF_SYS_QT_XDFM", precision = 22, scale = 0)
	public BigDecimal getSfSysQtXdfm() {
		return this.sfSysQtXdfm;
	}

	public void setSfSysQtXdfm(BigDecimal sfSysQtXdfm) {
		this.sfSysQtXdfm = sfSysQtXdfm;
	}

	@Column(name = "SF_YXX_TLCT_TLCT", length = 4)
	public String getSfYxxTlctTlct() {
		return this.sfYxxTlctTlct;
	}

	public void setSfYxxTlctTlct(String sfYxxTlctTlct) {
		this.sfYxxTlctTlct = sfYxxTlctTlct;
	}

	@Column(name = "SF_YXX_TLCT_JCSJ", length = 7)
	public Timestamp getSfYxxTlctJcsj() {
		return this.sfYxxTlctJcsj;
	}

	public void setSfYxxTlctJcsj(Timestamp sfYxxTlctJcsj) {
		this.sfYxxTlctJcsj = sfYxxTlctJcsj;
	}

	@Column(name = "SF_YXX_TLCT_XFNGS", length = 4)
	public String getSfYxxTlctXfngs() {
		return this.sfYxxTlctXfngs;
	}

	public void setSfYxxTlctXfngs(String sfYxxTlctXfngs) {
		this.sfYxxTlctXfngs = sfYxxTlctXfngs;
	}

	@Column(name = "SF_YXX_TLCT_XFNGSBW", length = 10)
	public String getSfYxxTlctXfngsbw() {
		return this.sfYxxTlctXfngsbw;
	}

	public void setSfYxxTlctXfngsbw(String sfYxxTlctXfngsbw) {
		this.sfYxxTlctXfngsbw = sfYxxTlctXfngsbw;
	}

	@Column(name = "SF_YXX_TLCT_XFNGSZCXQ", length = 50)
	public String getSfYxxTlctXfngszcxq() {
		return this.sfYxxTlctXfngszcxq;
	}

	public void setSfYxxTlctXfngszcxq(String sfYxxTlctXfngszcxq) {
		this.sfYxxTlctXfngszcxq = sfYxxTlctXfngszcxq;
	}

	@Column(name = "SF_YXX_TLCT_XFNGSYCXQ", length = 50)
	public String getSfYxxTlctXfngsycxq() {
		return this.sfYxxTlctXfngsycxq;
	}

	public void setSfYxxTlctXfngsycxq(String sfYxxTlctXfngsycxq) {
		this.sfYxxTlctXfngsycxq = sfYxxTlctXfngsycxq;
	}

	@Column(name = "SF_YXX_TLCT_NGSTJ", precision = 22, scale = 0)
	public BigDecimal getSfYxxTlctNgstj() {
		return this.sfYxxTlctNgstj;
	}

	public void setSfYxxTlctNgstj(BigDecimal sfYxxTlctNgstj) {
		this.sfYxxTlctNgstj = sfYxxTlctNgstj;
	}

	@Column(name = "SF_YXX_TLCT_XFNCX", length = 4)
	public String getSfYxxTlctXfncx() {
		return this.sfYxxTlctXfncx;
	}

	public void setSfYxxTlctXfncx(String sfYxxTlctXfncx) {
		this.sfYxxTlctXfncx = sfYxxTlctXfncx;
	}

	@Column(name = "SF_YXX_TLCT_XFNCXBW", length = 10)
	public String getSfYxxTlctXfncxbw() {
		return this.sfYxxTlctXfncxbw;
	}

	public void setSfYxxTlctXfncxbw(String sfYxxTlctXfncxbw) {
		this.sfYxxTlctXfncxbw = sfYxxTlctXfncxbw;
	}

	@Column(name = "SF_YXX_TLCT_XFNCXZCXQ", length = 50)
	public String getSfYxxTlctXfncxzcxq() {
		return this.sfYxxTlctXfncxzcxq;
	}

	public void setSfYxxTlctXfncxzcxq(String sfYxxTlctXfncxzcxq) {
		this.sfYxxTlctXfncxzcxq = sfYxxTlctXfncxzcxq;
	}

	@Column(name = "SF_YXX_TLCT_XFNCXYCXQ", length = 50)
	public String getSfYxxTlctXfncxycxq() {
		return this.sfYxxTlctXfncxycxq;
	}

	public void setSfYxxTlctXfncxycxq(String sfYxxTlctXfncxycxq) {
		this.sfYxxTlctXfncxycxq = sfYxxTlctXfncxycxq;
	}

	@Column(name = "SF_YXX_TLCT_NCXDCXL", precision = 22, scale = 0)
	public BigDecimal getSfYxxTlctNcxdcxl() {
		return this.sfYxxTlctNcxdcxl;
	}

	public void setSfYxxTlctNcxdcxl(BigDecimal sfYxxTlctNcxdcxl) {
		this.sfYxxTlctNcxdcxl = sfYxxTlctNcxdcxl;
	}

	@Column(name = "SF_YXX_TLCT_XFZWMXQCX", length = 4)
	public String getSfYxxTlctXfzwmxqcx() {
		return this.sfYxxTlctXfzwmxqcx;
	}

	public void setSfYxxTlctXfzwmxqcx(String sfYxxTlctXfzwmxqcx) {
		this.sfYxxTlctXfzwmxqcx = sfYxxTlctXfzwmxqcx;
	}

	@Column(name = "SF_YXX_TLCT_BSBZ", length = 50)
	public String getSfYxxTlctBsbz() {
		return this.sfYxxTlctBsbz;
	}

	public void setSfYxxTlctBsbz(String sfYxxTlctBsbz) {
		this.sfYxxTlctBsbz = sfYxxTlctBsbz;
	}

	@Column(name = "SF_YXX_TLMRI_TLMRI", length = 4)
	public String getSfYxxTlmriTlmri() {
		return this.sfYxxTlmriTlmri;
	}

	public void setSfYxxTlmriTlmri(String sfYxxTlmriTlmri) {
		this.sfYxxTlmriTlmri = sfYxxTlmriTlmri;
	}

	@Column(name = "SF_YXX_TLMRI_JCSJ", length = 7)
	public Timestamp getSfYxxTlmriJcsj() {
		return this.sfYxxTlmriJcsj;
	}

	public void setSfYxxTlmriJcsj(Timestamp sfYxxTlmriJcsj) {
		this.sfYxxTlmriJcsj = sfYxxTlmriJcsj;
	}

	@Column(name = "SF_YXX_TLMRI_SMXL", length = 50)
	public String getSfYxxTlmriSmxl() {
		return this.sfYxxTlmriSmxl;
	}

	public void setSfYxxTlmriSmxl(String sfYxxTlmriSmxl) {
		this.sfYxxTlmriSmxl = sfYxxTlmriSmxl;
	}

	@Column(name = "SF_YXX_TLMRI_XFNGS", length = 4)
	public String getSfYxxTlmriXfngs() {
		return this.sfYxxTlmriXfngs;
	}

	public void setSfYxxTlmriXfngs(String sfYxxTlmriXfngs) {
		this.sfYxxTlmriXfngs = sfYxxTlmriXfngs;
	}

	@Column(name = "SF_YXX_TLMRI_XFNGSBW", length = 10)
	public String getSfYxxTlmriXfngsbw() {
		return this.sfYxxTlmriXfngsbw;
	}

	public void setSfYxxTlmriXfngsbw(String sfYxxTlmriXfngsbw) {
		this.sfYxxTlmriXfngsbw = sfYxxTlmriXfngsbw;
	}

	@Column(name = "SF_YXX_TLMRI_XFNGSZCXQ", length = 50)
	public String getSfYxxTlmriXfngszcxq() {
		return this.sfYxxTlmriXfngszcxq;
	}

	public void setSfYxxTlmriXfngszcxq(String sfYxxTlmriXfngszcxq) {
		this.sfYxxTlmriXfngszcxq = sfYxxTlmriXfngszcxq;
	}

	@Column(name = "SF_YXX_TLMRI_XFNGSYCXQ", length = 50)
	public String getSfYxxTlmriXfngsycxq() {
		return this.sfYxxTlmriXfngsycxq;
	}

	public void setSfYxxTlmriXfngsycxq(String sfYxxTlmriXfngsycxq) {
		this.sfYxxTlmriXfngsycxq = sfYxxTlmriXfngsycxq;
	}

	@Column(name = "SF_YXX_TLMRI_NGSTJ", precision = 22, scale = 0)
	public BigDecimal getSfYxxTlmriNgstj() {
		return this.sfYxxTlmriNgstj;
	}

	public void setSfYxxTlmriNgstj(BigDecimal sfYxxTlmriNgstj) {
		this.sfYxxTlmriNgstj = sfYxxTlmriNgstj;
	}

	@Column(name = "SF_YXX_TLMRI_XFNCX", length = 4)
	public String getSfYxxTlmriXfncx() {
		return this.sfYxxTlmriXfncx;
	}

	public void setSfYxxTlmriXfncx(String sfYxxTlmriXfncx) {
		this.sfYxxTlmriXfncx = sfYxxTlmriXfncx;
	}

	@Column(name = "SF_YXX_TLMRI_XFNCXBW", length = 10)
	public String getSfYxxTlmriXfncxbw() {
		return this.sfYxxTlmriXfncxbw;
	}

	public void setSfYxxTlmriXfncxbw(String sfYxxTlmriXfncxbw) {
		this.sfYxxTlmriXfncxbw = sfYxxTlmriXfncxbw;
	}

	@Column(name = "SF_YXX_TLMRI_XFNCXZCXQ", length = 50)
	public String getSfYxxTlmriXfncxzcxq() {
		return this.sfYxxTlmriXfncxzcxq;
	}

	public void setSfYxxTlmriXfncxzcxq(String sfYxxTlmriXfncxzcxq) {
		this.sfYxxTlmriXfncxzcxq = sfYxxTlmriXfncxzcxq;
	}

	@Column(name = "SF_YXX_TLMRI_XFNCXYCXQ", length = 50)
	public String getSfYxxTlmriXfncxycxq() {
		return this.sfYxxTlmriXfncxycxq;
	}

	public void setSfYxxTlmriXfncxycxq(String sfYxxTlmriXfncxycxq) {
		this.sfYxxTlmriXfncxycxq = sfYxxTlmriXfncxycxq;
	}

	@Column(name = "SF_YXX_TLMRI_XFZWMXQCX", length = 4)
	public String getSfYxxTlmriXfzwmxqcx() {
		return this.sfYxxTlmriXfzwmxqcx;
	}

	public void setSfYxxTlmriXfzwmxqcx(String sfYxxTlmriXfzwmxqcx) {
		this.sfYxxTlmriXfzwmxqcx = sfYxxTlmriXfzwmxqcx;
	}

	@Column(name = "SF_YXX_TLMRI_BSBZ", length = 50)
	public String getSfYxxTlmriBsbz() {
		return this.sfYxxTlmriBsbz;
	}

	public void setSfYxxTlmriBsbz(String sfYxxTlmriBsbz) {
		this.sfYxxTlmriBsbz = sfYxxTlmriBsbz;
	}

	@Column(name = "SF_YXX_LNXGMRA_LNXGMRA", length = 4)
	public String getSfYxxLnxgmraLnxgmra() {
		return this.sfYxxLnxgmraLnxgmra;
	}

	public void setSfYxxLnxgmraLnxgmra(String sfYxxLnxgmraLnxgmra) {
		this.sfYxxLnxgmraLnxgmra = sfYxxLnxgmraLnxgmra;
	}

	@Column(name = "SF_YXX_LNXGMRA_JCSJ", length = 7)
	public Timestamp getSfYxxLnxgmraJcsj() {
		return this.sfYxxLnxgmraJcsj;
	}

	public void setSfYxxLnxgmraJcsj(Timestamp sfYxxLnxgmraJcsj) {
		this.sfYxxLnxgmraJcsj = sfYxxLnxgmraJcsj;
	}

	@Column(name = "SF_YXX_LNXGMRA_DNZDMZCXQ", length = 20)
	public String getSfYxxLnxgmraDnzdmzcxq() {
		return this.sfYxxLnxgmraDnzdmzcxq;
	}

	public void setSfYxxLnxgmraDnzdmzcxq(String sfYxxLnxgmraDnzdmzcxq) {
		this.sfYxxLnxgmraDnzdmzcxq = sfYxxLnxgmraDnzdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_DNZDMYCXQ", length = 20)
	public String getSfYxxLnxgmraDnzdmycxq() {
		return this.sfYxxLnxgmraDnzdmycxq;
	}

	public void setSfYxxLnxgmraDnzdmycxq(String sfYxxLnxgmraDnzdmycxq) {
		this.sfYxxLnxgmraDnzdmycxq = sfYxxLnxgmraDnzdmycxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_DNQDMZCXQ", length = 20)
	public String getSfYxxLnxgmraDnqdmzcxq() {
		return this.sfYxxLnxgmraDnqdmzcxq;
	}

	public void setSfYxxLnxgmraDnqdmzcxq(String sfYxxLnxgmraDnqdmzcxq) {
		this.sfYxxLnxgmraDnqdmzcxq = sfYxxLnxgmraDnqdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_DNQDMYCXQ", length = 20)
	public String getSfYxxLnxgmraDnqdmycxq() {
		return this.sfYxxLnxgmraDnqdmycxq;
	}

	public void setSfYxxLnxgmraDnqdmycxq(String sfYxxLnxgmraDnqdmycxq) {
		this.sfYxxLnxgmraDnqdmycxq = sfYxxLnxgmraDnqdmycxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_DNHDMZCXQ", length = 20)
	public String getSfYxxLnxgmraDnhdmzcxq() {
		return this.sfYxxLnxgmraDnhdmzcxq;
	}

	public void setSfYxxLnxgmraDnhdmzcxq(String sfYxxLnxgmraDnhdmzcxq) {
		this.sfYxxLnxgmraDnhdmzcxq = sfYxxLnxgmraDnhdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_DNHDMYCXQ", length = 20)
	public String getSfYxxLnxgmraDnhdmycxq() {
		return this.sfYxxLnxgmraDnhdmycxq;
	}

	public void setSfYxxLnxgmraDnhdmycxq(String sfYxxLnxgmraDnhdmycxq) {
		this.sfYxxLnxgmraDnhdmycxq = sfYxxLnxgmraDnhdmycxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_JNDMLNDZCXQ", length = 20)
	public String getSfYxxLnxgmraJndmlndzcxq() {
		return this.sfYxxLnxgmraJndmlndzcxq;
	}

	public void setSfYxxLnxgmraJndmlndzcxq(String sfYxxLnxgmraJndmlndzcxq) {
		this.sfYxxLnxgmraJndmlndzcxq = sfYxxLnxgmraJndmlndzcxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_JNDMLNDYCXQ", length = 20)
	public String getSfYxxLnxgmraJndmlndycxq() {
		return this.sfYxxLnxgmraJndmlndycxq;
	}

	public void setSfYxxLnxgmraJndmlndycxq(String sfYxxLnxgmraJndmlndycxq) {
		this.sfYxxLnxgmraJndmlndycxq = sfYxxLnxgmraJndmlndycxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_ZDMZCXQ", length = 20)
	public String getSfYxxLnxgmraZdmzcxq() {
		return this.sfYxxLnxgmraZdmzcxq;
	}

	public void setSfYxxLnxgmraZdmzcxq(String sfYxxLnxgmraZdmzcxq) {
		this.sfYxxLnxgmraZdmzcxq = sfYxxLnxgmraZdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_ZDMYCXQ", length = 20)
	public String getSfYxxLnxgmraZdmycxq() {
		return this.sfYxxLnxgmraZdmycxq;
	}

	public void setSfYxxLnxgmraZdmycxq(String sfYxxLnxgmraZdmycxq) {
		this.sfYxxLnxgmraZdmycxq = sfYxxLnxgmraZdmycxq;
	}

	@Column(name = "SF_YXX_LNXGMRA_JDDM", length = 20)
	public String getSfYxxLnxgmraJddm() {
		return this.sfYxxLnxgmraJddm;
	}

	public void setSfYxxLnxgmraJddm(String sfYxxLnxgmraJddm) {
		this.sfYxxLnxgmraJddm = sfYxxLnxgmraJddm;
	}

	@Column(name = "SF_YXX_LNXGMRA_CZXHPG", length = 100)
	public String getSfYxxLnxgmraCzxhpg() {
		return this.sfYxxLnxgmraCzxhpg;
	}

	public void setSfYxxLnxgmraCzxhpg(String sfYxxLnxgmraCzxhpg) {
		this.sfYxxLnxgmraCzxhpg = sfYxxLnxgmraCzxhpg;
	}

	@Column(name = "SF_YXX_LNXGMRA_CZXHPGZQT", length = 100)
	public String getSfYxxLnxgmraCzxhpgzqt() {
		return this.sfYxxLnxgmraCzxhpgzqt;
	}

	public void setSfYxxLnxgmraCzxhpgzqt(String sfYxxLnxgmraCzxhpgzqt) {
		this.sfYxxLnxgmraCzxhpgzqt = sfYxxLnxgmraCzxhpgzqt;
	}

	@Column(name = "SF_YXX_LNXGCTA_LNXGCTA", length = 4)
	public String getSfYxxLnxgctaLnxgcta() {
		return this.sfYxxLnxgctaLnxgcta;
	}

	public void setSfYxxLnxgctaLnxgcta(String sfYxxLnxgctaLnxgcta) {
		this.sfYxxLnxgctaLnxgcta = sfYxxLnxgctaLnxgcta;
	}

	@Column(name = "SF_YXX_LNXGCTA_JCSJ", length = 7)
	public Timestamp getSfYxxLnxgctaJcsj() {
		return this.sfYxxLnxgctaJcsj;
	}

	public void setSfYxxLnxgctaJcsj(Timestamp sfYxxLnxgctaJcsj) {
		this.sfYxxLnxgctaJcsj = sfYxxLnxgctaJcsj;
	}

	@Column(name = "SF_YXX_LNXGCTA_DNZDMZCXQ", length = 20)
	public String getSfYxxLnxgctaDnzdmzcxq() {
		return this.sfYxxLnxgctaDnzdmzcxq;
	}

	public void setSfYxxLnxgctaDnzdmzcxq(String sfYxxLnxgctaDnzdmzcxq) {
		this.sfYxxLnxgctaDnzdmzcxq = sfYxxLnxgctaDnzdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_DNZDMYCXQ", length = 20)
	public String getSfYxxLnxgctaDnzdmycxq() {
		return this.sfYxxLnxgctaDnzdmycxq;
	}

	public void setSfYxxLnxgctaDnzdmycxq(String sfYxxLnxgctaDnzdmycxq) {
		this.sfYxxLnxgctaDnzdmycxq = sfYxxLnxgctaDnzdmycxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_DNQDMZCXQ", length = 20)
	public String getSfYxxLnxgctaDnqdmzcxq() {
		return this.sfYxxLnxgctaDnqdmzcxq;
	}

	public void setSfYxxLnxgctaDnqdmzcxq(String sfYxxLnxgctaDnqdmzcxq) {
		this.sfYxxLnxgctaDnqdmzcxq = sfYxxLnxgctaDnqdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_DNQDMYCXQ", length = 20)
	public String getSfYxxLnxgctaDnqdmycxq() {
		return this.sfYxxLnxgctaDnqdmycxq;
	}

	public void setSfYxxLnxgctaDnqdmycxq(String sfYxxLnxgctaDnqdmycxq) {
		this.sfYxxLnxgctaDnqdmycxq = sfYxxLnxgctaDnqdmycxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_DNHDMZCXQ", length = 20)
	public String getSfYxxLnxgctaDnhdmzcxq() {
		return this.sfYxxLnxgctaDnhdmzcxq;
	}

	public void setSfYxxLnxgctaDnhdmzcxq(String sfYxxLnxgctaDnhdmzcxq) {
		this.sfYxxLnxgctaDnhdmzcxq = sfYxxLnxgctaDnhdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_DNHDMYCXQ", length = 20)
	public String getSfYxxLnxgctaDnhdmycxq() {
		return this.sfYxxLnxgctaDnhdmycxq;
	}

	public void setSfYxxLnxgctaDnhdmycxq(String sfYxxLnxgctaDnhdmycxq) {
		this.sfYxxLnxgctaDnhdmycxq = sfYxxLnxgctaDnhdmycxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_JNDMLNDZCXQ", length = 20)
	public String getSfYxxLnxgctaJndmlndzcxq() {
		return this.sfYxxLnxgctaJndmlndzcxq;
	}

	public void setSfYxxLnxgctaJndmlndzcxq(String sfYxxLnxgctaJndmlndzcxq) {
		this.sfYxxLnxgctaJndmlndzcxq = sfYxxLnxgctaJndmlndzcxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_JNDMLNDYCXQ", length = 20)
	public String getSfYxxLnxgctaJndmlndycxq() {
		return this.sfYxxLnxgctaJndmlndycxq;
	}

	public void setSfYxxLnxgctaJndmlndycxq(String sfYxxLnxgctaJndmlndycxq) {
		this.sfYxxLnxgctaJndmlndycxq = sfYxxLnxgctaJndmlndycxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_ZDMZCXQ", length = 20)
	public String getSfYxxLnxgctaZdmzcxq() {
		return this.sfYxxLnxgctaZdmzcxq;
	}

	public void setSfYxxLnxgctaZdmzcxq(String sfYxxLnxgctaZdmzcxq) {
		this.sfYxxLnxgctaZdmzcxq = sfYxxLnxgctaZdmzcxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_ZDMYCXQ", length = 20)
	public String getSfYxxLnxgctaZdmycxq() {
		return this.sfYxxLnxgctaZdmycxq;
	}

	public void setSfYxxLnxgctaZdmycxq(String sfYxxLnxgctaZdmycxq) {
		this.sfYxxLnxgctaZdmycxq = sfYxxLnxgctaZdmycxq;
	}

	@Column(name = "SF_YXX_LNXGCTA_JDDM", length = 20)
	public String getSfYxxLnxgctaJddm() {
		return this.sfYxxLnxgctaJddm;
	}

	public void setSfYxxLnxgctaJddm(String sfYxxLnxgctaJddm) {
		this.sfYxxLnxgctaJddm = sfYxxLnxgctaJddm;
	}

	@Column(name = "SF_YXX_LNXGCTA_CZXHPG", length = 100)
	public String getSfYxxLnxgctaCzxhpg() {
		return this.sfYxxLnxgctaCzxhpg;
	}

	public void setSfYxxLnxgctaCzxhpg(String sfYxxLnxgctaCzxhpg) {
		this.sfYxxLnxgctaCzxhpg = sfYxxLnxgctaCzxhpg;
	}

	@Column(name = "SF_YXX_LNXGCTA_CZXHPGZQT", length = 100)
	public String getSfYxxLnxgctaCzxhpgzqt() {
		return this.sfYxxLnxgctaCzxhpgzqt;
	}

	public void setSfYxxLnxgctaCzxhpgzqt(String sfYxxLnxgctaCzxhpgzqt) {
		this.sfYxxLnxgctaCzxhpgzqt = sfYxxLnxgctaCzxhpgzqt;
	}

	@Column(name = "SF_YXX_JBXGCTA_JBXGCTA", length = 4)
	public String getSfYxxJbxgctaJbxgcta() {
		return this.sfYxxJbxgctaJbxgcta;
	}

	public void setSfYxxJbxgctaJbxgcta(String sfYxxJbxgctaJbxgcta) {
		this.sfYxxJbxgctaJbxgcta = sfYxxJbxgctaJbxgcta;
	}

	@Column(name = "SF_YXX_JBXGCTA_JCSJ", length = 7)
	public Timestamp getSfYxxJbxgctaJcsj() {
		return this.sfYxxJbxgctaJcsj;
	}

	public void setSfYxxJbxgctaJcsj(Timestamp sfYxxJbxgctaJcsj) {
		this.sfYxxJbxgctaJcsj = sfYxxJbxgctaJcsj;
	}

	@Column(name = "SF_YXX_JBXGCTA_JZDMZCXQ", length = 20)
	public String getSfYxxJbxgctaJzdmzcxq() {
		return this.sfYxxJbxgctaJzdmzcxq;
	}

	public void setSfYxxJbxgctaJzdmzcxq(String sfYxxJbxgctaJzdmzcxq) {
		this.sfYxxJbxgctaJzdmzcxq = sfYxxJbxgctaJzdmzcxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_JZDMYCXQ", length = 20)
	public String getSfYxxJbxgctaJzdmycxq() {
		return this.sfYxxJbxgctaJzdmycxq;
	}

	public void setSfYxxJbxgctaJzdmycxq(String sfYxxJbxgctaJzdmycxq) {
		this.sfYxxJbxgctaJzdmycxq = sfYxxJbxgctaJzdmycxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_JZDMFCCZCXQ", length = 20)
	public String getSfYxxJbxgctaJzdmfcczcxq() {
		return this.sfYxxJbxgctaJzdmfcczcxq;
	}

	public void setSfYxxJbxgctaJzdmfcczcxq(String sfYxxJbxgctaJzdmfcczcxq) {
		this.sfYxxJbxgctaJzdmfcczcxq = sfYxxJbxgctaJzdmfcczcxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_JZDMFCCYCXQ", length = 20)
	public String getSfYxxJbxgctaJzdmfccycxq() {
		return this.sfYxxJbxgctaJzdmfccycxq;
	}

	public void setSfYxxJbxgctaJzdmfccycxq(String sfYxxJbxgctaJzdmfccycxq) {
		this.sfYxxJbxgctaJzdmfccycxq = sfYxxJbxgctaJzdmfccycxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_JNDMLWDZCXQ", length = 20)
	public String getSfYxxJbxgctaJndmlwdzcxq() {
		return this.sfYxxJbxgctaJndmlwdzcxq;
	}

	public void setSfYxxJbxgctaJndmlwdzcxq(String sfYxxJbxgctaJndmlwdzcxq) {
		this.sfYxxJbxgctaJndmlwdzcxq = sfYxxJbxgctaJndmlwdzcxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_JNDMLWDYCXQ", length = 20)
	public String getSfYxxJbxgctaJndmlwdycxq() {
		return this.sfYxxJbxgctaJndmlwdycxq;
	}

	public void setSfYxxJbxgctaJndmlwdycxq(String sfYxxJbxgctaJndmlwdycxq) {
		this.sfYxxJbxgctaJndmlwdycxq = sfYxxJbxgctaJndmlwdycxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_JWDMZCXQ", length = 20)
	public String getSfYxxJbxgctaJwdmzcxq() {
		return this.sfYxxJbxgctaJwdmzcxq;
	}

	public void setSfYxxJbxgctaJwdmzcxq(String sfYxxJbxgctaJwdmzcxq) {
		this.sfYxxJbxgctaJwdmzcxq = sfYxxJbxgctaJwdmzcxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_JWDMYCXQ", length = 20)
	public String getSfYxxJbxgctaJwdmycxq() {
		return this.sfYxxJbxgctaJwdmycxq;
	}

	public void setSfYxxJbxgctaJwdmycxq(String sfYxxJbxgctaJwdmycxq) {
		this.sfYxxJbxgctaJwdmycxq = sfYxxJbxgctaJwdmycxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_ZDMLWDZCXQ", length = 20)
	public String getSfYxxJbxgctaZdmlwdzcxq() {
		return this.sfYxxJbxgctaZdmlwdzcxq;
	}

	public void setSfYxxJbxgctaZdmlwdzcxq(String sfYxxJbxgctaZdmlwdzcxq) {
		this.sfYxxJbxgctaZdmlwdzcxq = sfYxxJbxgctaZdmlwdzcxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_ZDMLWDYCXQ", length = 20)
	public String getSfYxxJbxgctaZdmlwdycxq() {
		return this.sfYxxJbxgctaZdmlwdycxq;
	}

	public void setSfYxxJbxgctaZdmlwdycxq(String sfYxxJbxgctaZdmlwdycxq) {
		this.sfYxxJbxgctaZdmlwdycxq = sfYxxJbxgctaZdmlwdycxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_SGXDMQSDZCXQ", length = 20)
	public String getSfYxxJbxgctaSgxdmqsdzcxq() {
		return this.sfYxxJbxgctaSgxdmqsdzcxq;
	}

	public void setSfYxxJbxgctaSgxdmqsdzcxq(String sfYxxJbxgctaSgxdmqsdzcxq) {
		this.sfYxxJbxgctaSgxdmqsdzcxq = sfYxxJbxgctaSgxdmqsdzcxq;
	}

	@Column(name = "SF_YXX_JBXGCTA_SGXDMQSDYCXQ", length = 20)
	public String getSfYxxJbxgctaSgxdmqsdycxq() {
		return this.sfYxxJbxgctaSgxdmqsdycxq;
	}

	public void setSfYxxJbxgctaSgxdmqsdycxq(String sfYxxJbxgctaSgxdmqsdycxq) {
		this.sfYxxJbxgctaSgxdmqsdycxq = sfYxxJbxgctaSgxdmqsdycxq;
	}

	@Column(name = "SF_YXX_QNDSA_QNDSA", length = 4)
	public String getSfYxxQndsaQndsa() {
		return this.sfYxxQndsaQndsa;
	}

	public void setSfYxxQndsaQndsa(String sfYxxQndsaQndsa) {
		this.sfYxxQndsaQndsa = sfYxxQndsaQndsa;
	}

	@Column(name = "SF_YXX_QNDSA_JCSJ", length = 7)
	public Timestamp getSfYxxQndsaJcsj() {
		return this.sfYxxQndsaJcsj;
	}

	public void setSfYxxQndsaJcsj(Timestamp sfYxxQndsaJcsj) {
		this.sfYxxQndsaJcsj = sfYxxQndsaJcsj;
	}

	@Column(name = "SF_YXX_QNDSA_JZDMZCXQ", length = 20)
	public String getSfYxxQndsaJzdmzcxq() {
		return this.sfYxxQndsaJzdmzcxq;
	}

	public void setSfYxxQndsaJzdmzcxq(String sfYxxQndsaJzdmzcxq) {
		this.sfYxxQndsaJzdmzcxq = sfYxxQndsaJzdmzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_JZDMYCXQ", length = 20)
	public String getSfYxxQndsaJzdmycxq() {
		return this.sfYxxQndsaJzdmycxq;
	}

	public void setSfYxxQndsaJzdmycxq(String sfYxxQndsaJzdmycxq) {
		this.sfYxxQndsaJzdmycxq = sfYxxQndsaJzdmycxq;
	}

	@Column(name = "SF_YXX_QNDSA_JZDMFCCZCXQ", length = 20)
	public String getSfYxxQndsaJzdmfcczcxq() {
		return this.sfYxxQndsaJzdmfcczcxq;
	}

	public void setSfYxxQndsaJzdmfcczcxq(String sfYxxQndsaJzdmfcczcxq) {
		this.sfYxxQndsaJzdmfcczcxq = sfYxxQndsaJzdmfcczcxq;
	}

	@Column(name = "SF_YXX_QNDSA_JZDMFCCYCXQ", length = 20)
	public String getSfYxxQndsaJzdmfccycxq() {
		return this.sfYxxQndsaJzdmfccycxq;
	}

	public void setSfYxxQndsaJzdmfccycxq(String sfYxxQndsaJzdmfccycxq) {
		this.sfYxxQndsaJzdmfccycxq = sfYxxQndsaJzdmfccycxq;
	}

	@Column(name = "SF_YXX_QNDSA_JNDMLWDZCXQ", length = 20)
	public String getSfYxxQndsaJndmlwdzcxq() {
		return this.sfYxxQndsaJndmlwdzcxq;
	}

	public void setSfYxxQndsaJndmlwdzcxq(String sfYxxQndsaJndmlwdzcxq) {
		this.sfYxxQndsaJndmlwdzcxq = sfYxxQndsaJndmlwdzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_JNDMLWDYCXQ", length = 20)
	public String getSfYxxQndsaJndmlwdycxq() {
		return this.sfYxxQndsaJndmlwdycxq;
	}

	public void setSfYxxQndsaJndmlwdycxq(String sfYxxQndsaJndmlwdycxq) {
		this.sfYxxQndsaJndmlwdycxq = sfYxxQndsaJndmlwdycxq;
	}

	@Column(name = "SF_YXX_QNDSA_JWDMZCXQ", length = 20)
	public String getSfYxxQndsaJwdmzcxq() {
		return this.sfYxxQndsaJwdmzcxq;
	}

	public void setSfYxxQndsaJwdmzcxq(String sfYxxQndsaJwdmzcxq) {
		this.sfYxxQndsaJwdmzcxq = sfYxxQndsaJwdmzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_JWDMYCXQ", length = 20)
	public String getSfYxxQndsaJwdmycxq() {
		return this.sfYxxQndsaJwdmycxq;
	}

	public void setSfYxxQndsaJwdmycxq(String sfYxxQndsaJwdmycxq) {
		this.sfYxxQndsaJwdmycxq = sfYxxQndsaJwdmycxq;
	}

	@Column(name = "SF_YXX_QNDSA_ZDMLWDZCXQ", length = 20)
	public String getSfYxxQndsaZdmlwdzcxq() {
		return this.sfYxxQndsaZdmlwdzcxq;
	}

	public void setSfYxxQndsaZdmlwdzcxq(String sfYxxQndsaZdmlwdzcxq) {
		this.sfYxxQndsaZdmlwdzcxq = sfYxxQndsaZdmlwdzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_ZDMLWDYCXQ", length = 20)
	public String getSfYxxQndsaZdmlwdycxq() {
		return this.sfYxxQndsaZdmlwdycxq;
	}

	public void setSfYxxQndsaZdmlwdycxq(String sfYxxQndsaZdmlwdycxq) {
		this.sfYxxQndsaZdmlwdycxq = sfYxxQndsaZdmlwdycxq;
	}

	@Column(name = "SF_YXX_QNDSA_SGXDMQSDZCXQ", length = 20)
	public String getSfYxxQndsaSgxdmqsdzcxq() {
		return this.sfYxxQndsaSgxdmqsdzcxq;
	}

	public void setSfYxxQndsaSgxdmqsdzcxq(String sfYxxQndsaSgxdmqsdzcxq) {
		this.sfYxxQndsaSgxdmqsdzcxq = sfYxxQndsaSgxdmqsdzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_SGXDMQSDYCXQ", length = 20)
	public String getSfYxxQndsaSgxdmqsdycxq() {
		return this.sfYxxQndsaSgxdmqsdycxq;
	}

	public void setSfYxxQndsaSgxdmqsdycxq(String sfYxxQndsaSgxdmqsdycxq) {
		this.sfYxxQndsaSgxdmqsdycxq = sfYxxQndsaSgxdmqsdycxq;
	}

	@Column(name = "SF_YXX_QNDSA_DNZDMZCXQ", length = 20)
	public String getSfYxxQndsaDnzdmzcxq() {
		return this.sfYxxQndsaDnzdmzcxq;
	}

	public void setSfYxxQndsaDnzdmzcxq(String sfYxxQndsaDnzdmzcxq) {
		this.sfYxxQndsaDnzdmzcxq = sfYxxQndsaDnzdmzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_DNZDMYCXQ", length = 20)
	public String getSfYxxQndsaDnzdmycxq() {
		return this.sfYxxQndsaDnzdmycxq;
	}

	public void setSfYxxQndsaDnzdmycxq(String sfYxxQndsaDnzdmycxq) {
		this.sfYxxQndsaDnzdmycxq = sfYxxQndsaDnzdmycxq;
	}

	@Column(name = "SF_YXX_QNDSA_DNQDMZCXQ", length = 20)
	public String getSfYxxQndsaDnqdmzcxq() {
		return this.sfYxxQndsaDnqdmzcxq;
	}

	public void setSfYxxQndsaDnqdmzcxq(String sfYxxQndsaDnqdmzcxq) {
		this.sfYxxQndsaDnqdmzcxq = sfYxxQndsaDnqdmzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_DNQDMYCXQ", length = 20)
	public String getSfYxxQndsaDnqdmycxq() {
		return this.sfYxxQndsaDnqdmycxq;
	}

	public void setSfYxxQndsaDnqdmycxq(String sfYxxQndsaDnqdmycxq) {
		this.sfYxxQndsaDnqdmycxq = sfYxxQndsaDnqdmycxq;
	}

	@Column(name = "SF_YXX_QNDSA_DNHDMZCXQ", length = 20)
	public String getSfYxxQndsaDnhdmzcxq() {
		return this.sfYxxQndsaDnhdmzcxq;
	}

	public void setSfYxxQndsaDnhdmzcxq(String sfYxxQndsaDnhdmzcxq) {
		this.sfYxxQndsaDnhdmzcxq = sfYxxQndsaDnhdmzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_DNHDMYCXQ", length = 20)
	public String getSfYxxQndsaDnhdmycxq() {
		return this.sfYxxQndsaDnhdmycxq;
	}

	public void setSfYxxQndsaDnhdmycxq(String sfYxxQndsaDnhdmycxq) {
		this.sfYxxQndsaDnhdmycxq = sfYxxQndsaDnhdmycxq;
	}

	@Column(name = "SF_YXX_QNDSA_JNDMLNDZCXQ", length = 20)
	public String getSfYxxQndsaJndmlndzcxq() {
		return this.sfYxxQndsaJndmlndzcxq;
	}

	public void setSfYxxQndsaJndmlndzcxq(String sfYxxQndsaJndmlndzcxq) {
		this.sfYxxQndsaJndmlndzcxq = sfYxxQndsaJndmlndzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_JNDMLNDYCXQ", length = 20)
	public String getSfYxxQndsaJndmlndycxq() {
		return this.sfYxxQndsaJndmlndycxq;
	}

	public void setSfYxxQndsaJndmlndycxq(String sfYxxQndsaJndmlndycxq) {
		this.sfYxxQndsaJndmlndycxq = sfYxxQndsaJndmlndycxq;
	}

	@Column(name = "SF_YXX_QNDSA_ZDMZCXQ", length = 20)
	public String getSfYxxQndsaZdmzcxq() {
		return this.sfYxxQndsaZdmzcxq;
	}

	public void setSfYxxQndsaZdmzcxq(String sfYxxQndsaZdmzcxq) {
		this.sfYxxQndsaZdmzcxq = sfYxxQndsaZdmzcxq;
	}

	@Column(name = "SF_YXX_QNDSA_ZDMYCXQ", length = 20)
	public String getSfYxxQndsaZdmycxq() {
		return this.sfYxxQndsaZdmycxq;
	}

	public void setSfYxxQndsaZdmycxq(String sfYxxQndsaZdmycxq) {
		this.sfYxxQndsaZdmycxq = sfYxxQndsaZdmycxq;
	}

	@Column(name = "SF_YXX_JBXGCC_JBXGCC", length = 4)
	public String getSfYxxJbxgccJbxgcc() {
		return this.sfYxxJbxgccJbxgcc;
	}

	public void setSfYxxJbxgccJbxgcc(String sfYxxJbxgccJbxgcc) {
		this.sfYxxJbxgccJbxgcc = sfYxxJbxgccJbxgcc;
	}

	@Column(name = "SF_YXX_JBXGCC_JCSJ", length = 7)
	public Timestamp getSfYxxJbxgccJcsj() {
		return this.sfYxxJbxgccJcsj;
	}

	public void setSfYxxJbxgccJcsj(Timestamp sfYxxJbxgccJcsj) {
		this.sfYxxJbxgccJcsj = sfYxxJbxgccJcsj;
	}

	@Column(name = "SF_YXX_JBXGCC_JZDMZCIMT", precision = 22, scale = 0)
	public BigDecimal getSfYxxJbxgccJzdmzcimt() {
		return this.sfYxxJbxgccJzdmzcimt;
	}

	public void setSfYxxJbxgccJzdmzcimt(BigDecimal sfYxxJbxgccJzdmzcimt) {
		this.sfYxxJbxgccJzdmzcimt = sfYxxJbxgccJzdmzcimt;
	}

	@Column(name = "SF_YXX_JBXGCC_JZDMZCBKXZ", length = 20)
	public String getSfYxxJbxgccJzdmzcbkxz() {
		return this.sfYxxJbxgccJzdmzcbkxz;
	}

	public void setSfYxxJbxgccJzdmzcbkxz(String sfYxxJbxgccJzdmzcbkxz) {
		this.sfYxxJbxgccJzdmzcbkxz = sfYxxJbxgccJzdmzcbkxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JZDMZCGQXZ", length = 20)
	public String getSfYxxJbxgccJzdmzcgqxz() {
		return this.sfYxxJbxgccJzdmzcgqxz;
	}

	public void setSfYxxJbxgccJzdmzcgqxz(String sfYxxJbxgccJzdmzcgqxz) {
		this.sfYxxJbxgccJzdmzcgqxz = sfYxxJbxgccJzdmzcgqxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JZDMYCIMT", precision = 22, scale = 0)
	public BigDecimal getSfYxxJbxgccJzdmycimt() {
		return this.sfYxxJbxgccJzdmycimt;
	}

	public void setSfYxxJbxgccJzdmycimt(BigDecimal sfYxxJbxgccJzdmycimt) {
		this.sfYxxJbxgccJzdmycimt = sfYxxJbxgccJzdmycimt;
	}

	@Column(name = "SF_YXX_JBXGCC_JZDMYCBKXZ", length = 20)
	public String getSfYxxJbxgccJzdmycbkxz() {
		return this.sfYxxJbxgccJzdmycbkxz;
	}

	public void setSfYxxJbxgccJzdmycbkxz(String sfYxxJbxgccJzdmycbkxz) {
		this.sfYxxJbxgccJzdmycbkxz = sfYxxJbxgccJzdmycbkxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JZDMYCGQXZ", length = 20)
	public String getSfYxxJbxgccJzdmycgqxz() {
		return this.sfYxxJbxgccJzdmycgqxz;
	}

	public void setSfYxxJbxgccJzdmycgqxz(String sfYxxJbxgccJzdmycgqxz) {
		this.sfYxxJbxgccJzdmycgqxz = sfYxxJbxgccJzdmycgqxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JNDMZCIMT", precision = 22, scale = 0)
	public BigDecimal getSfYxxJbxgccJndmzcimt() {
		return this.sfYxxJbxgccJndmzcimt;
	}

	public void setSfYxxJbxgccJndmzcimt(BigDecimal sfYxxJbxgccJndmzcimt) {
		this.sfYxxJbxgccJndmzcimt = sfYxxJbxgccJndmzcimt;
	}

	@Column(name = "SF_YXX_JBXGCC_JNDMZCBKXZ", length = 20)
	public String getSfYxxJbxgccJndmzcbkxz() {
		return this.sfYxxJbxgccJndmzcbkxz;
	}

	public void setSfYxxJbxgccJndmzcbkxz(String sfYxxJbxgccJndmzcbkxz) {
		this.sfYxxJbxgccJndmzcbkxz = sfYxxJbxgccJndmzcbkxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JNDMZCGQXZ", length = 20)
	public String getSfYxxJbxgccJndmzcgqxz() {
		return this.sfYxxJbxgccJndmzcgqxz;
	}

	public void setSfYxxJbxgccJndmzcgqxz(String sfYxxJbxgccJndmzcgqxz) {
		this.sfYxxJbxgccJndmzcgqxz = sfYxxJbxgccJndmzcgqxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JNDMYCIMT", precision = 22, scale = 0)
	public BigDecimal getSfYxxJbxgccJndmycimt() {
		return this.sfYxxJbxgccJndmycimt;
	}

	public void setSfYxxJbxgccJndmycimt(BigDecimal sfYxxJbxgccJndmycimt) {
		this.sfYxxJbxgccJndmycimt = sfYxxJbxgccJndmycimt;
	}

	@Column(name = "SF_YXX_JBXGCC_JNDMYCBKXZ", length = 20)
	public String getSfYxxJbxgccJndmycbkxz() {
		return this.sfYxxJbxgccJndmycbkxz;
	}

	public void setSfYxxJbxgccJndmycbkxz(String sfYxxJbxgccJndmycbkxz) {
		this.sfYxxJbxgccJndmycbkxz = sfYxxJbxgccJndmycbkxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JNDMYCGQXZ", length = 20)
	public String getSfYxxJbxgccJndmycgqxz() {
		return this.sfYxxJbxgccJndmycgqxz;
	}

	public void setSfYxxJbxgccJndmycgqxz(String sfYxxJbxgccJndmycgqxz) {
		this.sfYxxJbxgccJndmycgqxz = sfYxxJbxgccJndmycgqxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JWDMZCIMT", precision = 22, scale = 0)
	public BigDecimal getSfYxxJbxgccJwdmzcimt() {
		return this.sfYxxJbxgccJwdmzcimt;
	}

	public void setSfYxxJbxgccJwdmzcimt(BigDecimal sfYxxJbxgccJwdmzcimt) {
		this.sfYxxJbxgccJwdmzcimt = sfYxxJbxgccJwdmzcimt;
	}

	@Column(name = "SF_YXX_JBXGCC_JWDMZCBKXZ", length = 20)
	public String getSfYxxJbxgccJwdmzcbkxz() {
		return this.sfYxxJbxgccJwdmzcbkxz;
	}

	public void setSfYxxJbxgccJwdmzcbkxz(String sfYxxJbxgccJwdmzcbkxz) {
		this.sfYxxJbxgccJwdmzcbkxz = sfYxxJbxgccJwdmzcbkxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JWDMZCGQXZ", length = 20)
	public String getSfYxxJbxgccJwdmzcgqxz() {
		return this.sfYxxJbxgccJwdmzcgqxz;
	}

	public void setSfYxxJbxgccJwdmzcgqxz(String sfYxxJbxgccJwdmzcgqxz) {
		this.sfYxxJbxgccJwdmzcgqxz = sfYxxJbxgccJwdmzcgqxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JWDMYCIMT", precision = 22, scale = 0)
	public BigDecimal getSfYxxJbxgccJwdmycimt() {
		return this.sfYxxJbxgccJwdmycimt;
	}

	public void setSfYxxJbxgccJwdmycimt(BigDecimal sfYxxJbxgccJwdmycimt) {
		this.sfYxxJbxgccJwdmycimt = sfYxxJbxgccJwdmycimt;
	}

	@Column(name = "SF_YXX_JBXGCC_JWDMYCBKXZ", length = 20)
	public String getSfYxxJbxgccJwdmycbkxz() {
		return this.sfYxxJbxgccJwdmycbkxz;
	}

	public void setSfYxxJbxgccJwdmycbkxz(String sfYxxJbxgccJwdmycbkxz) {
		this.sfYxxJbxgccJwdmycbkxz = sfYxxJbxgccJwdmycbkxz;
	}

	@Column(name = "SF_YXX_JBXGCC_JWDMYCGQXZ", length = 20)
	public String getSfYxxJbxgccJwdmycgqxz() {
		return this.sfYxxJbxgccJwdmycgqxz;
	}

	public void setSfYxxJbxgccJwdmycgqxz(String sfYxxJbxgccJwdmycgqxz) {
		this.sfYxxJbxgccJwdmycgqxz = sfYxxJbxgccJwdmycgqxz;
	}

	@Column(name = "SF_YXX_JLDPLTCD_JLDPLTCD", length = 4)
	public String getSfYxxJldpltcdJldpltcd() {
		return this.sfYxxJldpltcdJldpltcd;
	}

	public void setSfYxxJldpltcdJldpltcd(String sfYxxJldpltcdJldpltcd) {
		this.sfYxxJldpltcdJldpltcd = sfYxxJldpltcdJldpltcd;
	}

	@Column(name = "SF_YXX_JLDPLTCD_JCSJ", length = 7)
	public Timestamp getSfYxxJldpltcdJcsj() {
		return this.sfYxxJldpltcdJcsj;
	}

	public void setSfYxxJldpltcdJcsj(Timestamp sfYxxJldpltcdJcsj) {
		this.sfYxxJldpltcdJcsj = sfYxxJldpltcdJcsj;
	}

	@Column(name = "SF_YXX_JLDPLTCD_DNZDMZCXQ", length = 10)
	public String getSfYxxJldpltcdDnzdmzcxq() {
		return this.sfYxxJldpltcdDnzdmzcxq;
	}

	public void setSfYxxJldpltcdDnzdmzcxq(String sfYxxJldpltcdDnzdmzcxq) {
		this.sfYxxJldpltcdDnzdmzcxq = sfYxxJldpltcdDnzdmzcxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_DNZDMYCXQ", length = 10)
	public String getSfYxxJldpltcdDnzdmycxq() {
		return this.sfYxxJldpltcdDnzdmycxq;
	}

	public void setSfYxxJldpltcdDnzdmycxq(String sfYxxJldpltcdDnzdmycxq) {
		this.sfYxxJldpltcdDnzdmycxq = sfYxxJldpltcdDnzdmycxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_DNQDMZCXQ", length = 10)
	public String getSfYxxJldpltcdDnqdmzcxq() {
		return this.sfYxxJldpltcdDnqdmzcxq;
	}

	public void setSfYxxJldpltcdDnqdmzcxq(String sfYxxJldpltcdDnqdmzcxq) {
		this.sfYxxJldpltcdDnqdmzcxq = sfYxxJldpltcdDnqdmzcxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_DNQDMYCXQ", length = 10)
	public String getSfYxxJldpltcdDnqdmycxq() {
		return this.sfYxxJldpltcdDnqdmycxq;
	}

	public void setSfYxxJldpltcdDnqdmycxq(String sfYxxJldpltcdDnqdmycxq) {
		this.sfYxxJldpltcdDnqdmycxq = sfYxxJldpltcdDnqdmycxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_DNHDMZCXQ", length = 10)
	public String getSfYxxJldpltcdDnhdmzcxq() {
		return this.sfYxxJldpltcdDnhdmzcxq;
	}

	public void setSfYxxJldpltcdDnhdmzcxq(String sfYxxJldpltcdDnhdmzcxq) {
		this.sfYxxJldpltcdDnhdmzcxq = sfYxxJldpltcdDnhdmzcxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_DNHDMYCXQ", length = 10)
	public String getSfYxxJldpltcdDnhdmycxq() {
		return this.sfYxxJldpltcdDnhdmycxq;
	}

	public void setSfYxxJldpltcdDnhdmycxq(String sfYxxJldpltcdDnhdmycxq) {
		this.sfYxxJldpltcdDnhdmycxq = sfYxxJldpltcdDnhdmycxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_JNDMLWDZCXQ", length = 10)
	public String getSfYxxJldpltcdJndmlwdzcxq() {
		return this.sfYxxJldpltcdJndmlwdzcxq;
	}

	public void setSfYxxJldpltcdJndmlwdzcxq(String sfYxxJldpltcdJndmlwdzcxq) {
		this.sfYxxJldpltcdJndmlwdzcxq = sfYxxJldpltcdJndmlwdzcxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_JNDMLWDYCXQ", length = 10)
	public String getSfYxxJldpltcdJndmlwdycxq() {
		return this.sfYxxJldpltcdJndmlwdycxq;
	}

	public void setSfYxxJldpltcdJndmlwdycxq(String sfYxxJldpltcdJndmlwdycxq) {
		this.sfYxxJldpltcdJndmlwdycxq = sfYxxJldpltcdJndmlwdycxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_ZDMZCXQ", length = 10)
	public String getSfYxxJldpltcdZdmzcxq() {
		return this.sfYxxJldpltcdZdmzcxq;
	}

	public void setSfYxxJldpltcdZdmzcxq(String sfYxxJldpltcdZdmzcxq) {
		this.sfYxxJldpltcdZdmzcxq = sfYxxJldpltcdZdmzcxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_ZDMYCXQ", length = 10)
	public String getSfYxxJldpltcdZdmycxq() {
		return this.sfYxxJldpltcdZdmycxq;
	}

	public void setSfYxxJldpltcdZdmycxq(String sfYxxJldpltcdZdmycxq) {
		this.sfYxxJldpltcdZdmycxq = sfYxxJldpltcdZdmycxq;
	}

	@Column(name = "SF_YXX_JLDPLTCD_CZXHPG", length = 100)
	public String getSfYxxJldpltcdCzxhpg() {
		return this.sfYxxJldpltcdCzxhpg;
	}

	public void setSfYxxJldpltcdCzxhpg(String sfYxxJldpltcdCzxhpg) {
		this.sfYxxJldpltcdCzxhpg = sfYxxJldpltcdCzxhpg;
	}

	@Column(name = "SF_YXX_JLDPLTCD_CZXHPGZQT", length = 100)
	public String getSfYxxJldpltcdCzxhpgzqt() {
		return this.sfYxxJldpltcdCzxhpgzqt;
	}

	public void setSfYxxJldpltcdCzxhpgzqt(String sfYxxJldpltcdCzxhpgzqt) {
		this.sfYxxJldpltcdCzxhpgzqt = sfYxxJldpltcdCzxhpgzqt;
	}

	@Column(name = "SF_YXX_XZXGCC_XZXGCC", length = 4)
	public String getSfYxxXzxgccXzxgcc() {
		return this.sfYxxXzxgccXzxgcc;
	}

	public void setSfYxxXzxgccXzxgcc(String sfYxxXzxgccXzxgcc) {
		this.sfYxxXzxgccXzxgcc = sfYxxXzxgccXzxgcc;
	}

	@Column(name = "SF_YXX_XZXGCC_JCSJ", length = 7)
	public Timestamp getSfYxxXzxgccJcsj() {
		return this.sfYxxXzxgccJcsj;
	}

	public void setSfYxxXzxgccJcsj(Timestamp sfYxxXzxgccJcsj) {
		this.sfYxxXzxgccJcsj = sfYxxXzxgccJcsj;
	}

	@Column(name = "SF_YXX_XZXGCC_GZDMZCBKXZ", length = 20)
	public String getSfYxxXzxgccGzdmzcbkxz() {
		return this.sfYxxXzxgccGzdmzcbkxz;
	}

	public void setSfYxxXzxgccGzdmzcbkxz(String sfYxxXzxgccGzdmzcbkxz) {
		this.sfYxxXzxgccGzdmzcbkxz = sfYxxXzxgccGzdmzcbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GZDMZCGQXZ", length = 20)
	public String getSfYxxXzxgccGzdmzcgqxz() {
		return this.sfYxxXzxgccGzdmzcgqxz;
	}

	public void setSfYxxXzxgccGzdmzcgqxz(String sfYxxXzxgccGzdmzcgqxz) {
		this.sfYxxXzxgccGzdmzcgqxz = sfYxxXzxgccGzdmzcgqxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GZDMYCBKXZ", length = 20)
	public String getSfYxxXzxgccGzdmycbkxz() {
		return this.sfYxxXzxgccGzdmycbkxz;
	}

	public void setSfYxxXzxgccGzdmycbkxz(String sfYxxXzxgccGzdmycbkxz) {
		this.sfYxxXzxgccGzdmycbkxz = sfYxxXzxgccGzdmycbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GZDMYCGQXZ", length = 20)
	public String getSfYxxXzxgccGzdmycgqxz() {
		return this.sfYxxXzxgccGzdmycgqxz;
	}

	public void setSfYxxXzxgccGzdmycgqxz(String sfYxxXzxgccGzdmycgqxz) {
		this.sfYxxXzxgccGzdmycgqxz = sfYxxXzxgccGzdmycgqxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GQDMZCBKXZ", length = 20)
	public String getSfYxxXzxgccGqdmzcbkxz() {
		return this.sfYxxXzxgccGqdmzcbkxz;
	}

	public void setSfYxxXzxgccGqdmzcbkxz(String sfYxxXzxgccGqdmzcbkxz) {
		this.sfYxxXzxgccGqdmzcbkxz = sfYxxXzxgccGqdmzcbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GQDMZCGQXZ", length = 20)
	public String getSfYxxXzxgccGqdmzcgqxz() {
		return this.sfYxxXzxgccGqdmzcgqxz;
	}

	public void setSfYxxXzxgccGqdmzcgqxz(String sfYxxXzxgccGqdmzcgqxz) {
		this.sfYxxXzxgccGqdmzcgqxz = sfYxxXzxgccGqdmzcgqxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GQDMYCBKXZ", length = 20)
	public String getSfYxxXzxgccGqdmycbkxz() {
		return this.sfYxxXzxgccGqdmycbkxz;
	}

	public void setSfYxxXzxgccGqdmycbkxz(String sfYxxXzxgccGqdmycbkxz) {
		this.sfYxxXzxgccGqdmycbkxz = sfYxxXzxgccGqdmycbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GQDMYCGQXZ", length = 20)
	public String getSfYxxXzxgccGqdmycgqxz() {
		return this.sfYxxXzxgccGqdmycgqxz;
	}

	public void setSfYxxXzxgccGqdmycgqxz(String sfYxxXzxgccGqdmycgqxz) {
		this.sfYxxXzxgccGqdmycgqxz = sfYxxXzxgccGqdmycgqxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GSDMZCBKXZ", length = 20)
	public String getSfYxxXzxgccGsdmzcbkxz() {
		return this.sfYxxXzxgccGsdmzcbkxz;
	}

	public void setSfYxxXzxgccGsdmzcbkxz(String sfYxxXzxgccGsdmzcbkxz) {
		this.sfYxxXzxgccGsdmzcbkxz = sfYxxXzxgccGsdmzcbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GSDMZCGQXZ", length = 20)
	public String getSfYxxXzxgccGsdmzcgqxz() {
		return this.sfYxxXzxgccGsdmzcgqxz;
	}

	public void setSfYxxXzxgccGsdmzcgqxz(String sfYxxXzxgccGsdmzcgqxz) {
		this.sfYxxXzxgccGsdmzcgqxz = sfYxxXzxgccGsdmzcgqxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GSDMYCBKXZ", length = 20)
	public String getSfYxxXzxgccGsdmycbkxz() {
		return this.sfYxxXzxgccGsdmycbkxz;
	}

	public void setSfYxxXzxgccGsdmycbkxz(String sfYxxXzxgccGsdmycbkxz) {
		this.sfYxxXzxgccGsdmycbkxz = sfYxxXzxgccGsdmycbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GSDMYCGQXZ", length = 20)
	public String getSfYxxXzxgccGsdmycgqxz() {
		return this.sfYxxXzxgccGsdmycgqxz;
	}

	public void setSfYxxXzxgccGsdmycgqxz(String sfYxxXzxgccGsdmycgqxz) {
		this.sfYxxXzxgccGsdmycgqxz = sfYxxXzxgccGsdmycgqxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GDMZCBKXZ", length = 20)
	public String getSfYxxXzxgccGdmzcbkxz() {
		return this.sfYxxXzxgccGdmzcbkxz;
	}

	public void setSfYxxXzxgccGdmzcbkxz(String sfYxxXzxgccGdmzcbkxz) {
		this.sfYxxXzxgccGdmzcbkxz = sfYxxXzxgccGdmzcbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GDMZCGQXZ", length = 20)
	public String getSfYxxXzxgccGdmzcgqxz() {
		return this.sfYxxXzxgccGdmzcgqxz;
	}

	public void setSfYxxXzxgccGdmzcgqxz(String sfYxxXzxgccGdmzcgqxz) {
		this.sfYxxXzxgccGdmzcgqxz = sfYxxXzxgccGdmzcgqxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GDMYCBKXZ", length = 20)
	public String getSfYxxXzxgccGdmycbkxz() {
		return this.sfYxxXzxgccGdmycbkxz;
	}

	public void setSfYxxXzxgccGdmycbkxz(String sfYxxXzxgccGdmycbkxz) {
		this.sfYxxXzxgccGdmycbkxz = sfYxxXzxgccGdmycbkxz;
	}

	@Column(name = "SF_YXX_XZXGCC_GDMYCGQXZ", length = 20)
	public String getSfYxxXzxgccGdmycgqxz() {
		return this.sfYxxXzxgccGdmycgqxz;
	}

	public void setSfYxxXzxgccGdmycgqxz(String sfYxxXzxgccGdmycgqxz) {
		this.sfYxxXzxgccGdmycgqxz = sfYxxXzxgccGdmycgqxz;
	}

	@Column(name = "SF_SJGNPF_MRSPF", precision = 22, scale = 0)
	public BigDecimal getSfSjgnpfMrspf() {
		return this.sfSjgnpfMrspf;
	}

	public void setSfSjgnpfMrspf(BigDecimal sfSjgnpfMrspf) {
		this.sfSjgnpfMrspf = sfSjgnpfMrspf;
	}

	@Column(name = "SF_SJGNPF_NIHSSPF", precision = 22, scale = 0)
	public BigDecimal getSfSjgnpfNihsspf() {
		return this.sfSjgnpfNihsspf;
	}

	public void setSfSjgnpfNihsspf(BigDecimal sfSjgnpfNihsspf) {
		this.sfSjgnpfNihsspf = sfSjgnpfNihsspf;
	}

	@Column(name = "SF_SJGNPF_MMSEPF", precision = 22, scale = 0)
	public BigDecimal getSfSjgnpfMmsepf() {
		return this.sfSjgnpfMmsepf;
	}

	public void setSfSjgnpfMmsepf(BigDecimal sfSjgnpfMmsepf) {
		this.sfSjgnpfMmsepf = sfSjgnpfMmsepf;
	}

}