package com.ule.emptyservice.module.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ule.emptyservice.module.base.mapper.Mapper;
import com.ule.emptyservice.module.entity.CheckoutOrderPrd;
import com.ule.emptyservice.module.entity.CtocOrder;

public interface DoMapper extends Mapper {

    List<CtocOrder> findNotPayOverTimeOrder(@Param(value = "paymentStartTime")Date endDate);

    int updateCtocOrder(@Param(value = "releAseFlag")Long releAseFlag, @Param(value = "escOrderid")String escOrderid);

    List<CheckoutOrderPrd> findCheckoutOrderPrdList(@Param(value = "escOrderid")String escOrderid);
}
