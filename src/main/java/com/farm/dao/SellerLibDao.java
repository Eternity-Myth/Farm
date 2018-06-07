package com.farm.dao;

import com.farm.entity.SellerLib;
import com.farm.entity.SellerLibExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerLibDao {
    long countByExample(SellerLibExample example);

    int deleteByExample(SellerLibExample example);

    int deleteByPrimaryKey(Integer sellerlibId);

    int insert(SellerLib record);

    int insertSelective(SellerLib record);

    List<SellerLib> selectByExample(SellerLibExample example);

    SellerLib selectByPrimaryKey(Integer sellerlibId);

    int updateByExampleSelective(@Param("record") SellerLib record, @Param("example") SellerLibExample example);

    int updateByExample(@Param("record") SellerLib record, @Param("example") SellerLibExample example);

    int updateByPrimaryKeySelective(SellerLib record);

    int updateByPrimaryKey(SellerLib record);
}
