package com.ule.emptyservice.module.entity;

public class Coin {

	private Long id;
	private Long userId;
	private Double avaliableAmount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getAvaliableAmount() {
		return avaliableAmount;
	}
	public void setAvaliableAmount(Double avaliableAmount) {
		this.avaliableAmount = avaliableAmount;
	}
	
}
