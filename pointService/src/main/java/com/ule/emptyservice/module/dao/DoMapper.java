package com.ule.emptyservice.module.dao;

import com.ule.emptyservice.module.entity.Coin;

public interface DoMapper{

	public Coin loadByUserId(Long userId);
	
	public void save(Coin coin);
}
