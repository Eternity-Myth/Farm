package com.farm.service;

import com.farm.entity.Plant;

import java.util.List;

public interface PlantService {

    //返回所有的种植信息
    List<Plant> getAll();

    //种植信息保存
    void savaPlant(Plant plant);

    //种植信息删除
    void deletePlant(Integer id);

    void deleteBatch(List<Integer> del_ids);

    //根据记录号查询种植信息
    Plant getPlant(Integer id);

    //种植信息更新
    void updatePlant(Plant plant);
}
