package edu.whu.iss.whufleamarket.service.impl;

import edu.whu.iss.whufleamarket.mapper.ShareProductMapper;
import edu.whu.iss.whufleamarket.service.ShareProductService;
import edu.whu.iss.whufleamarket.vo.Share;
import edu.whu.iss.whufleamarket.vo.ShareProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShareProductServiceImpl implements ShareProductService{

    @Autowired
    ShareProductMapper shareProductMapper;
    /**
     * 根据类别和位置获取当前共享
     * 将图片信息，种类信息绑定到对象
     * @param category 共享物品种类
     * @param location 共享物品位置
     * @return
     */

    @Override
    public List<Share> getByCateAndLoc(int category,int location){
        List<ShareProduct> shareProducts  = shareProductMapper.queryByCateAndLoc(category,location);
        List<Share> shares = new ArrayList<>();
        for(ShareProduct shareProduct:shareProducts){
            Share share = new Share();
            share.setDetailAddress(shareProduct.getShareProductAddr());
            share.setId(shareProduct.getShareProductId());
            share.setImages(shareProduct.getProductImgs());
            share.setInformation(shareProduct.getShareProductDesc());
            share.setStatus(shareProduct.getStatus());
            share.setName(shareProduct.getShareProductName());
            shares.add(share);
        }
        return shares;
    }

    @Override
    public List<Share> getByInput(String input){
        List<ShareProduct> shareProducts  = shareProductMapper.fuzzyQueryByName(input);
        List<Share> shares = new ArrayList<>();
        for(ShareProduct shareProduct:shareProducts){
            Share share = new Share();
            share.setDetailAddress(shareProduct.getShareProductAddr());
            share.setId(shareProduct.getShareProductId());
            share.setImages(shareProduct.getProductImgs());
            share.setInformation(shareProduct.getShareProductDesc());
            share.setStatus(shareProduct.getStatus());
            share.setName(shareProduct.getShareProductName());
            shares.add(share);
        }
        return shares;
    }
}
