package edu.whu.iss.whufleamarket.service.impl;

import edu.whu.iss.whufleamarket.mapper.PersonInfoMapper;
import edu.whu.iss.whufleamarket.mapper.PurchaseProductMapper;
import edu.whu.iss.whufleamarket.service.PurchaseProductService;
import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseProductServiceImpl implements PurchaseProductService {
    @Autowired
    PurchaseProductMapper purchaseProductMapper;

    @Override
    public int addPurchase(PurchaseProduct purchaseProduct){
        return purchaseProductMapper.insertPurchaseProduct(purchaseProduct);
    }

    public List<PurchaseProduct> queryPurchaseProductByCategory(Integer category){
        List<PurchaseProduct> purchaseProducts = purchaseProductMapper.queryPurchaseProductByCategory(category);
        return purchaseProducts;
    }
}
