package net.citrite.pip.canonical.bre;

import java.io.Serializable;
import java.util.List;
import net.citrite.pip.bre.Validation;
import net.citrite.pip.sfdc.Request;
import net.citrite.pip.sfdc.Info;

public class BREObjectSFDC implements Serializable {

	private static final long serialVersionUID = 5484795051075805077L;
	
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
