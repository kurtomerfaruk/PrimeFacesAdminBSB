/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "productvendor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productvendor.findAll", query = "SELECT p FROM Productvendor p"),
    @NamedQuery(name = "Productvendor.findByProductID", query = "SELECT p FROM Productvendor p WHERE p.productvendorPK.productID = :productID"),
    @NamedQuery(name = "Productvendor.findByBusinessEntityID", query = "SELECT p FROM Productvendor p WHERE p.productvendorPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Productvendor.findByAverageLeadTime", query = "SELECT p FROM Productvendor p WHERE p.averageLeadTime = :averageLeadTime"),
    @NamedQuery(name = "Productvendor.findByStandardPrice", query = "SELECT p FROM Productvendor p WHERE p.standardPrice = :standardPrice"),
    @NamedQuery(name = "Productvendor.findByLastReceiptCost", query = "SELECT p FROM Productvendor p WHERE p.lastReceiptCost = :lastReceiptCost"),
    @NamedQuery(name = "Productvendor.findByLastReceiptDate", query = "SELECT p FROM Productvendor p WHERE p.lastReceiptDate = :lastReceiptDate"),
    @NamedQuery(name = "Productvendor.findByMinOrderQty", query = "SELECT p FROM Productvendor p WHERE p.minOrderQty = :minOrderQty"),
    @NamedQuery(name = "Productvendor.findByMaxOrderQty", query = "SELECT p FROM Productvendor p WHERE p.maxOrderQty = :maxOrderQty"),
    @NamedQuery(name = "Productvendor.findByOnOrderQty", query = "SELECT p FROM Productvendor p WHERE p.onOrderQty = :onOrderQty"),
    @NamedQuery(name = "Productvendor.findByModifiedDate", query = "SELECT p FROM Productvendor p WHERE p.modifiedDate = :modifiedDate")})
public class Productvendor implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductvendorPK productvendorPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AverageLeadTime")
    private int averageLeadTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "StandardPrice")
    private BigDecimal standardPrice;
    @Column(name = "LastReceiptCost")
    private BigDecimal lastReceiptCost;
    @Column(name = "LastReceiptDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastReceiptDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MinOrderQty")
    private int minOrderQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaxOrderQty")
    private int maxOrderQty;
    @Column(name = "OnOrderQty")
    private Integer onOrderQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vendor vendor;
    @JoinColumn(name = "UnitMeasureCode", referencedColumnName = "UnitMeasureCode")
    @ManyToOne(optional = false)
    private Unitmeasure unitMeasureCode;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public Productvendor() {
    }

    public Productvendor(ProductvendorPK productvendorPK) {
        this.productvendorPK = productvendorPK;
    }

    public Productvendor(ProductvendorPK productvendorPK, int averageLeadTime, BigDecimal standardPrice, int minOrderQty, int maxOrderQty, Date modifiedDate) {
        this.productvendorPK = productvendorPK;
        this.averageLeadTime = averageLeadTime;
        this.standardPrice = standardPrice;
        this.minOrderQty = minOrderQty;
        this.maxOrderQty = maxOrderQty;
        this.modifiedDate = modifiedDate;
    }

    public Productvendor(int productID, int businessEntityID) {
        this.productvendorPK = new ProductvendorPK(productID, businessEntityID);
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

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    public BigDecimal getLastReceiptCost() {
        return lastReceiptCost;
    }

    public void setLastReceiptCost(BigDecimal lastReceiptCost) {
        this.lastReceiptCost = lastReceiptCost;
    }

    public Date getLastReceiptDate() {
        return lastReceiptDate;
    }

    public void setLastReceiptDate(Date lastReceiptDate) {
        this.lastReceiptDate = lastReceiptDate;
    }

    public int getMinOrderQty() {
        return minOrderQty;
    }

    public void setMinOrderQty(int minOrderQty) {
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

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Unitmeasure getUnitMeasureCode() {
        return unitMeasureCode;
    }

    public void setUnitMeasureCode(Unitmeasure unitMeasureCode) {
        this.unitMeasureCode = unitMeasureCode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productvendor[ productvendorPK=" + productvendorPK + " ]";
    }

}
