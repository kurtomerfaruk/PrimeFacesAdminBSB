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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "salesorderdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesorderdetail.findAll", query = "SELECT s FROM Salesorderdetail s"),
    @NamedQuery(name = "Salesorderdetail.findBySalesOrderID", query = "SELECT s FROM Salesorderdetail s WHERE s.salesorderdetailPK.salesOrderID = :salesOrderID"),
    @NamedQuery(name = "Salesorderdetail.findBySalesOrderDetailID", query = "SELECT s FROM Salesorderdetail s WHERE s.salesorderdetailPK.salesOrderDetailID = :salesOrderDetailID"),
    @NamedQuery(name = "Salesorderdetail.findByCarrierTrackingNumber", query = "SELECT s FROM Salesorderdetail s WHERE s.carrierTrackingNumber = :carrierTrackingNumber"),
    @NamedQuery(name = "Salesorderdetail.findByOrderQty", query = "SELECT s FROM Salesorderdetail s WHERE s.orderQty = :orderQty"),
    @NamedQuery(name = "Salesorderdetail.findByUnitPrice", query = "SELECT s FROM Salesorderdetail s WHERE s.unitPrice = :unitPrice"),
    @NamedQuery(name = "Salesorderdetail.findByUnitPriceDiscount", query = "SELECT s FROM Salesorderdetail s WHERE s.unitPriceDiscount = :unitPriceDiscount"),
    @NamedQuery(name = "Salesorderdetail.findByLineTotal", query = "SELECT s FROM Salesorderdetail s WHERE s.lineTotal = :lineTotal"),
    @NamedQuery(name = "Salesorderdetail.findByRowguid", query = "SELECT s FROM Salesorderdetail s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Salesorderdetail.findByModifiedDate", query = "SELECT s FROM Salesorderdetail s WHERE s.modifiedDate = :modifiedDate")})
public class Salesorderdetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesorderdetailPK salesorderdetailPK;
    @Size(max = 25)
    @Column(name = "CarrierTrackingNumber")
    private String carrierTrackingNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderQty")
    private short orderQty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPriceDiscount")
    private BigDecimal unitPriceDiscount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LineTotal")
    private BigDecimal lineTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumns({
        @JoinColumn(name = "SpecialOfferID", referencedColumnName = "SpecialOfferID"),
        @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")})
    @ManyToOne(optional = false)
    private Specialofferproduct specialofferproduct;
    @JoinColumn(name = "SalesOrderID", referencedColumnName = "SalesOrderID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Salesorderheader salesorderheader;

    public Salesorderdetail() {
    }

    public Salesorderdetail(SalesorderdetailPK salesorderdetailPK) {
        this.salesorderdetailPK = salesorderdetailPK;
    }

    public Salesorderdetail(SalesorderdetailPK salesorderdetailPK, short orderQty, BigDecimal unitPrice, BigDecimal unitPriceDiscount, BigDecimal lineTotal, String rowguid, Date modifiedDate) {
        this.salesorderdetailPK = salesorderdetailPK;
        this.orderQty = orderQty;
        this.unitPrice = unitPrice;
        this.unitPriceDiscount = unitPriceDiscount;
        this.lineTotal = lineTotal;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Salesorderdetail(int salesOrderID, int salesOrderDetailID) {
        this.salesorderdetailPK = new SalesorderdetailPK(salesOrderID, salesOrderDetailID);
    }

    public SalesorderdetailPK getSalesorderdetailPK() {
        return salesorderdetailPK;
    }

    public void setSalesorderdetailPK(SalesorderdetailPK salesorderdetailPK) {
        this.salesorderdetailPK = salesorderdetailPK;
    }

    public String getCarrierTrackingNumber() {
        return carrierTrackingNumber;
    }

    public void setCarrierTrackingNumber(String carrierTrackingNumber) {
        this.carrierTrackingNumber = carrierTrackingNumber;
    }

    public short getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(short orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPriceDiscount() {
        return unitPriceDiscount;
    }

    public void setUnitPriceDiscount(BigDecimal unitPriceDiscount) {
        this.unitPriceDiscount = unitPriceDiscount;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Specialofferproduct getSpecialofferproduct() {
        return specialofferproduct;
    }

    public void setSpecialofferproduct(Specialofferproduct specialofferproduct) {
        this.specialofferproduct = specialofferproduct;
    }

    public Salesorderheader getSalesorderheader() {
        return salesorderheader;
    }

    public void setSalesorderheader(Salesorderheader salesorderheader) {
        this.salesorderheader = salesorderheader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesorderdetailPK != null ? salesorderdetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesorderdetail)) {
            return false;
        }
        Salesorderdetail other = (Salesorderdetail) object;
        if ((this.salesorderdetailPK == null && other.salesorderdetailPK != null) || (this.salesorderdetailPK != null && !this.salesorderdetailPK.equals(other.salesorderdetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Salesorderdetail[ salesorderdetailPK=" + salesorderdetailPK + " ]";
    }

}
