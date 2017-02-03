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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:04
 */
@Entity
@Table(name = "vendoraddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendoraddress.findAll", query = "SELECT v FROM Vendoraddress v"),
    @NamedQuery(name = "Vendoraddress.findByVendorID", query = "SELECT v FROM Vendoraddress v WHERE v.vendoraddressPK.vendorID = :vendorID"),
    @NamedQuery(name = "Vendoraddress.findByAddressID", query = "SELECT v FROM Vendoraddress v WHERE v.vendoraddressPK.addressID = :addressID"),
    @NamedQuery(name = "Vendoraddress.findByAddressTypeID", query = "SELECT v FROM Vendoraddress v WHERE v.addressTypeID = :addressTypeID"),
    @NamedQuery(name = "Vendoraddress.findByModifiedDate", query = "SELECT v FROM Vendoraddress v WHERE v.modifiedDate = :modifiedDate")})
public class Vendoraddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VendoraddressPK vendoraddressPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AddressTypeID")
    private int addressTypeID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Vendoraddress() {
    }

    public Vendoraddress(VendoraddressPK vendoraddressPK) {
        this.vendoraddressPK = vendoraddressPK;
    }

    public Vendoraddress(VendoraddressPK vendoraddressPK, int addressTypeID, Date modifiedDate) {
        this.vendoraddressPK = vendoraddressPK;
        this.addressTypeID = addressTypeID;
        this.modifiedDate = modifiedDate;
    }

    public Vendoraddress(int vendorID, int addressID) {
        this.vendoraddressPK = new VendoraddressPK(vendorID, addressID);
    }

    public VendoraddressPK getVendoraddressPK() {
        return vendoraddressPK;
    }

    public void setVendoraddressPK(VendoraddressPK vendoraddressPK) {
        this.vendoraddressPK = vendoraddressPK;
    }

    public int getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(int addressTypeID) {
        this.addressTypeID = addressTypeID;
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
        hash += (vendoraddressPK != null ? vendoraddressPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendoraddress)) {
            return false;
        }
        Vendoraddress other = (Vendoraddress) object;
        if ((this.vendoraddressPK == null && other.vendoraddressPK != null) || (this.vendoraddressPK != null && !this.vendoraddressPK.equals(other.vendoraddressPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Vendoraddress[ vendoraddressPK=" + vendoraddressPK + " ]";
    }

}
