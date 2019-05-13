package edu.whu.iss.whufleamarket.ctrl.productAdmin;

import com.alibaba.fastjson.JSONObject;
import edu.whu.iss.whufleamarket.service.PersonInfoService;
import edu.whu.iss.whufleamarket.utils.HttpServletRequestUtil;
import edu.whu.iss.whufleamarket.utils.JsonUtil;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class PersonInfoCtrl
{
    @Autowired
    private PersonInfoService personInfoService;

    /**
     * 用户注册
     * @param request 网络请求封装 request
     * @return modelMap 返回内容封装，所有 ctrl 层的方法都必须返回 modelMap ！
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> addUser(HttpServletRequest request){
        // 在 modelMap 中定义各个字段和对象，
        // @ResponseBody 会自动将 modelMap 转为 json 字符串返回给前端
        Map<String, Object> modelMap = new HashMap<>();
        try
        {
            PersonInfo newUser = new PersonInfo();

            JSONObject userInfo = (JSONObject)JsonUtil.getRequestJsonObject(request)
                    .get("userInfo");

            newUser.setOpenId(HttpServletRequestUtil.getString(request, "openid"));
            newUser.setNickName(userInfo.getString("nickname"));
            newUser.setGender(Integer.parseInt(userInfo.getString("gender")));
            newUser.setCountry(userInfo.getString("country"));
            newUser.setProvince(userInfo.getString("province"));
            newUser.setCity(userInfo.getString("city"));
            newUser.setHeadSrc("");

            CommonsMultipartFile shopImg = null;
            CommonsMultipartResolver commonsMultipartResolver =
                    new CommonsMultipartResolver(request.getSession().getServletContext());
            if(commonsMultipartResolver.isMultipart(request)){
                MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
                shopImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("headSrc");
            }else {
                modelMap.put("success", false);
                modelMap.put("errMsg", "上传图片不能为空");
                return modelMap;
            }


            personInfoService.addUser(newUser,shopImg.getInputStream(),shopImg.getOriginalFilename());

            modelMap.put("success", true);
            modelMap.put("errMsg", "");
        }
        catch (Exception e)
        {
            // 如果发生异常，则说明 service 操作失败，封装 modelMap 并返回结果
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }

        return modelMap;
    }

    @RequestMapping(value = "/information", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> updateUser(HttpServletRequest request){
        // 在 modelMap 中定义各个字段和对象，
        // @ResponseBody 会自动将 modelMap 转为 json 字符串返回给前端
        Map<String, Object> modelMap = new HashMap<>();
        try
        {
            PersonInfo oldUser = (PersonInfo)request.getSession().getAttribute("currentUser");
            oldUser.setName(HttpServletRequestUtil.getString(request, "name"));
            oldUser.setHeadSrc(HttpServletRequestUtil.getString(request,"headSrc"));
            oldUser.setSchool(HttpServletRequestUtil.getString(request, "school"));
            oldUser.setAddress(HttpServletRequestUtil.getString(request, "Address"));
            oldUser.setPhone(HttpServletRequestUtil.getString(request, "phone"));

            request.setAttribute("currentUser", oldUser);

            personInfoService.updateUser(oldUser);

            modelMap.put("success", true);
            modelMap.put("errMsg", "");
        }
        catch (Exception e)
        {
            // 如果发生异常，则说明 service 操作失败，封装 modelMap 并返回结果
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }

        return modelMap;
    }
}
