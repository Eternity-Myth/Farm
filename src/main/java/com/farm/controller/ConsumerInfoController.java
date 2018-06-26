package com.farm.controller;

import com.farm.entity.ConsumerInfo;
import com.farm.entity.Msg;
import com.farm.service.impl.ConsumerInfoServiceImpl;
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
 * 处理客户信息CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */

@Controller
public class ConsumerInfoController {
    @Autowired
    ConsumerInfoServiceImpl consumerInfoServiceImpl;

    @RequestMapping("/consumerinfo-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getConsumerInfoWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<ConsumerInfo> consumerInfos = consumerInfoServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(consumerInfos, 5);
        return Msg.success().add("pageInfo", page);
    }

    //客户信息保存
    @RequestMapping(value = "/consumerinfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveConsumerInfo(ConsumerInfo consumerInfo) {
        consumerInfoServiceImpl.saveConsumerInfo(consumerInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //客户信息更新
    @ResponseBody
    @RequestMapping(value = "/consumerinfo/{id}", method = RequestMethod.PUT)
    public Msg updateConsumerInfo(ConsumerInfo consumerInfo, HttpServletRequest request) {
        consumerInfoServiceImpl.updateConsumerInfo(consumerInfo);
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
    @RequestMapping(value = "/consumerinfo/{ids}", method = RequestMethod.DELETE)
    public Msg deleteConsumerInfo(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            consumerInfoServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            consumerInfoServiceImpl.deleteConsumerInfo(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据id查询客户信息
    @RequestMapping(value = "/consumerinfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getConsumerInfo(@PathVariable("id") Integer id) {
        ConsumerInfo consumerInfo = consumerInfoServiceImpl.getConsumerInfo(id);
        return Msg.success().add("consumerinfo", consumerInfo);
    }

    //查出所有客户信息
    @RequestMapping("/consumerinfos")
    @ResponseBody
    public Msg getConsumerinfos() {
        List<ConsumerInfo> list = consumerInfoServiceImpl.getAll();
        return Msg.success().add("consumerinfos", list);
    }
}
