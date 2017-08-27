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
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "productreview")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productreview.findAll", query = "SELECT p FROM Productreview p"),
    @NamedQuery(name = "Productreview.findByProductReviewID", query = "SELECT p FROM Productreview p WHERE p.productReviewID = :productReviewID"),
    @NamedQuery(name = "Productreview.findByReviewerName", query = "SELECT p FROM Productreview p WHERE p.reviewerName = :reviewerName"),
    @NamedQuery(name = "Productreview.findByReviewDate", query = "SELECT p FROM Productreview p WHERE p.reviewDate = :reviewDate"),
    @NamedQuery(name = "Productreview.findByEmailAddress", query = "SELECT p FROM Productreview p WHERE p.emailAddress = :emailAddress"),
    @NamedQuery(name = "Productreview.findByRating", query = "SELECT p FROM Productreview p WHERE p.rating = :rating"),
    @NamedQuery(name = "Productreview.findByComments", query = "SELECT p FROM Productreview p WHERE p.comments = :comments"),
    @NamedQuery(name = "Productreview.findByModifiedDate", query = "SELECT p FROM Productreview p WHERE p.modifiedDate = :modifiedDate")})
public class Productreview implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductReviewID")
    private Integer productReviewID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ReviewerName")
    private String reviewerName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReviewDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reviewDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Rating")
    private int rating;
    @Size(max = 3850)
    @Column(name = "Comments")
    private String comments;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Product productID;

    public Productreview() {
    }

    public Productreview(Integer productReviewID) {
        this.productReviewID = productReviewID;
    }

    public Productreview(Integer productReviewID, String reviewerName, Date reviewDate, String emailAddress, int rating, Date modifiedDate) {
        this.productReviewID = productReviewID;
        this.reviewerName = reviewerName;
        this.reviewDate = reviewDate;
        this.emailAddress = emailAddress;
        this.rating = rating;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductReviewID() {
        return productReviewID;
    }

    public void setProductReviewID(Integer productReviewID) {
        this.productReviewID = productReviewID;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productReviewID != null ? productReviewID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productreview)) {
            return false;
        }
        Productreview other = (Productreview) object;
        if ((this.productReviewID == null && other.productReviewID != null) || (this.productReviewID != null && !this.productReviewID.equals(other.productReviewID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Productreview[ productReviewID=" + productReviewID + " ]";
    }

}
