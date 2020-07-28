/*
 Navicat MySQL Data Transfer

 Source Server         : Nocturne
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : localhost:3306
 Source Schema         : springdb

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 04/07/2020 00:32:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_bank_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_bank_info`;
CREATE TABLE `tb_bank_info`  (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` double(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_bank_info
-- ----------------------------
INSERT INTO `tb_bank_info` VALUES (1, '张珊', 100000);
INSERT INTO `tb_bank_info` VALUES (2, '李四', 102000);
INSERT INTO `tb_bank_info` VALUES (3, '王五', 98000);

-- ----------------------------
-- Table structure for tb_film_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_film_info`;
CREATE TABLE `tb_film_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `f_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `f_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `f_score` int(11) NOT NULL,
  `f_play_year` int(11) NOT NULL,
  `f_origin` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '美国',
  `f_pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 61 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_film_info
-- ----------------------------
INSERT INTO `tb_film_info` VALUES (1, '肖申克的救赎', '剧情片', 100, 2012, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (2, '盗梦空间', '科幻片', 100, 2014, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (3, '大话西游', '科幻片', 50, 2018, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (4, '我不是药神', '剧情片', 85, 2018, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (5, '无间道', '动作片', 75, 2002, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (6, '变形金刚', '科幻片', 70, 2011, '美国', 'ae5759d6-229b-4de4-8bd6-8fd19967c775.jpg');
INSERT INTO `tb_film_info` VALUES (7, '釜山行', '恐怖片', 88, 2010, '韩国', NULL);
INSERT INTO `tb_film_info` VALUES (9, '复仇者联盟', '科幻片', 23, 2017, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (10, '神话', '科幻片', 60, 2010, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (11, '诸神之战', '科幻片', 69, 2015, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (12, '大头儿子小头爸爸', '动画片', 35, 2018, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (13, '起跑线', '剧情片', 50, 2018, '印度', NULL);
INSERT INTO `tb_film_info` VALUES (14, '葫芦娃', '动画片', 65, 2000, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (15, '邪降', '恐怖片', 80, 2008, '泰国', NULL);
INSERT INTO `tb_film_info` VALUES (16, '鬼影', '恐怖片', 90, 2009, '泰国', NULL);
INSERT INTO `tb_film_info` VALUES (17, '午夜凶铃', '恐怖片', 88, 2008, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (18, '阿修罗', '恐怖片', 50, 2018, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (19, '鸡皮疙瘩', '恐怖片', 70, 2012, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (20, '千与千寻', '动画片', 60, 2015, '日本', '7a0e78b6-6c93-4f31-b101-cea5208943f7.jpg');
INSERT INTO `tb_film_info` VALUES (21, '摔跤吧爸爸', '励志片', 95, 2017, '印度', NULL);
INSERT INTO `tb_film_info` VALUES (22, '三傻大闹宝莱坞', '喜剧片', 68, 2014, '印度', NULL);
INSERT INTO `tb_film_info` VALUES (23, '宝莱坞机器人之恋', '科幻片', 40, 2014, '印度', NULL);
INSERT INTO `tb_film_info` VALUES (26, '空中营救', '动作片', 65, 2012, '英国', NULL);
INSERT INTO `tb_film_info` VALUES (27, '喜剧之王', '爱情片', 88, 2009, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (28, '西西里美丽的传说', '爱情片', 88, 2009, '美国', 'bfcd5e9e-1897-4520-9bde-09012f091d7f.jpg');
INSERT INTO `tb_film_info` VALUES (29, '泰坦尼克号', '爱情片', 88, 2002, '英国', NULL);
INSERT INTO `tb_film_info` VALUES (30, '阿甘正传', '励志片', 99, 2003, '英国', NULL);
INSERT INTO `tb_film_info` VALUES (31, '唐人街探案', '喜剧片', 78, 2016, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (33, '战狼2', '动作片', 98, 2018, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (34, '复仇者联盟2', '科幻片', 79, 2014, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (35, '复仇者联盟3', '科幻片', 87, 2018, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (36, '开心家族', '喜剧片', 88, 2005, '韩国', NULL);
INSERT INTO `tb_film_info` VALUES (37, '我的野蛮女友', '爱情片', 91, 2006, '韩国', NULL);
INSERT INTO `tb_film_info` VALUES (38, '一日情侣', '爱情片', 68, 2007, '泰国', NULL);
INSERT INTO `tb_film_info` VALUES (40, '山村老尸', '恐怖片', 74, 1998, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (41, '僵尸道长', '恐怖片', 68, 1999, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (42, '波西·杰克逊与神火之盗', '科幻片', 75, 2008, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (44, '神奇四侠', '科幻片', 78, 2010, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (46, '神偷奶爸', '动画片', 65, 2011, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (47, '双子神偷', '动作片', 59, 2014, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (48, '死亡笔记1', '悬疑片', 90, 2006, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (51, '死亡笔记2', '恐怖片', 99, 2008, '美国', NULL);
INSERT INTO `tb_film_info` VALUES (52, '进击的巨人', '动作片', 95, 2018, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (53, '热血高校', '动作片', 75, 2016, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (54, '寄生兽', '动作片', 78, 2014, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (55, '你的名字', '爱情片', 85, 2015, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (56, '情书', '爱情片', 88, 2013, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (57, '横道世之介', '爱情片', 90, 2013, '日本', NULL);
INSERT INTO `tb_film_info` VALUES (58, '我的男朋友', '爱情片', 66, 2015, '中国', NULL);
INSERT INTO `tb_film_info` VALUES (59, '我的好基友', '动作片', 78, 2016, '日本', NULL);

-- ----------------------------
-- Table structure for tb_user_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_info`;
CREATE TABLE `tb_user_info`  (
  `s_id` int(50) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `s_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user_info
-- ----------------------------
INSERT INTO `tb_user_info` VALUES (1, '卡萨丁', '88888888');
INSERT INTO `tb_user_info` VALUES (2, 'jj', '666');
INSERT INTO `tb_user_info` VALUES (4, '虞姬', '666666');
INSERT INTO `tb_user_info` VALUES (5, '曹操1', '77777771');
INSERT INTO `tb_user_info` VALUES (6, 'admin', 'admin');
INSERT INTO `tb_user_info` VALUES (7, 'admin', '123456');

SET FOREIGN_KEY_CHECKS = 1;
