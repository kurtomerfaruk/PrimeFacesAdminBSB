/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

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
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class SalespersonquotahistoryPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QuotaDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date quotaDate;

    public SalespersonquotahistoryPK() {
    }

    public SalespersonquotahistoryPK(int businessEntityID, Date quotaDate) {
        this.businessEntityID = businessEntityID;
        this.quotaDate = quotaDate;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
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
        hash += (int) businessEntityID;
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
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if ((this.quotaDate == null && other.quotaDate != null) || (this.quotaDate != null && !this.quotaDate.equals(other.quotaDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.SalespersonquotahistoryPK[ businessEntityID=" + businessEntityID + ", quotaDate=" + quotaDate + " ]";
    }

}
