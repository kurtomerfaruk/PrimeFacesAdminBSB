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
public class CustomeraddressPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerID")
    private int customerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AddressID")
    private int addressID;

    public CustomeraddressPK() {
    }

    public CustomeraddressPK(int customerID, int addressID) {
        this.customerID = customerID;
        this.addressID = addressID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) customerID;
        hash += (int) addressID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomeraddressPK)) {
            return false;
        }
        CustomeraddressPK other = (CustomeraddressPK) object;
        if (this.customerID != other.customerID) {
            return false;
        }
        if (this.addressID != other.addressID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.CustomeraddressPK[ customerID=" + customerID + ", addressID=" + addressID + " ]";
    }

}
