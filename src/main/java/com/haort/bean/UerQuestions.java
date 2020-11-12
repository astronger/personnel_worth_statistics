package com.haort.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.haort.utils.Excel;
import lombok.Data;

/**
 * 【请填写功能名称】对象 uer_questions
 * 
 * @author ruoyi
 * @date 2020-11-09
 */
@Data
public class UerQuestions
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 职位 */
    @Excel(name = "职位")
    private String position;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //创建时间
    private String createTime;

    /** 恋爱次数 */
    @Excel(name = "恋爱次数")
    private Integer loveImes;

    /** 1.我满脑子创业，并有所行动 */
    @Excel(name = "1.我满脑子创业，并有所行动")
    private Integer question1;

    /** 2.我会理财，让钱能生钱 */
    @Excel(name = "2.我会理财，让钱能生钱")
    private Integer question2;

    /** 3.我比其他朋友或同学收入相对较高 */
    @Excel(name = "3.我比其他朋友或同学收入相对较高")
    private Integer question3;

    /** 4.我有独特的项目并形成了行动力 */
    @Excel(name = "4.我有独特的项目并形成了行动力")
    private Integer question4;

    /** 5.我对未来的事情分析较准 */
    @Excel(name = "5.我对未来的事情分析较准")
    private Integer question5;

    /** 6.我为团队成功可以得罪人 */
    @Excel(name = "6.我为团队成功可以得罪人")
    private Integer question6;

    /** 7.我善于外交 */
    @Excel(name = "7.我善于外交")
    private Integer question7;

    /** 8.我经常做而不是经常说 */
    @Excel(name = "8.我经常做而不是经常说")
    private Integer question8;

    /** 9.我吃饭很在意营养而且并不多吃 */
    @Excel(name = "9.我吃饭很在意营养而且并不多吃")
    private Integer question9;

    /** 10.我每天睡眠平均不少于七小时 */
    @Excel(name = "10.我每天睡眠平均不少于七小时")
    private Integer question10;

    /** 11.我很平淡看待钱 */
    @Excel(name = "11.我很平淡看待钱")
    private Integer question11;

    /** 12.我时常忘记苦恼的事情 */
    @Excel(name = "12.我时常忘记苦恼的事情")
    private Integer question12;

    /** 13.我几乎没有仇人，我不恨别人，并不抱怨社会制度 */
    @Excel(name = "13.我几乎没有仇人，我不恨别人，并不抱怨社会制度")
    private Integer question13;

    /** 14.我每周都运动，不少于两小时 */
    @Excel(name = "14.我每周都运动，不少于两小时")
    private Integer question14;

    /** 15.我可以为了身体健康停下工作 */
    @Excel(name = "15.我可以为了身体健康停下工作")
    private Integer question15;

    /** 16.我明白不良的习惯对身体的危害 */
    @Excel(name = "16.我明白不良的习惯对身体的危害")
    private Integer question16;

    /** 17.我认为生命是艳丽的，我可以着装与众不同 */
    @Excel(name = "17.我认为生命是艳丽的，我可以着装与众不同")
    private Integer question17;

    /** 18.我没有手机简直不能生活 */
    @Excel(name = "18.我没有手机简直不能生活")
    private Integer question18;

    /** 19.我知道很多种时尚品牌 */
    @Excel(name = "19.我知道很多种时尚品牌")
    private Integer question19;

    /** 20.我经常参加娱乐活动 */
    @Excel(name = "20.我经常参加娱乐活动")
    private Integer question20;

    /** 21.我身上至少有两件饰品，包括美丽的包 */
    @Excel(name = "21.我身上至少有两件饰品，包括美丽的包")
    private Integer question21;

    /** 22.我对一件物品动情即买之 */
    @Excel(name = "22.我对一件物品动情即买之")
    private Integer question22;

    /** 23.我经常没钱，并借钱，一年至少一次 */
    @Excel(name = "23.我经常没钱，并借钱，一年至少一次")
    private Integer question23;

    /** 24.我对度假与玩有兴趣 */
    @Excel(name = "24.我对度假与玩有兴趣")
    private Integer question24;

    /** 25.我想有更多的压力，只要事业更好 */
    @Excel(name = "25.我想有更多的压力，只要事业更好")
    private Integer question25;

    /** 26.我强调付出，从不强调收入 */
    @Excel(name = "26.我强调付出，从不强调收入")
    private Integer question26;

    /** 27.我认为只要为公司着想，突破制度也有必要 */
    @Excel(name = "27.我认为只要为公司着想，突破制度也有必要")
    private Integer question27;

    /** 28.我想一生都不停工作 */
    @Excel(name = "28.我想一生都不停工作")
    private Integer question28;

    /** 29.我常常为公司发展写出报告或文字 */
    @Excel(name = "29.我常常为公司发展写出报告或文字")
    private Integer question29;

    /** 30.我经常谈出我对公司发展的看法 */
    @Excel(name = "30.我经常谈出我对公司发展的看法")
    private Integer question30;

    /** 31.我没有吃过回扣等公司严防的事情 */
    @Excel(name = "31.我没有吃过回扣等公司严防的事情")
    private Integer question31;

    /** 32.我经常做家务或公司事务，别人并没有要求的前提下 */
    @Excel(name = "32.我经常做家务或公司事务，别人并没有要求的前提下")
    private Integer question32;

    /** 33.我与别人谈话是为了影响或控制别人 */
    @Excel(name = "33.我与别人谈话是为了影响或控制别人")
    private Integer question33;

    /** 34.我没有给别人进行情感性打分 */
    @Excel(name = "34.我没有给别人进行情感性打分")
    private Integer question34;

    /** 35.我不会拍马屁 */
    @Excel(name = "35.我不会拍马屁")
    private Integer question35;

    /** 36.我能控制混乱的局面 */
    @Excel(name = "36.我能控制混乱的局面")
    private Integer question36;

    /** 37.我喜欢人力资源管理胜过研究与技术 */
    @Excel(name = "37.我喜欢人力资源管理胜过研究与技术")
    private Integer question37;

    /** 38.我想做管官的官，让下级为此而快乐 */
    @Excel(name = "38.我想做管官的官，让下级为此而快乐")
    private Integer question38;

    /** 39.我喜欢哲学，并了解宗教 */
    @Excel(name = "39.我喜欢哲学，并了解宗教")
    private Integer question39;

    /** 40.我认为能处理好下级的分配问题，让他们没有怨言 */
    @Excel(name = "40.我认为能处理好下级的分配问题，让他们没有怨言")
    private Integer question40;

    /** 41.我喜欢物理 */
    @Excel(name = "41.我喜欢物理")
    private Integer question41;

    /** 42.我有特殊的创意，并尝试有效果 */
    @Excel(name = "42.我有特殊的创意，并尝试有效果")
    private Integer question42;

    /** 43.我有专利或专利级的产品或技术 */
    @Excel(name = "43.我有专利或专利级的产品或技术")
    private Integer question43;

    /** 44.我学习力强并精通某一方面 */
    @Excel(name = "44.我学习力强并精通某一方面")
    private Integer question44;

    /** 45.我不在意工作对我的汇报，而在于兴趣 */
    @Excel(name = "45.我不在意工作对我的汇报，而在于兴趣")
    private Integer question45;

    /** 46.我经常思考或工作不知时间 */
    @Excel(name = "46.我经常思考或工作不知时间")
    private Integer question46;

    /** 47.我爱看科普类栏目 */
    @Excel(name = "47.我爱看科普类栏目")
    private Integer question47;

    /** 48.我逻辑力强 */
    @Excel(name = "48.我逻辑力强")
    private Integer question48;

    /** 49.我认为家是第一位 */
    @Excel(name = "49.我认为家是第一位")
    private Integer question49;

    /** 50.我工作不是为了钱，而是情感 */
    @Excel(name = "50.我工作不是为了钱，而是情感")
    private Integer question50;

    /** 51.我不说假话 */
    @Excel(name = "51.我不说假话")
    private Integer question51;

    /** 52.我为了爱人失去了很多 */
    @Excel(name = "52.我为了爱人失去了很多")
    private Integer question52;

    /** 53.我认为承诺比生命更重要 */
    @Excel(name = "53.我认为承诺比生命更重要")
    private Integer question53;

    /** 54.我会因为情感而放弃工作或生活的城市 */
    @Excel(name = "54.我会因为情感而放弃工作或生活的城市")
    private Integer question54;

    /** 55.我时常想起初恋 */
    @Excel(name = "55.我时常想起初恋")
    private Integer question55;

    /** 56.我发现爱情对我的激励作用很大 */
    @Excel(name = "56.我发现爱情对我的激励作用很大")
    private Integer question56;

    /** 57.我经常原谅别人 */
    @Excel(name = "57.我经常原谅别人")
    private Integer question57;

    /** 58.我认为我身后有追随者 */
    @Excel(name = "58.我认为我身后有追随者")
    private Integer question58;

    /** 59.我认为自己有品位，而从不说脏话 */
    @Excel(name = "59.我认为自己有品位，而从不说脏话")
    private Integer question59;

    /** 60.我是一个项目专家，并培训别人为胜任力者 */
    @Excel(name = "60.我是一个项目专家，并培训别人为胜任力者")
    private Integer question60;

    /** 61.我出席各级名流活动 */
    @Excel(name = "61.我出席各级名流活动")
    private Integer question61;

    /** 62.我决不拿不属于自己的东西 */
    @Excel(name = "62.我决不拿不属于自己的东西")
    private Integer question62;

    /** 63.我教身边的人做好事 */
    @Excel(name = "63.我教身边的人做好事")
    private Integer question63;

    /** 64.我赞同现行的规则，并主动提出见解而不是抱怨 */
    @Excel(name = "64.我赞同现行的规则，并主动提出见解而不是抱怨")
    private Integer question64;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setLoveImes(Integer loveImes) 
    {
        this.loveImes = loveImes;
    }

    public Integer getLoveImes() 
    {
        return loveImes;
    }
    public void setQuestion1(Integer question1) 
    {
        this.question1 = question1;
    }

    public Integer getQuestion1() 
    {
        return question1;
    }
    public void setQuestion2(Integer question2) 
    {
        this.question2 = question2;
    }

    public Integer getQuestion2() 
    {
        return question2;
    }
    public void setQuestion3(Integer question3) 
    {
        this.question3 = question3;
    }

    public Integer getQuestion3() 
    {
        return question3;
    }
    public void setQuestion4(Integer question4) 
    {
        this.question4 = question4;
    }

    public Integer getQuestion4() 
    {
        return question4;
    }
    public void setQuestion5(Integer question5) 
    {
        this.question5 = question5;
    }

    public Integer getQuestion5() 
    {
        return question5;
    }
    public void setQuestion6(Integer question6) 
    {
        this.question6 = question6;
    }

    public Integer getQuestion6() 
    {
        return question6;
    }
    public void setQuestion7(Integer question7) 
    {
        this.question7 = question7;
    }

    public Integer getQuestion7() 
    {
        return question7;
    }
    public void setQuestion8(Integer question8) 
    {
        this.question8 = question8;
    }

    public Integer getQuestion8() 
    {
        return question8;
    }
    public void setQuestion9(Integer question9) 
    {
        this.question9 = question9;
    }

    public Integer getQuestion9() 
    {
        return question9;
    }
    public void setQuestion10(Integer question10) 
    {
        this.question10 = question10;
    }

    public Integer getQuestion10() 
    {
        return question10;
    }
    public void setQuestion11(Integer question11) 
    {
        this.question11 = question11;
    }

    public Integer getQuestion11() 
    {
        return question11;
    }
    public void setQuestion12(Integer question12) 
    {
        this.question12 = question12;
    }

    public Integer getQuestion12() 
    {
        return question12;
    }
    public void setQuestion13(Integer question13) 
    {
        this.question13 = question13;
    }

    public Integer getQuestion13() 
    {
        return question13;
    }
    public void setQuestion14(Integer question14) 
    {
        this.question14 = question14;
    }

    public Integer getQuestion14() 
    {
        return question14;
    }
    public void setQuestion15(Integer question15) 
    {
        this.question15 = question15;
    }

    public Integer getQuestion15() 
    {
        return question15;
    }
    public void setQuestion16(Integer question16) 
    {
        this.question16 = question16;
    }

    public Integer getQuestion16() 
    {
        return question16;
    }
    public void setQuestion17(Integer question17) 
    {
        this.question17 = question17;
    }

    public Integer getQuestion17() 
    {
        return question17;
    }
    public void setQuestion18(Integer question18) 
    {
        this.question18 = question18;
    }

    public Integer getQuestion18() 
    {
        return question18;
    }
    public void setQuestion19(Integer question19) 
    {
        this.question19 = question19;
    }

    public Integer getQuestion19() 
    {
        return question19;
    }
    public void setQuestion20(Integer question20) 
    {
        this.question20 = question20;
    }

    public Integer getQuestion20() 
    {
        return question20;
    }
    public void setQuestion21(Integer question21) 
    {
        this.question21 = question21;
    }

    public Integer getQuestion21() 
    {
        return question21;
    }
    public void setQuestion22(Integer question22) 
    {
        this.question22 = question22;
    }

    public Integer getQuestion22() 
    {
        return question22;
    }
    public void setQuestion23(Integer question23) 
    {
        this.question23 = question23;
    }

    public Integer getQuestion23() 
    {
        return question23;
    }
    public void setQuestion24(Integer question24) 
    {
        this.question24 = question24;
    }

    public Integer getQuestion24() 
    {
        return question24;
    }
    public void setQuestion25(Integer question25) 
    {
        this.question25 = question25;
    }

    public Integer getQuestion25() 
    {
        return question25;
    }
    public void setQuestion26(Integer question26) 
    {
        this.question26 = question26;
    }

    public Integer getQuestion26() 
    {
        return question26;
    }
    public void setQuestion27(Integer question27) 
    {
        this.question27 = question27;
    }

    public Integer getQuestion27() 
    {
        return question27;
    }
    public void setQuestion28(Integer question28) 
    {
        this.question28 = question28;
    }

    public Integer getQuestion28() 
    {
        return question28;
    }
    public void setQuestion29(Integer question29) 
    {
        this.question29 = question29;
    }

    public Integer getQuestion29() 
    {
        return question29;
    }
    public void setQuestion30(Integer question30) 
    {
        this.question30 = question30;
    }

    public Integer getQuestion30() 
    {
        return question30;
    }
    public void setQuestion31(Integer question31) 
    {
        this.question31 = question31;
    }

    public Integer getQuestion31() 
    {
        return question31;
    }
    public void setQuestion32(Integer question32) 
    {
        this.question32 = question32;
    }

    public Integer getQuestion32() 
    {
        return question32;
    }
    public void setQuestion33(Integer question33) 
    {
        this.question33 = question33;
    }

    public Integer getQuestion33() 
    {
        return question33;
    }
    public void setQuestion34(Integer question34) 
    {
        this.question34 = question34;
    }

    public Integer getQuestion34() 
    {
        return question34;
    }
    public void setQuestion35(Integer question35) 
    {
        this.question35 = question35;
    }

    public Integer getQuestion35() 
    {
        return question35;
    }
    public void setQuestion36(Integer question36) 
    {
        this.question36 = question36;
    }

    public Integer getQuestion36() 
    {
        return question36;
    }
    public void setQuestion37(Integer question37) 
    {
        this.question37 = question37;
    }

    public Integer getQuestion37() 
    {
        return question37;
    }
    public void setQuestion38(Integer question38) 
    {
        this.question38 = question38;
    }

    public Integer getQuestion38() 
    {
        return question38;
    }
    public void setQuestion39(Integer question39) 
    {
        this.question39 = question39;
    }

    public Integer getQuestion39() 
    {
        return question39;
    }
    public void setQuestion40(Integer question40) 
    {
        this.question40 = question40;
    }

    public Integer getQuestion40() 
    {
        return question40;
    }
    public void setQuestion41(Integer question41) 
    {
        this.question41 = question41;
    }

    public Integer getQuestion41() 
    {
        return question41;
    }
    public void setQuestion42(Integer question42) 
    {
        this.question42 = question42;
    }

    public Integer getQuestion42() 
    {
        return question42;
    }
    public void setQuestion43(Integer question43) 
    {
        this.question43 = question43;
    }

    public Integer getQuestion43() 
    {
        return question43;
    }
    public void setQuestion44(Integer question44) 
    {
        this.question44 = question44;
    }

    public Integer getQuestion44() 
    {
        return question44;
    }
    public void setQuestion45(Integer question45) 
    {
        this.question45 = question45;
    }

    public Integer getQuestion45() 
    {
        return question45;
    }
    public void setQuestion46(Integer question46) 
    {
        this.question46 = question46;
    }

    public Integer getQuestion46() 
    {
        return question46;
    }
    public void setQuestion47(Integer question47) 
    {
        this.question47 = question47;
    }

    public Integer getQuestion47() 
    {
        return question47;
    }
    public void setQuestion48(Integer question48) 
    {
        this.question48 = question48;
    }

    public Integer getQuestion48() 
    {
        return question48;
    }
    public void setQuestion49(Integer question49) 
    {
        this.question49 = question49;
    }

    public Integer getQuestion49() 
    {
        return question49;
    }
    public void setQuestion50(Integer question50) 
    {
        this.question50 = question50;
    }

    public Integer getQuestion50() 
    {
        return question50;
    }
    public void setQuestion51(Integer question51) 
    {
        this.question51 = question51;
    }

    public Integer getQuestion51() 
    {
        return question51;
    }
    public void setQuestion52(Integer question52) 
    {
        this.question52 = question52;
    }

    public Integer getQuestion52() 
    {
        return question52;
    }
    public void setQuestion53(Integer question53) 
    {
        this.question53 = question53;
    }

    public Integer getQuestion53() 
    {
        return question53;
    }
    public void setQuestion54(Integer question54) 
    {
        this.question54 = question54;
    }

    public Integer getQuestion54() 
    {
        return question54;
    }
    public void setQuestion55(Integer question55) 
    {
        this.question55 = question55;
    }

    public Integer getQuestion55() 
    {
        return question55;
    }
    public void setQuestion56(Integer question56) 
    {
        this.question56 = question56;
    }

    public Integer getQuestion56() 
    {
        return question56;
    }
    public void setQuestion57(Integer question57) 
    {
        this.question57 = question57;
    }

    public Integer getQuestion57() 
    {
        return question57;
    }
    public void setQuestion58(Integer question58) 
    {
        this.question58 = question58;
    }

    public Integer getQuestion58() 
    {
        return question58;
    }
    public void setQuestion59(Integer question59) 
    {
        this.question59 = question59;
    }

    public Integer getQuestion59() 
    {
        return question59;
    }
    public void setQuestion60(Integer question60) 
    {
        this.question60 = question60;
    }

    public Integer getQuestion60() 
    {
        return question60;
    }
    public void setQuestion61(Integer question61) 
    {
        this.question61 = question61;
    }

    public Integer getQuestion61() 
    {
        return question61;
    }
    public void setQuestion62(Integer question62) 
    {
        this.question62 = question62;
    }

    public Integer getQuestion62() 
    {
        return question62;
    }
    public void setQuestion63(Integer question63) 
    {
        this.question63 = question63;
    }

    public Integer getQuestion63() 
    {
        return question63;
    }
    public void setQuestion64(Integer question64) 
    {
        this.question64 = question64;
    }

    public Integer getQuestion64() 
    {
        return question64;
    }

    @Override
    public String toString() {
        return "UerQuestions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", loveImes=" + loveImes +
                ", question1=" + question1 +
                ", question2=" + question2 +
                ", question3=" + question3 +
                ", question4=" + question4 +
                ", question5=" + question5 +
                ", question6=" + question6 +
                ", question7=" + question7 +
                ", question8=" + question8 +
                ", question9=" + question9 +
                ", question10=" + question10 +
                ", question11=" + question11 +
                ", question12=" + question12 +
                ", question13=" + question13 +
                ", question14=" + question14 +
                ", question15=" + question15 +
                ", question16=" + question16 +
                ", question17=" + question17 +
                ", question18=" + question18 +
                ", question19=" + question19 +
                ", question20=" + question20 +
                ", question21=" + question21 +
                ", question22=" + question22 +
                ", question23=" + question23 +
                ", question24=" + question24 +
                ", question25=" + question25 +
                ", question26=" + question26 +
                ", question27=" + question27 +
                ", question28=" + question28 +
                ", question29=" + question29 +
                ", question30=" + question30 +
                ", question31=" + question31 +
                ", question32=" + question32 +
                ", question33=" + question33 +
                ", question34=" + question34 +
                ", question35=" + question35 +
                ", question36=" + question36 +
                ", question37=" + question37 +
                ", question38=" + question38 +
                ", question39=" + question39 +
                ", question40=" + question40 +
                ", question41=" + question41 +
                ", question42=" + question42 +
                ", question43=" + question43 +
                ", question44=" + question44 +
                ", question45=" + question45 +
                ", question46=" + question46 +
                ", question47=" + question47 +
                ", question48=" + question48 +
                ", question49=" + question49 +
                ", question50=" + question50 +
                ", question51=" + question51 +
                ", question52=" + question52 +
                ", question53=" + question53 +
                ", question54=" + question54 +
                ", question55=" + question55 +
                ", question56=" + question56 +
                ", question57=" + question57 +
                ", question58=" + question58 +
                ", question59=" + question59 +
                ", question60=" + question60 +
                ", question61=" + question61 +
                ", question62=" + question62 +
                ", question63=" + question63 +
                ", question64=" + question64 +
                '}';
    }
}
