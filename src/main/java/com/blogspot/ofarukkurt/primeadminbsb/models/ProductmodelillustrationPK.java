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
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Embeddable
public class ProductmodelillustrationPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductModelID")
    private int productModelID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IllustrationID")
    private int illustrationID;

    public ProductmodelillustrationPK() {
    }

    public ProductmodelillustrationPK(int productModelID, int illustrationID) {
        this.productModelID = productModelID;
        this.illustrationID = illustrationID;
    }

    public int getProductModelID() {
        return productModelID;
    }

    public void setProductModelID(int productModelID) {
        this.productModelID = productModelID;
    }

    public int getIllustrationID() {
        return illustrationID;
    }

    public void setIllustrationID(int illustrationID) {
        this.illustrationID = illustrationID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productModelID;
        hash += (int) illustrationID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductmodelillustrationPK)) {
            return false;
        }
        ProductmodelillustrationPK other = (ProductmodelillustrationPK) object;
        if (this.productModelID != other.productModelID) {
            return false;
        }
        if (this.illustrationID != other.illustrationID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.ProductmodelillustrationPK[ productModelID=" + productModelID + ", illustrationID=" + illustrationID + " ]";
    }

}
