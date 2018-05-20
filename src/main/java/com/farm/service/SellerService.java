package com.farm.service;

import com.farm.entity.Seller;

import java.util.List;

public interface SellerService {
    //查询所有商家信息
    List<Seller> getAll();

    //商家保存
    public void saveSeller(Seller seller);

    //商家删除
    void deleteSeller(Integer id);

    //商家更新
    void updateSeller(Seller seller);

    //删除选中的商家
    void deleteBatch(List<Integer> ids);
}
