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

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:19 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class ProductproductphotoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductPhotoID")
    private int productPhotoID;

    public ProductproductphotoPK() {
    }

    public ProductproductphotoPK(int productID, int productPhotoID) {
        this.productID = productID;
        this.productPhotoID = productPhotoID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductPhotoID() {
        return productPhotoID;
    }

    public void setProductPhotoID(int productPhotoID) {
        this.productPhotoID = productPhotoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productID;
        hash += (int) productPhotoID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductproductphotoPK)) {
            return false;
        }
        ProductproductphotoPK other = (ProductproductphotoPK) object;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.productPhotoID != other.productPhotoID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.ProductproductphotoPK[ productID=" + productID + ", productPhotoID=" + productPhotoID + " ]";
    }

}
