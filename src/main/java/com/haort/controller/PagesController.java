package com.haort.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haort.bean.Confs;
import com.haort.bean.Pages;
import com.haort.bean.User;
import com.haort.service.PagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PagesController {

    @Autowired
    private PagesService pagesService;


    @RequestMapping(value = "/getAllPages", method = RequestMethod.GET)
    public String getAllPages(Model model) {
        List<Pages> allPages = pagesService.getAllPages();
        model.addAttribute("allPages", allPages);
        return "allPages";
    }

}
