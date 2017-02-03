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
 * Created on date 27.01.2017 23:11:03
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
        return "com.kurtomerfaruk.primeadminbsb.models.Illustration[ illustrationID=" + illustrationID + " ]";
    }

}
