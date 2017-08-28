package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
 * @Created on date 10/08/2017 19:30:22
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a")
    ,
    @NamedQuery(name = "Address.findByAddressID", query = "SELECT a FROM Address a WHERE a.addressID = :addressID")
    ,
    @NamedQuery(name = "Address.findByAddressLine1", query = "SELECT a FROM Address a WHERE a.addressLine1 = :addressLine1")
    ,
    @NamedQuery(name = "Address.findByAddressLine2", query = "SELECT a FROM Address a WHERE a.addressLine2 = :addressLine2")
    ,
    @NamedQuery(name = "Address.findByCity", query = "SELECT a FROM Address a WHERE a.city = :city")
    ,
    @NamedQuery(name = "Address.findByPostalCode", query = "SELECT a FROM Address a WHERE a.postalCode = :postalCode")
    ,
    @NamedQuery(name = "Address.findByModifiedDate", query = "SELECT a FROM Address a WHERE a.modifiedDate = :modifiedDate")})
public class Address extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AddressID")
    private Integer addressID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "AddressLine1")
    private String addressLine1;
    @Size(max = 60)
    @Column(name = "AddressLine2")
    private String addressLine2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "PostalCode")
    private String postalCode;
    @Lob
    @Column(name = "SpatialLocation")
    private byte[] spatialLocation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address",fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Businessentityaddress> businessentityaddressList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipToAddressID",fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Salesorderheader> salesorderheaderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billToAddressID",fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Salesorderheader> salesorderheaderList1;
    @JoinColumn(name = "StateProvinceID", referencedColumnName = "StateProvinceID")
    @ManyToOne(optional = false)
    private Stateprovince stateProvinceID;

    public Address() {
    }

    public Address(Integer addressID) {
        this.addressID = addressID;
    }

    public Address(Integer addressID, String addressLine1, String city, String postalCode) {
        this.addressID = addressID;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Integer getAddressID() {
        return addressID;
    }

    public void setAddressID(Integer addressID) {
        this.addressID = addressID;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public byte[] getSpatialLocation() {
        return spatialLocation;
    }

    public void setSpatialLocation(byte[] spatialLocation) {
        this.spatialLocation = spatialLocation;
    }

    @XmlTransient
    public List<Businessentityaddress> getBusinessentityaddressList() {
        return businessentityaddressList;
    }

    public void setBusinessentityaddressList(List<Businessentityaddress> businessentityaddressList) {
        this.businessentityaddressList = businessentityaddressList;
    }

    @XmlTransient
    public List<Salesorderheader> getSalesorderheaderList() {
        return salesorderheaderList;
    }

    public void setSalesorderheaderList(List<Salesorderheader> salesorderheaderList) {
        this.salesorderheaderList = salesorderheaderList;
    }

    @XmlTransient
    public List<Salesorderheader> getSalesorderheaderList1() {
        return salesorderheaderList1;
    }

    public void setSalesorderheaderList1(List<Salesorderheader> salesorderheaderList1) {
        this.salesorderheaderList1 = salesorderheaderList1;
    }

    public Stateprovince getStateProvinceID() {
        return stateProvinceID;
    }

    public void setStateProvinceID(Stateprovince stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressID != null ? addressID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressID == null && other.addressID != null) || (this.addressID != null && !this.addressID.equals(other.addressID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Address[ addressID=" + addressID + " ]";
    }

}
