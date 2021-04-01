package com.ule.emptyservice.module.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ule.emptyservice.module.dao.DoMapper;
import com.ule.emptyservice.module.entity.Coin;
import com.ule.emptyservice.module.service.IDoService;

@Service
public class DoService implements IDoService{

	private static Logger logger = Logger.getLogger(DoService.class);
	 
	@Resource
    private DoMapper mapper;
	
	@Transactional(readOnly=true)
	public Coin get(Long userId) {
		return mapper.loadByUserId(userId);
	}

	@Transactional(rollbackFor=Exception.class)
	public void create(Coin coin) {
		mapper.save(coin);
	}
}
