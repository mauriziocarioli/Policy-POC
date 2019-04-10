package com.citrix;

public class OriginalOrder implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.time.LocalDate creation_Date;
    private java.time.LocalDate pO_Date;
    private java.time.LocalDate document_Date;

    public java.time.LocalDate getCreation_Date() {
        return this.creation_Date;
    }

    public void setCreation_Date(java.time.LocalDate creation_Date) {
        this.creation_Date = creation_Date;
    }

    public java.time.LocalDate getPO_Date() {
        return this.pO_Date;
    }

    public void setPO_Date(java.time.LocalDate pO_Date) {
        this.pO_Date = pO_Date;
    }

    public java.time.LocalDate getDocument_Date() {
        return this.document_Date;
    }

    public void setDocument_Date(java.time.LocalDate document_Date) {
        this.document_Date = document_Date;
    }

    public OriginalOrder(java.time.LocalDate creation_Date, java.time.LocalDate pO_Date, java.time.LocalDate document_Date) {
        this.creation_Date = creation_Date;
        this.pO_Date = pO_Date;
        this.document_Date = document_Date;
    }

}