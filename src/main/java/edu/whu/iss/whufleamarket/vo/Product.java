package edu.whu.iss.whufleamarket.vo;

import java.util.Date;
import java.util.List;

/**
 * 二手商品类
 */
public class Product {
    private Long id;
    private String title;       //商品标题
    private String description;
    private String address;
    private ProductCategory category;
    private String price;
    private PersonInfo owner;
    private Date time;          //创建时间
    private List<String> images;
    private Integer status;     //商品状态，0：上架、1：已被订购
    private Integer mode;       //交易模式，1：代理点、2：自由发布
    private String newDegree;   //商品新旧程度

    public Long getProductId() {
        return id;
    }

    public void setProductId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return title;
    }

    public void setProductName(String title) {
        this.title = title;
    }

    public String getProductDesc() {
        return description;
    }

    public void setProductDesc(String description) {
        this.description = description;
    }

    public String getProductAddr() {
        return address;
    }

    public void setProductAddr(String productAddr) {
        this.address = productAddr;
    }

    public List<String> getProductImgs() {
        return images;
    }

    public void setProductImgs(List<String> productImgs) {
        this.images = productImgs;
    }

    public ProductCategory getProductCategory() {
        return category;
    }

    public void setProductCategory(ProductCategory category) {
        this.category = category;
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
        return time;
    }

    public void setCreateTime(Date time) {
        this.time = time;
    }

    public String getNewDegree() {
        return newDegree;
    }

    public void setNewDegree(String newDegree) {
        this.newDegree = newDegree;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setMode(Integer mode){this.mode = mode;}

    public Integer getMode() {
        return mode;
    }
}
