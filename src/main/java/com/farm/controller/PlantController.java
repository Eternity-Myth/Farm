package com.farm.controller;


import com.farm.entity.Msg;
import com.farm.entity.Plant;
import com.farm.service.impl.PlantServiceImpl;
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
 * 处理种植表CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */

@Controller
public class PlantController {
    @Autowired
    PlantServiceImpl plantServiceImpl;

    @RequestMapping(value = "/plant-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getPlantWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Plant> plants = plantServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(plants, 5);
        return Msg.success().add("pageInfo", page);
    }

    //种植信息保存
    @RequestMapping(value = "/plant", method = RequestMethod.POST)
    @ResponseBody
    public Msg savaPlant(Plant plant) {
        plantServiceImpl.savaPlant(plant);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //种植信息更新
    @RequestMapping(value = "/plant/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updatePlant(Plant plant, HttpServletRequest request) {
        plantServiceImpl.updatePlant(plant);
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
    @RequestMapping(value = "/plant/{ids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deletePlant(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            plantServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            plantServiceImpl.deletePlant(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据记录号查询种植信息
    @RequestMapping(value = "/plant/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getPlant(@PathVariable("id") Integer id) {
        Plant plant = plantServiceImpl.getPlant(id);
        return Msg.success().add("plant", plant);
    }
}
