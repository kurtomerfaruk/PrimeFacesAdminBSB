/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "salesterritoryhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesterritoryhistory.findAll", query = "SELECT s FROM Salesterritoryhistory s"),
    @NamedQuery(name = "Salesterritoryhistory.findByBusinessEntityID", query = "SELECT s FROM Salesterritoryhistory s WHERE s.salesterritoryhistoryPK.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Salesterritoryhistory.findByTerritoryID", query = "SELECT s FROM Salesterritoryhistory s WHERE s.salesterritoryhistoryPK.territoryID = :territoryID"),
    @NamedQuery(name = "Salesterritoryhistory.findByStartDate", query = "SELECT s FROM Salesterritoryhistory s WHERE s.salesterritoryhistoryPK.startDate = :startDate"),
    @NamedQuery(name = "Salesterritoryhistory.findByEndDate", query = "SELECT s FROM Salesterritoryhistory s WHERE s.endDate = :endDate"),
    @NamedQuery(name = "Salesterritoryhistory.findByRowguid", query = "SELECT s FROM Salesterritoryhistory s WHERE s.rowguid = :rowguid"),
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
    @Size(min = 1, max = 64)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "TerritoryID", referencedColumnName = "TerritoryID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Salesterritory salesterritory;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Salesperson salesperson;

    public Salesterritoryhistory() {
    }

    public Salesterritoryhistory(SalesterritoryhistoryPK salesterritoryhistoryPK) {
        this.salesterritoryhistoryPK = salesterritoryhistoryPK;
    }

    public Salesterritoryhistory(SalesterritoryhistoryPK salesterritoryhistoryPK, String rowguid, Date modifiedDate) {
        this.salesterritoryhistoryPK = salesterritoryhistoryPK;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Salesterritoryhistory(int businessEntityID, int territoryID, Date startDate) {
        this.salesterritoryhistoryPK = new SalesterritoryhistoryPK(businessEntityID, territoryID, startDate);
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

    public Salesterritory getSalesterritory() {
        return salesterritory;
    }

    public void setSalesterritory(Salesterritory salesterritory) {
        this.salesterritory = salesterritory;
    }

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Salesterritoryhistory[ salesterritoryhistoryPK=" + salesterritoryhistoryPK + " ]";
    }

}
