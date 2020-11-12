package com.haort.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haort.bean.Confs;
import com.haort.bean.Counts;
import com.haort.bean.Pages;
import com.haort.bean.User;
import com.haort.service.ConfsService;
import com.haort.service.CountsService;
import com.haort.service.PagesService;
import com.haort.service.UserService;

import com.haort.utils.CompanyCheck;
import com.haort.utils.DateUtils;
import com.haort.utils.RespResult;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.VerticalAlignment;
import jxl.write.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ConfsService confsService;

    @Autowired
    private CountsService countsService;

    @Autowired
    private PagesService pagesService;


/*    @GetMapping("/")
    public String index(Model model) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");//设置日期格式
        Date nowTime = df.parse(df.format(new Date()));
        Confs confs = confsService.getConfs();
        List<User> allUserToday = userService.getAllUserToday();
        Pages pagesByDesc = pagesService.getPagesByDesc();
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowTime1 = simpleDateFormat.format(date1);
        if (confs != null) {
            Date beginTime = df.parse(confs.getStartTime());
            Date endTime = df.parse(confs.getEndTime());
            Calendar date = Calendar.getInstance();
            date.setTime(nowTime);
            long time = 1 * 60 * 1000;//1分钟
            Date beforeDate = new Date(beginTime.getTime() - time);
            Calendar begin = Calendar.getInstance();
            //begin.add(Calendar.MINUTE,-1);
            begin.setTime(beforeDate);
            //设置结束时间
            Calendar end = Calendar.getInstance();
            end.setTime(endTime);
            //处于开始时间之后，和结束时间之前的判断
            model.addAttribute("beginTime", confs.getStartTime());
            model.addAttribute("endTime", confs.getEndTime());

            //活动没结束
            if (date.after(begin) && date.before(end)) {
                if (allUserToday != null && allUserToday.size() > 300) {
                    if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                        pagesService.updateFulls(pagesByDesc.getFulls() + 1, pagesByDesc.getId());
                    } else {
                        pagesService.addPages(1, 0, 0, 0, nowTime1);
                    }
                    return "full";
                }
                if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                    pagesService.updateIndexs(pagesByDesc.getIndexs() + 1, pagesByDesc.getId());
                } else {
                    pagesService.addPages(0, 1, 0, 0, nowTime1);
                }
                return "index";
            } else { //活动已经结束
                if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                    pagesService.updateOver(pagesByDesc.getOver() + 1, pagesByDesc.getId());
                } else {
                    pagesService.addPages(0, 0, 1, 0, nowTime1);
                }
                return "over";
            }
        } else {
            if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                pagesService.updateError(pagesByDesc.getError() + 1, pagesByDesc.getId());
            } else {
                pagesService.addPages(0, 0, 0, 1, nowTime1);
            }
            return "error";
        }
    }

    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public String addUserInfo(String company, String name, String phone, String address, String hrt, String fahuo, String prizeOne, String prizeTwo,String answer1 ,String answer2 ,String answer3Arr,String answer4Arr,String image) {
           String prize ="";
        String hrts = "";
        if ("0".equals(hrt)) {
              prize =prizeOne;
            hrts = "是";
        } else {
              prize =prizeTwo;
            hrts = "否";
        }
        //todo 电话 不在重复提交
        User userByPhone = userService.getUserByPhone(phone);
        if (userByPhone == null ){
        boolean b = userService.addUserInfo(company, name, phone, address, hrts, fahuo, prize, DateUtils.getStrDateTime(),  answer1,answer2,answer3Arr,answer4Arr, image);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowTime = simpleDateFormat.format(date);
        Counts countsByDesc = countsService.getCountsByDesc();
        Confs confs = confsService.getConfs();
        //成功
        if (b) {
            if (countsByDesc != null) {
                String createTime = countsByDesc.getCreateTime();
                //如果相等就更新数据
                if (nowTime.equals(createTime)) {
                    countsService.updateSuccessCounts(countsByDesc.getSuccesCounts() + 1, countsByDesc.getId());
                } else {
                    countsService.addSuccessCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
                }
            } else {
                countsService.addSuccessCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
            }
            return "success";
        }
        if (countsByDesc != null) {
            String createTime = countsByDesc.getCreateTime();
            //如果相等就更新数据
            if (nowTime.equals(createTime)) {
                countsService.updateFailCounts(countsByDesc.getSuccesCounts() + 1, countsByDesc.getId());
            } else {
                countsService.addFailCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
            }
        } else {
            countsService.addFailCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
        }
        return "error";
        }else {
            return "errors";
        }
    }*/

    @GetMapping("/")
    public String index(Model model) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");//设置日期格式
        Date nowTime = df.parse(df.format(new Date()));
        Confs confs = confsService.getConfs();
        List<User> allUserToday = userService.getAllUserToday();
        Pages pagesByDesc = pagesService.getPagesByDesc();
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowTime1 = simpleDateFormat.format(date1);
        if (confs != null) {
            Date beginTime = df.parse(confs.getStartTime());
            Date endTime = df.parse(confs.getEndTime());
            Calendar date = Calendar.getInstance();
            date.setTime(nowTime);
            long time = 1 * 60 * 1000;//1分钟
            Date beforeDate = new Date(beginTime.getTime() - time);
            Calendar begin = Calendar.getInstance();
            //begin.add(Calendar.MINUTE,-1);
            begin.setTime(beforeDate);
            //设置结束时间
            Calendar end = Calendar.getInstance();
            end.setTime(endTime);
            //处于开始时间之后，和结束时间之前的判断
            model.addAttribute("beginTime", confs.getStartTime());


            //活动没结束
            if (date.after(begin) && date.before(end)) {
                if (allUserToday != null && allUserToday.size() >= Integer.valueOf(confs.getPeople())) {
                    if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                        pagesService.updateFulls(pagesByDesc.getFulls() + 1, pagesByDesc.getId());
                    } else {
                        pagesService.addPages(1, 0, 0, 0, nowTime1);
                    }
                    model.addAttribute("fullTime", confs.getFullTime());
                    return "full";
                }
                if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                    pagesService.updateIndexs(pagesByDesc.getIndexs() + 1, pagesByDesc.getId());
                } else {
                    pagesService.addPages(0, 1, 0, 0, nowTime1);
                }
                return "index";
            } else { //活动已经结束
                if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                    pagesService.updateOver(pagesByDesc.getOver() + 1, pagesByDesc.getId());
                } else {
                    pagesService.addPages(0, 0, 1, 0, nowTime1);
                }
                model.addAttribute("endTime", confs.getEndTime());
                return "over";
            }
        } else {
            if (pagesByDesc != null && nowTime1.equals(pagesByDesc.getCreateTime())) {
                pagesService.updateError(pagesByDesc.getError() + 1, pagesByDesc.getId());
            } else {
                pagesService.addPages(0, 0, 0, 1, nowTime1);
            }
            return "error";
        }
    }

    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public RespResult addUserInfo(String company, String name, String phone, String address, String hrt, String fahuo) {
        List<User> userByCompany = userService.getUserByCompany(company);
        //判断当前用户输入的公司 报名是否超过6人 超过则提示该公司已经超过6人
        if (userByCompany != null && userByCompany.size() > 5){

            return RespResult.build(401,"该公司报名人数超过6人",userByCompany);
        }
        String hrts = "";
        if ("0".equals(hrt)) {
            hrts = "是";
        } else {
            hrts = "否";
        }
        //todo 电话 不在重复提交
        User userByPhone = userService.getUserByPhone(phone);
        if (userByPhone == null ){
            boolean b = userService.addUserInfo(company, name, phone, address, hrts, fahuo, DateUtils.getStrDateTime());
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String nowTime = simpleDateFormat.format(date);
            Counts countsByDesc = countsService.getCountsByDesc();
            //查询配置表
            Confs confs = confsService.getConfs();
            //成功
            if (b) {
                if (countsByDesc != null) {
                    String createTime = countsByDesc.getCreateTime();
                    //如果相等就更新数据
                    if (nowTime.equals(createTime)) {
                        countsService.updateSuccessCounts(countsByDesc.getSuccesCounts() + 1, countsByDesc.getId());
                    } else {
                        countsService.addSuccessCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
                    }
                } else {
                    countsService.addSuccessCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
                }
                //查询当天报名人数
                List<User> allUserToday = userService.getAllUserToday();
                //判断当天报名人数是否满配置表的人数
                if (allUserToday !=null && allUserToday.size() >= Integer.valueOf(confs.getPeople())){
                    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm");
                    String nowTime1 = simpleDateFormat1.format(date);
                    //如果报名人数满额了 就更新 人满时间字段 的 时间
                    confsService.updateConfsFullTime(nowTime1,confs.getId());
                }else {
                    confsService.updateConfsFullTime("",confs.getId());
                }
                 userByCompany = userService.getUserByCompany(company);
                return RespResult.build(200,"报名成功",userByCompany);
            }
            if (countsByDesc != null) {
                String createTime = countsByDesc.getCreateTime();
                //如果相等就更新数据
                if (nowTime.equals(createTime)) {
                    countsService.updateFailCounts(countsByDesc.getSuccesCounts() + 1, countsByDesc.getId());
                } else {
                    countsService.addFailCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
                }
            } else {
                countsService.addFailCounts(confs.getStartTime(), confs.getEndTime(), 1, nowTime);
            }
            return /*"error"*/RespResult.build(402,"报名成功");
        }else {
            return /*"errors"*/RespResult.build(403,"您已经提交过了，请勿重复提交");
        }
    }



    @RequestMapping(value = "/checkCompany", method = RequestMethod.GET)
    @ResponseBody
    public String  checkCompany(String company) {
    /* String str="{\n" +
                "  \"OrderNumber\": \"ECI2020022417374882888201\",\n" +
                "  \"Paging\": {\n" +
                "    \"PageSize\": 10,\n" +
                "    \"PageIndex\": 1,\n" +
                "    \"TotalRecords\": 7\n" +
                "  },\n" +
                "  \"Result\": [\n" +
                "    {\n" +
                "      \"KeyNo\": \"96eff28a5f58f37a8f8c0959d55e419e\",\n" +
                "      \"Name\": \"深圳市浩锐拓科技有限公司\",\n" +
                "      \"OperName\": \"曾治杰\",\n" +
                "      \"StartDate\": \"2010-10-26 00:00:00\",\n" +
                "      \"Status\": \"存续\",\n" +
                "      \"No\": \"440306105006757\",\n" +
                "      \"CreditCode\": \"914403005642178460\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"KeyNo\": \"026c3bd055916326507564b43ba37525\",\n" +
                "      \"Name\": \"深圳市浩锐拓工业互联网有限公司\",\n" +
                "      \"OperName\": \"曾治杰\",\n" +
                "      \"StartDate\": \"2019-08-09 00:00:00\",\n" +
                "      \"Status\": \"存续\",\n" +
                "      \"No\": \"440300207746850\",\n" +
                "      \"CreditCode\": \"91440300MA5FQPH67K\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"KeyNo\": \"f567e4f47c2bf10f6c7dc9bfb34dc979\",\n" +
                "      \"Name\": \"屏山浩锐拓展培训有限公司\",\n" +
                "      \"OperName\": \"刘冬\",\n" +
                "      \"StartDate\": \"2017-06-09 00:00:00\",\n" +
                "      \"Status\": \"存续\",\n" +
                "      \"No\": \"511529000021766\",\n" +
                "      \"CreditCode\": \"91511529MA657CKB0R\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"KeyNo\": \"05df42b8e512c968004ac05625777053\",\n" +
                "      \"Name\": \"永州锐好商业管理有限公司\",\n" +
                "      \"OperName\": \"江华\",\n" +
                "      \"StartDate\": \"2013-04-10 00:00:00\",\n" +
                "      \"Status\": \"存续\",\n" +
                "      \"No\": \"431100000031314\",\n" +
                "      \"CreditCode\": \"914311000663548131\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"KeyNo\": \"afd3c522608045fcac7298f62b1488f9\",\n" +
                "      \"Name\": \"广西南宁九龙盛业房地产投资策划有限责任公司\",\n" +
                "      \"OperName\": \"黄昌慧\",\n" +
                "      \"StartDate\": \"2003-07-15 00:00:00\",\n" +
                "      \"Status\": \"吊销\",\n" +
                "      \"No\": \"4501002505441\",\n" +
                "      \"CreditCode\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"KeyNo\": \"76a56a289ebb1002c11db471676bd39a\",\n" +
                "      \"Name\": \"经济技术开发区浩锐丰拓服装经销处\",\n" +
                "      \"OperName\": \"余松锋\",\n" +
                "      \"StartDate\": \"2017-10-27 00:00:00\",\n" +
                "      \"Status\": \"存续\",\n" +
                "      \"No\": \"\",\n" +
                "      \"CreditCode\": \"92220101MA14W8ER95\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"KeyNo\": \"f1ab6c936acf737bb039be99180335ad\",\n" +
                "      \"Name\": \"呼和浩特市拓锐电脑有限公司\",\n" +
                "      \"OperName\": \"张智慧\",\n" +
                "      \"StartDate\": \"2012-02-17 00:00:00\",\n" +
                "      \"Status\": \"注销\",\n" +
                "      \"No\": \"150105000061372\",\n" +
                "      \"CreditCode\": \"\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"Status\": \"200\",\n" +
                "  \"Message\": \"查询成功\"\n" +
                "}";
        return str;*/
       return CompanyCheck.identityCheck(company);
    }


    @RequestMapping(value = "/getImage", method = RequestMethod.GET)
    @ResponseBody
    public RespResult getImage(Model model, int id) {
        User imageById = userService.getImageById(id);
        if (imageById != null){
           return RespResult.build(200,"成功"/*,imageById.getImage()*/);
        }
        return RespResult.build(400,"数据为空");
    }

    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public String getAllUser(Model model, @RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                             @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<User> list = userService.getAllUser();
        Confs confs = confsService.getConfs();
        model.addAttribute("confs", confs);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        model.addAttribute("list", pageInfo.getList());
        model.addAttribute("pageInfo", pageInfo);
        return "data";
    }





    @RequestMapping("/printData")
    @ResponseBody
    public void printData(HttpServletResponse response) {
        // 创建工作表
        WritableWorkbook book = null;
        response.reset();
        response.setCharacterEncoding("UTF-8");// 设置字符集
        // 创建工作流
        OutputStream os = null;
        try {
            // 设置弹出对话框
            //response.setCharacterEncoding("iso-8859-1");
            // 设置工作表的标题
            response.setContentType("application/octet-stream;charset=utf-8");
            //        response.setHeader("content-disposition", "attachment;filename=" + new String(fileName.getBytes(), "ISO8859-1") + ".xls");// 设置生成的文件名字
            response.setHeader("Content-Disposition", "attachment;filename=" + new String(("参与名单.xls").getBytes("GBK"), "iso-8859-1"));
            os = response.getOutputStream();
            // 初始化工作表.
            book = Workbook.createWorkbook(os);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            // 以下为excel表格内容
            WritableSheet sheet = book.createSheet("参与名单", 0);
            // 设置字体种类和黑体显示,字体为Arial,字号大小为10,采用黑体显示
            WritableFont bold = new WritableFont(WritableFont.createFont("宋体"), 15, WritableFont.BOLD);
            // 生成一个单元格样式控制对象
            WritableCellFormat titleFormate = new WritableCellFormat(bold);
            WritableCellFormat titleFormate1 = new WritableCellFormat();
            // 单元格中的内容水平方向居中
            titleFormate.setAlignment(jxl.format.Alignment.CENTRE);
            // 单元格的内容垂直方向居中
            titleFormate.setVerticalAlignment(VerticalAlignment.CENTRE);

            titleFormate.setAlignment(Alignment.CENTRE);
            titleFormate.setVerticalAlignment(VerticalAlignment.CENTRE);

            // 单元格中的内容水平方向居中
            titleFormate1.setAlignment(jxl.format.Alignment.CENTRE);
            // 单元格的内容垂直方向居中
            titleFormate1.setVerticalAlignment(VerticalAlignment.CENTRE);

            titleFormate1.setAlignment(Alignment.CENTRE);
            titleFormate1.setVerticalAlignment(VerticalAlignment.CENTRE);
            sheet.setColumnView(0, 30); //设置单元格宽度，0是列号
            sheet.setColumnView(1, 30);
            sheet.setColumnView(2, 30);
            sheet.setColumnView(3, 30);
            sheet.setColumnView(4, 50);
            sheet.setColumnView(5, 30);
            sheet.setColumnView(6, 30);
            sheet.setColumnView(7, 30);
            // 表字段名
            sheet.addCell(new Label(0, 0, "编号", titleFormate));
            sheet.addCell(new Label(1, 0, "公司", titleFormate));
            sheet.addCell(new Label(2, 0, "姓名", titleFormate));
            sheet.addCell(new Label(3, 0, "电话", titleFormate));
            sheet.addCell(new Label(4, 0, "地址", titleFormate));
            sheet.addCell(new Label(5, 0, "是否是xxx客户", titleFormate));
            sheet.addCell(new Label(6, 0, "参与时间", titleFormate));
            sheet.addCell(new Label(7, 0, "发货时间", titleFormate));
            // 将数据追加
            List<User> data = userService.getAllUserByPrint();
            for (int i = 1; i < data.size() + 1; i++) {
                sheet.addCell(new Label(0, i, String.valueOf(data.get(i - 1).getId()), titleFormate1));
                sheet.addCell(new Label(1, i, data.get(i - 1).getCompany(), titleFormate1));
                sheet.addCell(new Label(2, i, data.get(i - 1).getName(), titleFormate1));
                sheet.addCell(new Label(3, i, data.get(i - 1).getPhone(), titleFormate1));
                sheet.addCell(new Label(4, i, data.get(i - 1).getAddress(), titleFormate1));
                sheet.addCell(new Label(5, i, data.get(i - 1).getHrts(), titleFormate1));
                sheet.addCell(new Label(6, i, data.get(i - 1).getCreateTime(), titleFormate1));
                sheet.addCell(new Label(7, i, data.get(i - 1).getFahuoTime(), titleFormate1));
            }
            book.write();
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
