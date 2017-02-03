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
 * Created on date 27.01.2017 23:11:03
 */
@Embeddable
public class EmployeedepartmenthistoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeID")
    private int employeeID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DepartmentID")
    private short departmentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShiftID")
    private short shiftID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    public EmployeedepartmenthistoryPK() {
    }

    public EmployeedepartmenthistoryPK(int employeeID, short departmentID, short shiftID, Date startDate) {
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.shiftID = shiftID;
        this.startDate = startDate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public short getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(short departmentID) {
        this.departmentID = departmentID;
    }

    public short getShiftID() {
        return shiftID;
    }

    public void setShiftID(short shiftID) {
        this.shiftID = shiftID;
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
        hash += (int) employeeID;
        hash += (int) departmentID;
        hash += (int) shiftID;
        hash += (startDate != null ? startDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeedepartmenthistoryPK)) {
            return false;
        }
        EmployeedepartmenthistoryPK other = (EmployeedepartmenthistoryPK) object;
        if (this.employeeID != other.employeeID) {
            return false;
        }
        if (this.departmentID != other.departmentID) {
            return false;
        }
        if (this.shiftID != other.shiftID) {
            return false;
        }
        if ((this.startDate == null && other.startDate != null) || (this.startDate != null && !this.startDate.equals(other.startDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.EmployeedepartmenthistoryPK[ employeeID=" + employeeID + ", departmentID=" + departmentID + ", shiftID=" + shiftID + ", startDate=" + startDate + " ]";
    }

}
