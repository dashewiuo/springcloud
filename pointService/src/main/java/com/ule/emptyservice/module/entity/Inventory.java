package com.ule.emptyservice.module.entity;

import java.util.Date;

/**
 * Inventory entity.
 */
public class Inventory implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long storageId;
    private String location;
    private Long itemId;
    private String itemName;
    private String itemAttribute;
    private String upc;
    private Long qty;
    private Date storageDate;
    private Long pri;
    private Byte status;
    private String remark;
    private Date createTime;
    private String createUesr;
    private Date updateTime;
    private String updateUser;
    private Long blockedQty;
    private String sku;
    private Byte synFlg;
    private Long version;
    private Long saleBlockedQty;

    private Double msPrice;

    public Inventory() {
    }

    public Inventory(Long id) {
        this.id = id;
    }

    public Inventory(Long id, Long storageId, String location,
                     Long itemId, String itemName, String itemAttribute, String upc,
                     Long qty, Date storageDate, Long pri, Byte status,
                     String remark, Date createTime, String createUesr, Date updateTime,
                     String updateUser, Long blockedQty, String sku, Byte synFlg,
                     Long version, Long saleBlockedQty, Double msPrice) {
        this.id = id;
        this.storageId = storageId;
        this.location = location;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemAttribute = itemAttribute;
        this.upc = upc;
        this.qty = qty;
        this.storageDate = storageDate;
        this.pri = pri;
        this.status = status;
        this.remark = remark;
        this.createTime = createTime;
        this.createUesr = createUesr;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.blockedQty = blockedQty;
        this.sku = sku;
        this.synFlg = synFlg;
        this.version = version;
        this.saleBlockedQty = saleBlockedQty;
        this.msPrice = msPrice;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStorageId() {
        return this.storageId;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }


    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public String getItemAttribute() {
        return this.itemAttribute;
    }

    public void setItemAttribute(String itemAttribute) {
        this.itemAttribute = itemAttribute;
    }


    public String getUpc() {
        return this.upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }


    public Long getQty() {
        return this.qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }


    public Date getStorageDate() {
        return this.storageDate;
    }

    public void setStorageDate(Date storageDate) {
        this.storageDate = storageDate;
    }


    public Long getPri() {
        return this.pri;
    }

    public void setPri(Long pri) {
        this.pri = pri;
    }


    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }


    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getCreateUesr() {
        return this.createUesr;
    }

    public void setCreateUesr(String createUesr) {
        this.createUesr = createUesr;
    }


    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public String getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    public Long getBlockedQty() {
        return this.blockedQty;
    }

    public void setBlockedQty(Long blockedQty) {
        this.blockedQty = blockedQty;
    }


    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }


    public Byte getSynFlg() {
        return this.synFlg;
    }

    public void setSynFlg(Byte synFlg) {
        this.synFlg = synFlg;
    }


    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    public Long getSaleBlockedQty() {
        return this.saleBlockedQty;
    }

    public void setSaleBlockedQty(Long saleBlockedQty) {
        this.saleBlockedQty = saleBlockedQty;
    }


    public Double getMsPrice() {
        return msPrice;
    }

    public void setMsPrice(Double msPrice) {
        this.msPrice = msPrice;
    }

}