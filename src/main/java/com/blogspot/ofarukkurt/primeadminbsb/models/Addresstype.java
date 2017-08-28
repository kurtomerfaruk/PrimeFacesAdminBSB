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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "addresstype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Addresstype.findAll", query = "SELECT a FROM Addresstype a")
    ,
    @NamedQuery(name = "Addresstype.findByAddressTypeID", query = "SELECT a FROM Addresstype a WHERE a.addressTypeID = :addressTypeID")
    ,
    @NamedQuery(name = "Addresstype.findByName", query = "SELECT a FROM Addresstype a WHERE a.name = :name")
    ,
    @NamedQuery(name = "Addresstype.findByModifiedDate", query = "SELECT a FROM Addresstype a WHERE a.modifiedDate = :modifiedDate")})
public class Addresstype extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AddressTypeID")
    private Integer addressTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addresstype")
    private List<Businessentityaddress> businessentityaddressList;

    public Addresstype() {
    }

    public Addresstype(Integer addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    public Addresstype(Integer addressTypeID, String name) {
        this.addressTypeID = addressTypeID;
        this.name = name;
    }

    public Integer getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(Integer addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Businessentityaddress> getBusinessentityaddressList() {
        return businessentityaddressList;
    }

    public void setBusinessentityaddressList(List<Businessentityaddress> businessentityaddressList) {
        this.businessentityaddressList = businessentityaddressList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressTypeID != null ? addressTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addresstype)) {
            return false;
        }
        Addresstype other = (Addresstype) object;
        if ((this.addressTypeID == null && other.addressTypeID != null) || (this.addressTypeID != null && !this.addressTypeID.equals(other.addressTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Addresstype[ addressTypeID=" + addressTypeID + " ]";
    }

}
