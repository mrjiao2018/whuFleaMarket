package edu.whu.iss.whufleamarket.ctrl.productAdmin;

import com.alibaba.fastjson.JSONObject;
import edu.whu.iss.whufleamarket.service.PersonInfoService;
import edu.whu.iss.whufleamarket.service.PurchaseProductService;
import edu.whu.iss.whufleamarket.utils.HttpServletRequestUtil;
import edu.whu.iss.whufleamarket.utils.JsonUtil;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
import edu.whu.iss.whufleamarket.vo.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/purchase")
public class PurchaseProductCtrl
{
    @Autowired
    private PurchaseProductService purchaseProductService;

    /**
     * 发布求购信息
     * @param request 网络请求封装 request
     * @return modelMap 返回内容封装，所有 ctrl 层的方法都必须返回 modelMap ！
     */
    @RequestMapping(value = "/publish")
    @ResponseBody
    private Map<String, Object> addPurchase(HttpServletRequest request){
        // 在 modelMap 中定义各个字段和对象，
        // @ResponseBody 会自动将 modelMap 转为 json 字符串返回给前端
        Map<String, Object> modelMap = new HashMap<>();
        try
        {
//            PersonInfo user = (PersonInfo) request.getSession().getAttribute("user");
            PurchaseProduct purchaseProduct = new PurchaseProduct();
            purchaseProduct.setOwnerID(1L);
            purchaseProduct.setStatus(HttpServletRequestUtil.getInt(request,"status"));
            purchaseProduct.setAddress(HttpServletRequestUtil.getString(request,"address"));
            purchaseProduct.setCategory(HttpServletRequestUtil.getInt(request,"category"));
            purchaseProduct.setContent(HttpServletRequestUtil.getString(request,"content"));
            purchaseProduct.setTime(HttpServletRequestUtil.getString(request,"time"));
            purchaseProduct.setMode(HttpServletRequestUtil.getInt(request,"mode"));
            purchaseProduct.setPrice(HttpServletRequestUtil.getString(request,"price"));

            purchaseProductService.addPurchase(purchaseProduct);

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

    /**
     * 获取所有求购信息
     */
    @RequestMapping(value = "/{category}/all")
    @ResponseBody
    private Map<String, Object> getPurchaseProduct(@PathVariable("category") Integer category){
        Map<String, Object> modelMap = new HashMap<>();
        if (category == null){
            modelMap.put("success", false);
            modelMap.put("errMsg", "categoryId不能为空");
        }
        try {
            List<PurchaseProduct> purchaseProducts = purchaseProductService.queryPurchaseProductByCategory(category);
            modelMap.put("success", true);
            modelMap.put("errMsg", "");
            modelMap.put("purchaseProduct", purchaseProducts);
        } catch (Exception e){
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }

    /**
     *搜索求购信息
     */
    @RequestMapping(value = "/search")
    @ResponseBody
    private Map<String, Object> getPurchaseByInput(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();
        try {
            String input = HttpServletRequestUtil.getString(request, "input");
            List<PurchaseProduct> purchaseProducts = purchaseProductService.searchPurchaseProductByContent(input);
            modelMap.put("success", true);
            modelMap.put("errMsg", "");
            modelMap.put("purchaseProduct", purchaseProducts);
        } catch (Exception e){
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }

    @RequestMapping(value = "/userpurchase", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> getPurchaseByUserId(HttpServletRequest request){
        // 在 modelMap 中定义各个字段和对象，
        // @ResponseBody 会自动将 modelMap 转为 json 字符串返回给前端
        Map<String, Object> modelMap = new HashMap<>();
        try
        {
            PersonInfo currentUser =(PersonInfo) request.getSession().getAttribute("currentUser");
            if(currentUser == null)
            {
                modelMap.put("success", false);
                modelMap.put("errMsg", "");
                return modelMap;
            }

            List<PurchaseProduct> purchaseProducts =
                    purchaseProductService.queryPurchaseProductByUserId(currentUser);
            modelMap.put("success", true);
            modelMap.put("errMsg", "");
            modelMap.put("purchase", purchaseProducts);
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
