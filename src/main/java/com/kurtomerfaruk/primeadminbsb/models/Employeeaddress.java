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
 * Created on date 27.01.2017 23:11:04
 */
@Entity
@Table(name = "employeeaddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeeaddress.findAll", query = "SELECT e FROM Employeeaddress e"),
    @NamedQuery(name = "Employeeaddress.findByEmployeeID", query = "SELECT e FROM Employeeaddress e WHERE e.employeeaddressPK.employeeID = :employeeID"),
    @NamedQuery(name = "Employeeaddress.findByAddressID", query = "SELECT e FROM Employeeaddress e WHERE e.employeeaddressPK.addressID = :addressID"),
    @NamedQuery(name = "Employeeaddress.findByModifiedDate", query = "SELECT e FROM Employeeaddress e WHERE e.modifiedDate = :modifiedDate")})
public class Employeeaddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeeaddressPK employeeaddressPK;
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

    public Employeeaddress() {
    }

    public Employeeaddress(EmployeeaddressPK employeeaddressPK) {
        this.employeeaddressPK = employeeaddressPK;
    }

    public Employeeaddress(EmployeeaddressPK employeeaddressPK, byte[] rowguid, Date modifiedDate) {
        this.employeeaddressPK = employeeaddressPK;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Employeeaddress(int employeeID, int addressID) {
        this.employeeaddressPK = new EmployeeaddressPK(employeeID, addressID);
    }

    public EmployeeaddressPK getEmployeeaddressPK() {
        return employeeaddressPK;
    }

    public void setEmployeeaddressPK(EmployeeaddressPK employeeaddressPK) {
        this.employeeaddressPK = employeeaddressPK;
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
        hash += (employeeaddressPK != null ? employeeaddressPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeeaddress)) {
            return false;
        }
        Employeeaddress other = (Employeeaddress) object;
        if ((this.employeeaddressPK == null && other.employeeaddressPK != null) || (this.employeeaddressPK != null && !this.employeeaddressPK.equals(other.employeeaddressPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Employeeaddress[ employeeaddressPK=" + employeeaddressPK + " ]";
    }

}
