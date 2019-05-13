package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.dto.ProductExecution;
import edu.whu.iss.whufleamarket.vo.Product;
import edu.whu.iss.whufleamarket.vo.PublishProduct;

import java.io.InputStream;
import java.util.List;

public interface Product2Service
{
    /**
     * 根据用户id获取发布
     *
     * @param ownerId 用户Id
     * @return 用户发布的买卖
     */
    List<PublishProduct> getProductsByOwnerId(int ownerId);
}
