package com.ule.emptyservice.userservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="point-coreService", url="http://192.168.160.195:2020/pointService")
public interface IPointService {

	//Feign定义服务提供者接口
		//@RequestBody或者@RequestParameter
	    @RequestMapping(value = "/pointService/get", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
	    String getByUser(@RequestParam(value = "userId") Long userId);
}
