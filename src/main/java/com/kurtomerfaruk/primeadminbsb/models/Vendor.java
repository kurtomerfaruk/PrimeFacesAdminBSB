/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:05
 */
@Entity
@Table(name = "vendor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendor.findAll", query = "SELECT v FROM Vendor v"),
    @NamedQuery(name = "Vendor.findByVendorID", query = "SELECT v FROM Vendor v WHERE v.vendorID = :vendorID"),
    @NamedQuery(name = "Vendor.findByAccountNumber", query = "SELECT v FROM Vendor v WHERE v.accountNumber = :accountNumber"),
    @NamedQuery(name = "Vendor.findByName", query = "SELECT v FROM Vendor v WHERE v.name = :name"),
    @NamedQuery(name = "Vendor.findByCreditRating", query = "SELECT v FROM Vendor v WHERE v.creditRating = :creditRating"),
    @NamedQuery(name = "Vendor.findByPreferredVendorStatus", query = "SELECT v FROM Vendor v WHERE v.preferredVendorStatus = :preferredVendorStatus"),
    @NamedQuery(name = "Vendor.findByActiveFlag", query = "SELECT v FROM Vendor v WHERE v.activeFlag = :activeFlag"),
    @NamedQuery(name = "Vendor.findByModifiedDate", query = "SELECT v FROM Vendor v WHERE v.modifiedDate = :modifiedDate")})
public class Vendor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VendorID")
    private Integer vendorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "AccountNumber")
    private String accountNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreditRating")
    private short creditRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PreferredVendorStatus")
    private boolean preferredVendorStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ActiveFlag")
    private boolean activeFlag;
    @Lob
    @Size(max = 16777215)
    @Column(name = "PurchasingWebServiceURL")
    private String purchasingWebServiceURL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Vendor() {
    }

    public Vendor(Integer vendorID) {
        this.vendorID = vendorID;
    }

    public Vendor(Integer vendorID, String accountNumber, String name, short creditRating, boolean preferredVendorStatus, boolean activeFlag, Date modifiedDate) {
        this.vendorID = vendorID;
        this.accountNumber = accountNumber;
        this.name = name;
        this.creditRating = creditRating;
        this.preferredVendorStatus = preferredVendorStatus;
        this.activeFlag = activeFlag;
        this.modifiedDate = modifiedDate;
    }

    public Integer getVendorID() {
        return vendorID;
    }

    public void setVendorID(Integer vendorID) {
        this.vendorID = vendorID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(short creditRating) {
        this.creditRating = creditRating;
    }

    public boolean getPreferredVendorStatus() {
        return preferredVendorStatus;
    }

    public void setPreferredVendorStatus(boolean preferredVendorStatus) {
        this.preferredVendorStatus = preferredVendorStatus;
    }

    public boolean getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getPurchasingWebServiceURL() {
        return purchasingWebServiceURL;
    }

    public void setPurchasingWebServiceURL(String purchasingWebServiceURL) {
        this.purchasingWebServiceURL = purchasingWebServiceURL;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorID != null ? vendorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendor)) {
            return false;
        }
        Vendor other = (Vendor) object;
        if ((this.vendorID == null && other.vendorID != null) || (this.vendorID != null && !this.vendorID.equals(other.vendorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Vendor[ vendorID=" + vendorID + " ]";
    }

}
