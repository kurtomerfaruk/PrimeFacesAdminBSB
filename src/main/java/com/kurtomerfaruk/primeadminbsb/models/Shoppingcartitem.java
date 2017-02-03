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
@Table(name = "shoppingcartitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shoppingcartitem.findAll", query = "SELECT s FROM Shoppingcartitem s"),
    @NamedQuery(name = "Shoppingcartitem.findByShoppingCartItemID", query = "SELECT s FROM Shoppingcartitem s WHERE s.shoppingCartItemID = :shoppingCartItemID"),
    @NamedQuery(name = "Shoppingcartitem.findByShoppingCartID", query = "SELECT s FROM Shoppingcartitem s WHERE s.shoppingCartID = :shoppingCartID"),
    @NamedQuery(name = "Shoppingcartitem.findByQuantity", query = "SELECT s FROM Shoppingcartitem s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "Shoppingcartitem.findByProductID", query = "SELECT s FROM Shoppingcartitem s WHERE s.productID = :productID"),
    @NamedQuery(name = "Shoppingcartitem.findByDateCreated", query = "SELECT s FROM Shoppingcartitem s WHERE s.dateCreated = :dateCreated"),
    @NamedQuery(name = "Shoppingcartitem.findByModifiedDate", query = "SELECT s FROM Shoppingcartitem s WHERE s.modifiedDate = :modifiedDate")})
public class Shoppingcartitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ShoppingCartItemID")
    private Integer shoppingCartItemID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ShoppingCartID")
    private String shoppingCartID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Shoppingcartitem() {
    }

    public Shoppingcartitem(Integer shoppingCartItemID) {
        this.shoppingCartItemID = shoppingCartItemID;
    }

    public Shoppingcartitem(Integer shoppingCartItemID, String shoppingCartID, int quantity, int productID, Date dateCreated, Date modifiedDate) {
        this.shoppingCartItemID = shoppingCartItemID;
        this.shoppingCartID = shoppingCartID;
        this.quantity = quantity;
        this.productID = productID;
        this.dateCreated = dateCreated;
        this.modifiedDate = modifiedDate;
    }

    public Integer getShoppingCartItemID() {
        return shoppingCartItemID;
    }

    public void setShoppingCartItemID(Integer shoppingCartItemID) {
        this.shoppingCartItemID = shoppingCartItemID;
    }

    public String getShoppingCartID() {
        return shoppingCartID;
    }

    public void setShoppingCartID(String shoppingCartID) {
        this.shoppingCartID = shoppingCartID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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
        hash += (shoppingCartItemID != null ? shoppingCartItemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shoppingcartitem)) {
            return false;
        }
        Shoppingcartitem other = (Shoppingcartitem) object;
        if ((this.shoppingCartItemID == null && other.shoppingCartItemID != null) || (this.shoppingCartItemID != null && !this.shoppingCartItemID.equals(other.shoppingCartItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Shoppingcartitem[ shoppingCartItemID=" + shoppingCartItemID + " ]";
    }

}
