package edu.whu.iss.whufleamarket.vo;

import java.util.Date;

public class PurchaseProduct {
    private String id;          //求购编号
    private Integer owner_id;
    private String address;    //求购发布地址
    private String content;    //求购物品内容
    private Integer status;     //求购状态
    private Integer category;  // 求购物品种类
    private Integer mode;       //求购交易类型
    private String time;         //求购发布时间


    public String getPurchaseProductID() {
        return id;
    }

    public void setOwner_id(Integer owner_id){this.owner_id=owner_id;}

    public Integer getOwner_id(){return owner_id;}

    public void setPurchaseProductID(String id) {
        this.id = id;
    }

    public String getPurchaseProductAddress() {
        return address;
    }

    public void setPurchaseProductAddress(String address) {
        this.address = address;
    }

    public String getPurchaseProductContent() {
        return content;
    }

    public void setPurchaseProductContent(String content) {
        this.content = content;
    }

    public Integer getPurchaseProductStatus() {
        return status;
    }

    public void setPurchaseProductStatus(Integer status) {
        this.status = status;
    }

    public Integer getPurchaseProductCategory() {
        return category;
    }

    public void setPurchaseProductCategory(Integer category) {
        this.category = category;
    }

    public String getPurchaseProductTime() {
        return time;
    }

    public void setPurchaseProductTime(String time) {
        this.time = time;
    }

    public Integer getPurchaseProductMode() {
        return mode;
    }

    public void setPurchaseProductMode(Integer mode) {
        this.mode = mode;
    }


}
