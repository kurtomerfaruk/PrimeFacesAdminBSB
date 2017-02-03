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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
 * Created on date 27.01.2017 23:11:03
 */
@Entity
@Table(name = "workorderrouting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Workorderrouting.findAll", query = "SELECT w FROM Workorderrouting w"),
    @NamedQuery(name = "Workorderrouting.findByWorkOrderID", query = "SELECT w FROM Workorderrouting w WHERE w.workorderroutingPK.workOrderID = :workOrderID"),
    @NamedQuery(name = "Workorderrouting.findByProductID", query = "SELECT w FROM Workorderrouting w WHERE w.workorderroutingPK.productID = :productID"),
    @NamedQuery(name = "Workorderrouting.findByOperationSequence", query = "SELECT w FROM Workorderrouting w WHERE w.workorderroutingPK.operationSequence = :operationSequence"),
    @NamedQuery(name = "Workorderrouting.findByLocationID", query = "SELECT w FROM Workorderrouting w WHERE w.locationID = :locationID"),
    @NamedQuery(name = "Workorderrouting.findByScheduledStartDate", query = "SELECT w FROM Workorderrouting w WHERE w.scheduledStartDate = :scheduledStartDate"),
    @NamedQuery(name = "Workorderrouting.findByScheduledEndDate", query = "SELECT w FROM Workorderrouting w WHERE w.scheduledEndDate = :scheduledEndDate"),
    @NamedQuery(name = "Workorderrouting.findByActualStartDate", query = "SELECT w FROM Workorderrouting w WHERE w.actualStartDate = :actualStartDate"),
    @NamedQuery(name = "Workorderrouting.findByActualEndDate", query = "SELECT w FROM Workorderrouting w WHERE w.actualEndDate = :actualEndDate"),
    @NamedQuery(name = "Workorderrouting.findByActualResourceHrs", query = "SELECT w FROM Workorderrouting w WHERE w.actualResourceHrs = :actualResourceHrs"),
    @NamedQuery(name = "Workorderrouting.findByPlannedCost", query = "SELECT w FROM Workorderrouting w WHERE w.plannedCost = :plannedCost"),
    @NamedQuery(name = "Workorderrouting.findByActualCost", query = "SELECT w FROM Workorderrouting w WHERE w.actualCost = :actualCost"),
    @NamedQuery(name = "Workorderrouting.findByModifiedDate", query = "SELECT w FROM Workorderrouting w WHERE w.modifiedDate = :modifiedDate")})
public class Workorderrouting implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkorderroutingPK workorderroutingPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LocationID")
    private short locationID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ScheduledStartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledStartDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ScheduledEndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledEndDate;
    @Column(name = "ActualStartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualStartDate;
    @Column(name = "ActualEndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualEndDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ActualResourceHrs")
    private BigDecimal actualResourceHrs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PlannedCost")
    private double plannedCost;
    @Column(name = "ActualCost")
    private Double actualCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Workorderrouting() {
    }

    public Workorderrouting(WorkorderroutingPK workorderroutingPK) {
        this.workorderroutingPK = workorderroutingPK;
    }

    public Workorderrouting(WorkorderroutingPK workorderroutingPK, short locationID, Date scheduledStartDate, Date scheduledEndDate, double plannedCost, Date modifiedDate) {
        this.workorderroutingPK = workorderroutingPK;
        this.locationID = locationID;
        this.scheduledStartDate = scheduledStartDate;
        this.scheduledEndDate = scheduledEndDate;
        this.plannedCost = plannedCost;
        this.modifiedDate = modifiedDate;
    }

    public Workorderrouting(int workOrderID, int productID, short operationSequence) {
        this.workorderroutingPK = new WorkorderroutingPK(workOrderID, productID, operationSequence);
    }

    public WorkorderroutingPK getWorkorderroutingPK() {
        return workorderroutingPK;
    }

    public void setWorkorderroutingPK(WorkorderroutingPK workorderroutingPK) {
        this.workorderroutingPK = workorderroutingPK;
    }

    public short getLocationID() {
        return locationID;
    }

    public void setLocationID(short locationID) {
        this.locationID = locationID;
    }

    public Date getScheduledStartDate() {
        return scheduledStartDate;
    }

    public void setScheduledStartDate(Date scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }

    public Date getScheduledEndDate() {
        return scheduledEndDate;
    }

    public void setScheduledEndDate(Date scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public BigDecimal getActualResourceHrs() {
        return actualResourceHrs;
    }

    public void setActualResourceHrs(BigDecimal actualResourceHrs) {
        this.actualResourceHrs = actualResourceHrs;
    }

    public double getPlannedCost() {
        return plannedCost;
    }

    public void setPlannedCost(double plannedCost) {
        this.plannedCost = plannedCost;
    }

    public Double getActualCost() {
        return actualCost;
    }

    public void setActualCost(Double actualCost) {
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
        hash += (workorderroutingPK != null ? workorderroutingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workorderrouting)) {
            return false;
        }
        Workorderrouting other = (Workorderrouting) object;
        if ((this.workorderroutingPK == null && other.workorderroutingPK != null) || (this.workorderroutingPK != null && !this.workorderroutingPK.equals(other.workorderroutingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Workorderrouting[ workorderroutingPK=" + workorderroutingPK + " ]";
    }

}
