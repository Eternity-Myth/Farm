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

//    public List<Field> getAll() {
//        return fieldDao.selectById(null);
//    }
}
