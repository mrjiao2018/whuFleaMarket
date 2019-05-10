CREATE TABLE IF NOT EXISTS tb_share_product(
  share_product_id INT(100) NOT NULL AUTO_INCREMENT,
  likes INT(100) NOT NULL,
  status INT(2) NOT NULL DEFAULT 0 COMMENT '0：在架上，1：租用中',
  location INT(2) NOT NULL DEFAULT 0 COMMENT '0: 全部 1：文理学部 2：信息学部 3：工学部 4：医学部',
  share_product_name VARCHAR(100) NOT NULL ,
  share_product_desc VARCHAR(2000) DEFAULT NULL ,
  share_product_addr VARCHAR(100) NOT NULL ,
  product_category_id INT(100) NOT NULL ,
  price VARCHAR(200) NOT NULL ,
  owner_id INT(100) NOT NULL,
  create_time DATETIME DEFAULT NULL ,
  last_edit_time DATETIME DEFAULT NULL ,
  new_degree VARCHAR(32) NOT NULL ,
  PRIMARY KEY (share_product_id),
  CONSTRAINT fk_share_product_shapro FOREIGN KEY (product_id) REFERENCES tb_product(product_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;