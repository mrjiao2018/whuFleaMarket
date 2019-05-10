package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.util.DateUtil.now;

public class PurchaseProductServiceTest extends WhufleamarketApplicationTests {
    @Autowired
    PurchaseProductService purchaseProductService;

    @Test
    public void addPurchase(){
        PurchaseProduct purchaseProduct = new PurchaseProduct();
        purchaseProduct.setOwner_id(2);
        purchaseProduct.setPurchaseProductMode("1");
        purchaseProduct.setPurchaseProductTime(now().toString());
        purchaseProduct.setPurchaseProductContent("777");
        purchaseProduct.setPurchaseProductCategory("1");
        purchaseProduct.setPurchaseProductAddress("666");
        purchaseProduct.setPurchaseProductStatus("1");
        purchaseProductService.addPurchase(purchaseProduct);
    }
}
