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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
 * Created on date 27.01.2017 23:11:05
 */
@Entity
@Table(name = "salespersonquotahistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salespersonquotahistory.findAll", query = "SELECT s FROM Salespersonquotahistory s"),
    @NamedQuery(name = "Salespersonquotahistory.findBySalesPersonID", query = "SELECT s FROM Salespersonquotahistory s WHERE s.salespersonquotahistoryPK.salesPersonID = :salesPersonID"),
    @NamedQuery(name = "Salespersonquotahistory.findByQuotaDate", query = "SELECT s FROM Salespersonquotahistory s WHERE s.salespersonquotahistoryPK.quotaDate = :quotaDate"),
    @NamedQuery(name = "Salespersonquotahistory.findBySalesQuota", query = "SELECT s FROM Salespersonquotahistory s WHERE s.salesQuota = :salesQuota"),
    @NamedQuery(name = "Salespersonquotahistory.findByModifiedDate", query = "SELECT s FROM Salespersonquotahistory s WHERE s.modifiedDate = :modifiedDate")})
public class Salespersonquotahistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalespersonquotahistoryPK salespersonquotahistoryPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesQuota")
    private double salesQuota;
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

    public Salespersonquotahistory() {
    }

    public Salespersonquotahistory(SalespersonquotahistoryPK salespersonquotahistoryPK) {
        this.salespersonquotahistoryPK = salespersonquotahistoryPK;
    }

    public Salespersonquotahistory(SalespersonquotahistoryPK salespersonquotahistoryPK, double salesQuota, byte[] rowguid, Date modifiedDate) {
        this.salespersonquotahistoryPK = salespersonquotahistoryPK;
        this.salesQuota = salesQuota;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Salespersonquotahistory(int salesPersonID, Date quotaDate) {
        this.salespersonquotahistoryPK = new SalespersonquotahistoryPK(salesPersonID, quotaDate);
    }

    public SalespersonquotahistoryPK getSalespersonquotahistoryPK() {
        return salespersonquotahistoryPK;
    }

    public void setSalespersonquotahistoryPK(SalespersonquotahistoryPK salespersonquotahistoryPK) {
        this.salespersonquotahistoryPK = salespersonquotahistoryPK;
    }

    public double getSalesQuota() {
        return salesQuota;
    }

    public void setSalesQuota(double salesQuota) {
        this.salesQuota = salesQuota;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Salespersonquotahistory[ salespersonquotahistoryPK=" + salespersonquotahistoryPK + " ]";
    }

}
