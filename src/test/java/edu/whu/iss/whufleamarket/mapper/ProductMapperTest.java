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
        List<Product> products = productMapper.queryAll();
    }

    @Test
    public void queryByCategoryId() {
        List<Product> products1 = productMapper.queryByCategoryId(1l);
        List<Product> products2 = productMapper.queryByCategoryId(200l);
    }

    @Test
    public void searchByTitle() {
        List<Product> products1 = productMapper.queryByTitle("est");
        List<Product> products2 = productMapper.queryByTitle("测试");
    }
}