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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @Created on date 10/08/2017 19:30:19 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "transactionhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transactionhistory.findAll", query = "SELECT t FROM Transactionhistory t"),
    @NamedQuery(name = "Transactionhistory.findByTransactionID", query = "SELECT t FROM Transactionhistory t WHERE t.transactionID = :transactionID"),
    @NamedQuery(name = "Transactionhistory.findByReferenceOrderID", query = "SELECT t FROM Transactionhistory t WHERE t.referenceOrderID = :referenceOrderID"),
    @NamedQuery(name = "Transactionhistory.findByReferenceOrderLineID", query = "SELECT t FROM Transactionhistory t WHERE t.referenceOrderLineID = :referenceOrderLineID"),
    @NamedQuery(name = "Transactionhistory.findByTransactionDate", query = "SELECT t FROM Transactionhistory t WHERE t.transactionDate = :transactionDate"),
    @NamedQuery(name = "Transactionhistory.findByTransactionType", query = "SELECT t FROM Transactionhistory t WHERE t.transactionType = :transactionType"),
    @NamedQuery(name = "Transactionhistory.findByQuantity", query = "SELECT t FROM Transactionhistory t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "Transactionhistory.findByActualCost", query = "SELECT t FROM Transactionhistory t WHERE t.actualCost = :actualCost"),
    @NamedQuery(name = "Transactionhistory.findByModifiedDate", query = "SELECT t FROM Transactionhistory t WHERE t.modifiedDate = :modifiedDate")})
public class Transactionhistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TransactionID")
    private Integer transactionID;
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
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Product productID;

    public Transactionhistory() {
    }

    public Transactionhistory(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public Transactionhistory(Integer transactionID, int referenceOrderID, int referenceOrderLineID, Date transactionDate, Character transactionType, int quantity, BigDecimal actualCost, Date modifiedDate) {
        this.transactionID = transactionID;
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

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
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
        if (!(object instanceof Transactionhistory)) {
            return false;
        }
        Transactionhistory other = (Transactionhistory) object;
        if ((this.transactionID == null && other.transactionID != null) || (this.transactionID != null && !this.transactionID.equals(other.transactionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Transactionhistory[ transactionID=" + transactionID + " ]";
    }

}
