package edu.whu.iss.whufleamarket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@MapperScan(value = "edu.whu.iss.whufleamarket.mapper")
@SpringBootTest
public class WhufleamarketApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws Exception {
		System.out.println("test dataSource.class:"+dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();
	}

}
