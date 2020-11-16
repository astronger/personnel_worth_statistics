/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : haoruituo

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2020-11-12 11:00:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for confs
-- ----------------------------
DROP TABLE IF EXISTS `confs`;
CREATE TABLE `confs` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `startTime` varchar(64) DEFAULT NULL COMMENT '设置开始时间',
  `endTime` varchar(64) DEFAULT NULL COMMENT '结束时间',
  `people` varchar(64) DEFAULT NULL COMMENT '人数',
  `fullTime` varchar(64) DEFAULT NULL COMMENT '报名人数满额时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of confs
-- ----------------------------
INSERT INTO `confs` VALUES ('1', '01:32', '23:51', '5', '');

-- ----------------------------
-- Table structure for counts
-- ----------------------------
DROP TABLE IF EXISTS `counts`;
CREATE TABLE `counts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `succesCounts` varchar(64) DEFAULT NULL COMMENT '成功次数',
  `failCounts` varchar(64) DEFAULT NULL COMMENT '失败次数',
  `startTime` varchar(64) DEFAULT NULL COMMENT '开始时间',
  `endTime` varchar(64) DEFAULT NULL COMMENT '结束时间',
  `createTime` varchar(64) DEFAULT NULL COMMENT '当前时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of counts
-- ----------------------------
INSERT INTO `counts` VALUES ('1', '29', null, '20:00', '20:07', '2020-02-13');
INSERT INTO `counts` VALUES ('2', '13', null, '01:32', '23:51', '2020-02-14');
INSERT INTO `counts` VALUES ('3', '1', null, '01:32', '23:51', '2020-02-18');
INSERT INTO `counts` VALUES ('4', '23', null, '01:32', '23:51', '2020-02-24');
INSERT INTO `counts` VALUES ('5', '12', null, '01:32', '23:51', '2020-02-25');
INSERT INTO `counts` VALUES ('6', '1', null, '01:32', '23:51', '2020-02-28');
INSERT INTO `counts` VALUES ('7', '1', null, '01:32', '23:51', '2020-11-09');

-- ----------------------------
-- Table structure for pages
-- ----------------------------
DROP TABLE IF EXISTS `pages`;
CREATE TABLE `pages` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '访问页面次数主键',
  `fulls` varchar(255) DEFAULT NULL COMMENT '人数已满次数',
  `indexs` varchar(255) DEFAULT NULL COMMENT '首页',
  `over` varchar(255) DEFAULT NULL COMMENT '活动结束页面',
  `error` varchar(255) DEFAULT NULL COMMENT '失败页面次数',
  `createTime` varchar(64) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pages
-- ----------------------------
INSERT INTO `pages` VALUES ('2', '0', '108', '348', '0', '2020-02-13');
INSERT INTO `pages` VALUES ('3', '0', '26', '1', '0', '2020-02-14');
INSERT INTO `pages` VALUES ('4', '0', '1', '0', '0', '2020-02-15');
INSERT INTO `pages` VALUES ('5', '0', '3', '0', '0', '2020-02-18');
INSERT INTO `pages` VALUES ('6', '9', '256', '0', '0', '2020-02-24');
INSERT INTO `pages` VALUES ('7', '2', '92', '0', '0', '2020-02-25');
INSERT INTO `pages` VALUES ('8', '0', '3', '0', '0', '2020-02-28');
INSERT INTO `pages` VALUES ('9', '0', '1', '0', '0', '2020-09-18');
INSERT INTO `pages` VALUES ('10', '0', '2', '0', '0', '2020-11-06');
INSERT INTO `pages` VALUES ('11', '0', '42', '0', '0', '2020-11-09');
INSERT INTO `pages` VALUES ('12', '0', '37', '0', '0', '2020-11-10');
INSERT INTO `pages` VALUES ('13', '0', '1', '0', '0', '2020-11-11');
INSERT INTO `pages` VALUES ('14', '0', '4', '0', '0', '2020-11-12');

-- ----------------------------
-- Table structure for resp
-- ----------------------------
DROP TABLE IF EXISTS `resp`;
CREATE TABLE `resp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL COMMENT '名字',
  `image` longtext COMMENT '截图',
  `phone` varchar(64) DEFAULT NULL COMMENT '电话',
  `time` varchar(255) DEFAULT NULL COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resp
