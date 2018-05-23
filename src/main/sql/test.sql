-- 连接数据库控制台
-- mysql -uroot -p123456

USE test;

CREATE TABLE `crops` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cropsName` varchar(200) NOT NULL COMMENT '作物名称',
  `area` int(10) DEFAULT NULL COMMENT '每棵所需面积',
  `profit` int(10) NOT NULL COMMENT '每棵的净收益',
  `cropsTime` int(10) NOT NULL COMMENT '种植时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='农作物信息表';

CREATE TABLE `field` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `area` int(10) NOT NULL COMMENT '面积',
  `crops` varchar(500) DEFAULT NULL COMMENT '种植作物',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜地信息表';

CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classname` varchar(255) NOT NULL,
  `method` varchar(255) NOT NULL,
  `status_code` int(11) NOT NULL,
  `error_msg` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sellerinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `seller_phone` int(31) NOT NULL,
  `seller_name` varchar(255) NOT NULL,
  `seller_company_name` varchar(255) NOT NULL,
  `seller_add` varchar(255) NOT NULL,
  `seller_state` int(11) NOT NULL DEFAULT '1',
  `seller_alipaynum` int(31) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- 手写ddl，记录每次sql修改
