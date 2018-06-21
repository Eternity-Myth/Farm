package com.farm.dao;

import java.util.List;

import com.farm.entity.Field;
import com.farm.entity.FieldExample;
import org.apache.ibatis.annotations.Param;

/**
 * Field的数据访问接口
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */

public interface FieldDao {
    long countByExample(FieldExample example);

    int deleteByExample(FieldExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Field record);

    int insertSelective(Field record);

    List<Field> selectByExample(FieldExample example);

    Field selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Field record, @Param("example") FieldExample example);

    int updateByExample(@Param("record") Field record, @Param("example") FieldExample example);

    int updateByPrimaryKeySelective(Field record);

    int updateByPrimaryKey(Field record);

    void synchronize();
}