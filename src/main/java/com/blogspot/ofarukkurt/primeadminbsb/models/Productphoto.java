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
@Table(name = "productphoto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productphoto.findAll", query = "SELECT p FROM Productphoto p"),
    @NamedQuery(name = "Productphoto.findByProductPhotoID", query = "SELECT p FROM Productphoto p WHERE p.productPhotoID = :productPhotoID"),
    @NamedQuery(name = "Productphoto.findByThumbnailPhotoFileName", query = "SELECT p FROM Productphoto p WHERE p.thumbnailPhotoFileName = :thumbnailPhotoFileName"),
    @NamedQuery(name = "Productphoto.findByLargePhotoFileName", query = "SELECT p FROM Productphoto p WHERE p.largePhotoFileName = :largePhotoFileName"),
    @NamedQuery(name = "Productphoto.findByModifiedDate", query = "SELECT p FROM Productphoto p WHERE p.modifiedDate = :modifiedDate")})
public class Productphoto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductPhotoID")
    private Integer productPhotoID;
    @Lob
    @Column(name = "ThumbNailPhoto")
    private byte[] thumbNailPhoto;
    @Size(max = 50)
    @Column(name = "ThumbnailPhotoFileName")
    private String thumbnailPhotoFileName;
    @Lob
    @Column(name = "LargePhoto")
    private byte[] largePhoto;
    @Size(max = 50)
    @Column(name = "LargePhotoFileName")
    private String largePhotoFileName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productphoto")
    private List<Productproductphoto> productproductphotoList;

    public Productphoto() {
    }

    public Productphoto(Integer productPhotoID) {
        this.productPhotoID = productPhotoID;
    }

    public Productphoto(Integer productPhotoID, Date modifiedDate) {
        this.productPhotoID = productPhotoID;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductPhotoID() {
        return productPhotoID;
    }

    public void setProductPhotoID(Integer productPhotoID) {
        this.productPhotoID = productPhotoID;
    }

    public byte[] getThumbNailPhoto() {
        return thumbNailPhoto;
    }

    public void setThumbNailPhoto(byte[] thumbNailPhoto) {
        this.thumbNailPhoto = thumbNailPhoto;
    }

    public String getThumbnailPhotoFileName() {
        return thumbnailPhotoFileName;
    }

    public void setThumbnailPhotoFileName(String thumbnailPhotoFileName) {
        this.thumbnailPhotoFileName = thumbnailPhotoFileName;
    }

    public byte[] getLargePhoto() {
        return largePhoto;
    }

    public void setLargePhoto(byte[] largePhoto) {
        this.largePhoto = largePhoto;
    }

    public String getLargePhotoFileName() {
        return largePhotoFileName;
    }

    public void setLargePhotoFileName(String largePhotoFileName) {
        this.largePhotoFileName = largePhotoFileName;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public List<Productproductphoto> getProductproductphotoList() {
        return productproductphotoList;
    }

    public void setProductproductphotoList(List<Productproductphoto> productproductphotoList) {
        this.productproductphotoList = productproductphotoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPhotoID != null ? productPhotoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productphoto)) {
            return false;
        }
        Productphoto other = (Productphoto) object;
        if ((this.productPhotoID == null && other.productPhotoID != null) || (this.productPhotoID != null && !this.productPhotoID.equals(other.productPhotoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productphoto[ productPhotoID=" + productPhotoID + " ]";
    }

}
