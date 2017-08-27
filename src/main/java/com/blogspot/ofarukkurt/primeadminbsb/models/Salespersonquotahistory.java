/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "salespersonquotahistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salespersonquotahistory.findAll", query = "SELECT s FROM Salespersonquotahistory s"),
    @NamedQuery(name = "Salespersonquotahistory.findByBusinessEntityID", query = "SELECT s FROM Salespersonquotahistory s WHERE s.salespersonquotahistoryPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Salespersonquotahistory.findByQuotaDate", query = "SELECT s FROM Salespersonquotahistory s WHERE s.salespersonquotahistoryPK.quotaDate = :quotaDate"),
    @NamedQuery(name = "Salespersonquotahistory.findBySalesQuota", query = "SELECT s FROM Salespersonquotahistory s WHERE s.salesQuota = :salesQuota"),
    @NamedQuery(name = "Salespersonquotahistory.findByRowguid", query = "SELECT s FROM Salespersonquotahistory s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Salespersonquotahistory.findByModifiedDate", query = "SELECT s FROM Salespersonquotahistory s WHERE s.modifiedDate = :modifiedDate")})
public class Salespersonquotahistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalespersonquotahistoryPK salespersonquotahistoryPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesQuota")
    private BigDecimal salesQuota;
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
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Salesperson salesperson;

    public Salespersonquotahistory() {
    }

    public Salespersonquotahistory(SalespersonquotahistoryPK salespersonquotahistoryPK) {
        this.salespersonquotahistoryPK = salespersonquotahistoryPK;
    }

    public Salespersonquotahistory(SalespersonquotahistoryPK salespersonquotahistoryPK, BigDecimal salesQuota, String rowguid, Date modifiedDate) {
        this.salespersonquotahistoryPK = salespersonquotahistoryPK;
        this.salesQuota = salesQuota;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Salespersonquotahistory(int businessEntityID, Date quotaDate) {
        this.salespersonquotahistoryPK = new SalespersonquotahistoryPK(businessEntityID, quotaDate);
    }

    public SalespersonquotahistoryPK getSalespersonquotahistoryPK() {
        return salespersonquotahistoryPK;
    }

    public void setSalespersonquotahistoryPK(SalespersonquotahistoryPK salespersonquotahistoryPK) {
        this.salespersonquotahistoryPK = salespersonquotahistoryPK;
    }

    public BigDecimal getSalesQuota() {
        return salesQuota;
    }

    public void setSalesQuota(BigDecimal salesQuota) {
        this.salesQuota = salesQuota;
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

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salespersonquotahistoryPK != null ? salespersonquotahistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salespersonquotahistory)) {
            return false;
        }
        Salespersonquotahistory other = (Salespersonquotahistory) object;
        if ((this.salespersonquotahistoryPK == null && other.salespersonquotahistoryPK != null) || (this.salespersonquotahistoryPK != null && !this.salespersonquotahistoryPK.equals(other.salespersonquotahistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Salespersonquotahistory[ salespersonquotahistoryPK=" + salespersonquotahistoryPK + " ]";
    }

}
