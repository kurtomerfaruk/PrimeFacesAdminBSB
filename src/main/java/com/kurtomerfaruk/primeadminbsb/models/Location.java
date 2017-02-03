/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "location")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l"),
    @NamedQuery(name = "Location.findByLocationID", query = "SELECT l FROM Location l WHERE l.locationID = :locationID"),
    @NamedQuery(name = "Location.findByName", query = "SELECT l FROM Location l WHERE l.name = :name"),
    @NamedQuery(name = "Location.findByCostRate", query = "SELECT l FROM Location l WHERE l.costRate = :costRate"),
    @NamedQuery(name = "Location.findByAvailability", query = "SELECT l FROM Location l WHERE l.availability = :availability"),
    @NamedQuery(name = "Location.findByModifiedDate", query = "SELECT l FROM Location l WHERE l.modifiedDate = :modifiedDate")})
public class Location implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LocationID")
    private Integer locationID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CostRate")
    private double costRate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Availability")
    private BigDecimal availability;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Location() {
    }

    public Location(Integer locationID) {
        this.locationID = locationID;
    }

    public Location(Integer locationID, String name, double costRate, BigDecimal availability, Date modifiedDate) {
        this.locationID = locationID;
        this.name = name;
        this.costRate = costRate;
        this.availability = availability;
        this.modifiedDate = modifiedDate;
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostRate() {
        return costRate;
    }

    public void setCostRate(double costRate) {
        this.costRate = costRate;
    }

    public BigDecimal getAvailability() {
        return availability;
    }

    public void setAvailability(BigDecimal availability) {
        this.availability = availability;
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
        hash += (locationID != null ? locationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.locationID == null && other.locationID != null) || (this.locationID != null && !this.locationID.equals(other.locationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Location[ locationID=" + locationID + " ]";
    }

}
