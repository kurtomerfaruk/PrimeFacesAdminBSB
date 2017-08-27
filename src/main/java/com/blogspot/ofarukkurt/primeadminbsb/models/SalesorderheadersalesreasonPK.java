/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class SalesorderheadersalesreasonPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesOrderID")
    private int salesOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesReasonID")
    private int salesReasonID;

    public SalesorderheadersalesreasonPK() {
    }

    public SalesorderheadersalesreasonPK(int salesOrderID, int salesReasonID) {
        this.salesOrderID = salesOrderID;
        this.salesReasonID = salesReasonID;
    }

    public int getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(int salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public int getSalesReasonID() {
        return salesReasonID;
    }

    public void setSalesReasonID(int salesReasonID) {
        this.salesReasonID = salesReasonID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) salesOrderID;
        hash += (int) salesReasonID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesorderheadersalesreasonPK)) {
            return false;
        }
        SalesorderheadersalesreasonPK other = (SalesorderheadersalesreasonPK) object;
        if (this.salesOrderID != other.salesOrderID) {
            return false;
        }
        if (this.salesReasonID != other.salesReasonID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.SalesorderheadersalesreasonPK[ salesOrderID=" + salesOrderID + ", salesReasonID=" + salesReasonID + " ]";
    }

}
