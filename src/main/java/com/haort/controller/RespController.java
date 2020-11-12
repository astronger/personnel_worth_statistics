package com.haort.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haort.bean.Confs;
import com.haort.bean.Resp;
import com.haort.service.ConfsService;
import com.haort.service.RespService;
import com.haort.utils.DataUtils;
import com.haort.utils.DateUtils;
import com.haort.utils.QiniuCloudUtil;
import com.haort.utils.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;


@Controller
public class RespController {
    @Autowired
    private RespService respService;

    @Autowired
    private QiniuCloudUtil qiniuCloudUtil;

    @Autowired
    private ConfsService confsService;

    @GetMapping("/resp")
    public String resp(Model model) {
        return "resp";
    }

    @RequestMapping("/addResp")
    @ResponseBody
    public String addResp(String name, String phone, String image) {
        boolean b = respService.addResp(name, image, phone);
        if (b) {
            return "success";
        }
        return "error";
    }

    @RequestMapping("/getAllResp")
    public String getAllResp(Model model, @RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                             @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Resp> list = respService.getAllResp();

        PageInfo<Resp> pageInfo = new PageInfo<>(list);
        model.addAttribute("list", pageInfo.getList());
        model.addAttribute("pageInfo", pageInfo);
        return "respData";
    }

}
