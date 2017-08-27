/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
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
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "workorder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Workorder.findAll", query = "SELECT w FROM Workorder w"),
    @NamedQuery(name = "Workorder.findByWorkOrderID", query = "SELECT w FROM Workorder w WHERE w.workOrderID = :workOrderID"),
    @NamedQuery(name = "Workorder.findByOrderQty", query = "SELECT w FROM Workorder w WHERE w.orderQty = :orderQty"),
    @NamedQuery(name = "Workorder.findByStockedQty", query = "SELECT w FROM Workorder w WHERE w.stockedQty = :stockedQty"),
    @NamedQuery(name = "Workorder.findByScrappedQty", query = "SELECT w FROM Workorder w WHERE w.scrappedQty = :scrappedQty"),
    @NamedQuery(name = "Workorder.findByStartDate", query = "SELECT w FROM Workorder w WHERE w.startDate = :startDate"),
    @NamedQuery(name = "Workorder.findByEndDate", query = "SELECT w FROM Workorder w WHERE w.endDate = :endDate"),
    @NamedQuery(name = "Workorder.findByDueDate", query = "SELECT w FROM Workorder w WHERE w.dueDate = :dueDate"),
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workorder")
    private List<Workorderrouting> workorderroutingList;
    @JoinColumn(name = "ScrapReasonID", referencedColumnName = "ScrapReasonID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Scrapreason scrapReasonID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Product productID;

    public Workorder() {
    }

    public Workorder(Integer workOrderID) {
        this.workOrderID = workOrderID;
    }

    public Workorder(Integer workOrderID, int orderQty, int stockedQty, short scrappedQty, Date startDate, Date dueDate, Date modifiedDate) {
        this.workOrderID = workOrderID;
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

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public List<Workorderrouting> getWorkorderroutingList() {
        return workorderroutingList;
    }

    public void setWorkorderroutingList(List<Workorderrouting> workorderroutingList) {
        this.workorderroutingList = workorderroutingList;
    }

    public Scrapreason getScrapReasonID() {
        return scrapReasonID;
    }

    public void setScrapReasonID(Scrapreason scrapReasonID) {
        this.scrapReasonID = scrapReasonID;
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Workorder[ workOrderID=" + workOrderID + " ]";
    }

}
