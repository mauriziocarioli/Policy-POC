package com.citrix.policy_poc;

import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {


	@org.kie.api.definition.type.Label(value = "Order")
	private Order order;
	@org.kie.api.definition.type.Label(value = "Reward Registration")
	private RewardRegistration rewardRegistration;
	@org.kie.api.definition.type.Label(value = "Partner Info")
	private PartnerInfo partnerInfo;
	@org.kie.api.definition.type.Label(value = "Partner Functions")
	private PartnerFunctions partnerFunctions;
	@org.kie.api.definition.type.Label(value = "Original Order")
	private OriginalOrder originalOrder;
	@org.kie.api.definition.type.Label(value = "Sales Exceptions")
	private List<String> salesExceptions;
	@org.kie.api.definition.type.Label(value = "Product Authorizations")
	private List<AuthorizationItem> productAuthorizations;
	@org.kie.api.definition.type.Label(value = "End User Info")
	private EndUserInfo endUserInfo;
	@org.kie.api.definition.type.Label(value = "Specializations")
	private List<Specialization> specializations;

	public Request() {
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public RewardRegistration getRewardRegistration() {
		return this.rewardRegistration;
	}

	public void setRewardRegistration(
			RewardRegistration rewardRegistration) {
		this.rewardRegistration = rewardRegistration;
	}

	public PartnerInfo getPartnerInfo() {
		return this.partnerInfo;
	}

	public void setPartnerInfo(PartnerInfo partnerInfo) {
		this.partnerInfo = partnerInfo;
	}

	public PartnerFunctions getPartnerFunctions() {
		return this.partnerFunctions;
	}

	public void setPartnerFunctions(PartnerFunctions partnerFunctions) {
		this.partnerFunctions = partnerFunctions;
	}

	public OriginalOrder getOriginalOrder() {
		return this.originalOrder;
	}

	public void setOriginalOrder(OriginalOrder originalOrder) {
		this.originalOrder = originalOrder;
	}

	public List<String> getSalesExceptions() {
		return this.salesExceptions;
	}

	public void setSalesExceptions(
			List<String> salesExceptions) {
		this.salesExceptions = salesExceptions;
	}

	public List<AuthorizationItem> getProductAuthorizations() {
		return this.productAuthorizations;
	}

	public void setProductAuthorizations(
			List<AuthorizationItem> productAuthorizations) {
		this.productAuthorizations = productAuthorizations;
	}

	public EndUserInfo getEndUserInfo() {
		return this.endUserInfo;
	}

	public void setEndUserInfo(EndUserInfo endUserInfo) {
		this.endUserInfo = endUserInfo;
	}

	public List<Specialization> getSpecializations() {
		return this.specializations;
	}

	public void setSpecializations(
			List<Specialization> specializations) {
		this.specializations = specializations;
	}

	public Request(Order order,
			RewardRegistration rewardRegistration,
			PartnerInfo partnerInfo,
			PartnerFunctions partnerFunctions,
			OriginalOrder originalOrder,
			List<String> salesExceptions,
			List<AuthorizationItem> productAuthorizations,
			EndUserInfo endUserInfo,
			List<Specialization> specializations) {
		this.order = order;
		this.rewardRegistration = rewardRegistration;
		this.partnerInfo = partnerInfo;
		this.partnerFunctions = partnerFunctions;
		this.originalOrder = originalOrder;
		this.salesExceptions = salesExceptions;
		this.productAuthorizations = productAuthorizations;
		this.endUserInfo = endUserInfo;
		this.specializations = specializations;
	}

}
