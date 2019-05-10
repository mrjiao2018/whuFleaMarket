package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.Share;
import edu.whu.iss.whufleamarket.vo.ShareProduct;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShareProductServiceTest extends WhufleamarketApplicationTests {
    @Autowired
    ShareProductService shareProductService;


    @Test
    public void getByCateAndLoc() {
        List<Share> shareProducts = shareProductService.getByCateAndLoc(2,1);
    }

    @Test
    public void getByInput(){
        List<Share> shares = shareProductService.getByInput("dell");
    }
}