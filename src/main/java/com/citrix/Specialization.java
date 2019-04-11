package com.citrix;

public class Specialization implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
	private java.lang.String systemName;
	private java.lang.String status;
	private java.lang.String bRE_Status;
	private java.util.Map<java.lang.String,java.lang.Object> AddData;


    public java.lang.String getSystemName() {
        return this.systemName;
    }

    public void setSystemName(java.lang.String systemName) {
        this.systemName = systemName;
    }

    public java.lang.String getStatus() {
        return this.status;
    }

    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    public java.lang.String getBRE_Status() {
        return this.bRE_Status;
    }

    public void setBRE_Status(java.lang.String bRE_Status) {
        this.bRE_Status = bRE_Status;
    }

    public java.util.Map<java.lang.String,java.lang.Object> getAddData() {
        return this.AddData;
    }

    public void setAddData(java.util.Map<java.lang.String,java.lang.Object> AddData) {
        this.AddData = AddData;
    }

    public Specialization(java.lang.String systemName, java.lang.String status, java.lang.String bRE_Status, java.util.Map<java.lang.String,java.lang.Object> AddData) {
        this.systemName = systemName;
        this.status = status;
        this.bRE_Status = bRE_Status;
        this.AddData = AddData;
    }

}