package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "billofmaterials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billofmaterials.findAll", query = "SELECT b FROM Billofmaterials b"),
    @NamedQuery(name = "Billofmaterials.findByBillOfMaterialsID", query = "SELECT b FROM Billofmaterials b WHERE b.billOfMaterialsID = :billOfMaterialsID"),
    @NamedQuery(name = "Billofmaterials.findByStartDate", query = "SELECT b FROM Billofmaterials b WHERE b.startDate = :startDate"),
    @NamedQuery(name = "Billofmaterials.findByEndDate", query = "SELECT b FROM Billofmaterials b WHERE b.endDate = :endDate"),
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
    @JoinColumn(name = "UnitMeasureCode", referencedColumnName = "UnitMeasureCode")
    @ManyToOne(optional = false)
    private Unitmeasure unitMeasureCode;
    @JoinColumn(name = "ProductAssemblyID", referencedColumnName = "ProductID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Product productAssemblyID;
    @JoinColumn(name = "ComponentID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Product componentID;

    public Billofmaterials() {
    }

    public Billofmaterials(Integer billOfMaterialsID) {
        this.billOfMaterialsID = billOfMaterialsID;
    }

    public Billofmaterials(Integer billOfMaterialsID, Date startDate, short bOMLevel, BigDecimal perAssemblyQty, Date modifiedDate) {
        this.billOfMaterialsID = billOfMaterialsID;
        this.startDate = startDate;
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

    public Unitmeasure getUnitMeasureCode() {
        return unitMeasureCode;
    }

    public void setUnitMeasureCode(Unitmeasure unitMeasureCode) {
        this.unitMeasureCode = unitMeasureCode;
    }

    public Product getProductAssemblyID() {
        return productAssemblyID;
    }

    public void setProductAssemblyID(Product productAssemblyID) {
        this.productAssemblyID = productAssemblyID;
    }

    public Product getComponentID() {
        return componentID;
    }

    public void setComponentID(Product componentID) {
        this.componentID = componentID;
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
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Billofmaterials[ billOfMaterialsID=" + billOfMaterialsID + " ]";
    }

}
