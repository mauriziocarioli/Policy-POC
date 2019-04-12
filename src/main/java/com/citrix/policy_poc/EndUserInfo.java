package com.citrix.policy_poc;

public class EndUserInfo implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.lang.String end_User_Org_ID;
    private java.lang.String end_User_Geo;
    private java.lang.String end_User_Area;
    private java.lang.String end_User_Territory;
    private java.lang.String end_User_Region;   
    private java.lang.String end_User_Email_Address;    
    private java.lang.String high_Touch_Flag;

    public java.lang.String getEnd_User_Org_ID() {
        return this.end_User_Org_ID;
    }

    public void setEnd_User_Org_ID(java.lang.String end_User_Org_ID) {
        this.end_User_Org_ID = end_User_Org_ID;
    }

    public java.lang.String getEnd_User_Geo() {
        return this.end_User_Geo;
    }

    public void setEnd_User_Geo(java.lang.String end_User_Geo) {
        this.end_User_Geo = end_User_Geo;
    }

    public java.lang.String getEnd_User_Area() {
        return this.end_User_Area;
    }

    public void setEnd_User_Area(java.lang.String end_User_Area) {
        this.end_User_Area = end_User_Area;
    }

    public java.lang.String getEnd_User_Territory() {
        return this.end_User_Territory;
    }

    public void setEnd_User_Territory(java.lang.String end_User_Territory) {
        this.end_User_Territory = end_User_Territory;
    }

    public java.lang.String getEnd_User_Region() {
        return this.end_User_Region;
    }

    public void setEnd_User_Region(java.lang.String end_User_Region) {
        this.end_User_Region = end_User_Region;
    }

    public java.lang.String getEnd_User_Email_Address() {
        return this.end_User_Email_Address;
    }

    public void setEnd_User_Email_Address(java.lang.String end_User_Email_Address) {
        this.end_User_Email_Address = end_User_Email_Address;
    }

    public java.lang.String getHigh_Touch_Flag() {
        return this.high_Touch_Flag;
    }

    public void setHigh_Touch_Flag(java.lang.String high_Touch_Flag) {
        this.high_Touch_Flag = high_Touch_Flag;
    }

    public EndUserInfo(java.lang.String end_User_Org_ID, java.lang.String end_User_Geo, java.lang.String end_User_Area, java.lang.String end_User_Territory, java.lang.String end_User_Region, java.lang.String end_User_Email_Address, java.lang.String high_Touch_Flag) {
        this.end_User_Org_ID = end_User_Org_ID;
        this.end_User_Geo = end_User_Geo;
        this.end_User_Area = end_User_Area;
        this.end_User_Territory = end_User_Territory;
        this.end_User_Region = end_User_Region;
        this.end_User_Email_Address = end_User_Email_Address;
        this.high_Touch_Flag = high_Touch_Flag;
    }

}