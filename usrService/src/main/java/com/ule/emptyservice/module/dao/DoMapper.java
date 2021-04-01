package com.ule.emptyservice.module.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ule.emptyservice.module.entity.User;

@Mapper
public interface DoMapper{

	public User loadById(Long id);
	
	public void save(User user);
}
