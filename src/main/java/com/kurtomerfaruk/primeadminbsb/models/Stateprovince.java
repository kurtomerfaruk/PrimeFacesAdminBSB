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
import javax.persistence.Lob;
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
@Table(name = "stateprovince")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stateprovince.findAll", query = "SELECT s FROM Stateprovince s"),
    @NamedQuery(name = "Stateprovince.findByStateProvinceID", query = "SELECT s FROM Stateprovince s WHERE s.stateProvinceID = :stateProvinceID"),
    @NamedQuery(name = "Stateprovince.findByStateProvinceCode", query = "SELECT s FROM Stateprovince s WHERE s.stateProvinceCode = :stateProvinceCode"),
    @NamedQuery(name = "Stateprovince.findByCountryRegionCode", query = "SELECT s FROM Stateprovince s WHERE s.countryRegionCode = :countryRegionCode"),
    @NamedQuery(name = "Stateprovince.findByIsOnlyStateProvinceFlag", query = "SELECT s FROM Stateprovince s WHERE s.isOnlyStateProvinceFlag = :isOnlyStateProvinceFlag"),
    @NamedQuery(name = "Stateprovince.findByName", query = "SELECT s FROM Stateprovince s WHERE s.name = :name"),
    @NamedQuery(name = "Stateprovince.findByTerritoryID", query = "SELECT s FROM Stateprovince s WHERE s.territoryID = :territoryID"),
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
    @Size(min = 1, max = 3)
    @Column(name = "CountryRegionCode")
    private String countryRegionCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsOnlyStateProvinceFlag")
    private boolean isOnlyStateProvinceFlag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TerritoryID")
    private int territoryID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Stateprovince() {
    }

    public Stateprovince(Integer stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    public Stateprovince(Integer stateProvinceID, String stateProvinceCode, String countryRegionCode, boolean isOnlyStateProvinceFlag, String name, int territoryID, byte[] rowguid, Date modifiedDate) {
        this.stateProvinceID = stateProvinceID;
        this.stateProvinceCode = stateProvinceCode;
        this.countryRegionCode = countryRegionCode;
        this.isOnlyStateProvinceFlag = isOnlyStateProvinceFlag;
        this.name = name;
        this.territoryID = territoryID;
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

    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
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

    public int getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(int territoryID) {
        this.territoryID = territoryID;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Stateprovince[ stateProvinceID=" + stateProvinceID + " ]";
    }

}
