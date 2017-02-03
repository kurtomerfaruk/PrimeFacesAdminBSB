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
 * Created on date 27.01.2017 23:11:04
 */
@Embeddable
public class ProductinventoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LocationID")
    private short locationID;

    public ProductinventoryPK() {
    }

    public ProductinventoryPK(int productID, short locationID) {
        this.productID = productID;
        this.locationID = locationID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public short getLocationID() {
        return locationID;
    }

    public void setLocationID(short locationID) {
        this.locationID = locationID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productID;
        hash += (int) locationID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductinventoryPK)) {
            return false;
        }
        ProductinventoryPK other = (ProductinventoryPK) object;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.locationID != other.locationID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.ProductinventoryPK[ productID=" + productID + ", locationID=" + locationID + " ]";
    }

}
