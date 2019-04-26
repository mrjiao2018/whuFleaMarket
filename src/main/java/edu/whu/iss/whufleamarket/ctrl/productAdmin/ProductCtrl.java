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

    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> publishSecondHandProduct(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();

        return modelMap;
    }
}
