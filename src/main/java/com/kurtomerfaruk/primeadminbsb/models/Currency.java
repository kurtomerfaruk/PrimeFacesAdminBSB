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
 * Created on date 27.01.2017 23:11:04
 */
@Entity
@Table(name = "currency")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Currency.findAll", query = "SELECT c FROM Currency c"),
    @NamedQuery(name = "Currency.findByCurrencyCode", query = "SELECT c FROM Currency c WHERE c.currencyCode = :currencyCode"),
    @NamedQuery(name = "Currency.findByName", query = "SELECT c FROM Currency c WHERE c.name = :name"),
    @NamedQuery(name = "Currency.findByModifiedDate", query = "SELECT c FROM Currency c WHERE c.modifiedDate = :modifiedDate")})
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CurrencyCode")
    private String currencyCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Currency() {
    }

    public Currency(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Currency(String currencyCode, String name, Date modifiedDate) {
        this.currencyCode = currencyCode;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (currencyCode != null ? currencyCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Currency)) {
            return false;
        }
        Currency other = (Currency) object;
        if ((this.currencyCode == null && other.currencyCode != null) || (this.currencyCode != null && !this.currencyCode.equals(other.currencyCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Currency[ currencyCode=" + currencyCode + " ]";
    }

}
