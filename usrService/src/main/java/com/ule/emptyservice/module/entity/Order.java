package com.ule.emptyservice.module.entity;

public interface Order {

    /**
     * 获取订单号（ctoc_order表 -> order_id）。
     */
    public Long getOrderId();
    
    /**
     * 获取订单类型。
     */
    public Long getOrderType();
    
    /**
     * 获取大订单号
     * @return
     */
    public String getEscOrderid();
    
    public Long getOrderStatus();
    
    public String getBuyerIpAddr() ;
    
    public Long getBuyerOnlyid();
    
    public Double getProductAmount();
    
    public String getSupportedBuyType();
    
}
