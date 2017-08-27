/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "employeepayhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeepayhistory.findAll", query = "SELECT e FROM Employeepayhistory e"),
    @NamedQuery(name = "Employeepayhistory.findByBusinessEntityID", query = "SELECT e FROM Employeepayhistory e WHERE e.employeepayhistoryPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Employeepayhistory.findByRateChangeDate", query = "SELECT e FROM Employeepayhistory e WHERE e.employeepayhistoryPK.rateChangeDate = :rateChangeDate"),
    @NamedQuery(name = "Employeepayhistory.findByRate", query = "SELECT e FROM Employeepayhistory e WHERE e.rate = :rate"),
    @NamedQuery(name = "Employeepayhistory.findByPayFrequency", query = "SELECT e FROM Employeepayhistory e WHERE e.payFrequency = :payFrequency"),
    @NamedQuery(name = "Employeepayhistory.findByModifiedDate", query = "SELECT e FROM Employeepayhistory e WHERE e.modifiedDate = :modifiedDate")})
public class Employeepayhistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeepayhistoryPK employeepayhistoryPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Rate")
    private BigDecimal rate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PayFrequency")
    private short payFrequency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Employee employee;

    public Employeepayhistory() {
    }

    public Employeepayhistory(EmployeepayhistoryPK employeepayhistoryPK) {
        this.employeepayhistoryPK = employeepayhistoryPK;
    }

    public Employeepayhistory(EmployeepayhistoryPK employeepayhistoryPK, BigDecimal rate, short payFrequency, Date modifiedDate) {
        this.employeepayhistoryPK = employeepayhistoryPK;
        this.rate = rate;
        this.payFrequency = payFrequency;
        this.modifiedDate = modifiedDate;
    }

    public Employeepayhistory(int businessEntityID, Date rateChangeDate) {
        this.employeepayhistoryPK = new EmployeepayhistoryPK(businessEntityID, rateChangeDate);
    }

    public EmployeepayhistoryPK getEmployeepayhistoryPK() {
        return employeepayhistoryPK;
    }

    public void setEmployeepayhistoryPK(EmployeepayhistoryPK employeepayhistoryPK) {
        this.employeepayhistoryPK = employeepayhistoryPK;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public short getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(short payFrequency) {
        this.payFrequency = payFrequency;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeepayhistoryPK != null ? employeepayhistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeepayhistory)) {
            return false;
        }
        Employeepayhistory other = (Employeepayhistory) object;
        if ((this.employeepayhistoryPK == null && other.employeepayhistoryPK != null) || (this.employeepayhistoryPK != null && !this.employeepayhistoryPK.equals(other.employeepayhistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Employeepayhistory[ employeepayhistoryPK=" + employeepayhistoryPK + " ]";
    }

}
