package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.vo.PurchaseProduct;

import java.util.List;

public interface PurchaseProductService {
    int addPurchase(PurchaseProduct purchaseProduct);
    List<PurchaseProduct> queryPurchaseProductByCategory(Integer category);
}
