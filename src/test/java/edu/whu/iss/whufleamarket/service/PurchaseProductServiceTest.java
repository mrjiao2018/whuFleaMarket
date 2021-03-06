package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.PersonInfo;
import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.util.DateUtil.now;

public class PurchaseProductServiceTest extends WhufleamarketApplicationTests {
    @Autowired
    PurchaseProductService purchaseProductService;

    @Test
    public void addPurchase(){
        PurchaseProduct purchaseProduct = new PurchaseProduct();
        purchaseProduct.setOwnerID(2L);
        purchaseProduct.setMode(1);
        purchaseProduct.setTime(now().toString());
        purchaseProduct.setContent("777");
        purchaseProduct.setCategory(1);
        purchaseProduct.setAddress("666");
        purchaseProduct.setStatus(1);
        purchaseProduct.setPrice("100");
        purchaseProductService.addPurchase(purchaseProduct);
    }

    @Test
    public void queryPurchaseByUserId()
    {
        PersonInfo test = new PersonInfo();
        test.setUserId(Integer.toUnsignedLong(2));
        List<PurchaseProduct> purchaseProducts = purchaseProductService.queryPurchaseProductByUserId(test);
        System.out.println(purchaseProducts.get(0).getAddress());
    }
}
