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
import javax.persistence.Lob;
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
@Table(name = "storecontact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Storecontact.findAll", query = "SELECT s FROM Storecontact s"),
    @NamedQuery(name = "Storecontact.findByCustomerID", query = "SELECT s FROM Storecontact s WHERE s.storecontactPK.customerID = :customerID"),
    @NamedQuery(name = "Storecontact.findByContactID", query = "SELECT s FROM Storecontact s WHERE s.storecontactPK.contactID = :contactID"),
    @NamedQuery(name = "Storecontact.findByContactTypeID", query = "SELECT s FROM Storecontact s WHERE s.contactTypeID = :contactTypeID"),
    @NamedQuery(name = "Storecontact.findByModifiedDate", query = "SELECT s FROM Storecontact s WHERE s.modifiedDate = :modifiedDate")})
public class Storecontact implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StorecontactPK storecontactPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactTypeID")
    private int contactTypeID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Storecontact() {
    }

    public Storecontact(StorecontactPK storecontactPK) {
        this.storecontactPK = storecontactPK;
    }

    public Storecontact(StorecontactPK storecontactPK, int contactTypeID, byte[] rowguid, Date modifiedDate) {
        this.storecontactPK = storecontactPK;
        this.contactTypeID = contactTypeID;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Storecontact(int customerID, int contactID) {
        this.storecontactPK = new StorecontactPK(customerID, contactID);
    }

    public StorecontactPK getStorecontactPK() {
        return storecontactPK;
    }

    public void setStorecontactPK(StorecontactPK storecontactPK) {
        this.storecontactPK = storecontactPK;
    }

    public int getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(int contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
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
        hash += (storecontactPK != null ? storecontactPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Storecontact)) {
            return false;
        }
        Storecontact other = (Storecontact) object;
        if ((this.storecontactPK == null && other.storecontactPK != null) || (this.storecontactPK != null && !this.storecontactPK.equals(other.storecontactPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Storecontact[ storecontactPK=" + storecontactPK + " ]";
    }

}
