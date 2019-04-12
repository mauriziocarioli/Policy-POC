package com.citrix.policy_poc;

public class Validation implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.lang.String checkName;
    private java.time.LocalDate checkDate;
    private java.lang.String checkResult;
    private java.lang.Boolean header;
    private java.lang.String orderID;
    private java.lang.String checkType;
    private java.lang.Boolean mergedStatus;

    public java.lang.String getCheckName() {
        return this.checkName;
    }

    public void setCheckName(java.lang.String checkName) {
        this.checkName = checkName;
    }

    public java.time.LocalDate getCheckDate() {
        return this.checkDate;
    }

    public void setCheckDate(java.time.LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    public java.lang.String getCheckResult() {
        return this.checkResult;
    }

    public void setCheckResult(java.lang.String checkResult) {
        this.checkResult = checkResult;
    }

    public java.lang.Boolean getHeader() {
        return this.header;
    }

    public void setHeader(java.lang.Boolean header) {
        this.header = header;
    }

    public java.lang.String getOrderID() {
        return this.orderID;
    }

    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }

    public java.lang.String getCheckType() {
        return this.checkType;
    }

    public void setCheckType(java.lang.String checkType) {
        this.checkType = checkType;
    }

    public java.lang.Boolean getMergedStatus() {
        return this.mergedStatus;
    }

    public void setMergedStatus(java.lang.Boolean mergedStatus) {
        this.mergedStatus = mergedStatus;
    }

    public Validation(java.lang.String checkName, java.time.LocalDate checkDate, java.lang.String checkResult, java.lang.Boolean header, java.lang.String orderID, java.lang.String checkType, java.lang.Boolean mergedStatus) {
        this.checkName = checkName;
        this.checkDate = checkDate;
        this.checkResult = checkResult;
        this.header = header;
        this.orderID = orderID;
        this.checkType = checkType;
        this.mergedStatus = mergedStatus;
    }

}