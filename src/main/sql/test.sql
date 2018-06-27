/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 5.7.22 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `assignment` */

DROP TABLE IF EXISTS `assignment`;

CREATE TABLE `assignment` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `assi_state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '任务状态',
  `assi_type` varchar(255) NOT NULL COMMENT '任务类型',
  `assi_data` varchar(255) NOT NULL COMMENT '任务数据',
  `assi_nickname` varchar(255) DEFAULT NULL COMMENT '用户名',
  `assi_createtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `assignment` */

insert  into `assignment`(`id`,`assi_state`,`assi_type`,`assi_data`,`assi_nickname`,`assi_createtime`) values 
(1,1,'播种','1号菜地1000玉米','杨先生','2018-06-15 11:05:26'),
(2,1,'浇灌','2号菜地','徐先生','2018-06-26 21:58:35'),
(3,1,'施肥','3号菜地','林小姐','2018-06-26 21:58:58'),
(4,1,'杀虫','4号菜地','陈小姐','2018-06-26 21:59:11'),
(5,1,'杀虫','5号菜地','杨先生','2018-06-26 21:59:20');

/*Table structure for table `consumerinfo` */

DROP TABLE IF EXISTS `consumerinfo`;

CREATE TABLE `consumerinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `con_phone` varchar(255) NOT NULL COMMENT '手机号',
  `con_name` varchar(255) DEFAULT NULL COMMENT '客户名',
  `con_state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `consumerinfo` */

insert  into `consumerinfo`(`id`,`con_phone`,`con_name`,`con_state`) values 
(5,'1893927089','杨先生',1),
(6,'13455680324','徐先生',1),
(7,'13588532209','陈小姐',1),
(8,'13288920723','林小姐',1),
(9,'13199273622','苏小姐',1);

/*Table structure for table `crops` */

DROP TABLE IF EXISTS `crops`;

CREATE TABLE `crops` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cropsName` varchar(200) NOT NULL COMMENT '作物名称',
  `area` float DEFAULT NULL COMMENT '每棵所需面积',
  `profit` float DEFAULT NULL COMMENT '每棵的净收益',
  `cropsTime` int(10) DEFAULT NULL COMMENT '种植时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='农作物信息表';

/*Data for the table `crops` */

insert  into `crops`(`id`,`cropsName`,`area`,`profit`,`cropsTime`) values 
(1,'玉米',0.8835,0.3177,3),
(2,'水稻',0.0077,0.0036,3),
(3,'大豆',0.0444,0.0119,4),
(4,'小麦',0.01,0.0025,7),
(5,'棉花',0.0606,0.0353,4),
(6,'花生',0.0833,0.0683,4),
(7,'油菜籽',0.0444,0.0121,7),
(8,'烤烟',0.5555,0.2668,4),
(9,'甘蔗',0.3333,0.3007,4),
(10,'柑橘',6.6667,8.2616,6);

/*Table structure for table `field` */

DROP TABLE IF EXISTS `field`;

CREATE TABLE `field` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `area` float NOT NULL COMMENT '面积',
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `start_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '起始时间',
  `time` int(3) NOT NULL DEFAULT '12' COMMENT '种植时长',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态',
  `total` float DEFAULT '0' COMMENT '菜地总收益',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='菜地信息表';

/*Data for the table `field` */

insert  into `field`(`id`,`area`,`username`,`start_time`,`time`,`status`,`total`) values 
(1,132,'杨先生','2018-06-01 23:52:29',12,1,184.702),
(2,629,'徐先生','2018-06-02 11:42:29',12,1,46.7019),
(3,145,'林小姐','2018-06-12 00:53:15',12,1,30.5473),
(4,178,'陈小姐','2018-06-13 11:32:52',6,1,16.3725),
(5,243,'杨先生','2018-06-16 17:12:06',12,1,52.9232);

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '商品名称',
  `quantity` int(10) DEFAULT NULL COMMENT '商品数量',
  `unit_price` float NOT NULL COMMENT '商品单价',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '商品状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `items` */

