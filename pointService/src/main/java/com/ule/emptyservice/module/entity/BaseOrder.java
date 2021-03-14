package com.ule.emptyservice.module.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BaseOrder implements Serializable, Order {
    private static final long serialVersionUID = 1L;

    private Long orderId;
    private String escOrderid;
    private Long sellerOnlyid;
    private String sellerLoginid;
    private Long buyerOnlyid;
    private String buyerLoginid;
    private Long productSerial;
    private Long productId;
    private Long productVersion;
    private Long productClassid;
    private String productInfo;
    private String productPic;
    private Double productPrice;
    private Long productNum;
    private Double productAmount;
    private Long productPointStatus;
    private Long productCouponStatus;
    private String tradeDesc;
    private Double transType1Value;
    private Double transType1Addvalue;
    private Double transType1Amount;
    private Double transType2Value;
    private Double transType2Addvalue;
    private Double transType2Amount;
    private Double transType3Value;
    private Double transType3Addvalue;
    private Double transType3Amount;
    private Double transType4Value;
    private Double transType4Addvalue;
    private Double transType4Amount;
    private Double transType5Value;
    private Double transType5Addvalue;
    private Double transType5Amount;
    private Double transType6Value;
    private Double transType6Addvalue;
    private Double transType6Amount;
    private Double transType7Value;
    private Double transType7Addvalue;
    private Double transType7Amount;
    private Long saleType;
    private Long buyType;
    private String couponId;
    private Double couponAmount;
    private Date couponUseTime;
    private Long transType;
    private String transSubtype;
    private String transContact;
    private String transInfo;
    private String transAddress;
    private String transPostalCode;
    private String transCountry;
    private String transProvince;
    private String transCity;
    private String transUsrName;
    private String transUsrPhone;
    private Double transAmount;
    private Double rebateAmount;
    private Double groupbuyAmount;
    private Double orderAmount;
    private Double paymentAmount;
    private Double refundAmount;
    private Double releaseAmount;
    private Long orderPaymentid;
    private Long orderRefundid;
    private Date orderCreateTime;
    private Date bankpayActiveTime;
    private Date postpayActiveTime;
    private Date sellerModifyTime;
    private Date buyerModifyTime;


    private Date buyerRequestTime;


    private Date sellerRespondTime;


    private Date buyerPayTime;


    private Date buyerReleaseTime;


    private Date sellerShipTime;


    private Date orderTerminalTime;


    private Date orderActiveTime;


    private Date buyerRefundTime;


    private Date refundActiveTime;

    private Long orderDeleted;

    private Long buyerFeedback;


    private Date buyerFeedbackTime;

    private Long sellerFeedback;


    private Date sellerFeedbackTime;

    private Long orderStatus;

    private Long orderSubstatus;

    private String buyerNote;


    private Date buyerNoteTime;

    private String sellerNote;


    private Date sellerNoteTime;

    private Long cancelType;

    private String cancelNote;


    private Date cancelTime;

    private Long requestCsStatus;


    private Date requestCsTime;

    private Long freezeStatus;


    private Date freezeStartTime;


    private Date freezeCancelTime;

    private Long paymentNotifyEmail;

    private Long paymentCloseEmail;

    private Long shipitemNotifyEmail;

    private Long releaseNotifyEmail1;

    private Long releaseNotifyEmail2;

    private Long releaseNotifyEmail3;


    private Date updateTime;

    private Long createSpId;

    private String buyerIpAddr;

    private String buyerHdId;

    private String buyerCpuId;

    private String buyerMacId;

    private String buyerCookieInfo;

    private String sellerIpAddr;

    private String sellerHdId;

    private String sellerCpuId;

    private String sellerMacId;

    private String sellerCookieInfo;

    private String transWebsite;

    private String buyerNote2;


    private Date buyerNote2Time;

    private String sellerNote2;


    private Date sellerNote2Time;

    private String sellerNote3;

    private String sellerNote4;

    private String sellerNote5;

    private String sellerNote6;

    private Long feedbackInvokeStatus;

    private Long pointInvokeStatus;

    private String merchantOrder;

    private String merchantUsrName;

    private String merchantUsrEmail;

    private String merchantBackurl;

    private String merchantDate;

    private Long merchantRespondStatus;

    private Double chargesAmount;

    private Long searchSite;

    private String prdCategory;

    private String prdItemId;

    private String prdCurrency;

    private Double prdSalPrice;

    private Double prdSalShippingFee;

    private Long partnerStatus;


    private Date partnerConfirmTime;

    private String partnerConfirmNote;


    private Date partnerPurchaseTime;

    private String partnerPurchaseNote;


    private Date partnerShippingTime;

    private String partnerShippingNote;

    private String invoiceTitle;

    private String invoiceContent;

    private String taxPayerIdentityNum;

    private Long orderType;

    private Long checkoutMerchantPrivsId;

    private Long merchantId;

    private Long invoiceInUse;

    private Long deliverTime;

    private Long deliverConfimFlag;

    private Long postofficeId;

    private String postofficeName;

    private Double payedAmount;

    private String area;

    private String telNumber;

    private String telAreaCode;

    private Double costPrice;

    private Double referTransAmount;

    private Double actualTransAmount;

    private Long usedpoint;

    private Long usedpointtype;

    private Long coupontype;

    private Double usedpointamount;

    private Long reserveFlag;


    private Date paymentStartTime;

    private String pointName;

    private String pointWebsite;

    private String remark;

    private String extraReceiveInvoice;

    private String invoiceName;

    private String invoiceTel;

    private String invoiceMobile;

    private String invoiceAddress;

    private String invoicePostcode;

    private String buyerName;

    private String buyerPhone;

    private String buyerMobile;

    private String buyerEmail;

    private String buyerPostCode;

    private String buyerAddress;

    private String transProvinceCode;

    private String transCityCode;

    private String areaCode;

    private String promotionTicket;

    private String supportedBuyType;

    private Double discountAmount;


    private Date paymentDueDate;

    private BigDecimal cardCashPay;

    private String invoiceRequired;

    private String invoiceType2;

    private String invoiceByDetail;

    private String invoiceTaxCompany;

    private String invoiceTaxRegNo;

    private String invoiceTaxRegAddr;

    private String invoiceTaxRegTel;

    private String invoiceTaxRegBank;

    private String invoiceTaxRegAcc;

    private Long invoiceIssueStatus;

    private Long invoiceReissueTimes;


    private Date invoiceReissueTime;

    private Long invoiceDupIssueTimes;


    private Date invoiceDupIssueTime;

    private String invoiceStatusLocked;


    private Date invoiceStatusLockedTime;

    private Long invoiceType;

    private Long invoicePostType;

    private Double serviceFee;

    private String updateBy;

    private Long buySubtype;

    private Integer settlementFlag;
    // 新加渠道码

    private String channel;


    private String salesChannel;

    public String getTaxPayerIdentityNum() {
        return taxPayerIdentityNum;
    }

    public void setTaxPayerIdentityNum(String taxPayerIdentityNum) {
        this.taxPayerIdentityNum = taxPayerIdentityNum;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setEscOrderid(String escOrderid) {
        this.escOrderid = escOrderid;
    }

    public String getEscOrderid() {
        return escOrderid;
    }

    public void setSellerOnlyid(Long sellerOnlyid) {
        this.sellerOnlyid = sellerOnlyid;
    }

    public Long getSellerOnlyid() {
        return sellerOnlyid;
    }

    public void setSellerLoginid(String sellerLoginid) {
        this.sellerLoginid = sellerLoginid;
    }

    public String getSellerLoginid() {
        return sellerLoginid;
    }

    public void setBuyerOnlyid(Long buyerOnlyid) {
        this.buyerOnlyid = buyerOnlyid;
    }

    public Long getBuyerOnlyid() {
        return buyerOnlyid;
    }

    public void setBuyerLoginid(String buyerLoginid) {
        this.buyerLoginid = buyerLoginid;
    }

    public String getBuyerLoginid() {
        return buyerLoginid;
    }

    public void setProductSerial(Long productSerial) {
        this.productSerial = productSerial;
    }

    public Long getProductSerial() {
        return productSerial;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductVersion(Long productVersion) {
        this.productVersion = productVersion;
    }

    public Long getProductVersion() {
        return productVersion;
    }

    public void setProductClassid(Long productClassid) {
        this.productClassid = productClassid;
    }

    public Long getProductClassid() {
        return productClassid;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductNum(Long productNum) {
        this.productNum = productNum;
    }

    public Long getProductNum() {
        return productNum;
    }

    public void setProductAmount(Double productAmount) {
        this.productAmount = productAmount;
    }

    public Double getProductAmount() {
        return productAmount;
    }

    public void setProductPointStatus(Long productPointStatus) {
        this.productPointStatus = productPointStatus;
    }

    public Long getProductPointStatus() {
        return productPointStatus;
    }

    public void setProductCouponStatus(Long productCouponStatus) {
        this.productCouponStatus = productCouponStatus;
    }

    public Long getProductCouponStatus() {
        return productCouponStatus;
    }

    public void setTradeDesc(String tradeDesc) {
        this.tradeDesc = tradeDesc;
    }

    public String getTradeDesc() {
        return tradeDesc;
    }

    public void setTransType1Value(Double transType1Value) {
        this.transType1Value = transType1Value;
    }

    public Double getTransType1Value() {
        return transType1Value;
    }

    public void setTransType1Addvalue(Double transType1Addvalue) {
        this.transType1Addvalue = transType1Addvalue;
    }

    public Double getTransType1Addvalue() {
        return transType1Addvalue;
    }

    public void setTransType1Amount(Double transType1Amount) {
        this.transType1Amount = transType1Amount;
    }

    public Double getTransType1Amount() {
        return transType1Amount;
    }

    public void setTransType2Value(Double transType2Value) {
        this.transType2Value = transType2Value;
    }

    public Double getTransType2Value() {
        return transType2Value;
    }

    public void setTransType2Addvalue(Double transType2Addvalue) {
        this.transType2Addvalue = transType2Addvalue;
    }

    public Double getTransType2Addvalue() {
        return transType2Addvalue;
    }

    public void setTransType2Amount(Double transType2Amount) {
        this.transType2Amount = transType2Amount;
    }

    public Double getTransType2Amount() {
        return transType2Amount;
    }

    public void setTransType3Value(Double transType3Value) {
        this.transType3Value = transType3Value;
    }

    public Double getTransType3Value() {
        return transType3Value;
    }

    public void setTransType3Addvalue(Double transType3Addvalue) {
        this.transType3Addvalue = transType3Addvalue;
    }

    public Double getTransType3Addvalue() {
        return transType3Addvalue;
    }

    public void setTransType3Amount(Double transType3Amount) {
        this.transType3Amount = transType3Amount;
    }

    public Double getTransType3Amount() {
        return transType3Amount;
    }

    public void setTransType4Value(Double transType4Value) {
        this.transType4Value = transType4Value;
    }

    public Double getTransType4Value() {
        return transType4Value;
    }

    public void setTransType4Addvalue(Double transType4Addvalue) {
        this.transType4Addvalue = transType4Addvalue;
    }

    public Double getTransType4Addvalue() {
        return transType4Addvalue;
    }

    public void setTransType4Amount(Double transType4Amount) {
        this.transType4Amount = transType4Amount;
    }

    public Double getTransType4Amount() {
        return transType4Amount;
    }

    public void setTransType5Value(Double transType5Value) {
        this.transType5Value = transType5Value;
    }

    public Double getTransType5Value() {
        return transType5Value;
    }

    public void setTransType5Addvalue(Double transType5Addvalue) {
        this.transType5Addvalue = transType5Addvalue;
    }

    public Double getTransType5Addvalue() {
        return transType5Addvalue;
    }

    public void setTransType5Amount(Double transType5Amount) {
        this.transType5Amount = transType5Amount;
    }

    public Double getTransType5Amount() {
        return transType5Amount;
    }

    public void setTransType6Value(Double transType6Value) {
        this.transType6Value = transType6Value;
    }

    public Double getTransType6Value() {
        return transType6Value;
    }

    public void setTransType6Addvalue(Double transType6Addvalue) {
        this.transType6Addvalue = transType6Addvalue;
    }

    public Double getTransType6Addvalue() {
        return transType6Addvalue;
    }

    public void setTransType6Amount(Double transType6Amount) {
        this.transType6Amount = transType6Amount;
    }

    public Double getTransType6Amount() {
        return transType6Amount;
    }

    public void setTransType7Value(Double transType7Value) {
        this.transType7Value = transType7Value;
    }

    public Double getTransType7Value() {
        return transType7Value;
    }

    public void setTransType7Addvalue(Double transType7Addvalue) {
        this.transType7Addvalue = transType7Addvalue;
    }

    public Double getTransType7Addvalue() {
        return transType7Addvalue;
    }

    public void setTransType7Amount(Double transType7Amount) {
        this.transType7Amount = transType7Amount;
    }

    public Double getTransType7Amount() {
        return transType7Amount;
    }

    public void setSaleType(Long saleType) {
        this.saleType = saleType;
    }

    public Long getSaleType() {
        return saleType;
    }

    public void setBuyType(Long buyType) {
        this.buyType = buyType;
    }

    public Long getBuyType() {
        return buyType;
    }

    public void setBuySubtype(Long buySubtype) {
        this.buySubtype = buySubtype;
    }

    public Long getBuySubtype() {
        return buySubtype;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponUseTime(Date couponUseTime) {
        this.couponUseTime = couponUseTime;
    }

    public Date getCouponUseTime() {
        return couponUseTime;
    }

    public void setTransType(Long transType) {
        this.transType = transType;
    }

    public Long getTransType() {
        return transType;
    }

    public void setTransSubtype(String transSubtype) {
        this.transSubtype = transSubtype;
    }

    public String getTransSubtype() {
        return transSubtype;
    }

    public void setTransContact(String transContact) {
        this.transContact = transContact;
    }

    public String getTransContact() {
        return transContact;
    }

    public void setTransInfo(String transInfo) {
        this.transInfo = transInfo;
    }

    public String getTransInfo() {
        return transInfo;
    }

    public void setTransAddress(String transAddress) {
        this.transAddress = transAddress;
    }

    public String getTransAddress() {
        return transAddress;
    }

    public void setTransPostalCode(String transPostalCode) {
        this.transPostalCode = transPostalCode;
    }

    public String getTransPostalCode() {
        return transPostalCode;
    }

    public void setTransCountry(String transCountry) {
        this.transCountry = transCountry;
    }

    public String getTransCountry() {
        return transCountry;
    }

    public void setTransProvince(String transProvince) {
        this.transProvince = transProvince;
    }

    public String getTransProvince() {
        return transProvince;
    }

    public void setTransCity(String transCity) {
        this.transCity = transCity;
    }

    public String getTransCity() {
        return transCity;
    }

    public void setTransUsrName(String transUsrName) {
        this.transUsrName = transUsrName;
    }

    public String getTransUsrName() {
        return transUsrName;
    }

    public void setTransUsrPhone(String transUsrPhone) {
        this.transUsrPhone = transUsrPhone;
    }

    public String getTransUsrPhone() {
        return transUsrPhone;
    }

    public void setTransAmount(Double transAmount) {
        this.transAmount = transAmount;
    }

    public Double getTransAmount() {
        return transAmount;
    }

    public void setRebateAmount(Double rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public Double getRebateAmount() {
        return rebateAmount;
    }

    public void setGroupbuyAmount(Double groupbuyAmount) {
        this.groupbuyAmount = groupbuyAmount;
    }

    public Double getGroupbuyAmount() {
        return groupbuyAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setReleaseAmount(Double releaseAmount) {
        this.releaseAmount = releaseAmount;
    }

    public Double getReleaseAmount() {
        return releaseAmount;
    }

    public void setOrderPaymentid(Long orderPaymentid) {
        this.orderPaymentid = orderPaymentid;
    }

    public Long getOrderPaymentid() {
        return orderPaymentid;
    }

    public void setOrderRefundid(Long orderRefundid) {
        this.orderRefundid = orderRefundid;
    }

    public Long getOrderRefundid() {
        return orderRefundid;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setBankpayActiveTime(Date bankpayActiveTime) {
        this.bankpayActiveTime = bankpayActiveTime;
    }

    public Date getBankpayActiveTime() {
        return bankpayActiveTime;
    }

    public void setPostpayActiveTime(Date postpayActiveTime) {
        this.postpayActiveTime = postpayActiveTime;
    }

    public Date getPostpayActiveTime() {
        return postpayActiveTime;
    }

    public void setSellerModifyTime(Date sellerModifyTime) {
        this.sellerModifyTime = sellerModifyTime;
    }

    public Date getSellerModifyTime() {
        return sellerModifyTime;
    }

    public void setBuyerModifyTime(Date buyerModifyTime) {
        this.buyerModifyTime = buyerModifyTime;
    }

    public Date getBuyerModifyTime() {
        return buyerModifyTime;
    }

    public void setBuyerRequestTime(Date buyerRequestTime) {
        this.buyerRequestTime = buyerRequestTime;
    }

    public Date getBuyerRequestTime() {
        return buyerRequestTime;
    }

    public void setSellerRespondTime(Date sellerRespondTime) {
        this.sellerRespondTime = sellerRespondTime;
    }

    public Date getSellerRespondTime() {
        return sellerRespondTime;
    }

    public void setBuyerPayTime(Date buyerPayTime) {
        this.buyerPayTime = buyerPayTime;
    }

    public Date getBuyerPayTime() {
        return buyerPayTime;
    }

    public void setBuyerReleaseTime(Date buyerReleaseTime) {
        this.buyerReleaseTime = buyerReleaseTime;
    }

    public Date getBuyerReleaseTime() {
        return buyerReleaseTime;
    }

    public void setSellerShipTime(Date sellerShipTime) {
        this.sellerShipTime = sellerShipTime;
    }

    public Date getSellerShipTime() {
        return sellerShipTime;
    }

    public void setOrderTerminalTime(Date orderTerminalTime) {
        this.orderTerminalTime = orderTerminalTime;
    }

    public Date getOrderTerminalTime() {
        return orderTerminalTime;
    }

    public void setOrderActiveTime(Date orderActiveTime) {
        this.orderActiveTime = orderActiveTime;
    }

    public Date getOrderActiveTime() {
        return orderActiveTime;
    }

    public void setBuyerRefundTime(Date buyerRefundTime) {
        this.buyerRefundTime = buyerRefundTime;
    }

    public Date getBuyerRefundTime() {
        return buyerRefundTime;
    }

    public void setRefundActiveTime(Date refundActiveTime) {
        this.refundActiveTime = refundActiveTime;
    }

    public Date getRefundActiveTime() {
        return refundActiveTime;
    }

    public void setOrderDeleted(Long orderDeleted) {
        this.orderDeleted = orderDeleted;
    }

    public Long getOrderDeleted() {
        return orderDeleted;
    }

    public void setBuyerFeedback(Long buyerFeedback) {
        this.buyerFeedback = buyerFeedback;
    }

    public Long getBuyerFeedback() {
        return buyerFeedback;
    }

    public void setBuyerFeedbackTime(Date buyerFeedbackTime) {
        this.buyerFeedbackTime = buyerFeedbackTime;
    }

    public Date getBuyerFeedbackTime() {
        return buyerFeedbackTime;
    }

    public void setSellerFeedback(Long sellerFeedback) {
        this.sellerFeedback = sellerFeedback;
    }

    public Long getSellerFeedback() {
        return sellerFeedback;
    }

    public void setSellerFeedbackTime(Date sellerFeedbackTime) {
        this.sellerFeedbackTime = sellerFeedbackTime;
    }

    public Date getSellerFeedbackTime() {
        return sellerFeedbackTime;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() {
        return orderStatus;
    }

    public void setOrderSubstatus(Long orderSubstatus) {
        this.orderSubstatus = orderSubstatus;
    }

    public Long getOrderSubstatus() {
        return orderSubstatus;
    }

    public void setBuyerNote(String buyerNote) {
        this.buyerNote = buyerNote;
    }

    public String getBuyerNote() {
        return buyerNote;
    }

    public void setBuyerNoteTime(Date buyerNoteTime) {
        this.buyerNoteTime = buyerNoteTime;
    }

    public Date getBuyerNoteTime() {
        return buyerNoteTime;
    }

    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    public String getSellerNote() {
        return sellerNote;
    }

    public void setSellerNoteTime(Date sellerNoteTime) {
        this.sellerNoteTime = sellerNoteTime;
    }

    public Date getSellerNoteTime() {
        return sellerNoteTime;
    }

    public void setCancelType(Long cancelType) {
        this.cancelType = cancelType;
    }

    public Long getCancelType() {
        return cancelType;
    }

    public void setCancelNote(String cancelNote) {
        this.cancelNote = cancelNote;
    }

    public String getCancelNote() {
        return cancelNote;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setRequestCsStatus(Long requestCsStatus) {
        this.requestCsStatus = requestCsStatus;
    }

    public Long getRequestCsStatus() {
        return requestCsStatus;
    }

    public void setRequestCsTime(Date requestCsTime) {
        this.requestCsTime = requestCsTime;
    }

    public Date getRequestCsTime() {
        return requestCsTime;
    }

    public void setFreezeStatus(Long freezeStatus) {
        this.freezeStatus = freezeStatus;
    }

    public Long getFreezeStatus() {
        return freezeStatus;
    }

    public void setFreezeStartTime(Date freezeStartTime) {
        this.freezeStartTime = freezeStartTime;
    }

    public Date getFreezeStartTime() {
        return freezeStartTime;
    }

    public void setFreezeCancelTime(Date freezeCancelTime) {
        this.freezeCancelTime = freezeCancelTime;
    }

    public Date getFreezeCancelTime() {
        return freezeCancelTime;
    }

    public void setPaymentNotifyEmail(Long paymentNotifyEmail) {
        this.paymentNotifyEmail = paymentNotifyEmail;
    }

    public Long getPaymentNotifyEmail() {
        return paymentNotifyEmail;
    }

    public void setPaymentCloseEmail(Long paymentCloseEmail) {
        this.paymentCloseEmail = paymentCloseEmail;
    }

    public Long getPaymentCloseEmail() {
        return paymentCloseEmail;
    }

    public void setShipitemNotifyEmail(Long shipitemNotifyEmail) {
        this.shipitemNotifyEmail = shipitemNotifyEmail;
    }

    public Long getShipitemNotifyEmail() {
        return shipitemNotifyEmail;
    }

    public void setReleaseNotifyEmail1(Long releaseNotifyEmail1) {
        this.releaseNotifyEmail1 = releaseNotifyEmail1;
    }

    public Long getReleaseNotifyEmail1() {
        return releaseNotifyEmail1;
    }

    public void setReleaseNotifyEmail2(Long releaseNotifyEmail2) {
        this.releaseNotifyEmail2 = releaseNotifyEmail2;
    }

    public Long getReleaseNotifyEmail2() {
        return releaseNotifyEmail2;
    }

    public void setReleaseNotifyEmail3(Long releaseNotifyEmail3) {
        this.releaseNotifyEmail3 = releaseNotifyEmail3;
    }

    public Long getReleaseNotifyEmail3() {
        return releaseNotifyEmail3;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setCreateSpId(Long createSpId) {
        this.createSpId = createSpId;
    }

    public Long getCreateSpId() {
        return createSpId;
    }

    public void setBuyerIpAddr(String buyerIpAddr) {
        this.buyerIpAddr = buyerIpAddr;
    }

    public String getBuyerIpAddr() {
        return buyerIpAddr;
    }

    public void setBuyerHdId(String buyerHdId) {
        this.buyerHdId = buyerHdId;
    }

    public String getBuyerHdId() {
        return buyerHdId;
    }

    public void setBuyerCpuId(String buyerCpuId) {
        this.buyerCpuId = buyerCpuId;
    }

    public String getBuyerCpuId() {
        return buyerCpuId;
    }

    public void setBuyerMacId(String buyerMacId) {
        this.buyerMacId = buyerMacId;
    }

    public String getBuyerMacId() {
        return buyerMacId;
    }

    public void setBuyerCookieInfo(String buyerCookieInfo) {
        this.buyerCookieInfo = buyerCookieInfo;
    }

    public String getBuyerCookieInfo() {
        return buyerCookieInfo;
    }

    public void setSellerIpAddr(String sellerIpAddr) {
        this.sellerIpAddr = sellerIpAddr;
    }

    public String getSellerIpAddr() {
        return sellerIpAddr;
    }

    public void setSellerHdId(String sellerHdId) {
        this.sellerHdId = sellerHdId;
    }

    public String getSellerHdId() {
        return sellerHdId;
    }

    public void setSellerCpuId(String sellerCpuId) {
        this.sellerCpuId = sellerCpuId;
    }

    public String getSellerCpuId() {
        return sellerCpuId;
    }

    public void setSellerMacId(String sellerMacId) {
        this.sellerMacId = sellerMacId;
    }

    public String getSellerMacId() {
        return sellerMacId;
    }

    public void setSellerCookieInfo(String sellerCookieInfo) {
        this.sellerCookieInfo = sellerCookieInfo;
    }

    public String getSellerCookieInfo() {
        return sellerCookieInfo;
    }

    public void setTransWebsite(String transWebsite) {
        this.transWebsite = transWebsite;
    }

    public String getTransWebsite() {
        return transWebsite;
    }

    public void setBuyerNote2(String buyerNote2) {
        this.buyerNote2 = buyerNote2;
    }

    public String getBuyerNote2() {
        return buyerNote2;
    }

    public void setBuyerNote2Time(Date buyerNote2Time) {
        this.buyerNote2Time = buyerNote2Time;
    }

    public Date getBuyerNote2Time() {
        return buyerNote2Time;
    }

    public void setSellerNote2(String sellerNote2) {
        this.sellerNote2 = sellerNote2;
    }

    public String getSellerNote2() {
        return sellerNote2;
    }

    public void setSellerNote2Time(Date sellerNote2Time) {
        this.sellerNote2Time = sellerNote2Time;
    }

    public Date getSellerNote2Time() {
        return sellerNote2Time;
    }

    public void setFeedbackInvokeStatus(Long feedbackInvokeStatus) {
        this.feedbackInvokeStatus = feedbackInvokeStatus;
    }

    public Long getFeedbackInvokeStatus() {
        return feedbackInvokeStatus;
    }

    public void setPointInvokeStatus(Long pointInvokeStatus) {
        this.pointInvokeStatus = pointInvokeStatus;
    }

    public Long getPointInvokeStatus() {
        return pointInvokeStatus;
    }

    public void setMerchantOrder(String merchantOrder) {
        this.merchantOrder = merchantOrder;
    }

    public String getMerchantOrder() {
        return merchantOrder;
    }

    public void setMerchantUsrName(String merchantUsrName) {
        this.merchantUsrName = merchantUsrName;
    }

    public String getMerchantUsrName() {
        return merchantUsrName;
    }

    public void setMerchantUsrEmail(String merchantUsrEmail) {
        this.merchantUsrEmail = merchantUsrEmail;
    }

    public String getMerchantUsrEmail() {
        return merchantUsrEmail;
    }

    public void setMerchantBackurl(String merchantBackurl) {
        this.merchantBackurl = merchantBackurl;
    }

    public String getMerchantBackurl() {
        return merchantBackurl;
    }

    public void setMerchantDate(String merchantDate) {
        this.merchantDate = merchantDate;
    }

    public String getMerchantDate() {
        return merchantDate;
    }

    public void setMerchantRespondStatus(Long merchantRespondStatus) {
        this.merchantRespondStatus = merchantRespondStatus;
    }

    public Long getMerchantRespondStatus() {
        return merchantRespondStatus;
    }

    public void setChargesAmount(Double chargesAmount) {
        this.chargesAmount = chargesAmount;
    }

    public Double getChargesAmount() {
        return chargesAmount;
    }

    public void setSearchSite(Long searchSite) {
        this.searchSite = searchSite;
    }

    public Long getSearchSite() {
        return searchSite;
    }

    public void setPrdCategory(String prdCategory) {
        this.prdCategory = prdCategory;
    }

    public String getPrdCategory() {
        return prdCategory;
    }

    public void setPrdItemId(String prdItemId) {
        this.prdItemId = prdItemId;
    }

    public String getPrdItemId() {
        return prdItemId;
    }

    public void setPrdCurrency(String prdCurrency) {
        this.prdCurrency = prdCurrency;
    }

    public String getPrdCurrency() {
        return prdCurrency;
    }

    public void setPrdSalPrice(Double prdSalPrice) {
        this.prdSalPrice = prdSalPrice;
    }

    public Double getPrdSalPrice() {
        return prdSalPrice;
    }

    public void setPrdSalShippingFee(Double prdSalShippingFee) {
        this.prdSalShippingFee = prdSalShippingFee;
    }

    public Double getPrdSalShippingFee() {
        return prdSalShippingFee;
    }

    public void setPartnerStatus(Long partnerStatus) {
        this.partnerStatus = partnerStatus;
    }

    public Long getPartnerStatus() {
        return partnerStatus;
    }

    public void setPartnerConfirmTime(Date partnerConfirmTime) {
        this.partnerConfirmTime = partnerConfirmTime;
    }

    public Date getPartnerConfirmTime() {
        return partnerConfirmTime;
    }

    public void setPartnerConfirmNote(String partnerConfirmNote) {
        this.partnerConfirmNote = partnerConfirmNote;
    }

    public String getPartnerConfirmNote() {
        return partnerConfirmNote;
    }

    public void setPartnerPurchaseTime(Date partnerPurchaseTime) {
        this.partnerPurchaseTime = partnerPurchaseTime;
    }

    public Date getPartnerPurchaseTime() {
        return partnerPurchaseTime;
    }

    public void setPartnerPurchaseNote(String partnerPurchaseNote) {
        this.partnerPurchaseNote = partnerPurchaseNote;
    }

    public String getPartnerPurchaseNote() {
        return partnerPurchaseNote;
    }

    public void setPartnerShippingTime(Date partnerShippingTime) {
        this.partnerShippingTime = partnerShippingTime;
    }

    public Date getPartnerShippingTime() {
        return partnerShippingTime;
    }

    public void setPartnerShippingNote(String partnerShippingNote) {
        this.partnerShippingNote = partnerShippingNote;
    }

    public String getPartnerShippingNote() {
        return partnerShippingNote;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return orderType;
    }

    public void setCheckoutMerchantPrivsId(Long checkoutMerchantPrivsId) {
        this.checkoutMerchantPrivsId = checkoutMerchantPrivsId;
    }

    public Long getCheckoutMerchantPrivsId() {
        return checkoutMerchantPrivsId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setInvoiceInUse(Long invoiceInUse) {
        this.invoiceInUse = invoiceInUse;
    }

    public Long getInvoiceInUse() {
        return invoiceInUse;
    }

    public void setDeliverTime(Long deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Long getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverConfimFlag(Long deliverConfimFlag) {
        this.deliverConfimFlag = deliverConfimFlag;
    }

    public Long getDeliverConfimFlag() {
        return deliverConfimFlag;
    }

    public void setPostofficeId(Long postofficeId) {
        this.postofficeId = postofficeId;
    }

    public Long getPostofficeId() {
        return postofficeId;
    }

    public void setPostofficeName(String postofficeName) {
        this.postofficeName = postofficeName;
    }

    public String getPostofficeName() {
        return postofficeName;
    }

    public void setPayedAmount(Double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public Double getPayedAmount() {
        return payedAmount;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelAreaCode(String telAreaCode) {
        this.telAreaCode = telAreaCode;
    }

    public String getTelAreaCode() {
        return telAreaCode;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setReferTransAmount(Double referTransAmount) {
        this.referTransAmount = referTransAmount;
    }

    public Double getReferTransAmount() {
        return referTransAmount;
    }

    public void setActualTransAmount(Double actualTransAmount) {
        this.actualTransAmount = actualTransAmount;
    }

    public Double getActualTransAmount() {
        return actualTransAmount;
    }

    public void setUsedpoint(Long usedpoint) {
        this.usedpoint = usedpoint;
    }

    public Long getUsedpoint() {
        return usedpoint;
    }

    public void setUsedpointtype(Long usedpointtype) {
        this.usedpointtype = usedpointtype;
    }

    public Long getUsedpointtype() {
        return usedpointtype;
    }

    public void setCoupontype(Long coupontype) {
        this.coupontype = coupontype;
    }

    public Long getCoupontype() {
        return coupontype;
    }

    public void setUsedpointamount(Double usedpointamount) {
        this.usedpointamount = usedpointamount;
    }

    public Double getUsedpointamount() {
        return usedpointamount;
    }

    public void setReserveFlag(Long reserveFlag) {
        this.reserveFlag = reserveFlag;
    }

    public Long getReserveFlag() {
        return reserveFlag;
    }

    public void setPaymentStartTime(Date paymentStartTime) {
        this.paymentStartTime = paymentStartTime;
    }

    public Date getPaymentStartTime() {
        return paymentStartTime;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointWebsite(String pointWebsite) {
        this.pointWebsite = pointWebsite;
    }

    public String getPointWebsite() {
        return pointWebsite;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setExtraReceiveInvoice(String extraReceiveInvoice) {
        this.extraReceiveInvoice = extraReceiveInvoice;
    }

    public String getExtraReceiveInvoice() {
        return extraReceiveInvoice;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceTel(String invoiceTel) {
        this.invoiceTel = invoiceTel;
    }

    public String getInvoiceTel() {
        return invoiceTel;
    }

    public void setInvoiceMobile(String invoiceMobile) {
        this.invoiceMobile = invoiceMobile;
    }

    public String getInvoiceMobile() {
        return invoiceMobile;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoicePostcode(String invoicePostcode) {
        this.invoicePostcode = invoicePostcode;
    }

    public String getInvoicePostcode() {
        return invoicePostcode;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerPostCode(String buyerPostCode) {
        this.buyerPostCode = buyerPostCode;
    }

    public String getBuyerPostCode() {
        return buyerPostCode;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setTransProvinceCode(String transProvinceCode) {
        this.transProvinceCode = transProvinceCode;
    }

    public String getTransProvinceCode() {
        return transProvinceCode;
    }

    public void setTransCityCode(String transCityCode) {
        this.transCityCode = transCityCode;
    }

    public String getTransCityCode() {
        return transCityCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setPromotionTicket(String promotionTicket) {
        this.promotionTicket = promotionTicket;
    }

    public String getPromotionTicket() {
        return promotionTicket;
    }

    public void setSupportedBuyType(String supportedBuyType) {
        this.supportedBuyType = supportedBuyType;
    }

    public String getSupportedBuyType() {
        return supportedBuyType;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setCardCashPay(BigDecimal cardCashPay) {
        this.cardCashPay = cardCashPay;
    }

    public BigDecimal getCardCashPay() {
        return cardCashPay;
    }

    public void setInvoiceRequired(String invoiceRequired) {
        this.invoiceRequired = invoiceRequired;
    }

    public String getInvoiceRequired() {
        return invoiceRequired;
    }

    public void setInvoiceType2(String invoiceType2) {
        this.invoiceType2 = invoiceType2;
    }

    public String getInvoiceType2() {
        return invoiceType2;
    }

    public void setInvoiceByDetail(String invoiceByDetail) {
        this.invoiceByDetail = invoiceByDetail;
    }

    public String getInvoiceByDetail() {
        return invoiceByDetail;
    }

    public void setInvoiceTaxCompany(String invoiceTaxCompany) {
        this.invoiceTaxCompany = invoiceTaxCompany;
    }

    public String getInvoiceTaxCompany() {
        return invoiceTaxCompany;
    }

    public void setInvoiceTaxRegNo(String invoiceTaxRegNo) {
        this.invoiceTaxRegNo = invoiceTaxRegNo;
    }

    public String getInvoiceTaxRegNo() {
        return invoiceTaxRegNo;
    }

    public void setInvoiceTaxRegAddr(String invoiceTaxRegAddr) {
        this.invoiceTaxRegAddr = invoiceTaxRegAddr;
    }

    public String getInvoiceTaxRegAddr() {
        return invoiceTaxRegAddr;
    }

    public void setInvoiceTaxRegTel(String invoiceTaxRegTel) {
        this.invoiceTaxRegTel = invoiceTaxRegTel;
    }

    public String getInvoiceTaxRegTel() {
        return invoiceTaxRegTel;
    }

    public void setInvoiceTaxRegBank(String invoiceTaxRegBank) {
        this.invoiceTaxRegBank = invoiceTaxRegBank;
    }

    public String getInvoiceTaxRegBank() {
        return invoiceTaxRegBank;
    }

    public void setInvoiceTaxRegAcc(String invoiceTaxRegAcc) {
        this.invoiceTaxRegAcc = invoiceTaxRegAcc;
    }

    public String getInvoiceTaxRegAcc() {
        return invoiceTaxRegAcc;
    }

    public void setInvoiceIssueStatus(Long invoiceIssueStatus) {
        this.invoiceIssueStatus = invoiceIssueStatus;
    }

    public Long getInvoiceIssueStatus() {
        return invoiceIssueStatus;
    }

    public void setInvoiceReissueTimes(Long invoiceReissueTimes) {
        this.invoiceReissueTimes = invoiceReissueTimes;
    }

    public Long getInvoiceReissueTimes() {
        return invoiceReissueTimes;
    }

    public void setInvoiceReissueTime(Date invoiceReissueTime) {
        this.invoiceReissueTime = invoiceReissueTime;
    }

    public Date getInvoiceReissueTime() {
        return invoiceReissueTime;
    }

    public void setInvoiceDupIssueTimes(Long invoiceDupIssueTimes) {
        this.invoiceDupIssueTimes = invoiceDupIssueTimes;
    }

    public Long getInvoiceDupIssueTimes() {
        return invoiceDupIssueTimes;
    }

    public void setInvoiceDupIssueTime(Date invoiceDupIssueTime) {
        this.invoiceDupIssueTime = invoiceDupIssueTime;
    }

    public Date getInvoiceDupIssueTime() {
        return invoiceDupIssueTime;
    }

    public void setInvoiceStatusLocked(String invoiceStatusLocked) {
        this.invoiceStatusLocked = invoiceStatusLocked;
    }

    public String getInvoiceStatusLocked() {
        return invoiceStatusLocked;
    }

    public void setInvoiceStatusLockedTime(Date invoiceStatusLockedTime) {
        this.invoiceStatusLockedTime = invoiceStatusLockedTime;
    }

    public Date getInvoiceStatusLockedTime() {
        return invoiceStatusLockedTime;
    }

    public void setInvoiceType(Long invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Long getInvoiceType() {
        return invoiceType;
    }

    public void setInvoicePostType(Long invoicePostType) {
        this.invoicePostType = invoicePostType;
    }

    public Long getInvoicePostType() {
        return invoicePostType;
    }

    public void setServiceFee(Double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Double getServiceFee() {
        return serviceFee;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }


    public static BaseOrder assetMockInstance() {
        BaseOrder obj = new BaseOrder();
        obj.setEscOrderid("escOrderid");
        obj.setSellerOnlyid(1L);
        obj.setSellerLoginid("sellerLoginid");
        obj.setBuyerOnlyid(1L);
        obj.setBuyerLoginid("buyerLoginid");
        obj.setProductSerial(1L);
        obj.setProductId(1L);
        obj.setProductVersion(1L);
        obj.setProductClassid(1L);
        obj.setProductInfo("productInfo");
        obj.setProductPic("productPic");
        obj.setProductPrice(1.0);
        obj.setProductNum(1L);
        obj.setProductAmount(1.0);
        obj.setProductPointStatus(1L);
        obj.setProductCouponStatus(1L);
        obj.setTradeDesc("tradeDesc");
        obj.setTransType1Value(1.0);
        obj.setTransType1Addvalue(1.0);
        obj.setTransType1Amount(1.0);
        obj.setTransType2Value(1.0);
        obj.setTransType2Addvalue(1.0);
        obj.setTransType2Amount(1.0);
        obj.setTransType3Value(1.0);
        obj.setTransType3Addvalue(1.0);
        obj.setTransType3Amount(1.0);
        obj.setTransType4Value(1.0);
        obj.setTransType4Addvalue(1.0);
        obj.setTransType4Amount(1.0);
        obj.setTransType5Value(1.0);
        obj.setTransType5Addvalue(1.0);
        obj.setTransType5Amount(1.0);
        obj.setTransType6Value(1.0);
        obj.setTransType6Addvalue(1.0);
        obj.setTransType6Amount(1.0);
        obj.setTransType7Value(1.0);
        obj.setTransType7Addvalue(1.0);
        obj.setTransType7Amount(1.0);
        obj.setSaleType(1L);
        obj.setBuyType(1L);
        obj.setBuySubtype(1L);
        obj.setCouponId("couponId");
        obj.setCouponAmount(1.0);
        obj.setCouponUseTime(new Date());
        obj.setTransType(1L);
        obj.setTransSubtype("transSubtype");
        obj.setTransContact("transContact");
        obj.setTransInfo("transInfo");
        obj.setTransAddress("transAddress");
        obj.setTransPostalCode("transPostalCode");
        obj.setTransCountry("transCountry");
        obj.setTransProvince("transProvince");
        obj.setTransCity("transCity");
        obj.setTransUsrName("transUsrName");
        obj.setTransUsrPhone("transUsrPhone");
        obj.setTransAmount(1.0);
        obj.setRebateAmount(1.0);
        obj.setGroupbuyAmount(1.0);
        obj.setOrderAmount(1.0);
        obj.setPaymentAmount(1.0);
        obj.setRefundAmount(1.0);
        obj.setReleaseAmount(1.0);
        obj.setOrderPaymentid(1L);
        obj.setOrderRefundid(1L);
        obj.setOrderCreateTime(new Date());
        obj.setBankpayActiveTime(new Date());
        obj.setPostpayActiveTime(new Date());
        obj.setSellerModifyTime(new Date());
        obj.setBuyerModifyTime(new Date());
        obj.setBuyerRequestTime(new Date());
        obj.setSellerRespondTime(new Date());
        obj.setBuyerPayTime(new Date());
        obj.setBuyerReleaseTime(new Date());
        obj.setSellerShipTime(new Date());
        obj.setOrderTerminalTime(new Date());
        obj.setOrderActiveTime(new Date());
        obj.setBuyerRefundTime(new Date());
        obj.setRefundActiveTime(new Date());
        obj.setOrderDeleted(1L);
        obj.setBuyerFeedback(1L);
        obj.setBuyerFeedbackTime(new Date());
        obj.setSellerFeedback(1L);
        obj.setSellerFeedbackTime(new Date());
        obj.setOrderStatus(1L);
        obj.setOrderSubstatus(1L);
        obj.setBuyerNote("buyerNote");
        obj.setBuyerNoteTime(new Date());
        obj.setSellerNote("sellerNote");
        obj.setSellerNoteTime(new Date());
        obj.setCancelType(1L);
        obj.setCancelNote("cancelNote");
        obj.setCancelTime(new Date());
        obj.setRequestCsStatus(1L);
        obj.setRequestCsTime(new Date());
        obj.setFreezeStatus(1L);
        obj.setFreezeStartTime(new Date());
        obj.setFreezeCancelTime(new Date());
        obj.setPaymentNotifyEmail(1L);
        obj.setPaymentCloseEmail(1L);
        obj.setShipitemNotifyEmail(1L);
        obj.setReleaseNotifyEmail1(1L);
        obj.setReleaseNotifyEmail2(1L);
        obj.setReleaseNotifyEmail3(1L);
        obj.setUpdateTime(new Date());
        obj.setCreateSpId(1L);
        obj.setBuyerIpAddr("buyerIpAddr");
        obj.setBuyerHdId("buyerHdId");
        obj.setBuyerCpuId("buyerCpuId");
        obj.setBuyerMacId("buyerMacId");
        obj.setBuyerCookieInfo("buyerCookieInfo");
        obj.setSellerIpAddr("sellerIpAddr");
        obj.setSellerHdId("sellerHdId");
        obj.setSellerCpuId("sellerCpuId");
        obj.setSellerMacId("sellerMacId");
        obj.setSellerCookieInfo("sellerCookieInfo");
        obj.setTransWebsite("transWebsite");
        obj.setBuyerNote2("buyerNote2");
        obj.setBuyerNote2Time(new Date());
        obj.setSellerNote2("sellerNote2");
        obj.setSellerNote2Time(new Date());
        obj.setFeedbackInvokeStatus(1L);
        obj.setPointInvokeStatus(1L);
        obj.setMerchantOrder("merchantOrder");
        obj.setMerchantUsrName("merchantUsrName");
        obj.setMerchantUsrEmail("merchantUsrEmail");
        obj.setMerchantBackurl("merchantBackurl");
        obj.setMerchantDate("merchantDate");
        obj.setMerchantRespondStatus(1L);
        obj.setChargesAmount(1.0);
        obj.setSearchSite(1L);
        obj.setPrdCategory("prdCategory");
        obj.setPrdItemId("prdItemId");
        obj.setPrdCurrency("prdCurrency");
        obj.setPrdSalPrice(1.0);
        obj.setPrdSalShippingFee(1.0);
        obj.setPartnerStatus(1L);
        obj.setPartnerConfirmTime(new Date());
        obj.setPartnerConfirmNote("partnerConfirmNote");
        obj.setPartnerPurchaseTime(new Date());
        obj.setPartnerPurchaseNote("partnerPurchaseNote");
        obj.setPartnerShippingTime(new Date());
        obj.setPartnerShippingNote("partnerShippingNote");
        obj.setInvoiceTitle("invoiceTitle");
        obj.setInvoiceContent("invoiceContent");
        obj.setOrderType(1L);
        obj.setCheckoutMerchantPrivsId(1L);
        obj.setMerchantId(1L);
        obj.setInvoiceInUse(1L);
        obj.setDeliverTime(1L);
        obj.setDeliverConfimFlag(1L);
        obj.setPostofficeId(1L);
        obj.setPostofficeName("postofficeName");
        obj.setPayedAmount(1.0);
        obj.setArea("area");
        obj.setTelNumber("telNumber");
        obj.setTelAreaCode("telAreaCode");
        obj.setCostPrice(1.0);
        obj.setReferTransAmount(1.0);
        obj.setActualTransAmount(1.0);
        obj.setUsedpoint(1L);
        obj.setUsedpointtype(1L);
        obj.setCoupontype(1L);
        obj.setUsedpointamount(1.0);
        obj.setReserveFlag(1L);
        obj.setPaymentStartTime(new Date());
        obj.setPointName("pointName");
        obj.setPointWebsite("pointWebsite");
        obj.setRemark("remark");
        obj.setExtraReceiveInvoice("extraReceiveInvoice");
        obj.setInvoiceName("invoiceName");
        obj.setInvoiceTel("invoiceTel");
        obj.setInvoiceMobile("invoiceMobile");
        obj.setInvoiceAddress("invoiceAddress");
        obj.setInvoicePostcode("invoicePostcode");
        obj.setBuyerName("buyerName");
        obj.setBuyerPhone("buyerPhone");
        obj.setBuyerMobile("buyerMobile");
        obj.setBuyerEmail("buyerEmail");
        obj.setBuyerPostCode("buyerPostCode");
        obj.setBuyerAddress("buyerAddress");
        obj.setTransProvinceCode("transProvinceCode");
        obj.setTransCityCode("transCityCode");
        obj.setAreaCode("areaCode");
        obj.setPromotionTicket("promotionTicket");
        obj.setSupportedBuyType("supportedBuyType");
        obj.setDiscountAmount(1.0);
        obj.setPaymentDueDate(new Date());
        obj.setCardCashPay(BigDecimal.ONE);
        obj.setInvoiceRequired("invoiceRequired");
        obj.setInvoiceType2("invoiceType2");
        obj.setInvoiceByDetail("invoiceByDetail");
        obj.setInvoiceTaxCompany("invoiceTaxCompany");
        obj.setInvoiceTaxRegNo("invoiceTaxRegNo");
        obj.setInvoiceTaxRegAddr("invoiceTaxRegAddr");
        obj.setInvoiceTaxRegTel("invoiceTaxRegTel");
        obj.setInvoiceTaxRegBank("invoiceTaxRegBank");
        obj.setInvoiceTaxRegAcc("invoiceTaxRegAcc");
        obj.setInvoiceIssueStatus(1L);
        obj.setInvoiceReissueTimes(1L);
        obj.setInvoiceReissueTime(new Date());
        obj.setInvoiceDupIssueTimes(1L);
        obj.setInvoiceDupIssueTime(new Date());
        obj.setInvoiceStatusLocked("invoiceStatusLocked");
        obj.setInvoiceStatusLockedTime(new Date());
        obj.setInvoiceType(1L);
        obj.setInvoicePostType(1L);
        obj.setServiceFee(1.0);
        obj.setUpdateBy("updateBy");
        return obj;
    }


    public String getSellerNote3() {
        return sellerNote3;
    }

    public void setSellerNote3(String sellerNote3) {
        this.sellerNote3 = sellerNote3;
    }

    public String getSellerNote4() {
        return sellerNote4;
    }

    public void setSellerNote4(String sellerNote4) {
        this.sellerNote4 = sellerNote4;
    }

    public String getSellerNote5() {
        return sellerNote5;
    }

    public void setSellerNote5(String sellerNote5) {
        this.sellerNote5 = sellerNote5;
    }

    public String getSellerNote6() {
        return sellerNote6;
    }

    public void setSellerNote6(String sellerNote6) {
        this.sellerNote6 = sellerNote6;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public Integer getSettlementFlag() {
        return settlementFlag;
    }

    public void setSettlementFlag(Integer settlementFlag) {
        this.settlementFlag = settlementFlag;
    }

    public String toString() {
        return "[escOrderid=" + escOrderid
                + ",orderStatus=" + orderStatus
                + ",orderAmount=" + orderAmount
                + ",payedAmount=" + payedAmount
                + ",orderType=" + orderType
                + ",salesChannel=" + salesChannel
                + ",orderStatus=" + orderStatus
                + ",buyerOnlyid=" + buyerOnlyid
                + ",transUsrPhone=" + transUsrPhone
                + "]";

    }
}
