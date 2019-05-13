package edu.whu.iss.whufleamarket.vo;

import edu.whu.iss.whufleamarket.enums.ProductCategoryEnum;

import java.util.Date;

/**
 * 所有的 category 创建应从 ProductCategoryEnum 中指定
 */
public class ProductCategory {
    private Integer productCategoryId;
    private String productCategoryName;

    public ProductCategory(){}

//    public ProductCategory(ProductCategoryEnum productCategoryEnum){
//        productCategoryId = productCategoryEnum.getType();
//        productCategoryName = productCategoryEnum.getTypeInfo();
//    }

    public void setProductCategoryId(Integer productCategoryId){
        this.productCategoryId = productCategoryId;
    }

    public void setProductCategoryName(String productCategoryName){
        this.productCategoryName = productCategoryName;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }
}
