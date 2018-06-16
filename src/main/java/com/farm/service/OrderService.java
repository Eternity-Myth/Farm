package com.farm.service;

import com.farm.entity.Order;

import java.util.List;

public interface OrderService {
    //返回所有的订单信息
    List<Order> getAll();

    //订单信息保存
    void saveOrder(Order order);

    //订单信息删除
    void deleteBatch(List<Integer> del_ids);

    void deleteOrder(Integer id);

    //根据ID查询订单信息
    Order getOrder(Integer id);

    //订单信息更新
    void updateOrder(Order order);
}
