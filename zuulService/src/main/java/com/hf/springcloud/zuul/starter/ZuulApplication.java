package com.hf.springcloud.zuul.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//没有代理功能的Zuul服务
//@EnableZuulServer
/**
 * 使用@EnableZuulProxy注解激活zuul。
 * 该注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient，是个组合注解，目的是简化配置
 */
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
		
		SpringApplication.run(ZuulApplication.class,args);
	}

}
