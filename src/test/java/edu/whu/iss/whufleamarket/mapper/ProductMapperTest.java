package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductMapperTest extends WhufleamarketApplicationTests {
    @Autowired
    ProductMapper productMapper;

    @Test
    public void queryAllProducts() {
        List<Product> products = productMapper.queryByCategoryId(1l);
        List<Product> products1 = productMapper.queryAll();
    }
}