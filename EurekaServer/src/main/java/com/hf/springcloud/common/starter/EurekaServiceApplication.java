package com.hf.springcloud.common.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer         //开启eureka服务
//springBoot注解,spring在springBoot基础之上来构建项目.禁用指定的自动化配置来避免加载不必要的自动化配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@EnableZuulProxy
public class EurekaServiceApplication {

	public static void main(String[] args) {
		
		System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
		
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
