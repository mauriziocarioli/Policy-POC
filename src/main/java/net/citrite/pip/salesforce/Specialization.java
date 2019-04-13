package net.citrite.pip.salesforce;

import java.io.Serializable;
import java.util.Map;

public class Specialization implements Serializable {

    private static final long serialVersionUID = -9184570138321925886L;
        
	private String systemName;
	private String status;
	private String bRE_Status;
	private Map<String,Object> AddData;


    public String getSystemName() {
        return this.systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBRE_Status() {
        return this.bRE_Status;
    }

    public void setBRE_Status(String bRE_Status) {
        this.bRE_Status = bRE_Status;
    }

    public Map<String,Object> getAddData() {
        return this.AddData;
    }

    public void setAddData(Map<String,Object> AddData) {
        this.AddData = AddData;
    }

    public Specialization(String systemName, String status, String bRE_Status, Map<String,Object> AddData) {
        this.systemName = systemName;
        this.status = status;
        this.bRE_Status = bRE_Status;
        this.AddData = AddData;
    }

}