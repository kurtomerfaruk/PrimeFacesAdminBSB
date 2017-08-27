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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "salesperson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesperson.findAll", query = "SELECT s FROM Salesperson s"),
    @NamedQuery(name = "Salesperson.findByBusinessEntityID", query = "SELECT s FROM Salesperson s WHERE s.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Salesperson.findBySalesQuota", query = "SELECT s FROM Salesperson s WHERE s.salesQuota = :salesQuota"),
    @NamedQuery(name = "Salesperson.findByBonus", query = "SELECT s FROM Salesperson s WHERE s.bonus = :bonus"),
    @NamedQuery(name = "Salesperson.findByCommissionPct", query = "SELECT s FROM Salesperson s WHERE s.commissionPct = :commissionPct"),
    @NamedQuery(name = "Salesperson.findBySalesYTD", query = "SELECT s FROM Salesperson s WHERE s.salesYTD = :salesYTD"),
    @NamedQuery(name = "Salesperson.findBySalesLastYear", query = "SELECT s FROM Salesperson s WHERE s.salesLastYear = :salesLastYear"),
    @NamedQuery(name = "Salesperson.findByRowguid", query = "SELECT s FROM Salesperson s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Salesperson.findByModifiedDate", query = "SELECT s FROM Salesperson s WHERE s.modifiedDate = :modifiedDate")})
public class Salesperson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SalesQuota")
    private BigDecimal salesQuota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bonus")
    private BigDecimal bonus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CommissionPct")
    private BigDecimal commissionPct;
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
    @Size(min = 1, max = 64)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(mappedBy = "salesPersonID")
    private List<Store> storeList;
    @JoinColumn(name = "TerritoryID", referencedColumnName = "TerritoryID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Salesterritory territoryID;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesperson")
    private List<Salespersonquotahistory> salespersonquotahistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesperson")
    private List<Salesterritoryhistory> salesterritoryhistoryList;
    @OneToMany(mappedBy = "salesPersonID")
    private List<Salesorderheader> salesorderheaderList;

    public Salesperson() {
    }

    public Salesperson(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Salesperson(Integer businessEntityID, BigDecimal bonus, BigDecimal commissionPct, BigDecimal salesYTD, BigDecimal salesLastYear, String rowguid, Date modifiedDate) {
        this.businessEntityID = businessEntityID;
        this.bonus = bonus;
        this.commissionPct = commissionPct;
        this.salesYTD = salesYTD;
        this.salesLastYear = salesLastYear;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public BigDecimal getSalesQuota() {
        return salesQuota;
    }

    public void setSalesQuota(BigDecimal salesQuota) {
        this.salesQuota = salesQuota;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
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
    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public Salesterritory getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Salesterritory territoryID) {
        this.territoryID = territoryID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @XmlTransient
    public List<Salespersonquotahistory> getSalespersonquotahistoryList() {
        return salespersonquotahistoryList;
    }

    public void setSalespersonquotahistoryList(List<Salespersonquotahistory> salespersonquotahistoryList) {
        this.salespersonquotahistoryList = salespersonquotahistoryList;
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
        hash += (businessEntityID != null ? businessEntityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesperson)) {
            return false;
        }
        Salesperson other = (Salesperson) object;
        if ((this.businessEntityID == null && other.businessEntityID != null) || (this.businessEntityID != null && !this.businessEntityID.equals(other.businessEntityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Salesperson[ businessEntityID=" + businessEntityID + " ]";
    }

}
