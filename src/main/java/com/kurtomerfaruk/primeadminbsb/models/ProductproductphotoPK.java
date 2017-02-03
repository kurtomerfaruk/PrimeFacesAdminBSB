/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
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
        return "com.kurtomerfaruk.primeadminbsb.models.ProductproductphotoPK[ productID=" + productID + ", productPhotoID=" + productPhotoID + " ]";
    }

}
