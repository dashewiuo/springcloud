package com.ule.emptyservice.module.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ule.emptyservice.module.dto.User;
import com.ule.emptyservice.module.service.IDoService;
import com.ule.emptyservice.userservice.IPointService;
import com.ule.emptyservice.userservice.IUsrService;

@Service
public class DoService implements IDoService{

	private static Logger logger = Logger.getLogger(DoService.class);
	 
	@Autowired
	IUsrService usrService;
	
	@Autowired
	IPointService pointService;
	
	public User get(Long id){
		String json = usrService.getUser(id);
		logger.info("============" + json);
		
//		String jsonPoint = pointService.getByUser(id);
//		
//		logger.info("============" + jsonPoint);
		return JSON.parseObject(json, User.class);
	}
}
