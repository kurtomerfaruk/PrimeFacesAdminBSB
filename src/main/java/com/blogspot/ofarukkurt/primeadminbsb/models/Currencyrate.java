/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "currencyrate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Currencyrate.findAll", query = "SELECT c FROM Currencyrate c"),
    @NamedQuery(name = "Currencyrate.findByCurrencyRateID", query = "SELECT c FROM Currencyrate c WHERE c.currencyRateID = :currencyRateID"),
    @NamedQuery(name = "Currencyrate.findByCurrencyRateDate", query = "SELECT c FROM Currencyrate c WHERE c.currencyRateDate = :currencyRateDate"),
    @NamedQuery(name = "Currencyrate.findByAverageRate", query = "SELECT c FROM Currencyrate c WHERE c.averageRate = :averageRate"),
    @NamedQuery(name = "Currencyrate.findByEndOfDayRate", query = "SELECT c FROM Currencyrate c WHERE c.endOfDayRate = :endOfDayRate"),
    @NamedQuery(name = "Currencyrate.findByModifiedDate", query = "SELECT c FROM Currencyrate c WHERE c.modifiedDate = :modifiedDate")})
public class Currencyrate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CurrencyRateID")
    private Integer currencyRateID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CurrencyRateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currencyRateDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "AverageRate")
    private BigDecimal averageRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EndOfDayRate")
    private BigDecimal endOfDayRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "ToCurrencyCode", referencedColumnName = "CurrencyCode")
    @ManyToOne(optional = false)
    private Currency toCurrencyCode;
    @JoinColumn(name = "FromCurrencyCode", referencedColumnName = "CurrencyCode")
    @ManyToOne(optional = false)
    private Currency fromCurrencyCode;
    @OneToMany(mappedBy = "currencyRateID")
    private List<Salesorderheader> salesorderheaderList;

    public Currencyrate() {
    }

    public Currencyrate(Integer currencyRateID) {
        this.currencyRateID = currencyRateID;
    }

    public Currencyrate(Integer currencyRateID, Date currencyRateDate, BigDecimal averageRate, BigDecimal endOfDayRate, Date modifiedDate) {
        this.currencyRateID = currencyRateID;
        this.currencyRateDate = currencyRateDate;
        this.averageRate = averageRate;
        this.endOfDayRate = endOfDayRate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getCurrencyRateID() {
        return currencyRateID;
    }

    public void setCurrencyRateID(Integer currencyRateID) {
        this.currencyRateID = currencyRateID;
    }

    public Date getCurrencyRateDate() {
        return currencyRateDate;
    }

    public void setCurrencyRateDate(Date currencyRateDate) {
        this.currencyRateDate = currencyRateDate;
    }

    public BigDecimal getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(BigDecimal averageRate) {
        this.averageRate = averageRate;
    }

    public BigDecimal getEndOfDayRate() {
        return endOfDayRate;
    }

    public void setEndOfDayRate(BigDecimal endOfDayRate) {
        this.endOfDayRate = endOfDayRate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Currency getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(Currency toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public Currency getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(Currency fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    @XmlTransient
    public List<Salesorderheader> getSalesorderheaderList() {
        return salesorderheaderList;
    }

    public void setSalesorderheaderList(List<Salesorderheader> salesorderheaderList) {
        this.salesorderheaderList = salesorderheaderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (currencyRateID != null ? currencyRateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Currencyrate)) {
            return false;
        }
        Currencyrate other = (Currencyrate) object;
        if ((this.currencyRateID == null && other.currencyRateID != null) || (this.currencyRateID != null && !this.currencyRateID.equals(other.currencyRateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Currencyrate[ currencyRateID=" + currencyRateID + " ]";
    }

}
