package com.haort.controller;

import com.haort.bean.Counts;
import com.haort.service.CountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CountsController {

    @Autowired
    private CountsService countsService;

    @RequestMapping(value = "/getAllCounts", method = RequestMethod.GET)
    public String getAllPages(Model model) {
        List<Counts> allCounts = countsService.getAllCounts();
        model.addAttribute("allCounts", allCounts);
        return "allCounts";
    }

    @RequestMapping(value = "/addQuestion", method = RequestMethod.GET)
    public String addQuestion() {
        return "addQuestion";
    }
}
