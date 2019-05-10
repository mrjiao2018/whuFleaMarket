package edu.whu.iss.whufleamarket.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductImgMapper {
    @Select("select img_addr from tb_product_img where product_id = #{productId}")
    List<String> queryImgAddrByProductId(Long productId);
}
