
package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "countryregioncurrency")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Countryregioncurrency.findAll", query = "SELECT c FROM Countryregioncurrency c"),
    @NamedQuery(name = "Countryregioncurrency.findByCountryRegionCode", query = "SELECT c FROM Countryregioncurrency c WHERE c.countryregioncurrencyPK.countryRegionCode = :countryRegionCode"),
    @NamedQuery(name = "Countryregioncurrency.findByCurrencyCode", query = "SELECT c FROM Countryregioncurrency c WHERE c.countryregioncurrencyPK.currencyCode = :currencyCode"),
    @NamedQuery(name = "Countryregioncurrency.findByModifiedDate", query = "SELECT c FROM Countryregioncurrency c WHERE c.modifiedDate = :modifiedDate")})
public class Countryregioncurrency implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CountryregioncurrencyPK countryregioncurrencyPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "CurrencyCode", referencedColumnName = "CurrencyCode", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Currency currency;
    @JoinColumn(name = "CountryRegionCode", referencedColumnName = "CountryRegionCode", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Countryregion countryregion;

    public Countryregioncurrency() {
    }

    public Countryregioncurrency(CountryregioncurrencyPK countryregioncurrencyPK) {
        this.countryregioncurrencyPK = countryregioncurrencyPK;
    }

    public Countryregioncurrency(CountryregioncurrencyPK countryregioncurrencyPK, Date modifiedDate) {
        this.countryregioncurrencyPK = countryregioncurrencyPK;
        this.modifiedDate = modifiedDate;
    }

    public Countryregioncurrency(String countryRegionCode, String currencyCode) {
        this.countryregioncurrencyPK = new CountryregioncurrencyPK(countryRegionCode, currencyCode);
    }

    public CountryregioncurrencyPK getCountryregioncurrencyPK() {
        return countryregioncurrencyPK;
    }

    public void setCountryregioncurrencyPK(CountryregioncurrencyPK countryregioncurrencyPK) {
        this.countryregioncurrencyPK = countryregioncurrencyPK;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Countryregion getCountryregion() {
        return countryregion;
    }

    public void setCountryregion(Countryregion countryregion) {
        this.countryregion = countryregion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryregioncurrencyPK != null ? countryregioncurrencyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countryregioncurrency)) {
            return false;
        }
        Countryregioncurrency other = (Countryregioncurrency) object;
        if ((this.countryregioncurrencyPK == null && other.countryregioncurrencyPK != null) || (this.countryregioncurrencyPK != null && !this.countryregioncurrencyPK.equals(other.countryregioncurrencyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Countryregioncurrency[ countryregioncurrencyPK=" + countryregioncurrencyPK + " ]";
    }

}
