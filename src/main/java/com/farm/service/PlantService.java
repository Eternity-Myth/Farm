package com.farm.service;

import com.farm.entity.Plant;

import java.util.List;

public interface PlantService {

    //返回所有的种植信息
    List<Plant> getAll();
}
