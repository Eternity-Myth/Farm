package com.farm.controller;


import com.farm.entity.Assignment;
import com.farm.entity.Msg;
import com.farm.service.impl.AssignmentServiceImpl;
import com.farm.util.LogUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理任务CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */

@Controller
public class AssignmentController {
    @Autowired
    AssignmentServiceImpl assignmentServiceImpl;

    @RequestMapping("/assignment-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getAssignmentsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Assignment> assignments = assignmentServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(assignments, 5);
        return Msg.success().add("pageInfo", page);
    }

    //任务保存
    @RequestMapping(value = "/assignment", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveAssignment(Assignment assignment) {
        assignmentServiceImpl.saveAssignment(assignment);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //任务编辑
    @ResponseBody
    @RequestMapping(value = "/assignment/{id}", method = RequestMethod.PUT)
    public Msg updateAssignment(Assignment assignment, HttpServletRequest request) {
        assignmentServiceImpl.updateAssignment(assignment);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    /**
     * 单个批量删除二合一
     * 批量删除：1-2-3
     * 单个删除：1
     */
    @RequestMapping(value = "/assignment/{ids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteAssignment(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            assignmentServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            assignmentServiceImpl.deleteAssignment(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据id查询任务信息
    @RequestMapping(value = "/assignment/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getAssignment(@PathVariable("id") Integer id) {
        Assignment assignment = assignmentServiceImpl.getAssignment(id);
        return Msg.success().add("assignment", assignment);
    }
}
