/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : chengshidanao_core

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 21/11/2018 14:05:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for grid_info_test
-- ----------------------------
DROP TABLE IF EXISTS `grid_info_test`;
CREATE TABLE `grid_info_test`  (
  `zone_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `zone_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `zone_lng` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `zone_lat` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `cnt_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`zone_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of grid_info_test
-- ----------------------------
INSERT INTO `grid_info_test` VALUES ('11', 'asdf', 'asfd', 'asdf', 'asdf');
INSERT INTO `grid_info_test` VALUES ('22', 'asdfsadf', 'asdfasdf', 'asdf', 'asdfasf');
INSERT INTO `grid_info_test` VALUES ('33', 'asdf', 'ewqr', 'cvxb', 'vmvbnm');

SET FOREIGN_KEY_CHECKS = 1;
