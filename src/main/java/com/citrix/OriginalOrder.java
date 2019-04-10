package com.citrix;

public class OriginalOrder implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.time.LocalDate creation_Date;
    private java.time.LocalDate PO_Date;
    private java.time.LocalDate Document_Date;

    public java.time.LocalDate getCreation_Date() {
        return this.creation_Date;
    }

    public void setCreation_Date(java.time.LocalDate creation_Date) {
        this.creation_Date = creation_Date;
    }

    public java.time.LocalDate getPO_Date() {
        return this.PO_Date;
    }

    public void setPO_Date(java.time.LocalDate PO_Date) {
        this.PO_Date = PO_Date;
    }

    public java.time.LocalDate getDocument_Date() {
        return this.Document_Date;
    }

    public void setDocument_Date(java.time.LocalDate Document_Date) {
        this.Document_Date = Document_Date;
    }

    public OriginalOrder(java.time.LocalDate creation_Date, java.time.LocalDate PO_Date, java.time.LocalDate Document_Date) {
        this.creation_Date = creation_Date;
        this.PO_Date = PO_Date;
        this.Document_Date = Document_Date;
    }

}