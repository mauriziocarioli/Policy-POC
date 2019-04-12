package com.citrix.policy_poc;

public class Info implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.time.LocalDate request_DateTime;
    private java.time.LocalDate response_DateTime;
    private java.lang.String status;
    private java.lang.String interaction_Id;
    private java.lang.String source;

    public java.time.LocalDate getRequest_DateTime() {
        return this.request_DateTime;
    }

    public void setRequest_DateTime(java.time.LocalDate request_DateTime) {
        this.request_DateTime = request_DateTime;
    }

    public java.time.LocalDate getResponse_DateTime() {
        return this.response_DateTime;
    }

    public void setResponse_DateTime(java.time.LocalDate response_DateTime) {
        this.response_DateTime = response_DateTime;
    }

    public java.lang.String getStatus() {
        return this.status;
    }

    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    public java.lang.String getInteraction_Id() {
        return this.interaction_Id;
    }

    public void setInteraction_Id(java.lang.String interaction_Id) {
        this.interaction_Id = interaction_Id;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public Info(java.time.LocalDate request_DateTime, java.time.LocalDate response_DateTime, java.lang.String status, java.lang.String interaction_Id, java.lang.String source) {
        this.request_DateTime = request_DateTime;
        this.response_DateTime = response_DateTime;
        this.status = status;
        this.interaction_Id = interaction_Id;
        this.source = source;
    }

}
