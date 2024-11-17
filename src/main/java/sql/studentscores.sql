/*
 Navicat Premium Dump SQL

 Source Server         : youqi
 Source Server Type    : MySQL
 Source Server Version : 80300 (8.3.0)
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80300 (8.3.0)
 File Encoding         : 65001

 Date: 17/11/2024 20:05:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for studentscores
-- ----------------------------
DROP TABLE IF EXISTS `studentscores`;
CREATE TABLE `studentscores`  (
  `student_id` bigint NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `student_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '学生姓名',
  `class_id` bigint NULL DEFAULT NULL COMMENT '班级id',
  `score` double NULL DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of studentscores
-- ----------------------------
INSERT INTO `studentscores` VALUES (1, 'zs', 1, 99);
INSERT INTO `studentscores` VALUES (2, 'ls', 2, 98);
INSERT INTO `studentscores` VALUES (3, 'ww', 2, 98);
INSERT INTO `studentscores` VALUES (4, 'zl', 1, 90);
INSERT INTO `studentscores` VALUES (5, 'zq', 1, 90);
INSERT INTO `studentscores` VALUES (6, 'ff', 2, 85);

SET FOREIGN_KEY_CHECKS = 1;
