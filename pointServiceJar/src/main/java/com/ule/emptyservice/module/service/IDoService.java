package com.ule.emptyservice.module.service;

import com.ule.emptyservice.module.entity.Coin;

public interface IDoService {

	public Coin get(Long userId);
	
	public void create(Coin coin);
}
