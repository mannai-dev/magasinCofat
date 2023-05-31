package com.cofat.magasincofat.entity.ln;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ttcibd001120")
public class Ttcibd001120Entity {
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   private int id;
    @Column(name = "t_item", nullable = false, length = 50)
    private String tItem;
    @Basic
    @Column(name = "t_kitm", nullable = true, length = 50)
    private String tKitm;
    @Basic
    @Column(name = "t_citg", nullable = true, length = 50)
    private String tCitg;
    @Basic
    @Column(name = "t_itmt", nullable = true, length = 50)
    private String tItmt;
    @Basic
    @Column(name = "t_dsca", nullable = true, length = 50)
    private String tDsca;
    @Basic
    @Column(name = "t_dscb", nullable = true, length = 50)
    private String tDscb;
    @Basic
    @Column(name = "t_dscc", nullable = true, length = 50)
    private String tDscc;
    @Basic
    @Column(name = "t_dscd", nullable = true, length = 50)
    private String tDscd;
    @Basic
    @Column(name = "t_seak", nullable = true, length = 50)
    private String tSeak;
    @Basic
    @Column(name = "t_seab", nullable = true, length = 50)
    private String tSeab;
    @Basic
    @Column(name = "t_uset", nullable = true, length = 50)
    private String tUset;
    @Basic
    @Column(name = "t_cuni", nullable = true, length = 50)
    private String tCuni;
    @Basic
    @Column(name = "t_cwun", nullable = true, length = 50)
    private String tCwun;
    @Basic
    @Column(name = "t_wght", nullable = true, length = 50)
    private String tWght;
    @Basic
    @Column(name = "t_ctyp", nullable = true, length = 50)
    private String tCtyp;
    @Basic
    @Column(name = "t_ltct", nullable = true, length = 50)
    private String tLtct;
    @Basic
    @Column(name = "t_csel", nullable = true, length = 50)
    private String tCsel;
    @Basic
    @Column(name = "t_csig", nullable = true, length = 50)
    private String tCsig;
    @Basic
    @Column(name = "t_ctyo", nullable = true, length = 50)
    private String tCtyo;
    @Basic
    @Column(name = "t_cpcl", nullable = true, length = 50)
    private String tCpcl;
    @Basic
    @Column(name = "t_cood", nullable = true, length = 50)
    private String tCood;
    @Basic
    @Column(name = "t_eitm", nullable = true, length = 50)
    private String tEitm;
    @Basic
    @Column(name = "t_umer", nullable = true, length = 50)
    private String tUmer;
    @Basic
    @Column(name = "t_cpln", nullable = true, length = 50)
    private String tCpln;
    @Basic
    @Column(name = "t_ccde", nullable = true, length = 50)
    private String tCcde;
    @Basic
    @Column(name = "t_cmnf", nullable = true, length = 50)
    private String tCmnf;
    @Basic
    @Column(name = "t_cean", nullable = true, length = 50)
    private String tCean;
    @Basic
    @Column(name = "t_cont", nullable = true, length = 50)
    private String tCont;
    @Basic
    @Column(name = "t_cntr", nullable = true, length = 50)
    private String tCntr;
    @Basic
    @Column(name = "t_cprj", nullable = true, length = 50)
    private String tCprj;
    @Basic
    @Column(name = "t_repl", nullable = true, length = 50)
    private String tRepl;
    @Basic
    @Column(name = "t_cpva", nullable = true, length = 50)
    private String tCpva;
    @Basic
    @Column(name = "t_dfit", nullable = true, length = 50)
    private String tDfit;
    @Basic
    @Column(name = "t_stoi", nullable = true, length = 50)
    private String tStoi;
    @Basic
    @Column(name = "t_cpcp", nullable = true, length = 50)
    private String tCpcp;
    @Basic
    @Column(name = "t_unef", nullable = true, length = 50)
    private String tUnef;
    @Basic
    @Column(name = "t_ichg", nullable = true, length = 50)
    private String tIchg;
    @Basic
    @Column(name = "t_uefs", nullable = true, length = 50)
    private String tUefs;
    @Basic
    @Column(name = "t_seri", nullable = true, length = 50)
    private String tSeri;
    @Basic
    @Column(name = "t_styp", nullable = true, length = 50)
    private String tStyp;
    @Basic
    @Column(name = "t_psiu", nullable = true, length = 50)
    private String tPsiu;
    @Basic
    @Column(name = "t_efco", nullable = true, length = 50)
    private String tEfco;
    @Basic
    @Column(name = "t_indt", nullable = true, length = 50)
    private String tIndt;
    @Basic
    @Column(name = "t_chma", nullable = true, length = 50)
    private String tChma;
    @Basic
    @Column(name = "t_edco", nullable = true, length = 50)
    private String tEdco;
    @Basic
    @Column(name = "t_mcoa", nullable = true, length = 50)
    private String tMcoa;
    @Basic
    @Column(name = "t_opts", nullable = true, length = 50)
    private String tOpts;
    @Basic
    @Column(name = "t_envc", nullable = true, length = 50)
    private String tEnvc;
    @Basic
    @Column(name = "t_wipi", nullable = true, length = 50)
    private String tWipi;
    @Basic
    @Column(name = "t_lmdt", nullable = true, length = 50)
    private String tLmdt;
    @Basic
    @Column(name = "t_txta", nullable = true, length = 50)
    private String tTxta;
    @Basic
    @Column(name = "t_Refcntd", nullable = true, length = 50)
    private String tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true, length = 50)
    private String tRefcntu;
