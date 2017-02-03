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
 * Created on date 27.01.2017 23:11:04
 */
@Entity
@Table(name = "specialoffer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialoffer.findAll", query = "SELECT s FROM Specialoffer s"),
    @NamedQuery(name = "Specialoffer.findBySpecialOfferID", query = "SELECT s FROM Specialoffer s WHERE s.specialOfferID = :specialOfferID"),
    @NamedQuery(name = "Specialoffer.findByDescription", query = "SELECT s FROM Specialoffer s WHERE s.description = :description"),
    @NamedQuery(name = "Specialoffer.findByDiscountPct", query = "SELECT s FROM Specialoffer s WHERE s.discountPct = :discountPct"),
    @NamedQuery(name = "Specialoffer.findByType", query = "SELECT s FROM Specialoffer s WHERE s.type = :type"),
    @NamedQuery(name = "Specialoffer.findByCategory", query = "SELECT s FROM Specialoffer s WHERE s.category = :category"),
    @NamedQuery(name = "Specialoffer.findByStartDate", query = "SELECT s FROM Specialoffer s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "Specialoffer.findByEndDate", query = "SELECT s FROM Specialoffer s WHERE s.endDate = :endDate"),
    @NamedQuery(name = "Specialoffer.findByMinQty", query = "SELECT s FROM Specialoffer s WHERE s.minQty = :minQty"),
    @NamedQuery(name = "Specialoffer.findByMaxQty", query = "SELECT s FROM Specialoffer s WHERE s.maxQty = :maxQty"),
    @NamedQuery(name = "Specialoffer.findByModifiedDate", query = "SELECT s FROM Specialoffer s WHERE s.modifiedDate = :modifiedDate")})
public class Specialoffer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SpecialOfferID")
    private Integer specialOfferID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DiscountPct")
    private double discountPct;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Category")
    private String category;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MinQty")
    private int minQty;
    @Column(name = "MaxQty")
    private Integer maxQty;
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

    public Specialoffer() {
    }

    public Specialoffer(Integer specialOfferID) {
        this.specialOfferID = specialOfferID;
    }

    public Specialoffer(Integer specialOfferID, String description, double discountPct, String type, String category, Date startDate, Date endDate, int minQty, byte[] rowguid, Date modifiedDate) {
        this.specialOfferID = specialOfferID;
        this.description = description;
        this.discountPct = discountPct;
        this.type = type;
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
        this.minQty = minQty;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getSpecialOfferID() {
        return specialOfferID;
    }

    public void setSpecialOfferID(Integer specialOfferID) {
        this.specialOfferID = specialOfferID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscountPct() {
        return discountPct;
    }

    public void setDiscountPct(double discountPct) {
        this.discountPct = discountPct;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

    public Integer getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(Integer maxQty) {
        this.maxQty = maxQty;
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
        hash += (specialOfferID != null ? specialOfferID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialoffer)) {
            return false;
        }
        Specialoffer other = (Specialoffer) object;
        if ((this.specialOfferID == null && other.specialOfferID != null) || (this.specialOfferID != null && !this.specialOfferID.equals(other.specialOfferID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Specialoffer[ specialOfferID=" + specialOfferID + " ]";
    }

}
