package edu.whu.iss.whufleamarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "edu.whu.iss.whufleamarket.mapper")
public class WhufleamarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhufleamarketApplication.class, args);

	}

}
