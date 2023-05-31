package com.cofat.magasincofat.entity.ln;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@IdClass(Twhinh220120Id.class)
@Table(name = "twhinh220")
public class Twhinh220120 implements Serializable{
  /*  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

*/
    @Basic
    @Column(name = "t_oorg", nullable = true)
    private Integer tOorg;
    @Id
    @Column(name = "t_orno", nullable = true, length = 9)
    private String tOrno;
    @Id
    @Column(name = "t_pono", nullable = true)
    private Integer tPono;
    @Basic
    @Column(name = "t_seqn", nullable = true)
    private Integer tSeqn;
    @Basic
    @Column(name = "t_oset", nullable = true)
    private Integer tOset;
    @Basic
    @Column(name = "t_cwar", nullable = true, length = 6)
    private String tCwar;
    @Basic
    @Column(name = "t_comp", nullable = true)
    private Integer tComp;
    @Basic
    @Column(name = "t_acvt", nullable = true)
    private Integer tAcvt;
    @Basic
    @Column(name = "t_item", nullable = true, length = 47)
    private String tItem;
    @Basic
    @Column(name = "t_serl", nullable = true, length = 30)
    private String tSerl;
    @Basic
    @Column(name = "t_ssts", nullable = true)
    private Integer tSsts;
    @Basic
    @Column(name = "t_lsel", nullable = true)
    private Integer tLsel;
    @Basic
    @Column(name = "t_clot", nullable = true, length = 20)
    private String tClot;
    @Basic
    @Column(name = "t_effn", nullable = true)
    private Integer tEffn;
    @Basic
    @Column(name = "t_revi", nullable = true, length = 6)
    private String tRevi;
    @Basic
    @Column(name = "t_prio", nullable = true)
    private Integer tPrio;
    @Basic
    @Column(name = "t_qoro", nullable = true)
    private Float tQoro;
    @Basic
    @Column(name = "t_orun", nullable = true, length = 3)
    private String tOrun;
    @Basic
    @Column(name = "t_ubin", nullable = true)
    private Integer tUbin;
    @Basic
    @Column(name = "t_hstq", nullable = true)
    private Integer tHstq;
    @Basic
    @Column(name = "t_qord", nullable = true)
    private Float tQord;
    @Basic
    @Column(name = "t_qadv", nullable = true)
    private Float tQadv;
    @Basic
    @Column(name = "t_qrel", nullable = true)
    private Float tQrel;
    @Basic
    @Column(name = "t_qpic", nullable = true)
    private Float tQpic;
    @Basic
    @Column(name = "t_qapr", nullable = true)
    private Float tQapr;
    @Basic
    @Column(name = "t_qrej", nullable = true)
    private Float tQrej;
    @Basic
    @Column(name = "t_qnse", nullable = true)
    private Float tQnse;
    @Basic
    @Column(name = "t_qnsh", nullable = true)
    private Float tQnsh;
    @Basic
    @Column(name = "t_qshp", nullable = true)
    private Float tQshp;
    @Basic
    @Column(name = "t_qoor", nullable = true)
    private Float tQoor;
    @Basic
    @Column(name = "t_qova", nullable = true)
    private Float tQova;
    @Basic
    @Column(name = "t_qovd", nullable = true)
    private Float tQovd;
    @Basic
    @Column(name = "t_qcnl", nullable = true)
    private Float tQcnl;
    @Basic
    @Column(name = "t_pddt", nullable = true)
    private LocalDate tPddt;
    @Basic
    @Column(name = "t_prdt", nullable = true)
    private LocalDate tPrdt;
    @Basic
    @Column(name = "t_addt", nullable = true)
    private LocalDateTime tAddt;
    @Basic
    @Column(name = "t_inup", nullable = true)
    private Integer tInup;
    @Basic
    @Column(name = "t_bflh", nullable = true)
    private Integer tBflh;
    @Basic
    @Column(name = "t_rush", nullable = true)
    private Integer tRush;
    @Basic
    @Column(name = "t_cdck", nullable = true)
    private Integer tCdck;
    @Basic
    @Column(name = "t_qreq", nullable = true)
    private Float tQreq;
    @Basic
    @Column(name = "t_qcad", nullable = true)
    private Float tQcad;
    @Basic
    @Column(name = "t_qact", nullable = true)
    private Float tQact;
    @Basic
    @Column(name = "t_shrt", nullable = true)
    private Integer tShrt;
    @Basic
    @Column(name = "t_blck", nullable = true)
    private Integer tBlck;
    @Basic
    @Column(name = "t_cncl", nullable = true)
    private Integer tCncl;
    @Basic
    @Column(name = "t_bcko", nullable = true)
    private Integer tBcko;
    @Basic
    @Column(name = "t_pkdf", nullable = true, length = 6)
    private String tPkdf;
    @Basic
    @Column(name = "t_iubw", nullable = true)
    private Integer tIubw;
    @Basic
    @Column(name = "t_gefo", nullable = true)
    private Integer tGefo;
    @Basic
    @Column(name = "t_fmor", nullable = true, length = 9)
    private String tFmor;
    @Basic
    @Column(name = "t_fmln", nullable = true)
    private Integer tFmln;
    @Basic
    @Column(name = "t_ovlp", nullable = true)
    private Integer tOvlp;
    @Basic
    @Column(name = "t_uwop", nullable = true)
    private Integer tUwop;
    @Basic
    @Column(name = "t_orpr", nullable = true)
    private Float tOrpr;
    @Basic
    @Column(name = "t_ocur", nullable = true, length = 3)
    private String tOcur;
    @Basic
    @Column(name = "t_csvl", nullable = true)
    private Float tCsvl;
    @Basic
    @Column(name = "t_csvc", nullable = true, length = 3)
    private String tCsvc;
    @Basic
    @Column(name = "t_fprj", nullable = true, length = 9)
    private String tFprj;
    @Basic
    @Column(name = "t_fspa", nullable = true, length = 8)
    private String tFspa;
    @Basic
    @Column(name = "t_fact", nullable = true, length = 8)
    private String tFact;
    @Basic
    @Column(name = "t_fstl", nullable = true, length = 4)
    private String tFstl;
    @Basic
    @Column(name = "t_fcco", nullable = true, length = 8)
    private String tFcco;
    @Basic
    @Column(name = "t_tprj", nullable = true, length = 9)
    private String tTprj;
    @Basic
    @Column(name = "t_tspa", nullable = true, length = 8)
    private String tTspa;
    @Basic
    @Column(name = "t_tact", nullable = true, length = 8)
    private String tTact;
    @Basic
    @Column(name = "t_tstl", nullable = true, length = 4)
    private String tTstl;
    @Basic
    @Column(name = "t_tcco", nullable = true, length = 8)
    private String tTcco;
   // @Id
    @Basic
    @Column(name = "t_refe", nullable = true, length = 30)
    private String tRefe;
    @Basic
    @Column(name = "t_casi", nullable = true, length = 3)
    private String tCasi;
    @Basic
    @Column(name = "t_wmss", nullable = true)
    private Integer tWmss;
    @Basic
    @Column(name = "t_lsta", nullable = true)
    private Integer tLsta;
    @Basic
    @Column(name = "t_txtn", nullable = true)
    private Integer tTxtn;
    @Basic
    @Column(name = "t_Refcntd", nullable = true)
    private Integer tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true)
    private Integer tRefcntu;


 /* @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Twhinh220120)) return false;
    Twhinh220120 that = (Twhinh220120) o;
    return tOorg.equals(that.tOorg) && tOrno.equals(that.tOrno) && tPono.equals(that.tPono) && tSeqn.equals(that.tSeqn) && tOset.equals(that.tOset) && tCwar.equals(that.tCwar) && tComp.equals(that.tComp) && tAcvt.equals(that.tAcvt) && tItem.equals(that.tItem) && tSerl.equals(that.tSerl) && tSsts.equals(that.tSsts) && tLsel.equals(that.tLsel) && tClot.equals(that.tClot) && tEffn.equals(that.tEffn) && tRevi.equals(that.tRevi) && tPrio.equals(that.tPrio) && tQoro.equals(that.tQoro) && tOrun.equals(that.tOrun) && tUbin.equals(that.tUbin) && tHstq.equals(that.tHstq) && tQord.equals(that.tQord) && tQadv.equals(that.tQadv) && tQrel.equals(that.tQrel) && tQpic.equals(that.tQpic) && tQapr.equals(that.tQapr) && tQrej.equals(that.tQrej) && tQnse.equals(that.tQnse) && tQnsh.equals(that.tQnsh) && tQshp.equals(that.tQshp) && tQoor.equals(that.tQoor) && tQova.equals(that.tQova) && tQovd.equals(that.tQovd) && tQcnl.equals(that.tQcnl) && tPddt.equals(that.tPddt) && tPrdt.equals(that.tPrdt) && tAddt.equals(that.tAddt) && tInup.equals(that.tInup) && tBflh.equals(that.tBflh) && tRush.equals(that.tRush) && tCdck.equals(that.tCdck) && tQreq.equals(that.tQreq) && tQcad.equals(that.tQcad) && tQact.equals(that.tQact) && tShrt.equals(that.tShrt) && tBlck.equals(that.tBlck) && tCncl.equals(that.tCncl) && tBcko.equals(that.tBcko) && tPkdf.equals(that.tPkdf) && tIubw.equals(that.tIubw) && tGefo.equals(that.tGefo) && tFmor.equals(that.tFmor) && tFmln.equals(that.tFmln) && tOvlp.equals(that.tOvlp) && tUwop.equals(that.tUwop) && tOrpr.equals(that.tOrpr) && tOcur.equals(that.tOcur) && tCsvl.equals(that.tCsvl) && tCsvc.equals(that.tCsvc) && tFprj.equals(that.tFprj) && tFspa.equals(that.tFspa) && tFact.equals(that.tFact) && tFstl.equals(that.tFstl) && tFcco.equals(that.tFcco) && tTprj.equals(that.tTprj) && tTspa.equals(that.tTspa) && tTact.equals(that.tTact) && tTstl.equals(that.tTstl) && tTcco.equals(that.tTcco) && tRefe.equals(that.tRefe) && tCasi.equals(that.tCasi) && tWmss.equals(that.tWmss) && tLsta.equals(that.tLsta) && tTxtn.equals(that.tTxtn) && tRefcntd.equals(that.tRefcntd) && tRefcntu.equals(that.tRefcntu);
  }*/
 @Override
 public boolean equals(Object o) {
   if (this == o) return true;
   if (!(o instanceof Twhinh220120)) return false;
   Twhinh220120 that = (Twhinh220120) o;
   return tOrno.equals(that.tOrno) && tPono.equals(that.tPono) && tRefe.equals(that.tRefe);
 }



  @Override
  public int hashCode() {
    return Objects.hash(tOorg, tOrno, tPono, tSeqn, tOset, tCwar, tComp, tAcvt, tItem, tSerl, tSsts, tLsel, tClot, tEffn, tRevi, tPrio, tQoro, tOrun, tUbin, tHstq, tQord, tQadv, tQrel, tQpic, tQapr, tQrej, tQnse, tQnsh, tQshp, tQoor, tQova, tQovd, tQcnl, tPddt, tPrdt, tAddt, tInup, tBflh, tRush, tCdck, tQreq, tQcad, tQact, tShrt, tBlck, tCncl, tBcko, tPkdf, tIubw, tGefo, tFmor, tFmln, tOvlp, tUwop, tOrpr, tOcur, tCsvl, tCsvc, tFprj, tFspa, tFact, tFstl, tFcco, tTprj, tTspa, tTact, tTstl, tTcco, tRefe, tCasi, tWmss, tLsta, tTxtn, tRefcntd, tRefcntu);
  }

 }
