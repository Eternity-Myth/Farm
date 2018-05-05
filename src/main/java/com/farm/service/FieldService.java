package com.farm.service;

import com.farm.dao.FieldDao;
import com.farm.entity.Field;
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
}
