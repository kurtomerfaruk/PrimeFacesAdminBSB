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
public class SalesterritoryhistoryPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
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

    public SalesterritoryhistoryPK(int businessEntityID, int territoryID, Date startDate) {
        this.businessEntityID = businessEntityID;
        this.territoryID = territoryID;
        this.startDate = startDate;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
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
        hash += (int) businessEntityID;
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
        if (this.businessEntityID != other.businessEntityID) {
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.SalesterritoryhistoryPK[ businessEntityID=" + businessEntityID + ", territoryID=" + territoryID + ", startDate=" + startDate + " ]";
    }

}
