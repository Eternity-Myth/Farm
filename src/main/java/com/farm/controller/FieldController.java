package com.farm.controller;

import com.farm.entity.Crops;
import com.farm.entity.Field;
import com.farm.entity.Msg;
import com.farm.service.impl.CropsServiceImpl;
import com.farm.service.impl.FieldServiceImpl;

import com.farm.util.LogUtil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理菜地CRUD请求
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
@Controller
public class FieldController {
    @Autowired
    FieldServiceImpl fieldServiceImpl;
    @Autowired
    CropsServiceImpl cropsServiceImpl;

    @RequestMapping("/field-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getFieldsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Field> fields = fieldServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(fields, 5);
        return Msg.success().add("pageInfo", page);
    }

    //菜地保存
    @RequestMapping(value = "/field", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveField(Field field) {
        fieldServiceImpl.saveField(field);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //菜地更新
    @ResponseBody
    @RequestMapping(value = "/field/{id}", method = RequestMethod.PUT)
    public Msg updateField(Field field, HttpServletRequest request) {
        fieldServiceImpl.updateField(field);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //    约束条件：
//    n1a1+n2a2+……+ nnan  <= A
//    tn<=T
//
//    目标函数: maxprofit=n1p1+n2p2+……+nnpn

    @ResponseBody
    @RequestMapping(value = "/field/{id}", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
    public String recommendPlan(@PathVariable("id") Integer id, Model model, HttpSession session, HttpServletRequest request) {


        List<Crops> crops = cropsServiceImpl.getAll();
        int number = crops.size();//农作物的数量
        Field f = fieldServiceImpl.getField(id);
        float area = f.getArea();
        int time = f.getTime();
        String plan = null;//传入的方案
        float maxprofit;//目标函数
        String[] names = new String[number];
        int[] n = new int[number];
        float[] p = new float[number + 1];
        float[] a = new float[number + 1];
        for (int i = 0; i < number; i++) {
            a[i] = crops.get(i).getArea();
        }
        for (int j = 0; j < number; j++) {
            p[j] = crops.get(j).getProfit();
        }
        for (int j = 0; j < number; j++) {
            names[j] = crops.get(j).getCropsname();
        }
        //算法开始
        //设置松弛变量，【0，0，……，A】
        boolean flag = false;
        float[] s = new float[number + 1];//因为只有一个约束
        s[number] = area;
        float[] theta = new float[number + 1]; //检验数
        float x = 0;//基变量的系数,一开始是0
        float maxtheta = 0;
        int maxthetaindex = 0;
        float[] c = new float[number + 1];
        float t = 0;
        for (int j = 0; j < number; j++) {
            c[j] = crops.get(j).getProfit();
        }
        c[number] = 1;
        //算法循环
        while (flag == false) {
            for (int i = 0; i < number + 1; i++) {
                theta[i] = p[i] - x * a[i];
            }
            for (int i = 0; i < number + 1; i++) { //检验是否有大于零的检验数，即基可行解不是最优解
                if (theta[i] > 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag == false) {
                for (int i = 0; i < number + 1; i++) {//确定最大的检验数
                    if (theta[i] > maxtheta) {
                        maxtheta = theta[i];
                        maxthetaindex = i;
                    }
                }
                //换基变量
                t = c[maxthetaindex];//更新系数
                for (int i = 0; i < number + 1; i++) {
                    c[i] = c[i] / t;
                }
                area = area / t;
                x = p[maxthetaindex];
            } else {     //每个检验数都大于零
                n[maxthetaindex] = (int) area;
                break;
            }
        }

        //输出
//       for (int i=0;i<number;i++){
//            plan = plan+names[i]+":"+n[i]+"株   ";
//       }
        plan = names[maxthetaindex] + ":   " + n[maxthetaindex] + " 株   ";

        model.addAttribute("plan", plan);
//        session.setAttribute("plan",plan);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return plan;
    }


    /**
     * 单个批量删除二合一
     * 批量删除：1-2-3
     * 单个删除：1
     */
    @ResponseBody
    @RequestMapping(value = "/field/{ids}", method = RequestMethod.DELETE)
    public Msg deleteField(@PathVariable("ids") String ids) {
        //批量删除
        if (ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            fieldServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            Integer id = Integer.parseInt(ids);
            fieldServiceImpl.deleteField(id);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据id查询菜地信息
    @RequestMapping(value = "/field/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getField(@PathVariable("id") Integer id) {
        Field field = fieldServiceImpl.getField(id);
        return Msg.success().add("field", field);
    }

    //查出所有菜地信息
    @RequestMapping("/fields")
    @ResponseBody
    public Msg getFieldInfos() {
        List<Field> list = fieldServiceImpl.getAll();
        return Msg.success().add("fields", list);
    }
}
