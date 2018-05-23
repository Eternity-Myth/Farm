package com.farm.service;

import com.farm.entity.Field;

import java.util.List;

/**
 * Field的业务逻辑接口
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public interface FieleService {
    //查询所有菜地信息
    public List<Field> getAll();

    //菜地保存
    public void saveField(Field field);

    //菜地删除
    public void deleteField(Integer id);

    //菜地更新
    public void updateField(Field field);

    public void deleteBatch(List<Integer> ids);

    //根据ID查询菜地
    public Field getField(Integer id);
}
