package com.cofat.magasincofat.entity.ln;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="Twhinh204")
public class Twhinh204120 implements Serializable {
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
    @Column(name = "t_prty", nullable = true)
    private Integer tPrty;
    @Basic
    @Column(name = "t_acno", nullable = true)
    private Integer tAcno;
    @Basic
    @Column(name = "t_acti", nullable = true, length = 20)
    private String tActi;
    @Basic
    @Column(name = "t_appl", nullable = true)
    private Integer tAppl;
    @Basic
    @Column(name = "t_auto", nullable = true)
    private Integer tAuto;
    @Basic
    @Column(name = "t_odvc", nullable = true, length = 15)
    private String tOdvc;
    @Basic
    @Column(name = "t_Refcntd", nullable = true)
    private Integer tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true)
    private Integer tRefcntu;
}
