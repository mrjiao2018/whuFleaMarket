package edu.whu.iss.whufleamarket.vo;

import java.util.Date;
import java.util.List;

/**
 * 二手商品类
 */
public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    private String productAddr;
    private List<String> productImgs;
    private ProductCategory productCategory;
    private String newDegree;   //商品新旧程度
    private String price;
    private PersonInfo owner;
    private Date createTime;
    private Date lastEditTime;
    //todo 完善共享商品和求购商品的相关属性，并完善对应的 product.sql
    private boolean share;      //是否是共享商品
    private boolean purchase;   //是否是用户求购商品

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductAddr() {
        return productAddr;
    }

    public void setProductAddr(String productAddr) {
        this.productAddr = productAddr;
    }

    public List<String> getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(List<String> productImgs) {
        this.productImgs = productImgs;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PersonInfo getOwner() {
        return owner;
    }

    public void setOwner(PersonInfo owner) {
        this.owner = owner;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getNewDegree() {
        return newDegree;
    }

    public void setNewDegree(String newDegree) {
        this.newDegree = newDegree;
    }
}