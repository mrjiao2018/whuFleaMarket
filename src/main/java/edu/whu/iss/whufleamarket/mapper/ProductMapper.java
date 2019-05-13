package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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
     *      *
     * @return
     */
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "title", property = "title"),
            @Result(column = "description", property = "description"),
            @Result(column = "address", property = "address"),
            @Result(column = "price", property = "price"),
            @Result(column = "time", property = "time"),
            @Result(column = "status", property = "status"),
            @Result(column = "mode", property = "mode"),
            @Result(column = "new_degree", property = "newDegree"),
            @Result(column = "category_id", property = "category",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.ProductCategoryMapper.queryImgAddrByProductId"))
//            @Result(column = "owner_id", property = "owner",
//                    one = @One(select = "select * from tb_person_info where id = 1"))
    })
    @Select("select * from tb_product")
    List<Product> queryAll();
}
