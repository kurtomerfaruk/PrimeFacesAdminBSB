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
import javax.persistence.Lob;
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
@Table(name = "specialofferproduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialofferproduct.findAll", query = "SELECT s FROM Specialofferproduct s"),
    @NamedQuery(name = "Specialofferproduct.findBySpecialOfferID", query = "SELECT s FROM Specialofferproduct s WHERE s.specialofferproductPK.specialOfferID = :specialOfferID"),
    @NamedQuery(name = "Specialofferproduct.findByProductID", query = "SELECT s FROM Specialofferproduct s WHERE s.specialofferproductPK.productID = :productID"),
    @NamedQuery(name = "Specialofferproduct.findByModifiedDate", query = "SELECT s FROM Specialofferproduct s WHERE s.modifiedDate = :modifiedDate")})
public class Specialofferproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpecialofferproductPK specialofferproductPK;
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

    public Specialofferproduct() {
    }

    public Specialofferproduct(SpecialofferproductPK specialofferproductPK) {
        this.specialofferproductPK = specialofferproductPK;
    }

    public Specialofferproduct(SpecialofferproductPK specialofferproductPK, byte[] rowguid, Date modifiedDate) {
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
        return "com.kurtomerfaruk.primeadminbsb.models.Specialofferproduct[ specialofferproductPK=" + specialofferproductPK + " ]";
    }

}
