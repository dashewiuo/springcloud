package com.ule.emptyservice.userservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="1", url="http://192.168.160.195:2020/pointService")
public interface IPointServiceZuul {

	//Feign定义服务提供者接口
		//@RequestBody或者@RequestParameter
	//, produces = {"application/json;charset=UTF-8"}
	    @RequestMapping(value = "/get.do", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
	    String getByUser(@RequestParam(value = "userId") Long userId);
}
