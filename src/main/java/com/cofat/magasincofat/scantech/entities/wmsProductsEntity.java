package com.cofat.magasincofat.scantech.entities;

import lombok.*;

import javax.persistence.*;
import javax.sql.DataSource;
import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="wmsProducts")
public class wmsProductsEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private Integer id;
    @Basic
    @Column(name = "InternalCode", nullable = true, length = 18)
    private String internalCode;
    @Basic
    @Column(name = "Code", nullable = true, length = 15)
    private String code;
    @Basic
    @Column(name = "Name", nullable = true, length = 30)
    private String name;
    @Basic
    @Column(name = "Wms_CategoryId", nullable = true)
    private Integer wmsCategoryId;
    @Basic
    @Column(name = "Wms_SubCategoryId", nullable = true)
    private Integer wmsSubCategoryId;
    @Basic
    @Column(name = "Wms_ProviderCode", nullable = true, length = 22)
    private String wmsProviderCode;
    @Basic
    @Column(name = "ProviderProductCode", nullable = true, length = 30)
    private String providerProductCode;
    @Basic
    @Column(name = "CustomerProductCode", nullable = true, length = 25)
    private String customerProductCode;
    @Basic
    @Column(name = "Label2", nullable = true, length = 12)
    private String label2;
    @Basic
    @Column(name = "ColorCode", nullable = true, length = 15)
    private String colorCode;
    @Basic
    @Column(name = "CostPrice", nullable = true)
    private Integer costPrice;
    @Basic
    @Column(name = "LastInventoryDate", nullable = true, length = 27)
    private String lastInventoryDate;
    @Basic
    @Column(name = "Active", nullable = true)
    private Boolean  active;
    @Basic
    @Column(name = "SecurityStock", nullable = true)
    private Integer securityStock;
    @Basic
    @Column(name = "MultipleQuantity", nullable = true)
    private Integer multipleQuantity;
    @Basic
    @Column(name = "Unit", nullable = true, length = 10)
    private String unit;
    @Basic
    @Column(name = "QualityCode", nullable = true, length = 17)
    private String qualityCode;
    @Basic
    @Column(name = "CreatedOnUtc", nullable = true, length = 27)
    private String createdOnUtc;
    @Basic
    @Column(name = "CreatedBy", nullable = true, length = 15)
    private String createdBy;
    @Basic
    @Column(name = "UpdatedOnUtc", nullable = true, length = 27)
    private String updatedOnUtc;
    @Basic
    @Column(name = "UpdatedBy", nullable = true, length = 15)
    private String updatedBy;

    //Relation

    @OneToMany(mappedBy = "wmsProductsEntity")
    private Collection<wmsMovementsEntity> wmsMovementEntities;

    public void setWmsMovements(Collection<wmsMovementsEntity> wmsMovementEntities) {
        this.wmsMovementEntities = wmsMovementEntities;
    }



}
