package com.farm.service.impl;

import com.farm.dao.AssignmentDao;
import com.farm.entity.Assignment;
import com.farm.entity.AssignmentExample;
import com.farm.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {
    @Autowired
    AssignmentDao assignmentDao;

    //查询所有任务信息
    @Override
    public List<Assignment> getAll() {
        return assignmentDao.selectByExample(null);
    }

    //任务保存
    @Override
    public void saveAssignment(Assignment assignment) {
        assignmentDao.insertSelective(assignment);
    }

    //任务删除
    @Override
    public void deleteBatch(List<Integer> ids) {
        AssignmentExample example = new AssignmentExample();
        AssignmentExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        assignmentDao.deleteByExample(example);
    }

    @Override
    public void deleteAssignment(Integer id) {
        assignmentDao.deleteByPrimaryKey(id);
    }

    //任务编辑
    @Override
    public void updateAssignment(Assignment assignment) {
        assignmentDao.updateByPrimaryKeySelective(assignment);
    }

    //根据id查询任务
    @Override
    public Assignment getAssignment(Integer id) {
        Assignment assignment = assignmentDao.selectByPrimaryKey(id);
        return assignment;
    }
}
