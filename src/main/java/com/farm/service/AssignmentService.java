package com.farm.service;

import com.farm.entity.Assignment;

import java.util.List;

public interface AssignmentService {
    //查询所有任务信息
    public List<Assignment> getAll();

    //任务保存
    public void saveAssignment(Assignment assignment);

    //任务删除
    public void deleteBatch(List<Integer> del_ids);

    public void deleteAssignment(Integer id);

    //任务编辑
    public void updateAssignment(Assignment assignment);

    //根据id查询任务
    public Assignment getAssignment(Integer id);
}
