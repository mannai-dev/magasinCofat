package com.cofat.magasincofat.scantech.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="wmsMovements")
public class wmsMovementsEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "PalletBarcode", nullable = true, length = 19)
    private String palletBarcode;
    @Basic
    @Column(name = "ProductId", nullable = false)
    private Integer productId;
    @Basic
    @Column(name = "InitialQuantity", nullable = true,precision = 18,scale = 2)
    private Float initialQuantity;
    @Basic
    @Column(name = "FinalQuantity", nullable = true,precision = 18,scale = 2)
    private Float finalQuantity;
    @Basic
    @Column(name = "PalletLot", nullable = true, length = 15)
    private String palletLot;
    @Basic
    @Column(name = "PalletType", nullable = true, length = 16)
    private String palletType;
    @Basic
    @Column(name = "MovementType", nullable = true, length = 18)
    private Integer movementType;
    @Basic
    @Column(name = "OrderId", nullable = true, length = 13)
    private String orderId;
    @Basic
    @Column(name = "Source", nullable = true, length = 14)
    private String source;
    @Basic
    @Column(name = "Destination", nullable = true, length = 17)
    private String destination;
    @Basic
    @Column(name = "Date", nullable = true, length = 27)
    private LocalDateTime date;
    @Basic
    @Column(name = "Accountid", nullable = true)
    private Integer accountId;
    @Basic
    @Column(name = "CreatedOnUtc", nullable = true, length = 27)
    private String createdOnUtc;
    @Basic
    @Column(name = "Createdby", nullable = true, length = 15)
    private String createdBy;
    @Basic
    @Column(name = "UpdatedOnUtc", nullable = true, length = 18)
    private String updatedOnUtc;
    @Basic
    @Column(name = "UpdatedBy", nullable = true, length = 15)
    private String updatedBy;

    //Relation
    @ManyToOne
    @JoinColumn(name = "ProductId", insertable = false, updatable = false)
    @JsonIgnore
    private wmsProductsEntity wmsProductsEntity;

    @ManyToOne
    @JoinColumn(name = "Accountid", insertable = false, updatable = false)
    @JsonIgnore
    private DboWmsAccountEntity DboWmsAccountEntity;

}
