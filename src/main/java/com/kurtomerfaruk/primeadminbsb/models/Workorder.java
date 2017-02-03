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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:05
 */
@Entity
@Table(name = "workorder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Workorder.findAll", query = "SELECT w FROM Workorder w"),
    @NamedQuery(name = "Workorder.findByWorkOrderID", query = "SELECT w FROM Workorder w WHERE w.workOrderID = :workOrderID"),
    @NamedQuery(name = "Workorder.findByProductID", query = "SELECT w FROM Workorder w WHERE w.productID = :productID"),
    @NamedQuery(name = "Workorder.findByOrderQty", query = "SELECT w FROM Workorder w WHERE w.orderQty = :orderQty"),
    @NamedQuery(name = "Workorder.findByStockedQty", query = "SELECT w FROM Workorder w WHERE w.stockedQty = :stockedQty"),
    @NamedQuery(name = "Workorder.findByScrappedQty", query = "SELECT w FROM Workorder w WHERE w.scrappedQty = :scrappedQty"),
    @NamedQuery(name = "Workorder.findByStartDate", query = "SELECT w FROM Workorder w WHERE w.startDate = :startDate"),
    @NamedQuery(name = "Workorder.findByEndDate", query = "SELECT w FROM Workorder w WHERE w.endDate = :endDate"),
    @NamedQuery(name = "Workorder.findByDueDate", query = "SELECT w FROM Workorder w WHERE w.dueDate = :dueDate"),
    @NamedQuery(name = "Workorder.findByScrapReasonID", query = "SELECT w FROM Workorder w WHERE w.scrapReasonID = :scrapReasonID"),
    @NamedQuery(name = "Workorder.findByModifiedDate", query = "SELECT w FROM Workorder w WHERE w.modifiedDate = :modifiedDate")})
public class Workorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WorkOrderID")
    private Integer workOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderQty")
    private int orderQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StockedQty")
    private int stockedQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ScrappedQty")
    private short scrappedQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DueDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Column(name = "ScrapReasonID")
    private Short scrapReasonID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Workorder() {
    }

    public Workorder(Integer workOrderID) {
        this.workOrderID = workOrderID;
    }

    public Workorder(Integer workOrderID, int productID, int orderQty, int stockedQty, short scrappedQty, Date startDate, Date dueDate, Date modifiedDate) {
        this.workOrderID = workOrderID;
        this.productID = productID;
        this.orderQty = orderQty;
        this.stockedQty = stockedQty;
        this.scrappedQty = scrappedQty;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getWorkOrderID() {
        return workOrderID;
    }

    public void setWorkOrderID(Integer workOrderID) {
        this.workOrderID = workOrderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public int getStockedQty() {
        return stockedQty;
    }

    public void setStockedQty(int stockedQty) {
        this.stockedQty = stockedQty;
    }

    public short getScrappedQty() {
        return scrappedQty;
    }

    public void setScrappedQty(short scrappedQty) {
        this.scrappedQty = scrappedQty;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Short getScrapReasonID() {
        return scrapReasonID;
    }

    public void setScrapReasonID(Short scrapReasonID) {
        this.scrapReasonID = scrapReasonID;
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
        hash += (workOrderID != null ? workOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workorder)) {
            return false;
        }
        Workorder other = (Workorder) object;
        if ((this.workOrderID == null && other.workOrderID != null) || (this.workOrderID != null && !this.workOrderID.equals(other.workOrderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Workorder[ workOrderID=" + workOrderID + " ]";
    }

}
