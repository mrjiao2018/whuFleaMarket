package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.util.DateUtil.now;

public class PurchaseProductMapperTest extends WhufleamarketApplicationTests {
    @Autowired
    PurchaseProductMapper purchaseProductMapper;

    @Test
    public void insertPurchaseProduct() {
//        PurchaseProduct purchaseInfo = new PurchaseProduct();
//        purchaseInfo.setOwner_id(1);
//        purchaseInfo.setPurchaseProductAddress("信息学部食堂");
//        purchaseInfo.setPurchaseProductTime(now().toString());
//        purchaseInfo.setPurchaseProductContent("先到先得");
//        purchaseInfo.setPurchaseProductStatus(1);
//        purchaseInfo.setPurchaseProductMode(1);
//        purchaseInfo.setPurchaseProductCategory(1);
//        purchaseProductMapper.insertPurchaseProduct(purchaseInfo);

        List<PurchaseProduct> list = purchaseProductMapper.queryPurchaseProductByCategory(1);

    }
}
