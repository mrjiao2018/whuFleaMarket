CREATE TABLE IF NOT EXISTS tb_product(
  id INT(100) NOT NULL AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL ,
  description VARCHAR(2000) DEFAULT NULL ,
  address VARCHAR(100) NOT NULL ,
  category_id INT(100) NOT NULL ,
  price VARCHAR(200) NOT NULL ,
  owner_id INT(100) NOT NULL,
  time DATETIME DEFAULT NULL COMMENT '创建时间',
  new_degree VARCHAR(32) NOT NULL ,
  status INT(2) DEFAULT 0 COMMENT '商品状态：0：上架，1：已被订购',
  mode INT(2) DEFAULT 0 COMMENT '交易模式：1：代理点，2：自由发布',
  PRIMARY KEY (id),
  CONSTRAINT fk_product_procate FOREIGN KEY (category_id) REFERENCES tb_product_category(product_category_id),
  CONSTRAINT fk_product_personinfo FOREIGN KEY (owner_id) REFERENCES tb_person_info(id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;