package edu.whu.iss.whufleamarket.service;

import edu.whu.iss.whufleamarket.vo.Share;
import edu.whu.iss.whufleamarket.vo.ShareProduct;

import java.util.List;

public interface ShareProductService {
    /**
     * 根据类别和位置获取当前共享
     *
     * @param category 共享物品种类
     * @param location 共享物品位置
     * @return
     */

    List<Share> getByCateAndLoc(int category, int location) ;

    /**
     * 根据输入名称查询共享
     *
     * @param input 用户输入
     * @return
     */

    List<Share> getByInput(String input) ;
}
