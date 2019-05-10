package edu.whu.iss.whufleamarket.vo;

import java.util.Date;
import java.util.List;

/**
 * 用户对共享物品点赞记录
 */
public class Like {
    private Integer likeId;
    private Product shareProduct;
    private PersonInfo user;
    private Date createTime;
    private Integer status;//点赞记录状态：已点赞，已取消赞
    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public PersonInfo getUser() {
        return user;
    }

    public void setUser(PersonInfo user) {
        this.user = user;
    }

    public Product getShareProduct() {
        return shareProduct;
    }

    public void setShareProduct(Product shareProduct) {
        this.shareProduct = shareProduct;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}

