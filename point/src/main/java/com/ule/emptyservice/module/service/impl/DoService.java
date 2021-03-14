package com.ule.emptyservice.module.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ule.emptyservice.module.service.IDoService;

@Service
public class DoService implements IDoService{

	private static Logger logger = Logger.getLogger(DoService.class);
	 
	public void exec(Long lOverTime){
	}
}
