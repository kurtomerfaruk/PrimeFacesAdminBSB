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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "culture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Culture.findAll", query = "SELECT c FROM Culture c"),
    @NamedQuery(name = "Culture.findByCultureID", query = "SELECT c FROM Culture c WHERE c.cultureID = :cultureID"),
    @NamedQuery(name = "Culture.findByName", query = "SELECT c FROM Culture c WHERE c.name = :name"),
    @NamedQuery(name = "Culture.findByModifiedDate", query = "SELECT c FROM Culture c WHERE c.modifiedDate = :modifiedDate")})
public class Culture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CultureID")
    private String cultureID;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "culture")
    private List<Productmodelproductdescriptionculture> productmodelproductdescriptioncultureList;

    public Culture() {
    }

    public Culture(String cultureID) {
        this.cultureID = cultureID;
    }

    public Culture(String cultureID, String name, Date modifiedDate) {
        this.cultureID = cultureID;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    public String getCultureID() {
        return cultureID;
    }

    public void setCultureID(String cultureID) {
        this.cultureID = cultureID;
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
    public List<Productmodelproductdescriptionculture> getProductmodelproductdescriptioncultureList() {
        return productmodelproductdescriptioncultureList;
    }

    public void setProductmodelproductdescriptioncultureList(List<Productmodelproductdescriptionculture> productmodelproductdescriptioncultureList) {
        this.productmodelproductdescriptioncultureList = productmodelproductdescriptioncultureList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cultureID != null ? cultureID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Culture)) {
            return false;
        }
        Culture other = (Culture) object;
        if ((this.cultureID == null && other.cultureID != null) || (this.cultureID != null && !this.cultureID.equals(other.cultureID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Culture[ cultureID=" + cultureID + " ]";
    }

}
