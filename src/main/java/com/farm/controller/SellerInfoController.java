package com.farm.controller;

import com.farm.entity.Msg;
import com.farm.entity.SellerInfo;
import com.farm.service.impl.SellerInfoServiceImpl;
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
public class SellerInfoController {
    @Autowired
    SellerInfoServiceImpl sellerInfoServiceImpl;

    @RequestMapping("/sellerinfo-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getSellersWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<SellerInfo> sellers = sellerInfoServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(sellers, 5);
        return Msg.success().add("pageInfo", page);
    }

    //商家保存
    @RequestMapping(value = "/sellerinfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveSeller(SellerInfo sellerInfo) {
        sellerInfoServiceImpl.saveSellerInfo(sellerInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //商家更新
    @ResponseBody
    @RequestMapping(value = "/sellerinfo/{id}", method = RequestMethod.PUT)
    public Msg updateSeller(SellerInfo sellerInfo, HttpServletRequest request) {
        sellerInfoServiceImpl.updateSellerInfo(sellerInfo);
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
    @RequestMapping(value = "/sellerinfo/{ids}", method = RequestMethod.DELETE)
    public Msg deleteSeller(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            sellerInfoServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            sellerInfoServiceImpl.deleteSellerInfo(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    @RequestMapping(value = "/sellerinfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getSeller(@PathVariable("id") Integer id) {
        SellerInfo sellerInfo = sellerInfoServiceImpl.getSellerInfo(id);
        return Msg.success().add("sellerinfo", sellerInfo);
    }
}
