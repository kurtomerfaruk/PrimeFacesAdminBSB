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
@Table(name = "contactcreditcard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactcreditcard.findAll", query = "SELECT c FROM Contactcreditcard c"),
    @NamedQuery(name = "Contactcreditcard.findByContactID", query = "SELECT c FROM Contactcreditcard c WHERE c.contactcreditcardPK.contactID = :contactID"),
    @NamedQuery(name = "Contactcreditcard.findByCreditCardID", query = "SELECT c FROM Contactcreditcard c WHERE c.contactcreditcardPK.creditCardID = :creditCardID"),
    @NamedQuery(name = "Contactcreditcard.findByModifiedDate", query = "SELECT c FROM Contactcreditcard c WHERE c.modifiedDate = :modifiedDate")})
public class Contactcreditcard implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactcreditcardPK contactcreditcardPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Contactcreditcard() {
    }

    public Contactcreditcard(ContactcreditcardPK contactcreditcardPK) {
        this.contactcreditcardPK = contactcreditcardPK;
    }

    public Contactcreditcard(ContactcreditcardPK contactcreditcardPK, Date modifiedDate) {
        this.contactcreditcardPK = contactcreditcardPK;
        this.modifiedDate = modifiedDate;
    }

    public Contactcreditcard(int contactID, int creditCardID) {
        this.contactcreditcardPK = new ContactcreditcardPK(contactID, creditCardID);
    }

    public ContactcreditcardPK getContactcreditcardPK() {
        return contactcreditcardPK;
    }

    public void setContactcreditcardPK(ContactcreditcardPK contactcreditcardPK) {
        this.contactcreditcardPK = contactcreditcardPK;
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
        hash += (contactcreditcardPK != null ? contactcreditcardPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactcreditcard)) {
            return false;
        }
        Contactcreditcard other = (Contactcreditcard) object;
        if ((this.contactcreditcardPK == null && other.contactcreditcardPK != null) || (this.contactcreditcardPK != null && !this.contactcreditcardPK.equals(other.contactcreditcardPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Contactcreditcard[ contactcreditcardPK=" + contactcreditcardPK + " ]";
    }

}
