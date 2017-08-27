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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "scrapreason")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Scrapreason.findAll", query = "SELECT s FROM Scrapreason s"),
    @NamedQuery(name = "Scrapreason.findByScrapReasonID", query = "SELECT s FROM Scrapreason s WHERE s.scrapReasonID = :scrapReasonID"),
    @NamedQuery(name = "Scrapreason.findByName", query = "SELECT s FROM Scrapreason s WHERE s.name = :name"),
    @NamedQuery(name = "Scrapreason.findByModifiedDate", query = "SELECT s FROM Scrapreason s WHERE s.modifiedDate = :modifiedDate")})
public class Scrapreason implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ScrapReasonID")
    private Short scrapReasonID;
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
    @OneToMany(mappedBy = "scrapReasonID")
    private List<Workorder> workorderList;

    public Scrapreason() {
    }

    public Scrapreason(Short scrapReasonID) {
        this.scrapReasonID = scrapReasonID;
    }

    public Scrapreason(Short scrapReasonID, String name, Date modifiedDate) {
        this.scrapReasonID = scrapReasonID;
        this.name = name;
        this.modifiedDate = modifiedDate;
    }

    public Short getScrapReasonID() {
        return scrapReasonID;
    }

    public void setScrapReasonID(Short scrapReasonID) {
        this.scrapReasonID = scrapReasonID;
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
    public List<Workorder> getWorkorderList() {
        return workorderList;
    }

    public void setWorkorderList(List<Workorder> workorderList) {
        this.workorderList = workorderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scrapReasonID != null ? scrapReasonID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Scrapreason)) {
            return false;
        }
        Scrapreason other = (Scrapreason) object;
        if ((this.scrapReasonID == null && other.scrapReasonID != null) || (this.scrapReasonID != null && !this.scrapReasonID.equals(other.scrapReasonID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Scrapreason[ scrapReasonID=" + scrapReasonID + " ]";
    }

}
