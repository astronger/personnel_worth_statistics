package com.haort.controller;

import com.haort.bean.Confs;
import com.haort.service.ConfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfsController {

    @Autowired
    private ConfsService confsService;

    @RequestMapping(value = "/addConfs", method = RequestMethod.POST)
    @ResponseBody
    public String addUserInfo(String beginTime, String endTime,String people) {
        Confs confs = confsService.getConfs();
        if (confs == null) {
            boolean b = confsService.addConfs(beginTime, endTime,people);
            if (b) {
                return "success";
            }
            return "error";
        } else {
            boolean b = confsService.updateConfs(beginTime, endTime,people, confs.getId());

            if (b) {
                return "success";
            }
            return "error";
        }
    }
}