insert  into `items`(`id`,`name`,`quantity`,`unit_price`,`status`) values 
(1,'玉米',6851,1.28,1),
(2,'水稻',20000,0.33,1),
(3,'大豆',8675,0.73,1),
(4,'小麦',18263,0.38,1),
(5,'棉花',40000,0.42,1),
(6,'花生',48270,0.55,1),
(7,'油菜籽',68770,0.49,1),
(8,'烤烟',13275,1.12,1),
(9,'甘蔗',5000,2.21,1),
(10,'柑橘',793,11.27,1);

/*Table structure for table `log` */

DROP TABLE IF EXISTS `log`;

CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classname` varchar(255) NOT NULL COMMENT '类名',
  `method` varchar(255) NOT NULL COMMENT '方法名',
  `status_code` int(11) NOT NULL COMMENT '状态码',
  `error_msg` varchar(255) DEFAULT NULL COMMENT '错误信息',
  `timestamp` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '时间记录',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=478 DEFAULT CHARSET=utf8;

/*Data for the table `log` */

insert  into `log`(`id`,`classname`,`method`,`status_code`,`error_msg`,`timestamp`) values 
(1,'com.farm.web.FieldController','saveField',0,'','2018-05-23 00:10:41'),
(2,'com.farm.web.FieldController','saveField',0,'','2018-05-23 00:14:54'),
(3,'com.farm.web.SellerController','saveSeller',0,'','2018-05-23 11:12:04'),
(4,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:57:27'),
(5,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:57:41'),
(6,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:57:44'),
(7,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:57:47'),
(8,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:57:51'),
(9,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:57:55'),
(10,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:58:01'),
(11,'com.farm.web.FieldController','saveField',0,'','2018-05-23 17:58:05'),
(13,'com.farm.web.UserController','signUp',0,'','2018-05-23 21:04:04'),
(14,'com.farm.web.UserController','signIn',0,'','2018-05-23 21:04:11'),
(15,'com.farm.web.UserController','changeStatus',0,'','2018-05-23 22:27:00'),
(16,'com.farm.web.UserController','changeStatus',0,'','2018-05-23 22:27:02'),
(17,'com.farm.web.UserController','signIn',0,'','2018-05-27 20:01:50'),
(18,'com.farm.web.UserController','changeStatus',0,'','2018-05-27 21:00:00'),
(22,'com.farm.web.UserController','changeStatus',0,'','2018-05-29 22:13:50'),
(23,'com.farm.web.UserController','signIn',0,'','2018-05-29 22:14:10'),
(24,'com.farm.web.UserController','signIn',0,'','2018-05-29 22:15:34'),
(25,'com.farm.web.UserController','signOut',0,'','2018-05-29 22:15:36'),
(26,'com.farm.web.UserController','signOut',0,'','2018-05-29 22:15:40'),
(27,'com.farm.web.UserController','signIn',0,'','2018-05-29 22:15:55'),
(28,'com.farm.web.UserController','signOut',0,'','2018-05-29 22:15:58'),
(29,'com.farm.web.UserController','signOut',0,'','2018-05-29 22:16:35'),
(30,'com.farm.web.UserController','signOut',0,'','2018-05-29 22:16:41'),
(31,'com.farm.web.UserController','signOut',0,'','2018-05-31 11:27:33'),
(32,'com.farm.web.UserController','signOut',0,'','2018-05-31 11:31:48'),
(33,'com.farm.web.UserController','signOut',0,'','2018-05-31 11:46:14'),
(34,'com.farm.web.UserController','signOut',0,'','2018-05-31 11:54:20'),
(36,'com.farm.web.UserController','signOut',0,'','2018-05-31 12:03:50'),
(37,'com.farm.web.AssignmentController','saveAssignment',0,'','2018-05-31 21:33:53'),
(38,'com.farm.web.AssignmentController','saveAssignment',0,'','2018-05-31 21:36:59'),
(39,'com.farm.web.AssignmentController','deleteAssignment',0,'','2018-05-31 21:40:05'),
(40,'com.farm.web.AssignmentController','deleteAssignment',0,'','2018-05-31 21:40:10'),
(41,'com.farm.web.AssignmentController','saveAssignment',0,'','2018-05-31 21:52:14'),
(42,'com.farm.web.UserController','signOut',0,'','2018-06-01 08:56:17'),
(43,'com.farm.web.FieldController','saveField',0,'','2018-06-01 23:52:29'),
(44,'com.farm.web.FieldController','updateField',0,'','2018-06-02 00:37:33'),
(45,'com.farm.web.FieldController','updateField',0,'','2018-06-02 00:37:41'),
(46,'com.farm.web.FieldController','updateField',0,'','2018-06-02 00:37:41'),
(47,'com.farm.web.UserController','signOut',0,'','2018-06-02 00:38:43'),
(48,'com.farm.web.UserController','signOut',0,'','2018-06-02 00:39:09'),
(49,'com.farm.web.FieldController','updateField',0,'','2018-06-02 11:41:48'),
(50,'com.farm.web.FieldController','updateField',0,'','2018-06-02 11:41:48'),
(51,'com.farm.web.FieldController','updateField',0,'','2018-06-02 11:41:55'),
(52,'com.farm.web.FieldController','updateField',0,'','2018-06-02 11:41:55'),
(53,'com.farm.web.FieldController','updateField',0,'','2018-06-02 11:41:55'),
(54,'com.farm.web.FieldController','saveField',0,'','2018-06-02 11:42:29'),
(55,'com.farm.web.UserController','signOut',0,'','2018-06-04 15:11:42'),
(56,'com.farm.web.UserController','signOut',0,'','2018-06-04 15:11:43'),
(57,'com.farm.web.FieldController','updateField',0,'','2018-06-04 18:59:15'),
(58,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:06'),
(59,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:25'),
(60,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:25'),
(61,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:32'),
(62,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:33'),
(63,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:33'),
(64,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:39'),
(65,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:39'),
(66,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:39'),
(67,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:04:39'),
(68,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:05'),
(69,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:05'),
(70,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:05'),
(71,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:05'),
(72,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:05'),
(73,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:39'),
(74,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:49'),
(75,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:49'),
(76,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:59'),
(77,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:59'),
(78,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:07:59'),
(79,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:18'),
(80,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:18'),
(81,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:18'),
(82,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:18'),
(83,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:36'),
(84,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:36'),
(85,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:36'),
(86,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:36'),
(87,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:08:36'),
(88,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:32:25'),
(89,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:33:09'),
(90,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:33:09'),
(91,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:35:45'),
(92,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:35:45'),
(93,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:35:45'),
(94,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:37:41'),
(95,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:37:41'),
(96,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:37:41'),
(97,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:37:41'),
(98,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:36'),
(99,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:36'),
(100,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:36'),
(101,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:36'),
(102,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:37'),
(103,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:46'),
(104,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:46'),
(105,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:46'),
(106,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:47'),
(107,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:47'),
(108,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:38:47'),
(109,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:39:08'),
(110,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:39:08'),
(111,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:39:08'),
(112,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:39:08'),
(113,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:39:08'),
(114,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:39:08'),
(115,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:39:08'),
(116,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:54'),
(117,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:54'),
(118,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:54'),
(119,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:54'),
(120,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:55'),
(121,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:55'),
(122,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:55'),
(123,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:40:55'),
(124,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:06'),
(125,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(126,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(127,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(128,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(129,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(130,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(131,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(132,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:07'),
(133,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:41'),
(134,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:41'),
(135,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:41'),
(136,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:41'),
(137,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:41'),
(138,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:42'),
(139,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:42'),
(140,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:42'),
(141,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:42'),
(142,'com.farm.web.CropsController','updateCrops',0,'','2018-06-04 19:41:42'),
(143,'com.farm.web.UserController','signOut',0,'','2018-06-04 19:42:03'),
(144,'com.farm.web.FieldController','updateField',0,'','2018-06-04 21:07:39'),
(145,'com.farm.web.FieldController','updateField',0,'','2018-06-04 21:07:45'),
(146,'com.farm.web.FieldController','updateField',0,'','2018-06-04 21:07:45'),
(147,'com.farm.web.UserController','signIn',0,'','2018-06-07 19:37:46'),
(148,'com.farm.web.UserController','signIn',0,'','2018-06-07 20:54:22'),
(149,'com.farm.web.UserController','signIn',0,'','2018-06-07 20:58:06'),
(150,'com.farm.web.UserController','signIn',0,'','2018-06-07 21:00:07'),
(151,'com.farm.web.UserController','signIn',0,'','2018-06-07 21:09:21'),
(152,'com.farm.web.UserController','signIn',0,'','2018-06-07 21:17:16'),
(153,'com.farm.web.UserController','signOut',0,'','2018-06-07 21:17:27'),
(154,'com.farm.web.UserController','signOut',0,'','2018-06-07 21:17:37'),
(155,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-08 00:36:33'),
(156,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-08 00:36:33'),
(157,'com.farm.web.UserController','signOut',0,'','2018-06-08 00:41:34'),
(158,'com.farm.web.ItemsController','saveItems',0,'','2018-06-08 15:26:23'),
(159,'com.farm.web.ItemsController','updateItems',0,'','2018-06-08 16:04:15'),
(160,'com.farm.web.ItemsController','updateItems',0,'','2018-06-08 23:47:29'),
(161,'com.farm.web.ItemsController','updateItems',0,'','2018-06-08 23:47:33'),
(162,'com.farm.web.ItemsController','updateItems',0,'','2018-06-08 23:47:33'),
(163,'com.farm.web.UserController','signOut',0,'','2018-06-09 19:55:58'),
(164,'com.farm.web.UserController','signOut',0,'','2018-06-09 19:55:59'),
(165,'com.farm.web.UserController','signOut',0,'','2018-06-09 19:56:03'),
(166,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:11'),
(167,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:11'),
(168,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:16'),
(169,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:16'),
(170,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:16'),
(171,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:56'),
(172,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:56'),
(173,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:56'),
(174,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:48:57'),
(175,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:50:42'),
(176,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:50:42'),
(177,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:50:42'),
(178,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:50:43'),
(179,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:50:43'),
(180,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:50:43'),
(181,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:08'),
(182,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:08'),
(183,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:08'),
(184,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:08'),
(185,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:08'),
(186,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:08'),
(187,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:08'),
(188,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(189,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(190,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(191,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(192,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(193,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(194,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(195,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:13'),
(196,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(197,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(198,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(199,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(200,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(201,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(202,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(203,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(204,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:51:40'),
(205,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:24'),
(206,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(207,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(208,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(209,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(210,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(211,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(212,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(213,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(214,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(215,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:25'),
(216,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:31'),
(217,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:31'),
(218,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:31'),
(219,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:31'),
(220,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(221,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(222,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(223,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(224,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(225,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(226,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(227,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:52:32'),
(228,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:00'),
(229,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:00'),
(230,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:00'),
(231,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:00'),
(232,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(233,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(234,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(235,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(236,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(237,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(238,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(239,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(240,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(241,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:01'),
(242,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-09 23:53:02'),
(243,'com.farm.web.SellerInfoController','updateSeller',0,'','2018-06-10 10:28:34'),
(244,'com.farm.web.SellerInfoController','saveSeller',0,'','2018-06-10 10:29:14'),
(245,'com.farm.web.SellerInfoController','saveSeller',0,'','2018-06-10 10:30:10'),
(246,'com.farm.web.SellerInfoController','saveSeller',0,'','2018-06-10 10:31:46'),
(247,'com.farm.web.SellerInfoController','saveSeller',0,'','2018-06-10 10:33:07'),
(248,'com.farm.web.AssignmentController','saveAssignment',0,'','2018-06-10 10:37:19'),
(249,'com.farm.web.AssignmentController','saveAssignment',0,'','2018-06-10 10:57:17'),
(250,'com.farm.web.UserController','signOut',0,'','2018-06-10 19:31:06'),
(251,'com.farm.web.UserController','signIn',-1,'com.farm.exception.DataExistException: 用户不存在','2018-06-10 19:31:22'),
(252,'com.farm.web.ItemsController','updateItems',0,'','2018-06-10 19:38:42'),
(253,'com.farm.web.UserController','signIn',0,'','2018-06-10 19:49:12'),
(254,'com.farm.web.UserController','signOut',0,'','2018-06-10 20:24:57'),
(255,'com.farm.web.UserController','signUp',0,'','2018-06-10 20:44:31'),
(256,'com.farm.web.UserController','signIn',0,'','2018-06-10 20:44:39'),
(257,'com.farm.web.UserController','changeStatus',0,'','2018-06-10 22:15:08'),
(258,'com.farm.web.UserController','changeStatus',0,'','2018-06-10 22:15:11'),
(259,'com.farm.web.ItemsController','updateItems',0,'','2018-06-11 17:26:21'),
(260,'com.farm.web.FieldController','updateField',0,'','2018-06-11 20:22:50'),
(261,'com.farm.web.FieldController','updateField',0,'','2018-06-11 20:22:53'),
(262,'com.farm.web.FieldController','updateField',0,'','2018-06-11 20:22:53'),
(263,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 21:07:56'),
(264,'com.farm.web.ConsumerInfoController','deleteConsumerInfo',0,'','2018-06-11 21:20:42'),
(265,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 21:20:48'),
(266,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 21:20:52'),
(267,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 21:20:56'),
(268,'com.farm.web.ConsumerInfoController','deleteConsumerInfo',0,'','2018-06-11 21:25:17'),
(269,'com.farm.web.ConsumerInfoController','deleteConsumerInfo',0,'','2018-06-11 21:25:23'),
(270,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 21:38:41'),
(271,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 21:38:47'),
(272,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:38:59'),
(273,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:38:59'),
(274,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:38:59'),
(275,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:39:13'),
(276,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:39:13'),
(277,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:39:45'),
(278,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:39:45'),
(279,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:39:45'),
(280,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:39:45'),
(281,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:41:46'),
(282,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:41:54'),
(283,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:41:54'),
(284,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:42:04'),
(285,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:42:04'),
(286,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:42:04'),
(287,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:24'),
(288,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:24'),
(289,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:24'),
(290,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:24'),
(291,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:37'),
(292,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:37'),
(293,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:37'),
(294,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:37'),
(295,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:45:37'),
(296,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:46:04'),
(297,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:46:40'),
(298,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:46:40'),
(299,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:49:14'),
(300,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:49:34'),
(301,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:49:34'),
(302,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:52:38'),
(303,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:07'),
(304,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:10'),
(305,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:11'),
(306,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:12'),
(307,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:12'),
(308,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:12'),
(309,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:12'),
(310,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:12'),
(311,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:56:13'),
(312,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 21:58:02'),
(313,'com.farm.web.FieldController','updateField',0,'','2018-06-11 22:00:51'),
(314,'com.farm.web.FieldController','updateField',0,'','2018-06-11 22:01:06'),
(315,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:05:42'),
(316,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:06:05'),
(317,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:11:43'),
(318,'com.farm.web.FieldController','updateField',0,'','2018-06-11 22:12:00'),
(319,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:14:26'),
(320,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:14:30'),
(321,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:14:30'),
(322,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:14:34'),
(323,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:14:34'),
(324,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:14:34'),
(325,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 22:15:49'),
(326,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-11 22:15:53'),
(327,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:15:57'),
(328,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:19:44'),
(329,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:20:33'),
(330,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:21:49'),
(331,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:21:49'),
(332,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:36'),
(333,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:42'),
(334,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:42'),
(335,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:45'),
(336,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:45'),
(337,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:45'),
(338,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:49'),
(339,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:49'),
(340,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:49'),
(341,'com.farm.web.ConsumerInfoController','updateConsumerInfo',0,'','2018-06-11 22:37:50'),
(342,'com.farm.web.FieldController','saveField',0,'','2018-06-12 00:53:15'),
(343,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-12 00:54:55'),
(344,'com.farm.web.FieldController','saveField',0,'','2018-06-13 11:32:52'),
(345,'com.farm.web.ConsumerInfoController','saveConsumerInfo',0,'','2018-06-13 11:33:04'),
(346,'com.farm.web.FieldController','updateField',0,'','2018-06-13 11:40:19'),
(347,'com.farm.web.FieldController','updateField',0,'','2018-06-13 12:00:33'),
(348,'com.farm.web.FieldController','updateField',0,'','2018-06-13 12:00:38'),
(349,'com.farm.web.FieldController','updateField',0,'','2018-06-13 12:00:38'),
(350,'com.farm.web.ItemsController','updateItems',0,'','2018-06-13 13:12:53'),
(351,'com.farm.web.FieldController','updateField',0,'','2018-06-14 12:59:19'),
(352,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 14:45:08'),
(353,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 14:45:30'),
(354,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:07:23'),
(355,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:09:46'),
(356,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:09:53'),
(357,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:12:32'),
(358,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:12:37'),
(359,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:15:21'),
(360,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 15:18:53'),
(361,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 15:19:00'),
(362,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 15:19:07'),
(363,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:19:16'),
(364,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 15:19:49'),
(365,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 15:19:53'),
(366,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:20:09'),
(367,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:20:31'),
(368,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:23:14'),
(369,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:23:21'),
(370,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:23:24'),
(371,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:23:27'),
(372,'com.farm.web.FieldController','updateField',0,'','2018-06-14 15:43:24'),
(373,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 15:58:10'),
(374,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 15:58:15'),
(375,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 15:58:20'),
(376,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 16:43:45'),
(377,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 16:43:49'),
(378,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 16:43:53'),
(379,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 16:43:59'),
(380,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 16:47:02'),
(381,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 16:50:34'),
(382,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 16:52:10'),
(383,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 16:57:30'),
(384,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 17:18:41'),
(385,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 17:18:46'),
(386,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 17:18:51'),
(387,'com.farm.web.PlantController','deletePlant',0,'','2018-06-14 18:23:29'),
(388,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 18:38:42'),
(389,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 18:38:48'),
(390,'com.farm.web.PlantController','savaPlant',0,'','2018-06-14 18:38:53'),
(391,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:04:09'),
(392,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:04:09'),
(393,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:04:16'),
(394,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:04:16'),
(395,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:04:16'),
(396,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:05:13'),
(397,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:05:13'),
(398,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:05:13'),
(399,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:05:13'),
(400,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:57:15'),
(401,'com.farm.web.PlantController','updatePlant',0,'','2018-06-14 22:57:15'),
(402,'com.farm.web.PlantController','savaPlant',0,'','2018-06-15 08:44:26'),
(403,'com.farm.web.PlantController','updatePlant',0,'','2018-06-15 08:44:34'),
(404,'com.farm.web.AssignmentController','saveAssignment',0,'','2018-06-15 10:04:29'),
(405,'com.farm.web.AssignmentController','updateAssignment',0,'','2018-06-15 11:02:15'),
(406,'com.farm.web.AssignmentController','updateAssignment',0,'','2018-06-15 11:02:25'),
(407,'com.farm.web.AssignmentController','saveAssignment',0,'','2018-06-15 11:05:26'),
(408,'com.farm.web.AssignmentController','updateAssignment',0,'','2018-06-15 11:05:30'),
(409,'com.farm.web.AssignmentController','updateAssignment',0,'','2018-06-15 11:05:43'),
(410,'com.farm.web.AssignmentController','updateAssignment',0,'','2018-06-15 11:25:56'),
(411,'com.farm.web.PlantController','updatePlant',0,'','2018-06-15 11:32:02'),
(412,'com.farm.web.AssignmentController','updateAssignment',0,'','2018-06-15 11:32:53'),
(413,'com.farm.web.PlantController','updatePlant',0,'','2018-06-15 14:40:02'),
(414,'com.farm.web.OrderController','saveOrder',0,'','2018-06-16 15:08:36'),
(415,'com.farm.web.OrderController','saveOrder',0,'','2018-06-16 15:18:05'),
(416,'com.farm.web.OrderController','saveOrder',0,'','2018-06-16 15:41:47'),
(417,'com.farm.web.OrderController','saveOrder',0,'','2018-06-16 15:46:02'),
(418,'com.farm.web.OrderController','deleteOrder',0,'','2018-06-16 16:03:38'),
(419,'com.farm.web.OrderController','deleteOrder',0,'','2018-06-16 16:03:43'),
(420,'com.farm.web.OrderController','saveOrder',0,'','2018-06-16 16:04:13'),
(421,'com.farm.web.OrderController','updateOrder',0,'','2018-06-16 16:25:46'),
(422,'com.farm.web.OrderController','updateOrder',0,'','2018-06-16 16:25:51'),
(423,'com.farm.web.OrderController','updateOrder',0,'','2018-06-16 16:25:51'),
(424,'com.farm.web.OrderController','saveOrder',0,'','2018-06-16 16:27:47'),
(425,'com.farm.web.FieldController','saveField',0,'','2018-06-16 17:12:06'),
(426,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:45:57'),
(427,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:46:02'),
(428,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:46:05'),
(429,'com.farm.web.FieldController','updateField',0,'','2018-06-16 21:46:58'),
(430,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:46:59'),
(431,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:47:11'),
(432,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:49:00'),
(433,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:49:31'),
(434,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:52:04'),
(435,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 21:54:54'),
(436,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 22:02:40'),
(437,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 22:02:46'),
(438,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 22:02:56'),
(439,'com.farm.web.FieldController','updateField',0,'','2018-06-16 22:03:11'),
(440,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 22:03:12'),
(441,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 22:03:16'),
(442,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-16 22:03:26'),
(443,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-17 19:42:07'),
(444,'com.farm.web.UserController','signOut',0,'','2018-06-17 19:48:43'),
(445,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 11:11:39'),
(446,'com.farm.web.FieldController','updateField',0,'','2018-06-21 11:11:48'),
(447,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 11:11:49'),
(448,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 13:15:12'),
(449,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 13:15:20'),
(450,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 13:15:51'),
(451,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 14:43:20'),
(452,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 14:43:24'),
(453,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 14:43:29'),
(454,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 14:43:37'),
(455,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 14:43:43'),
(456,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 14:44:27'),
(457,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:44:55'),
(458,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:44:56'),
(459,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:44:57'),
(460,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:47:34'),
(461,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:47:48'),
(462,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:47:55'),
(463,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:48:02'),
(464,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:48:03'),
(465,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 14:48:27'),
(466,'com.farm.web.PlantController','deletePlant',0,'','2018-06-21 15:01:22'),
(467,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 15:01:34'),
(468,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 15:04:20'),
(469,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 15:05:01'),
(470,'com.farm.web.AssignmentController','updateAssignment',0,'','2018-06-21 15:05:31'),
(471,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 15:05:44'),
(472,'com.farm.web.FieldController','recommendPlan',0,'','2018-06-21 15:05:46'),
(473,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 15:06:00'),
(474,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 15:06:05'),
(475,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 15:06:10'),
(476,'com.farm.web.PlantController','savaPlant',0,'','2018-06-21 15:06:16'),
(477,'com.farm.controller.FieldController','updateField',0,'','2018-06-26 00:26:55');

/*Table structure for table `ordertable` */

DROP TABLE IF EXISTS `ordertable`;

CREATE TABLE `ordertable` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL COMMENT '客户名',
  `item_name` varchar(255) NOT NULL COMMENT '商品名',
  `quantity` int(10) NOT NULL COMMENT '数量',
  `total` float DEFAULT NULL COMMENT '合计',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '订单状态',
  PRIMARY KEY (`id`),
  KEY `fk_order_user_1` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `ordertable` */

insert  into `ordertable`(`id`,`user_name`,`item_name`,`quantity`,`total`,`create_time`,`status`) values 
(1,'杨先生','玉米',577,204.489,'2018-06-16 16:04:13',0),
(2,'苏小姐','玉米',1344,476.314,'2018-06-16 16:27:47',0),
(3,'苏小姐','甘蔗',1569,471.484,'2018-06-26 22:08:07',0),
(4,'苏小姐','大豆',1468,17.4692,'2018-06-26 22:08:17',0);

/*Table structure for table `plant` */

DROP TABLE IF EXISTS `plant`;

CREATE TABLE `plant` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `fid` int(11) NOT NULL COMMENT '菜地ID',
  `cname` varchar(255) DEFAULT NULL COMMENT '农作物名',
  `cprofit` float DEFAULT NULL COMMENT '农作物单株利润',
  `quantity` int(10) NOT NULL COMMENT '种植数量',
  `total` float DEFAULT NULL COMMENT '合计',
  `time` int(3) DEFAULT NULL COMMENT '种植时长',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `plant` */

insert  into `plant`(`id`,`fid`,`cname`,`cprofit`,`quantity`,`total`,`time`,`status`) values 
(1,1,'玉米',0.3177,533,169.334,3,1),
(2,1,'花生',0.0683,225,15.3675,4,1),
(3,2,'玉米',0.3177,147,46.7019,3,1),
(4,3,'大豆',0.0119,2567,30.5473,4,1),
(5,4,'小麦',0.0025,6549,16.3725,7,1),
(6,5,'甘蔗',0.3007,176,52.9232,4,1);

/*Table structure for table `sellerinfo` */

DROP TABLE IF EXISTS `sellerinfo`;

CREATE TABLE `sellerinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `seller_phone` varchar(255) NOT NULL COMMENT '电话',
  `seller_name` varchar(255) NOT NULL COMMENT '商家名',
  `seller_company_name` varchar(255) NOT NULL COMMENT '公司名',
  `seller_add` varchar(255) NOT NULL COMMENT '地址',
  `seller_state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态',
  `seller_alipaynum` varchar(255) NOT NULL COMMENT '支付宝',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `sellerinfo` */

insert  into `sellerinfo`(`id`,`seller_phone`,`seller_name`,`seller_company_name`,`seller_add`,`seller_state`,`seller_alipaynum`) values 
(1,'400-1188-590','王经理','青岛富景农业开发股份有限公司','上海市嘉定区嘉怡路296号4137室',1,'18232342797'),
(2,'028-85765219','陈经理','成都优鲜农业科技有限公司','成都天府新区华阳南湖西路168号',1,'13423425247'),
(3,'028-87975326','陈经理','成都蜀源农业开发有限公司','成都市郫县新民场镇现代都市农业园',1,'13728734533'),
(4,'18228512493','苟先生','成都无化农业有限公司','四川省成都市锦江区三圣街道琉大路（白鹭湾湿地旁）大安桥3组6号',1,'18228512493'),
(5,'028-82460160','吴经理','成都市花中花农业发展有限责任公司','成都市新津县花桥镇长绍街5号',1,'18876436333');

/*Table structure for table `usertable` */

DROP TABLE IF EXISTS `usertable`;

CREATE TABLE `usertable` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `user_pass` varchar(20) NOT NULL COMMENT '用户密码',
  `user_email` varchar(20) NOT NULL COMMENT '用户邮箱',
  `register_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '账户状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`user_name`) USING HASH,
  UNIQUE KEY `email` (`user_email`) USING HASH,
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

/*Data for the table `usertable` */

insert  into `usertable`(`id`,`user_name`,`user_pass`,`user_email`,`register_time`,`status`) values 
(1,'admin','123456','admin@qq.com','2018-05-23 21:04:04',1),
(2,'test','123456','test@qq.com','2018-06-10 20:44:31',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
