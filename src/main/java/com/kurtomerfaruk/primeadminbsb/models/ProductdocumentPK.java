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
public class ProductdocumentPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DocumentID")
    private int documentID;

    public ProductdocumentPK() {
    }

    public ProductdocumentPK(int productID, int documentID) {
        this.productID = productID;
        this.documentID = documentID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getDocumentID() {
        return documentID;
    }

    public void setDocumentID(int documentID) {
        this.documentID = documentID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productID;
        hash += (int) documentID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductdocumentPK)) {
            return false;
        }
        ProductdocumentPK other = (ProductdocumentPK) object;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.documentID != other.documentID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.ProductdocumentPK[ productID=" + productID + ", documentID=" + documentID + " ]";
    }

}
