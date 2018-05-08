package com.farm.service;

import com.farm.dao.FieldDao;
import com.farm.entity.Field;
import com.farm.entity.FieldExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService {
    @Autowired
    FieldDao fieldDao;

    //查询所有菜地信息
    public List<Field> getAll() {
        return fieldDao.selectByExample(null);
    }

    //菜地保存
    public void saveField(Field field) {
        fieldDao.insertSelective(field);
    }

    //菜地删除
    public void deleteField(Integer id) {
        fieldDao.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> ids) {
        FieldExample example = new FieldExample();
        FieldExample.Criteria criteria = example.createCriteria();
        //delete from xxx where emp_id in(1,2,3)
        criteria.andIdIn(ids);
        fieldDao.deleteByExample(example);
    }
}
