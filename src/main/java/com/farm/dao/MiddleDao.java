package com.farm.dao;

import com.farm.entity.Middle;
import com.farm.entity.MiddleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MiddleDao {
    long countByExample(MiddleExample example);

    int deleteByExample(MiddleExample example);

    int insert(Middle record);

    int insertSelective(Middle record);

    List<Middle> selectByExample(MiddleExample example);

    int updateByExampleSelective(@Param("record") Middle record, @Param("example") MiddleExample example);

    int updateByExample(@Param("record") Middle record, @Param("example") MiddleExample example);

    void synchronize();
}
