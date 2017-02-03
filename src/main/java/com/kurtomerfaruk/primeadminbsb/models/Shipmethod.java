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
 * Created on date 27.01.2017 23:11:04
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
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShipBase")
    private double shipBase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShipRate")
    private double shipRate;
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

    public Shipmethod() {
    }

    public Shipmethod(Integer shipMethodID) {
        this.shipMethodID = shipMethodID;
    }

    public Shipmethod(Integer shipMethodID, String name, double shipBase, double shipRate, byte[] rowguid, Date modifiedDate) {
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

    public double getShipBase() {
        return shipBase;
    }

    public void setShipBase(double shipBase) {
        this.shipBase = shipBase;
    }

    public double getShipRate() {
        return shipRate;
    }

    public void setShipRate(double shipRate) {
        this.shipRate = shipRate;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Shipmethod[ shipMethodID=" + shipMethodID + " ]";
    }

}
