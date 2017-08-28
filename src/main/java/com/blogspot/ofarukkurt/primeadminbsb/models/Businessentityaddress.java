package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "businessentityaddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Businessentityaddress.findAll", query = "SELECT b FROM Businessentityaddress b"),
    @NamedQuery(name = "Businessentityaddress.findByModifiedDate", query = "SELECT b FROM Businessentityaddress b WHERE b.modifiedDate = :modifiedDate")})
public class Businessentityaddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BusinessEntityAddressID")
    private Integer businessEntityAddressID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Businessentity businessentity;
    @JoinColumn(name = "AddressID", referencedColumnName = "AddressID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Address address;
    @JoinColumn(name = "AddressTypeID", referencedColumnName = "AddressTypeID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Addresstype addresstype;

    public Businessentityaddress() {
    }

    public Businessentityaddress(Integer businessEntityAddressID) {
        this.businessEntityAddressID = businessEntityAddressID;
    }

    public Businessentityaddress(Integer businessEntityAddressID, Date modifiedDate) {
        this.businessEntityAddressID = businessEntityAddressID;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBusinessEntityAddressID() {
        return businessEntityAddressID;
    }

    public void setBusinessEntityAddressID(Integer businessEntityAddressID) {
        this.businessEntityAddressID = businessEntityAddressID;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Businessentity getBusinessentity() {
        return businessentity;
    }

    public void setBusinessentity(Businessentity businessentity) {
        this.businessentity = businessentity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Addresstype getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(Addresstype addresstype) {
        this.addresstype = addresstype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessEntityAddressID != null ? businessEntityAddressID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Businessentityaddress)) {
            return false;
        }
        Businessentityaddress other = (Businessentityaddress) object;
        if ((this.businessEntityAddressID == null && other.businessEntityAddressID != null) || (this.businessEntityAddressID != null && !this.businessEntityAddressID.equals(other.businessEntityAddressID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Businessentityaddress[ businessEntityAddressID=" + businessEntityAddressID + " ]";
    }

}
