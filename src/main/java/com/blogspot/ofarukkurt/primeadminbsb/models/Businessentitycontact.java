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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "businessentitycontact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Businessentitycontact.findAll", query = "SELECT b FROM Businessentitycontact b"),
    @NamedQuery(name = "Businessentitycontact.findByBusinessEntityID", query = "SELECT b FROM Businessentitycontact b WHERE b.businessentitycontactPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Businessentitycontact.findByPersonID", query = "SELECT b FROM Businessentitycontact b WHERE b.businessentitycontactPK.personID = :personID"),
    @NamedQuery(name = "Businessentitycontact.findByContactTypeID", query = "SELECT b FROM Businessentitycontact b WHERE b.businessentitycontactPK.contactTypeID = :contactTypeID"),
    @NamedQuery(name = "Businessentitycontact.findByModifiedDate", query = "SELECT b FROM Businessentitycontact b WHERE b.modifiedDate = :modifiedDate")})
public class Businessentitycontact implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BusinessentitycontactPK businessentitycontactPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "PersonID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Person person;
    @JoinColumn(name = "ContactTypeID", referencedColumnName = "ContactTypeID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contacttype contacttype;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Businessentity businessentity;

    public Businessentitycontact() {
    }

    public Businessentitycontact(BusinessentitycontactPK businessentitycontactPK) {
        this.businessentitycontactPK = businessentitycontactPK;
    }

    public Businessentitycontact(BusinessentitycontactPK businessentitycontactPK,  Date modifiedDate) {
        this.businessentitycontactPK = businessentitycontactPK;
        this.modifiedDate = modifiedDate;
    }

    public Businessentitycontact(int businessEntityID, int personID, int contactTypeID) {
        this.businessentitycontactPK = new BusinessentitycontactPK(businessEntityID, personID, contactTypeID);
    }

    public BusinessentitycontactPK getBusinessentitycontactPK() {
        return businessentitycontactPK;
    }

    public void setBusinessentitycontactPK(BusinessentitycontactPK businessentitycontactPK) {
        this.businessentitycontactPK = businessentitycontactPK;
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

    public Contacttype getContacttype() {
        return contacttype;
    }

    public void setContacttype(Contacttype contacttype) {
        this.contacttype = contacttype;
    }

    public Businessentity getBusinessentity() {
        return businessentity;
    }

    public void setBusinessentity(Businessentity businessentity) {
        this.businessentity = businessentity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessentitycontactPK != null ? businessentitycontactPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Businessentitycontact)) {
            return false;
        }
        Businessentitycontact other = (Businessentitycontact) object;
        if ((this.businessentitycontactPK == null && other.businessentitycontactPK != null) || (this.businessentitycontactPK != null && !this.businessentitycontactPK.equals(other.businessentitycontactPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Businessentitycontact[ businessentitycontactPK=" + businessentitycontactPK + " ]";
    }

}
