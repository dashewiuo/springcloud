package com.ule.emptyservice.userservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 不能使用ribbon负载均衡。 需要还ngnix配置负载均衡了
// url ="${url}"
@FeignClient(name="user-coreService")
//@FeignClient(name="user-coreService")
public interface IUsrService {

	//Feign定义服务提供者接口
	//@RequestBody或者@RequestParameter
    @RequestMapping(value = "/get.do", method = RequestMethod.POST)
    String getUser(@RequestParam(value = "id") Long id);
}
