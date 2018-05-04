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
@RequestMapping(value = "/field")
public class FieldController {
    @Autowired
    FieldService fieldService;

//    public String getFields(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
//        PageHelper.startPage(pn, 10);
//        List<Field> fields = fieldService.getAll();
//        PageInfo page = new PageInfo(fields,5);
//        model.addAttribute("pageinfo", page);
//        return "field-list";
//    }
}
