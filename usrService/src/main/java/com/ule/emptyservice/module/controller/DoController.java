package com.ule.emptyservice.module.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ule.emptyservice.module.service.IDoService;

@Controller
@RequestMapping(value = "/do", produces = "text/plain;charset=UTF-8")
public class DoController {
	
    private static Logger logger = Logger.getLogger(DoController.class);

    @Resource
    private IDoService doService;

    /**
     * 订单取消、超时未支付、超时部分支付的订单返还库存
     */
    @RequestMapping("/exec")
    @ResponseBody
    public String outTimePayReturnInv(Long lOverTime) {
        
    	if(lOverTime == null || lOverTime.longValue() == 0){
    		return "lOverTime null";
    	}
    	doService.exec(lOverTime);

        return "success";
    }
}
