package com.ule.emptyservice.module.entity;

import java.util.Date;

/**
 * 研发中心系统组维护
 */

public class CtocOrder extends BaseOrder{

	private static final long serialVersionUID = 1L;


	private Long unionId;

	private String unionRef;


	private Long orderPoint=0L;


	private Double cashTransAmount;


	private Double cashTransAmountPayed;

	//新加买家留言

	private String buyerNote3;


	private Date buyerNote3Time;


	private Long businessType;


	private Double commissionAmount;


	private String orderTag;


	private String transTown;


	private String transTownCode;


	private String merchantSiteCode;

	//订单支付版本号

	private Long payVersion;


	public Long getPayVersion() {
		return payVersion;
	}

	public void setPayVersion(Long payVersion) {
		this.payVersion = payVersion;
	}

	public String getBuyerNote3() {
		return buyerNote3;
	}

	public void setBuyerNote3(String buyerNote3) {
		this.buyerNote3 = buyerNote3;
	}

	public Date getBuyerNote3Time() {
		return buyerNote3Time;
	}

	public void setBuyerNote3Time(Date buyerNote3Time) {
		this.buyerNote3Time = buyerNote3Time;
	}

	public Long getUnionId() {
		return unionId;
	}

	public void setUnionId(Long unionId) {
		this.unionId = unionId;
	}

	public String getUnionRef() {
		return unionRef;
	}

	public void setUnionRef(String unionRef) {
		this.unionRef = unionRef;
	}

	public Long getOrderPoint() {
		return orderPoint;
	}

	public void setOrderPoint(Long orderPoint) {
		this.orderPoint = orderPoint;
	}

	public Double getCashTransAmount() {
		return cashTransAmount;
	}

	public void setCashTransAmount(Double cashTransAmount) {
		this.cashTransAmount = cashTransAmount;
	}

	public Double getCashTransAmountPayed() {
		return cashTransAmountPayed;
	}

	public void setCashTransAmountPayed(Double cashTransAmountPayed) {
		this.cashTransAmountPayed = cashTransAmountPayed;
	}

	public Long getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public String getOrderTag() {
		return orderTag;
	}

	public void setOrderTag(String orderTag) {
		this.orderTag = orderTag;
	}

	public String getTransTown() {
		return transTown;
	}

	public void setTransTown(String transTown) {
		this.transTown = transTown;
	}

	public String getTransTownCode() {
		return transTownCode;
	}

	public void setTransTownCode(String transTownCode) {
		this.transTownCode = transTownCode;
	}

	public String getMerchantSiteCode() {
		return merchantSiteCode;
	}

	public void setMerchantSiteCode(String merchantSiteCode) {
		this.merchantSiteCode = merchantSiteCode;
	}


}
