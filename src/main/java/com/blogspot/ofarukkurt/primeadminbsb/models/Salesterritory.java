/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "salesterritory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesterritory.findAll", query = "SELECT s FROM Salesterritory s"),
    @NamedQuery(name = "Salesterritory.findByTerritoryID", query = "SELECT s FROM Salesterritory s WHERE s.territoryID = :territoryID"),
    @NamedQuery(name = "Salesterritory.findByName", query = "SELECT s FROM Salesterritory s WHERE s.name = :name"),
    @NamedQuery(name = "Salesterritory.findByGroup", query = "SELECT s FROM Salesterritory s WHERE s.group = :group"),
    @NamedQuery(name = "Salesterritory.findBySalesYTD", query = "SELECT s FROM Salesterritory s WHERE s.salesYTD = :salesYTD"),
    @NamedQuery(name = "Salesterritory.findBySalesLastYear", query = "SELECT s FROM Salesterritory s WHERE s.salesLastYear = :salesLastYear"),
    @NamedQuery(name = "Salesterritory.findByCostYTD", query = "SELECT s FROM Salesterritory s WHERE s.costYTD = :costYTD"),
    @NamedQuery(name = "Salesterritory.findByCostLastYear", query = "SELECT s FROM Salesterritory s WHERE s.costLastYear = :costLastYear"),
    @NamedQuery(name = "Salesterritory.findByRowguid", query = "SELECT s FROM Salesterritory s WHERE s.rowguid = :rowguid"),
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
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Group")
    private String group;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesYTD")
    private BigDecimal salesYTD;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesLastYear")
    private BigDecimal salesLastYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CostYTD")
    private BigDecimal costYTD;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CostLastYear")
    private BigDecimal costLastYear;
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
    @JoinColumn(name = "CountryRegionCode", referencedColumnName = "CountryRegionCode")
    @ManyToOne(optional = false)
    private Countryregion countryRegionCode;
    @OneToMany(mappedBy = "territoryID")
    private List<Customer> customerList;
    @OneToMany(mappedBy = "territoryID")
    private List<Salesperson> salespersonList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "territoryID")
    private List<Stateprovince> stateprovinceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesterritory")
    private List<Salesterritoryhistory> salesterritoryhistoryList;
    @OneToMany(mappedBy = "territoryID")
    private List<Salesorderheader> salesorderheaderList;

    public Salesterritory() {
    }

    public Salesterritory(Integer territoryID) {
        this.territoryID = territoryID;
    }

    public Salesterritory(Integer territoryID, String name, String group, BigDecimal salesYTD, BigDecimal salesLastYear, BigDecimal costYTD, BigDecimal costLastYear, String rowguid, Date modifiedDate) {
        this.territoryID = territoryID;
        this.name = name;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public BigDecimal getSalesYTD() {
        return salesYTD;
    }

    public void setSalesYTD(BigDecimal salesYTD) {
        this.salesYTD = salesYTD;
    }

    public BigDecimal getSalesLastYear() {
        return salesLastYear;
    }

    public void setSalesLastYear(BigDecimal salesLastYear) {
        this.salesLastYear = salesLastYear;
    }

    public BigDecimal getCostYTD() {
        return costYTD;
    }

    public void setCostYTD(BigDecimal costYTD) {
        this.costYTD = costYTD;
    }

    public BigDecimal getCostLastYear() {
        return costLastYear;
    }

    public void setCostLastYear(BigDecimal costLastYear) {
        this.costLastYear = costLastYear;
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

    public Countryregion getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(Countryregion countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    @XmlTransient
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @XmlTransient
    public List<Salesperson> getSalespersonList() {
        return salespersonList;
    }

    public void setSalespersonList(List<Salesperson> salespersonList) {
        this.salespersonList = salespersonList;
    }

    @XmlTransient
    public List<Stateprovince> getStateprovinceList() {
        return stateprovinceList;
    }

    public void setStateprovinceList(List<Stateprovince> stateprovinceList) {
        this.stateprovinceList = stateprovinceList;
    }

    @XmlTransient
    public List<Salesterritoryhistory> getSalesterritoryhistoryList() {
        return salesterritoryhistoryList;
    }

    public void setSalesterritoryhistoryList(List<Salesterritoryhistory> salesterritoryhistoryList) {
        this.salesterritoryhistoryList = salesterritoryhistoryList;
    }

    @XmlTransient
    public List<Salesorderheader> getSalesorderheaderList() {
        return salesorderheaderList;
    }

    public void setSalesorderheaderList(List<Salesorderheader> salesorderheaderList) {
        this.salesorderheaderList = salesorderheaderList;
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Salesterritory[ territoryID=" + territoryID + " ]";
    }

}
