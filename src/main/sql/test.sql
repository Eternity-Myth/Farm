-- 连接数据库控制台
-- mysql -uroot -p123456

USE test;


DROP TABLE IF EXISTS `usertable`;
create table `usertable` (
  `id` int(10) not null AUTO_INCREMENT,
  `user_name` varchar(20) not null COMMENT '用户名',
  `user_pass` varchar(20) not null COMMENT '用户密码',
  `user_email` VARCHAR(20) not null COMMENT '用户邮箱',
  `register_time` DATETIME not null DEFAULT current_timestamp COMMENT '注册时间',
  `status` TINYINT(1) not null DEFAULT 1 COMMENT '账户状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`user_name`) USING HASH,
  UNIQUE KEY `email` (`user_email`) USING HASH,
  UNIQUE KEY `id` (`id`) USING BTREE
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '用户信息表';

DROP TABLE if exists `field`
create table `field`(
`id` int(10) not null AUTO_INCREMENT,
`area` int(10) not null COMMENT '面积',
`crops` varchar(500) COMMENT '种植作物',
primary key (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '菜地信息表';


drop table if exists 'crops'
create table `crops`(
`id` int(10) not null AUTO_INCREMENT,
`cropsName` varchar(200) not null COMMENT '作物名称',
`area` int(10) not null COMMENT '每棵所需面积',
`profit` int(10) not null COMMENT '每棵的净收益',
`cropsTime` int(10) not null COMMENT '种植时间',
primary key (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '农作物信息表';

DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `classname` VARCHAR(255) NOT NULL,
  `method` VARCHAR(255) NOT NULL,
  `status_code` INT(11) NOT NULL,
  `error_msg` TEXT,
  `timestamp` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
)
  ENGINE=InnoDB
  DEFAULT CHARSET=utf8;
  COMMENT = '日志信息表';

-- 手写ddl，记录每次sql修改
