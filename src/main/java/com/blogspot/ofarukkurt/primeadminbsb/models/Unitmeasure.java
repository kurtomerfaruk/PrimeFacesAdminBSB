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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "unitmeasure")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unitmeasure.findAll", query = "SELECT u FROM Unitmeasure u"),
    @NamedQuery(name = "Unitmeasure.findByUnitMeasureCode", query = "SELECT u FROM Unitmeasure u WHERE u.unitMeasureCode = :unitMeasureCode"),
    @NamedQuery(name = "Unitmeasure.findByName", query = "SELECT u FROM Unitmeasure u WHERE u.name = :name"),
    @NamedQuery(name = "Unitmeasure.findByModifiedDate", query = "SELECT u FROM Unitmeasure u WHERE u.modifiedDate = :modifiedDate")})
public class Unitmeasure implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "UnitMeasureCode")
    private String unitMeasureCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unitMeasureCode")
    private List<Billofmaterials> billofmaterialsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unitMeasureCode")
    private List<Productvendor> productvendorList;
    @OneToMany(mappedBy = "weightUnitMeasureCode")
    private List<Product> productList;
    @OneToMany(mappedBy = "sizeUnitMeasureCode")
    private List<Product> productList1;

    public Unitmeasure() {
    }

    public Unitmeasure(String unitMeasureCode) {
        this.unitMeasureCode = unitMeasureCode;
    }

    public Unitmeasure(String unitMeasureCode, String name, Date modifiedDate) {
        this.unitMeasureCode = unitMeasureCode;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    public String getUnitMeasureCode() {
        return unitMeasureCode;
    }

    public void setUnitMeasureCode(String unitMeasureCode) {
        this.unitMeasureCode = unitMeasureCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public List<Billofmaterials> getBillofmaterialsList() {
        return billofmaterialsList;
    }

    public void setBillofmaterialsList(List<Billofmaterials> billofmaterialsList) {
        this.billofmaterialsList = billofmaterialsList;
    }

    @XmlTransient
    public List<Productvendor> getProductvendorList() {
        return productvendorList;
    }

    public void setProductvendorList(List<Productvendor> productvendorList) {
        this.productvendorList = productvendorList;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @XmlTransient
    public List<Product> getProductList1() {
        return productList1;
    }

    public void setProductList1(List<Product> productList1) {
        this.productList1 = productList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unitMeasureCode != null ? unitMeasureCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unitmeasure)) {
            return false;
        }
        Unitmeasure other = (Unitmeasure) object;
        if ((this.unitMeasureCode == null && other.unitMeasureCode != null) || (this.unitMeasureCode != null && !this.unitMeasureCode.equals(other.unitMeasureCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Unitmeasure[ unitMeasureCode=" + unitMeasureCode + " ]";
    }

}
