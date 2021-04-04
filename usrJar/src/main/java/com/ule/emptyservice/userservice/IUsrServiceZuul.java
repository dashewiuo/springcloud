package com.ule.emptyservice.userservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 不能使用ribbon负载均衡。 需要还ngnix配置负载均衡了
@FeignClient(name="2", url="http://192.168.160.195:2020/userService")
public interface IUsrServiceZuul {

	//Feign定义服务提供者接口
	//@RequestBody或者@RequestParameter
    @RequestMapping(value = "/get.do", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    String getUser(@RequestParam(value = "id") Long id);
}
