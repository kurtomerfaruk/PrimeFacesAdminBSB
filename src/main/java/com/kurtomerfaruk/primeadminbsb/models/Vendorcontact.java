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
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "vendorcontact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendorcontact.findAll", query = "SELECT v FROM Vendorcontact v"),
    @NamedQuery(name = "Vendorcontact.findByVendorID", query = "SELECT v FROM Vendorcontact v WHERE v.vendorcontactPK.vendorID = :vendorID"),
    @NamedQuery(name = "Vendorcontact.findByContactID", query = "SELECT v FROM Vendorcontact v WHERE v.vendorcontactPK.contactID = :contactID"),
    @NamedQuery(name = "Vendorcontact.findByContactTypeID", query = "SELECT v FROM Vendorcontact v WHERE v.contactTypeID = :contactTypeID"),
    @NamedQuery(name = "Vendorcontact.findByModifiedDate", query = "SELECT v FROM Vendorcontact v WHERE v.modifiedDate = :modifiedDate")})
public class Vendorcontact implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VendorcontactPK vendorcontactPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactTypeID")
    private int contactTypeID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Vendorcontact() {
    }

    public Vendorcontact(VendorcontactPK vendorcontactPK) {
        this.vendorcontactPK = vendorcontactPK;
    }

    public Vendorcontact(VendorcontactPK vendorcontactPK, int contactTypeID, Date modifiedDate) {
        this.vendorcontactPK = vendorcontactPK;
        this.contactTypeID = contactTypeID;
        this.modifiedDate = modifiedDate;
    }

    public Vendorcontact(int vendorID, int contactID) {
        this.vendorcontactPK = new VendorcontactPK(vendorID, contactID);
    }

    public VendorcontactPK getVendorcontactPK() {
        return vendorcontactPK;
    }

    public void setVendorcontactPK(VendorcontactPK vendorcontactPK) {
        this.vendorcontactPK = vendorcontactPK;
    }

    public int getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(int contactTypeID) {
        this.contactTypeID = contactTypeID;
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
        hash += (vendorcontactPK != null ? vendorcontactPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendorcontact)) {
            return false;
        }
        Vendorcontact other = (Vendorcontact) object;
        if ((this.vendorcontactPK == null && other.vendorcontactPK != null) || (this.vendorcontactPK != null && !this.vendorcontactPK.equals(other.vendorcontactPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Vendorcontact[ vendorcontactPK=" + vendorcontactPK + " ]";
    }

}
