package edu.whu.iss.whufleamarket.ctrl.productAdmin;

import edu.whu.iss.whufleamarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/whufleamarket/deal")
public class ProductCtrl {
    @Autowired
    private ProductService productService;

    /**
     * 用户发布新的二手商品
     * @param request 网络请求封装 request
     * @return modelMap 返回内容封装，所有 ctrl 层的方法都必须返回 modelMap ！
     */
    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> publishSecondHandProduct(HttpServletRequest request){
        // 在 modelMap 中定义各个字段和对象，
        // @ResponseBody 会自动将 modelMap 转为 json 字符串返回给前端
        Map<String, Object> modelMap = new HashMap<>();

        try{
            // 在这里进行 service 层的操作，如 productService.addProduct(...)
            // productService.addProduct(...)

            // service 操作成功，封装 modelMap 并返回结果
            modelMap.put("success", true);
            modelMap.put("errMsg", "");
        } catch (Exception e){
            // 如果发生异常，则说明 service 操作失败，封装 modelMap 并返回结果
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }

        return modelMap;
    }
}
