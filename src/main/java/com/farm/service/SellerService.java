package com.farm.service;

import com.farm.entity.Msg;
import com.farm.entity.Seller;

import java.util.List;

public interface SellerService {
    //查询所有商家信息
    public List<Seller> getAll();

    //商家保存
    public void saveSeller(Seller seller);

    //商家删除
    public void deleteSeller(Integer id);

    //商家更新
    public void updateSeller(Seller seller);

    //删除选中的商家
    public void deleteBatch(List<Integer> ids);

    //根据ID查询商家
    public Seller getSeller(Integer id);
}
