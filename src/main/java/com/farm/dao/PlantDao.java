package com.farm.dao;

import com.farm.entity.Plant;
import com.farm.entity.PlantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlantDao {
    long countByExample(PlantExample example);

    int deleteByExample(PlantExample example);

    int insert(Plant record);

    int insertSelective(Plant record);

    List<Plant> selectByExample(PlantExample example);

    int updateByExampleSelective(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByExample(@Param("record") Plant record, @Param("example") PlantExample example);

    void synchronize();
}
