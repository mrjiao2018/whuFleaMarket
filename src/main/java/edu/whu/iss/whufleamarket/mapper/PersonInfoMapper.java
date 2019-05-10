package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PersonInfoMapper
{
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    @Insert("insert into tb_person_info(open_id,nickname,head_src," +
            "gender,country,province,city) " +
            "values(#{openId}, #{nickname}, #{headSrc}, #{gender}, #{country}, #{province}, #{city})")
    int insertPersonInfo(PersonInfo personInfo);

    @Select("select * from tb_person_info where open_id=#{id}")
    PersonInfo queryPersonInfoById(String openId);

    @Update("update tb_person_info set name = #{name}, " +
            "head_src = #{headSrc}," +
            "school = #{school}, " +
            "address = #{address}, " +
            "phone = #{phone} " +
            "where open_id = #{openId}")
    int updatePersonInfo(PersonInfo personInfo);
}
