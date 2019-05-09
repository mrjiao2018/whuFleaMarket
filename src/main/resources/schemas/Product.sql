CREATE TABLE IF NOT EXISTS tb_product(
  product_id INT(100) NOT NULL AUTO_INCREMENT,
  product_name VARCHAR(100) NOT NULL ,
  product_desc VARCHAR(2000) DEFAULT NULL ,
  product_addr VARCHAR(100) NOT NULL ,
  product_category_id INT(100) NOT NULL ,
  price VARCHAR(200) NOT NULL ,
  owner_id INT(100) NOT NULL,
  create_time DATETIME DEFAULT NULL ,
  last_edit_time DATETIME DEFAULT NULL ,
  new_degree VARCHAR(32) NOT NULL ,
  PRIMARY KEY (product_id),
  CONSTRAINT fk_product_procate FOREIGN KEY (product_category_id) REFERENCES tb_product_category(product_category_id),
  CONSTRAINT fk_product_personinfo FOREIGN KEY (owner_id) REFERENCES tb_person_info(user_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;