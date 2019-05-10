package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.vo.PersonInfo;

public interface PersonInfoService
{
    int addUser(PersonInfo personInfo);
    int updateUser(PersonInfo personInfo);
}
