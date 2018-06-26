package com.farm.controller;

import com.farm.entity.Crops;
import com.farm.entity.Msg;
import com.farm.service.impl.CropsServiceImpl;
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
 * 处理农作物CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
@Controller
public class CropsController {
    @Autowired
    CropsServiceImpl cropsServiceImpl;

    @RequestMapping("/crops-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getCropsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Crops> crops = cropsServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(crops, 5);
        return Msg.success().add("pageInfo", page);
    }

    //农作物保存
    @RequestMapping(value = "/crops", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveCrops(Crops crops) {
        cropsServiceImpl.saveCrops(crops);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //农作物更新
    @RequestMapping(value = "/crops/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateCrops(Crops crops, HttpServletRequest request) {
        cropsServiceImpl.updateCrops(crops);
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
    @RequestMapping(value = "/crops/{ids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteCrops(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            cropsServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            cropsServiceImpl.deleteCrops(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    @RequestMapping(value = "/crops/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getCrops(@PathVariable("id") Integer id) {
        Crops crops = cropsServiceImpl.getCrops(id);
        return Msg.success().add("crops", crops);
    }

    //查出所有农作物信息
    @RequestMapping(value = "/crops", method = RequestMethod.GET)
    @ResponseBody
    public Msg getCropsInfos() {
        List<Crops> list = cropsServiceImpl.getAll();
        return Msg.success().add("crops", list);
    }
}
