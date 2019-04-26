package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.dto.ProductExecution;
import edu.whu.iss.whufleamarket.vo.Product;
import org.springframework.stereotype.Service;

import java.io.InputStream;

public interface ProductService {
    /**
     * 添加用户发布的二手商品，包括新建商品、添加图片功能
     * @param product
     * @param inputStreams      图片 io 流
     * @param fileNames         图片 name
     * @return
     */
    ProductExecution addProduct(Product product, InputStream[] inputStreams, String[] fileNames);
}
