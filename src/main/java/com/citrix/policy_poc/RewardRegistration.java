package com.citrix.policy_poc;

import java.io.Serializable;
import java.time.LocalDate;

public class RewardRegistration implements Serializable {

	private static final long serialVersionUID = -1528041913511392459L;
	
	@org.kie.api.definition.type.Label(value = "Registration_ID")
	private String registration_ID;
	@org.kie.api.definition.type.Label(value = "Incentive Type")
	private String incentive_Type;
	@org.kie.api.definition.type.Label(value = "Reward Submitted Date")
	private LocalDate reward_Submitted_Date;
	@org.kie.api.definition.type.Label(value = "Backend Applicable Flag")
	private Boolean backendApplicable_Flag;
	@org.kie.api.definition.type.Label(value = "Frontend Applicable Flag")
	private Boolean frontendApplicable_Flag;
	@org.kie.api.definition.type.Label(value = "Initial Submitted Date")
	private LocalDate initial_Submitted_Date;

	public RewardRegistration() {
	}

	public String getRegistration_ID() {
		return this.registration_ID;
	}

	public void setRegistration_ID(String registration_ID) {
		this.registration_ID = registration_ID;
	}

	public String getIncentive_Type() {
		return this.incentive_Type;
	}

	public void setIncentive_Type(String incentive_Type) {
		this.incentive_Type = incentive_Type;
	}

	public LocalDate getReward_Submitted_Date() {
		return this.reward_Submitted_Date;
	}

	public void setReward_Submitted_Date(
			LocalDate reward_Submitted_Date) {
		this.reward_Submitted_Date = reward_Submitted_Date;
	}

	public Boolean getBackendApplicable_Flag() {
		return this.backendApplicable_Flag;
	}

	public void setBackendApplicable_Flag(
			Boolean backendApplicable_Flag) {
		this.backendApplicable_Flag = backendApplicable_Flag;
	}

	public Boolean getFrontendApplicable_Flag() {
		return this.frontendApplicable_Flag;
	}

	public void setFrontendApplicable_Flag(
			Boolean frontendApplicable_Flag) {
		this.frontendApplicable_Flag = frontendApplicable_Flag;
	}

	public LocalDate getInitial_Submitted_Date() {
		return this.initial_Submitted_Date;
	}

	public void setInitial_Submitted_Date(
			LocalDate initial_Submitted_Date) {
		this.initial_Submitted_Date = initial_Submitted_Date;
	}

	public RewardRegistration(String registration_ID,
			String incentive_Type,
			LocalDate reward_Submitted_Date,
			Boolean backendApplicable_Flag,
			Boolean frontendApplicable_Flag,
			LocalDate initial_Submitted_Date) {
		this.registration_ID = registration_ID;
		this.incentive_Type = incentive_Type;
		this.reward_Submitted_Date = reward_Submitted_Date;
		this.backendApplicable_Flag = backendApplicable_Flag;
		this.frontendApplicable_Flag = frontendApplicable_Flag;
		this.initial_Submitted_Date = initial_Submitted_Date;
	}

}