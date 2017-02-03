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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:05
 */
@Entity
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByEmployeeID", query = "SELECT e FROM Employee e WHERE e.employeeID = :employeeID"),
    @NamedQuery(name = "Employee.findByNationalIDNumber", query = "SELECT e FROM Employee e WHERE e.nationalIDNumber = :nationalIDNumber"),
    @NamedQuery(name = "Employee.findByContactID", query = "SELECT e FROM Employee e WHERE e.contactID = :contactID"),
    @NamedQuery(name = "Employee.findByLoginID", query = "SELECT e FROM Employee e WHERE e.loginID = :loginID"),
    @NamedQuery(name = "Employee.findByManagerID", query = "SELECT e FROM Employee e WHERE e.managerID = :managerID"),
    @NamedQuery(name = "Employee.findByTitle", query = "SELECT e FROM Employee e WHERE e.title = :title"),
    @NamedQuery(name = "Employee.findByBirthDate", query = "SELECT e FROM Employee e WHERE e.birthDate = :birthDate"),
    @NamedQuery(name = "Employee.findByMaritalStatus", query = "SELECT e FROM Employee e WHERE e.maritalStatus = :maritalStatus"),
    @NamedQuery(name = "Employee.findByGender", query = "SELECT e FROM Employee e WHERE e.gender = :gender"),
    @NamedQuery(name = "Employee.findByHireDate", query = "SELECT e FROM Employee e WHERE e.hireDate = :hireDate"),
    @NamedQuery(name = "Employee.findBySalariedFlag", query = "SELECT e FROM Employee e WHERE e.salariedFlag = :salariedFlag"),
    @NamedQuery(name = "Employee.findByVacationHours", query = "SELECT e FROM Employee e WHERE e.vacationHours = :vacationHours"),
    @NamedQuery(name = "Employee.findBySickLeaveHours", query = "SELECT e FROM Employee e WHERE e.sickLeaveHours = :sickLeaveHours"),
    @NamedQuery(name = "Employee.findByCurrentFlag", query = "SELECT e FROM Employee e WHERE e.currentFlag = :currentFlag"),
    @NamedQuery(name = "Employee.findByModifiedDate", query = "SELECT e FROM Employee e WHERE e.modifiedDate = :modifiedDate")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeID")
    private Integer employeeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NationalIDNumber")
    private String nationalIDNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactID")
    private int contactID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "LoginID")
    private String loginID;
    @Column(name = "ManagerID")
    private Integer managerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BirthDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "MaritalStatus")
    private String maritalStatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HireDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalariedFlag")
    private boolean salariedFlag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VacationHours")
    private short vacationHours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SickLeaveHours")
    private short sickLeaveHours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CurrentFlag")
    private boolean currentFlag;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Employee() {
    }

    public Employee(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Employee(Integer employeeID, String nationalIDNumber, int contactID, String loginID, String title, Date birthDate, String maritalStatus, String gender, Date hireDate, boolean salariedFlag, short vacationHours, short sickLeaveHours, boolean currentFlag, byte[] rowguid, Date modifiedDate) {
        this.employeeID = employeeID;
        this.nationalIDNumber = nationalIDNumber;
        this.contactID = contactID;
        this.loginID = loginID;
        this.title = title;
        this.birthDate = birthDate;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.hireDate = hireDate;
        this.salariedFlag = salariedFlag;
        this.vacationHours = vacationHours;
        this.sickLeaveHours = sickLeaveHours;
        this.currentFlag = currentFlag;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getNationalIDNumber() {
        return nationalIDNumber;
    }

    public void setNationalIDNumber(String nationalIDNumber) {
        this.nationalIDNumber = nationalIDNumber;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public Integer getManagerID() {
        return managerID;
    }

    public void setManagerID(Integer managerID) {
        this.managerID = managerID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public boolean getSalariedFlag() {
        return salariedFlag;
    }

    public void setSalariedFlag(boolean salariedFlag) {
        this.salariedFlag = salariedFlag;
    }

    public short getVacationHours() {
        return vacationHours;
    }

    public void setVacationHours(short vacationHours) {
        this.vacationHours = vacationHours;
    }

    public short getSickLeaveHours() {
        return sickLeaveHours;
    }

    public void setSickLeaveHours(short sickLeaveHours) {
        this.sickLeaveHours = sickLeaveHours;
    }

    public boolean getCurrentFlag() {
        return currentFlag;
    }

    public void setCurrentFlag(boolean currentFlag) {
        this.currentFlag = currentFlag;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
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
        hash += (employeeID != null ? employeeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeID == null && other.employeeID != null) || (this.employeeID != null && !this.employeeID.equals(other.employeeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Employee[ employeeID=" + employeeID + " ]";
    }

}
