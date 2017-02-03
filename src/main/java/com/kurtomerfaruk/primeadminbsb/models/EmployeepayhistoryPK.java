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
public class EmployeepayhistoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeID")
    private int employeeID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RateChangeDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rateChangeDate;

    public EmployeepayhistoryPK() {
    }

    public EmployeepayhistoryPK(int employeeID, Date rateChangeDate) {
        this.employeeID = employeeID;
        this.rateChangeDate = rateChangeDate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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
        hash += (int) employeeID;
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
        if (this.employeeID != other.employeeID) {
            return false;
        }
        if ((this.rateChangeDate == null && other.rateChangeDate != null) || (this.rateChangeDate != null && !this.rateChangeDate.equals(other.rateChangeDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.EmployeepayhistoryPK[ employeeID=" + employeeID + ", rateChangeDate=" + rateChangeDate + " ]";
    }

}
