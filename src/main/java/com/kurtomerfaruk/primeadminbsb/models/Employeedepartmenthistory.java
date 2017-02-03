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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "employeedepartmenthistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeedepartmenthistory.findAll", query = "SELECT e FROM Employeedepartmenthistory e"),
    @NamedQuery(name = "Employeedepartmenthistory.findByEmployeeID", query = "SELECT e FROM Employeedepartmenthistory e WHERE e.employeedepartmenthistoryPK.employeeID = :employeeID"),
    @NamedQuery(name = "Employeedepartmenthistory.findByDepartmentID", query = "SELECT e FROM Employeedepartmenthistory e WHERE e.employeedepartmenthistoryPK.departmentID = :departmentID"),
    @NamedQuery(name = "Employeedepartmenthistory.findByShiftID", query = "SELECT e FROM Employeedepartmenthistory e WHERE e.employeedepartmenthistoryPK.shiftID = :shiftID"),
    @NamedQuery(name = "Employeedepartmenthistory.findByStartDate", query = "SELECT e FROM Employeedepartmenthistory e WHERE e.employeedepartmenthistoryPK.startDate = :startDate"),
    @NamedQuery(name = "Employeedepartmenthistory.findByEndDate", query = "SELECT e FROM Employeedepartmenthistory e WHERE e.endDate = :endDate"),
    @NamedQuery(name = "Employeedepartmenthistory.findByModifiedDate", query = "SELECT e FROM Employeedepartmenthistory e WHERE e.modifiedDate = :modifiedDate")})
public class Employeedepartmenthistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeedepartmenthistoryPK employeedepartmenthistoryPK;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Employeedepartmenthistory() {
    }

    public Employeedepartmenthistory(EmployeedepartmenthistoryPK employeedepartmenthistoryPK) {
        this.employeedepartmenthistoryPK = employeedepartmenthistoryPK;
    }

    public Employeedepartmenthistory(EmployeedepartmenthistoryPK employeedepartmenthistoryPK, Date modifiedDate) {
        this.employeedepartmenthistoryPK = employeedepartmenthistoryPK;
        this.modifiedDate = modifiedDate;
    }

    public Employeedepartmenthistory(int employeeID, short departmentID, short shiftID, Date startDate) {
        this.employeedepartmenthistoryPK = new EmployeedepartmenthistoryPK(employeeID, departmentID, shiftID, startDate);
    }

    public EmployeedepartmenthistoryPK getEmployeedepartmenthistoryPK() {
        return employeedepartmenthistoryPK;
    }

    public void setEmployeedepartmenthistoryPK(EmployeedepartmenthistoryPK employeedepartmenthistoryPK) {
        this.employeedepartmenthistoryPK = employeedepartmenthistoryPK;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeedepartmenthistoryPK != null ? employeedepartmenthistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeedepartmenthistory)) {
            return false;
        }
        Employeedepartmenthistory other = (Employeedepartmenthistory) object;
        if ((this.employeedepartmenthistoryPK == null && other.employeedepartmenthistoryPK != null) || (this.employeedepartmenthistoryPK != null && !this.employeedepartmenthistoryPK.equals(other.employeedepartmenthistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Employeedepartmenthistory[ employeedepartmenthistoryPK=" + employeedepartmenthistoryPK + " ]";
    }

}
