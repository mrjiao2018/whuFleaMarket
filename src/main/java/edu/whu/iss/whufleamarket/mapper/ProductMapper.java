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
     * todo 根据类别获取所有买卖，需要定义一个 resultMap，整合 owner 信息和 images 信息
     * @return
     */
    @Select("select * from tb_product where product_category_id = #{productCategoryId}")
    List<Product> queryByCategoryId(Long productCategoryId);

    /**
     * todo 获取所有买卖，需要定义一个 resultMap，整合 owner 信息和 images 信息
     *
     * @return
     */
    @Select("select * from tb_product")
    List<Product> queryAll();
}
