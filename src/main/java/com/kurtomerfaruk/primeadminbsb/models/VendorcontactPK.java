/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
 */
@Embeddable
public class VendorcontactPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "VendorID")
    private int vendorID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactID")
    private int contactID;

    public VendorcontactPK() {
    }

    public VendorcontactPK(int vendorID, int contactID) {
        this.vendorID = vendorID;
        this.contactID = contactID;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) vendorID;
        hash += (int) contactID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorcontactPK)) {
            return false;
        }
        VendorcontactPK other = (VendorcontactPK) object;
        if (this.vendorID != other.vendorID) {
            return false;
        }
        if (this.contactID != other.contactID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.VendorcontactPK[ vendorID=" + vendorID + ", contactID=" + contactID + " ]";
    }

}
