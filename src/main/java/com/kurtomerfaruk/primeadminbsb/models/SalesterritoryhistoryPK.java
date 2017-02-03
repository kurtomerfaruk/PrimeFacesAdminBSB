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
public class SalesterritoryhistoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesPersonID")
    private int salesPersonID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TerritoryID")
    private int territoryID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    public SalesterritoryhistoryPK() {
    }

    public SalesterritoryhistoryPK(int salesPersonID, int territoryID, Date startDate) {
        this.salesPersonID = salesPersonID;
        this.territoryID = territoryID;
        this.startDate = startDate;
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(int salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public int getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(int territoryID) {
        this.territoryID = territoryID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) salesPersonID;
        hash += (int) territoryID;
        hash += (startDate != null ? startDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesterritoryhistoryPK)) {
            return false;
        }
        SalesterritoryhistoryPK other = (SalesterritoryhistoryPK) object;
        if (this.salesPersonID != other.salesPersonID) {
            return false;
        }
        if (this.territoryID != other.territoryID) {
            return false;
        }
        if ((this.startDate == null && other.startDate != null) || (this.startDate != null && !this.startDate.equals(other.startDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.SalesterritoryhistoryPK[ salesPersonID=" + salesPersonID + ", territoryID=" + territoryID + ", startDate=" + startDate + " ]";
    }

}
