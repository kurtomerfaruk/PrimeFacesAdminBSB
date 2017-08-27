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
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "productdocument")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productdocument.findAll", query = "SELECT p FROM Productdocument p"),
    @NamedQuery(name = "Productdocument.findByProductID", query = "SELECT p FROM Productdocument p WHERE p.productdocumentPK.productID = :productID"),
    @NamedQuery(name = "Productdocument.findByDocumentNode", query = "SELECT p FROM Productdocument p WHERE p.productdocumentPK.documentNode = :documentNode"),
    @NamedQuery(name = "Productdocument.findByModifiedDate", query = "SELECT p FROM Productdocument p WHERE p.modifiedDate = :modifiedDate")})
public class Productdocument implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductdocumentPK productdocumentPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "DocumentNode", referencedColumnName = "DocumentNode", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Document document;

    public Productdocument() {
    }

    public Productdocument(ProductdocumentPK productdocumentPK) {
        this.productdocumentPK = productdocumentPK;
    }

    public Productdocument(ProductdocumentPK productdocumentPK, Date modifiedDate) {
        this.productdocumentPK = productdocumentPK;
        this.modifiedDate = modifiedDate;
    }

    public Productdocument(int productID, String documentNode) {
        this.productdocumentPK = new ProductdocumentPK(productID, documentNode);
    }

    public ProductdocumentPK getProductdocumentPK() {
        return productdocumentPK;
    }

    public void setProductdocumentPK(ProductdocumentPK productdocumentPK) {
        this.productdocumentPK = productdocumentPK;
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

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productdocumentPK != null ? productdocumentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productdocument)) {
            return false;
        }
        Productdocument other = (Productdocument) object;
        if ((this.productdocumentPK == null && other.productdocumentPK != null) || (this.productdocumentPK != null && !this.productdocumentPK.equals(other.productdocumentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productdocument[ productdocumentPK=" + productdocumentPK + " ]";
    }

}
