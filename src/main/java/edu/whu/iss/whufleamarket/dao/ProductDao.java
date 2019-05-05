package edu.whu.iss.whufleamarket.dao;

import edu.whu.iss.whufleamarket.vo.Product;
//import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface ProductDao {
    /**
     * 新增二手商品
     * @param product
     * @return
     */
    int insertProduct(Product product);
}
