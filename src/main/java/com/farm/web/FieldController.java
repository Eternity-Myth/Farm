package com.farm.web;

import com.farm.entity.Field;
import com.farm.service.FieldService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 处理菜地CRUD请求
 *
 * @author 关文聪
 */
@Controller
public class FieldController {
    @Autowired
    FieldService fieldService;

    @RequestMapping("/field-list")
    //pn:pagenumber，即当前页数
    public String getFields(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Field> fields = fieldService.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(fields, 5);
        model.addAttribute("pageInfo", page);
        return "field-list";
    }
}
