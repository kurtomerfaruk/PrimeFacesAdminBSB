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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "productdescription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productdescription.findAll", query = "SELECT p FROM Productdescription p"),
    @NamedQuery(name = "Productdescription.findByProductDescriptionID", query = "SELECT p FROM Productdescription p WHERE p.productDescriptionID = :productDescriptionID"),
    @NamedQuery(name = "Productdescription.findByDescription", query = "SELECT p FROM Productdescription p WHERE p.description = :description"),
    @NamedQuery(name = "Productdescription.findByRowguid", query = "SELECT p FROM Productdescription p WHERE p.rowguid = :rowguid"),
    @NamedQuery(name = "Productdescription.findByModifiedDate", query = "SELECT p FROM Productdescription p WHERE p.modifiedDate = :modifiedDate")})
public class Productdescription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductDescriptionID")
    private Integer productDescriptionID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "Description")
    private String description;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productdescription")
    private List<Productmodelproductdescriptionculture> productmodelproductdescriptioncultureList;

    public Productdescription() {
    }

    public Productdescription(Integer productDescriptionID) {
        this.productDescriptionID = productDescriptionID;
    }

    public Productdescription(Integer productDescriptionID, String description, String rowguid, Date modifiedDate) {
        this.productDescriptionID = productDescriptionID;
        this.description = description;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductDescriptionID() {
        return productDescriptionID;
    }

    public void setProductDescriptionID(Integer productDescriptionID) {
        this.productDescriptionID = productDescriptionID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (productDescriptionID != null ? productDescriptionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productdescription)) {
            return false;
        }
        Productdescription other = (Productdescription) object;
        if ((this.productDescriptionID == null && other.productDescriptionID != null) || (this.productDescriptionID != null && !this.productDescriptionID.equals(other.productDescriptionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productdescription[ productDescriptionID=" + productDescriptionID + " ]";
    }

}
