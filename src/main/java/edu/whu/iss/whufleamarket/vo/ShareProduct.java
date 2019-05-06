package edu.whu.iss.whufleamarket.vo;

import java.util.Date;
import java.util.List;

// todo 完善基本信息
public class ShareProduct {
    private Long shareProductId;
    private String shareProductName;
    private String shareProductDesc;
    private String shareProductAddr;
    private List<String> shareProductImgs;
    private ProductCategory shareProductCategory;
    private String newDegree;   //商品新旧程度
    private String price;
    private PersonInfo owner;
    private Date createTime;
    private Date lastEditTime;
}
