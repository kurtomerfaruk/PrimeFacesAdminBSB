package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:19 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "businessentity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Businessentity.findAll", query = "SELECT b FROM Businessentity b"),
    @NamedQuery(name = "Businessentity.findByBusinessEntityID", query = "SELECT b FROM Businessentity b WHERE b.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Businessentity.findByModifiedDate", query = "SELECT b FROM Businessentity b WHERE b.modifiedDate = :modifiedDate")})
public class Businessentity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "businessentity")
    private Person person;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "businessentity")
    private Store store;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "businessentity")
    private List<Businessentitycontact> businessentitycontactList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "businessentity")
    private List<Businessentityaddress> businessentityaddressList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "businessentity")
    private Vendor vendor;

    public Businessentity() {
    }

    public Businessentity(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @XmlTransient
    public List<Businessentitycontact> getBusinessentitycontactList() {
        return businessentitycontactList;
    }

    public void setBusinessentitycontactList(List<Businessentitycontact> businessentitycontactList) {
        this.businessentitycontactList = businessentitycontactList;
    }

    @XmlTransient
    public List<Businessentityaddress> getBusinessentityaddressList() {
        return businessentityaddressList;
    }

    public void setBusinessentityaddressList(List<Businessentityaddress> businessentityaddressList) {
        this.businessentityaddressList = businessentityaddressList;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessEntityID != null ? businessEntityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Businessentity)) {
            return false;
        }
        Businessentity other = (Businessentity) object;
        if ((this.businessEntityID == null && other.businessEntityID != null) || (this.businessEntityID != null && !this.businessEntityID.equals(other.businessEntityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Businessentity[ businessEntityID=" + businessEntityID + " ]";
    }

}
