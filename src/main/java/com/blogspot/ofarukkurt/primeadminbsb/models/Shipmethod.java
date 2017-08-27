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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "shipmethod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipmethod.findAll", query = "SELECT s FROM Shipmethod s"),
    @NamedQuery(name = "Shipmethod.findByShipMethodID", query = "SELECT s FROM Shipmethod s WHERE s.shipMethodID = :shipMethodID"),
    @NamedQuery(name = "Shipmethod.findByName", query = "SELECT s FROM Shipmethod s WHERE s.name = :name"),
    @NamedQuery(name = "Shipmethod.findByShipBase", query = "SELECT s FROM Shipmethod s WHERE s.shipBase = :shipBase"),
    @NamedQuery(name = "Shipmethod.findByShipRate", query = "SELECT s FROM Shipmethod s WHERE s.shipRate = :shipRate"),
    @NamedQuery(name = "Shipmethod.findByRowguid", query = "SELECT s FROM Shipmethod s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Shipmethod.findByModifiedDate", query = "SELECT s FROM Shipmethod s WHERE s.modifiedDate = :modifiedDate")})
public class Shipmethod implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ShipMethodID")
    private Integer shipMethodID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShipBase")
    private BigDecimal shipBase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShipRate")
    private BigDecimal shipRate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipMethodID")
    private List<Purchaseorderheader> purchaseorderheaderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipMethodID")
    private List<Salesorderheader> salesorderheaderList;

    public Shipmethod() {
    }

    public Shipmethod(Integer shipMethodID) {
        this.shipMethodID = shipMethodID;
    }

    public Shipmethod(Integer shipMethodID, String name, BigDecimal shipBase, BigDecimal shipRate, String rowguid, Date modifiedDate) {
        this.shipMethodID = shipMethodID;
        this.name = name;
        this.shipBase = shipBase;
        this.shipRate = shipRate;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getShipMethodID() {
        return shipMethodID;
    }

    public void setShipMethodID(Integer shipMethodID) {
        this.shipMethodID = shipMethodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getShipBase() {
        return shipBase;
    }

    public void setShipBase(BigDecimal shipBase) {
        this.shipBase = shipBase;
    }

    public BigDecimal getShipRate() {
        return shipRate;
    }

    public void setShipRate(BigDecimal shipRate) {
        this.shipRate = shipRate;
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
    public List<Purchaseorderheader> getPurchaseorderheaderList() {
        return purchaseorderheaderList;
    }

    public void setPurchaseorderheaderList(List<Purchaseorderheader> purchaseorderheaderList) {
        this.purchaseorderheaderList = purchaseorderheaderList;
    }

    @XmlTransient
    public List<Salesorderheader> getSalesorderheaderList() {
        return salesorderheaderList;
    }

    public void setSalesorderheaderList(List<Salesorderheader> salesorderheaderList) {
        this.salesorderheaderList = salesorderheaderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipMethodID != null ? shipMethodID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipmethod)) {
            return false;
        }
        Shipmethod other = (Shipmethod) object;
        if ((this.shipMethodID == null && other.shipMethodID != null) || (this.shipMethodID != null && !this.shipMethodID.equals(other.shipMethodID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Shipmethod[ shipMethodID=" + shipMethodID + " ]";
    }

}
