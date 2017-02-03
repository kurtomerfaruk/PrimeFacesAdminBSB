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
 * Created on date 27.01.2017 23:11:04
 */
@Entity
@Table(name = "productlistpricehistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productlistpricehistory.findAll", query = "SELECT p FROM Productlistpricehistory p"),
    @NamedQuery(name = "Productlistpricehistory.findByProductID", query = "SELECT p FROM Productlistpricehistory p WHERE p.productlistpricehistoryPK.productID = :productID"),
    @NamedQuery(name = "Productlistpricehistory.findByStartDate", query = "SELECT p FROM Productlistpricehistory p WHERE p.productlistpricehistoryPK.startDate = :startDate"),
    @NamedQuery(name = "Productlistpricehistory.findByEndDate", query = "SELECT p FROM Productlistpricehistory p WHERE p.endDate = :endDate"),
    @NamedQuery(name = "Productlistpricehistory.findByListPrice", query = "SELECT p FROM Productlistpricehistory p WHERE p.listPrice = :listPrice"),
    @NamedQuery(name = "Productlistpricehistory.findByModifiedDate", query = "SELECT p FROM Productlistpricehistory p WHERE p.modifiedDate = :modifiedDate")})
public class Productlistpricehistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductlistpricehistoryPK productlistpricehistoryPK;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ListPrice")
    private double listPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Productlistpricehistory() {
    }

    public Productlistpricehistory(ProductlistpricehistoryPK productlistpricehistoryPK) {
        this.productlistpricehistoryPK = productlistpricehistoryPK;
    }

    public Productlistpricehistory(ProductlistpricehistoryPK productlistpricehistoryPK, double listPrice, Date modifiedDate) {
        this.productlistpricehistoryPK = productlistpricehistoryPK;
        this.listPrice = listPrice;
        this.modifiedDate = modifiedDate;
    }

    public Productlistpricehistory(int productID, Date startDate) {
        this.productlistpricehistoryPK = new ProductlistpricehistoryPK(productID, startDate);
    }

    public ProductlistpricehistoryPK getProductlistpricehistoryPK() {
        return productlistpricehistoryPK;
    }

    public void setProductlistpricehistoryPK(ProductlistpricehistoryPK productlistpricehistoryPK) {
        this.productlistpricehistoryPK = productlistpricehistoryPK;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
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
        hash += (productlistpricehistoryPK != null ? productlistpricehistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productlistpricehistory)) {
            return false;
        }
        Productlistpricehistory other = (Productlistpricehistory) object;
        if ((this.productlistpricehistoryPK == null && other.productlistpricehistoryPK != null) || (this.productlistpricehistoryPK != null && !this.productlistpricehistoryPK.equals(other.productlistpricehistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Productlistpricehistory[ productlistpricehistoryPK=" + productlistpricehistoryPK + " ]";
    }

}
