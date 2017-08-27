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
@Table(name = "productinventory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productinventory.findAll", query = "SELECT p FROM Productinventory p"),
    @NamedQuery(name = "Productinventory.findByProductID", query = "SELECT p FROM Productinventory p WHERE p.productinventoryPK.productID = :productID"),
    @NamedQuery(name = "Productinventory.findByLocationID", query = "SELECT p FROM Productinventory p WHERE p.productinventoryPK.locationID = :locationID"),
    @NamedQuery(name = "Productinventory.findByShelf", query = "SELECT p FROM Productinventory p WHERE p.shelf = :shelf"),
    @NamedQuery(name = "Productinventory.findByBin", query = "SELECT p FROM Productinventory p WHERE p.bin = :bin"),
    @NamedQuery(name = "Productinventory.findByQuantity", query = "SELECT p FROM Productinventory p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "Productinventory.findByRowguid", query = "SELECT p FROM Productinventory p WHERE p.rowguid = :rowguid"),
    @NamedQuery(name = "Productinventory.findByModifiedDate", query = "SELECT p FROM Productinventory p WHERE p.modifiedDate = :modifiedDate")})
public class Productinventory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductinventoryPK productinventoryPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Shelf")
    private String shelf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bin")
    private short bin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private short quantity;
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
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "LocationID", referencedColumnName = "LocationID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Location location;

    public Productinventory() {
    }

    public Productinventory(ProductinventoryPK productinventoryPK) {
        this.productinventoryPK = productinventoryPK;
    }

    public Productinventory(ProductinventoryPK productinventoryPK, String shelf, short bin, short quantity, String rowguid, Date modifiedDate) {
        this.productinventoryPK = productinventoryPK;
        this.shelf = shelf;
        this.bin = bin;
        this.quantity = quantity;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Productinventory(int productID, short locationID) {
        this.productinventoryPK = new ProductinventoryPK(productID, locationID);
    }

    public ProductinventoryPK getProductinventoryPK() {
        return productinventoryPK;
    }

    public void setProductinventoryPK(ProductinventoryPK productinventoryPK) {
        this.productinventoryPK = productinventoryPK;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public short getBin() {
        return bin;
    }

    public void setBin(short bin) {
        this.bin = bin;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productinventoryPK != null ? productinventoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productinventory)) {
            return false;
        }
        Productinventory other = (Productinventory) object;
        if ((this.productinventoryPK == null && other.productinventoryPK != null) || (this.productinventoryPK != null && !this.productinventoryPK.equals(other.productinventoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productinventory[ productinventoryPK=" + productinventoryPK + " ]";
    }

}
