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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String productAddr) {
        this.address = productAddr;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> productImgs) {
        this.images = productImgs;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
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
