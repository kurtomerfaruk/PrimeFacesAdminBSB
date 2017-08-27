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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "transactionhistoryarchive")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transactionhistoryarchive.findAll", query = "SELECT t FROM Transactionhistoryarchive t"),
    @NamedQuery(name = "Transactionhistoryarchive.findByTransactionID", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.transactionID = :transactionID"),
    @NamedQuery(name = "Transactionhistoryarchive.findByProductID", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.productID = :productID"),
    @NamedQuery(name = "Transactionhistoryarchive.findByReferenceOrderID", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.referenceOrderID = :referenceOrderID"),
    @NamedQuery(name = "Transactionhistoryarchive.findByReferenceOrderLineID", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.referenceOrderLineID = :referenceOrderLineID"),
    @NamedQuery(name = "Transactionhistoryarchive.findByTransactionDate", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.transactionDate = :transactionDate"),
    @NamedQuery(name = "Transactionhistoryarchive.findByTransactionType", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.transactionType = :transactionType"),
    @NamedQuery(name = "Transactionhistoryarchive.findByQuantity", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "Transactionhistoryarchive.findByActualCost", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.actualCost = :actualCost"),
    @NamedQuery(name = "Transactionhistoryarchive.findByModifiedDate", query = "SELECT t FROM Transactionhistoryarchive t WHERE t.modifiedDate = :modifiedDate")})
public class Transactionhistoryarchive implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransactionID")
    private Integer transactionID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReferenceOrderID")
    private int referenceOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReferenceOrderLineID")
    private int referenceOrderLineID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransactionDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransactionType")
    private Character transactionType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ActualCost")
    private BigDecimal actualCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Transactionhistoryarchive() {
    }

    public Transactionhistoryarchive(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public Transactionhistoryarchive(Integer transactionID, int productID, int referenceOrderID, int referenceOrderLineID, Date transactionDate, Character transactionType, int quantity, BigDecimal actualCost, Date modifiedDate) {
        this.transactionID = transactionID;
        this.productID = productID;
        this.referenceOrderID = referenceOrderID;
        this.referenceOrderLineID = referenceOrderLineID;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.quantity = quantity;
        this.actualCost = actualCost;
        this.modifiedDate = modifiedDate;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getReferenceOrderID() {
        return referenceOrderID;
    }

    public void setReferenceOrderID(int referenceOrderID) {
        this.referenceOrderID = referenceOrderID;
    }

    public int getReferenceOrderLineID() {
        return referenceOrderLineID;
    }

    public void setReferenceOrderLineID(int referenceOrderLineID) {
        this.referenceOrderLineID = referenceOrderLineID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Character getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Character transactionType) {
        this.transactionType = transactionType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
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
        hash += (transactionID != null ? transactionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactionhistoryarchive)) {
            return false;
        }
        Transactionhistoryarchive other = (Transactionhistoryarchive) object;
        if ((this.transactionID == null && other.transactionID != null) || (this.transactionID != null && !this.transactionID.equals(other.transactionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Transactionhistoryarchive[ transactionID=" + transactionID + " ]";
    }

}
