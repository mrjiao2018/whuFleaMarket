CREATE TABLE IF NOT EXISTS `tb_purchase_product_img` (
  `pu_img_id` int(100) NOT NULL AUTO_INCREMENT,
  `img_addr` varchar(2000) NOT NULL,
  `img_desc` varchar(2000) DEFAULT NULL,
  `priority` int(2) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `pu_product_id` int(100) DEFAULT NULL,
  PRIMARY KEY (`pu_img_id`),
  KEY `fk_purchaseimg_sharepro` (`pu_product_id`),
  CONSTRAINT `fk_purchaseimg_sharepro` FOREIGN KEY (`pu_product_id`) REFERENCES `tb_purchase_product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;