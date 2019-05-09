package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    /**
     * 新增二手商品
     * @param product
     * @return
     */
    int insertProduct(Product product);

    /**
     * 根据类别获取所有买卖
     * @return
     */
    @Select("select * from tb_product where product_category_id = #{productCategoryId}")
    List<Product> queryByCategoryId(Long productCategoryId);
}
