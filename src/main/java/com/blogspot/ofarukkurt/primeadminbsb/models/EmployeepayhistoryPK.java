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
public class EmployeepayhistoryPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RateChangeDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rateChangeDate;

    public EmployeepayhistoryPK() {
    }

    public EmployeepayhistoryPK(int businessEntityID, Date rateChangeDate) {
        this.businessEntityID = businessEntityID;
        this.rateChangeDate = rateChangeDate;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Date getRateChangeDate() {
        return rateChangeDate;
    }

    public void setRateChangeDate(Date rateChangeDate) {
        this.rateChangeDate = rateChangeDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) businessEntityID;
        hash += (rateChangeDate != null ? rateChangeDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeepayhistoryPK)) {
            return false;
        }
        EmployeepayhistoryPK other = (EmployeepayhistoryPK) object;
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if ((this.rateChangeDate == null && other.rateChangeDate != null) || (this.rateChangeDate != null && !this.rateChangeDate.equals(other.rateChangeDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.EmployeepayhistoryPK[ businessEntityID=" + businessEntityID + ", rateChangeDate=" + rateChangeDate + " ]";
    }

}
