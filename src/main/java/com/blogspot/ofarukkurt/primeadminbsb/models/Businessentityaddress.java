/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "businessentityaddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Businessentityaddress.findAll", query = "SELECT b FROM Businessentityaddress b"),
    @NamedQuery(name = "Businessentityaddress.findByBusinessEntityID", query = "SELECT b FROM Businessentityaddress b WHERE b.businessentityaddressPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Businessentityaddress.findByAddressID", query = "SELECT b FROM Businessentityaddress b WHERE b.businessentityaddressPK.addressID = :addressID"),
    @NamedQuery(name = "Businessentityaddress.findByAddressTypeID", query = "SELECT b FROM Businessentityaddress b WHERE b.businessentityaddressPK.addressTypeID = :addressTypeID"),
    @NamedQuery(name = "Businessentityaddress.findByRowguid", query = "SELECT b FROM Businessentityaddress b WHERE b.rowguid = :rowguid"),
    @NamedQuery(name = "Businessentityaddress.findByModifiedDate", query = "SELECT b FROM Businessentityaddress b WHERE b.modifiedDate = :modifiedDate")})
public class Businessentityaddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BusinessentityaddressPK businessentityaddressPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Businessentity businessentity;
    @JoinColumn(name = "AddressID", referencedColumnName = "AddressID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Address address;
    @JoinColumn(name = "AddressTypeID", referencedColumnName = "AddressTypeID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Addresstype addresstype;

    public Businessentityaddress() {
    }

    public Businessentityaddress(BusinessentityaddressPK businessentityaddressPK) {
        this.businessentityaddressPK = businessentityaddressPK;
    }

    public Businessentityaddress(BusinessentityaddressPK businessentityaddressPK, String rowguid, Date modifiedDate) {
        this.businessentityaddressPK = businessentityaddressPK;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Businessentityaddress(int businessEntityID, int addressID, int addressTypeID) {
        this.businessentityaddressPK = new BusinessentityaddressPK(businessEntityID, addressID, addressTypeID);
    }

    public BusinessentityaddressPK getBusinessentityaddressPK() {
        return businessentityaddressPK;
    }

    public void setBusinessentityaddressPK(BusinessentityaddressPK businessentityaddressPK) {
        this.businessentityaddressPK = businessentityaddressPK;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Businessentity getBusinessentity() {
        return businessentity;
    }

    public void setBusinessentity(Businessentity businessentity) {
        this.businessentity = businessentity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Addresstype getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(Addresstype addresstype) {
        this.addresstype = addresstype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessentityaddressPK != null ? businessentityaddressPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Businessentityaddress)) {
            return false;
        }
        Businessentityaddress other = (Businessentityaddress) object;
        if ((this.businessentityaddressPK == null && other.businessentityaddressPK != null) || (this.businessentityaddressPK != null && !this.businessentityaddressPK.equals(other.businessentityaddressPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Businessentityaddress[ businessentityaddressPK=" + businessentityaddressPK + " ]";
    }

}
