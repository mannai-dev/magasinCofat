package com.cofat.magasincofat.entity.ln;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="ttcibd001")
public class Ttcibd001120 implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "t_item", nullable = false, length = 47)
    private String tItem;
    @Basic
    @Column(name = "t_kitm", nullable = true)
    private Integer tKitm;
    @Basic
    @Column(name = "t_citg", nullable = true, length = 6)
    private String tCitg;
    @Basic
    @Column(name = "t_itmt", nullable = true)
    private Integer tItmt;
    @Basic
    @Column(name = "t_dsca", nullable = true, length = 30)
    private String tDsca;
    @Basic
    @Column(name = "t_dscb", nullable = true, length = 8)
    private String tDscb;
    @Basic
    @Column(name = "t_dscc", nullable = true, length = 12)
    private String tDscc;
    @Basic
    @Column(name = "t_dscd", nullable = true, length = 8)
    private String tDscd;
    @Basic
    @Column(name = "t_seak", nullable = true, length = 16)
    private String tSeak;
    @Basic
    @Column(name = "t_seab", nullable = true, length = 16)
    private String tSeab;
    @Basic
    @Column(name = "t_uset", nullable = true, length = 6)
    private String tUset;
    @Basic
    @Column(name = "t_cuni", nullable = true, length = 3)
    private String tCuni;
    @Basic
    @Column(name = "t_cwun", nullable = true, length = 3)
    private String tCwun;
    @Basic
    @Column(name = "t_wght", nullable = true)
    private Float tWght;
    @Basic
    @Column(name = "t_ctyp", nullable = true, length = 3)
    private String tCtyp;
    @Basic
    @Column(name = "t_ltct", nullable = true)
    private Integer tLtct;
    @Basic
    @Column(name = "t_csel", nullable = true, length = 3)
    private String tCsel;
    @Basic
    @Column(name = "t_csig", nullable = true, length = 3)
    private String tCsig;
    @Basic
    @Column(name = "t_ctyo", nullable = true, length = 3)
    private String tCtyo;
    @Basic
    @Column(name = "t_cpcl", nullable = true, length = 6)
    private String tCpcl;
    @Basic
    @Column(name = "t_cood", nullable = true, length = 9)
    private String tCood;
    @Basic
    @Column(name = "t_eitm", nullable = true)
    private Integer tEitm;
    @Basic
    @Column(name = "t_umer", nullable = true)
    private Integer tUmer;
    @Basic
    @Column(name = "t_cpln", nullable = true, length = 6)
    private String tCpln;
    @Basic
    @Column(name = "t_ccde", nullable = true, length = 25)
    private String tCcde;
    @Basic
    @Column(name = "t_cmnf", nullable = true, length = 6)
    private String tCmnf;
    @Basic
    @Column(name = "t_cean", nullable = true, length = 14)
    private String tCean;
    @Basic
    @Column(name = "t_cont", nullable = true)
    private Integer tCont;
    @Basic
    @Column(name = "t_cntr", nullable = true, length = 3)
    private String tCntr;
    @Basic
    @Column(name = "t_cprj", nullable = true, length = 9)
    private String tCprj;
    @Basic
    @Column(name = "t_repl", nullable = true)
    private Integer tRepl;
    @Basic
    @Column(name = "t_cpva", nullable = true)
    private Integer tCpva;
    @Basic
    @Column(name = "t_dfit", nullable = true, length = 47)
    private String tDfit;
    @Basic
    @Column(name = "t_stoi", nullable = true)
    private Integer tStoi;
    @Basic
    @Column(name = "t_cpcp", nullable = true, length = 8)
    private String tCpcp;
    @Basic
    @Column(name = "t_unef", nullable = true)
    private Integer tUnef;
    @Basic
    @Column(name = "t_ichg", nullable = true)
    private Integer tIchg;
    @Basic
    @Column(name = "t_uefs", nullable = true)
    private Integer tUefs;
    @Basic
    @Column(name = "t_seri", nullable = true)
    private Integer tSeri;
    @Basic
    @Column(name = "t_styp", nullable = true)
    private Integer tStyp;
    @Basic
    @Column(name = "t_psiu", nullable = true)
    private Integer tPsiu;
    @Basic
    @Column(name = "t_efco", nullable = true, length = 8)
    private String tEfco;
    @Basic
    @Column(name = "t_indt", nullable = true)
    private LocalDateTime tIndt;
    @Basic
    @Column(name = "t_chma", nullable = true)
    private Integer tChma;
    @Basic
    @Column(name = "t_edco", nullable = true)
    private Integer tEdco;
    @Basic
    @Column(name = "t_mcoa", nullable = true)
    private Integer tMcoa;
    @Basic
    @Column(name = "t_opts", nullable = true)
    private Integer tOpts;
    @Basic
    @Column(name = "t_envc", nullable = true)
    private Integer tEnvc;
    @Basic
    @Column(name = "t_wipi", nullable = true)
    private Integer tWipi;
    @Basic
    @Column(name = "t_lmdt", nullable = true)
    private LocalDateTime tLmdt;
    @Basic
    @Column(name = "t_txta", nullable = true, length = 50)
    private Integer tTxta;
    @Basic
    @Column(name = "t_Refcntd", nullable = true, length = 50)
    private Integer tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true, length = 50)
    private Integer tRefcntu;
}
