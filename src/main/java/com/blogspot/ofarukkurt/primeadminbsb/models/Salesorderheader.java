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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "salesorderheader")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesorderheader.findAll", query = "SELECT s FROM Salesorderheader s"),
    @NamedQuery(name = "Salesorderheader.findBySalesOrderID", query = "SELECT s FROM Salesorderheader s WHERE s.salesOrderID = :salesOrderID"),
    @NamedQuery(name = "Salesorderheader.findByRevisionNumber", query = "SELECT s FROM Salesorderheader s WHERE s.revisionNumber = :revisionNumber"),
    @NamedQuery(name = "Salesorderheader.findByOrderDate", query = "SELECT s FROM Salesorderheader s WHERE s.orderDate = :orderDate"),
    @NamedQuery(name = "Salesorderheader.findByDueDate", query = "SELECT s FROM Salesorderheader s WHERE s.dueDate = :dueDate"),
    @NamedQuery(name = "Salesorderheader.findByShipDate", query = "SELECT s FROM Salesorderheader s WHERE s.shipDate = :shipDate"),
    @NamedQuery(name = "Salesorderheader.findByStatus", query = "SELECT s FROM Salesorderheader s WHERE s.status = :status"),
    @NamedQuery(name = "Salesorderheader.findByOnlineOrderFlag", query = "SELECT s FROM Salesorderheader s WHERE s.onlineOrderFlag = :onlineOrderFlag"),
    @NamedQuery(name = "Salesorderheader.findBySalesOrderNumber", query = "SELECT s FROM Salesorderheader s WHERE s.salesOrderNumber = :salesOrderNumber"),
    @NamedQuery(name = "Salesorderheader.findByPurchaseOrderNumber", query = "SELECT s FROM Salesorderheader s WHERE s.purchaseOrderNumber = :purchaseOrderNumber"),
    @NamedQuery(name = "Salesorderheader.findByAccountNumber", query = "SELECT s FROM Salesorderheader s WHERE s.accountNumber = :accountNumber"),
    @NamedQuery(name = "Salesorderheader.findByCreditCardApprovalCode", query = "SELECT s FROM Salesorderheader s WHERE s.creditCardApprovalCode = :creditCardApprovalCode"),
    @NamedQuery(name = "Salesorderheader.findBySubTotal", query = "SELECT s FROM Salesorderheader s WHERE s.subTotal = :subTotal"),
    @NamedQuery(name = "Salesorderheader.findByTaxAmt", query = "SELECT s FROM Salesorderheader s WHERE s.taxAmt = :taxAmt"),
    @NamedQuery(name = "Salesorderheader.findByFreight", query = "SELECT s FROM Salesorderheader s WHERE s.freight = :freight"),
    @NamedQuery(name = "Salesorderheader.findByTotalDue", query = "SELECT s FROM Salesorderheader s WHERE s.totalDue = :totalDue"),
    @NamedQuery(name = "Salesorderheader.findByComment", query = "SELECT s FROM Salesorderheader s WHERE s.comment = :comment"),
    @NamedQuery(name = "Salesorderheader.findByRowguid", query = "SELECT s FROM Salesorderheader s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Salesorderheader.findByModifiedDate", query = "SELECT s FROM Salesorderheader s WHERE s.modifiedDate = :modifiedDate")})
