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
import javax.persistence.Lob;
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
 * Created on date 27.01.2017 23:11:05
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
    @NamedQuery(name = "Salesorderdetail.findByProductID", query = "SELECT s FROM Salesorderdetail s WHERE s.productID = :productID"),
    @NamedQuery(name = "Salesorderdetail.findBySpecialOfferID", query = "SELECT s FROM Salesorderdetail s WHERE s.specialOfferID = :specialOfferID"),
    @NamedQuery(name = "Salesorderdetail.findByUnitPrice", query = "SELECT s FROM Salesorderdetail s WHERE s.unitPrice = :unitPrice"),
    @NamedQuery(name = "Salesorderdetail.findByUnitPriceDiscount", query = "SELECT s FROM Salesorderdetail s WHERE s.unitPriceDiscount = :unitPriceDiscount"),
    @NamedQuery(name = "Salesorderdetail.findByLineTotal", query = "SELECT s FROM Salesorderdetail s WHERE s.lineTotal = :lineTotal"),
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SpecialOfferID")
    private int specialOfferID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPrice")
    private double unitPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPriceDiscount")
    private double unitPriceDiscount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LineTotal")
    private double lineTotal;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Salesorderdetail() {
    }

    public Salesorderdetail(SalesorderdetailPK salesorderdetailPK) {
        this.salesorderdetailPK = salesorderdetailPK;
    }

    public Salesorderdetail(SalesorderdetailPK salesorderdetailPK, short orderQty, int productID, int specialOfferID, double unitPrice, double unitPriceDiscount, double lineTotal, byte[] rowguid, Date modifiedDate) {
        this.salesorderdetailPK = salesorderdetailPK;
        this.orderQty = orderQty;
        this.productID = productID;
        this.specialOfferID = specialOfferID;
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

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getSpecialOfferID() {
        return specialOfferID;
    }

    public void setSpecialOfferID(int specialOfferID) {
        this.specialOfferID = specialOfferID;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPriceDiscount() {
        return unitPriceDiscount;
    }

    public void setUnitPriceDiscount(double unitPriceDiscount) {
        this.unitPriceDiscount = unitPriceDiscount;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Salesorderdetail[ salesorderdetailPK=" + salesorderdetailPK + " ]";
    }

}
