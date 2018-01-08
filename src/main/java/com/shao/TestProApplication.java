package com.shao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProApplication {

	//配置mybatis的分页插件pageHelper
//	@Bean
//	public PageHelper pageHelper(){
//		PageHelper pageHelper = new PageHelper();
//		Properties properties = new Properties();
//		properties.setProperty("offsetAsPageNum","true");
//		properties.setProperty("rowBoundsWithCount","true");
//		properties.setProperty("reasonable","true");
//		properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
//		pageHelper.setProperties(properties);
//		return pageHelper;
//	}
	public static void main(String[] args) {
		SpringApplication.run(TestProApplication.class, args);

	}
}
