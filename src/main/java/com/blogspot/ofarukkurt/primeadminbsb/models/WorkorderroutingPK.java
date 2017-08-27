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
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class WorkorderroutingPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "WorkOrderID")
    private int workOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OperationSequence")
    private short operationSequence;

    public WorkorderroutingPK() {
    }

    public WorkorderroutingPK(int workOrderID, int productID, short operationSequence) {
        this.workOrderID = workOrderID;
        this.productID = productID;
        this.operationSequence = operationSequence;
    }

    public int getWorkOrderID() {
        return workOrderID;
    }

    public void setWorkOrderID(int workOrderID) {
        this.workOrderID = workOrderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public short getOperationSequence() {
        return operationSequence;
    }

    public void setOperationSequence(short operationSequence) {
        this.operationSequence = operationSequence;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) workOrderID;
        hash += (int) productID;
        hash += (int) operationSequence;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkorderroutingPK)) {
            return false;
        }
        WorkorderroutingPK other = (WorkorderroutingPK) object;
        if (this.workOrderID != other.workOrderID) {
            return false;
        }
        if (this.productID != other.productID) {
            return false;
        }
        if (this.operationSequence != other.operationSequence) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.WorkorderroutingPK[ workOrderID=" + workOrderID + ", productID=" + productID + ", operationSequence=" + operationSequence + " ]";
    }

}
