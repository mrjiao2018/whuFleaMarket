package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceTest extends WhufleamarketApplicationTests {
    @Autowired
    ProductService productService;

    @Test
    public void addProduct() {
    }

    @Test
    public void getAllProducts() {
        List<Product> allProducts = productService.getByCategoryId(1l);
        List<Product> allProducts1 = productService.getByCategoryId(2l);
        productService.getAllProducts();
    }
}