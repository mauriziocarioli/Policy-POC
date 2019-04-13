package com.citrix.policy_poc;

import java.io.Serializable;

@org.kie.api.definition.type.Label("Tag")
public class Tag implements Serializable {


	@org.kie.api.definition.type.Label("Tag ID")
	private String tagID;
	@org.kie.api.definition.type.Label("Tag Name")
	private String tagName;

	public Tag() {
	}

	public String gettagID() {
		return this.tagID;
	}

	public void settagID(String tagID) {
		this.tagID = tagID;
	}

	public String gettagName() {
		return this.tagName;
	}

	public void settagName(String tagName) {
		this.tagName = tagName;
	}

	public Tag(String tagID, String tagName) {
		this.tagID = tagID;
		this.tagName = tagName;
	}

}