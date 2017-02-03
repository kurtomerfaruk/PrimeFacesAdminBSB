/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Created on date 27.01.2017 23:11:05
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
    @NamedQuery(name = "Product.findBySizeUnitMeasureCode", query = "SELECT p FROM Product p WHERE p.sizeUnitMeasureCode = :sizeUnitMeasureCode"),
    @NamedQuery(name = "Product.findByWeightUnitMeasureCode", query = "SELECT p FROM Product p WHERE p.weightUnitMeasureCode = :weightUnitMeasureCode"),
    @NamedQuery(name = "Product.findByWeight", query = "SELECT p FROM Product p WHERE p.weight = :weight"),
    @NamedQuery(name = "Product.findByDaysToManufacture", query = "SELECT p FROM Product p WHERE p.daysToManufacture = :daysToManufacture"),
    @NamedQuery(name = "Product.findByProductLine", query = "SELECT p FROM Product p WHERE p.productLine = :productLine"),
    @NamedQuery(name = "Product.findByClass1", query = "SELECT p FROM Product p WHERE p.class1 = :class1"),
    @NamedQuery(name = "Product.findByStyle", query = "SELECT p FROM Product p WHERE p.style = :style"),
    @NamedQuery(name = "Product.findByProductSubcategoryID", query = "SELECT p FROM Product p WHERE p.productSubcategoryID = :productSubcategoryID"),
    @NamedQuery(name = "Product.findByProductModelID", query = "SELECT p FROM Product p WHERE p.productModelID = :productModelID"),
    @NamedQuery(name = "Product.findBySellStartDate", query = "SELECT p FROM Product p WHERE p.sellStartDate = :sellStartDate"),
    @NamedQuery(name = "Product.findBySellEndDate", query = "SELECT p FROM Product p WHERE p.sellEndDate = :sellEndDate"),
    @NamedQuery(name = "Product.findByDiscontinuedDate", query = "SELECT p FROM Product p WHERE p.discontinuedDate = :discontinuedDate"),
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
    @Size(min = 1, max = 50)
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "StandardCost")
    private double standardCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ListPrice")
    private double listPrice;
    @Size(max = 5)
    @Column(name = "Size")
    private String size;
    @Size(max = 3)
    @Column(name = "SizeUnitMeasureCode")
    private String sizeUnitMeasureCode;
    @Size(max = 3)
    @Column(name = "WeightUnitMeasureCode")
    private String weightUnitMeasureCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
    @Column(name = "ProductSubcategoryID")
    private Integer productSubcategoryID;
    @Column(name = "ProductModelID")
    private Integer productModelID;
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
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Product() {
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Product(Integer productID, String name, String productNumber, boolean makeFlag, boolean finishedGoodsFlag, short safetyStockLevel, short reorderPoint, double standardCost, double listPrice, int daysToManufacture, Date sellStartDate, byte[] rowguid, Date modifiedDate) {
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

    public double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(double standardCost) {
        this.standardCost = standardCost;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeUnitMeasureCode() {
        return sizeUnitMeasureCode;
    }

    public void setSizeUnitMeasureCode(String sizeUnitMeasureCode) {
        this.sizeUnitMeasureCode = sizeUnitMeasureCode;
    }

    public String getWeightUnitMeasureCode() {
        return weightUnitMeasureCode;
    }

    public void setWeightUnitMeasureCode(String weightUnitMeasureCode) {
        this.weightUnitMeasureCode = weightUnitMeasureCode;
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

    public Integer getProductSubcategoryID() {
        return productSubcategoryID;
    }

    public void setProductSubcategoryID(Integer productSubcategoryID) {
        this.productSubcategoryID = productSubcategoryID;
    }

    public Integer getProductModelID() {
        return productModelID;
    }

    public void setProductModelID(Integer productModelID) {
        this.productModelID = productModelID;
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
        return "com.kurtomerfaruk.primeadminbsb.models.Product[ productID=" + productID + " ]";
    }

}
