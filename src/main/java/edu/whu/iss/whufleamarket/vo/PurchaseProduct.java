package edu.whu.iss.whufleamarket.vo;

import java.util.Date;

public class PurchaseProduct {
    private String id;          //求购编号
    private Integer owner_id;
    private String address;    //求购发布地址
    private String content;    //求购物品内容
    private String status;     //求购状态
    private String category;  // 求购物品种类
    private String mode;       //求购交易类型
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

    public String getPurchaseProductStatus() {
        return status;
    }

    public void setPurchaseProductStatus(String status) {
        this.status = status;
    }

    public String getPurchaseProductCategory() {
        return category;
    }

    public void setPurchaseProductCategory(String category) {
        this.category = category;
    }

    public String getPurchaseProductTime() {
        return time;
    }

    public void setPurchaseProductTime(String time) {
        this.time = time;
    }

    public String getPurchaseProductMode() {
        return mode;
    }

    public void setPurchaseProductMode(String mode) {
        this.mode = mode;
    }


}
