package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Faruk
 */
@Entity
@Table(name = "contact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c"), 
    @NamedQuery(name = "Contact.findByContactID", query = "SELECT c FROM Contact c WHERE c.contactID = :contactID"), 
    @NamedQuery(name = "Contact.findByNameStyle", query = "SELECT c FROM Contact c WHERE c.nameStyle = :nameStyle")
    , @NamedQuery(name = "Contact.findByTitle", query = "SELECT c FROM Contact c WHERE c.title = :title")
    , @NamedQuery(name = "Contact.findByFirstName", query = "SELECT c FROM Contact c WHERE c.firstName = :firstName")
    , @NamedQuery(name = "Contact.findByMiddleName", query = "SELECT c FROM Contact c WHERE c.middleName = :middleName")
    , @NamedQuery(name = "Contact.findByLastName", query = "SELECT c FROM Contact c WHERE c.lastName = :lastName")
    , @NamedQuery(name = "Contact.findBySuffix", query = "SELECT c FROM Contact c WHERE c.suffix = :suffix")
    , @NamedQuery(name = "Contact.findByEmailAddress", query = "SELECT c FROM Contact c WHERE c.emailAddress = :emailAddress")
    , @NamedQuery(name = "Contact.findByEmailPromotion", query = "SELECT c FROM Contact c WHERE c.emailPromotion = :emailPromotion")
    , @NamedQuery(name = "Contact.findByPhone", query = "SELECT c FROM Contact c WHERE c.phone = :phone")
    , @NamedQuery(name = "Contact.findByPasswordHash", query = "SELECT c FROM Contact c WHERE c.passwordHash = :passwordHash")
    , @NamedQuery(name = "Contact.findByPasswordSalt", query = "SELECT c FROM Contact c WHERE c.passwordSalt = :passwordSalt")
    , @NamedQuery(name = "Contact.findByModifiedDate", query = "SELECT c FROM Contact c WHERE c.modifiedDate = :modifiedDate")})
public class Contact extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ContactID")
    private Integer contactID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NameStyle")
    private boolean nameStyle;
    @Size(max = 8)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FirstName")
    private String firstName;
    @Size(max = 50)
    @Column(name = "MiddleName")
    private String middleName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LastName")
    private String lastName;
    @Size(max = 10)
    @Column(name = "Suffix")
    private String suffix;
    @Size(max = 50)
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmailPromotion")
    private int emailPromotion;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 25)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "PasswordHash")
    private String passwordHash;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PasswordSalt")
    private String passwordSalt;
    @Lob
    @Size(max = 16777215)
    @Column(name = "AdditionalContactInfo")
    private String additionalContactInfo;

    public Contact() {
    }

    public Contact(Integer contactID) {
        this.contactID = contactID;
    }

    public Contact(Integer contactID, boolean nameStyle, String firstName, String lastName, int emailPromotion, String passwordHash, String passwordSalt) {
        this.contactID = contactID;
        this.nameStyle = nameStyle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailPromotion = emailPromotion;
        this.passwordHash = passwordHash;
        this.passwordSalt = passwordSalt;
    }

    public Integer getContactID() {
        return contactID;
    }

    public void setContactID(Integer contactID) {
        this.contactID = contactID;
    }

    public boolean getNameStyle() {
        return nameStyle;
    }

    public void setNameStyle(boolean nameStyle) {
        this.nameStyle = nameStyle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getEmailPromotion() {
        return emailPromotion;
    }

    public void setEmailPromotion(int emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getAdditionalContactInfo() {
        return additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactID != null ? contactID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.contactID == null && other.contactID != null) || (this.contactID != null && !this.contactID.equals(other.contactID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Contact[ contactID=" + contactID + " ]";
    }

}
