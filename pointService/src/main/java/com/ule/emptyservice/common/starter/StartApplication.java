package com.ule.emptyservice.common.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.annotation.Order;

//如果我们构建的是war包并部署到外部tomcat则需要使用它，如果使用内置servlet容器则不需要，
//外置tomcat环境的配置需要这个类的configure方法来指定初始化资源#
//容器tomcat启动时会扫描到SpringServletContainerInitializer 。此类会调用SpringBootServletInitializer的实现类
//注解是基于spring-cloud-commons依赖，并且在classpath中实现
//@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用
@EnableDiscoveryClient
//Spring Boot默认是扫描@SpringBootApplication注解的类的同包以及子包下的类
@SpringBootApplication(scanBasePackages={"com.ule","com.hf"})//(exclude={DataSourceAutoConfiguration.class})
// mybatis扫描路径 MAPPER接口需要注解@Mapper
@MapperScan(basePackages = "com.ule")
@Order(1)
public class StartApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}
}
