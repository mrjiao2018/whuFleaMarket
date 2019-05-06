package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonInfoMapperTest extends WhufleamarketApplicationTests {
    @Autowired
    PersonInfoMapper personInfoMapper;

    @Test
    public void insertPersonInfo() {
        PersonInfo user = new PersonInfo();
        user.setName("xiaoming4");
        user.setOpenId("testOpenId");
        personInfoMapper.insertPersonInfo(user);
    }
}