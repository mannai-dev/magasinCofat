package com.cofat.magasincofat.scantech.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name = "wms_accounts")
public class DboWmsAccountEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private Integer id;

    @Basic
    @Column(name = "Username", length = 14)
    private String userName;
    @Basic
    @Column(name = "Password", length = 128)
    private String password;
    @Basic
    @Column(name = "Passwordsalt", length = 8)
    private String passwordSalt;
    @Basic
    @Column(name = "Email", length = 24)
    private String email;
    @Basic
    @Column(name = "Contact", length = 2)
    private String contactId;
    @Basic
    @Column(name = "Crypted", length = 32)
    private String cryptedPassword;
    @Basic
    @Column(name = "Active")
    private Integer active;
    @Basic
    @Column(name = "CreatedOnUtc", length = 27)
    private String createdOnUtc;
    @Basic
    @Column(name = "CreatedBy", length = 8)
    private String createdBy;
    @Basic
    @Column(name = "UpdatedOnUtc", length = 27)
    private String updatedOnUtc;
    @Basic
    @Column(name = "UpdatedBy", length = 8)
    private String updatedBy;

    public DboWmsAccountEntity() {
    }

    public DboWmsAccountEntity(Integer id, String userName, String password, String passwordSalt, String email, String contactId, String cryptedPassword, Integer active, String createdOnUtc, String createdBy, String updatedOnUtc, String updatedBy) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.passwordSalt = passwordSalt;
        this.email = email;
        this.contactId = contactId;
        this.cryptedPassword = cryptedPassword;
        this.active = active;
        this.createdOnUtc = createdOnUtc;
        this.createdBy = createdBy;
        this.updatedOnUtc = updatedOnUtc;
        this.updatedBy = updatedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getCryptedPassword() {
        return cryptedPassword;
    }

    public void setCryptedPassword(String cryptedPassword) {
        this.cryptedPassword = cryptedPassword;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getCreatedOnUtc() {
        return createdOnUtc;
    }

    public void setCreatedOnUtc(String createdOnUtc) {
        this.createdOnUtc = createdOnUtc;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedOnUtc() {
        return updatedOnUtc;
    }

    public void setUpdatedOnUtc(String updatedOnUtc) {
        this.updatedOnUtc = updatedOnUtc;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
//Relation
    @OneToMany(mappedBy = "DboWmsAccountEntity")
    private Collection<wmsMovementsEntity> wmsMovementEntities;
    public void wmsMovements(Collection<wmsMovementsEntity> wmsMovementEntities) {
        this.wmsMovementEntities = wmsMovementEntities;
    }
}