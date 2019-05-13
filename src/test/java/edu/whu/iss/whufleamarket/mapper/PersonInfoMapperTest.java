package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.utils.HttpServletRequestUtil;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonInfoMapperTest extends WhufleamarketApplicationTests {
    @Autowired
    PersonInfoMapper personInfoMapper;

    @Test
    public void insertPersonInfo()
    {
        PersonInfo newUser = new PersonInfo();
        newUser.setOpenId("chris2");
        newUser.setNickName("nickname");
        newUser.setHeadSrc("avatarUrl");
        newUser.setGender(0);
        newUser.setCountry("country");
        newUser.setProvince("province");
        newUser.setCity("city");
        personInfoMapper.insertPersonInfo(newUser);
    }

    @Test
    public void updatePersonInfo()
    {
        PersonInfo oldUser = new PersonInfo();
        oldUser.setOpenId("chris2");
        oldUser.setName("name2");
        oldUser.setHeadSrc("headSrc2");
        oldUser.setSchool("school2");
        oldUser.setAddress("Address2");
        oldUser.setPhone("phone2");
        int i = personInfoMapper.updatePersonInfo(oldUser);
    }

    @Test
    public void queryPersonInfoById(){
//        PersonInfo personInfo = personInfoMapper.queryPersonInfoById(1l);
    }
}