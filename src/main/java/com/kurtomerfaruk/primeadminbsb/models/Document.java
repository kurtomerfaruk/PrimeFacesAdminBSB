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
@Table(name = "document")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d"),
    @NamedQuery(name = "Document.findByDocumentID", query = "SELECT d FROM Document d WHERE d.documentID = :documentID"),
    @NamedQuery(name = "Document.findByTitle", query = "SELECT d FROM Document d WHERE d.title = :title"),
    @NamedQuery(name = "Document.findByFileExtension", query = "SELECT d FROM Document d WHERE d.fileExtension = :fileExtension"),
    @NamedQuery(name = "Document.findByRevision", query = "SELECT d FROM Document d WHERE d.revision = :revision"),
    @NamedQuery(name = "Document.findByChangeNumber", query = "SELECT d FROM Document d WHERE d.changeNumber = :changeNumber"),
    @NamedQuery(name = "Document.findByStatus", query = "SELECT d FROM Document d WHERE d.status = :status"),
    @NamedQuery(name = "Document.findByModifiedDate", query = "SELECT d FROM Document d WHERE d.modifiedDate = :modifiedDate")})
public class Document implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DocumentID")
    private Integer documentID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "FileName")
    private String fileName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "FileExtension")
    private String fileExtension;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Revision")
    private String revision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChangeNumber")
    private int changeNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private short status;
    @Lob
    @Size(max = 16777215)
    @Column(name = "DocumentSummary")
    private String documentSummary;
    @Lob
    @Column(name = "Document")
    private byte[] document;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Document() {
    }

    public Document(Integer documentID) {
        this.documentID = documentID;
    }

    public Document(Integer documentID, String title, String fileName, String fileExtension, String revision, int changeNumber, short status, Date modifiedDate) {
        this.documentID = documentID;
        this.title = title;
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.revision = revision;
        this.changeNumber = changeNumber;
        this.status = status;
        this.modifiedDate = modifiedDate;
    }

    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public int getChangeNumber() {
        return changeNumber;
    }

    public void setChangeNumber(int changeNumber) {
        this.changeNumber = changeNumber;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getDocumentSummary() {
        return documentSummary;
    }

    public void setDocumentSummary(String documentSummary) {
        this.documentSummary = documentSummary;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
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
        hash += (documentID != null ? documentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.documentID == null && other.documentID != null) || (this.documentID != null && !this.documentID.equals(other.documentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.Document[ documentID=" + documentID + " ]";
    }

}
