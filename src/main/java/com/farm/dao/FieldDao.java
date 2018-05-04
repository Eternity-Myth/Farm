package com.farm.dao;

import com.farm.entity.Field;

/**
 * 测试案例：Field的数据访问接口
 *
 * @author Guan Wencong
 * @version 1.0
 * @email 530711667@qq.com
 */
public interface FieldDao {
    int insert(Field field);

    int updateBaseInfoById(Field field);

    Field selectById(Integer fieldId);
}
