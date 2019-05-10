CREATE TABLE IF NOT EXISTS tb_purchase_product(
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `owner_id` int(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `time` varchar(100) NOT NULL,
  `content` varchar(100) NOT NULL,
  `status` INT(2) NOT NULL DEFAULT 0 COMMENT '0：进行中，1：已完成',
  `mode` INT(2) NOT NULL DEFAULT 0 COMMENT '1：代理点，1：自由发布',
  `category` int(12) NOT NULL,
  PRIMARY KEY (`purchase_product_id`),
  CONSTRAINT fk_purchase_personinfo FOREIGN KEY (owner_id) REFERENCES tb_person_info(id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;