package com.farm.controller;

import com.farm.entity.Items;
import com.farm.entity.Msg;
import com.farm.service.impl.ItemsServiceImpl;
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
 * 处理商品CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
@Controller
public class ItemsController {

    @Autowired
    ItemsServiceImpl itemsServiceImpl;

    @RequestMapping("items-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getItemsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Items> items = itemsServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(items, 5);
        return Msg.success().add("pageInfo", page);
    }

    //商品保存
    @RequestMapping(value = "/items", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveItems(Items items) {
        itemsServiceImpl.saveItems(items);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //商品更新
    @RequestMapping(value = "/items/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateItems(Items items, HttpServletRequest request) {
        itemsServiceImpl.updateItems(items);
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
    @RequestMapping(value = "/items/{ids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteItems(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            itemsServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            itemsServiceImpl.deleteItem(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据ID查询商品信息
    @RequestMapping(value = "/items/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getItems(@PathVariable("id") Integer id) {
        Items items = itemsServiceImpl.getItems(id);
        return Msg.success().add("items", items);
    }

    //查出所有商品信息
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    @ResponseBody
    public Msg getItemsInfos() {
        List<Items> items = itemsServiceImpl.getAll();
        return Msg.success().add("items", items);
    }
}
