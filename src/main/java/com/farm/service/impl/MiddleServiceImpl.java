package com.farm.service.impl;

import com.farm.dao.MiddleDao;
import com.farm.entity.Middle;
import com.farm.service.MiddleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiddleServiceImpl implements MiddleService {
    @Autowired
    MiddleDao middleDao;

    //返回所有的种植信息
    @Override
    public List<Middle> getAll() {
        middleDao.synchronize();
        return middleDao.selectByExample(null);
    }
}
