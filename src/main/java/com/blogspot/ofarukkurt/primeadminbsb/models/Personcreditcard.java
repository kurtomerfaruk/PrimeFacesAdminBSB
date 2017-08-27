/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "personcreditcard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personcreditcard.findAll", query = "SELECT p FROM Personcreditcard p"),
    @NamedQuery(name = "Personcreditcard.findByBusinessEntityID", query = "SELECT p FROM Personcreditcard p WHERE p.personcreditcardPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Personcreditcard.findByCreditCardID", query = "SELECT p FROM Personcreditcard p WHERE p.personcreditcardPK.creditCardID = :creditCardID"),
    @NamedQuery(name = "Personcreditcard.findByModifiedDate", query = "SELECT p FROM Personcreditcard p WHERE p.modifiedDate = :modifiedDate")})
public class Personcreditcard implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersoncreditcardPK personcreditcardPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Person person;
    @JoinColumn(name = "CreditCardID", referencedColumnName = "CreditCardID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Creditcard creditcard;

    public Personcreditcard() {
    }

    public Personcreditcard(PersoncreditcardPK personcreditcardPK) {
        this.personcreditcardPK = personcreditcardPK;
    }

    public Personcreditcard(PersoncreditcardPK personcreditcardPK, Date modifiedDate) {
        this.personcreditcardPK = personcreditcardPK;
        this.modifiedDate = modifiedDate;
    }

    public Personcreditcard(int businessEntityID, int creditCardID) {
        this.personcreditcardPK = new PersoncreditcardPK(businessEntityID, creditCardID);
    }

    public PersoncreditcardPK getPersoncreditcardPK() {
        return personcreditcardPK;
    }

    public void setPersoncreditcardPK(PersoncreditcardPK personcreditcardPK) {
        this.personcreditcardPK = personcreditcardPK;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Creditcard getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(Creditcard creditcard) {
        this.creditcard = creditcard;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personcreditcardPK != null ? personcreditcardPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personcreditcard)) {
            return false;
        }
        Personcreditcard other = (Personcreditcard) object;
        if ((this.personcreditcardPK == null && other.personcreditcardPK != null) || (this.personcreditcardPK != null && !this.personcreditcardPK.equals(other.personcreditcardPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Personcreditcard[ personcreditcardPK=" + personcreditcardPK + " ]";
    }

}
