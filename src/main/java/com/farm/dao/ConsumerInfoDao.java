package com.farm.dao;

import com.farm.entity.ConsumerInfo;
import com.farm.entity.ConsumerInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumerInfoDao {
    long countByExample(ConsumerInfoExample example);

    int deleteByExample(ConsumerInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConsumerInfo record);

    int insertSelective(ConsumerInfo record);

    List<ConsumerInfo> selectByExample(ConsumerInfoExample example);

    ConsumerInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConsumerInfo record, @Param("example") ConsumerInfoExample example);

    int updateByExample(@Param("record") ConsumerInfo record, @Param("example") ConsumerInfoExample example);

    int updateByPrimaryKeySelective(ConsumerInfo record);

    int updateByPrimaryKey(ConsumerInfo record);
}
