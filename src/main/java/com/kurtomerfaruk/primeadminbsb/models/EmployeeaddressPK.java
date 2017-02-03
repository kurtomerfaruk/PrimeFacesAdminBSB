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
 * Created on date 27.01.2017 23:11:04
 */
@Embeddable
public class EmployeeaddressPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeID")
    private int employeeID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AddressID")
    private int addressID;

    public EmployeeaddressPK() {
    }

    public EmployeeaddressPK(int employeeID, int addressID) {
        this.employeeID = employeeID;
        this.addressID = addressID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) employeeID;
        hash += (int) addressID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeaddressPK)) {
            return false;
        }
        EmployeeaddressPK other = (EmployeeaddressPK) object;
        if (this.employeeID != other.employeeID) {
            return false;
        }
        if (this.addressID != other.addressID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.EmployeeaddressPK[ employeeID=" + employeeID + ", addressID=" + addressID + " ]";
    }

}
