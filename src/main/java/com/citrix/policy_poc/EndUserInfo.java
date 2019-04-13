package com.citrix.policy_poc;

import java.io.Serializable;

public class EndUserInfo implements Serializable {

   
    private String end_User_Org_ID;
    private String end_User_Geo;
    private String end_User_Area;
    private String end_User_Territory;
    private String end_User_Region;   
    private String end_User_Email_Address;    
    private String high_Touch_Flag;

    public String getEnd_User_Org_ID() {
        return this.end_User_Org_ID;
    }

    public void setEnd_User_Org_ID(String end_User_Org_ID) {
        this.end_User_Org_ID = end_User_Org_ID;
    }

    public String getEnd_User_Geo() {
        return this.end_User_Geo;
    }

    public void setEnd_User_Geo(String end_User_Geo) {
        this.end_User_Geo = end_User_Geo;
    }

    public String getEnd_User_Area() {
        return this.end_User_Area;
    }

    public void setEnd_User_Area(String end_User_Area) {
        this.end_User_Area = end_User_Area;
    }

    public String getEnd_User_Territory() {
        return this.end_User_Territory;
    }

    public void setEnd_User_Territory(String end_User_Territory) {
        this.end_User_Territory = end_User_Territory;
    }

    public String getEnd_User_Region() {
        return this.end_User_Region;
    }

    public void setEnd_User_Region(String end_User_Region) {
        this.end_User_Region = end_User_Region;
    }

    public String getEnd_User_Email_Address() {
        return this.end_User_Email_Address;
    }

    public void setEnd_User_Email_Address(String end_User_Email_Address) {
        this.end_User_Email_Address = end_User_Email_Address;
    }

    public String getHigh_Touch_Flag() {
        return this.high_Touch_Flag;
    }

    public void setHigh_Touch_Flag(String high_Touch_Flag) {
        this.high_Touch_Flag = high_Touch_Flag;
    }

    public EndUserInfo(String end_User_Org_ID, String end_User_Geo, String end_User_Area, String end_User_Territory, String end_User_Region, String end_User_Email_Address, String high_Touch_Flag) {
        this.end_User_Org_ID = end_User_Org_ID;
        this.end_User_Geo = end_User_Geo;
        this.end_User_Area = end_User_Area;
        this.end_User_Territory = end_User_Territory;
        this.end_User_Region = end_User_Region;
        this.end_User_Email_Address = end_User_Email_Address;
        this.high_Touch_Flag = high_Touch_Flag;
    }

}