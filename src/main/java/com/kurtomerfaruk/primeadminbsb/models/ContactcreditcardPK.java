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
public class ContactcreditcardPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactID")
    private int contactID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreditCardID")
    private int creditCardID;

    public ContactcreditcardPK() {
    }

    public ContactcreditcardPK(int contactID, int creditCardID) {
        this.contactID = contactID;
        this.creditCardID = creditCardID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public int getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(int creditCardID) {
        this.creditCardID = creditCardID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) contactID;
        hash += (int) creditCardID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactcreditcardPK)) {
            return false;
        }
        ContactcreditcardPK other = (ContactcreditcardPK) object;
        if (this.contactID != other.contactID) {
            return false;
        }
        if (this.creditCardID != other.creditCardID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.ContactcreditcardPK[ contactID=" + contactID + ", creditCardID=" + creditCardID + " ]";
    }

}
