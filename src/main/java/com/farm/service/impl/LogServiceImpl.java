package com.farm.service.impl;

import com.farm.dao.LogDao;
import com.farm.entity.Log;
import com.farm.entity.LogExample;
import com.farm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Log的业务逻辑实现类
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogDao logDao;

    //查看所有日志信息
    @Override
    public List<Log> getAll() {
        return logDao.selectByExample(null);
    }


    //日志信息删除
    @Override
    public void deleteLog(Integer id) {
        logDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        LogExample example = new LogExample();
        LogExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        logDao.deleteByExample(example);
    }


}
