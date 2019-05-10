package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductImgMapperTest extends WhufleamarketApplicationTests {
    @Autowired
    private ProductImgMapper productImgMapper;

    @Test
    public void testQueryImgAddrByProductId(){
        List<String> strings = productImgMapper.queryImgAddrByProductId(1l);
    }
}