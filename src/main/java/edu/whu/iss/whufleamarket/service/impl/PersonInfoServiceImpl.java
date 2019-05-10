package edu.whu.iss.whufleamarket.service.impl;

import edu.whu.iss.whufleamarket.mapper.PersonInfoMapper;
import edu.whu.iss.whufleamarket.service.PersonInfoService;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonInfoServiceImpl implements PersonInfoService
{
    @Autowired
    PersonInfoMapper personInfoMapper;

    @Override
    public int addUser(PersonInfo personInfo)
    {
        return personInfoMapper.insertPersonInfo(personInfo);
    }

    public int updateUser(PersonInfo personInfo){
        return personInfoMapper.updatePersonInfo(personInfo);
    }

    public PersonInfo queryPersonInfoById(String id){return personInfoMapper.queryPersonInfoById(id);}
}
