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
import javax.validation.constraints.Size;
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
@Table(name = "productsubcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productsubcategory.findAll", query = "SELECT p FROM Productsubcategory p"),
    @NamedQuery(name = "Productsubcategory.findByProductSubcategoryID", query = "SELECT p FROM Productsubcategory p WHERE p.productSubcategoryID = :productSubcategoryID"),
    @NamedQuery(name = "Productsubcategory.findByName", query = "SELECT p FROM Productsubcategory p WHERE p.name = :name"),
    @NamedQuery(name = "Productsubcategory.findByRowguid", query = "SELECT p FROM Productsubcategory p WHERE p.rowguid = :rowguid"),
    @NamedQuery(name = "Productsubcategory.findByModifiedDate", query = "SELECT p FROM Productsubcategory p WHERE p.modifiedDate = :modifiedDate")})
public class Productsubcategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductSubcategoryID")
    private Integer productSubcategoryID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
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
    @JoinColumn(name = "ProductCategoryID", referencedColumnName = "ProductCategoryID")
    @ManyToOne(optional = false)
    private Productcategory productCategoryID;
    @OneToMany(mappedBy = "productSubcategoryID")
    private List<Product> productList;

    public Productsubcategory() {
    }

    public Productsubcategory(Integer productSubcategoryID) {
        this.productSubcategoryID = productSubcategoryID;
    }

    public Productsubcategory(Integer productSubcategoryID, String name, String rowguid, Date modifiedDate) {
        this.productSubcategoryID = productSubcategoryID;
        this.name = name;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductSubcategoryID() {
        return productSubcategoryID;
    }

    public void setProductSubcategoryID(Integer productSubcategoryID) {
        this.productSubcategoryID = productSubcategoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Productcategory getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(Productcategory productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productSubcategoryID != null ? productSubcategoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productsubcategory)) {
            return false;
        }
        Productsubcategory other = (Productsubcategory) object;
        if ((this.productSubcategoryID == null && other.productSubcategoryID != null) || (this.productSubcategoryID != null && !this.productSubcategoryID.equals(other.productSubcategoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productsubcategory[ productSubcategoryID=" + productSubcategoryID + " ]";
    }

}
