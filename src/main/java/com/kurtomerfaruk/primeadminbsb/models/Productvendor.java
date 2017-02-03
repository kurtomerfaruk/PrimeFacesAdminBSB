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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:04
 */
@Entity
@Table(name = "productvendor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productvendor.findAll", query = "SELECT p FROM Productvendor p"),
    @NamedQuery(name = "Productvendor.findByProductID", query = "SELECT p FROM Productvendor p WHERE p.productvendorPK.productID = :productID"),
    @NamedQuery(name = "Productvendor.findByVendorID", query = "SELECT p FROM Productvendor p WHERE p.productvendorPK.vendorID = :vendorID"),
    @NamedQuery(name = "Productvendor.findByAverageLeadTime", query = "SELECT p FROM Productvendor p WHERE p.averageLeadTime = :averageLeadTime"),
    @NamedQuery(name = "Productvendor.findByStandardPrice", query = "SELECT p FROM Productvendor p WHERE p.standardPrice = :standardPrice"),
    @NamedQuery(name = "Productvendor.findByLastReceiptCost", query = "SELECT p FROM Productvendor p WHERE p.lastReceiptCost = :lastReceiptCost"),
    @NamedQuery(name = "Productvendor.findByLastReceiptDate", query = "SELECT p FROM Productvendor p WHERE p.lastReceiptDate = :lastReceiptDate"),
    @NamedQuery(name = "Productvendor.findByMinOrderQty", query = "SELECT p FROM Productvendor p WHERE p.minOrderQty = :minOrderQty"),
    @NamedQuery(name = "Productvendor.findByMaxOrderQty", query = "SELECT p FROM Productvendor p WHERE p.maxOrderQty = :maxOrderQty"),
    @NamedQuery(name = "Productvendor.findByOnOrderQty", query = "SELECT p FROM Productvendor p WHERE p.onOrderQty = :onOrderQty"),
    @NamedQuery(name = "Productvendor.findByUnitMeasureCode", query = "SELECT p FROM Productvendor p WHERE p.unitMeasureCode = :unitMeasureCode"),
    @NamedQuery(name = "Productvendor.findByModifiedDate", query = "SELECT p FROM Productvendor p WHERE p.modifiedDate = :modifiedDate")})
public class Productvendor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductvendorPK productvendorPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AverageLeadTime")
    private int averageLeadTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StandardPrice")
    private double standardPrice;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LastReceiptCost")
    private Double lastReceiptCost;
    @Column(name = "LastReceiptDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastReceiptDate;
    @Column(name = "MinOrderQty")
    private Integer minOrderQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaxOrderQty")
    private int maxOrderQty;
    @Column(name = "OnOrderQty")
    private Integer onOrderQty;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "UnitMeasureCode")
    private String unitMeasureCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Productvendor() {
    }

    public Productvendor(ProductvendorPK productvendorPK) {
        this.productvendorPK = productvendorPK;
    }

    public Productvendor(ProductvendorPK productvendorPK, int averageLeadTime, double standardPrice, int maxOrderQty, String unitMeasureCode, Date modifiedDate) {
        this.productvendorPK = productvendorPK;
        this.averageLeadTime = averageLeadTime;
        this.standardPrice = standardPrice;
        this.maxOrderQty = maxOrderQty;
        this.unitMeasureCode = unitMeasureCode;
        this.modifiedDate = modifiedDate;
    }

    public Productvendor(int productID, int vendorID) {
        this.productvendorPK = new ProductvendorPK(productID, vendorID);
    }

    public ProductvendorPK getProductvendorPK() {
        return productvendorPK;
    }

    public void setProductvendorPK(ProductvendorPK productvendorPK) {
        this.productvendorPK = productvendorPK;
    }

    public int getAverageLeadTime() {
        return averageLeadTime;
    }

    public void setAverageLeadTime(int averageLeadTime) {
        this.averageLeadTime = averageLeadTime;
    }

    public double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(double standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Double getLastReceiptCost() {
        return lastReceiptCost;
    }

    public void setLastReceiptCost(Double lastReceiptCost) {
        this.lastReceiptCost = lastReceiptCost;
    }

    public Date getLastReceiptDate() {
        return lastReceiptDate;
    }

    public void setLastReceiptDate(Date lastReceiptDate) {
        this.lastReceiptDate = lastReceiptDate;
    }

    public Integer getMinOrderQty() {
        return minOrderQty;
    }

    public void setMinOrderQty(Integer minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

    public int getMaxOrderQty() {
        return maxOrderQty;
    }

    public void setMaxOrderQty(int maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    public Integer getOnOrderQty() {
        return onOrderQty;
    }

    public void setOnOrderQty(Integer onOrderQty) {
        this.onOrderQty = onOrderQty;
    }

    public String getUnitMeasureCode() {
        return unitMeasureCode;
    }

    public void setUnitMeasureCode(String unitMeasureCode) {
        this.unitMeasureCode = unitMeasureCode;
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
        hash += (productvendorPK != null ? productvendorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productvendor)) {
            return false;
        }
        Productvendor other = (Productvendor) object;
        if ((this.productvendorPK == null && other.productvendorPK != null) || (this.productvendorPK != null && !this.productvendorPK.equals(other.productvendorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Productvendor[ productvendorPK=" + productvendorPK + " ]";
    }

}
