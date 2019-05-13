package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.ProductCategory;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ProductCategoryMapper {
    @Select("select * from tb_product_category where product_category_id = #{categoryId}")
    ProductCategory queryProductCategoryById(Integer categoryId);
}
