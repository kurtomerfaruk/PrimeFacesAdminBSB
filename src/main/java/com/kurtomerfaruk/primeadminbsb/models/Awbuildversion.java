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
@Table(name = "awbuildversion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Awbuildversion.findAll", query = "SELECT a FROM Awbuildversion a"),
    @NamedQuery(name = "Awbuildversion.findBySystemInformationID", query = "SELECT a FROM Awbuildversion a WHERE a.systemInformationID = :systemInformationID"),
    @NamedQuery(name = "Awbuildversion.findByDatabaseVersion", query = "SELECT a FROM Awbuildversion a WHERE a.databaseVersion = :databaseVersion"),
    @NamedQuery(name = "Awbuildversion.findByVersionDate", query = "SELECT a FROM Awbuildversion a WHERE a.versionDate = :versionDate"),
    @NamedQuery(name = "Awbuildversion.findByModifiedDate", query = "SELECT a FROM Awbuildversion a WHERE a.modifiedDate = :modifiedDate")})
public class Awbuildversion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SystemInformationID")
    private Integer systemInformationID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Database Version")
    private String databaseVersion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VersionDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date versionDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Awbuildversion() {
    }

    public Awbuildversion(Integer systemInformationID) {
        this.systemInformationID = systemInformationID;
    }

    public Awbuildversion(Integer systemInformationID, String databaseVersion, Date versionDate, Date modifiedDate) {
        this.systemInformationID = systemInformationID;
        this.databaseVersion = databaseVersion;
        this.versionDate = versionDate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getSystemInformationID() {
        return systemInformationID;
    }

    public void setSystemInformationID(Integer systemInformationID) {
        this.systemInformationID = systemInformationID;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public Date getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(Date versionDate) {
        this.versionDate = versionDate;
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
        hash += (systemInformationID != null ? systemInformationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Awbuildversion)) {
            return false;
        }
        Awbuildversion other = (Awbuildversion) object;
        if ((this.systemInformationID == null && other.systemInformationID != null) || (this.systemInformationID != null && !this.systemInformationID.equals(other.systemInformationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Awbuildversion[ systemInformationID=" + systemInformationID + " ]";
    }

}
