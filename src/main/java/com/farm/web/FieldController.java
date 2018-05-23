package com.farm.web;

import com.farm.entity.Field;
import com.farm.entity.Msg;
import com.farm.service.impl.FieldServiceImpl;

import com.farm.util.LogUtil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理菜地CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
@Controller
public class FieldController {
    @Autowired
    FieldServiceImpl fieldServiceImpl;

    @RequestMapping("/field-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getFieldsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Field> fields = fieldServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(fields, 5);
        return Msg.success().add("pageInfo", page);
    }

    //菜地保存
    @RequestMapping(value = "/field", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveField(Field field) {
        fieldServiceImpl.saveField(field);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //菜地更新
    @ResponseBody
    @RequestMapping(value = "/field/{id}", method = RequestMethod.PUT)
    public Msg updateField(Field field, HttpServletRequest request) {
        fieldServiceImpl.updateField(field);
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
    @ResponseBody
    @RequestMapping(value = "/field/{ids}", method = RequestMethod.DELETE)
    public Msg deleteField(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            fieldServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            fieldServiceImpl.deleteField(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    @RequestMapping(value = "/field/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getField(@PathVariable("id") Integer id) {
        Field field = fieldServiceImpl.getField(id);
        return Msg.success().add("field", field);
    }
}