public class Salesorderheader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SalesOrderID")
    private Integer salesOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RevisionNumber")
    private short revisionNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DueDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Column(name = "ShipDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OnlineOrderFlag")
    private boolean onlineOrderFlag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "SalesOrderNumber")
    private String salesOrderNumber;
    @Size(max = 50)
    @Column(name = "PurchaseOrderNumber")
    private String purchaseOrderNumber;
    @Size(max = 30)
    @Column(name = "AccountNumber")
    private String accountNumber;
    @Size(max = 15)
    @Column(name = "CreditCardApprovalCode")
    private String creditCardApprovalCode;
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
    @Size(max = 128)
    @Column(name = "Comment")
    private String comment;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesorderheader")
    private List<Salesorderheadersalesreason> salesorderheadersalesreasonList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesorderheader")
    private List<Salesorderdetail> salesorderdetailList;
    @JoinColumn(name = "ShipMethodID", referencedColumnName = "ShipMethodID")
    @ManyToOne(optional = false)
    private Shipmethod shipMethodID;
    @JoinColumn(name = "TerritoryID", referencedColumnName = "TerritoryID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Salesterritory territoryID;
    @JoinColumn(name = "SalesPersonID", referencedColumnName = "BusinessEntityID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Salesperson salesPersonID;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    @ManyToOne(optional = false)
    private Customer customerID;
    @JoinColumn(name = "CurrencyRateID", referencedColumnName = "CurrencyRateID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Currencyrate currencyRateID;
    @JoinColumn(name = "CreditCardID", referencedColumnName = "CreditCardID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Creditcard creditCardID;
    @JoinColumn(name = "ShipToAddressID", referencedColumnName = "AddressID")
    @ManyToOne(optional = false)
    private Address shipToAddressID;
    @JoinColumn(name = "BillToAddressID", referencedColumnName = "AddressID")
    @ManyToOne(optional = false)
    private Address billToAddressID;

    public Salesorderheader() {
    }

    public Salesorderheader(Integer salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public Salesorderheader(Integer salesOrderID, short revisionNumber, Date orderDate, Date dueDate, short status, boolean onlineOrderFlag, String salesOrderNumber, BigDecimal subTotal, BigDecimal taxAmt, BigDecimal freight, BigDecimal totalDue, String rowguid, Date modifiedDate) {
        this.salesOrderID = salesOrderID;
        this.revisionNumber = revisionNumber;
        this.orderDate = orderDate;
        this.dueDate = dueDate;
        this.status = status;
        this.onlineOrderFlag = onlineOrderFlag;
        this.salesOrderNumber = salesOrderNumber;
        this.subTotal = subTotal;
        this.taxAmt = taxAmt;
        this.freight = freight;
        this.totalDue = totalDue;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(Integer salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public short getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(short revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public boolean getOnlineOrderFlag() {
        return onlineOrderFlag;
    }

    public void setOnlineOrderFlag(boolean onlineOrderFlag) {
        this.onlineOrderFlag = onlineOrderFlag;
    }

    public String getSalesOrderNumber() {
        return salesOrderNumber;
    }

    public void setSalesOrderNumber(String salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCreditCardApprovalCode() {
        return creditCardApprovalCode;
    }

    public void setCreditCardApprovalCode(String creditCardApprovalCode) {
        this.creditCardApprovalCode = creditCardApprovalCode;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    @XmlTransient
    public List<Salesorderheadersalesreason> getSalesorderheadersalesreasonList() {
        return salesorderheadersalesreasonList;
    }

    public void setSalesorderheadersalesreasonList(List<Salesorderheadersalesreason> salesorderheadersalesreasonList) {
        this.salesorderheadersalesreasonList = salesorderheadersalesreasonList;
    }

    @XmlTransient
    public List<Salesorderdetail> getSalesorderdetailList() {
        return salesorderdetailList;
    }

    public void setSalesorderdetailList(List<Salesorderdetail> salesorderdetailList) {
        this.salesorderdetailList = salesorderdetailList;
    }

    public Shipmethod getShipMethodID() {
        return shipMethodID;
    }

    public void setShipMethodID(Shipmethod shipMethodID) {
        this.shipMethodID = shipMethodID;
    }

    public Salesterritory getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Salesterritory territoryID) {
        this.territoryID = territoryID;
    }

    public Salesperson getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(Salesperson salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Currencyrate getCurrencyRateID() {
        return currencyRateID;
    }

    public void setCurrencyRateID(Currencyrate currencyRateID) {
        this.currencyRateID = currencyRateID;
    }

    public Creditcard getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(Creditcard creditCardID) {
        this.creditCardID = creditCardID;
    }

    public Address getShipToAddressID() {
        return shipToAddressID;
    }

    public void setShipToAddressID(Address shipToAddressID) {
        this.shipToAddressID = shipToAddressID;
    }

    public Address getBillToAddressID() {
        return billToAddressID;
    }

    public void setBillToAddressID(Address billToAddressID) {
        this.billToAddressID = billToAddressID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOrderID != null ? salesOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesorderheader)) {
            return false;
        }
        Salesorderheader other = (Salesorderheader) object;
        if ((this.salesOrderID == null && other.salesOrderID != null) || (this.salesOrderID != null && !this.salesOrderID.equals(other.salesOrderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Salesorderheader[ salesOrderID=" + salesOrderID + " ]";
    }

}
