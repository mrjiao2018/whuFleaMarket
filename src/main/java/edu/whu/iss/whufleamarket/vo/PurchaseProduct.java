package edu.whu.iss.whufleamarket.vo;

import java.util.Date;
import java.util.List;

public class PurchaseProduct {
    private String id;          //求购编号
    private PersonInfo owner;
    private Long ownerID;
    private String address;    //求购发布地址
    private String content;    //求购物品内容
    private Integer status;     //求购状态
    private Integer category;  // 求购物品种类
    private Integer mode;       //求购交易类型
    private String time;         //求购发布时间
    private String price;
    private List<String> purchaseProductImgs;

    public List<String> getPurchaseProductImgs() {
        return purchaseProductImgs;
    }

    public void setPurchaseProductImgs(List<String> purchaseProductImgs) {
        this.purchaseProductImgs = purchaseProductImgs;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }

    public String getId() {
        return id;
    }

    public PersonInfo getOwner() {
        return owner;
    }

    public void setOwner(PersonInfo owner) {
        this.owner = owner;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }


}
