
package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "countryregion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Countryregion.findAll", query = "SELECT c FROM Countryregion c"),
    @NamedQuery(name = "Countryregion.findByCountryRegionCode", query = "SELECT c FROM Countryregion c WHERE c.countryRegionCode = :countryRegionCode"),
    @NamedQuery(name = "Countryregion.findByName", query = "SELECT c FROM Countryregion c WHERE c.name = :name"),
    @NamedQuery(name = "Countryregion.findByModifiedDate", query = "SELECT c FROM Countryregion c WHERE c.modifiedDate = :modifiedDate")})
public class Countryregion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CountryRegionCode")
    private String countryRegionCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryRegionCode")
    private List<Salesterritory> salesterritoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryregion")
    private List<Countryregioncurrency> countryregioncurrencyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryRegionCode")
    private List<Stateprovince> stateprovinceList;

    public Countryregion() {
    }

    public Countryregion(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    public Countryregion(String countryRegionCode, String name, Date modifiedDate) {
        this.countryRegionCode = countryRegionCode;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
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

    @XmlTransient
    public List<Salesterritory> getSalesterritoryList() {
        return salesterritoryList;
    }

    public void setSalesterritoryList(List<Salesterritory> salesterritoryList) {
        this.salesterritoryList = salesterritoryList;
    }

    @XmlTransient
    public List<Countryregioncurrency> getCountryregioncurrencyList() {
        return countryregioncurrencyList;
    }

    public void setCountryregioncurrencyList(List<Countryregioncurrency> countryregioncurrencyList) {
        this.countryregioncurrencyList = countryregioncurrencyList;
    }

    @XmlTransient
    public List<Stateprovince> getStateprovinceList() {
        return stateprovinceList;
    }

    public void setStateprovinceList(List<Stateprovince> stateprovinceList) {
        this.stateprovinceList = stateprovinceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryRegionCode != null ? countryRegionCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countryregion)) {
            return false;
        }
        Countryregion other = (Countryregion) object;
        if ((this.countryRegionCode == null && other.countryRegionCode != null) || (this.countryRegionCode != null && !this.countryRegionCode.equals(other.countryRegionCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Countryregion[ countryRegionCode=" + countryRegionCode + " ]";
    }

}
