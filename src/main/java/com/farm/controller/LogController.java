package com.farm.controller;

import com.farm.entity.Log;
import com.farm.entity.Msg;
import com.farm.service.impl.LogServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于显示系统操作日志，并提供删除功能
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
@Controller
public class LogController {
    @Autowired
    LogServiceImpl logServiceImpl;

    @RequestMapping("/logs-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getLogsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Log> logs = logServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(logs, 5);
        return Msg.success().add("pageInfo", page);
    }

    /**
     * 单个批量删除二合一
     * 批量删除：1-2-3
     * 单个删除：1
     */
    @ResponseBody
    @RequestMapping(value = "/logs/{ids}", method = RequestMethod.DELETE)
    public Msg deleteLogs(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            logServiceImpl.deleteBatch(del_ids);
        } else {
            Integer id = Integer.parseInt(ids);
            logServiceImpl.deleteLog(id);
        }
        return Msg.success();
    }
}
