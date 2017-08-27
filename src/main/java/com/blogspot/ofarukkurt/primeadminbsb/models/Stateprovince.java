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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "stateprovince")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stateprovince.findAll", query = "SELECT s FROM Stateprovince s"),
    @NamedQuery(name = "Stateprovince.findByStateProvinceID", query = "SELECT s FROM Stateprovince s WHERE s.stateProvinceID = :stateProvinceID"),
    @NamedQuery(name = "Stateprovince.findByStateProvinceCode", query = "SELECT s FROM Stateprovince s WHERE s.stateProvinceCode = :stateProvinceCode"),
    @NamedQuery(name = "Stateprovince.findByIsOnlyStateProvinceFlag", query = "SELECT s FROM Stateprovince s WHERE s.isOnlyStateProvinceFlag = :isOnlyStateProvinceFlag"),
    @NamedQuery(name = "Stateprovince.findByName", query = "SELECT s FROM Stateprovince s WHERE s.name = :name"),
    @NamedQuery(name = "Stateprovince.findByRowguid", query = "SELECT s FROM Stateprovince s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Stateprovince.findByModifiedDate", query = "SELECT s FROM Stateprovince s WHERE s.modifiedDate = :modifiedDate")})
public class Stateprovince implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "StateProvinceID")
    private Integer stateProvinceID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "StateProvinceCode")
    private String stateProvinceCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsOnlyStateProvinceFlag")
    private boolean isOnlyStateProvinceFlag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateProvinceID")
    private List<Salestaxrate> salestaxrateList;
    @JoinColumn(name = "TerritoryID", referencedColumnName = "TerritoryID")
    @ManyToOne(optional = false)
    private Salesterritory territoryID;
    @JoinColumn(name = "CountryRegionCode", referencedColumnName = "CountryRegionCode")
    @ManyToOne(optional = false)
    private Countryregion countryRegionCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateProvinceID")
    private List<Address> addressList;

    public Stateprovince() {
    }

    public Stateprovince(Integer stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    public Stateprovince(Integer stateProvinceID, String stateProvinceCode, boolean isOnlyStateProvinceFlag, String name, String rowguid, Date modifiedDate) {
        this.stateProvinceID = stateProvinceID;
        this.stateProvinceCode = stateProvinceCode;
        this.isOnlyStateProvinceFlag = isOnlyStateProvinceFlag;
        this.name = name;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getStateProvinceID() {
        return stateProvinceID;
    }

    public void setStateProvinceID(Integer stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public boolean getIsOnlyStateProvinceFlag() {
        return isOnlyStateProvinceFlag;
    }

    public void setIsOnlyStateProvinceFlag(boolean isOnlyStateProvinceFlag) {
        this.isOnlyStateProvinceFlag = isOnlyStateProvinceFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @XmlTransient
    public List<Salestaxrate> getSalestaxrateList() {
        return salestaxrateList;
    }

    public void setSalestaxrateList(List<Salestaxrate> salestaxrateList) {
        this.salestaxrateList = salestaxrateList;
    }

    public Salesterritory getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Salesterritory territoryID) {
        this.territoryID = territoryID;
    }

    public Countryregion getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(Countryregion countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    @XmlTransient
    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateProvinceID != null ? stateProvinceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stateprovince)) {
            return false;
        }
        Stateprovince other = (Stateprovince) object;
        if ((this.stateProvinceID == null && other.stateProvinceID != null) || (this.stateProvinceID != null && !this.stateProvinceID.equals(other.stateProvinceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Stateprovince[ stateProvinceID=" + stateProvinceID + " ]";
    }

}
