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
import javax.persistence.Entity;
import javax.persistence.Id;
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
    @NamedQuery(name = "Salesorderheader.findByCustomerID", query = "SELECT s FROM Salesorderheader s WHERE s.customerID = :customerID"),
    @NamedQuery(name = "Salesorderheader.findByContactID", query = "SELECT s FROM Salesorderheader s WHERE s.contactID = :contactID"),
    @NamedQuery(name = "Salesorderheader.findBySalesPersonID", query = "SELECT s FROM Salesorderheader s WHERE s.salesPersonID = :salesPersonID"),
    @NamedQuery(name = "Salesorderheader.findByTerritoryID", query = "SELECT s FROM Salesorderheader s WHERE s.territoryID = :territoryID"),
    @NamedQuery(name = "Salesorderheader.findByBillToAddressID", query = "SELECT s FROM Salesorderheader s WHERE s.billToAddressID = :billToAddressID"),
    @NamedQuery(name = "Salesorderheader.findByShipToAddressID", query = "SELECT s FROM Salesorderheader s WHERE s.shipToAddressID = :shipToAddressID"),
    @NamedQuery(name = "Salesorderheader.findByShipMethodID", query = "SELECT s FROM Salesorderheader s WHERE s.shipMethodID = :shipMethodID"),
    @NamedQuery(name = "Salesorderheader.findByCreditCardID", query = "SELECT s FROM Salesorderheader s WHERE s.creditCardID = :creditCardID"),
    @NamedQuery(name = "Salesorderheader.findByCreditCardApprovalCode", query = "SELECT s FROM Salesorderheader s WHERE s.creditCardApprovalCode = :creditCardApprovalCode"),
    @NamedQuery(name = "Salesorderheader.findByCurrencyRateID", query = "SELECT s FROM Salesorderheader s WHERE s.currencyRateID = :currencyRateID"),
    @NamedQuery(name = "Salesorderheader.findBySubTotal", query = "SELECT s FROM Salesorderheader s WHERE s.subTotal = :subTotal"),
    @NamedQuery(name = "Salesorderheader.findByTaxAmt", query = "SELECT s FROM Salesorderheader s WHERE s.taxAmt = :taxAmt"),
    @NamedQuery(name = "Salesorderheader.findByFreight", query = "SELECT s FROM Salesorderheader s WHERE s.freight = :freight"),
    @NamedQuery(name = "Salesorderheader.findByTotalDue", query = "SELECT s FROM Salesorderheader s WHERE s.totalDue = :totalDue"),
    @NamedQuery(name = "Salesorderheader.findByComment", query = "SELECT s FROM Salesorderheader s WHERE s.comment = :comment"),
    @NamedQuery(name = "Salesorderheader.findByModifiedDate", query = "SELECT s FROM Salesorderheader s WHERE s.modifiedDate = :modifiedDate")})
public class Salesorderheader implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
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
    @Basic(optional = false)
    @NotNull
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
    @Size(max = 25)
    @Column(name = "PurchaseOrderNumber")
    private String purchaseOrderNumber;
    @Size(max = 15)
    @Column(name = "AccountNumber")
    private String accountNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerID")
    private int customerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactID")
    private int contactID;
    @Column(name = "SalesPersonID")
    private Integer salesPersonID;
    @Column(name = "TerritoryID")
    private Integer territoryID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BillToAddressID")
    private int billToAddressID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShipToAddressID")
    private int shipToAddressID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShipMethodID")
    private int shipMethodID;
    @Column(name = "CreditCardID")
    private Integer creditCardID;
    @Size(max = 15)
    @Column(name = "CreditCardApprovalCode")
    private String creditCardApprovalCode;
    @Column(name = "CurrencyRateID")
    private Integer currencyRateID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SubTotal")
    private double subTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TaxAmt")
    private double taxAmt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Freight")
    private double freight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalDue")
    private double totalDue;
    @Size(max = 128)
    @Column(name = "Comment")
    private String comment;
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

    public Salesorderheader() {
    }

    public Salesorderheader(Integer salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public Salesorderheader(Integer salesOrderID, short revisionNumber, Date orderDate, Date dueDate, Date shipDate, short status, boolean onlineOrderFlag, String salesOrderNumber, int customerID, int contactID, int billToAddressID, int shipToAddressID, int shipMethodID, double subTotal, double taxAmt, double freight, double totalDue, byte[] rowguid, Date modifiedDate) {
        this.salesOrderID = salesOrderID;
        this.revisionNumber = revisionNumber;
        this.orderDate = orderDate;
        this.dueDate = dueDate;
        this.shipDate = shipDate;
        this.status = status;
        this.onlineOrderFlag = onlineOrderFlag;
        this.salesOrderNumber = salesOrderNumber;
        this.customerID = customerID;
        this.contactID = contactID;
        this.billToAddressID = billToAddressID;
        this.shipToAddressID = shipToAddressID;
        this.shipMethodID = shipMethodID;
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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public Integer getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(Integer salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public Integer getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Integer territoryID) {
        this.territoryID = territoryID;
    }

    public int getBillToAddressID() {
        return billToAddressID;
    }

    public void setBillToAddressID(int billToAddressID) {
        this.billToAddressID = billToAddressID;
    }

    public int getShipToAddressID() {
        return shipToAddressID;
    }

    public void setShipToAddressID(int shipToAddressID) {
        this.shipToAddressID = shipToAddressID;
    }

    public int getShipMethodID() {
        return shipMethodID;
    }

    public void setShipMethodID(int shipMethodID) {
        this.shipMethodID = shipMethodID;
    }

    public Integer getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(Integer creditCardID) {
        this.creditCardID = creditCardID;
    }

    public String getCreditCardApprovalCode() {
        return creditCardApprovalCode;
    }

    public void setCreditCardApprovalCode(String creditCardApprovalCode) {
        this.creditCardApprovalCode = creditCardApprovalCode;
    }

    public Integer getCurrencyRateID() {
        return currencyRateID;
    }

    public void setCurrencyRateID(Integer currencyRateID) {
        this.currencyRateID = currencyRateID;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(double totalDue) {
        this.totalDue = totalDue;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Salesorderheader[ salesOrderID=" + salesOrderID + " ]";
    }

}
