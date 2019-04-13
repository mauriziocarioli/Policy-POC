package com.citrix.policy_poc;

import com.citrix.policy_poc.*;
import java.io.Serializable;
import java.time.LocalDate;

@org.kie.api.definition.type.Label("Order Header")
public class OrderHeader implements Serializable {


	@org.kie.api.definition.type.Label("Order Type")
	private String order_Type;
	@org.kie.api.definition.type.Label("Order ID")
	private String order_ID;
	@org.kie.api.definition.type.Label("Order Amount")
	private Double order_Amount;
	@org.kie.api.definition.type.Label("Award Type")
	private String award_Type;
	@org.kie.api.definition.type.Label("Contract Type")
	private String contract_Type;
	@org.kie.api.definition.type.Label("Contract Level")
	private String contract_Level;
	@org.kie.api.definition.type.Label("Contract Number")
	private String contract_No;
	@org.kie.api.definition.type.Label("Order Creation Date")
	private LocalDate order_Creation_Date;
	@org.kie.api.definition.type.Label("Order Matched Date")
	private LocalDate order_Matched_Date;
	@org.kie.api.definition.type.Label("Matched Registration ID")
	private String matched_Registration_ID;
	@org.kie.api.definition.type.Label("Shared Reward Flag")
	private Boolean shared_Reward_Flag;
	@org.kie.api.definition.type.Label("New Customer Flag")
	private Boolean new_Customer_Flag;
	@org.kie.api.definition.type.Label("PO Date")
	private LocalDate PO_Date;
	@org.kie.api.definition.type.Label("PO Number")
	private String PO_Number;
	@org.kie.api.definition.type.Label("Validation Status")
	private String validation_Status;
	@org.kie.api.definition.type.Label("Failure Reasons")
	private String failure_Reasons;

	@org.kie.api.definition.type.Label("Total Partner Eligible Amount")
	private Double total_Partner_Eligible_Amount;

	@org.kie.api.definition.type.Label("Total Promo Amount")
	private Double total_Promo_Amount;

	@org.kie.api.definition.type.Label("Total Base Amount")
	private Double total_Base_Amount;

	@org.kie.api.definition.type.Label("OrderDiscounts")
	private Double orderDiscounts;

	@org.kie.api.definition.type.Label("Distribution Channel")
	private String distribution_Channel;

	public OrderHeader() {
	}

	public String getOrder_Type() {
		return this.order_Type;
	}

	public void setOrder_Type(String order_Type) {
		this.order_Type = order_Type;
	}

	public String getOrder_ID() {
		return this.order_ID;
	}

	public void setOrder_ID(String order_ID) {
		this.order_ID = order_ID;
	}

	public Double getOrder_Amount() {
		return this.order_Amount;
	}

	public void setOrder_Amount(Double order_Amount) {
		this.order_Amount = order_Amount;
	}

	public String getAward_Type() {
		return this.award_Type;
	}

	public void setAward_Type(String award_Type) {
		this.award_Type = award_Type;
	}

	public String getContract_Type() {
		return this.contract_Type;
	}

	public void setContract_Type(String contract_Type) {
		this.contract_Type = contract_Type;
	}

	public String getContract_Level() {
		return this.contract_Level;
	}

	public void setContract_Level(String contract_Level) {
		this.contract_Level = contract_Level;
	}

	public String getContract_No() {
		return this.contract_No;
	}

	public void setContract_No(String contract_No) {
		this.contract_No = contract_No;
	}

	public LocalDate getOrder_Creation_Date() {
		return this.order_Creation_Date;
	}

	public void setOrder_Creation_Date(LocalDate order_Creation_Date) {
		this.order_Creation_Date = order_Creation_Date;
	}

	public LocalDate getOrder_Matched_Date() {
		return this.order_Matched_Date;
	}

	public void setOrder_Matched_Date(LocalDate order_Matched_Date) {
		this.order_Matched_Date = order_Matched_Date;
	}

	public String getMatched_Registration_ID() {
		return this.matched_Registration_ID;
	}

	public void setMatched_Registration_ID(
			String matched_Registration_ID) {
		this.matched_Registration_ID = matched_Registration_ID;
	}

