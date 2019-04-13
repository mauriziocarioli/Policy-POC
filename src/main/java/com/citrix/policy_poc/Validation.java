package com.citrix.policy_poc;

import java.io.Serializable;
import java.time.LocalDate;

public class Validation implements Serializable {

    static final long serialVersionUID = 1L;
    
    private String checkName;
    private LocalDate checkDate;
    private String checkResult;
    private Boolean header;
    private String orderID;
    private String checkType;
    private Boolean mergedStatus;

    public String getCheckName() {
        return this.checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public LocalDate getCheckDate() {
        return this.checkDate;
    }

    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckResult() {
        return this.checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public Boolean getHeader() {
        return this.header;
    }

    public void setHeader(Boolean header) {
        this.header = header;
    }

    public String getOrderID() {
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCheckType() {
        return this.checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public Boolean getMergedStatus() {
        return this.mergedStatus;
    }

    public void setMergedStatus(Boolean mergedStatus) {
        this.mergedStatus = mergedStatus;
    }

    public Validation(String checkName, LocalDate checkDate, String checkResult, Boolean header, String orderID, String checkType, Boolean mergedStatus) {
        this.checkName = checkName;
        this.checkDate = checkDate;
        this.checkResult = checkResult;
        this.header = header;
        this.orderID = orderID;
        this.checkType = checkType;
        this.mergedStatus = mergedStatus;
    }

}