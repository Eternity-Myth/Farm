package com.farm.dao;

import com.farm.entity.Assignment;
import com.farm.entity.AssignmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssignmentDao {
    long countByExample(AssignmentExample example);

    int deleteByExample(AssignmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assignment record);

    int insertSelective(Assignment record);

    List<Assignment> selectByExample(AssignmentExample example);

    Assignment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assignment record, @Param("example") AssignmentExample example);

    int updateByExample(@Param("record") Assignment record, @Param("example") AssignmentExample example);

    int updateByPrimaryKeySelective(Assignment record);

    int updateByPrimaryKey(Assignment record);
}
