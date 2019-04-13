package com.citrix.policy_poc;

import com.citrix.policy_poc.*;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BREObjectSFDC implements Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Request")
	private Request request;
	@org.kie.api.definition.type.Label("Info")
	private Info info;
	@org.kie.api.definition.type.Label(value = "Validations")
	private List<Validation> validations;
	@org.kie.api.definition.type.Label(value = "Payout")
	private String payout;

	public BREObjectSFDC() {
	}

	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Info getInfo() {
		return this.info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public List<Validation> getValidations() {
		return this.validations;
	}

	public void setValidations(List<Validation> validations) {
		this.validations = validations;
	}

	public String getPayout() {
		return this.payout;
	}

	public void setPayout(String payout) {
		this.payout = payout;
	}

	public BREObjectSFDC(Request request, Info info,
			List<Validation> validations,
			String payout) {
		this.request = request;
		this.info = info;
		this.validations = validations;
		this.payout = payout;
	}

}