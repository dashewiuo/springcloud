package com.ule.emptyservice.userservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//此接口不是通过zuul访问的。 直接ribbon
//name值是在eureka注册的名称：spring.application.name
@FeignClient(name="point-coreService")
public interface IPointService {

	//Feign定义服务提供者接口
		//@RequestBody或者@RequestParameter
	// 有此配置时，会出现HttpMediaTypeNotSupportedException
	// pointService是微服务的servlet-path
	    @RequestMapping(value = "/pointService/coin/get.do", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
	    String getByUser(@RequestParam(value = "userId") Long userId);
}
