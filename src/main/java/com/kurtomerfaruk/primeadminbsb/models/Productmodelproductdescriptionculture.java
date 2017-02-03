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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
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
        return "com.kurtomerfaruk.primeadminbsb.models.Productmodelproductdescriptionculture[ productmodelproductdescriptionculturePK=" + productmodelproductdescriptionculturePK + " ]";
    }

}
