//package edu.whu.iss.whufleamarket.ctrl.productAdmin;
//
//import edu.whu.iss.whufleamarket.service.Product2Service;
//import edu.whu.iss.whufleamarket.service.ProductService;
//import edu.whu.iss.whufleamarket.vo.PersonInfo;
//import edu.whu.iss.whufleamarket.vo.Product;
//import edu.whu.iss.whufleamarket.vo.PublishProduct;
//import edu.whu.iss.whufleamarket.vo.Share;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//@RequestMapping("/product")
//public class Product2Ctrl{
//    @Autowired
//    private Product2Service product2Service;
//
//        /**
//         * 用户发布的商品
//         *
//         * @return modelMap 返回内容封装，所有 ctrl 层的方法都必须返回 modelMap ！
//         */
//        @RequestMapping(value = "/deal")
//        @ResponseBody
//        private Map<String, Object> getPublishProductByUserId(@PathVariable("userId") Integer userId) {
//            Map<String, Object> modelMap = new HashMap<>();
//            if (userId == null){
//                modelMap.put("success", false);
//                modelMap.put("errMsg", "userId为空");
//                return modelMap;
//            }
//
//            try {
//                List<PublishProduct> publishProducts = product2Service.getProductsByOwnerId(userId);
//                modelMap.put("success", true);
//                modelMap.put("errMsg", "");
//                modelMap.put("deal", publishProducts);
//            } catch (Exception e){
//                modelMap.put("success", false);
//                modelMap.put("errMsg", e.getMessage());
//            }
//            return modelMap;
//        }
//
//}
//
