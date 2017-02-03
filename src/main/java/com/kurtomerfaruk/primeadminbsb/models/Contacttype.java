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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:04
 */
@Entity
@Table(name = "contacttype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacttype.findAll", query = "SELECT c FROM Contacttype c"),
    @NamedQuery(name = "Contacttype.findByContactTypeID", query = "SELECT c FROM Contacttype c WHERE c.contactTypeID = :contactTypeID"),
    @NamedQuery(name = "Contacttype.findByName", query = "SELECT c FROM Contacttype c WHERE c.name = :name"),
    @NamedQuery(name = "Contacttype.findByModifiedDate", query = "SELECT c FROM Contacttype c WHERE c.modifiedDate = :modifiedDate")})
public class Contacttype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ContactTypeID")
    private Integer contactTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Contacttype() {
    }

    public Contacttype(Integer contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

    public Contacttype(Integer contactTypeID, String name, Date modifiedDate) {
        this.contactTypeID = contactTypeID;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    public Integer getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(Integer contactTypeID) {
        this.contactTypeID = contactTypeID;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactTypeID != null ? contactTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacttype)) {
            return false;
        }
        Contacttype other = (Contacttype) object;
        if ((this.contactTypeID == null && other.contactTypeID != null) || (this.contactTypeID != null && !this.contactTypeID.equals(other.contactTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Contacttype[ contactTypeID=" + contactTypeID + " ]";
    }

}
