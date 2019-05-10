package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.vo.PersonInfo;

import java.io.InputStream;

public interface PersonInfoService
{
    /**
     * 根据用户id获取发布
     *
     * @param personInfo 当前用户
     * @param shopImginputStream 图片输入流
     * @param fileName 上传图片名
     * @return 数据库操作返回值
     */
    int addUser(PersonInfo personInfo, InputStream shopImginputStream, String fileName);

    /**
     * 根据id获取用户信息
     * @param id 用户id
     * @return 对应的用户
     */
    PersonInfo queryPersonInfoById(String id);

    /**
     * 更新当前用户
     * @param personInfo 会话中储存的用户
     * @return 数据库操作返回值
     */
    int updateUser(PersonInfo personInfo);
}
