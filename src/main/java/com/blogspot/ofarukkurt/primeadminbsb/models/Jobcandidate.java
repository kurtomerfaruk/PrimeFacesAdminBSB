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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:21 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "jobcandidate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jobcandidate.findAll", query = "SELECT j FROM Jobcandidate j"),
    @NamedQuery(name = "Jobcandidate.findByJobCandidateID", query = "SELECT j FROM Jobcandidate j WHERE j.jobCandidateID = :jobCandidateID"),
    @NamedQuery(name = "Jobcandidate.findByModifiedDate", query = "SELECT j FROM Jobcandidate j WHERE j.modifiedDate = :modifiedDate")})
public class Jobcandidate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JobCandidateID")
    private Integer jobCandidateID;
    @Lob
    @Size(max = 65535)
    @Column(name = "Resume")
    private String resume;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee businessEntityID;

    public Jobcandidate() {
    }

    public Jobcandidate(Integer jobCandidateID) {
        this.jobCandidateID = jobCandidateID;
    }

    public Jobcandidate(Integer jobCandidateID, Date modifiedDate) {
        this.jobCandidateID = jobCandidateID;
        this.modifiedDate = modifiedDate;
    }

    public Integer getJobCandidateID() {
        return jobCandidateID;
    }

    public void setJobCandidateID(Integer jobCandidateID) {
        this.jobCandidateID = jobCandidateID;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Employee getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Employee businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobCandidateID != null ? jobCandidateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jobcandidate)) {
            return false;
        }
        Jobcandidate other = (Jobcandidate) object;
        if ((this.jobCandidateID == null && other.jobCandidateID != null) || (this.jobCandidateID != null && !this.jobCandidateID.equals(other.jobCandidateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Jobcandidate[ jobCandidateID=" + jobCandidateID + " ]";
    }

}
