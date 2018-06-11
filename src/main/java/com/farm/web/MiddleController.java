package com.farm.web;


import com.farm.entity.Middle;
import com.farm.entity.Msg;
import com.farm.service.impl.MiddleServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理中间表CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */

@Controller
public class MiddleController {
    @Autowired
    MiddleServiceImpl middleServiceImpl;

    @RequestMapping(value = "/plant-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getPlantWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Middle> middles = middleServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(middles, 5);
        return Msg.success().add("pageInfo", page);
    }
}
