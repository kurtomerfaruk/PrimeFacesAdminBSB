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
 * Created on date 27.01.2017 23:11:05
 */
@Entity
@Table(name = "productdescription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productdescription.findAll", query = "SELECT p FROM Productdescription p"),
    @NamedQuery(name = "Productdescription.findByProductDescriptionID", query = "SELECT p FROM Productdescription p WHERE p.productDescriptionID = :productDescriptionID"),
    @NamedQuery(name = "Productdescription.findByModifiedDate", query = "SELECT p FROM Productdescription p WHERE p.modifiedDate = :modifiedDate")})
public class Productdescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductDescriptionID")
    private Integer productDescriptionID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "Description")
    private String description;
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

    public Productdescription() {
    }

    public Productdescription(Integer productDescriptionID) {
        this.productDescriptionID = productDescriptionID;
    }

    public Productdescription(Integer productDescriptionID, String description, byte[] rowguid, Date modifiedDate) {
        this.productDescriptionID = productDescriptionID;
        this.description = description;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductDescriptionID() {
        return productDescriptionID;
    }

    public void setProductDescriptionID(Integer productDescriptionID) {
        this.productDescriptionID = productDescriptionID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (productDescriptionID != null ? productDescriptionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productdescription)) {
            return false;
        }
        Productdescription other = (Productdescription) object;
        if ((this.productDescriptionID == null && other.productDescriptionID != null) || (this.productDescriptionID != null && !this.productDescriptionID.equals(other.productDescriptionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Productdescription[ productDescriptionID=" + productDescriptionID + " ]";
    }

}
