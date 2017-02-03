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
@Table(name = "billofmaterials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billofmaterials.findAll", query = "SELECT b FROM Billofmaterials b"),
    @NamedQuery(name = "Billofmaterials.findByBillOfMaterialsID", query = "SELECT b FROM Billofmaterials b WHERE b.billOfMaterialsID = :billOfMaterialsID"),
    @NamedQuery(name = "Billofmaterials.findByProductAssemblyID", query = "SELECT b FROM Billofmaterials b WHERE b.productAssemblyID = :productAssemblyID"),
    @NamedQuery(name = "Billofmaterials.findByComponentID", query = "SELECT b FROM Billofmaterials b WHERE b.componentID = :componentID"),
    @NamedQuery(name = "Billofmaterials.findByStartDate", query = "SELECT b FROM Billofmaterials b WHERE b.startDate = :startDate"),
    @NamedQuery(name = "Billofmaterials.findByEndDate", query = "SELECT b FROM Billofmaterials b WHERE b.endDate = :endDate"),
    @NamedQuery(name = "Billofmaterials.findByUnitMeasureCode", query = "SELECT b FROM Billofmaterials b WHERE b.unitMeasureCode = :unitMeasureCode"),
    @NamedQuery(name = "Billofmaterials.findByBOMLevel", query = "SELECT b FROM Billofmaterials b WHERE b.bOMLevel = :bOMLevel"),
    @NamedQuery(name = "Billofmaterials.findByPerAssemblyQty", query = "SELECT b FROM Billofmaterials b WHERE b.perAssemblyQty = :perAssemblyQty"),
    @NamedQuery(name = "Billofmaterials.findByModifiedDate", query = "SELECT b FROM Billofmaterials b WHERE b.modifiedDate = :modifiedDate")})
public class Billofmaterials implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BillOfMaterialsID")
    private Integer billOfMaterialsID;
    @Column(name = "ProductAssemblyID")
    private Integer productAssemblyID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ComponentID")
    private int componentID;
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
    @Size(min = 1, max = 3)
    @Column(name = "UnitMeasureCode")
    private String unitMeasureCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOMLevel")
    private short bOMLevel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PerAssemblyQty")
    private BigDecimal perAssemblyQty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Billofmaterials() {
    }

    public Billofmaterials(Integer billOfMaterialsID) {
        this.billOfMaterialsID = billOfMaterialsID;
    }

    public Billofmaterials(Integer billOfMaterialsID, int componentID, Date startDate, String unitMeasureCode, short bOMLevel, BigDecimal perAssemblyQty, Date modifiedDate) {
        this.billOfMaterialsID = billOfMaterialsID;
        this.componentID = componentID;
        this.startDate = startDate;
        this.unitMeasureCode = unitMeasureCode;
        this.bOMLevel = bOMLevel;
        this.perAssemblyQty = perAssemblyQty;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBillOfMaterialsID() {
        return billOfMaterialsID;
    }

    public void setBillOfMaterialsID(Integer billOfMaterialsID) {
        this.billOfMaterialsID = billOfMaterialsID;
    }

    public Integer getProductAssemblyID() {
        return productAssemblyID;
    }

    public void setProductAssemblyID(Integer productAssemblyID) {
        this.productAssemblyID = productAssemblyID;
    }

    public int getComponentID() {
        return componentID;
    }

    public void setComponentID(int componentID) {
        this.componentID = componentID;
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

    public String getUnitMeasureCode() {
        return unitMeasureCode;
    }

    public void setUnitMeasureCode(String unitMeasureCode) {
        this.unitMeasureCode = unitMeasureCode;
    }

    public short getBOMLevel() {
        return bOMLevel;
    }

    public void setBOMLevel(short bOMLevel) {
        this.bOMLevel = bOMLevel;
    }

    public BigDecimal getPerAssemblyQty() {
        return perAssemblyQty;
    }

    public void setPerAssemblyQty(BigDecimal perAssemblyQty) {
        this.perAssemblyQty = perAssemblyQty;
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
        hash += (billOfMaterialsID != null ? billOfMaterialsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billofmaterials)) {
            return false;
        }
        Billofmaterials other = (Billofmaterials) object;
        if ((this.billOfMaterialsID == null && other.billOfMaterialsID != null) || (this.billOfMaterialsID != null && !this.billOfMaterialsID.equals(other.billOfMaterialsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Billofmaterials[ billOfMaterialsID=" + billOfMaterialsID + " ]";
    }

}
