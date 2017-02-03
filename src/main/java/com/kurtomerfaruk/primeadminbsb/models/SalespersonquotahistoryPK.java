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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:05
 */
@Embeddable
public class SalespersonquotahistoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesPersonID")
    private int salesPersonID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QuotaDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date quotaDate;

    public SalespersonquotahistoryPK() {
    }

    public SalespersonquotahistoryPK(int salesPersonID, Date quotaDate) {
        this.salesPersonID = salesPersonID;
        this.quotaDate = quotaDate;
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(int salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public Date getQuotaDate() {
        return quotaDate;
    }

    public void setQuotaDate(Date quotaDate) {
        this.quotaDate = quotaDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) salesPersonID;
        hash += (quotaDate != null ? quotaDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalespersonquotahistoryPK)) {
            return false;
        }
        SalespersonquotahistoryPK other = (SalespersonquotahistoryPK) object;
        if (this.salesPersonID != other.salesPersonID) {
            return false;
        }
        if ((this.quotaDate == null && other.quotaDate != null) || (this.quotaDate != null && !this.quotaDate.equals(other.quotaDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.SalespersonquotahistoryPK[ salesPersonID=" + salesPersonID + ", quotaDate=" + quotaDate + " ]";
    }

}
