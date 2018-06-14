package com.farm.service.impl;

import com.farm.dao.PlantDao;
import com.farm.entity.Plant;
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
}
