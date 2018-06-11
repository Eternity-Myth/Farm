package com.farm.service.impl;

import com.farm.dao.ConsumerInfoDao;
import com.farm.entity.ConsumerInfo;
import com.farm.entity.ConsumerInfoExample;
import com.farm.service.ConsumerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerInfoServiceImpl implements ConsumerInfoService {
    @Autowired
    ConsumerInfoDao consumerInfoDao;

    //查询所有客户信息
    @Override
    public List<ConsumerInfo> getAll() {
        return consumerInfoDao.selectByExample(null);
    }

    //客户信息保存
    @Override
    public void saveConsumerInfo(ConsumerInfo consumerInfo) {
        consumerInfoDao.insertSelective(consumerInfo);
    }

    //客户信息删除
    @Override
    public void deleteConsumerInfo(Integer id) {
        consumerInfoDao.deleteByPrimaryKey(id);
    }

    //客户信息更新
    @Override
    public void updateConsumerInfo(ConsumerInfo consumerInfo) {
        consumerInfoDao.updateByPrimaryKeySelective(consumerInfo);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        ConsumerInfoExample example = new ConsumerInfoExample();
        ConsumerInfoExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        consumerInfoDao.deleteByExample(example);
    }

    //根据ID查询客户信息
    @Override
    public ConsumerInfo getConsumerInfo(Integer id) {
        ConsumerInfo consumerInfo = consumerInfoDao.selectByPrimaryKey(id);
        return consumerInfo;
    }
}
