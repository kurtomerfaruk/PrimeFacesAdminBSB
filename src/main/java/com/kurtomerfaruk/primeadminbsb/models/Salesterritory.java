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
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "salesterritory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesterritory.findAll", query = "SELECT s FROM Salesterritory s"),
    @NamedQuery(name = "Salesterritory.findByTerritoryID", query = "SELECT s FROM Salesterritory s WHERE s.territoryID = :territoryID"),
    @NamedQuery(name = "Salesterritory.findByName", query = "SELECT s FROM Salesterritory s WHERE s.name = :name"),
    @NamedQuery(name = "Salesterritory.findByCountryRegionCode", query = "SELECT s FROM Salesterritory s WHERE s.countryRegionCode = :countryRegionCode"),
    @NamedQuery(name = "Salesterritory.findByGroup", query = "SELECT s FROM Salesterritory s WHERE s.group = :group"),
    @NamedQuery(name = "Salesterritory.findBySalesYTD", query = "SELECT s FROM Salesterritory s WHERE s.salesYTD = :salesYTD"),
    @NamedQuery(name = "Salesterritory.findBySalesLastYear", query = "SELECT s FROM Salesterritory s WHERE s.salesLastYear = :salesLastYear"),
    @NamedQuery(name = "Salesterritory.findByCostYTD", query = "SELECT s FROM Salesterritory s WHERE s.costYTD = :costYTD"),
    @NamedQuery(name = "Salesterritory.findByCostLastYear", query = "SELECT s FROM Salesterritory s WHERE s.costLastYear = :costLastYear"),
    @NamedQuery(name = "Salesterritory.findByModifiedDate", query = "SELECT s FROM Salesterritory s WHERE s.modifiedDate = :modifiedDate")})
public class Salesterritory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TerritoryID")
    private Integer territoryID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CountryRegionCode")
    private String countryRegionCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Group")
    private String group;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesYTD")
    private double salesYTD;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesLastYear")
    private double salesLastYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CostYTD")
    private double costYTD;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CostLastYear")
    private double costLastYear;
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

    public Salesterritory() {
    }

    public Salesterritory(Integer territoryID) {
        this.territoryID = territoryID;
    }

    public Salesterritory(Integer territoryID, String name, String countryRegionCode, String group, double salesYTD, double salesLastYear, double costYTD, double costLastYear, byte[] rowguid, Date modifiedDate) {
        this.territoryID = territoryID;
        this.name = name;
        this.countryRegionCode = countryRegionCode;
        this.group = group;
        this.salesYTD = salesYTD;
        this.salesLastYear = salesLastYear;
        this.costYTD = costYTD;
        this.costLastYear = costLastYear;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Integer territoryID) {
        this.territoryID = territoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getSalesYTD() {
        return salesYTD;
    }

    public void setSalesYTD(double salesYTD) {
        this.salesYTD = salesYTD;
    }

    public double getSalesLastYear() {
        return salesLastYear;
    }

    public void setSalesLastYear(double salesLastYear) {
        this.salesLastYear = salesLastYear;
    }

    public double getCostYTD() {
        return costYTD;
    }

    public void setCostYTD(double costYTD) {
        this.costYTD = costYTD;
    }

    public double getCostLastYear() {
        return costLastYear;
    }

    public void setCostLastYear(double costLastYear) {
        this.costLastYear = costLastYear;
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
        hash += (territoryID != null ? territoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesterritory)) {
            return false;
        }
        Salesterritory other = (Salesterritory) object;
        if ((this.territoryID == null && other.territoryID != null) || (this.territoryID != null && !this.territoryID.equals(other.territoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Salesterritory[ territoryID=" + territoryID + " ]";
    }

}
