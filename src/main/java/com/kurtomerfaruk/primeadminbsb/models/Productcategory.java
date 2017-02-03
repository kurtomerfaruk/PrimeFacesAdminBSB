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
 * Created on date 27.01.2017 23:11:05
 */
@Entity
@Table(name = "productcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productcategory.findAll", query = "SELECT p FROM Productcategory p"),
    @NamedQuery(name = "Productcategory.findByProductCategoryID", query = "SELECT p FROM Productcategory p WHERE p.productCategoryID = :productCategoryID"),
    @NamedQuery(name = "Productcategory.findByName", query = "SELECT p FROM Productcategory p WHERE p.name = :name"),
    @NamedQuery(name = "Productcategory.findByModifiedDate", query = "SELECT p FROM Productcategory p WHERE p.modifiedDate = :modifiedDate")})
public class Productcategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductCategoryID")
    private Integer productCategoryID;
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

    public Productcategory() {
    }

    public Productcategory(Integer productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    public Productcategory(Integer productCategoryID, String name, byte[] rowguid, Date modifiedDate) {
        this.productCategoryID = productCategoryID;
        this.name = name;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(Integer productCategoryID) {
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
        hash += (productCategoryID != null ? productCategoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productcategory)) {
            return false;
        }
        Productcategory other = (Productcategory) object;
        if ((this.productCategoryID == null && other.productCategoryID != null) || (this.productCategoryID != null && !this.productCategoryID.equals(other.productCategoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Productcategory[ productCategoryID=" + productCategoryID + " ]";
    }

}
