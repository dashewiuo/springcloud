package com.ule.emptyservice.module.entity;

import java.io.Serializable;
import java.util.Date;

public class CheckoutOrderPrd implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String productName;

    private Double salPrice;

    private Long productNum;


    private Date createTime;


    private Date updateTime;

    private String couponId;

    private Double couponAmount;


    private Date couponUseTime;

    private Long productCouponStatus;

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

    private Long productSerial;

    private Long productId;

    private Long productVersion;

    private Long productClassid;

    private String productPic;

    private Long productPointStatus;

    private Long createSpId;

    private Double transAmount;

    private String escOrderid;

    private Long itemId;

    private String itemNo;

    private Double itemMallPrice;

    private String skuDesc;

    private Long productStatus;

    private Long merchantId;

    private Long merchantOnlyid;

    private String merchantCnName;

    private String merchantEnName;

    private String merchantShopName;

    private String deleveryOrderId;

    private String content1;

    private String content2;

    private String content3;

    private Long buyerOnlyid;

    private String buyerLoginid;

    private String packageId;

    private Long listingId;

    private Long suitId;

    private Long isComment;

    private Double costPrice;


    private Date addGoodsTime;

    private Long coupontype;

    private Long usedpointtype;

    private Long usedpoint;

    private Double usedpointamount;

    private Long usedpointid;

    private Long storageId;

    private String storageName;

    private String storageAddress;

    private String storageCode;

    private String storageIntro;

    private Long single;

    private Double pointMulti;

    private String pointPlan;

    private String promotionIds;

    private Long getpoint;

    private String attributes;

    private String accountId;

    private Double accountCostPrice;

    private Double accountDifferential;

    private String accountComment;

    private String accountStatus;

    private String accountReceipt;

    private String productComment;

    private String nationalStdNumber;

    private Byte shipmentStatus;

    private String listNumer;

    private Double priceDiscount;

    private String prdType;

    private Byte listingType;

    private Short saleMode;

    private String designCode;

    private Double designFee;

    private String listPackageName;

    private Double profitrate;

    private Long feesponsor;

    private Long flag;

    //新增代购佣金部分

    private Double baseCommission;

    private Double extraCommission;

    private Double highCommission;

    private Double prdCommission;

    // 新加一个字段

    private Integer storeId;

    /**
     * 当购买的商品是电子期刊时候，保存电子周刊的有效期限
     */

    private String orderAttr;

    /**
     * 激动营销保存商品附件属性
     */

    private String itemAttr;

    /**
     * 物品快照信息
     */

    private String listingInfo;


    private Double originalSalPrice;


    private String itemUnit;


    private String merchantSku;


    private String listingTag;


    private String productClassidFlag;


    private Integer isemsFreight;


    private String activityCode;


    private String activityUniquene;


    private Double averagePriceDiscount;


    private Double discountBalance ;


    private Double commissionTicketPoint ;


    private Double commissionTaxPoint ;


    private Double commissionServiceCharge ;

    public CheckoutOrderPrd()
    {
        super();
    }

    // 拼接物品说明
    private String getItemDoc(String colorName, String specificationName)
    {
        StringBuilder str = new StringBuilder();
        if (colorName != null && !"".equals(colorName)) {
            str.append("颜色 ").append(": ").append(colorName);
        }
        // 设置物品规格
        if (specificationName != null && !"".equals(specificationName)) {
            if (!str.toString().equals(""))
                str.append("|.|");
            str.append("规格").append(": ").append(specificationName);
        }
        return str.toString();
    }

    public String getMerchantSku() {
        return merchantSku;
    }

    public void setMerchantSku(String merchantSku) {
        this.merchantSku = merchantSku;
    }

    public Integer getStoreId()
    {
        return storeId;
    }

    public void setStoreId(Integer storeId)
    {
        this.storeId = storeId;
    }

    public String getListNumer()
    {
        return listNumer;
    }

    public void setListNumer(String listNumer)
    {
        this.listNumer = listNumer;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getAccountComment()
    {
        return accountComment;
    }

    public void setAccountComment(String accountComment)
    {
        this.accountComment = accountComment;
    }

    public Double getAccountCostPrice()
    {
        return accountCostPrice;
    }

    public void setAccountCostPrice(Double accountCostPrice)
    {
        this.accountCostPrice = accountCostPrice;
    }

    public Double getAccountDifferential()
    {
        return accountDifferential;
    }

    public void setAccountDifferential(Double accountDifferential)
    {
        this.accountDifferential = accountDifferential;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public String getAccountReceipt()
    {
        return accountReceipt;
    }

    public void setAccountReceipt(String accountReceipt)
    {
        this.accountReceipt = accountReceipt;
    }

    public String getAccountStatus()
    {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus)
    {
        this.accountStatus = accountStatus;
    }

    public Date getAddGoodsTime()
    {
        return addGoodsTime;
    }

    public void setAddGoodsTime(Date addGoodsTime)
    {
        this.addGoodsTime = addGoodsTime;
    }

    public String getAttributes()
    {
        return attributes;
    }

    public void setAttributes(String attributes)
    {
        this.attributes = attributes;
    }

    public String getBuyerLoginid()
    {
        return buyerLoginid;
    }

    public void setBuyerLoginid(String buyerLoginid)
    {
        this.buyerLoginid = buyerLoginid;
    }

    public Long getBuyerOnlyid()
    {
        return buyerOnlyid;
    }

    public void setBuyerOnlyid(Long buyerOnlyid)
    {
        this.buyerOnlyid = buyerOnlyid;
    }

    public String getContent1()
    {
        return content1;
    }

    public void setContent1(String content1)
    {
        this.content1 = content1;
    }

    public String getContent2()
    {
        return content2;
    }

    public void setContent2(String content2)
    {
        this.content2 = content2;
    }

    public String getContent3()
    {
        return content3;
    }

    public void setContent3(String content3)
    {
        this.content3 = content3;
    }

    public Double getCostPrice()
    {
        return costPrice;
    }

    public void setCostPrice(Double costPrice)
    {
        this.costPrice = costPrice;
    }

    public Double getCouponAmount()
    {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount)
    {
        this.couponAmount = couponAmount;
    }

    public String getCouponId()
    {
        return couponId;
    }

    public void setCouponId(String couponId)
    {
        this.couponId = couponId;
    }

    public Date getCouponUseTime()
    {
        return couponUseTime;
    }

    public void setCouponUseTime(Date couponUseTime)
    {
        this.couponUseTime = couponUseTime;
    }

    public Long getCoupontype()
    {
        return coupontype;
    }

    public void setCoupontype(Long coupontype)
    {
        this.coupontype = coupontype;
    }

    public Long getCreateSpId()
    {
        return createSpId;
    }

    public void setCreateSpId(Long createSpId)
    {
        this.createSpId = createSpId;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public String getDeleveryOrderId()
    {
        return deleveryOrderId;
    }

    public void setDeleveryOrderId(String deleveryOrderId)
    {
        this.deleveryOrderId = deleveryOrderId;
    }

    public String getDesignCode()
    {
        return designCode;
    }

    public void setDesignCode(String designCode)
    {
        this.designCode = designCode;
    }

    public Double getDesignFee()
    {
        return designFee;
    }

    public void setDesignFee(Double designFee)
    {
        this.designFee = designFee;
    }

    public String getEscOrderid()
    {
        return escOrderid;
    }

    public void setEscOrderid(String escOrderid)
    {
        this.escOrderid = escOrderid;
    }

    public Long getFeesponsor()
    {
        return feesponsor;
    }

    public void setFeesponsor(Long feesponsor)
    {
        this.feesponsor = feesponsor;
    }

    public Long getFlag()
    {
        return flag;
    }

    public void setFlag(Long flag)
    {
        this.flag = flag;
    }

    public Long getGetpoint()
    {
        return getpoint;
    }

    public void setGetpoint(Long getpoint)
    {
        this.getpoint = getpoint;
    }

    public Long getIsComment()
    {
        return isComment;
    }

    public void setIsComment(Long isComment)
    {
        this.isComment = isComment;
    }

    public Long getItemId()
    {
        return itemId;
    }

    public void setItemId(Long itemId)
    {
        this.itemId = itemId;
    }

    public Double getItemMallPrice()
    {
        return itemMallPrice;
    }

    public void setItemMallPrice(Double itemMallPrice)
    {
        this.itemMallPrice = itemMallPrice;
    }

    public String getItemNo()
    {
        return itemNo;
    }

    public void setItemNo(String itemNo)
    {
        this.itemNo = itemNo;
    }

    public String getListNumber()
    {
        return listNumer;
    }

    public void setListNumber(String listNumber)
    {
        this.listNumer = listNumber;
    }

    public String getListPackageName()
    {
        return listPackageName;
    }

    public void setListPackageName(String listPackageName)
    {
        this.listPackageName = listPackageName;
    }

    public Long getListingId()
    {
        return listingId;
    }

    public void setListingId(Long listingId)
    {
        this.listingId = listingId;
    }

    public Byte getListingType()
    {
        return listingType;
    }

    public void setListingType(Byte listingType)
    {
        this.listingType = listingType;
    }

    public String getMerchantCnName()
    {
        return merchantCnName;
    }

    public void setMerchantCnName(String merchantCnName)
    {
        this.merchantCnName = merchantCnName;
    }

    public String getMerchantEnName()
    {
        return merchantEnName;
    }

    public void setMerchantEnName(String merchantEnName)
    {
        this.merchantEnName = merchantEnName;
    }

    public Long getMerchantId()
    {
        return merchantId;
    }

    public void setMerchantId(Long merchantId)
    {
        this.merchantId = merchantId;
    }

    public Long getMerchantOnlyid()
    {
        return merchantOnlyid;
    }

    public void setMerchantOnlyid(Long merchantOnlyid)
    {
        this.merchantOnlyid = merchantOnlyid;
    }

    public String getMerchantShopName()
    {
        return merchantShopName;
    }

    public void setMerchantShopName(String merchantShopName)
    {
        this.merchantShopName = merchantShopName;
    }

    public String getNationalStdNumber()
    {
        return nationalStdNumber;
    }

    public void setNationalStdNumber(String nationalStdNumber)
    {
        this.nationalStdNumber = nationalStdNumber;
    }

    public String getPackageId()
    {
        return packageId;
    }

    public void setPackageId(String packageId)
    {
        this.packageId = packageId;
    }

    public Double getPointMulti()
    {
        return pointMulti;
    }

    public void setPointMulti(Double pointMulti)
    {
        this.pointMulti = pointMulti;
    }

    public String getPointPlan()
    {
        return pointPlan;
    }

    public void setPointPlan(String pointPlan)
    {
        this.pointPlan = pointPlan;
    }

    public String getPrdType()
    {
        return prdType;
    }

    public void setPrdType(String prdType)
    {
        this.prdType = prdType;
    }

    public Double getPriceDiscount()
    {
        return priceDiscount;
    }

    public void setPriceDiscount(Double priceDiscount)
    {
        this.priceDiscount = priceDiscount;
    }

    public Long getProductClassid()
    {
        return productClassid;
    }

    public void setProductClassid(Long productClassid)
    {
        this.productClassid = productClassid;
    }

    public String getProductComment()
    {
        return productComment;
    }

    public void setProductComment(String productComment)
    {
        this.productComment = productComment;
    }

    public Long getProductCouponStatus()
    {
        return productCouponStatus;
    }

    public void setProductCouponStatus(Long productCouponStatus)
    {
        this.productCouponStatus = productCouponStatus;
    }

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId(Long productId)
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public Long getProductNum()
    {
        return productNum;
    }

    public void setProductNum(Long productNum)
    {
        this.productNum = productNum;
    }

    public String getProductPic()
    {
        return productPic;
    }

    public void setProductPic(String productPic)
    {
        this.productPic = productPic;
    }

    public Long getProductPointStatus()
    {
        return productPointStatus;
    }

    public void setProductPointStatus(Long productPointStatus)
    {
        this.productPointStatus = productPointStatus;
    }

    public Long getProductSerial()
    {
        return productSerial;
    }

    public void setProductSerial(Long productSerial)
    {
        this.productSerial = productSerial;
    }

    public Long getProductStatus()
    {
        return productStatus;
    }

    public void setProductStatus(Long productStatus)
    {
        this.productStatus = productStatus;
    }

    public Long getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion(Long productVersion)
    {
        this.productVersion = productVersion;
    }

    public Double getProfitrate()
    {
        return profitrate;
    }

    public void setProfitrate(Double profitrate)
    {
        this.profitrate = profitrate;
    }

    public String getPromotionIds()
    {
        return promotionIds;
    }

    public void setPromotionIds(String promotionIds)
    {
        this.promotionIds = promotionIds;
    }

    public Double getSalPrice()
    {
        return salPrice;
    }

    public void setSalPrice(Double salPrice)
    {
        this.salPrice = salPrice;
    }

    public Short getSaleMode()
    {
        return saleMode;
    }

    public void setSaleMode(Short saleMode)
    {
        this.saleMode = saleMode;
    }

    public Byte getShipmentStatus()
    {
        return shipmentStatus;
    }

    public void setShipmentStatus(Byte shipmentStatus)
    {
        this.shipmentStatus = shipmentStatus;
    }

    public Long getSingle()
    {
        return single;
    }

    public void setSingle(Long single)
    {
        this.single = single;
    }

    public String getSkuDesc()
    {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc)
    {
        this.skuDesc = skuDesc;
    }

    public String getStorageAddress()
    {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress)
    {
        this.storageAddress = storageAddress;
    }

    public String getStorageCode()
    {
        return storageCode;
    }

    public void setStorageCode(String storageCode)
    {
        this.storageCode = storageCode;
    }

    public Long getStorageId()
    {
        return storageId;
    }

    public void setStorageId(Long storageId)
    {
        this.storageId = storageId;
    }

    public String getStorageIntro()
    {
        return storageIntro;
    }

    public void setStorageIntro(String storageIntro)
    {
        this.storageIntro = storageIntro;
    }

    public String getStorageName()
    {
        return storageName;
    }

    public void setStorageName(String storageName)
    {
        this.storageName = storageName;
    }

    public Long getSuitId()
    {
        return suitId;
    }

    public void setSuitId(Long suitId)
    {
        this.suitId = suitId;
    }

    public Double getTransAmount()
    {
        return transAmount;
    }

    public void setTransAmount(Double transAmount)
    {
        this.transAmount = transAmount;
    }

    public Double getTransType1Addvalue()
    {
        return transType1Addvalue;
    }

    public void setTransType1Addvalue(Double transType1Addvalue)
    {
        this.transType1Addvalue = transType1Addvalue;
    }

    public Double getTransType1Amount()
    {
        return transType1Amount;
    }

    public void setTransType1Amount(Double transType1Amount)
    {
        this.transType1Amount = transType1Amount;
    }

    public Double getTransType1Value()
    {
        return transType1Value;
    }

    public void setTransType1Value(Double transType1Value)
    {
        this.transType1Value = transType1Value;
    }

    public Double getTransType2Addvalue()
    {
        return transType2Addvalue;
    }

    public void setTransType2Addvalue(Double transType2Addvalue)
    {
        this.transType2Addvalue = transType2Addvalue;
    }

    public Double getTransType2Amount()
    {
        return transType2Amount;
    }

    public void setTransType2Amount(Double transType2Amount)
    {
        this.transType2Amount = transType2Amount;
    }

    public Double getTransType2Value()
    {
        return transType2Value;
    }

    public void setTransType2Value(Double transType2Value)
    {
        this.transType2Value = transType2Value;
    }

    public Double getTransType3Addvalue()
    {
        return transType3Addvalue;
    }

    public void setTransType3Addvalue(Double transType3Addvalue)
    {
        this.transType3Addvalue = transType3Addvalue;
    }

    public Double getTransType3Amount()
    {
        return transType3Amount;
    }

    public void setTransType3Amount(Double transType3Amount)
    {
        this.transType3Amount = transType3Amount;
    }

    public Double getTransType3Value()
    {
        return transType3Value;
    }

    public void setTransType3Value(Double transType3Value)
    {
        this.transType3Value = transType3Value;
    }

    public Double getTransType4Addvalue()
    {
        return transType4Addvalue;
    }

    public void setTransType4Addvalue(Double transType4Addvalue)
    {
        this.transType4Addvalue = transType4Addvalue;
    }

    public Double getTransType4Amount()
    {
        return transType4Amount;
    }

    public void setTransType4Amount(Double transType4Amount)
    {
        this.transType4Amount = transType4Amount;
    }

    public Double getTransType4Value()
    {
        return transType4Value;
    }

    public void setTransType4Value(Double transType4Value)
    {
        this.transType4Value = transType4Value;
    }

    public Double getTransType5Addvalue()
    {
        return transType5Addvalue;
    }

    public void setTransType5Addvalue(Double transType5Addvalue)
    {
        this.transType5Addvalue = transType5Addvalue;
    }

    public Double getTransType5Amount()
    {
        return transType5Amount;
    }

    public void setTransType5Amount(Double transType5Amount)
    {
        this.transType5Amount = transType5Amount;
    }

    public Double getTransType5Value()
    {
        return transType5Value;
    }

    public void setTransType5Value(Double transType5Value)
    {
        this.transType5Value = transType5Value;
    }

    public Double getTransType6Addvalue()
    {
        return transType6Addvalue;
    }

    public void setTransType6Addvalue(Double transType6Addvalue)
    {
        this.transType6Addvalue = transType6Addvalue;
    }

    public Double getTransType6Amount()
    {
        return transType6Amount;
    }

    public void setTransType6Amount(Double transType6Amount)
    {
        this.transType6Amount = transType6Amount;
    }

    public Double getTransType6Value()
    {
        return transType6Value;
    }

    public void setTransType6Value(Double transType6Value)
    {
        this.transType6Value = transType6Value;
    }

    public Double getTransType7Addvalue()
    {
        return transType7Addvalue;
    }

    public void setTransType7Addvalue(Double transType7Addvalue)
    {
        this.transType7Addvalue = transType7Addvalue;
    }

    public Double getTransType7Amount()
    {
        return transType7Amount;
    }

    public void setTransType7Amount(Double transType7Amount)
    {
        this.transType7Amount = transType7Amount;
    }

    public Double getTransType7Value()
    {
        return transType7Value;
    }

    public void setTransType7Value(Double transType7Value)
    {
        this.transType7Value = transType7Value;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public Long getUsedpoint()
    {
        return usedpoint;
    }

    public void setUsedpoint(Long usedpoint)
    {
        this.usedpoint = usedpoint;
    }

    public Double getUsedpointamount()
    {
        return usedpointamount;
    }

    public void setUsedpointamount(Double usedpointamount)
    {
        this.usedpointamount = usedpointamount;
    }

    public Long getUsedpointid()
    {
        return usedpointid;
    }

    public void setUsedpointid(Long usedpointid)
    {
        this.usedpointid = usedpointid;
    }

    public Long getUsedpointtype()
    {
        return usedpointtype;
    }

    public void setUsedpointtype(Long usedpointtype)
    {
        this.usedpointtype = usedpointtype;
    }


    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }


    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are
        // not set
        if (!(object instanceof CheckoutOrderPrd)) {
            return false;
        }
        CheckoutOrderPrd other = (CheckoutOrderPrd) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public static CheckoutOrderPrd assetMockInstance()
    {
        CheckoutOrderPrd obj = new CheckoutOrderPrd();
        obj.setProductName("productName");
        obj.setSalPrice(1.0);
        obj.setPriceDiscount(1.0);
        obj.setProductNum(1L);
        obj.setCreateTime(new Date());
        obj.setUpdateTime(new Date());
        obj.setCouponId("couponId");
        obj.setCouponAmount(1.0);
        obj.setCouponUseTime(new Date());
        obj.setProductCouponStatus(1L);
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
        obj.setProductSerial(1L);
        obj.setProductId(1L);
        obj.setProductVersion(1L);
        obj.setProductClassid(1L);
        obj.setProductPic("productPic");
        obj.setProductPointStatus(1L);
        obj.setCreateSpId(1L);
        obj.setTransAmount(1.0);
        obj.setEscOrderid("escOrderid");
        obj.setItemId(1L);
        obj.setItemNo("itemNo");
        obj.setItemMallPrice(1.0);
        obj.setSkuDesc("skuDesc");
        obj.setProductStatus(1L);
        obj.setMerchantId(1L);
        obj.setMerchantOnlyid(1L);
        obj.setMerchantCnName("merchantCnName");
        obj.setMerchantEnName("merchantEnName");
        obj.setMerchantShopName("merchantShopName");
        obj.setDeleveryOrderId("deleveryOrderId");
        obj.setContent1("content1");
        obj.setContent2("content2");
        obj.setContent3("content3");
        obj.setBuyerOnlyid(1L);
        obj.setBuyerLoginid("buyerLoginid");
        obj.setPackageId("packageId");
        obj.setListingId(1L);
        obj.setSuitId(1L);
        obj.setIsComment(1L);
        obj.setCostPrice(1.0);
        obj.setAddGoodsTime(new Date());
        obj.setCoupontype(1L);
        obj.setUsedpointtype(1L);
        obj.setUsedpoint(1L);
        obj.setUsedpointamount(1.0);
        obj.setUsedpointid(1L);
        obj.setStorageId(1L);
        obj.setStorageName("storageName");
        obj.setStorageAddress("storageAddress");
        obj.setStorageCode("storageCode");
        obj.setStorageIntro("storageIntro");
        obj.setSingle(1L);
        obj.setPointMulti(1.0);
        obj.setPointPlan("pointPlan");
        obj.setPromotionIds("promotionIds");
        obj.setGetpoint(1L);
        obj.setAttributes("attributes");
        obj.setAccountId("accountId");
        obj.setAccountCostPrice(1.0);
        obj.setAccountDifferential(1.0);
        obj.setAccountComment("accountComment");
        obj.setAccountStatus("accountStatus");
        obj.setAccountReceipt("accountReceipt");
        obj.setProductComment("productComment");
        obj.setNationalStdNumber("nationalStdNumber");
        obj.setShipmentStatus((byte) 1);
        obj.setListNumber("listNumber");
        obj.setPrdType("prdType");
        obj.setListingType((byte) 1);
        obj.setSaleMode((short) 1);
        obj.setDesignCode("designCode");
        obj.setDesignFee(1.0);
        obj.setListPackageName("listPackageName");
        obj.setProfitrate(1.0);
        obj.setFeesponsor(1L);
        obj.setFlag(1L);
        return obj;
    }

    public String getOrderAttr()
    {
        return orderAttr;
    }

    public void setOrderAttr(String orderAttr)
    {
        this.orderAttr = orderAttr;
    }

    public String getItemAttr()
    {
        return itemAttr;
    }

    public void setItemAttr(String itemAttr)
    {
        this.itemAttr = itemAttr;
    }


    public String toString() {
        return "CheckoutOrderPrd [id=" + id + ", productName=" + productName
                + ", salPrice=" + salPrice + ", productNum=" + productNum
                + ", createTime=" + createTime + ", updateTime=" + updateTime
                + ", escOrderid=" + escOrderid +  "]";
    }

    public String getListingInfo()
    {
        return listingInfo;
    }

    public void setListingInfo(String listingInfo)
    {
        this.listingInfo = listingInfo;
    }

    public Double getOriginalSalPrice() {
        return originalSalPrice;
    }

    public void setOriginalSalPrice(Double originalSalPrice) {
        this.originalSalPrice = originalSalPrice;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getListingTag() {
        return listingTag;
    }

    public void setListingTag(String listingTag) {
        this.listingTag = listingTag;
    }

    public String getProductClassidFlag() {
        return productClassidFlag;
    }

    public void setProductClassidFlag(String productClassidFlag) {
        this.productClassidFlag = productClassidFlag;
    }

    public Integer getIsemsFreight() {
        return isemsFreight;
    }

    public void setIsemsFreight(Integer isemsFreight) {
        this.isemsFreight = isemsFreight;
    }

    public Double getBaseCommission() {
        return baseCommission;
    }

    public void setBaseCommission(Double baseCommission) {
        this.baseCommission = baseCommission;
    }

    public Double getExtraCommission() {
        return extraCommission;
    }

    public void setExtraCommission(Double extraCommission) {
        this.extraCommission = extraCommission;
    }

    public Double getHighCommission() {
        return highCommission;
    }

    public void setHighCommission(Double highCommission) {
        this.highCommission = highCommission;
    }

    public Double getPrdCommission() {
        return prdCommission;
    }

    public void setPrdCommission(Double prdCommission) {
        this.prdCommission = prdCommission;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityUniquene() {
        return activityUniquene;
    }

    public void setActivityUniquene(String activityUniquene) {
        this.activityUniquene = activityUniquene;
    }

    public Double getAveragePriceDiscount() {
        return averagePriceDiscount;
    }

    public void setAveragePriceDiscount(Double averagePriceDiscount) {
        this.averagePriceDiscount = averagePriceDiscount;
    }

    public Double getDiscountBalance() {
        return discountBalance;
    }

    public void setDiscountBalance(Double discountBalance) {
        this.discountBalance = discountBalance;
    }

    public Double getCommissionTicketPoint() {
        return commissionTicketPoint;
    }

    public void setCommissionTicketPoint(Double commissionTicketPoint) {
        this.commissionTicketPoint = commissionTicketPoint;
    }

    public Double getCommissionTaxPoint() {
        return commissionTaxPoint;
    }

    public void setCommissionTaxPoint(Double commissionTaxPoint) {
        this.commissionTaxPoint = commissionTaxPoint;
    }

    public Double getCommissionServiceCharge() {
        return commissionServiceCharge;
    }

    public void setCommissionServiceCharge(Double commissionServiceCharge) {
        this.commissionServiceCharge = commissionServiceCharge;
    }


}
