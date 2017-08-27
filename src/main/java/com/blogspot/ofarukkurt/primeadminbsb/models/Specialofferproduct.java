/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "specialofferproduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialofferproduct.findAll", query = "SELECT s FROM Specialofferproduct s"),
    @NamedQuery(name = "Specialofferproduct.findBySpecialOfferID", query = "SELECT s FROM Specialofferproduct s WHERE s.specialofferproductPK.specialOfferID = :specialOfferID"),
    @NamedQuery(name = "Specialofferproduct.findByProductID", query = "SELECT s FROM Specialofferproduct s WHERE s.specialofferproductPK.productID = :productID"),
    @NamedQuery(name = "Specialofferproduct.findByRowguid", query = "SELECT s FROM Specialofferproduct s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Specialofferproduct.findByModifiedDate", query = "SELECT s FROM Specialofferproduct s WHERE s.modifiedDate = :modifiedDate")})
public class Specialofferproduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpecialofferproductPK specialofferproductPK;
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
    @JoinColumn(name = "SpecialOfferID", referencedColumnName = "SpecialOfferID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Specialoffer specialoffer;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specialofferproduct")
    private List<Salesorderdetail> salesorderdetailList;

    public Specialofferproduct() {
    }

    public Specialofferproduct(SpecialofferproductPK specialofferproductPK) {
        this.specialofferproductPK = specialofferproductPK;
    }

    public Specialofferproduct(SpecialofferproductPK specialofferproductPK, String rowguid, Date modifiedDate) {
        this.specialofferproductPK = specialofferproductPK;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Specialofferproduct(int specialOfferID, int productID) {
        this.specialofferproductPK = new SpecialofferproductPK(specialOfferID, productID);
    }

    public SpecialofferproductPK getSpecialofferproductPK() {
        return specialofferproductPK;
    }

    public void setSpecialofferproductPK(SpecialofferproductPK specialofferproductPK) {
        this.specialofferproductPK = specialofferproductPK;
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

    public Specialoffer getSpecialoffer() {
        return specialoffer;
    }

    public void setSpecialoffer(Specialoffer specialoffer) {
        this.specialoffer = specialoffer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @XmlTransient
    public List<Salesorderdetail> getSalesorderdetailList() {
        return salesorderdetailList;
    }

    public void setSalesorderdetailList(List<Salesorderdetail> salesorderdetailList) {
        this.salesorderdetailList = salesorderdetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (specialofferproductPK != null ? specialofferproductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialofferproduct)) {
            return false;
        }
        Specialofferproduct other = (Specialofferproduct) object;
        if ((this.specialofferproductPK == null && other.specialofferproductPK != null) || (this.specialofferproductPK != null && !this.specialofferproductPK.equals(other.specialofferproductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Specialofferproduct[ specialofferproductPK=" + specialofferproductPK + " ]";
    }

}
