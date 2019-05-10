CREATE TABLE IF NOT EXISTS `tb_share_product_img` (
  `img_id` int(100) NOT NULL AUTO_INCREMENT,
  `img_addr` varchar(2000) NOT NULL,
  `img_desc` varchar(2000) DEFAULT NULL,
  `priority` int(2) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `product_id` int(100) DEFAULT NULL,
  PRIMARY KEY (`img_id`),
  KEY `fk_shareimg_sharepro` (`product_id`),
  CONSTRAINT `fk_shareimg_sharepro` FOREIGN KEY (`product_id`) REFERENCES `tb_share_product` (`share_product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;