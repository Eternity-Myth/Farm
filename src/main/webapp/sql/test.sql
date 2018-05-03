-- 连接数据库控制台
-- mysql -uroot -p123456

USE test;


DROP TABLE IF EXISTS `user`;
create table `user` (
  `id` int(10) not null AUTO_INCREMENT,
  `user_name` varchar(20) not null COMMENT '用户名',
  `user_pass` varchar(20) not null COMMENT '用户密码',
  `user_email` VARCHAR(20) not null COMMENT '用户邮箱',
  `register_time` DATETIME not null DEFAULT current_timestamp COMMENT '注册时间',
  `nick_name` VARCHAR(20) COMMENT '昵称',
  `status` TINYINT(1) not null DEFAULT 1 COMMENT '账户状态',
  `sex` TINYINT(1) COMMENT '性别',
  `birth` DATE COMMENT '出生日期',
  `profile` VARCHAR(500) COMMENT '个人简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`user_name`) USING HASH,
  UNIQUE KEY `email` (`user_email`) USING HASH,
  UNIQUE KEY `id` (`id`) USING BTREE
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '用户信息表';

-- 手写ddl，记录每次sql修改
