/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "vendor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendor.findAll", query = "SELECT v FROM Vendor v"),
    @NamedQuery(name = "Vendor.findByBusinessEntityID", query = "SELECT v FROM Vendor v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Vendor.findByAccountNumber", query = "SELECT v FROM Vendor v WHERE v.accountNumber = :accountNumber"),
    @NamedQuery(name = "Vendor.findByName", query = "SELECT v FROM Vendor v WHERE v.name = :name"),
    @NamedQuery(name = "Vendor.findByCreditRating", query = "SELECT v FROM Vendor v WHERE v.creditRating = :creditRating"),
    @NamedQuery(name = "Vendor.findByPreferredVendorStatus", query = "SELECT v FROM Vendor v WHERE v.preferredVendorStatus = :preferredVendorStatus"),
    @NamedQuery(name = "Vendor.findByActiveFlag", query = "SELECT v FROM Vendor v WHERE v.activeFlag = :activeFlag"),
    @NamedQuery(name = "Vendor.findByPurchasingWebServiceURL", query = "SELECT v FROM Vendor v WHERE v.purchasingWebServiceURL = :purchasingWebServiceURL"),
    @NamedQuery(name = "Vendor.findByModifiedDate", query = "SELECT v FROM Vendor v WHERE v.modifiedDate = :modifiedDate")})
public class Vendor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "AccountNumber")
    private String accountNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
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
    @Size(max = 1024)
    @Column(name = "PurchasingWebServiceURL")
    private String purchasingWebServiceURL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendorID")
    private List<Purchaseorderheader> purchaseorderheaderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendor")
    private List<Productvendor> productvendorList;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Businessentity businessentity;

    public Vendor() {
    }

    public Vendor(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Vendor(Integer businessEntityID, String accountNumber, String name, short creditRating, boolean preferredVendorStatus, boolean activeFlag, Date modifiedDate) {
        this.businessEntityID = businessEntityID;
        this.accountNumber = accountNumber;
        this.name = name;
        this.creditRating = creditRating;
        this.preferredVendorStatus = preferredVendorStatus;
        this.activeFlag = activeFlag;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
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

    @XmlTransient
    public List<Purchaseorderheader> getPurchaseorderheaderList() {
        return purchaseorderheaderList;
    }

    public void setPurchaseorderheaderList(List<Purchaseorderheader> purchaseorderheaderList) {
        this.purchaseorderheaderList = purchaseorderheaderList;
    }

    @XmlTransient
    public List<Productvendor> getProductvendorList() {
        return productvendorList;
    }

    public void setProductvendorList(List<Productvendor> productvendorList) {
        this.productvendorList = productvendorList;
    }

    public Businessentity getBusinessentity() {
        return businessentity;
    }

    public void setBusinessentity(Businessentity businessentity) {
        this.businessentity = businessentity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessEntityID != null ? businessEntityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendor)) {
            return false;
        }
        Vendor other = (Vendor) object;
        if ((this.businessEntityID == null && other.businessEntityID != null) || (this.businessEntityID != null && !this.businessEntityID.equals(other.businessEntityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Vendor[ businessEntityID=" + businessEntityID + " ]";
    }

}
