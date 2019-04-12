package com.citrix.policy_poc;

public class AuthorizationItem implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.lang.String product_Line_ID;
    private java.lang.String cert_Status;

    public java.lang.String getProduct_Line_ID() {
        return this.product_Line_ID;
    }

    public void setProduct_Line_ID(java.lang.String product_Line_ID) {
        this.product_Line_ID = product_Line_ID;
    }

    public java.lang.String getCert_Status() {
        return this.cert_Status;
    }

    public void setCert_Status(java.lang.String cert_Status) {
        this.cert_Status = cert_Status;
    }

    public AuthorizationItem(java.lang.String product_Line_ID, java.lang.String cert_Status) {
        this.product_Line_ID = product_Line_ID;
        this.cert_Status = cert_Status;
    }

}    