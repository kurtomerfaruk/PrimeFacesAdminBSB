/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "purchaseorderheader")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Purchaseorderheader.findAll", query = "SELECT p FROM Purchaseorderheader p"),
    @NamedQuery(name = "Purchaseorderheader.findByPurchaseOrderID", query = "SELECT p FROM Purchaseorderheader p WHERE p.purchaseOrderID = :purchaseOrderID"),
    @NamedQuery(name = "Purchaseorderheader.findByRevisionNumber", query = "SELECT p FROM Purchaseorderheader p WHERE p.revisionNumber = :revisionNumber"),
    @NamedQuery(name = "Purchaseorderheader.findByStatus", query = "SELECT p FROM Purchaseorderheader p WHERE p.status = :status"),
    @NamedQuery(name = "Purchaseorderheader.findByOrderDate", query = "SELECT p FROM Purchaseorderheader p WHERE p.orderDate = :orderDate"),
    @NamedQuery(name = "Purchaseorderheader.findByShipDate", query = "SELECT p FROM Purchaseorderheader p WHERE p.shipDate = :shipDate"),
    @NamedQuery(name = "Purchaseorderheader.findBySubTotal", query = "SELECT p FROM Purchaseorderheader p WHERE p.subTotal = :subTotal"),
    @NamedQuery(name = "Purchaseorderheader.findByTaxAmt", query = "SELECT p FROM Purchaseorderheader p WHERE p.taxAmt = :taxAmt"),
    @NamedQuery(name = "Purchaseorderheader.findByFreight", query = "SELECT p FROM Purchaseorderheader p WHERE p.freight = :freight"),
    @NamedQuery(name = "Purchaseorderheader.findByTotalDue", query = "SELECT p FROM Purchaseorderheader p WHERE p.totalDue = :totalDue"),
    @NamedQuery(name = "Purchaseorderheader.findByModifiedDate", query = "SELECT p FROM Purchaseorderheader p WHERE p.modifiedDate = :modifiedDate")})
public class Purchaseorderheader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PurchaseOrderID")
    private Integer purchaseOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RevisionNumber")
    private short revisionNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "ShipDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SubTotal")
    private BigDecimal subTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TaxAmt")
    private BigDecimal taxAmt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Freight")
    private BigDecimal freight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalDue")
    private BigDecimal totalDue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "purchaseorderheader")
    private List<Purchaseorderdetail> purchaseorderdetailList;
    @JoinColumn(name = "VendorID", referencedColumnName = "BusinessEntityID")
    @ManyToOne(optional = false)
    private Vendor vendorID;
    @JoinColumn(name = "ShipMethodID", referencedColumnName = "ShipMethodID")
    @ManyToOne(optional = false)
    private Shipmethod shipMethodID;
    @JoinColumn(name = "EmployeeID", referencedColumnName = "BusinessEntityID")
    @ManyToOne(optional = false)
    private Employee employeeID;

    public Purchaseorderheader() {
    }

    public Purchaseorderheader(Integer purchaseOrderID) {
        this.purchaseOrderID = purchaseOrderID;
    }

    public Purchaseorderheader(Integer purchaseOrderID, short revisionNumber, short status, Date orderDate, BigDecimal subTotal, BigDecimal taxAmt, BigDecimal freight, BigDecimal totalDue, Date modifiedDate) {
        this.purchaseOrderID = purchaseOrderID;
        this.revisionNumber = revisionNumber;
        this.status = status;
        this.orderDate = orderDate;
        this.subTotal = subTotal;
        this.taxAmt = taxAmt;
        this.freight = freight;
        this.totalDue = totalDue;
        this.modifiedDate = modifiedDate;
    }

    public Integer getPurchaseOrderID() {
        return purchaseOrderID;
    }

    public void setPurchaseOrderID(Integer purchaseOrderID) {
        this.purchaseOrderID = purchaseOrderID;
    }

    public short getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(short revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public List<Purchaseorderdetail> getPurchaseorderdetailList() {
        return purchaseorderdetailList;
    }

    public void setPurchaseorderdetailList(List<Purchaseorderdetail> purchaseorderdetailList) {
        this.purchaseorderdetailList = purchaseorderdetailList;
    }

    public Vendor getVendorID() {
        return vendorID;
    }

    public void setVendorID(Vendor vendorID) {
        this.vendorID = vendorID;
    }

    public Shipmethod getShipMethodID() {
        return shipMethodID;
    }

    public void setShipMethodID(Shipmethod shipMethodID) {
        this.shipMethodID = shipMethodID;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseOrderID != null ? purchaseOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchaseorderheader)) {
            return false;
        }
        Purchaseorderheader other = (Purchaseorderheader) object;
        if ((this.purchaseOrderID == null && other.purchaseOrderID != null) || (this.purchaseOrderID != null && !this.purchaseOrderID.equals(other.purchaseOrderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Purchaseorderheader[ purchaseOrderID=" + purchaseOrderID + " ]";
    }

}
