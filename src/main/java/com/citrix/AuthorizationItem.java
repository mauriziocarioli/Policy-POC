package com.citrix;

public class AuthorizationItem implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.lang.String Product_Line_ID;
    private java.lang.String Cert_Status;

    public java.lang.String getProduct_Line_ID() {
        return this.Product_Line_ID;
    }

    public void setProduct_Line_ID(java.lang.String Product_Line_ID) {
        this.Product_Line_ID = Product_Line_ID;
    }

    public java.lang.String getCert_Status() {
        return this.Cert_Status;
    }

    public void setCert_Status(java.lang.String Cert_Status) {
        this.Cert_Status = Cert_Status;
    }

    public AuthorizationItem(java.lang.String Product_Line_ID, java.lang.String Cert_Status) {
        this.Product_Line_ID = Product_Line_ID;
        this.Cert_Status = Cert_Status;
    }

}    
