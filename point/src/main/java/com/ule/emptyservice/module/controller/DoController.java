package com.ule.emptyservice.module.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ule.emptyservice.module.service.IDoService;

@Controller
@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
public class DoController {
	
    private static Logger logger = Logger.getLogger(DoController.class);

    @Resource
    private IDoService doService;

    @RequestMapping("/add")
    public String login() {
        
        return "success";
    }
}
