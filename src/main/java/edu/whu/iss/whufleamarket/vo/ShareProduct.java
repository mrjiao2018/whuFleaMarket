package edu.whu.iss.whufleamarket.vo;

import java.util.Date;
import java.util.List;

public class ShareProduct extends Product{
    private Integer likes;//点赞数
    private Integer status;//共享物品的状态 0：在架上 1：租用中
    private Integer location;//共享物品的位置：0: 全部 1：文理学部 2：信息学部 3：工学部 4：医学部
    private Long shareProductId;
    private String shareProductName;
    private String shareProductDesc;
    private String shareProductAddr;
    private List<String> productImgs;
    private ProductCategory productCategory;
    private String newDegree;   //商品新旧程度
    private String price;
    private PersonInfo owner;
    private Date createTime;
    private Date lastEditTime;

    public ShareProduct() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Long getShareProductId() {
        return shareProductId;
    }

    public void setShareProductId(Long shareProductId) {
        this.shareProductId = shareProductId;
    }

    public String getShareProductName() {
        return shareProductName;
    }

    public void setShareProductName(String shareProductName) {
        this.shareProductName = shareProductName;
    }

    public String getShareProductDesc() {
        return shareProductDesc;
    }

    public void setShareProductDesc(String shareProductDesc) {
        this.shareProductDesc = shareProductDesc;
    }

    public String getShareProductAddr() {
        return shareProductAddr;
    }

    public void setShareProductAddr(String shareProductAddr) {
        this.shareProductAddr = shareProductAddr;
    }

    @Override
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    @Override
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String getNewDegree() {
        return newDegree;
    }

    @Override
    public void setNewDegree(String newDegree) {
        this.newDegree = newDegree;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public PersonInfo getOwner() {
        return owner;
    }

    @Override
    public void setOwner(PersonInfo owner) {
        this.owner = owner;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public Date getLastEditTime() {
        return lastEditTime;
    }

    @Override
    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Override
    public List<String> getProductImgs() {
        return productImgs;
    }

    @Override
    public void setProductImgs(List<String> productImgs) {
        this.productImgs = productImgs;
    }
}
