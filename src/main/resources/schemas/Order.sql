CREATE TABLE IF NOT EXISTS `tb_order` (
  `order_id` int(100) NOT NULL AUTO_INCREMENT,
  `user_id` int(100) NOT NULL,
  `product id` int(100) NOT NULL ,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  `order_mode` VARCHAR(100) NOT NULL,
  `order_state` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`order_id`),
  CONSTRAINT fk_order_user FOREIGN KEY (user_id) REFERENCES tb_person_info(user_id),
  CONSTRAINT fk_order_product FOREIGN KEY (`product id`) REFERENCES tb_product(`product id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;