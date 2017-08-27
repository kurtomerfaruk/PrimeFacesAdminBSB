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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "salesorderheadersalesreason")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesorderheadersalesreason.findAll", query = "SELECT s FROM Salesorderheadersalesreason s"),
    @NamedQuery(name = "Salesorderheadersalesreason.findBySalesOrderID", query = "SELECT s FROM Salesorderheadersalesreason s WHERE s.salesorderheadersalesreasonPK.salesOrderID = :salesOrderID"),
    @NamedQuery(name = "Salesorderheadersalesreason.findBySalesReasonID", query = "SELECT s FROM Salesorderheadersalesreason s WHERE s.salesorderheadersalesreasonPK.salesReasonID = :salesReasonID"),
    @NamedQuery(name = "Salesorderheadersalesreason.findByModifiedDate", query = "SELECT s FROM Salesorderheadersalesreason s WHERE s.modifiedDate = :modifiedDate")})
public class Salesorderheadersalesreason implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesorderheadersalesreasonPK salesorderheadersalesreasonPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "SalesReasonID", referencedColumnName = "SalesReasonID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Salesreason salesreason;
    @JoinColumn(name = "SalesOrderID", referencedColumnName = "SalesOrderID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Salesorderheader salesorderheader;

    public Salesorderheadersalesreason() {
    }

    public Salesorderheadersalesreason(SalesorderheadersalesreasonPK salesorderheadersalesreasonPK) {
        this.salesorderheadersalesreasonPK = salesorderheadersalesreasonPK;
    }

    public Salesorderheadersalesreason(SalesorderheadersalesreasonPK salesorderheadersalesreasonPK, Date modifiedDate) {
        this.salesorderheadersalesreasonPK = salesorderheadersalesreasonPK;
        this.modifiedDate = modifiedDate;
    }

    public Salesorderheadersalesreason(int salesOrderID, int salesReasonID) {
        this.salesorderheadersalesreasonPK = new SalesorderheadersalesreasonPK(salesOrderID, salesReasonID);
    }

    public SalesorderheadersalesreasonPK getSalesorderheadersalesreasonPK() {
        return salesorderheadersalesreasonPK;
    }

    public void setSalesorderheadersalesreasonPK(SalesorderheadersalesreasonPK salesorderheadersalesreasonPK) {
        this.salesorderheadersalesreasonPK = salesorderheadersalesreasonPK;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Salesreason getSalesreason() {
        return salesreason;
    }

    public void setSalesreason(Salesreason salesreason) {
        this.salesreason = salesreason;
    }

    public Salesorderheader getSalesorderheader() {
        return salesorderheader;
    }

    public void setSalesorderheader(Salesorderheader salesorderheader) {
        this.salesorderheader = salesorderheader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesorderheadersalesreasonPK != null ? salesorderheadersalesreasonPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesorderheadersalesreason)) {
            return false;
        }
        Salesorderheadersalesreason other = (Salesorderheadersalesreason) object;
        if ((this.salesorderheadersalesreasonPK == null && other.salesorderheadersalesreasonPK != null) || (this.salesorderheadersalesreasonPK != null && !this.salesorderheadersalesreasonPK.equals(other.salesorderheadersalesreasonPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Salesorderheadersalesreason[ salesorderheadersalesreasonPK=" + salesorderheadersalesreasonPK + " ]";
    }

}
