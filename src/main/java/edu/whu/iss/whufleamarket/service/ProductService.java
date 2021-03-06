package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.dto.ProductExecution;
import edu.whu.iss.whufleamarket.vo.Product;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

public interface ProductService {
    /**
     * 添加用户发布的二手商品，包括新建商品、添加图片功能
     * @param product
     * @param inputStreams      图片 io 流
     * @param fileNames         图片 name
     * @return
     */
    ProductExecution addProduct(Product product, InputStream[] inputStreams, String[] fileNames);

    /**
     * 根据类别获取当前所有买卖
     *
     * @param productCategoryId
     * @return
     */
    List<Product> getByCategoryId(Long productCategoryId);

    /**
     * 通过商品名称进行模糊查询
     * @param title
     * @return
     */
    List<Product> getByTitle(String title);
}