-- ----------------------------

-- ----------------------------
-- Table structure for uer_question
-- ----------------------------
DROP TABLE IF EXISTS `uer_question`;
CREATE TABLE `uer_question` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(77) NOT NULL COMMENT '姓名',
  `age` int(3) NOT NULL COMMENT '年龄',
  `phone` varchar(255) NOT NULL COMMENT '电话号码',
  `position` varchar(99) NOT NULL COMMENT '职位',
  `address` varchar(3000) NOT NULL COMMENT '地址',
  `gender` varchar(6) NOT NULL COMMENT '性别',
  `love_imes` int(3) NOT NULL COMMENT '恋爱次数',
  `question_1` int(3) DEFAULT NULL COMMENT '1.我满脑子创业，并有所行动',
  `question_2` int(3) DEFAULT NULL COMMENT '2.我会理财，让钱能生钱',
  `question_3` int(3) DEFAULT NULL COMMENT '3.我比其他朋友或同学收入相对较高',
  `question_4` int(3) DEFAULT NULL COMMENT '4.我有独特的项目并形成了行动力',
  `question_5` int(3) DEFAULT NULL COMMENT '5.我对未来的事情分析较准',
  `question_6` int(3) DEFAULT NULL COMMENT '6.我为团队成功可以得罪人',
  `question_7` int(3) DEFAULT NULL COMMENT '7.我善于外交',
  `question_8` int(3) DEFAULT NULL COMMENT '8.我经常做而不是经常说',
  `question_9` int(3) DEFAULT NULL COMMENT '9.我吃饭很在意营养而且并不多吃',
  `question_10` int(3) DEFAULT NULL COMMENT '10.我每天睡眠平均不少于七小时',
  `question_11` int(3) DEFAULT NULL COMMENT '11.我很平淡看待钱',
  `question_12` int(3) DEFAULT NULL COMMENT '12.我时常忘记苦恼的事情',
  `question_13` int(3) DEFAULT NULL COMMENT '13.我几乎没有仇人，我不恨别人，并不抱怨社会制度',
  `question_14` int(3) DEFAULT NULL COMMENT '14.我每周都运动，不少于两小时',
  `question_15` int(3) DEFAULT NULL COMMENT '15.我可以为了身体健康停下工作',
  `question_16` int(3) DEFAULT NULL COMMENT '16.我明白不良的习惯对身体的危害',
  `question_17` int(3) DEFAULT NULL COMMENT '17.我认为生命是艳丽的，我可以着装与众不同',
  `question_18` int(3) DEFAULT NULL COMMENT '18.我没有手机简直不能生活',
  `question_19` int(3) DEFAULT NULL COMMENT '19.我知道很多种时尚品牌',
  `question_20` int(3) DEFAULT NULL COMMENT '20.我经常参加娱乐活动',
  `question_21` int(3) DEFAULT NULL COMMENT '21.我身上至少有两件饰品，包括美丽的包',
  `question_22` int(3) DEFAULT NULL COMMENT '22.我对一件物品动情即买之',
  `question_23` int(3) DEFAULT NULL COMMENT '23.我经常没钱，并借钱，一年至少一次',
  `question_24` int(3) DEFAULT NULL COMMENT '24.我对度假与玩有兴趣',
  `question_25` int(3) DEFAULT NULL COMMENT '25.我想有更多的压力，只要事业更好',
  `question_26` int(3) DEFAULT NULL COMMENT '26.我强调付出，从不强调收入',
  `question_27` int(3) DEFAULT NULL COMMENT '27.我认为只要为公司着想，突破制度也有必要',
  `question_28` int(3) DEFAULT NULL COMMENT '28.我想一生都不停工作',
  `question_29` int(3) DEFAULT NULL COMMENT '29.我常常为公司发展写出报告或文字',
  `question_30` int(3) DEFAULT NULL COMMENT '30.我经常谈出我对公司发展的看法',
  `question_31` int(3) DEFAULT NULL COMMENT '31.我没有吃过回扣等公司严防的事情',
  `question_32` int(3) DEFAULT NULL COMMENT '32.我经常做家务或公司事务，别人并没有要求的前提下',
  `question_33` int(3) DEFAULT NULL COMMENT '33.我与别人谈话是为了影响或控制别人',
  `question_34` int(3) DEFAULT NULL COMMENT '34.我没有给别人进行情感性打分',
  `question_35` int(3) DEFAULT NULL COMMENT '35.我不会拍马屁',
  `question_36` int(3) DEFAULT NULL COMMENT '36.我能控制混乱的局面',
  `question_37` int(3) DEFAULT NULL COMMENT '37.我喜欢人力资源管理胜过研究与技术',
  `question_38` int(3) DEFAULT NULL COMMENT '38.我想做管官的官，让下级为此而快乐',
  `question_39` int(3) DEFAULT NULL COMMENT '39.我喜欢哲学，并了解宗教',
  `question_40` int(3) DEFAULT NULL COMMENT '40.我认为能处理好下级的分配问题，让他们没有怨言',
  `question_41` int(3) DEFAULT NULL COMMENT '41.我喜欢物理',
  `question_42` int(3) DEFAULT NULL COMMENT '42.我有特殊的创意，并尝试有效果',
  `question_43` int(3) DEFAULT NULL COMMENT '43.我有专利或专利级的产品或技术',
  `question_44` int(3) DEFAULT NULL COMMENT '44.我学习力强并精通某一方面',
  `question_45` int(3) DEFAULT NULL COMMENT '45.我不在意工作对我的汇报，而在于兴趣',
  `question_46` int(3) DEFAULT NULL COMMENT '46.我经常思考或工作不知时间',
  `question_47` int(3) DEFAULT NULL COMMENT '47.我爱看科普类栏目',
  `question_48` int(3) DEFAULT NULL COMMENT '48.我逻辑力强',
  `question_49` int(3) DEFAULT NULL COMMENT '49.我认为家是第一位',
  `question_50` int(3) DEFAULT NULL COMMENT '50.我工作不是为了钱，而是情感',
  `question_51` int(3) DEFAULT NULL COMMENT '51.我不说假话',
  `question_52` int(3) DEFAULT NULL COMMENT '52.我为了爱人失去了很多',
  `question_53` int(3) DEFAULT NULL COMMENT '53.我认为承诺比生命更重要',
  `question_54` int(3) DEFAULT NULL COMMENT '54.我会因为情感而放弃工作或生活的城市',
  `question_55` int(3) DEFAULT NULL COMMENT '55.我时常想起初恋',
  `question_56` int(3) DEFAULT NULL COMMENT '56.我发现爱情对我的激励作用很大',
  `question_57` int(3) DEFAULT NULL COMMENT '57.我经常原谅别人',
  `question_58` int(3) DEFAULT NULL COMMENT '58.我认为我身后有追随者',
  `question_59` int(3) DEFAULT NULL COMMENT '59.我认为自己有品位，而从不说脏话',
  `question_60` int(3) DEFAULT NULL COMMENT '60.我是一个项目专家，并培训别人为胜任力者',
  `question_61` int(3) DEFAULT NULL COMMENT '61.我出席各级名流活动',
  `question_62` int(3) DEFAULT NULL COMMENT '62.我决不拿不属于自己的东西',
  `question_63` int(3) DEFAULT NULL COMMENT '63.我教身边的人做好事',
  `question_64` int(3) DEFAULT NULL COMMENT '64.我赞同现行的规则，并主动提出见解而不是抱怨',
  `create_time` varchar(30) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uer_question
