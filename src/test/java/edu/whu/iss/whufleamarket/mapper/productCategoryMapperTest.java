package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class productCategoryMapperTest extends WhufleamarketApplicationTests{
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void testQueryProductCategoryById(){
        ProductCategory productCategory = productCategoryMapper.queryProductCategoryById(1);
    }
}