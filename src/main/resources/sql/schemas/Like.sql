CREATE TABLE IF NOT EXISTS tb_like(
  like_id INT(100) NOT NULL AUTO_INCREMENT,
  share_product_id INT(100) NOT NULL,
  user_id INT(100) NOT NULL ,
  create_time DATETIME DEFAULT NULL ,
  status INT(2) NOT NULL DEFAULT 0 COMMENT '0：有效赞，1：已取消赞',
  PRIMARY KEY (like_id),
  CONSTRAINT fk_like_likeshare FOREIGN KEY (share_product_id) REFERENCES tb_share_product(share_product_id),
  CONSTRAINT fk_product_personinfo FOREIGN KEY (user_id) REFERENCES tb_person_info(id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;