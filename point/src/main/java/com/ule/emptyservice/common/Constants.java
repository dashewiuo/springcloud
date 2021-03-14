package com.ule.emptyservice.common;

import java.util.Properties;

/**
 * 常量类
 */
public class Constants extends Properties {

	private static final long serialVersionUID = -2413773007249715202L;

	public static String ORDER_SUBSTATUS = "ORDER_SUBSTATUS";

	public static String ORDER_STATUS = "ORDER_STATUS";

	/*
	 * 取消类型
	 */
	public static String CANCEL_TYPE = "CANCEL_TYPE";

	public static final Long CO_RESERVE_FLAG_RELEASE = 2L; // 已释放库存
	
	public static final long ORDER_TYPE_LOTTERY = 2200L; // 奖品秒杀订单
	public static final long ORDER_TYPE_LOTTERY2 = 2201L; // 奖品秒杀订单2
	public static final long BUSINESS_TYPE_SECKILL = 1301L; // 秒杀订单2

}
