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
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "productmodelillustration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productmodelillustration.findAll", query = "SELECT p FROM Productmodelillustration p"),
    @NamedQuery(name = "Productmodelillustration.findByProductModelID", query = "SELECT p FROM Productmodelillustration p WHERE p.productmodelillustrationPK.productModelID = :productModelID"),
    @NamedQuery(name = "Productmodelillustration.findByIllustrationID", query = "SELECT p FROM Productmodelillustration p WHERE p.productmodelillustrationPK.illustrationID = :illustrationID"),
    @NamedQuery(name = "Productmodelillustration.findByModifiedDate", query = "SELECT p FROM Productmodelillustration p WHERE p.modifiedDate = :modifiedDate")})
public class Productmodelillustration implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductmodelillustrationPK productmodelillustrationPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "ProductModelID", referencedColumnName = "ProductModelID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productmodel productmodel;
    @JoinColumn(name = "IllustrationID", referencedColumnName = "IllustrationID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Illustration illustration;

    public Productmodelillustration() {
    }

    public Productmodelillustration(ProductmodelillustrationPK productmodelillustrationPK) {
        this.productmodelillustrationPK = productmodelillustrationPK;
    }

    public Productmodelillustration(ProductmodelillustrationPK productmodelillustrationPK, Date modifiedDate) {
        this.productmodelillustrationPK = productmodelillustrationPK;
        this.modifiedDate = modifiedDate;
    }

    public Productmodelillustration(int productModelID, int illustrationID) {
        this.productmodelillustrationPK = new ProductmodelillustrationPK(productModelID, illustrationID);
    }

    public ProductmodelillustrationPK getProductmodelillustrationPK() {
        return productmodelillustrationPK;
    }

    public void setProductmodelillustrationPK(ProductmodelillustrationPK productmodelillustrationPK) {
        this.productmodelillustrationPK = productmodelillustrationPK;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Productmodel getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(Productmodel productmodel) {
        this.productmodel = productmodel;
    }

    public Illustration getIllustration() {
        return illustration;
    }

    public void setIllustration(Illustration illustration) {
        this.illustration = illustration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productmodelillustrationPK != null ? productmodelillustrationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productmodelillustration)) {
            return false;
        }
        Productmodelillustration other = (Productmodelillustration) object;
        if ((this.productmodelillustrationPK == null && other.productmodelillustrationPK != null) || (this.productmodelillustrationPK != null && !this.productmodelillustrationPK.equals(other.productmodelillustrationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productmodelillustration[ productmodelillustrationPK=" + productmodelillustrationPK + " ]";
    }

}
