package edu.whu.iss.whufleamarket.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShareProductImgMapper {
    @Select("select img_addr from tb_share_product_img where product_id = #{productId}")
    List<String> queryImgAddrByProductId(Long productId);
}
