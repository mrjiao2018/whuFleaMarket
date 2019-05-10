package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface PersonInfoMapper {
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    @Insert("insert into tb_person_info(open_id, name) values(#{openId}, #{name})")
    int insertPersonInfo(PersonInfo personInfo);

    @Select("select * from tb_person_info where id=#{id}")
    PersonInfo queryPersonInfoById(Long id);
}
