package com.farm.service;

import com.farm.entity.Msg;
import com.farm.entity.SellerInfo;

import java.util.List;

public interface SellerInfoService {
    //查询所有商家信息
    public List<SellerInfo> getAll();

    //商家保存
    public void saveSellerInfo(SellerInfo sellerInfoInfo);

    //商家删除
    public void deleteSellerInfo(Integer id);

    //商家更新
    public void updateSellerInfo(SellerInfo sellerInfoInfo);

    //删除选中的商家
    public void deleteBatch(List<Integer> ids);

    //根据ID查询商家
    public SellerInfo getSellerInfo(Integer id);
}
