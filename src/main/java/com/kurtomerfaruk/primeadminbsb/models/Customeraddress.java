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
@Table(name = "customeraddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customeraddress.findAll", query = "SELECT c FROM Customeraddress c"),
    @NamedQuery(name = "Customeraddress.findByCustomerID", query = "SELECT c FROM Customeraddress c WHERE c.customeraddressPK.customerID = :customerID"),
    @NamedQuery(name = "Customeraddress.findByAddressID", query = "SELECT c FROM Customeraddress c WHERE c.customeraddressPK.addressID = :addressID"),
    @NamedQuery(name = "Customeraddress.findByAddressTypeID", query = "SELECT c FROM Customeraddress c WHERE c.addressTypeID = :addressTypeID"),
    @NamedQuery(name = "Customeraddress.findByModifiedDate", query = "SELECT c FROM Customeraddress c WHERE c.modifiedDate = :modifiedDate")})
public class Customeraddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustomeraddressPK customeraddressPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AddressTypeID")
    private int addressTypeID;
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

    public Customeraddress() {
    }

    public Customeraddress(CustomeraddressPK customeraddressPK) {
        this.customeraddressPK = customeraddressPK;
    }

    public Customeraddress(CustomeraddressPK customeraddressPK, int addressTypeID, byte[] rowguid, Date modifiedDate) {
        this.customeraddressPK = customeraddressPK;
        this.addressTypeID = addressTypeID;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Customeraddress(int customerID, int addressID) {
        this.customeraddressPK = new CustomeraddressPK(customerID, addressID);
    }

    public CustomeraddressPK getCustomeraddressPK() {
        return customeraddressPK;
    }

    public void setCustomeraddressPK(CustomeraddressPK customeraddressPK) {
        this.customeraddressPK = customeraddressPK;
    }

    public int getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(int addressTypeID) {
        this.addressTypeID = addressTypeID;
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
        hash += (customeraddressPK != null ? customeraddressPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customeraddress)) {
            return false;
        }
        Customeraddress other = (Customeraddress) object;
        if ((this.customeraddressPK == null && other.customeraddressPK != null) || (this.customeraddressPK != null && !this.customeraddressPK.equals(other.customeraddressPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Customeraddress[ customeraddressPK=" + customeraddressPK + " ]";
    }

}