	public LocalDate getPO_Date() {
		return this.PO_Date;
	}

	public void setPO_Date(LocalDate PO_Date) {
		this.PO_Date = PO_Date;
	}

	public String getPO_Number() {
		return this.PO_Number;
	}

	public void setPO_Number(String PO_Number) {
		this.PO_Number = PO_Number;
	}

	public String getValidation_Status() {
		return this.validation_Status;
	}

	public void setValidation_Status(String validation_Status) {
		this.validation_Status = validation_Status;
	}

	public String getFailure_Reasons() {
		return this.failure_Reasons;
	}

	public void setFailure_Reasons(String failure_Reasons) {
		this.failure_Reasons = failure_Reasons;
	}

	public Double getTotal_Partner_Eligible_Amount() {
		return this.total_Partner_Eligible_Amount;
	}

	public void setTotal_Partner_Eligible_Amount(
			Double total_Partner_Eligible_Amount) {
		this.total_Partner_Eligible_Amount = total_Partner_Eligible_Amount;
	}

	public Double getTotal_Promo_Amount() {
		return this.total_Promo_Amount;
	}

	public void setTotal_Promo_Amount(Double total_Promo_Amount) {
		this.total_Promo_Amount = total_Promo_Amount;
	}

	public Double getTotal_Base_Amount() {
		return this.total_Base_Amount;
	}

	public void setTotal_Base_Amount(Double total_Base_Amount) {
		this.total_Base_Amount = total_Base_Amount;
	}

	public Double getOrderDiscounts() {
		return this.orderDiscounts;
	}

	public void setOrderDiscounts(Double orderDiscounts) {
		this.orderDiscounts = orderDiscounts;
	}

	public String getDistribution_Channel() {
		return this.distribution_Channel;
	}

	public void setDistribution_Channel(String distribution_Channel) {
		this.distribution_Channel = distribution_Channel;
	}

	public Boolean getNew_Customer_Flag() {
		return this.new_Customer_Flag;
	}

	public void setNew_Customer_Flag(Boolean new_Customer_Flag) {
		this.new_Customer_Flag = new_Customer_Flag;
	}

	public Boolean getShared_Reward_Flag() {
		return this.shared_Reward_Flag;
	}

	public void setShared_Reward_Flag(Boolean shared_Reward_Flag) {
		this.shared_Reward_Flag = shared_Reward_Flag;
	}

	public OrderHeader(String order_Type, String order_ID,
			Double order_Amount, String award_Type,
			String contract_Type, String contract_Level,
			String contract_No,
			LocalDate order_Creation_Date,
			LocalDate order_Matched_Date,
			String matched_Registration_ID,
			Boolean shared_Reward_Flag,
			Boolean new_Customer_Flag, LocalDate PO_Date,
			String PO_Number, String validation_Status,
			String failure_Reasons,
			Double total_Partner_Eligible_Amount,
			Double total_Promo_Amount,
			Double total_Base_Amount,
			Double orderDiscounts,
			String distribution_Channel) {
		this.order_Type = order_Type;
		this.order_ID = order_ID;
		this.order_Amount = order_Amount;
		this.award_Type = award_Type;
		this.contract_Type = contract_Type;
		this.contract_Level = contract_Level;
		this.contract_No = contract_No;
		this.order_Creation_Date = order_Creation_Date;
		this.order_Matched_Date = order_Matched_Date;
		this.matched_Registration_ID = matched_Registration_ID;
		this.shared_Reward_Flag = shared_Reward_Flag;
		this.new_Customer_Flag = new_Customer_Flag;
		this.PO_Date = PO_Date;
		this.PO_Number = PO_Number;
		this.validation_Status = validation_Status;
		this.failure_Reasons = failure_Reasons;
		this.total_Partner_Eligible_Amount = total_Partner_Eligible_Amount;
		this.total_Promo_Amount = total_Promo_Amount;
		this.total_Base_Amount = total_Base_Amount;
		this.orderDiscounts = orderDiscounts;
		this.distribution_Channel = distribution_Channel;
	}

}