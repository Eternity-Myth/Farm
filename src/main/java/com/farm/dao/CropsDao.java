package com.farm.dao;

import com.farm.entity.Crops;

/**
 * 测试案例：Crops的数据访问接口
 * @author Guan Wencong
 * @version 1.0
 * @email 530711667@qq.com
 */
public interface CropsDao {
    int insert(Crops crops);

    int updateBaseInfoById(Crops crops);

    Crops selectById(int cropsId);

    Crops selectByCropsName(String cropsName);

}
