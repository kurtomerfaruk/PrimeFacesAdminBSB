/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class PersonphonePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PhoneNumberTypeID")
    private int phoneNumberTypeID;

    public PersonphonePK() {
    }

    public PersonphonePK(int businessEntityID, String phoneNumber, int phoneNumberTypeID) {
        this.businessEntityID = businessEntityID;
        this.phoneNumber = phoneNumber;
        this.phoneNumberTypeID = phoneNumberTypeID;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumberTypeID() {
        return phoneNumberTypeID;
    }

    public void setPhoneNumberTypeID(int phoneNumberTypeID) {
        this.phoneNumberTypeID = phoneNumberTypeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) businessEntityID;
        hash += (phoneNumber != null ? phoneNumber.hashCode() : 0);
        hash += (int) phoneNumberTypeID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonphonePK)) {
            return false;
        }
        PersonphonePK other = (PersonphonePK) object;
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if ((this.phoneNumber == null && other.phoneNumber != null) || (this.phoneNumber != null && !this.phoneNumber.equals(other.phoneNumber))) {
            return false;
        }
        if (this.phoneNumberTypeID != other.phoneNumberTypeID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.PersonphonePK[ businessEntityID=" + businessEntityID + ", phoneNumber=" + phoneNumber + ", phoneNumberTypeID=" + phoneNumberTypeID + " ]";
    }

}
