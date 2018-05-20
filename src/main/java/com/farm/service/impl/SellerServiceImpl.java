package com.farm.service.impl;

import com.farm.dao.SellerDao;
import com.farm.entity.Seller;
import com.farm.entity.SellerExample;
import com.farm.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    SellerDao sellerDao;

    //查询所有商家信息
    @Override
    public List<Seller> getAll() {
        return sellerDao.selectByExample(null);
    }

    //商家保存
    @Override
    public void saveSeller(Seller seller) {
        sellerDao.insertSelective(seller);
    }

    //商家删除
    @Override
    public void deleteSeller(Integer id) {
        sellerDao.deleteByPrimaryKey(id);
    }

    //商家更新
    @Override
    public void updateSeller(Seller seller) {
        sellerDao.updateByPrimaryKeySelective(seller);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        SellerExample example = new SellerExample();
        SellerExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        sellerDao.deleteByExample(example);
    }
}
