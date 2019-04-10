package com.citrix;

public class EndUserInfo implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.lang.String end_User_Org_ID;
    private java.lang.String end_User_Geo;

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

    public EndUserInfo(java.lang.String end_User_Org_ID, java.lang.String end_User_Geo) {
        this.end_User_Org_ID = end_User_Org_ID;
        this.end_User_Geo = end_User_Geo;
    }

}