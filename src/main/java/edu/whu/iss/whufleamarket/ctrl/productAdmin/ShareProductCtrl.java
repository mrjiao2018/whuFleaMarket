package edu.whu.iss.whufleamarket.ctrl.productAdmin;

import com.alibaba.fastjson.JSONObject;
import edu.whu.iss.whufleamarket.service.ShareProductService;
import edu.whu.iss.whufleamarket.utils.HttpServletRequestUtil;
import edu.whu.iss.whufleamarket.utils.JsonUtil;
import edu.whu.iss.whufleamarket.vo.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/share")
public class ShareProductCtrl {
    @Autowired
    private ShareProductService shareProductService;


    @RequestMapping(value = "/{categoryId}/{location}/all")
    @ResponseBody
    private Map<String, Object> getSharesByCateAndLoc(@PathVariable("categoryId") Integer categoryId,@PathVariable("location") Integer location){
        Map<String, Object> modelMap = new HashMap<>();
        if (categoryId == null){
            modelMap.put("success", false);
            modelMap.put("errMsg", "categoryId不能为空");
        }else if(location==null){
            modelMap.put("success", false);
            modelMap.put("errMsg", "location不能为空");
        }
        try {
            List<Share> shares = shareProductService.getByCateAndLoc(categoryId,location);
            modelMap.put("success", true);
            modelMap.put("errMsg", "");
            modelMap.put("shares", shares);
        } catch (Exception e){
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }


    @RequestMapping(value = "/search")
    @ResponseBody
    private Map<String, Object> getSharesByInput(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();
        try {
            String input = HttpServletRequestUtil.getString(request, "input");
            List<Share> shares = shareProductService.getByInput(input);
            modelMap.put("success", true);
            modelMap.put("errMsg", "");
            modelMap.put("shares", shares);
        } catch (Exception e){
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }
}
