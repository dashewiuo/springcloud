package com.ule.emptyservice.module.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ule.emptyservice.module.dao.DoMapper;
import com.ule.emptyservice.module.entity.User;
import com.ule.emptyservice.module.service.IDoService;

@Service
public class DoService implements IDoService{

	private static Logger logger = Logger.getLogger(DoService.class);
	 
	@Resource
    private DoMapper mapper;
	
	@Transactional(rollbackFor=Exception.class)
	public void login(Long id){
		get(id);
	}
    
	@Transactional(readOnly=true)
	public User get(Long id){
		return mapper.loadById(id);
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void create(User user){
		mapper.save(user);
	}
}
