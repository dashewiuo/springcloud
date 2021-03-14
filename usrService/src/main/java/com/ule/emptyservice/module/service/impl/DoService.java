package com.ule.emptyservice.module.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ule.emptyservice.module.dao.DoMapper;
import com.ule.emptyservice.module.entity.CheckoutOrderPrd;
import com.ule.emptyservice.module.entity.CtocOrder;
import com.ule.emptyservice.module.service.IDoService;

@Service
public class DoService implements IDoService{

	private static Logger logger = Logger.getLogger(DoService.class);
	 
	@Resource
    private DoMapper mapper;
	
	@Transactional(rollbackFor=Exception.class)
	public void exec(Long lOverTime){
		try {
			
			if(lOverTime == null){
				throw new Exception("lOverTime null");
			}
            Date overTime = new Date();
            Long time = System.currentTimeMillis();
            overTime.setTime(time - lOverTime * 60 * 1000);

            List<CtocOrder> listCo = null;
            while(true) {
                // 查询符合条件的大订单  
                listCo = mapper.findNotPayOverTimeOrder(overTime);
                logger.info("payovertime order size:" + listCo.size() + " cost " + (System.currentTimeMillis() - time));
                if (listCo == null || listCo.isEmpty()) {
                    break;
                }

                time = System.currentTimeMillis();
                logger.info("returnOrderInv cost " + (System.currentTimeMillis() - time));
            }
        } catch (Exception e) {
            logger.error("returnInvNotPayOvertime: ", e);
        }
	}
    
	@Transactional(readOnly=true)
	public List<CtocOrder> findNotPayOverTimeOrder(Date endDate){
		 return mapper.findNotPayOverTimeOrder(endDate);
	 }

	@Transactional(rollbackFor=Exception.class)
	public int updateCtocOrder(Long releAseFlag, String escOrderid){
		return mapper.updateCtocOrder(releAseFlag, escOrderid);
	}

	@Transactional(readOnly=true)
	public List<CheckoutOrderPrd> findCheckoutOrderPrdList(String escOrderid){
		return mapper.findCheckoutOrderPrdList(escOrderid);
	}
}
