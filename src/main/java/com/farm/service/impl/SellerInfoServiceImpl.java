package com.farm.service.impl;

import com.farm.dao.SellerInfoDao;
import com.farm.entity.SellerInfo;
import com.farm.entity.SellerInfoExample;
import com.farm.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerInfoServiceImpl implements SellerInfoService {
    @Autowired
    SellerInfoDao sellerInfoDao;

    //查询所有商家信息
    @Override
    public List<SellerInfo> getAll() {
        return sellerInfoDao.selectByExample(null);
    }

    //商家保存
    @Override
    public void saveSellerInfo(SellerInfo sellerInfo) {
        sellerInfoDao.insertSelective(sellerInfo);
    }

    //商家删除
    @Override
    public void deleteSellerInfo(Integer id) {
        sellerInfoDao.deleteByPrimaryKey(id);
    }

    //商家更新
    @Override
    public void updateSellerInfo(SellerInfo sellerInfo) {
        sellerInfoDao.updateByPrimaryKeySelective(sellerInfo);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        SellerInfoExample example = new SellerInfoExample();
        SellerInfoExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        sellerInfoDao.deleteByExample(example);
    }

    //根据ID查询商家
    public SellerInfo getSellerInfo(Integer id) {
        SellerInfo sellerInfo = sellerInfoDao.selectByPrimaryKey(id);
        return sellerInfo;
    }
}
