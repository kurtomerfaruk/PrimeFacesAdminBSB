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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:11:03
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
        return "com.kurtomerfaruk.primeadminbsb.models.Productmodelillustration[ productmodelillustrationPK=" + productmodelillustrationPK + " ]";
    }

}
