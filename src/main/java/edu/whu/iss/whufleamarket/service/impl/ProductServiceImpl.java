package edu.whu.iss.whufleamarket.service.impl;

import edu.whu.iss.whufleamarket.dao.ProductDao;
import edu.whu.iss.whufleamarket.dto.ProductExecution;
import edu.whu.iss.whufleamarket.service.ProductService;
import edu.whu.iss.whufleamarket.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    /**
     * 添加二手商品
     * 方法为事务的，其包含如下几个步骤，只要有一个步骤失败事务就回滚
     * 1. 向数据库中插入商品信息
     * 2. 将用户上传的图片重新命名、调整大小并放入服务器的指定文件夹中
     * @param product
     * @param inputStreams      图片 io 流
     * @param fileNames         图片 name
     * @return
     */
    @Override
    @Transactional
    public ProductExecution addProduct(Product product, InputStream[] inputStreams, String[] fileNames) {
        return null;
    }
}
