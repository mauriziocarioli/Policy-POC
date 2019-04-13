package com.citrix.policy_poc;

import java.io.Serializable;

public class AuthorizationItem implements Serializable {

    static final long serialVersionUID = 1L;
    
    private String product_Line_ID;
    private String cert_Status;

    public String getProduct_Line_ID() {
        return this.product_Line_ID;
    }

    public void setProduct_Line_ID(String product_Line_ID) {
        this.product_Line_ID = product_Line_ID;
    }

    public String getCert_Status() {
        return this.cert_Status;
    }

    public void setCert_Status(String cert_Status) {
        this.cert_Status = cert_Status;
    }

    public AuthorizationItem(String product_Line_ID, String cert_Status) {
        this.product_Line_ID = product_Line_ID;
        this.cert_Status = cert_Status;
    }

}    