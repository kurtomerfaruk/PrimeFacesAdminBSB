package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByBusinessEntityID", query = "SELECT e FROM Employee e WHERE e.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Employee.findByNationalIDNumber", query = "SELECT e FROM Employee e WHERE e.nationalIDNumber = :nationalIDNumber"),
    @NamedQuery(name = "Employee.findByLoginID", query = "SELECT e FROM Employee e WHERE e.loginID = :loginID"),
    @NamedQuery(name = "Employee.findByOrganizationNode", query = "SELECT e FROM Employee e WHERE e.organizationNode = :organizationNode"),
    @NamedQuery(name = "Employee.findByOrganizationLevel", query = "SELECT e FROM Employee e WHERE e.organizationLevel = :organizationLevel"),
    @NamedQuery(name = "Employee.findByJobTitle", query = "SELECT e FROM Employee e WHERE e.jobTitle = :jobTitle"),
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
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NationalIDNumber")
    private String nationalIDNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "LoginID")
    private String loginID;
    @Size(max = 255)
    @Column(name = "OrganizationNode")
    private String organizationNode;
    @Column(name = "OrganizationLevel")
    private Short organizationLevel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "JobTitle")
    private String jobTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BirthDate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaritalStatus")
    private Character maritalStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gender")
    private Character gender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HireDate")
    @Temporal(TemporalType.DATE)
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
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeID")
    private List<Purchaseorderheader> purchaseorderheaderList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Salesperson salesperson;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private List<Employeedepartmenthistory> employeedepartmenthistoryList;
    @OneToMany(mappedBy = "businessEntityID")
    private List<Jobcandidate> jobcandidateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Document> documentList;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Person person;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private List<Employeepayhistory> employeepayhistoryList;

    public Employee() {
    }

    public Employee(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Employee(Integer businessEntityID, String nationalIDNumber, String loginID, String jobTitle, Date birthDate, Character maritalStatus, Character gender, Date hireDate, boolean salariedFlag, short vacationHours, short sickLeaveHours, boolean currentFlag, String rowguid, Date modifiedDate) {
        this.businessEntityID = businessEntityID;
        this.nationalIDNumber = nationalIDNumber;
        this.loginID = loginID;
        this.jobTitle = jobTitle;
        this.birthDate = birthDate;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.hireDate = hireDate;
        this.salariedFlag = salariedFlag;
        this.vacationHours = vacationHours;
        this.sickLeaveHours = sickLeaveHours;
        this.currentFlag = currentFlag;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getNationalIDNumber() {
        return nationalIDNumber;
    }

    public void setNationalIDNumber(String nationalIDNumber) {
        this.nationalIDNumber = nationalIDNumber;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getOrganizationNode() {
        return organizationNode;
    }

    public void setOrganizationNode(String organizationNode) {
        this.organizationNode = organizationNode;
    }

    public Short getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(Short organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Character getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Character maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
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

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public List<Purchaseorderheader> getPurchaseorderheaderList() {
        return purchaseorderheaderList;
    }

    public void setPurchaseorderheaderList(List<Purchaseorderheader> purchaseorderheaderList) {
        this.purchaseorderheaderList = purchaseorderheaderList;
    }

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    @XmlTransient
    public List<Employeedepartmenthistory> getEmployeedepartmenthistoryList() {
        return employeedepartmenthistoryList;
    }

    public void setEmployeedepartmenthistoryList(List<Employeedepartmenthistory> employeedepartmenthistoryList) {
        this.employeedepartmenthistoryList = employeedepartmenthistoryList;
    }

    @XmlTransient
    public List<Jobcandidate> getJobcandidateList() {
        return jobcandidateList;
    }

    public void setJobcandidateList(List<Jobcandidate> jobcandidateList) {
        this.jobcandidateList = jobcandidateList;
    }

    @XmlTransient
    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @XmlTransient
    public List<Employeepayhistory> getEmployeepayhistoryList() {
        return employeepayhistoryList;
    }

    public void setEmployeepayhistoryList(List<Employeepayhistory> employeepayhistoryList) {
        this.employeepayhistoryList = employeepayhistoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessEntityID != null ? businessEntityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.businessEntityID == null && other.businessEntityID != null) || (this.businessEntityID != null && !this.businessEntityID.equals(other.businessEntityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Employee[ businessEntityID=" + businessEntityID + " ]";
    }

}
