package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.vo.PersonInfo;
import edu.whu.iss.whufleamarket.vo.PurchaseProduct;

import java.util.List;

public interface PurchaseProductService {
    int addPurchase(PurchaseProduct purchaseProduct);
    List<PurchaseProduct> queryPurchaseProductByCategory(Integer category);
    List<PurchaseProduct> queryPurchaseProductByUserId(PersonInfo personInfo);
    List<PurchaseProduct> searchPurchaseProductByContent(String content);
}
