/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "phonenumbertype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phonenumbertype.findAll", query = "SELECT p FROM Phonenumbertype p"),
    @NamedQuery(name = "Phonenumbertype.findByPhoneNumberTypeID", query = "SELECT p FROM Phonenumbertype p WHERE p.phoneNumberTypeID = :phoneNumberTypeID"),
    @NamedQuery(name = "Phonenumbertype.findByName", query = "SELECT p FROM Phonenumbertype p WHERE p.name = :name"),
    @NamedQuery(name = "Phonenumbertype.findByModifiedDate", query = "SELECT p FROM Phonenumbertype p WHERE p.modifiedDate = :modifiedDate")})
public class Phonenumbertype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PhoneNumberTypeID")
    private Integer phoneNumberTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "phonenumbertype")
    private List<Personphone> personphoneList;

    public Phonenumbertype() {
    }

    public Phonenumbertype(Integer phoneNumberTypeID) {
        this.phoneNumberTypeID = phoneNumberTypeID;
    }

    public Phonenumbertype(Integer phoneNumberTypeID, String name, Date modifiedDate) {
        this.phoneNumberTypeID = phoneNumberTypeID;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    public Integer getPhoneNumberTypeID() {
        return phoneNumberTypeID;
    }

    public void setPhoneNumberTypeID(Integer phoneNumberTypeID) {
        this.phoneNumberTypeID = phoneNumberTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public List<Personphone> getPersonphoneList() {
        return personphoneList;
    }

    public void setPersonphoneList(List<Personphone> personphoneList) {
        this.personphoneList = personphoneList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phoneNumberTypeID != null ? phoneNumberTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phonenumbertype)) {
            return false;
        }
        Phonenumbertype other = (Phonenumbertype) object;
        if ((this.phoneNumberTypeID == null && other.phoneNumberTypeID != null) || (this.phoneNumberTypeID != null && !this.phoneNumberTypeID.equals(other.phoneNumberTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Phonenumbertype[ phoneNumberTypeID=" + phoneNumberTypeID + " ]";
    }

}
