package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PersonInfoMapper
{
    @Options(useGeneratedKeys = true, keyProperty = "userId")


    /**
     * 注册，插入用户信息
     *
     * @param personInfo 当前用户
     * @return 数据库操作返回值
     */
    @Insert("insert into tb_person_info(open_id,nickname,head_src," +
            "gender,country,province,city) " +
            "values(#{openId}, #{nickname}, #{headSrc}, #{gender}, #{country}, #{province}, #{city})")
    int insertPersonInfo(PersonInfo personInfo);

    /**
     * 根据id获取用户信息
     * @param openId 用户openId
     * @return 对应的用户
     */
    @Select("select * from tb_person_info where open_id=#{id}")
    PersonInfo queryPersonInfoById(String openId);

    /**
     * 更新当前用户
     * @param personInfo 会话中储存的用户
     * @return 数据库操作返回值
     */
    @Update("update tb_person_info set name = #{name}, " +
            "head_src = #{headSrc}," +
            "school = #{school}, " +
            "address = #{address}, " +
            "phone = #{phone} " +
            "where open_id = #{openId}")
    int updatePersonInfo(PersonInfo personInfo);
}
