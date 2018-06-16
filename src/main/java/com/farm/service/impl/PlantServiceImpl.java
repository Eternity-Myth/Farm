package com.farm.service.impl;

import com.farm.dao.PlantDao;
import com.farm.entity.Plant;
import com.farm.entity.PlantExample;
import com.farm.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {
    @Autowired
    PlantDao plantDao;

    //返回所有的种植信息
    @Override
    public List<Plant> getAll() {
        plantDao.synchronize();
        return plantDao.selectByExample(null);
    }

    //种植信息保存
    @Override
    public void savaPlant(Plant plant) {
        plantDao.insertSelective(plant);
    }


    //种植信息删除
    @Override
    public void deletePlant(Integer id) {
        plantDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        PlantExample example = new PlantExample();
        PlantExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        plantDao.deleteByExample(example);
    }

    //根据记录号查询种植信息
    @Override
    public Plant getPlant(Integer id) {
        Plant plant = plantDao.selectByPrimaryKey(id);
        return plant;
    }

    //种植信息更新
    @Override
    public void updatePlant(Plant plant) {
        plantDao.updateByPrimaryKeySelective(plant);
    }
}
