package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.ShareProduct;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ShareProductMapper {
    //resultmap实现一对多查询，将图片信息整合到ShareProduct对象中
    @Results({
            @Result(property = "shareProductId",column = "share_product_id"),
            @Result(property = "productImgs",column = "share_product_id",
                    many = @Many(select = "edu.whu.iss.whufleamarket.mapper.ShareProductImgMapper.queryImgAddrByProductId"))
    })
    @Select({"Select * from tb_share_product where product_category_id = #{category} "
            +"and location = #{location}"})
    List<ShareProduct> queryByCateAndLoc(@Param("category")int category, @Param("location") int location);

    @Results({
            @Result(property = "shareProductId",column = "share_product_id"),
            @Result(property = "productImgs",column = "share_product_id",
                    many = @Many(select = "edu.whu.iss.whufleamarket.mapper.ShareProductImgMapper.queryImgAddrByProductId"))
    })
    @Select({"Select * from tb_share_product where share_product_name  like CONCAT('%',#{input},'%')"})
    List<ShareProduct> fuzzyQueryByName(@Param("input")String input);
}
