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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "currencyrate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Currencyrate.findAll", query = "SELECT c FROM Currencyrate c"),
    @NamedQuery(name = "Currencyrate.findByCurrencyRateID", query = "SELECT c FROM Currencyrate c WHERE c.currencyRateID = :currencyRateID"),
    @NamedQuery(name = "Currencyrate.findByCurrencyRateDate", query = "SELECT c FROM Currencyrate c WHERE c.currencyRateDate = :currencyRateDate"),
    @NamedQuery(name = "Currencyrate.findByFromCurrencyCode", query = "SELECT c FROM Currencyrate c WHERE c.fromCurrencyCode = :fromCurrencyCode"),
    @NamedQuery(name = "Currencyrate.findByToCurrencyCode", query = "SELECT c FROM Currencyrate c WHERE c.toCurrencyCode = :toCurrencyCode"),
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "FromCurrencyCode")
    private String fromCurrencyCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ToCurrencyCode")
    private String toCurrencyCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AverageRate")
    private double averageRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EndOfDayRate")
    private double endOfDayRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Currencyrate() {
    }

    public Currencyrate(Integer currencyRateID) {
        this.currencyRateID = currencyRateID;
    }

    public Currencyrate(Integer currencyRateID, Date currencyRateDate, String fromCurrencyCode, String toCurrencyCode, double averageRate, double endOfDayRate, Date modifiedDate) {
        this.currencyRateID = currencyRateID;
        this.currencyRateDate = currencyRateDate;
        this.fromCurrencyCode = fromCurrencyCode;
        this.toCurrencyCode = toCurrencyCode;
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

    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    public double getEndOfDayRate() {
        return endOfDayRate;
    }

    public void setEndOfDayRate(double endOfDayRate) {
        this.endOfDayRate = endOfDayRate;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Currencyrate[ currencyRateID=" + currencyRateID + " ]";
    }

}
