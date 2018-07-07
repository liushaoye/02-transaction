/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost:3306
 Source Schema         : p2p

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 08/07/2018 06:22:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(50) NOT NULL,
  `age` int(50) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 20, '李四');
INSERT INTO `student` VALUES (2, 24, '张三');
INSERT INTO `student` VALUES (3, 24, '周美');
INSERT INTO `student` VALUES (4, 22, 'zhangsan');
INSERT INTO `student` VALUES (5, 22, 'zhangsan-01');
INSERT INTO `student` VALUES (6, 22, 'zs02');
INSERT INTO `student` VALUES (7, 22, 'zs03');
INSERT INTO `student` VALUES (8, 22, 'zs04');
INSERT INTO `student` VALUES (9, 22, 'zs05');
INSERT INTO `student` VALUES (10, 22, 'zs06');
INSERT INTO `student` VALUES (11, 20, '周素');
INSERT INTO `student` VALUES (12, 22, '李丽');
INSERT INTO `student` VALUES (13, 22, '李丽');
INSERT INTO `student` VALUES (14, 22, '张三01');
INSERT INTO `student` VALUES (15, 22, '张三02');
INSERT INTO `student` VALUES (16, 22, 'lisi009');

SET FOREIGN_KEY_CHECKS = 1;
