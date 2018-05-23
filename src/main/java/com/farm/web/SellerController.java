package com.farm.web;

import com.farm.entity.Msg;
import com.farm.entity.Seller;
import com.farm.service.impl.SellerServiceImpl;
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
public class SellerController {
    @Autowired
    SellerServiceImpl sellerServiceImpl;

    @RequestMapping("/seller-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getSellersWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Seller> sellers = sellerServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(sellers, 5);
        return Msg.success().add("pageInfo", page);
    }

    //商家保存
    @RequestMapping(value = "/seller", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveSeller(Seller seller) {
        sellerServiceImpl.saveSeller(seller);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //商家更新
    @ResponseBody
    @RequestMapping(value = "/seller/{id}", method = RequestMethod.PUT)
    public Msg updateSeller(Seller seller, HttpServletRequest request) {
        sellerServiceImpl.updateSeller(seller);
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
    @RequestMapping(value = "/seller/{ids}", method = RequestMethod.DELETE)
    public Msg deleteSeller(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            sellerServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            sellerServiceImpl.deleteSeller(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    @RequestMapping(value = "/seller/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getSeller(@PathVariable("id") Integer id) {
        Seller seller = sellerServiceImpl.getSeller(id);
        return Msg.success().add("seller", seller);
    }
}
