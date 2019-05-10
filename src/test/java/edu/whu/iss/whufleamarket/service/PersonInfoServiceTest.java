package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonInfoServiceTest extends WhufleamarketApplicationTests {
    @Autowired
    PersonInfoService personInfoService;

    @Test
    public void addUser()
    {
        PersonInfo newUser = new PersonInfo();
        newUser.setOpenId("chris3");
        newUser.setNickName("nickname");
        newUser.setHeadSrc("avatarUrl");
        newUser.setGender(0);
        newUser.setCountry("country");
        newUser.setProvince("province");
        newUser.setCity("city");

    }

    @Test
    public void updateUser()
    {
        PersonInfo oldUser = new PersonInfo();
        oldUser.setOpenId("chris3");
        oldUser.setName("name2");
        oldUser.setHeadSrc("headSrc2");
        oldUser.setSchool("school2");
        oldUser.setAddress("Address2");
        oldUser.setPhone("phone2");

        personInfoService.updateUser(oldUser);
    }
}
