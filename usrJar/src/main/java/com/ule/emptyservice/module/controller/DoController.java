package com.ule.emptyservice.module.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ule.emptyservice.module.dto.User;
import com.ule.emptyservice.module.service.IDoService;

@Controller
@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
public class DoController {
	
    private static Logger logger = Logger.getLogger(DoController.class);

    @Resource
    private IDoService doService;

    @RequestMapping("/login")
    @ResponseBody
    public Object login(Long id) {
    	User user = doService.get(id);
    	return JSON.toJSONString(user);
    }
}
