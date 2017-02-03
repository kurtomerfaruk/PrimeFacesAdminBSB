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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "salesperson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesperson.findAll", query = "SELECT s FROM Salesperson s"),
    @NamedQuery(name = "Salesperson.findBySalesPersonID", query = "SELECT s FROM Salesperson s WHERE s.salesPersonID = :salesPersonID"),
    @NamedQuery(name = "Salesperson.findByTerritoryID", query = "SELECT s FROM Salesperson s WHERE s.territoryID = :territoryID"),
    @NamedQuery(name = "Salesperson.findBySalesQuota", query = "SELECT s FROM Salesperson s WHERE s.salesQuota = :salesQuota"),
    @NamedQuery(name = "Salesperson.findByBonus", query = "SELECT s FROM Salesperson s WHERE s.bonus = :bonus"),
    @NamedQuery(name = "Salesperson.findByCommissionPct", query = "SELECT s FROM Salesperson s WHERE s.commissionPct = :commissionPct"),
    @NamedQuery(name = "Salesperson.findBySalesYTD", query = "SELECT s FROM Salesperson s WHERE s.salesYTD = :salesYTD"),
    @NamedQuery(name = "Salesperson.findBySalesLastYear", query = "SELECT s FROM Salesperson s WHERE s.salesLastYear = :salesLastYear"),
    @NamedQuery(name = "Salesperson.findByModifiedDate", query = "SELECT s FROM Salesperson s WHERE s.modifiedDate = :modifiedDate")})
public class Salesperson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesPersonID")
    private Integer salesPersonID;
    @Column(name = "TerritoryID")
    private Integer territoryID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SalesQuota")
    private Double salesQuota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bonus")
    private double bonus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CommissionPct")
    private double commissionPct;
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
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Salesperson() {
    }

    public Salesperson(Integer salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public Salesperson(Integer salesPersonID, double bonus, double commissionPct, double salesYTD, double salesLastYear, byte[] rowguid, Date modifiedDate) {
        this.salesPersonID = salesPersonID;
        this.bonus = bonus;
        this.commissionPct = commissionPct;
        this.salesYTD = salesYTD;
        this.salesLastYear = salesLastYear;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(Integer salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public Integer getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Integer territoryID) {
        this.territoryID = territoryID;
    }

    public Double getSalesQuota() {
        return salesQuota;
    }

    public void setSalesQuota(Double salesQuota) {
        this.salesQuota = salesQuota;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(double commissionPct) {
        this.commissionPct = commissionPct;
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
        hash += (salesPersonID != null ? salesPersonID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesperson)) {
            return false;
        }
        Salesperson other = (Salesperson) object;
        if ((this.salesPersonID == null && other.salesPersonID != null) || (this.salesPersonID != null && !this.salesPersonID.equals(other.salesPersonID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Salesperson[ salesPersonID=" + salesPersonID + " ]";
    }

}
