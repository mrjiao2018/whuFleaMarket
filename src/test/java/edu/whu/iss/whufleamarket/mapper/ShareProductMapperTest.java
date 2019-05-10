package edu.whu.iss.whufleamarket.mapper;

import edu.whu.iss.whufleamarket.WhufleamarketApplicationTests;
import edu.whu.iss.whufleamarket.vo.ShareProduct;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ShareProductMapperTest extends WhufleamarketApplicationTests {
    @Autowired
    ShareProductMapper shareProductMapper;

    @Test
    public void queryByCateAndLoc(){
        List<ShareProduct> shareProducts = shareProductMapper.queryByCateAndLoc(2,1);

    }

    @Test
    public void fuzzyQuery(){
        List<ShareProduct> shareProducts = shareProductMapper.fuzzyQueryByName("dell");
    }
}