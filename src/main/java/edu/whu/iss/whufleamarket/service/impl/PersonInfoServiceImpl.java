package edu.whu.iss.whufleamarket.service.impl;

import edu.whu.iss.whufleamarket.mapper.PersonInfoMapper;
import edu.whu.iss.whufleamarket.service.PersonInfoService;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Service
public class PersonInfoServiceImpl implements PersonInfoService
{
    @Autowired
    PersonInfoMapper personInfoMapper;
    HttpServletRequest request;

    /**
     * 插入用户信息，储存图片
     *
     * @param personInfo 当前用户
     * @param shopImginputStream 图片输入流
     * @param fileName 上传图片名
     * @return
     */
    @Override
    public int addUser(PersonInfo personInfo, InputStream shopImginputStream, String fileName) {
        int effectedNum = personInfoMapper.insertPersonInfo(personInfo);
        if (effectedNum <= 0) {
            throw new RuntimeException("注册失败");
        } else {
            if (shopImginputStream != null) {
                //存储图片
                try {
                    String parentPath = request.getServletContext().getRealPath("");
                    String prefix = fileName.substring(fileName.lastIndexOf(".") + 1); //后缀

                    fileName = parentPath + "/resources/head_src/"+ personInfo.getOpenId() + prefix;

                    File file = new File(fileName);
                    BufferedInputStream in= new BufferedInputStream(shopImginputStream);
                    BufferedOutputStream out= new BufferedOutputStream(new FileOutputStream(fileName));

                    int len=-1;
                    byte[] b=new byte[1024];
                    while((len=in.read(b))!=-1){
                        out.write(b,0,len);
                    }
                    in.close();
                    out.close();

                } catch (Exception e) {
                    throw new RuntimeException("add headImg error:" + e.getMessage());
                }
            }
        }
        return effectedNum;
    }

    /**
     * 更新用户信息
     *
     * @param personInfo 会话中储存的用户
     * @return
     */
    public int updateUser(PersonInfo personInfo){
        return personInfoMapper.updatePersonInfo(personInfo);
    }

    /**
     *
     * @param id 用户id
     * @return 用户
     */
    public PersonInfo queryPersonInfoById(String id) {return personInfoMapper.queryPersonInfoById(id);}
}
