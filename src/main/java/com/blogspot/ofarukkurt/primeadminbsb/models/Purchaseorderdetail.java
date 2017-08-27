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
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LineTotal")
    private BigDecimal lineTotal;
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
    @JoinColumn(name = "PurchaseOrderID", referencedColumnName = "PurchaseOrderID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Purchaseorderheader purchaseorderheader;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Product productID;

    public Purchaseorderdetail() {
    }

    public Purchaseorderdetail(PurchaseorderdetailPK purchaseorderdetailPK) {
        this.purchaseorderdetailPK = purchaseorderdetailPK;
    }

    public Purchaseorderdetail(PurchaseorderdetailPK purchaseorderdetailPK, Date dueDate, short orderQty, BigDecimal unitPrice, BigDecimal lineTotal, BigDecimal receivedQty, BigDecimal rejectedQty, BigDecimal stockedQty, Date modifiedDate) {
        this.purchaseorderdetailPK = purchaseorderdetailPK;
        this.dueDate = dueDate;
        this.orderQty = orderQty;
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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
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

    public Purchaseorderheader getPurchaseorderheader() {
        return purchaseorderheader;
    }

    public void setPurchaseorderheader(Purchaseorderheader purchaseorderheader) {
        this.purchaseorderheader = purchaseorderheader;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Purchaseorderdetail[ purchaseorderdetailPK=" + purchaseorderdetailPK + " ]";
    }

}
