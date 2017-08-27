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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "illustration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Illustration.findAll", query = "SELECT i FROM Illustration i"),
    @NamedQuery(name = "Illustration.findByIllustrationID", query = "SELECT i FROM Illustration i WHERE i.illustrationID = :illustrationID"),
    @NamedQuery(name = "Illustration.findByModifiedDate", query = "SELECT i FROM Illustration i WHERE i.modifiedDate = :modifiedDate")})
public class Illustration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IllustrationID")
    private Integer illustrationID;
    @Lob
    @Size(max = 65535)
    @Column(name = "Diagram")
    private String diagram;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "illustration")
    private List<Productmodelillustration> productmodelillustrationList;

    public Illustration() {
    }

    public Illustration(Integer illustrationID) {
        this.illustrationID = illustrationID;
    }

    public Illustration(Integer illustrationID, Date modifiedDate) {
        this.illustrationID = illustrationID;
        this.modifiedDate = modifiedDate;
    }

    public Integer getIllustrationID() {
        return illustrationID;
    }

    public void setIllustrationID(Integer illustrationID) {
        this.illustrationID = illustrationID;
    }

    public String getDiagram() {
        return diagram;
    }

    public void setDiagram(String diagram) {
        this.diagram = diagram;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public List<Productmodelillustration> getProductmodelillustrationList() {
        return productmodelillustrationList;
    }

    public void setProductmodelillustrationList(List<Productmodelillustration> productmodelillustrationList) {
        this.productmodelillustrationList = productmodelillustrationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (illustrationID != null ? illustrationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Illustration)) {
            return false;
        }
        Illustration other = (Illustration) object;
        if ((this.illustrationID == null && other.illustrationID != null) || (this.illustrationID != null && !this.illustrationID.equals(other.illustrationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Illustration[ illustrationID=" + illustrationID + " ]";
    }

}
