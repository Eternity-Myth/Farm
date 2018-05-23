package com.farm.service;

import com.farm.entity.Crops;

import java.util.List;

/**
 * Crops的业务逻辑接口
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */

public interface CropsService {
    //查询所有农作物信息
    public List<Crops> getAll();

    //农作物保存
    public void saveCrops(Crops crops);

    //农作物删除
    public void deleteCrops(Integer id);

    //农作物更新
    public void updateCrops(Crops crops);

    public void deleteBatch(List<Integer> ids);

    //根据ID查询农作物
    public Crops getCrops(Integer id);
}
