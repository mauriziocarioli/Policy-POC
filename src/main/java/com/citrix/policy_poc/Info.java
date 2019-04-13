package com.citrix.policy_poc;

import com.citrix.policy_poc.*;
import java.io.Serializable;
import java.lang.String;
import java.time.LocalDate;

public class Info implements Serializable {

    static final long serialVersionUID = 1L;
    
    private LocalDate request_DateTime;
    private LocalDate response_DateTime;
    private String status;
    private String interaction_Id;
    private String source;

    public LocalDate getRequest_DateTime() {
        return this.request_DateTime;
    }

    public void setRequest_DateTime(LocalDate request_DateTime) {
        this.request_DateTime = request_DateTime;
    }

    public LocalDate getResponse_DateTime() {
        return this.response_DateTime;
    }

    public void setResponse_DateTime(LocalDate response_DateTime) {
        this.response_DateTime = response_DateTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInteraction_Id() {
        return this.interaction_Id;
    }

    public void setInteraction_Id(String interaction_Id) {
        this.interaction_Id = interaction_Id;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Info(LocalDate request_DateTime, LocalDate response_DateTime, String status, String interaction_Id, String source) {
        this.request_DateTime = request_DateTime;
        this.response_DateTime = response_DateTime;
        this.status = status;
        this.interaction_Id = interaction_Id;
        this.source = source;
    }

}
