/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "purchaseorderdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Purchaseorderdetail.findAll", query = "SELECT p FROM Purchaseorderdetail p"),
    @NamedQuery(name = "Purchaseorderdetail.findByPurchaseOrderID", query = "SELECT p FROM Purchaseorderdetail p WHERE p.purchaseorderdetailPK.purchaseOrderID = :purchaseOrderID"),
    @NamedQuery(name = "Purchaseorderdetail.findByPurchaseOrderDetailID", query = "SELECT p FROM Purchaseorderdetail p WHERE p.purchaseorderdetailPK.purchaseOrderDetailID = :purchaseOrderDetailID"),
    @NamedQuery(name = "Purchaseorderdetail.findByDueDate", query = "SELECT p FROM Purchaseorderdetail p WHERE p.dueDate = :dueDate"),
    @NamedQuery(name = "Purchaseorderdetail.findByOrderQty", query = "SELECT p FROM Purchaseorderdetail p WHERE p.orderQty = :orderQty"),
    @NamedQuery(name = "Purchaseorderdetail.findByProductID", query = "SELECT p FROM Purchaseorderdetail p WHERE p.productID = :productID"),
    @NamedQuery(name = "Purchaseorderdetail.findByUnitPrice", query = "SELECT p FROM Purchaseorderdetail p WHERE p.unitPrice = :unitPrice"),
    @NamedQuery(name = "Purchaseorderdetail.findByLineTotal", query = "SELECT p FROM Purchaseorderdetail p WHERE p.lineTotal = :lineTotal"),
    @NamedQuery(name = "Purchaseorderdetail.findByReceivedQty", query = "SELECT p FROM Purchaseorderdetail p WHERE p.receivedQty = :receivedQty"),
    @NamedQuery(name = "Purchaseorderdetail.findByRejectedQty", query = "SELECT p FROM Purchaseorderdetail p WHERE p.rejectedQty = :rejectedQty"),
    @NamedQuery(name = "Purchaseorderdetail.findByStockedQty", query = "SELECT p FROM Purchaseorderdetail p WHERE p.stockedQty = :stockedQty"),
    @NamedQuery(name = "Purchaseorderdetail.findByModifiedDate", query = "SELECT p FROM Purchaseorderdetail p WHERE p.modifiedDate = :modifiedDate")})
public class Purchaseorderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PurchaseorderdetailPK purchaseorderdetailPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DueDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
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
    @Column(name = "UnitPrice")
    private double unitPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LineTotal")
    private double lineTotal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReceivedQty")
    private BigDecimal receivedQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RejectedQty")
    private BigDecimal rejectedQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StockedQty")
    private BigDecimal stockedQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Purchaseorderdetail() {
    }

    public Purchaseorderdetail(PurchaseorderdetailPK purchaseorderdetailPK) {
        this.purchaseorderdetailPK = purchaseorderdetailPK;
    }

    public Purchaseorderdetail(PurchaseorderdetailPK purchaseorderdetailPK, Date dueDate, short orderQty, int productID, double unitPrice, double lineTotal, BigDecimal receivedQty, BigDecimal rejectedQty, BigDecimal stockedQty, Date modifiedDate) {
        this.purchaseorderdetailPK = purchaseorderdetailPK;
        this.dueDate = dueDate;
        this.orderQty = orderQty;
        this.productID = productID;
        this.unitPrice = unitPrice;
        this.lineTotal = lineTotal;
        this.receivedQty = receivedQty;
        this.rejectedQty = rejectedQty;
        this.stockedQty = stockedQty;
        this.modifiedDate = modifiedDate;
    }

    public Purchaseorderdetail(int purchaseOrderID, int purchaseOrderDetailID) {
        this.purchaseorderdetailPK = new PurchaseorderdetailPK(purchaseOrderID, purchaseOrderDetailID);
    }

    public PurchaseorderdetailPK getPurchaseorderdetailPK() {
        return purchaseorderdetailPK;
    }

    public void setPurchaseorderdetailPK(PurchaseorderdetailPK purchaseorderdetailPK) {
        this.purchaseorderdetailPK = purchaseorderdetailPK;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

    public BigDecimal getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(BigDecimal receivedQty) {
        this.receivedQty = receivedQty;
    }

    public BigDecimal getRejectedQty() {
        return rejectedQty;
    }

    public void setRejectedQty(BigDecimal rejectedQty) {
        this.rejectedQty = rejectedQty;
    }

    public BigDecimal getStockedQty() {
        return stockedQty;
    }

    public void setStockedQty(BigDecimal stockedQty) {
        this.stockedQty = stockedQty;
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
        hash += (purchaseorderdetailPK != null ? purchaseorderdetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchaseorderdetail)) {
            return false;
        }
        Purchaseorderdetail other = (Purchaseorderdetail) object;
        if ((this.purchaseorderdetailPK == null && other.purchaseorderdetailPK != null) || (this.purchaseorderdetailPK != null && !this.purchaseorderdetailPK.equals(other.purchaseorderdetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Purchaseorderdetail[ purchaseorderdetailPK=" + purchaseorderdetailPK + " ]";
    }

}
