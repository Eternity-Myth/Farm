package com.farm.dao;

import com.farm.entity.ConsumerLib;
import com.farm.entity.ConsumerLibExample;
import com.farm.entity.ConsumerLibKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumerLibDao {
    long countByExample(ConsumerLibExample example);

    int deleteByExample(ConsumerLibExample example);

    int deleteByPrimaryKey(ConsumerLibKey key);

    int insert(ConsumerLib record);

    int insertSelective(ConsumerLib record);

    List<ConsumerLib> selectByExample(ConsumerLibExample example);

    ConsumerLib selectByPrimaryKey(ConsumerLibKey key);

    int updateByExampleSelective(@Param("record") ConsumerLib record, @Param("example") ConsumerLibExample example);

    int updateByExample(@Param("record") ConsumerLib record, @Param("example") ConsumerLibExample example);

    int updateByPrimaryKeySelective(ConsumerLib record);

    int updateByPrimaryKey(ConsumerLib record);
}
