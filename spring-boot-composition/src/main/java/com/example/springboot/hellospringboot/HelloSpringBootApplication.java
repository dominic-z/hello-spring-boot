package com.example.springboot.hellospringboot;

import com.example.springboot.hellospringboot.dao.jdbc.template.ItemJdbcDao;
import com.example.springboot.hellospringboot.domain.pojo.mbg.Item;
import com.example.springboot.hellospringboot.service.DataAccessTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.List;

@SpringBootApplication
// @SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) 如果没有手动配置datasource，那么就需要关闭数据源自动配置
@Slf4j
public class HelloSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

	@Autowired
	private ItemJdbcDao itemJdbcDao;

	@Autowired
	private DataAccessTestService dataAccessTestService;

	@Override
	public void run(String... args) throws Exception {
//		List<Item> items = itemJdbcDao.getItems();
//		items.stream().limit(20).forEach(item -> log.info(item.toString()));
//		log.error("test e",new RuntimeException("error test"));


		List<Item> items = dataAccessTestService.selectItems();
		items.stream().limit(20).forEach(item -> log.info(item.toString()));

		log.error("test e",new RuntimeException("error test"));

	}
}