-- ----------------------------
INSERT INTO `uer_question` VALUES ('1', '张三', '11', '15888888888', '销售', '深圳', '男', '1', '2', '1', '1', '2', '2', '1', '1', '0', '0', '1', '2', '0', '1', '2', '1', '2', '1', '2', '2', '2', '1', '1', '1', '1', '1', '2', '1', '1', '1', '1', '2', '2', '2', '1', '2', '1', '1', '1', '1', '2', '2', '2', '1', '1', '1', '1', '2', '2', '2', '1', '2', '2', '1', '1', '1', '2', '2', '2', '1', '1', '1', '1', '2', '1', '2020-11-10');
INSERT INTO `uer_question` VALUES ('24', '张无忌', '22', '15874132164', '工程师', '三大', '女', '1', '2', '1', '0', '1', '0', '1', '2', '0', '1', '0', '0', '1', '0', '1', '0', '2', '0', '1', '0', '2', '0', '1', '0', '2', '0', '0', '1', '0', '1', '0', '0', '2', '0', '1', '0', '2', '0', '1', '1', '0', '1', '1', '0', '2', '2', '2', '1', '1', '1', '2', '1', '2', '2', '1', '2', '1', '1', '2', '1', '2', '1', '1', '1', '0', '2020-11-10 17:22:24');
INSERT INTO `uer_question` VALUES ('25', '张三丰', '29', '15874132164', '工程师', '三大', '女', '2', '2', '1', '0', '1', '0', '1', '2', '0', '1', '0', '0', '1', '0', '1', '0', '2', '0', '1', '0', '2', '0', '1', '0', '2', '0', '0', '1', '0', '1', '0', '0', '2', '0', '1', '0', '2', '0', '1', '1', '0', '1', '1', '0', '2', '2', '2', '1', '1', '1', '2', '1', '2', '2', '1', '2', '1', '1', '2', '1', '2', '1', '1', '1', '0', '2020-11-10 17:23:12');
INSERT INTO `uer_question` VALUES ('26', '销售', '26', '15888788567', '销售', '谁才是最', '男', '22', '2', '1', '1', '2', '1', '0', '1', '0', '1', '2', '1', '1', '1', '1', '1', '1', '1', '2', '1', '2', '1', '2', '1', '1', '1', '2', '1', '1', '1', '1', '2', '1', '2', '1', '1', '1', '1', '2', '1', '1', '2', '1', '2', '1', '1', '2', '1', '1', '1', '2', '1', '1', '2', '1', '1', '1', '1', '2', '1', '2', '1', '1', '2', '1', '2020-11-12 10:00:26');
INSERT INTO `uer_question` VALUES ('28', '金佳ssd', '26', '15988888888', '11', 'sad ', '女', '2', '1', '1', '1', '2', '0', '1', '0', '1', '1', '1', '1', '1', '2', '1', '1', '1', '2', '1', '2', '1', '1', '2', '1', '2', '1', '1', '1', '2', '1', '2', '1', '1', '1', '1', '2', '1', '1', '1', '1', '2', '1', '2', '1', '1', '1', '2', '1', '2', '1', '1', '1', '2', '1', '1', '1', '1', '2', '1', '1', '1', '1', '1', '1', '2', '2020-11-12 10:06:24');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `company` varchar(1024) DEFAULT NULL COMMENT '公司',
  `name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(64) DEFAULT NULL COMMENT '电话',
  `address` varchar(1024) DEFAULT NULL COMMENT '地址',
  `hrts` varchar(64) DEFAULT NULL COMMENT '是否是浩锐拓客户',
  `createTime` varchar(64) DEFAULT NULL COMMENT '插入时间',
  `fahuoTime` varchar(64) DEFAULT NULL COMMENT '快递发货时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=244 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '永州锐好商业管理有限公司', 'admin', '15529546666', '广东省深圳市南山', '是', '2020-02-21 10:50:56', '2020-02-25');
INSERT INTO `user` VALUES ('2', '永州锐好商业管理有限公司', '电器', '15529546666', '广东省深圳市南山', '是', '2020-02-21 11:03:03', '2020-02-25');
