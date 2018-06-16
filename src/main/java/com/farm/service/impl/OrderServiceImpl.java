package com.farm.service.impl;

import com.farm.dao.OrderDao;
import com.farm.entity.Order;
import com.farm.entity.OrderExample;
import com.farm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;

    //返回所有的订单信息
    @Override
    public List<Order> getAll() {
        orderDao.synchronize();
        return orderDao.selectByExample(null);
    }

    //订单信息保存
    @Override
    public void saveOrder(Order order) {
        orderDao.insertSelective(order);
    }

    //订单信息删除
    @Override
    public void deleteOrder(Integer id) {
        orderDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        orderDao.deleteByExample(example);
    }

    //根据ID查询订单信息
    @Override
    public Order getOrder(Integer id) {
        Order order = orderDao.selectByPrimaryKey(id);
        return order;
    }

    //订单信息更新
    @Override
    public void updateOrder(Order order) {
        orderDao.updateByPrimaryKeySelective(order);
    }
}
