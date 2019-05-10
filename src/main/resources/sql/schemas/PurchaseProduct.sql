CREATE TABLE IF NOT EXISTS tb_purchase_product(
  `purchase_product_id` int(100) NOT NULL AUTO_INCREMENT,
  `purchase_product_address` varchar(100) NOT NULL,
  `purchase_product_time` varchar(100) NOT NULL,
  `purchase_product_content` varchar(100) NOT NULL,
  `purchase_status` INT(2) NOT NULL DEFAULT 0 COMMENT '0：进行中，1：已完成',
  `purchase_mode` INT(2) NOT NULL DEFAULT 0 COMMENT '1：代理点，1：自由发布',
  `purchase_product_category` int(12) NOT NULL,
  PRIMARY KEY (`purchase_product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;