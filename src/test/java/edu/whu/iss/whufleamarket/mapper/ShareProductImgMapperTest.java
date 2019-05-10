package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShareProductImgMapperTest extends WhufleamarketApplicationTests {
    @Autowired
    private ShareProductImgMapper shareProductImgMapper;

    @Test
    public void testQueryImgAddrByProductId(){
        List<String> strings = shareProductImgMapper.queryImgAddrByProductId(1L);
    }
}