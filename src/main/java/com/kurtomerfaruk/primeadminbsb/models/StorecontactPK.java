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
 * Created on date 27.01.2017 23:11:04
 */
@Embeddable
public class StorecontactPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerID")
    private int customerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactID")
    private int contactID;

    public StorecontactPK() {
    }

    public StorecontactPK(int customerID, int contactID) {
        this.customerID = customerID;
        this.contactID = contactID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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
        hash += (int) customerID;
        hash += (int) contactID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StorecontactPK)) {
            return false;
        }
        StorecontactPK other = (StorecontactPK) object;
        if (this.customerID != other.customerID) {
            return false;
        }
        if (this.contactID != other.contactID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.StorecontactPK[ customerID=" + customerID + ", contactID=" + contactID + " ]";
    }

}
