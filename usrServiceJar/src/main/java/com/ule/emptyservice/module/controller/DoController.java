package com.ule.emptyservice.module.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ule.emptyservice.module.entity.User;
import com.ule.emptyservice.module.service.IDoService;

//@RestController等价于@Controller加上@ResponseBody
@Controller
@RequestMapping(value = "/", produces = "application/json;charset=UTF-8")
public class DoController {
	
    private static Logger logger = Logger.getLogger(DoController.class);

    @Autowired
    private IDoService doService;

    @RequestMapping("/get")
    @ResponseBody
    public Object get(Long id) {
    	User user = doService.get(id);
    	return JSON.toJSONString(user);
    }
    
    
    @RequestMapping("/save")
    @ResponseBody
    public String save(Long id, String mobile) {
    	User user = new User();
    	user.setId(id);
    	user.setMobile(mobile);
    	doService.create(user);
        return "success";
    }
}