/*
    @OneToMany(mappedBy = "ttcibd001120Entity", cascade = CascadeType.ALL )
    private Set<Ttcibd004XxxEntity> ttcibd004XxxEntities = new LinkedHashSet<>();

    @OneToMany(mappedBy = "ttcibd001120Entity", cascade = CascadeType.ALL )
    private Set<Twhinh220120Entity> twhinh220120Entities = new LinkedHashSet<>();

    public Ttcibd001120Entity() {

    }

    public Set<Twhinh220120Entity> getTwhinh220120Entities() {
        return twhinh220120Entities;
    }

    public void setTwhinh220120Entities(Set<Twhinh220120Entity> twhinh220120Entities) {
        this.twhinh220120Entities = twhinh220120Entities;
    }

    public Set<Ttcibd004XxxEntity> getTtcibd004XxxEntities() {
        return ttcibd004XxxEntities;
    }

    public void setTtcibd004XxxEntities(Set<Ttcibd004XxxEntity> ttcibd004XxxEntities) {
        this.ttcibd004XxxEntities = ttcibd004XxxEntities;
    }

    public Ttcibd001120Entity(int id, String tItem, String tKitm, String tCitg, String tItmt, String tDsca, String tDscb, String tDscc, String tDscd, String tSeak, String tSeab, String tUset, String tCuni, String tCwun, String tWght, String tCtyp, String tLtct, String tCsel, String tCsig, String tCtyo, String tCpcl, String tCood, String tEitm, String tUmer, String tCpln, String tCcde, String tCmnf, String tCean, String tCont, String tCntr, String tCprj, String tRepl, String tCpva, String tDfit, String tStoi, String tCpcp, String tUnef, String tIchg, String tUefs, String tSeri, String tStyp, String tPsiu, String tEfco, String tIndt, String tChma, String tEdco, String tMcoa, String tOpts, String tEnvc, String tWipi, String tLmdt, String tTxta, String tRefcntd, String tRefcntu, Set<Ttcibd004XxxEntity> ttcibd004XxxEntities, Set<Twhinh220120Entity> twhinh220120Entities) {
        this.id = id;
        this.tItem = tItem;
        this.tKitm = tKitm;
        this.tCitg = tCitg;
        this.tItmt = tItmt;
        this.tDsca = tDsca;
        this.tDscb = tDscb;
        this.tDscc = tDscc;
        this.tDscd = tDscd;
        this.tSeak = tSeak;
        this.tSeab = tSeab;
        this.tUset = tUset;
        this.tCuni = tCuni;
        this.tCwun = tCwun;
        this.tWght = tWght;
        this.tCtyp = tCtyp;
        this.tLtct = tLtct;
        this.tCsel = tCsel;
        this.tCsig = tCsig;
        this.tCtyo = tCtyo;
        this.tCpcl = tCpcl;
        this.tCood = tCood;
        this.tEitm = tEitm;
        this.tUmer = tUmer;
        this.tCpln = tCpln;
        this.tCcde = tCcde;
        this.tCmnf = tCmnf;
        this.tCean = tCean;
        this.tCont = tCont;
        this.tCntr = tCntr;
        this.tCprj = tCprj;
        this.tRepl = tRepl;
        this.tCpva = tCpva;
        this.tDfit = tDfit;
        this.tStoi = tStoi;
        this.tCpcp = tCpcp;
        this.tUnef = tUnef;
        this.tIchg = tIchg;
        this.tUefs = tUefs;
        this.tSeri = tSeri;
        this.tStyp = tStyp;
        this.tPsiu = tPsiu;
        this.tEfco = tEfco;
        this.tIndt = tIndt;
        this.tChma = tChma;
        this.tEdco = tEdco;
        this.tMcoa = tMcoa;
        this.tOpts = tOpts;
        this.tEnvc = tEnvc;
        this.tWipi = tWipi;
        this.tLmdt = tLmdt;
        this.tTxta = tTxta;
        this.tRefcntd = tRefcntd;
        this.tRefcntu = tRefcntu;
        this.ttcibd004XxxEntities = ttcibd004XxxEntities;
        this.twhinh220120Entities = twhinh220120Entities;
    }
*/
    public String gettItem() {
        return tItem;
    }

    public void settItem(String tItem) {
        this.tItem = tItem;
    }

    public String gettKitm() {
        return tKitm;
    }

    public void settKitm(String tKitm) {
        this.tKitm = tKitm;
    }

    public String gettCitg() {
        return tCitg;
    }

    public void settCitg(String tCitg) {
        this.tCitg = tCitg;
    }

    public String gettItmt() {
        return tItmt;
    }

    public void settItmt(String tItmt) {
        this.tItmt = tItmt;
    }

    public String gettDsca() {
        return tDsca;
    }

    public void settDsca(String tDsca) {
        this.tDsca = tDsca;
    }

    public String gettDscb() {
        return tDscb;
    }

    public void settDscb(String tDscb) {
        this.tDscb = tDscb;
    }

    public String gettDscc() {
        return tDscc;
    }

    public void settDscc(String tDscc) {
        this.tDscc = tDscc;
    }

    public String gettDscd() {
        return tDscd;
    }

    public void settDscd(String tDscd) {
        this.tDscd = tDscd;
    }

    public String gettSeak() {
        return tSeak;
    }

    public void settSeak(String tSeak) {
        this.tSeak = tSeak;
    }

    public String gettSeab() {
        return tSeab;
    }

    public void settSeab(String tSeab) {
        this.tSeab = tSeab;
    }

    public String gettUset() {
        return tUset;
    }

    public void settUset(String tUset) {
        this.tUset = tUset;
    }

    public String gettCuni() {
        return tCuni;
    }

    public void settCuni(String tCuni) {
        this.tCuni = tCuni;
    }

    public String gettCwun() {
        return tCwun;
    }

    public void settCwun(String tCwun) {
        this.tCwun = tCwun;
    }

    public String gettWght() {
        return tWght;
    }

    public void settWght(String tWght) {
        this.tWght = tWght;
    }

    public String gettCtyp() {
        return tCtyp;
    }

    public void settCtyp(String tCtyp) {
        this.tCtyp = tCtyp;
    }

    public String gettLtct() {
        return tLtct;
    }

    public void settLtct(String tLtct) {
        this.tLtct = tLtct;
    }

    public String gettCsel() {
        return tCsel;
    }

    public void settCsel(String tCsel) {
        this.tCsel = tCsel;
    }

    public String gettCsig() {
        return tCsig;
    }

    public void settCsig(String tCsig) {
        this.tCsig = tCsig;
    }

    public String gettCtyo() {
        return tCtyo;
    }

    public void settCtyo(String tCtyo) {
        this.tCtyo = tCtyo;
    }

    public String gettCpcl() {
        return tCpcl;
    }

    public void settCpcl(String tCpcl) {
        this.tCpcl = tCpcl;
    }

    public String gettCood() {
        return tCood;
    }

    public void settCood(String tCood) {
        this.tCood = tCood;
    }

    public String gettEitm() {
        return tEitm;
    }

    public void settEitm(String tEitm) {
        this.tEitm = tEitm;
    }

    public String gettUmer() {
        return tUmer;
    }

    public void settUmer(String tUmer) {
        this.tUmer = tUmer;
    }

    public String gettCpln() {
        return tCpln;
    }

    public void settCpln(String tCpln) {
        this.tCpln = tCpln;
    }

    public String gettCcde() {
        return tCcde;
    }

    public void settCcde(String tCcde) {
        this.tCcde = tCcde;
    }

    public String gettCmnf() {
        return tCmnf;
    }

    public void settCmnf(String tCmnf) {
        this.tCmnf = tCmnf;
    }

    public String gettCean() {
        return tCean;
    }

    public void settCean(String tCean) {
        this.tCean = tCean;
    }

    public String gettCont() {
        return tCont;
    }

    public void settCont(String tCont) {
        this.tCont = tCont;
    }

    public String gettCntr() {
        return tCntr;
    }

    public void settCntr(String tCntr) {
        this.tCntr = tCntr;
    }

    public String gettCprj() {
        return tCprj;
    }

    public void settCprj(String tCprj) {
        this.tCprj = tCprj;
    }

    public String gettRepl() {
        return tRepl;
    }

    public void settRepl(String tRepl) {
        this.tRepl = tRepl;
    }

    public String gettCpva() {
        return tCpva;
    }

    public void settCpva(String tCpva) {
        this.tCpva = tCpva;
    }

    public String gettDfit() {
        return tDfit;
    }

    public void settDfit(String tDfit) {
        this.tDfit = tDfit;
    }

    public String gettStoi() {
        return tStoi;
    }

    public void settStoi(String tStoi) {
        this.tStoi = tStoi;
    }

    public String gettCpcp() {
        return tCpcp;
    }

    public void settCpcp(String tCpcp) {
        this.tCpcp = tCpcp;
    }

    public String gettUnef() {
        return tUnef;
    }

    public void settUnef(String tUnef) {
        this.tUnef = tUnef;
    }

    public String gettIchg() {
        return tIchg;
    }

    public void settIchg(String tIchg) {
        this.tIchg = tIchg;
    }

    public String gettUefs() {
        return tUefs;
    }

    public void settUefs(String tUefs) {
        this.tUefs = tUefs;
    }

    public String gettSeri() {
        return tSeri;
    }

    public void settSeri(String tSeri) {
        this.tSeri = tSeri;
    }

    public String gettStyp() {
        return tStyp;
    }

    public void settStyp(String tStyp) {
        this.tStyp = tStyp;
    }

    public String gettPsiu() {
        return tPsiu;
    }

    public void settPsiu(String tPsiu) {
        this.tPsiu = tPsiu;
    }

    public String gettEfco() {
        return tEfco;
    }

    public void settEfco(String tEfco) {
        this.tEfco = tEfco;
    }

    public String gettIndt() {
        return tIndt;
    }

    public void settIndt(String tIndt) {
        this.tIndt = tIndt;
    }

    public String gettChma() {
        return tChma;
    }

    public void settChma(String tChma) {
        this.tChma = tChma;
    }

    public String gettEdco() {
        return tEdco;
    }

    public void settEdco(String tEdco) {
        this.tEdco = tEdco;
    }

    public String gettMcoa() {
        return tMcoa;
    }

    public void settMcoa(String tMcoa) {
        this.tMcoa = tMcoa;
    }

    public String gettOpts() {
        return tOpts;
    }

    public void settOpts(String tOpts) {
        this.tOpts = tOpts;
    }

    public String gettEnvc() {
        return tEnvc;
    }

    public void settEnvc(String tEnvc) {
        this.tEnvc = tEnvc;
    }

    public String gettWipi() {
        return tWipi;
    }

    public void settWipi(String tWipi) {
        this.tWipi = tWipi;
    }

    public String gettLmdt() {
        return tLmdt;
    }

    public void settLmdt(String tLmdt) {
        this.tLmdt = tLmdt;
    }

    public String gettTxta() {
        return tTxta;
    }

    public void settTxta(String tTxta) {
        this.tTxta = tTxta;
    }

    public String gettRefcntd() {
        return tRefcntd;
    }

    public void settRefcntd(String tRefcntd) {
        this.tRefcntd = tRefcntd;
    }

    public String gettRefcntu() {
        return tRefcntu;
    }

    public void settRefcntu(String tRefcntu) {
        this.tRefcntu = tRefcntu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ttcibd001120Entity that = (Ttcibd001120Entity) o;
        return Objects.equals(tItem, that.tItem) && Objects.equals(tKitm, that.tKitm) && Objects.equals(tCitg, that.tCitg) && Objects.equals(tItmt, that.tItmt) && Objects.equals(tDsca, that.tDsca) && Objects.equals(tDscb, that.tDscb) && Objects.equals(tDscc, that.tDscc) && Objects.equals(tDscd, that.tDscd) && Objects.equals(tSeak, that.tSeak) && Objects.equals(tSeab, that.tSeab) && Objects.equals(tUset, that.tUset) && Objects.equals(tCuni, that.tCuni) && Objects.equals(tCwun, that.tCwun) && Objects.equals(tWght, that.tWght) && Objects.equals(tCtyp, that.tCtyp) && Objects.equals(tLtct, that.tLtct) && Objects.equals(tCsel, that.tCsel) && Objects.equals(tCsig, that.tCsig) && Objects.equals(tCtyo, that.tCtyo) && Objects.equals(tCpcl, that.tCpcl) && Objects.equals(tCood, that.tCood) && Objects.equals(tEitm, that.tEitm) && Objects.equals(tUmer, that.tUmer) && Objects.equals(tCpln, that.tCpln) && Objects.equals(tCcde, that.tCcde) && Objects.equals(tCmnf, that.tCmnf) && Objects.equals(tCean, that.tCean) && Objects.equals(tCont, that.tCont) && Objects.equals(tCntr, that.tCntr) && Objects.equals(tCprj, that.tCprj) && Objects.equals(tRepl, that.tRepl) && Objects.equals(tCpva, that.tCpva) && Objects.equals(tDfit, that.tDfit) && Objects.equals(tStoi, that.tStoi) && Objects.equals(tCpcp, that.tCpcp) && Objects.equals(tUnef, that.tUnef) && Objects.equals(tIchg, that.tIchg) && Objects.equals(tUefs, that.tUefs) && Objects.equals(tSeri, that.tSeri) && Objects.equals(tStyp, that.tStyp) && Objects.equals(tPsiu, that.tPsiu) && Objects.equals(tEfco, that.tEfco) && Objects.equals(tIndt, that.tIndt) && Objects.equals(tChma, that.tChma) && Objects.equals(tEdco, that.tEdco) && Objects.equals(tMcoa, that.tMcoa) && Objects.equals(tOpts, that.tOpts) && Objects.equals(tEnvc, that.tEnvc) && Objects.equals(tWipi, that.tWipi) && Objects.equals(tLmdt, that.tLmdt) && Objects.equals(tTxta, that.tTxta) && Objects.equals(tRefcntd, that.tRefcntd) && Objects.equals(tRefcntu, that.tRefcntu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tItem, tKitm, tCitg, tItmt, tDsca, tDscb, tDscc, tDscd, tSeak, tSeab, tUset, tCuni, tCwun, tWght, tCtyp, tLtct, tCsel, tCsig, tCtyo, tCpcl, tCood, tEitm, tUmer, tCpln, tCcde, tCmnf, tCean, tCont, tCntr, tCprj, tRepl, tCpva, tDfit, tStoi, tCpcp, tUnef, tIchg, tUefs, tSeri, tStyp, tPsiu, tEfco, tIndt, tChma, tEdco, tMcoa, tOpts, tEnvc, tWipi, tLmdt, tTxta, tRefcntd, tRefcntu);
    }
}
