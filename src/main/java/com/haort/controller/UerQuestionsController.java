package com.haort.controller;

import java.util.*;

import com.haort.bean.UerQuestions;
import com.haort.service.IUerQuestionsService;
import com.haort.utils.RespResult;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.impl.io.HttpResponseParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static com.haort.utils.DateUtils.getStrDateTime;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-11-09
 */
@Controller
public class UerQuestionsController
{
//    private String prefix = "system/questions";

    @Autowired
    private IUerQuestionsService uerQuestionsService;
//    @GetMapping()
//    public String questions()
//    {
//        return prefix + "/questions";
//    }

    /**
     * 查询用户列表
     * @return
     */
    @GetMapping("/userList")
    public String getAllUsers(Model model)
    {
        List<UerQuestions> uerQuestions = uerQuestionsService.selectUerQuestionsList();
        model.addAttribute("userList", uerQuestions);
        return "userList";
    }

    /**
     * 查看详情，做判断
     * @param model
     * @return
     */
    @GetMapping("/getDetails")
    public String getDetails(Model model,String id)
    {
        UerQuestions uerQuestions = uerQuestionsService.selectUerQuestionsById(Long.valueOf(id));
        if(uerQuestions!=null){ //说明用户信息存在，开始做判断
            model.addAttribute("uerQuestions", uerQuestions);
            int X1=uerQuestions.getQuestion1()+uerQuestions.getQuestion2()+uerQuestions.getQuestion3()+uerQuestions.getQuestion4()+uerQuestions.getQuestion5()+uerQuestions.getQuestion6()+uerQuestions.getQuestion7()+uerQuestions.getQuestion8();//第1项结果
            int X2=uerQuestions.getQuestion9()+uerQuestions.getQuestion10()+uerQuestions.getQuestion11()+uerQuestions.getQuestion12()+uerQuestions.getQuestion13()+uerQuestions.getQuestion14()+uerQuestions.getQuestion15()+uerQuestions.getQuestion16();//第2项结果
            int X3=uerQuestions.getQuestion17()+uerQuestions.getQuestion18()+uerQuestions.getQuestion19()+uerQuestions.getQuestion20()+uerQuestions.getQuestion21()+uerQuestions.getQuestion22()+uerQuestions.getQuestion23()+uerQuestions.getQuestion24();//第3项结果
            int X4=uerQuestions.getQuestion25()+uerQuestions.getQuestion26()+uerQuestions.getQuestion27()+uerQuestions.getQuestion28()+uerQuestions.getQuestion29()+uerQuestions.getQuestion30()+uerQuestions.getQuestion31()+uerQuestions.getQuestion32();//第4项结果
            int X5=uerQuestions.getQuestion33()+uerQuestions.getQuestion34()+uerQuestions.getQuestion35()+uerQuestions.getQuestion36()+uerQuestions.getQuestion37()+uerQuestions.getQuestion38()+uerQuestions.getQuestion39()+uerQuestions.getQuestion40();//第5项结果
            int X6=uerQuestions.getQuestion41()+uerQuestions.getQuestion42()+uerQuestions.getQuestion43()+uerQuestions.getQuestion44()+uerQuestions.getQuestion45()+uerQuestions.getQuestion46()+uerQuestions.getQuestion47()+uerQuestions.getQuestion48();//第6项结果
            int X7=uerQuestions.getQuestion49()+uerQuestions.getQuestion50()+uerQuestions.getQuestion51()+uerQuestions.getQuestion52()+uerQuestions.getQuestion53()+uerQuestions.getQuestion54()+uerQuestions.getQuestion55()+uerQuestions.getQuestion56();//第7项结果
            int X8=uerQuestions.getQuestion57()+uerQuestions.getQuestion58()+uerQuestions.getQuestion59()+uerQuestions.getQuestion60()+uerQuestions.getQuestion61()+uerQuestions.getQuestion62()+uerQuestions.getQuestion63()+uerQuestions.getQuestion64();//第8项结果
            model.addAttribute("X1", X1);
            model.addAttribute("X2", X2);
            model.addAttribute("X3", X3);
            model.addAttribute("X4", X4);
            model.addAttribute("X5", X5);
            model.addAttribute("X6", X6);
            model.addAttribute("X7", X7);
            model.addAttribute("X8", X8);

            /**
             * 发展走势
             */
            model.addAttribute("X18", X1+X4+X5+X8);
            model.addAttribute("X26", X5+X6+X7+X8);
            model.addAttribute("X19", X2+X3+X6+X7);
            int a=X1+X4+X5+X8;
            int b=X5+X6+X7+X8;
            int c=X2+X3+X6+X7;
            int max = ((max=(a>b)?a:b)>c?max:c);
            if(max==a){
                model.addAttribute("faZhan", "财政指数");
            }
            if(max==b){
                model.addAttribute("faZhan", "品位指数");
            }
            if(max==c){
                model.addAttribute("faZhan", "生活指数");
            }

            /**
             * 思维模式
             */
            model.addAttribute("X36", X1+X2+X3+X4+X5+X6+X7+X8);
            int num= X1+X2+X3+X4+X5+X6+X7+X8;
            if(num>90){
                model.addAttribute("siWei", "正面进攻型");
            }
            if( 60<=num && num<=90){
                model.addAttribute("siWei", "正面思考型");
            }
            if( 50<=num && num<60){
                model.addAttribute("siWei", "监督思考型");
            }
            if(num<50){
                model.addAttribute("siWei", "监督防守型");
            }
            /**
             * 规范化管理类型
             */
            int d= a-c;
            int f=c-a;
            if(d>3){
                model.addAttribute("d", d);
                model.addAttribute("guiFang", "关系性管理");
            }
            if(f>3){
                model.addAttribute("d", f);
                model.addAttribute("guiFang", "原则性管理");
            }
            if(d<3 || f<3){
                if(d<3){
                    model.addAttribute("d", d);
                }
                if(f<3){
                    model.addAttribute("d", f);
                }
                model.addAttribute("guiFang", "协调性管理");
            }

            /**
             * 价值需求
             */
            int[] numbers=new int[]{X1,X2,X3,X4,X5,X6,X7,X8};
            for(int i=0;i<numbers.length-1;i++) {
                for (int j = 0; j < numbers.length - 1 - i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
            for(int i=0;i<numbers.length;i++)
                System.out.println("numbers============================= "+numbers[i]);

            int[] newnumbers=new int[]{X1,X2,X3,X4,X5,X6,X7,X8};
            int  k=0;
            for(int j=0;j<newnumbers.length;j++){
//            for(int j=0;j<newnumbers.length-1;j++){
                if(newnumbers[j]==numbers[numbers.length-1]){
                    k=+j+1;
                    break;
                }
            }
            model.addAttribute("zuiGaoFen", numbers[numbers.length-1]);
            String str="";
            if(k==1){
                str="一";
            }
            if(k==2){
                str="二";
            }
            if(k==3){
                str="三";
            }
            if(k==4){
                str="四";
            }
            if(k==5){
                str="五";
            }
            if(k==6){
                str="六";
            }
            if(k==7){
                str="七";
            }
            if(k==8){
                str="八";
            }
            model.addAttribute("xiangMu", str);

            /**
             * 岗位优势特征
             */
            int i,temp;
            System.out.println("初始序列的数组为:");
            for(i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+",");
            }
            for(i=0;i<numbers.length-1;i++){
                for( int j =0; j< numbers.length- i-1; j++) {
                    if(numbers[j]<numbers[j+1]) {
                        temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                    }
                }
            }
            System.out.println("\n排好序的数组为:");

            ArrayList<Bean> list = new ArrayList<>();
            list.add(new Bean(1,X1));
            list.add(new Bean(2,X2));
            list.add(new Bean(3,X3));
            list.add(new Bean(4,X4));
            list.add(new Bean(5,X5));
            list.add(new Bean(6,X6));
            list.add(new Bean(7,X7));
            list.add(new Bean(8,X8));
            list.sort((o1, o2) -> {
                return o2.value - o1.value == 0 ? o1.type - o2.type : o2.value - o1.value;
            });

            Bean b1 = list.get(0);
            Bean b2 = list.get(1);
            Bean b3 = list.get(2);

            List<Bean> l2 = new ArrayList<>();
            l2.add(b1);
            l2.add(b2);
            l2.add(b3);

            l2.sort((o1, o2) -> o1.type - o2.type);

            int aa =0;

            b1 = l2.get(0);
            b2 = l2.get(1);
            b3 = l2.get(2);
            if(b1.type==2 ||b2.type==2 || b3.type==2 ){
                if(b1.type==2){
                    l2.remove(0);
                    aa=4*100+b2.type*10+b3.type;
                }
                if(b2.type==2){
                    l2.remove(1);
                    aa=b1.type*100+4*10+b3.type;
                }
                if(b3.type==2){
                    l2.remove(2);
                    aa=b1.type*100+b2.type*10+4;
                }

            }else {
                aa=b1.type*100+b2.type*10+b3.type;
            }

            model.addAttribute("aa", aa);
            switch (aa){
                case 148:
                case 184:
                case 418:
                case 481:
                case 814:
                case 841:

                case 147:
                case 174:
                case 417:
                case 471:
                case 714:
                case 741:

                case 158:
                case 185:
                case 518:
                case 581:
                case 815:
                case 851:

                case 134:
                case 143:
                case 314:
                case 341:
                case 413:
                case 431:
                    model.addAttribute("ganWei", "营销倾向型");
                    break;

                case 156:
                case 165:
                case 516:
                case 561:
                case 615:
                case 651:

                case 456:
                case 465:
                case 546:
                case 564:
                case 654:
                case 645:

                case 458:
                case 485:
                case 854:
                case 845:
                case 548:
                case 584:
                    model.addAttribute("ganWei", "生产倾向型");
                    break;

                case 146:
                case 164:
                case 461:
                case 416:
                case 641:
                case 614:

                case 468:
                case 486:
                case 684:
                case 648:
                case 864:
                case 846:

                case 678:
                case 687:
                case 786:
                case 768:
                case 876:
                case 867:

                case 467:
                case 476:
                case 674:
                case 647:
                case 764:
                case 746:
                    model.addAttribute("ganWei", "技术倾向型");
                    break;

                case 145:
                case 154:
                case 451:
                case 415:
                case 514:
                case 541:

                case 157:
                case 175:
                case 571:
                case 517:
                case 715:
                case 751:
                    model.addAttribute("ganWei", "职能倾向型");
                    break;

                case 457:
                case 475:
                case 574:
                case 547:
                case 745:
                case 754:
                    model.addAttribute("aa", aa);
                    model.addAttribute("ganWei", "人力资源倾向型");
                    break;

                case 138:
                case 183:
                case 381:
                case 318:
                case 813:
                case 831:

                case 137:
                case 173:
                case 371:
                case 317:
                case 713:
                case 731:
                    model.addAttribute("ganWei", "客户服务倾向型");
                    break;

                default :
                    model.addAttribute("ganWei", "其它");
            }
//            if(aa!=148 && aa!=147 && aa!=138 && aa!=457 && aa!=145 && aa!=157 && aa!=146 && aa!=468 && aa!=678 && aa!=467 && aa!=156 && aa!=456 && aa!=458){
//                model.addAttribute("ganWei", "其它");
//            }

            /**
             * 目前状态
             */
            Bean b7 = list.get(7);
            int t1=b2.type;
            int t7=b7.type;
            int c1=b2.value;
            int c7=b7.value;
            model.addAttribute("best", c1);
            model.addAttribute("small", c7);
            String str1="";
            String str2="";
            if(t1==1){
                str1="一";
            }
            if(t1==2){
                str1="二";
            }
            if(t1==3){
                str1="三";
            }
            if(t1==4){
                str1="四";
            }
            if(t1==5){
                str1="五";
            }
            if(t1==6){
                str1="六";
            }
            if(t1==7){
                str1="七";
            }
            if(t1==8){
                str1="八";
            }
            if(t7==1){
                str2="一";
            }
            if(t7==2){
                str2="二";
            }
            if(t7==3){
                str2="三";
            }
            if(t7==4){
                str2="四";
            }
            if(t7==5){
                str2="五";
            }
            if(t7==6){
                str2="六";
            }
            if(t7==7){
                str2="七";
            }
            if(t7==8){
                str2="八";
            }
            model.addAttribute("str1", str1);
            model.addAttribute("str2", str2);
            String s = String.valueOf(t1)+"."+String.valueOf(t7);
            switch (s) {
                case "1.2":
                    model.addAttribute("nowStatus", "1.2:透支");
                    break;
                case "1.3":
                    model.addAttribute("nowStatus", "1.3:付出");
                    break;
                case "1.4":
                    model.addAttribute("nowStatus", "1.4:寄生");
                    break;
                case "1.5":
                    model.addAttribute("nowStatus", "1.5:观望");
                    break;
                case "1.6":
                    model.addAttribute("nowStatus", "1.6:无规");
                    break;
                case "1.7":
                    model.addAttribute("nowStatus", "1.7:无爱");
                    break;
                case "1.8":
                    model.addAttribute("nowStatus", "1.8:违法");
                    break;
                case "2.1":
                    model.addAttribute("nowStatus", "2.1:后穷");
                    break;
                case "2.3":
                    model.addAttribute("nowStatus", "2.3:自在");
                    break;
                case "2.4":
                    model.addAttribute("nowStatus", "2.4:体弱");
                    break;
                case "2.5":
                    model.addAttribute("nowStatus", "2.5:放手");
                    break;
                case "2.6":
                    model.addAttribute("nowStatus", "2.6:职能");
                    break;
                case "2.7":
                    model.addAttribute("nowStatus", "2.7:感悟");
                    break;
                case "2.8":
                    model.addAttribute("nowStatus", "2.8:自大");
                    break;
                case "3.4":
                    model.addAttribute("nowStatus", "3.4:浪费");
                    break;
                case "3.5":
                    model.addAttribute("nowStatus", "3.5:品位");
                    break;
                case "3.6":
                    model.addAttribute("nowStatus", "3.6:婚变");
                    break;
                case "3.7":
                    model.addAttribute("nowStatus", "3.7:服务");
                    break;
                case "3.8":
                    model.addAttribute("nowStatus", "3.8:富贵");
                    break;
                case "4.1":
                    model.addAttribute("nowStatus", "4.1:被剥");
                    break;
                case "4.2":
                    model.addAttribute("nowStatus", "4.2:茫目");
                    break;
                case "4.3":
                    model.addAttribute("nowStatus", "4.3:勇者");
                    break;
                case "4.5":
                    model.addAttribute("nowStatus", "4.5:辛苦 ");
                    break;
                case "4.6":
                    model.addAttribute("nowStatus", "4.6:苦力");
                    break;
                case "4.7":
                    model.addAttribute("nowStatus", "4.7:远行");
                    break;
                case "5.1":
                    model.addAttribute("nowStatus", "5.1:权利");
                    break;
                case "5.2":
                    model.addAttribute("nowStatus", "5.2:领袖 ");
                    break;
                case "5.3":
                    model.addAttribute("nowStatus", "5.3:领导");
                    break;
                case "5.4":
                    model.addAttribute("nowStatus", "5.4:精神");
                    break;
                case "5.7":
                    model.addAttribute("nowStatus", "5.7:亲为");
                    break;
                case "5.8":
                    model.addAttribute("nowStatus", "5.8:事业");
                    break;

                case "6.1":
                    model.addAttribute("nowStatus", "6.1:设计");
                    break;
                case "6.2":
                    model.addAttribute("nowStatus", "6.2:谋士");
                    break;
                case "6.3":
                    model.addAttribute("nowStatus", "6.3:发明");
                    break;
                case "6.4":
                    model.addAttribute("nowStatus", "6.4:空想");
                    break;
                case "6.5":
                    model.addAttribute("nowStatus", "6.5:无力");
                    break;
                case "6.7":
                    model.addAttribute("nowStatus", "6.7:执著");
                    break;
                case "6.8":
                    model.addAttribute("nowStatus", "6.8:无果");
                    break;

                case "7.1":
                    model.addAttribute("nowStatus", "7.1:情种");
                    break;
                case "7.2":
                    model.addAttribute("nowStatus", "7.2:无憾");
                    break;
                case "7.3":
                    model.addAttribute("nowStatus", "7.3:号手");
                    break;
                case "7.4":
                    model.addAttribute("nowStatus", "7.4:懒惰");
                    break;

                case "8.1":
                    model.addAttribute("nowStatus", "8.1:精神");
                    break;
                case "8.2":
                    model.addAttribute("nowStatus", "8.2:路上");
                    break;
                case "8.3":
                    model.addAttribute("nowStatus", "8.3:行僧");
                    break;
                case "8.4":
                    model.addAttribute("nowStatus", "8.4:超越");
                    break;
                case "8.5":
                    model.addAttribute("nowStatus", "8.5:保守");
                    break;
                case "8.6":
                    model.addAttribute("nowStatus", "8.6:大家");
                    break;
                case "8.7":
                    model.addAttribute("nowStatus", "8.7:冷漠");
                    break;

                default :
                    model.addAttribute("nowStatus", "其他");
            }

        }else{
            return "error";
        }
        return "userDetails";
    }


    /**
     * 新增保存 提交的题目
     */
    @PostMapping("/add")
    @ResponseBody
    public Integer addSave(UerQuestions uerQuestions, HttpServletRequest request)
    {
        uerQuestions.setCreateTime(getStrDateTime());
        Integer num= uerQuestionsService.insertUerQuestions(uerQuestions);
        if(num==1) {
            request.setAttribute("success", "1");
        }else{
            request.setAttribute("success", "2");
        }
            return num;
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        UerQuestions uerQuestions = uerQuestionsService.selectUerQuestionsById(id);
        mmap.put("uerQuestions", uerQuestions);
        return "edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
//    @PostMapping("/edit")
//    @ResponseBody
//    public RespResult editSave(UerQuestions uerQuestions)
//    {
//        return uerQuestionsService.updateUerQuestions(uerQuestions);
//    }

    /**
     * 删除【请填写功能名称】
     */
//    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
//    @PostMapping( "/remove")
//    @ResponseBody
//    public AjaxResult remove(String ids)
//    {
//        return toAjax(uerQuestionsService.deleteUerQuestionsByIds(ids));
//    }


    private class Bean{
        public int type;
        public int value;

        public Bean(int type, int value) {
            this.type = type;
            this.value = value;
        }
    }
}