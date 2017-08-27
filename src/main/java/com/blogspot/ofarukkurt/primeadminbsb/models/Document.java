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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Entity
@Table(name = "document")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d"),
    @NamedQuery(name = "Document.findByDocumentNode", query = "SELECT d FROM Document d WHERE d.documentNode = :documentNode"),
    @NamedQuery(name = "Document.findByDocumentLevel", query = "SELECT d FROM Document d WHERE d.documentLevel = :documentLevel"),
    @NamedQuery(name = "Document.findByTitle", query = "SELECT d FROM Document d WHERE d.title = :title"),
    @NamedQuery(name = "Document.findByFolderFlag", query = "SELECT d FROM Document d WHERE d.folderFlag = :folderFlag"),
    @NamedQuery(name = "Document.findByFileName", query = "SELECT d FROM Document d WHERE d.fileName = :fileName"),
    @NamedQuery(name = "Document.findByFileExtension", query = "SELECT d FROM Document d WHERE d.fileExtension = :fileExtension"),
    @NamedQuery(name = "Document.findByRevision", query = "SELECT d FROM Document d WHERE d.revision = :revision"),
    @NamedQuery(name = "Document.findByChangeNumber", query = "SELECT d FROM Document d WHERE d.changeNumber = :changeNumber"),
    @NamedQuery(name = "Document.findByStatus", query = "SELECT d FROM Document d WHERE d.status = :status"),
    @NamedQuery(name = "Document.findByRowguid", query = "SELECT d FROM Document d WHERE d.rowguid = :rowguid"),
    @NamedQuery(name = "Document.findByModifiedDate", query = "SELECT d FROM Document d WHERE d.modifiedDate = :modifiedDate")})
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DocumentNode")
    private String documentNode;
    @Column(name = "DocumentLevel")
    private Short documentLevel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FolderFlag")
    private boolean folderFlag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
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
    @Size(max = 2147483647)
    @Column(name = "DocumentSummary")
    private String documentSummary;
    @Lob
    @Column(name = "Document")
    private byte[] document;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "Owner", referencedColumnName = "BusinessEntityID")
    @ManyToOne(optional = false)
    private Employee owner;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "document")
    private List<Productdocument> productdocumentList;

    public Document() {
    }

    public Document(String documentNode) {
        this.documentNode = documentNode;
    }

    public Document(String documentNode, String title, boolean folderFlag, String fileName, String fileExtension, String revision, int changeNumber, short status, String rowguid, Date modifiedDate) {
        this.documentNode = documentNode;
        this.title = title;
        this.folderFlag = folderFlag;
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.revision = revision;
        this.changeNumber = changeNumber;
        this.status = status;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public String getDocumentNode() {
        return documentNode;
    }

    public void setDocumentNode(String documentNode) {
        this.documentNode = documentNode;
    }

    public Short getDocumentLevel() {
        return documentLevel;
    }

    public void setDocumentLevel(Short documentLevel) {
        this.documentLevel = documentLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getFolderFlag() {
        return folderFlag;
    }

    public void setFolderFlag(boolean folderFlag) {
        this.folderFlag = folderFlag;
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

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    @XmlTransient
    public List<Productdocument> getProductdocumentList() {
        return productdocumentList;
    }

    public void setProductdocumentList(List<Productdocument> productdocumentList) {
        this.productdocumentList = productdocumentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentNode != null ? documentNode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.documentNode == null && other.documentNode != null) || (this.documentNode != null && !this.documentNode.equals(other.documentNode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Document[ documentNode=" + documentNode + " ]";
    }

}
