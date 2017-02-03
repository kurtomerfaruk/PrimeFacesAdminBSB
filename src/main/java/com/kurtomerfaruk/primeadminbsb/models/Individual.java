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
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "individual")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Individual.findAll", query = "SELECT i FROM Individual i"),
    @NamedQuery(name = "Individual.findByCustomerID", query = "SELECT i FROM Individual i WHERE i.customerID = :customerID"),
    @NamedQuery(name = "Individual.findByContactID", query = "SELECT i FROM Individual i WHERE i.contactID = :contactID"),
    @NamedQuery(name = "Individual.findByModifiedDate", query = "SELECT i FROM Individual i WHERE i.modifiedDate = :modifiedDate")})
public class Individual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerID")
    private Integer customerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactID")
    private int contactID;
    @Lob
    @Size(max = 65535)
    @Column(name = "Demographics")
    private String demographics;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Individual() {
    }

    public Individual(Integer customerID) {
        this.customerID = customerID;
    }

    public Individual(Integer customerID, int contactID, Date modifiedDate) {
        this.customerID = customerID;
        this.contactID = contactID;
        this.modifiedDate = modifiedDate;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getDemographics() {
        return demographics;
    }

    public void setDemographics(String demographics) {
        this.demographics = demographics;
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
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Individual)) {
            return false;
        }
        Individual other = (Individual) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Individual[ customerID=" + customerID + " ]";
    }

}
