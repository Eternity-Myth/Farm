package com.farm.controller;

import com.farm.entity.Msg;
import com.farm.entity.Order;
import com.farm.service.impl.OrderServiceImpl;
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

@Controller
public class OrderController {
    @Autowired
    OrderServiceImpl orderServiceImpl;

    @RequestMapping(value = "/order-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getOrdersWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Order> orders = orderServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(orders, 5);
        return Msg.success().add("pageInfo", page);
    }

    //订单信息保存
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveOrder(Order order) {
        orderServiceImpl.saveOrder(order);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //订单信息更新
    @RequestMapping(value = "/order/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateOrder(Order order, HttpServletRequest request) {
        orderServiceImpl.updateOrder(order);
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
    @RequestMapping(value = "/order/{ids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteOrder(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            orderServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            orderServiceImpl.deleteOrder(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据ID查询订单信息
    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getOrder(@PathVariable("id") Integer id) {
        Order order = orderServiceImpl.getOrder(id);
        return Msg.success().add("order", order);
    }
}
