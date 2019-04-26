package edu.whu.iss.whufleamarket.vo;

import edu.whu.iss.whufleamarket.enums.ProductCategoryEnum;

import java.util.Date;

/**
 * 所有的 category 创建应从 ProductCategoryEnum 中指定
 */
public class ProductCategory {
    private Integer productCategoryId;
    private String productCategoryName;
    private Date createTime;
    private Date lastEditTIme;

    public ProductCategory(ProductCategoryEnum productCategoryEnum){
        productCategoryId = productCategoryEnum.getType();
        productCategoryName = productCategoryEnum.getTypeInfo();
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTIme() {
        return lastEditTIme;
    }

    public void setLastEditTIme(Date lastEditTIme) {
        this.lastEditTIme = lastEditTIme;
    }
}
