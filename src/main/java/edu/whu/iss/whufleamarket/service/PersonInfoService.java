package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.vo.PersonInfo;

import java.io.InputStream;

public interface PersonInfoService
{
    int addUser(PersonInfo personInfo, InputStream shopImginputStream, String fileName);
    PersonInfo queryPersonInfoById(String id);
    int updateUser(PersonInfo personInfo);
}
