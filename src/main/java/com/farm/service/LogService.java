package com.farm.service;

import com.farm.entity.Log;

import java.util.List;

public interface LogService {
    public List<Log> getAll();

    public void deleteLog(Integer id);

    public void deleteBatch(List<Integer> ids);
}
