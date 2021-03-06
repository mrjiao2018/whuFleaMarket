package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.PersonInfo;
import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PurchaseProductMapper {
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into tb_purchase_product(owner_id, address, time,content, status, mode, category, price) " +
            "values(#{ownerID}, #{address}, #{time}, #{content}, #{status}, #{mode}, #{category}, #{price)")
    int insertPurchaseProduct(PurchaseProduct purchaseProduct);

    @Results({
            @Result(property = "owner", column = "owner_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.PersonInfoMapper.queryPersonInfoByUserId")),
            @Result(property = "id",column = "id"),
            @Result(property = "purchaseProductImgs",column = "id",
                    many = @Many(select = "edu.whu.iss.whufleamarket.mapper.PurchaseProductMapper.queryImgAddrByPurchaseProductId"))
    })
    @Select("select * from tb_purchase_product where category=#{category}")
    List<PurchaseProduct> queryPurchaseProductByCategory(Integer category);

    @Results({
            @Result(property = "owner", column = "owner_id",
                    one = @One(select = "edu.whu.iss.whufleamarket.mapper.PersonInfoMapper.queryPersonInfoByUserId")),
            @Result(property = "id",column = "id"),
            @Result(property = "purchaseProductImgs",column = "id",
                    many = @Many(select = "edu.whu.iss.whufleamarket.mapper.PurchaseProductMapper.queryImgAddrByPurchaseProductId"))
    })
    @Select({"Select * from tb_purchase_product where content like CONCAT('%',#{input},'%')"})
    List<PurchaseProduct> searchPurchase(@Param("input")String input);

    /**
     * 返回用户求购信息
     * @param personInfo 会话中存储的当前用户
     * @return 用户的求购信息
     */
    @Select("select * from tb_purchase_product where owner_id=#{userId}")
    List<PurchaseProduct> queryPurchaseProductByUserId(PersonInfo personInfo);

    @Select("select img_addr from tb_purchase_product_img where pu_product_id = #{id}")
    List<String> queryImgAddrByPurchaseProductId(String id);

    @Select("select * from tb_purchase_product where id=#{id}")
    PurchaseProduct queryPurchaseInfoById(String id);

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
