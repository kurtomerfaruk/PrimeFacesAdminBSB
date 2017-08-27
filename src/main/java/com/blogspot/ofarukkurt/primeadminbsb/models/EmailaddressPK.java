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

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class EmailaddressPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @Column(name = "EmailAddressID")
    private int emailAddressID;

    public EmailaddressPK() {
    }

    public EmailaddressPK(int businessEntityID, int emailAddressID) {
        this.businessEntityID = businessEntityID;
        this.emailAddressID = emailAddressID;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getEmailAddressID() {
        return emailAddressID;
    }

    public void setEmailAddressID(int emailAddressID) {
        this.emailAddressID = emailAddressID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) businessEntityID;
        hash += (int) emailAddressID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailaddressPK)) {
            return false;
        }
        EmailaddressPK other = (EmailaddressPK) object;
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if (this.emailAddressID != other.emailAddressID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.EmailaddressPK[ businessEntityID=" + businessEntityID + ", emailAddressID=" + emailAddressID + " ]";
    }

}
