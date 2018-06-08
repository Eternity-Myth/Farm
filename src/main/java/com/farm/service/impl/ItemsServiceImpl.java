package com.farm.service.impl;

import com.farm.dao.ItemsDao;
import com.farm.entity.Items;
import com.farm.entity.ItemsExample;
import com.farm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsDao itemsDao;

    //查询所有商品信息
    @Override
    public List<Items> getAll() {
        return itemsDao.selectByExample(null);
    }

    //商品删除
    @Override
    public void deleteItem(Integer id) {
        itemsDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        ItemsExample example = new ItemsExample();
        ItemsExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        itemsDao.deleteByExample(example);
    }

    //商品保存
    @Override
    public void saveItems(Items items) {
        itemsDao.insertSelective(items);
    }

    //商品更新
    @Override
    public void updateItems(Items items) {
        itemsDao.updateByPrimaryKeySelective(items);
    }

    //根据ID查询商品
    @Override
    public Items getItems(Integer id) {
        Items items = itemsDao.selectByPrimaryKey(id);
        return items;
    }
}
