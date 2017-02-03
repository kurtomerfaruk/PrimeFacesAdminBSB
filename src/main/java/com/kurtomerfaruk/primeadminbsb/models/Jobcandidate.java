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
@Table(name = "jobcandidate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jobcandidate.findAll", query = "SELECT j FROM Jobcandidate j"),
    @NamedQuery(name = "Jobcandidate.findByJobCandidateID", query = "SELECT j FROM Jobcandidate j WHERE j.jobCandidateID = :jobCandidateID"),
    @NamedQuery(name = "Jobcandidate.findByEmployeeID", query = "SELECT j FROM Jobcandidate j WHERE j.employeeID = :employeeID"),
    @NamedQuery(name = "Jobcandidate.findByModifiedDate", query = "SELECT j FROM Jobcandidate j WHERE j.modifiedDate = :modifiedDate")})
public class Jobcandidate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JobCandidateID")
    private Integer jobCandidateID;
    @Column(name = "EmployeeID")
    private Integer employeeID;
    @Lob
    @Size(max = 65535)
    @Column(name = "Resume")
    private String resume;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

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

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Jobcandidate[ jobCandidateID=" + jobCandidateID + " ]";
    }

}
