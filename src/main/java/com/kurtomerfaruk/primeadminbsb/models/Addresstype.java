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
@Table(name = "addresstype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Addresstype.findAll", query = "SELECT a FROM Addresstype a"),
    @NamedQuery(name = "Addresstype.findByAddressTypeID", query = "SELECT a FROM Addresstype a WHERE a.addressTypeID = :addressTypeID"),
    @NamedQuery(name = "Addresstype.findByName", query = "SELECT a FROM Addresstype a WHERE a.name = :name"),
    @NamedQuery(name = "Addresstype.findByModifiedDate", query = "SELECT a FROM Addresstype a WHERE a.modifiedDate = :modifiedDate")})
public class Addresstype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AddressTypeID")
    private Integer addressTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
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

    public Addresstype() {
    }

    public Addresstype(Integer addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    public Addresstype(Integer addressTypeID, String name, byte[] rowguid, Date modifiedDate) {
        this.addressTypeID = addressTypeID;
        this.name = name;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(Integer addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (addressTypeID != null ? addressTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addresstype)) {
            return false;
        }
        Addresstype other = (Addresstype) object;
        if ((this.addressTypeID == null && other.addressTypeID != null) || (this.addressTypeID != null && !this.addressTypeID.equals(other.addressTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Addresstype[ addressTypeID=" + addressTypeID + " ]";
    }

}
