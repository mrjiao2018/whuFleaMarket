CREATE TABLE IF NOT EXISTS `tb_person_info` (
  `user_id` int(100) NOT NULL AUTO_INCREMENT,
  `open_id` INT(100) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `nickname` varchar(32) DEFAULT NULL,
  `university` VARCHAR(32) DEFAULT NULL,
  `school` VARCHAR(32) DEFAULT NULL ,
  `address` VARCHAR(32) DEFAULT NULL,
  `phone` VARCHAR(32) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `profile_img` varchar(1024) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  `enable_status` int(2) NOT NULL DEFAULT '0' COMMENT '0：禁用，1：允许使用',
  `user_type` int(2) NOT NULL DEFAULT '0' COMMENT '0：正常用户，1：超级管理员',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;