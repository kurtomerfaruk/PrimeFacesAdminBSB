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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class BusinessentitycontactPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PersonID")
    private int personID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactTypeID")
    private int contactTypeID;

    public BusinessentitycontactPK() {
    }

    public BusinessentitycontactPK(int businessEntityID, int personID, int contactTypeID) {
        this.businessEntityID = businessEntityID;
        this.personID = personID;
        this.contactTypeID = contactTypeID;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(int contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) businessEntityID;
        hash += (int) personID;
        hash += (int) contactTypeID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusinessentitycontactPK)) {
            return false;
        }
        BusinessentitycontactPK other = (BusinessentitycontactPK) object;
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if (this.personID != other.personID) {
            return false;
        }
        if (this.contactTypeID != other.contactTypeID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.BusinessentitycontactPK[ businessEntityID=" + businessEntityID + ", personID=" + personID + ", contactTypeID=" + contactTypeID + " ]";
    }

}
