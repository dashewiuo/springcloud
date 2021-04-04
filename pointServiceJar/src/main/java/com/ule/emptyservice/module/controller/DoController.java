package com.ule.emptyservice.module.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ule.emptyservice.module.entity.Coin;
import com.ule.emptyservice.module.service.IDoService;

@Controller
@RequestMapping(value = "/", produces = "application/json;charset=UTF-8")
public class DoController {
	
    private static Logger logger = Logger.getLogger(DoController.class);

    @Resource
    private IDoService doService;

    @RequestMapping("/get")
    @ResponseBody
    public String get(Long userId) {
    	Coin coin = doService.get(userId);
        return JSON.toJSONString(coin);
    }
    
    @RequestMapping("/save")
    @ResponseBody
    public String save(Long id,Long userId, Double avaliableAmount) {
    	Coin coin = new Coin();
    	coin.setAvaliableAmount(avaliableAmount);
    	coin.setUserId(userId);
    	doService.create(coin);
        return "success";
    }
}
