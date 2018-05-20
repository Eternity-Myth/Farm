package com.farm.service;

import com.farm.entity.Log;

import java.util.List;

/**
 * Log的业务逻辑接口
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public interface LogService {
    public List<Log> getAll();

    public void deleteLog(Integer id);

    public void deleteBatch(List<Integer> ids);
}
