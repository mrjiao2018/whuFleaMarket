package edu.whu.iss.whufleamarket.vo;

import java.util.Date;

public class PurchaseProduct {
    private String purchaseProductID;          //求购编号
    private Integer owner_id;
    private String purchaseProductAddress;    //求购发布地址
    private String purchaseProductContent;    //求购物品内容
    private String purchaseProductStatus;     //求购状态
    private String purchaseProductCategory;  // 求购物品种类
    private String purchaseProductMode;       //求购交易类型
    private Date purchaseProductTime;         //求购发布时间


    public String getPurchaseProductID() {
        return purchaseProductID;
    }

    public void setOwner_id(Integer owner_id){this.owner_id=owner_id;}

    public Integer getOwner_id(){return owner_id;}

    public void setPurchaseProductID(String purchaseProductID) {
        this.purchaseProductID = purchaseProductID;
    }

    public String getPurchaseProductAddress() {
        return purchaseProductAddress;
    }

    public void setPurchaseProductAddress(String purchaseProductAddress) {
        this.purchaseProductAddress = purchaseProductAddress;
    }

    public String getPurchaseProductContent() {
        return purchaseProductContent;
    }

    public void setPurchaseProductContent(String purchaseProductContent) {
        this.purchaseProductContent = purchaseProductContent;
    }

    public String getPurchaseProductStatus() {
        return purchaseProductStatus;
    }

    public void setPurchaseProductStatus(String purchaseProductStatus) {
        this.purchaseProductStatus = purchaseProductStatus;
    }

    public String getPurchaseProductCategory() {
        return purchaseProductCategory;
    }

    public void setPurchaseProductCategory(String purchaseProductCategory) {
        this.purchaseProductCategory = purchaseProductCategory;
    }

    public Date getPurchaseProductTime() {
        return purchaseProductTime;
    }

    public void setPurchaseProductTime(Date purchaseProductTime) {
        this.purchaseProductTime = purchaseProductTime;
    }

    public String getPurchaseProductMode() {
        return purchaseProductMode;
    }

    public void setPurchaseProductMode(String purchaseProductMode) {
        this.purchaseProductMode = purchaseProductMode;
    }


}
