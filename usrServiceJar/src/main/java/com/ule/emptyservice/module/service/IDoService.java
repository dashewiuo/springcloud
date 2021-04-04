package com.ule.emptyservice.module.service;

import com.ule.emptyservice.module.entity.User;

public interface IDoService {

	public void login(Long id);
	
	public User get(Long id);
	
	public void create(User user);
}
