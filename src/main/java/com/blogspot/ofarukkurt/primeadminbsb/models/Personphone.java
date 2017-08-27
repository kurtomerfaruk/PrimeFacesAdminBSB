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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "personphone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personphone.findAll", query = "SELECT p FROM Personphone p"),
    @NamedQuery(name = "Personphone.findByBusinessEntityID", query = "SELECT p FROM Personphone p WHERE p.personphonePK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Personphone.findByPhoneNumber", query = "SELECT p FROM Personphone p WHERE p.personphonePK.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Personphone.findByPhoneNumberTypeID", query = "SELECT p FROM Personphone p WHERE p.personphonePK.phoneNumberTypeID = :phoneNumberTypeID"),
    @NamedQuery(name = "Personphone.findByModifiedDate", query = "SELECT p FROM Personphone p WHERE p.modifiedDate = :modifiedDate")})
public class Personphone implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonphonePK personphonePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "PhoneNumberTypeID", referencedColumnName = "PhoneNumberTypeID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Phonenumbertype phonenumbertype;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Person person;

    public Personphone() {
    }

    public Personphone(PersonphonePK personphonePK) {
        this.personphonePK = personphonePK;
    }

    public Personphone(PersonphonePK personphonePK, Date modifiedDate) {
        this.personphonePK = personphonePK;
        this.modifiedDate = modifiedDate;
    }

    public Personphone(int businessEntityID, String phoneNumber, int phoneNumberTypeID) {
        this.personphonePK = new PersonphonePK(businessEntityID, phoneNumber, phoneNumberTypeID);
    }

    public PersonphonePK getPersonphonePK() {
        return personphonePK;
    }

    public void setPersonphonePK(PersonphonePK personphonePK) {
        this.personphonePK = personphonePK;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Phonenumbertype getPhonenumbertype() {
        return phonenumbertype;
    }

    public void setPhonenumbertype(Phonenumbertype phonenumbertype) {
        this.phonenumbertype = phonenumbertype;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personphonePK != null ? personphonePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personphone)) {
            return false;
        }
        Personphone other = (Personphone) object;
        if ((this.personphonePK == null && other.personphonePK != null) || (this.personphonePK != null && !this.personphonePK.equals(other.personphonePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Personphone[ personphonePK=" + personphonePK + " ]";
    }

}
