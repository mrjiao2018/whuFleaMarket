//package edu.whu.iss.whufleamarket.service.impl;
//
//import edu.whu.iss.whufleamarket.mapper.Product2Mapper;
//import edu.whu.iss.whufleamarket.service.Product2Service;
//import edu.whu.iss.whufleamarket.vo.Product;
//import edu.whu.iss.whufleamarket.vo.PublishProduct;
//import edu.whu.iss.whufleamarket.vo.PurchaseProduct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class Product2ServiceImpl implements Product2Service
//{
//    @Autowired
//    Product2Mapper product2Mapper;
//
//    /**
//     * 返回指定用户的发布
//     * @param ownerId 用户Id
//     * @return
//     */
//    public List<PublishProduct> getProductsByOwnerId(int ownerId)
//    {
//        List<PublishProduct> publishProducts = new ArrayList<>();
//
//        List<Product> products =  product2Mapper.queryByOwnerId(ownerId);
//        for(Product product : products)
//        {
//            PublishProduct publishProduct = new PublishProduct();
//            publishProduct.setId(product.getProductId());
//            publishProduct.setTime(product.getCreateTime().toString());
//            publishProduct.setTitle(product.getTitle());
//            publishProduct.setDescription(product.getProductDesc());
//            publishProduct.setStatus(product.getStatus());
//            publishProduct.setImages(product.getProductImgs());
//
//            publishProducts.add(publishProduct);
//        }
//        return publishProducts;
//    }
//}
