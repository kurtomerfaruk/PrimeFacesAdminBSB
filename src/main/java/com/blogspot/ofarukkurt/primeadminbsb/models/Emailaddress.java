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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "emailaddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emailaddress.findAll", query = "SELECT e FROM Emailaddress e"),
    @NamedQuery(name = "Emailaddress.findByBusinessEntityID", query = "SELECT e FROM Emailaddress e WHERE e.emailaddressPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Emailaddress.findByEmailAddressID", query = "SELECT e FROM Emailaddress e WHERE e.emailaddressPK.emailAddressID = :emailAddressID"),
    @NamedQuery(name = "Emailaddress.findByEmailAddress", query = "SELECT e FROM Emailaddress e WHERE e.emailAddress = :emailAddress"),
    @NamedQuery(name = "Emailaddress.findByRowguid", query = "SELECT e FROM Emailaddress e WHERE e.rowguid = :rowguid"),
    @NamedQuery(name = "Emailaddress.findByModifiedDate", query = "SELECT e FROM Emailaddress e WHERE e.modifiedDate = :modifiedDate")})
public class Emailaddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmailaddressPK emailaddressPK;
    @Size(max = 50)
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Person person;

    public Emailaddress() {
    }

    public Emailaddress(EmailaddressPK emailaddressPK) {
        this.emailaddressPK = emailaddressPK;
    }

    public Emailaddress(EmailaddressPK emailaddressPK, String rowguid, Date modifiedDate) {
        this.emailaddressPK = emailaddressPK;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Emailaddress(int businessEntityID, int emailAddressID) {
        this.emailaddressPK = new EmailaddressPK(businessEntityID, emailAddressID);
    }

    public EmailaddressPK getEmailaddressPK() {
        return emailaddressPK;
    }

    public void setEmailaddressPK(EmailaddressPK emailaddressPK) {
        this.emailaddressPK = emailaddressPK;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailaddressPK != null ? emailaddressPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emailaddress)) {
            return false;
        }
        Emailaddress other = (Emailaddress) object;
        if ((this.emailaddressPK == null && other.emailaddressPK != null) || (this.emailaddressPK != null && !this.emailaddressPK.equals(other.emailaddressPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Emailaddress[ emailaddressPK=" + emailaddressPK + " ]";
    }

}
