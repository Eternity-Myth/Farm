package com.farm.service;

import com.farm.entity.ConsumerInfo;

import java.util.List;

public interface ConsumerInfoService {

    //查询所有客户信息
    List<ConsumerInfo> getAll();

    //客户信息保存
    void saveConsumerInfo(ConsumerInfo consumerInfo);

    //客户信息删除
    void deleteBatch(List<Integer> del_ids);

    void deleteConsumerInfo(Integer id);

    //客户信息更新
    void updateConsumerInfo(ConsumerInfo consumerInfo);

    //根据ID查询客户信息
    ConsumerInfo getConsumerInfo(Integer id);
}
