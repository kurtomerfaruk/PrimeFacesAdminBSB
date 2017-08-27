/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.JoinColumn;
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
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByProductID", query = "SELECT p FROM Product p WHERE p.productID = :productID"),
    @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name"),
    @NamedQuery(name = "Product.findByProductNumber", query = "SELECT p FROM Product p WHERE p.productNumber = :productNumber"),
    @NamedQuery(name = "Product.findByMakeFlag", query = "SELECT p FROM Product p WHERE p.makeFlag = :makeFlag"),
    @NamedQuery(name = "Product.findByFinishedGoodsFlag", query = "SELECT p FROM Product p WHERE p.finishedGoodsFlag = :finishedGoodsFlag"),
    @NamedQuery(name = "Product.findByColor", query = "SELECT p FROM Product p WHERE p.color = :color"),
    @NamedQuery(name = "Product.findBySafetyStockLevel", query = "SELECT p FROM Product p WHERE p.safetyStockLevel = :safetyStockLevel"),
    @NamedQuery(name = "Product.findByReorderPoint", query = "SELECT p FROM Product p WHERE p.reorderPoint = :reorderPoint"),
    @NamedQuery(name = "Product.findByStandardCost", query = "SELECT p FROM Product p WHERE p.standardCost = :standardCost"),
    @NamedQuery(name = "Product.findByListPrice", query = "SELECT p FROM Product p WHERE p.listPrice = :listPrice"),
    @NamedQuery(name = "Product.findBySize", query = "SELECT p FROM Product p WHERE p.size = :size"),
    @NamedQuery(name = "Product.findByWeight", query = "SELECT p FROM Product p WHERE p.weight = :weight"),
    @NamedQuery(name = "Product.findByDaysToManufacture", query = "SELECT p FROM Product p WHERE p.daysToManufacture = :daysToManufacture"),
    @NamedQuery(name = "Product.findByProductLine", query = "SELECT p FROM Product p WHERE p.productLine = :productLine"),
    @NamedQuery(name = "Product.findByClass1", query = "SELECT p FROM Product p WHERE p.class1 = :class1"),
    @NamedQuery(name = "Product.findByStyle", query = "SELECT p FROM Product p WHERE p.style = :style"),
    @NamedQuery(name = "Product.findBySellStartDate", query = "SELECT p FROM Product p WHERE p.sellStartDate = :sellStartDate"),
    @NamedQuery(name = "Product.findBySellEndDate", query = "SELECT p FROM Product p WHERE p.sellEndDate = :sellEndDate"),
    @NamedQuery(name = "Product.findByDiscontinuedDate", query = "SELECT p FROM Product p WHERE p.discontinuedDate = :discontinuedDate"),
    @NamedQuery(name = "Product.findByRowguid", query = "SELECT p FROM Product p WHERE p.rowguid = :rowguid"),
    @NamedQuery(name = "Product.findByModifiedDate", query = "SELECT p FROM Product p WHERE p.modifiedDate = :modifiedDate")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductID")
    private Integer productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ProductNumber")
    private String productNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MakeFlag")
    private boolean makeFlag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FinishedGoodsFlag")
    private boolean finishedGoodsFlag;
    @Size(max = 15)
    @Column(name = "Color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SafetyStockLevel")
    private short safetyStockLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReorderPoint")
    private short reorderPoint;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "StandardCost")
    private BigDecimal standardCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ListPrice")
    private BigDecimal listPrice;
    @Size(max = 5)
    @Column(name = "Size")
    private String size;
    @Column(name = "Weight")
    private BigDecimal weight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DaysToManufacture")
    private int daysToManufacture;
    @Size(max = 2)
    @Column(name = "ProductLine")
    private String productLine;
    @Size(max = 2)
    @Column(name = "Class")
    private String class1;
    @Size(max = 2)
    @Column(name = "Style")
    private String style;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SellStartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sellStartDate;
    @Column(name = "SellEndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sellEndDate;
    @Column(name = "DiscontinuedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discontinuedDate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Transactionhistory> transactionhistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Productproductphoto> productproductphotoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Purchaseorderdetail> purchaseorderdetailList;
    @OneToMany(mappedBy = "productAssemblyID")
    private List<Billofmaterials> billofmaterialsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "componentID")
    private List<Billofmaterials> billofmaterialsList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Specialofferproduct> specialofferproductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Productlistpricehistory> productlistpricehistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Productvendor> productvendorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Shoppingcartitem> shoppingcartitemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Productdocument> productdocumentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Productcosthistory> productcosthistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Productinventory> productinventoryList;
    @JoinColumn(name = "WeightUnitMeasureCode", referencedColumnName = "UnitMeasureCode")
    @ManyToOne(fetch = FetchType.LAZY)
    private Unitmeasure weightUnitMeasureCode;
    @JoinColumn(name = "SizeUnitMeasureCode", referencedColumnName = "UnitMeasureCode")
    @ManyToOne(fetch = FetchType.LAZY)
    private Unitmeasure sizeUnitMeasureCode;
    @JoinColumn(name = "ProductSubcategoryID", referencedColumnName = "ProductSubcategoryID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productsubcategory productSubcategoryID;
    @JoinColumn(name = "ProductModelID", referencedColumnName = "ProductModelID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productmodel productModelID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Workorder> workorderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Productreview> productreviewList;

    public Product() {
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Product(Integer productID, String name, String productNumber, boolean makeFlag, boolean finishedGoodsFlag, short safetyStockLevel, short reorderPoint, BigDecimal standardCost, BigDecimal listPrice, int daysToManufacture, Date sellStartDate, String rowguid, Date modifiedDate) {
        this.productID = productID;
        this.name = name;
        this.productNumber = productNumber;
        this.makeFlag = makeFlag;
        this.finishedGoodsFlag = finishedGoodsFlag;
        this.safetyStockLevel = safetyStockLevel;
        this.reorderPoint = reorderPoint;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.daysToManufacture = daysToManufacture;
        this.sellStartDate = sellStartDate;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public boolean getMakeFlag() {
        return makeFlag;
    }

    public void setMakeFlag(boolean makeFlag) {
        this.makeFlag = makeFlag;
    }

    public boolean getFinishedGoodsFlag() {
        return finishedGoodsFlag;
    }

    public void setFinishedGoodsFlag(boolean finishedGoodsFlag) {
        this.finishedGoodsFlag = finishedGoodsFlag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getSafetyStockLevel() {
        return safetyStockLevel;
    }

    public void setSafetyStockLevel(short safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public short getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(short reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public BigDecimal getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getDaysToManufacture() {
        return daysToManufacture;
    }

    public void setDaysToManufacture(int daysToManufacture) {
        this.daysToManufacture = daysToManufacture;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Date getSellStartDate() {
        return sellStartDate;
    }

    public void setSellStartDate(Date sellStartDate) {
        this.sellStartDate = sellStartDate;
    }

    public Date getSellEndDate() {
        return sellEndDate;
    }

    public void setSellEndDate(Date sellEndDate) {
        this.sellEndDate = sellEndDate;
    }

    public Date getDiscontinuedDate() {
        return discontinuedDate;
    }

    public void setDiscontinuedDate(Date discontinuedDate) {
        this.discontinuedDate = discontinuedDate;
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

    @XmlTransient
    public List<Transactionhistory> getTransactionhistoryList() {
        return transactionhistoryList;
    }

    public void setTransactionhistoryList(List<Transactionhistory> transactionhistoryList) {
        this.transactionhistoryList = transactionhistoryList;
    }

    @XmlTransient
    public List<Productproductphoto> getProductproductphotoList() {
        return productproductphotoList;
    }

    public void setProductproductphotoList(List<Productproductphoto> productproductphotoList) {
        this.productproductphotoList = productproductphotoList;
    }

    @XmlTransient
    public List<Purchaseorderdetail> getPurchaseorderdetailList() {
        return purchaseorderdetailList;
    }

    public void setPurchaseorderdetailList(List<Purchaseorderdetail> purchaseorderdetailList) {
        this.purchaseorderdetailList = purchaseorderdetailList;
    }

    @XmlTransient
    public List<Billofmaterials> getBillofmaterialsList() {
        return billofmaterialsList;
    }

    public void setBillofmaterialsList(List<Billofmaterials> billofmaterialsList) {
        this.billofmaterialsList = billofmaterialsList;
    }

    @XmlTransient
    public List<Billofmaterials> getBillofmaterialsList1() {
        return billofmaterialsList1;
    }

    public void setBillofmaterialsList1(List<Billofmaterials> billofmaterialsList1) {
        this.billofmaterialsList1 = billofmaterialsList1;
    }

    @XmlTransient
    public List<Specialofferproduct> getSpecialofferproductList() {
        return specialofferproductList;
    }

    public void setSpecialofferproductList(List<Specialofferproduct> specialofferproductList) {
        this.specialofferproductList = specialofferproductList;
    }

    @XmlTransient
    public List<Productlistpricehistory> getProductlistpricehistoryList() {
        return productlistpricehistoryList;
    }

    public void setProductlistpricehistoryList(List<Productlistpricehistory> productlistpricehistoryList) {
        this.productlistpricehistoryList = productlistpricehistoryList;
    }

    @XmlTransient
    public List<Productvendor> getProductvendorList() {
        return productvendorList;
    }

    public void setProductvendorList(List<Productvendor> productvendorList) {
        this.productvendorList = productvendorList;
    }

    @XmlTransient
    public List<Shoppingcartitem> getShoppingcartitemList() {
        return shoppingcartitemList;
    }

    public void setShoppingcartitemList(List<Shoppingcartitem> shoppingcartitemList) {
        this.shoppingcartitemList = shoppingcartitemList;
    }

    @XmlTransient
    public List<Productdocument> getProductdocumentList() {
        return productdocumentList;
    }

    public void setProductdocumentList(List<Productdocument> productdocumentList) {
        this.productdocumentList = productdocumentList;
    }

    @XmlTransient
    public List<Productcosthistory> getProductcosthistoryList() {
        return productcosthistoryList;
    }

    public void setProductcosthistoryList(List<Productcosthistory> productcosthistoryList) {
        this.productcosthistoryList = productcosthistoryList;
    }

    @XmlTransient
    public List<Productinventory> getProductinventoryList() {
        return productinventoryList;
    }

    public void setProductinventoryList(List<Productinventory> productinventoryList) {
        this.productinventoryList = productinventoryList;
    }

    public Unitmeasure getWeightUnitMeasureCode() {
        return weightUnitMeasureCode;
    }

    public void setWeightUnitMeasureCode(Unitmeasure weightUnitMeasureCode) {
        this.weightUnitMeasureCode = weightUnitMeasureCode;
    }

    public Unitmeasure getSizeUnitMeasureCode() {
        return sizeUnitMeasureCode;
    }

    public void setSizeUnitMeasureCode(Unitmeasure sizeUnitMeasureCode) {
        this.sizeUnitMeasureCode = sizeUnitMeasureCode;
    }

    public Productsubcategory getProductSubcategoryID() {
        return productSubcategoryID;
    }

    public void setProductSubcategoryID(Productsubcategory productSubcategoryID) {
        this.productSubcategoryID = productSubcategoryID;
    }

    public Productmodel getProductModelID() {
        return productModelID;
    }

    public void setProductModelID(Productmodel productModelID) {
        this.productModelID = productModelID;
    }

    @XmlTransient
    public List<Workorder> getWorkorderList() {
        return workorderList;
    }

    public void setWorkorderList(List<Workorder> workorderList) {
        this.workorderList = workorderList;
    }

    @XmlTransient
    public List<Productreview> getProductreviewList() {
        return productreviewList;
    }

    public void setProductreviewList(List<Productreview> productreviewList) {
        this.productreviewList = productreviewList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Product[ productID=" + productID + " ]";
    }

}
