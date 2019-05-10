package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.vo.PersonInfo;

public interface PersonInfoService
{
    int addUser(PersonInfo personInfo);
    PersonInfo queryPersonInfoById(String id);
    int updateUser(PersonInfo personInfo);
}
