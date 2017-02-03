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
@Table(name = "salestaxrate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salestaxrate.findAll", query = "SELECT s FROM Salestaxrate s"),
    @NamedQuery(name = "Salestaxrate.findBySalesTaxRateID", query = "SELECT s FROM Salestaxrate s WHERE s.salesTaxRateID = :salesTaxRateID"),
    @NamedQuery(name = "Salestaxrate.findByStateProvinceID", query = "SELECT s FROM Salestaxrate s WHERE s.stateProvinceID = :stateProvinceID"),
    @NamedQuery(name = "Salestaxrate.findByTaxType", query = "SELECT s FROM Salestaxrate s WHERE s.taxType = :taxType"),
    @NamedQuery(name = "Salestaxrate.findByTaxRate", query = "SELECT s FROM Salestaxrate s WHERE s.taxRate = :taxRate"),
    @NamedQuery(name = "Salestaxrate.findByName", query = "SELECT s FROM Salestaxrate s WHERE s.name = :name"),
    @NamedQuery(name = "Salestaxrate.findByModifiedDate", query = "SELECT s FROM Salestaxrate s WHERE s.modifiedDate = :modifiedDate")})
public class Salestaxrate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SalesTaxRateID")
    private Integer salesTaxRateID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StateProvinceID")
    private int stateProvinceID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TaxType")
    private short taxType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TaxRate")
    private double taxRate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
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

    public Salestaxrate() {
    }

    public Salestaxrate(Integer salesTaxRateID) {
        this.salesTaxRateID = salesTaxRateID;
    }

    public Salestaxrate(Integer salesTaxRateID, int stateProvinceID, short taxType, double taxRate, String name, byte[] rowguid, Date modifiedDate) {
        this.salesTaxRateID = salesTaxRateID;
        this.stateProvinceID = stateProvinceID;
        this.taxType = taxType;
        this.taxRate = taxRate;
        this.name = name;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getSalesTaxRateID() {
        return salesTaxRateID;
    }

    public void setSalesTaxRateID(Integer salesTaxRateID) {
        this.salesTaxRateID = salesTaxRateID;
    }

    public int getStateProvinceID() {
        return stateProvinceID;
    }

    public void setStateProvinceID(int stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    public short getTaxType() {
        return taxType;
    }

    public void setTaxType(short taxType) {
        this.taxType = taxType;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (salesTaxRateID != null ? salesTaxRateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salestaxrate)) {
            return false;
        }
        Salestaxrate other = (Salestaxrate) object;
        if ((this.salesTaxRateID == null && other.salesTaxRateID != null) || (this.salesTaxRateID != null && !this.salesTaxRateID.equals(other.salesTaxRateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Salestaxrate[ salesTaxRateID=" + salesTaxRateID + " ]";
    }

}
