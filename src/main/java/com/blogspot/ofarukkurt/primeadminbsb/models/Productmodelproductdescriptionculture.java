/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "productmodelproductdescriptionculture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productmodelproductdescriptionculture.findAll", query = "SELECT p FROM Productmodelproductdescriptionculture p"),
    @NamedQuery(name = "Productmodelproductdescriptionculture.findByProductModelID", query = "SELECT p FROM Productmodelproductdescriptionculture p WHERE p.productmodelproductdescriptionculturePK.productModelID = :productModelID"),
    @NamedQuery(name = "Productmodelproductdescriptionculture.findByProductDescriptionID", query = "SELECT p FROM Productmodelproductdescriptionculture p WHERE p.productmodelproductdescriptionculturePK.productDescriptionID = :productDescriptionID"),
    @NamedQuery(name = "Productmodelproductdescriptionculture.findByCultureID", query = "SELECT p FROM Productmodelproductdescriptionculture p WHERE p.productmodelproductdescriptionculturePK.cultureID = :cultureID"),
    @NamedQuery(name = "Productmodelproductdescriptionculture.findByModifiedDate", query = "SELECT p FROM Productmodelproductdescriptionculture p WHERE p.modifiedDate = :modifiedDate")})
public class Productmodelproductdescriptionculture implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductmodelproductdescriptionculturePK productmodelproductdescriptionculturePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "ProductModelID", referencedColumnName = "ProductModelID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productmodel productmodel;
    @JoinColumn(name = "ProductDescriptionID", referencedColumnName = "ProductDescriptionID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productdescription productdescription;
    @JoinColumn(name = "CultureID", referencedColumnName = "CultureID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Culture culture;

    public Productmodelproductdescriptionculture() {
    }

    public Productmodelproductdescriptionculture(ProductmodelproductdescriptionculturePK productmodelproductdescriptionculturePK) {
        this.productmodelproductdescriptionculturePK = productmodelproductdescriptionculturePK;
    }

    public Productmodelproductdescriptionculture(ProductmodelproductdescriptionculturePK productmodelproductdescriptionculturePK, Date modifiedDate) {
        this.productmodelproductdescriptionculturePK = productmodelproductdescriptionculturePK;
        this.modifiedDate = modifiedDate;
    }

    public Productmodelproductdescriptionculture(int productModelID, int productDescriptionID, String cultureID) {
        this.productmodelproductdescriptionculturePK = new ProductmodelproductdescriptionculturePK(productModelID, productDescriptionID, cultureID);
    }

    public ProductmodelproductdescriptionculturePK getProductmodelproductdescriptionculturePK() {
        return productmodelproductdescriptionculturePK;
    }

    public void setProductmodelproductdescriptionculturePK(ProductmodelproductdescriptionculturePK productmodelproductdescriptionculturePK) {
        this.productmodelproductdescriptionculturePK = productmodelproductdescriptionculturePK;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Productmodel getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(Productmodel productmodel) {
        this.productmodel = productmodel;
    }

    public Productdescription getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(Productdescription productdescription) {
        this.productdescription = productdescription;
    }

    public Culture getCulture() {
        return culture;
    }

    public void setCulture(Culture culture) {
        this.culture = culture;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productmodelproductdescriptionculturePK != null ? productmodelproductdescriptionculturePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productmodelproductdescriptionculture)) {
            return false;
        }
        Productmodelproductdescriptionculture other = (Productmodelproductdescriptionculture) object;
        if ((this.productmodelproductdescriptionculturePK == null && other.productmodelproductdescriptionculturePK != null) || (this.productmodelproductdescriptionculturePK != null && !this.productmodelproductdescriptionculturePK.equals(other.productmodelproductdescriptionculturePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productmodelproductdescriptionculture[ productmodelproductdescriptionculturePK=" + productmodelproductdescriptionculturePK + " ]";
    }

}
