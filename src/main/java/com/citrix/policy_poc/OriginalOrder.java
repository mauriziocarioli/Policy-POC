package com.citrix.policy_poc;

import java.io.Serializable;
import java.time.LocalDate;

public class OriginalOrder implements Serializable {

    
    private LocalDate creation_Date;
    private LocalDate pO_Date;
    private LocalDate document_Date;

    public LocalDate getCreation_Date() {
        return this.creation_Date;
    }

    public void setCreation_Date(LocalDate creation_Date) {
        this.creation_Date = creation_Date;
    }

    public LocalDate getPO_Date() {
        return this.pO_Date;
    }

    public void setPO_Date(LocalDate pO_Date) {
        this.pO_Date = pO_Date;
    }

    public LocalDate getDocument_Date() {
        return this.document_Date;
    }

    public void setDocument_Date(LocalDate document_Date) {
        this.document_Date = document_Date;
    }

    public OriginalOrder(LocalDate creation_Date, LocalDate pO_Date, LocalDate document_Date) {
        this.creation_Date = creation_Date;
        this.pO_Date = pO_Date;
        this.document_Date = document_Date;
    }

}