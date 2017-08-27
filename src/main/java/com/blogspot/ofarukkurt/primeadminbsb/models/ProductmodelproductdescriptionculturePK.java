/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class ProductmodelproductdescriptionculturePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductModelID")
    private int productModelID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductDescriptionID")
    private int productDescriptionID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CultureID")
    private String cultureID;

    public ProductmodelproductdescriptionculturePK() {
    }

    public ProductmodelproductdescriptionculturePK(int productModelID, int productDescriptionID, String cultureID) {
        this.productModelID = productModelID;
        this.productDescriptionID = productDescriptionID;
        this.cultureID = cultureID;
    }

    public int getProductModelID() {
        return productModelID;
    }

    public void setProductModelID(int productModelID) {
        this.productModelID = productModelID;
    }

    public int getProductDescriptionID() {
        return productDescriptionID;
    }

    public void setProductDescriptionID(int productDescriptionID) {
        this.productDescriptionID = productDescriptionID;
    }

    public String getCultureID() {
        return cultureID;
    }

    public void setCultureID(String cultureID) {
        this.cultureID = cultureID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productModelID;
        hash += (int) productDescriptionID;
        hash += (cultureID != null ? cultureID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductmodelproductdescriptionculturePK)) {
            return false;
        }
        ProductmodelproductdescriptionculturePK other = (ProductmodelproductdescriptionculturePK) object;
        if (this.productModelID != other.productModelID) {
            return false;
        }
        if (this.productDescriptionID != other.productDescriptionID) {
            return false;
        }
        if ((this.cultureID == null && other.cultureID != null) || (this.cultureID != null && !this.cultureID.equals(other.cultureID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.ProductmodelproductdescriptionculturePK[ productModelID=" + productModelID + ", productDescriptionID=" + productDescriptionID + ", cultureID=" + cultureID + " ]";
    }

}
