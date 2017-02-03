/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
 */
@Embeddable
public class PurchaseorderdetailPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "PurchaseOrderID")
    private int purchaseOrderID;
    @Basic(optional = false)
    @Column(name = "PurchaseOrderDetailID")
    private int purchaseOrderDetailID;

    public PurchaseorderdetailPK() {
    }

    public PurchaseorderdetailPK(int purchaseOrderID, int purchaseOrderDetailID) {
        this.purchaseOrderID = purchaseOrderID;
        this.purchaseOrderDetailID = purchaseOrderDetailID;
    }

    public int getPurchaseOrderID() {
        return purchaseOrderID;
    }

    public void setPurchaseOrderID(int purchaseOrderID) {
        this.purchaseOrderID = purchaseOrderID;
    }

    public int getPurchaseOrderDetailID() {
        return purchaseOrderDetailID;
    }

    public void setPurchaseOrderDetailID(int purchaseOrderDetailID) {
        this.purchaseOrderDetailID = purchaseOrderDetailID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) purchaseOrderID;
        hash += (int) purchaseOrderDetailID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseorderdetailPK)) {
            return false;
        }
        PurchaseorderdetailPK other = (PurchaseorderdetailPK) object;
        if (this.purchaseOrderID != other.purchaseOrderID) {
            return false;
        }
        if (this.purchaseOrderDetailID != other.purchaseOrderDetailID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.PurchaseorderdetailPK[ purchaseOrderID=" + purchaseOrderID + ", purchaseOrderDetailID=" + purchaseOrderDetailID + " ]";
    }

}
