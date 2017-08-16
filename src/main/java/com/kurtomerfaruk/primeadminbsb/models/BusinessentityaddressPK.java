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
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class BusinessentityaddressPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AddressID")
    private int addressID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AddressTypeID")
    private int addressTypeID;

    public BusinessentityaddressPK() {
    }

    public BusinessentityaddressPK(int businessEntityID, int addressID, int addressTypeID) {
        this.businessEntityID = businessEntityID;
        this.addressID = addressID;
        this.addressTypeID = addressTypeID;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(int addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) businessEntityID;
        hash += (int) addressID;
        hash += (int) addressTypeID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusinessentityaddressPK)) {
            return false;
        }
        BusinessentityaddressPK other = (BusinessentityaddressPK) object;
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if (this.addressID != other.addressID) {
            return false;
        }
        if (this.addressTypeID != other.addressTypeID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.BusinessentityaddressPK[ businessEntityID=" + businessEntityID + ", addressID=" + addressID + ", addressTypeID=" + addressTypeID + " ]";
    }

}
