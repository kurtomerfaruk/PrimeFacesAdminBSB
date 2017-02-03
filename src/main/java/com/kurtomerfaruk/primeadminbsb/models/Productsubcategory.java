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
@Table(name = "productsubcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productsubcategory.findAll", query = "SELECT p FROM Productsubcategory p"),
    @NamedQuery(name = "Productsubcategory.findByProductSubcategoryID", query = "SELECT p FROM Productsubcategory p WHERE p.productSubcategoryID = :productSubcategoryID"),
    @NamedQuery(name = "Productsubcategory.findByProductCategoryID", query = "SELECT p FROM Productsubcategory p WHERE p.productCategoryID = :productCategoryID"),
    @NamedQuery(name = "Productsubcategory.findByName", query = "SELECT p FROM Productsubcategory p WHERE p.name = :name"),
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
    @Column(name = "ProductCategoryID")
    private int productCategoryID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Productsubcategory() {
    }

    public Productsubcategory(Integer productSubcategoryID) {
        this.productSubcategoryID = productSubcategoryID;
    }

    public Productsubcategory(Integer productSubcategoryID, int productCategoryID, String name, byte[] rowguid, Date modifiedDate) {
        this.productSubcategoryID = productSubcategoryID;
        this.productCategoryID = productCategoryID;
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

    public int getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(int productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Productsubcategory[ productSubcategoryID=" + productSubcategoryID + " ]";
    }

}
