package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.Product;
import org.apache.ibatis.annotations.Mapper;

//指定这是一个操作数据库的 Mapper
@Mapper
public interface ProductMapper {
    /**
     * 新增二手商品
     * @param product
     * @return
     */
    int insertProduct(Product product);


}
