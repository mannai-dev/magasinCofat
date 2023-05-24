package com.cofat.magasincofat.ln.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "twhinh200")
public class Twhinh200120 implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Basic
    @Column(name = "t_oorg", nullable = true)
    private Integer tOorg;
    @Basic
    @Column(name = "t_orno", nullable = true, length = 9)
    private String tOrno;
    @Basic
    @Column(name = "t_oset", nullable = true)
    private Integer tOset;
    @Basic
    @Column(name = "t_seri", nullable = true, length = 8)
    private String tSeri;
    @Basic
    @Column(name = "t_ittp", nullable = true)
    private Integer tIttp;
    @Basic
    @Column(name = "t_odat", nullable = true)
    private LocalDate tOdat;
    @Basic
    @Column(name = "t_sfty", nullable = true)
    private Integer tSfty;
    @Basic
    @Column(name = "t_sfco", nullable = true, length = 9)
    private String tSfco;
    @Basic
    @Column(name = "t_stty", nullable = true)
    private Integer tStty;
    @Basic
    @Column(name = "t_stco", nullable = true, length = 9)
    private String tStco;
    @Basic
    @Column(name = "t_sfcp", nullable = true)
    private Integer tSfcp;
    @Basic
    @Column(name = "t_stcp", nullable = true)
    private Integer tStcp;
    @Basic
    @Column(name = "t_sfad", nullable = true, length = 9)
    private String tSfad;
    @Basic
    @Column(name = "t_stad", nullable = true, length = 9)
    private String tStad;
    @Basic
    @Column(name = "t_sfit", nullable = true, length = 47)
    private String tSfit;
    @Basic
    @Column(name = "t_stit", nullable = true, length = 47)
    private String tStit;
    @Basic
    @Column(name = "t_sfrv", nullable = true, length = 6)
    private String tSfrv;
    @Basic
    @Column(name = "t_strv", nullable = true, length = 6)
    private String tStrv;
    @Basic
    @Column(name = "t_sflo", nullable = true, length = 10)
    private String tSflo;
    @Basic
    @Column(name = "t_stlo", nullable = true, length = 10)
    private String tStlo;
    @Basic
    @Column(name = "t_otyp", nullable = true, length = 3)
    private String tOtyp;
    @Basic
    @Column(name = "t_depc", nullable = true)
    private Integer tDepc;
    @Basic
    @Column(name = "t_wdep", nullable = true, length = 6)
    private String tWdep;
    @Basic
    @Column(name = "t_blor", nullable = true)
    private Integer tBlor;
    @Basic
    @Column(name = "t_rtrn", nullable = true)
    private Integer tRtrn;
    @Basic
    @Column(name = "t_cons", nullable = true)
    private Integer tCons;
    @Basic
    @Column(name = "t_invc", nullable = true)
    private Integer tInvc;
    @Basic
    @Column(name = "t_bflh", nullable = true)
    private Integer tBflh;
    @Basic
    @Column(name = "t_rrgd", nullable = true)
    private Integer tRrgd;
    @Basic
    @Column(name = "t_dmst", nullable = true)
    private Integer tDmst;
    @Basic
    @Column(name = "t_carr", nullable = true, length = 3)
    private String tCarr;
    @Basic
    @Column(name = "t_cbin", nullable = true)
    private Integer tCbin;
    @Basic
    @Column(name = "t_crte", nullable = true, length = 5)
    private String tCrte;
    @Basic
    @Column(name = "t_cdec", nullable = true, length = 3)
    private String tCdec;
    @Basic
    @Column(name = "t_ptpa", nullable = true, length = 9)
    private String tPtpa;
    @Basic
    @Column(name = "t_motv", nullable = true, length = 6)
    private String tMotv;
    @Basic
    @Column(name = "t_delc", nullable = true, length = 6)
    private String tDelc;
    @Basic
    @Column(name = "t_serv", nullable = true, length = 3)
    private String tServ;
    @Basic
    @Column(name = "t_pddt", nullable = true)
    private LocalDate tPddt;
    @Basic
    @Column(name = "t_prdt", nullable = true)
    private LocalDate tPrdt;
    @Basic
    @Column(name = "t_mint", nullable = true)
    private Integer tMint;
    @Basic
    @Column(name = "t_maxt", nullable = true)
    private Integer tMaxt;
    @Basic
    @Column(name = "t_mind", nullable = true)
    private Integer tMind;
    @Basic
    @Column(name = "t_maxd", nullable = true)
    private Integer tMaxd;
    @Basic
    @Column(name = "t_clan", nullable = true, length = 3)
    private String tClan;
    @Basic
    @Column(name = "t_grid", nullable = true, length = 9)
    private String tGrid;
    @Basic
    @Column(name = "t_setn", nullable = true)
    private Integer tSetn;
    @Basic
    @Column(name = "t_info", nullable = true, length = 30)
    private String tInfo;
    @Basic
    @Column(name = "t_refe", nullable = true, length = 30)
    private String tRefe;
    @Basic
    @Column(name = "t_isit", nullable = true)
    private Integer tIsit;
    @Basic
    @Column(name = "t_rodr", nullable = true, length = 9)
    private String tRodr;
    @Basic
    @Column(name = "t_akit", nullable = true, length = 15)
    private String tAkit;
    @Basic
    @Column(name = "t_ctdt", nullable = true)
    private LocalDate tCtdt;
    @Basic
    @Column(name = "t_adat", nullable = true)
    private LocalDate tAdat;
    @Basic
    @Column(name = "t_clgr", nullable = true, length = 3)
    private String tClgr;
    @Basic
    @Column(name = "t_list", nullable = true, length = 47)
    private String tList;
    @Basic
    @Column(name = "t_item", nullable = true, length = 47)
    private String tItem;
    @Basic
    @Column(name = "t_qoro", nullable = true)
    private Float tQoro;
    @Basic
    @Column(name = "t_orun", nullable = true, length = 3)
    private String tOrun;
    @Basic
    @Column(name = "t_qord", nullable = true)
    private Integer tQord;
    @Basic
    @Column(name = "t_asst", nullable = true)
    private Integer tAsst;
    @Basic
    @Column(name = "t_txta", nullable = true)
    private Integer tTxta;
    @Basic
    @Column(name = "t_txtb", nullable = true)
    private Integer tTxtb;
    @Basic
    @Column(name = "t_Refcntd", nullable = true)
    private Integer tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true)
    private Integer tRefcntu;
    @Basic
    @Column(name = "t_hsta", nullable = true)
    private Integer tHsta;
}
