/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javax.persistence.Lob;
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
 * @Created on date 10/08/2017 19:30:19 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "person")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
    @NamedQuery(name = "Person.findByBusinessEntityID", query = "SELECT p FROM Person p WHERE p.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Person.findByPersonType", query = "SELECT p FROM Person p WHERE p.personType = :personType"),
    @NamedQuery(name = "Person.findByNameStyle", query = "SELECT p FROM Person p WHERE p.nameStyle = :nameStyle"),
    @NamedQuery(name = "Person.findByTitle", query = "SELECT p FROM Person p WHERE p.title = :title"),
    @NamedQuery(name = "Person.findByFirstName", query = "SELECT p FROM Person p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Person.findByMiddleName", query = "SELECT p FROM Person p WHERE p.middleName = :middleName"),
    @NamedQuery(name = "Person.findByLastName", query = "SELECT p FROM Person p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Person.findBySuffix", query = "SELECT p FROM Person p WHERE p.suffix = :suffix"),
    @NamedQuery(name = "Person.findByEmailPromotion", query = "SELECT p FROM Person p WHERE p.emailPromotion = :emailPromotion"),
    @NamedQuery(name = "Person.findByRowguid", query = "SELECT p FROM Person p WHERE p.rowguid = :rowguid"),
    @NamedQuery(name = "Person.findByModifiedDate", query = "SELECT p FROM Person p WHERE p.modifiedDate = :modifiedDate")})
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "PersonType")
    private String personType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NameStyle")
    private boolean nameStyle;
    @Size(max = 8)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "FirstName")
    private String firstName;
    @Size(max = 100)
    @Column(name = "MiddleName")
    private String middleName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LastName")
    private String lastName;
    @Size(max = 10)
    @Column(name = "Suffix")
    private String suffix;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmailPromotion")
    private int emailPromotion;
    @Lob
    @Size(max = 65535)
    @Column(name = "AdditionalContactInfo")
    private String additionalContactInfo;
    @Lob
    @Size(max = 65535)
    @Column(name = "Demographics")
    private String demographics;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Businessentity businessentity;
    @OneToMany(mappedBy = "personID")
    private List<Customer> customerList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Password password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Emailaddress> emailaddressList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Personphone> personphoneList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Businessentitycontact> businessentitycontactList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Employee employee;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Personcreditcard> personcreditcardList;

    public Person() {
    }

    public Person(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Person(Integer businessEntityID, String personType, boolean nameStyle, String firstName, String lastName, int emailPromotion, String rowguid, Date modifiedDate) {
        this.businessEntityID = businessEntityID;
        this.personType = personType;
        this.nameStyle = nameStyle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailPromotion = emailPromotion;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public boolean getNameStyle() {
        return nameStyle;
    }

    public void setNameStyle(boolean nameStyle) {
        this.nameStyle = nameStyle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getEmailPromotion() {
        return emailPromotion;
    }

    public void setEmailPromotion(int emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getAdditionalContactInfo() {
        return additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    public String getDemographics() {
        return demographics;
    }

    public void setDemographics(String demographics) {
        this.demographics = demographics;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Businessentity getBusinessentity() {
        return businessentity;
    }

    public void setBusinessentity(Businessentity businessentity) {
        this.businessentity = businessentity;
    }

    @XmlTransient
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    @XmlTransient
    public List<Emailaddress> getEmailaddressList() {
        return emailaddressList;
    }

    public void setEmailaddressList(List<Emailaddress> emailaddressList) {
        this.emailaddressList = emailaddressList;
    }

    @XmlTransient
    public List<Personphone> getPersonphoneList() {
        return personphoneList;
    }

    public void setPersonphoneList(List<Personphone> personphoneList) {
        this.personphoneList = personphoneList;
    }

    @XmlTransient
    public List<Businessentitycontact> getBusinessentitycontactList() {
        return businessentitycontactList;
    }

    public void setBusinessentitycontactList(List<Businessentitycontact> businessentitycontactList) {
        this.businessentitycontactList = businessentitycontactList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @XmlTransient
    public List<Personcreditcard> getPersoncreditcardList() {
        return personcreditcardList;
    }

    public void setPersoncreditcardList(List<Personcreditcard> personcreditcardList) {
        this.personcreditcardList = personcreditcardList;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.businessEntityID == null && other.businessEntityID != null) || (this.businessEntityID != null && !this.businessEntityID.equals(other.businessEntityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Person[ businessEntityID=" + businessEntityID + " ]";
    }

}
