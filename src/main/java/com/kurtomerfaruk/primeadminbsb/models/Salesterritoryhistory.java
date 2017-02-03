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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "salesterritoryhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesterritoryhistory.findAll", query = "SELECT s FROM Salesterritoryhistory s"),
    @NamedQuery(name = "Salesterritoryhistory.findBySalesPersonID", query = "SELECT s FROM Salesterritoryhistory s WHERE s.salesterritoryhistoryPK.salesPersonID = :salesPersonID"),
    @NamedQuery(name = "Salesterritoryhistory.findByTerritoryID", query = "SELECT s FROM Salesterritoryhistory s WHERE s.salesterritoryhistoryPK.territoryID = :territoryID"),
    @NamedQuery(name = "Salesterritoryhistory.findByStartDate", query = "SELECT s FROM Salesterritoryhistory s WHERE s.salesterritoryhistoryPK.startDate = :startDate"),
    @NamedQuery(name = "Salesterritoryhistory.findByEndDate", query = "SELECT s FROM Salesterritoryhistory s WHERE s.endDate = :endDate"),
    @NamedQuery(name = "Salesterritoryhistory.findByModifiedDate", query = "SELECT s FROM Salesterritoryhistory s WHERE s.modifiedDate = :modifiedDate")})
public class Salesterritoryhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesterritoryhistoryPK salesterritoryhistoryPK;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
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

    public Salesterritoryhistory() {
    }

    public Salesterritoryhistory(SalesterritoryhistoryPK salesterritoryhistoryPK) {
        this.salesterritoryhistoryPK = salesterritoryhistoryPK;
    }

    public Salesterritoryhistory(SalesterritoryhistoryPK salesterritoryhistoryPK, byte[] rowguid, Date modifiedDate) {
        this.salesterritoryhistoryPK = salesterritoryhistoryPK;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Salesterritoryhistory(int salesPersonID, int territoryID, Date startDate) {
        this.salesterritoryhistoryPK = new SalesterritoryhistoryPK(salesPersonID, territoryID, startDate);
    }

    public SalesterritoryhistoryPK getSalesterritoryhistoryPK() {
        return salesterritoryhistoryPK;
    }

    public void setSalesterritoryhistoryPK(SalesterritoryhistoryPK salesterritoryhistoryPK) {
        this.salesterritoryhistoryPK = salesterritoryhistoryPK;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
        hash += (salesterritoryhistoryPK != null ? salesterritoryhistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesterritoryhistory)) {
            return false;
        }
        Salesterritoryhistory other = (Salesterritoryhistory) object;
        if ((this.salesterritoryhistoryPK == null && other.salesterritoryhistoryPK != null) || (this.salesterritoryhistoryPK != null && !this.salesterritoryhistoryPK.equals(other.salesterritoryhistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Salesterritoryhistory[ salesterritoryhistoryPK=" + salesterritoryhistoryPK + " ]";
    }

}
