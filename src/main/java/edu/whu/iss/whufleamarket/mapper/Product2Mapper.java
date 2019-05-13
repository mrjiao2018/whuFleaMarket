package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.Product;
import edu.whu.iss.whufleamarket.vo.ShareProduct;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Product2Mapper
{
    @Results({@Result(property = "id",column = "product_id"),@Result(property = "images",column = "product_id",many = @Many(select = "edu.whu.iss.whufleamarket.mapper.ProductImgMapper.queryImgAddrByProductId"))})
    @Select({"Select * from tb_product where owner_id = #{userId} "})
    List<Product> queryByOwnerId(@Param("userId")int userId);
}
