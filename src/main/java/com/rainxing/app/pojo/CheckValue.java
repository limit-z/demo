package com.rainxing.app.pojo;

import java.util.Date;

public class CheckValue {
    private String autoID;

    private String customerID;

    private String checkID;

    private String itemID;

    private String itemType;

    private String itemName;

    private String itemValue;

    private String itemMemo;

    private Integer isDelete;

    private Date createTime;

    public String getAutoID() {
        return autoID;
    }

    public void setAutoID(String autoID) {
        this.autoID = autoID == null ? null : autoID.trim();
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID == null ? null : customerID.trim();
    }

    public String getCheckID() {
        return checkID;
    }

    public void setCheckID(String checkID) {
        this.checkID = checkID == null ? null : checkID.trim();
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID == null ? null : itemID.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue == null ? null : itemValue.trim();
    }

    public String getItemMemo() {
        return itemMemo;
    }

    public void setItemMemo(String itemMemo) {
        this.itemMemo = itemMemo == null ? null : itemMemo.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}