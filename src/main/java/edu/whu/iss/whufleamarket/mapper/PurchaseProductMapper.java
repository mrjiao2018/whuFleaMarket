package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
import org.apache.ibatis.annotations.*;

public interface PurchaseProductMapper {
    @Options(useGeneratedKeys = true, keyProperty = "purchase_product_id")
    @Insert("insert into tb_purchase_product(address, time,content, " +
            "status, mode, category) values(#{address}, #{time})" +
            "values(#{content},values(#status},values(#{mode},values(#{category}")
    int insertPurchaseProduct(PurchaseProduct purchaseProduct);

    @Select("select * from tb_purchase_product")
    PurchaseProduct queryAll();

    @Select("select * from tb_purchase_product whereCategory=#{Category}")
   PurchaseProduct queryPurchaseProductByCategory(String purchaseProductCategory);

    @Update("update tb_purchase_product set address = #{address}, " +
            "time = #{time}," +
            "content = #{content}, " +
            "status = #{status}, " +
            "mode = #{mode} " +
            "where id= #{id}")
    int updatePurchaseProduct(PurchaseProduct purchaseProduct);

    @Delete("delete from tb_purchase_product where id= #{id}")
    int deletePurchaseProduct(PurchaseProduct purchaseProduct);
}
