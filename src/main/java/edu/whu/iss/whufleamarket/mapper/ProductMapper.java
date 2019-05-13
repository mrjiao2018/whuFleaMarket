package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.Product;
import org.apache.ibatis.annotations.*;

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
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "category", column = "category_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.ProductCategoryMapper.queryProductCategoryById")),
            @Result(property = "owner", column = "owner_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.PersonInfoMapper.queryPersonInfoByUserId")),
            @Result(property = "images",column = "id",
                    many = @Many(select = "edu.whu.iss.whufleamarket.mapper.ProductImgMapper.queryImgAddrByProductId"))
    })
    @Select("select * from tb_product where category_id = #{productCategoryId}")
    List<Product> queryByCategoryId(Long productCategoryId);

    /**
     * 获取所有买卖
     *
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "category", column = "category_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.ProductCategoryMapper.queryProductCategoryById")),
            @Result(property = "owner", column = "owner_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.PersonInfoMapper.queryPersonInfoByUserId")),
            @Result(property = "images",column = "id",
                    many = @Many(select = "edu.whu.iss.whufleamarket.mapper.ProductImgMapper.queryImgAddrByProductId"))
    })
    @Select("select * from tb_product")
    List<Product> queryAll();

    /**
     * 搜索商品
     * @param productTitle
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "category", column = "category_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.ProductCategoryMapper.queryProductCategoryById")),
            @Result(property = "owner", column = "owner_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.PersonInfoMapper.queryPersonInfoByUserId")),
            @Result(property = "images",column = "id",
                    many = @Many(select = "edu.whu.iss.whufleamarket.mapper.ProductImgMapper.queryImgAddrByProductId"))
    })
    @Select("select * from tb_product where title like CONCAT('%',#{productTitle},'%')")
    List<Product> queryByTitle(String productTitle);
}
