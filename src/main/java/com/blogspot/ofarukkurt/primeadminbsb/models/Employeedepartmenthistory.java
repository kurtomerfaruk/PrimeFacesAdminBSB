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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "employeedepartmenthistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeedepartmenthistory.findAll", query = "SELECT e FROM Employeedepartmenthistory e"),
    @NamedQuery(name = "Employeedepartmenthistory.findByBusinessEntityID", query = "SELECT e FROM Employeedepartmenthistory e WHERE e.employeedepartmenthistoryPK.businessEntityID = :businessEntityID"),
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
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "ShiftID", referencedColumnName = "ShiftID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shift shift;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Employee employee;
    @JoinColumn(name = "DepartmentID", referencedColumnName = "DepartmentID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Department department;

    public Employeedepartmenthistory() {
    }

    public Employeedepartmenthistory(EmployeedepartmenthistoryPK employeedepartmenthistoryPK) {
        this.employeedepartmenthistoryPK = employeedepartmenthistoryPK;
    }

    public Employeedepartmenthistory(EmployeedepartmenthistoryPK employeedepartmenthistoryPK, Date modifiedDate) {
        this.employeedepartmenthistoryPK = employeedepartmenthistoryPK;
        this.modifiedDate = modifiedDate;
    }

    public Employeedepartmenthistory(int businessEntityID, short departmentID, short shiftID, Date startDate) {
        this.employeedepartmenthistoryPK = new EmployeedepartmenthistoryPK(businessEntityID, departmentID, shiftID, startDate);
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

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Employeedepartmenthistory[ employeedepartmenthistoryPK=" + employeedepartmenthistoryPK + " ]";
    }

}
