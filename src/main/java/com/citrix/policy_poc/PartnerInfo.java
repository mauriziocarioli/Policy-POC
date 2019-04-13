package com.citrix.policy_poc;

import com.citrix.policy_poc.*;
import java.io.Serializable;
import java.lang.String;
import java.time.LocalDate;

public class PartnerInfo implements Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Tags")
	private Tag tags;
	@org.kie.api.definition.type.Label(value = "Partner Type")
	private String partner_Type;
	@org.kie.api.definition.type.Label(value = "Partner Level")
	private String partner_Level;
	@org.kie.api.definition.type.Label(value = "Partner Status")
	private String partner_Status;
	@org.kie.api.definition.type.Label(value = "Partner Geo")
	private String partner_Geo;
	@org.kie.api.definition.type.Label(value = "Partner Area")
	private String partner_Area;
	@org.kie.api.definition.type.Label(value = "Partner Region")
	private String partner_Region;
	@org.kie.api.definition.type.Label(value = "Partner_Territory")
	private String partner_Territory;
	@org.kie.api.definition.type.Label(value = "Partner Compliance")
	private String partner_Compliance;
	@org.kie.api.definition.type.Label(value = "Partner Membership Start Date")
	private LocalDate partner_Mship_Start_Date;
	@org.kie.api.definition.type.Label(value = "Partner Membership End Date")
	private LocalDate partner_Mship_End_Date;
	@org.kie.api.definition.type.Label(value = "Partner Membership Inception Date")
	private LocalDate partner_Mship_Inception_Date;

	public PartnerInfo() {
	}

	public com.citrix.Tag getTags() {
		return this.tags;
	}

	public void setTags(com.citrix.Tag tags) {
		this.tags = tags;
	}

	public String getPartner_Type() {
		return this.partner_Type;
	}

	public void setPartner_Type(String partner_Type) {
		this.partner_Type = partner_Type;
	}

	public String getPartner_Level() {
		return this.partner_Level;
	}

	public void setPartner_Level(String partner_Level) {
		this.partner_Level = partner_Level;
	}

	public String getPartner_Status() {
		return this.partner_Status;
	}

	public void setPartner_Status(String partner_Status) {
		this.partner_Status = partner_Status;
	}

	public String getPartner_Geo() {
		return this.partner_Geo;
	}

	public void setPartner_Geo(String partner_Geo) {
		this.partner_Geo = partner_Geo;
	}

	public String getPartner_Area() {
		return this.partner_Area;
	}

	public void setPartner_Area(String partner_Area) {
		this.partner_Area = partner_Area;
	}

	public String getPartner_Region() {
		return this.partner_Region;
	}

	public void setPartner_Region(String partner_Region) {
		this.partner_Region = partner_Region;
	}

	public String getPartner_Territory() {
		return this.partner_Territory;
	}

	public void setPartner_Territory(String partner_Territory) {
		this.partner_Territory = partner_Territory;
	}

	public String getPartner_Compliance() {
		return this.partner_Compliance;
	}

	public void setPartner_Compliance(String partner_Compliance) {
		this.partner_Compliance = partner_Compliance;
	}

	public LocalDate getPartner_Mship_Start_Date() {
		return this.partner_Mship_Start_Date;
	}

	public void setPartner_Mship_Start_Date(
			LocalDate partner_Mship_Start_Date) {
		this.partner_Mship_Start_Date = partner_Mship_Start_Date;
	}

	public LocalDate getPartner_Mship_End_Date() {
		return this.partner_Mship_End_Date;
	}

	public void setPartner_Mship_End_Date(
			LocalDate partner_Mship_End_Date) {
		this.partner_Mship_End_Date = partner_Mship_End_Date;
	}

	public LocalDate getPartner_Mship_Inception_Date() {
		return this.partner_Mship_Inception_Date;
	}

	public void setPartner_Mship_Inception_Date(
			LocalDate partner_Mship_Inception_Date) {
		this.partner_Mship_Inception_Date = partner_Mship_Inception_Date;
	}

	public PartnerInfo(com.citrix.Tag tags, String partner_Type,
			String partner_Level, String partner_Status,
			String partner_Geo, String partner_Area,
			String partner_Region,
			String partner_Territory,
			String partner_Compliance,
			LocalDate partner_Mship_Start_Date,
			LocalDate partner_Mship_End_Date,
			LocalDate partner_Mship_Inception_Date) {
		this.tags = tags;
		this.partner_Type = partner_Type;
		this.partner_Level = partner_Level;
		this.partner_Status = partner_Status;
		this.partner_Geo = partner_Geo;
		this.partner_Area = partner_Area;
		this.partner_Region = partner_Region;
		this.partner_Territory = partner_Territory;
		this.partner_Compliance = partner_Compliance;
		this.partner_Mship_Start_Date = partner_Mship_Start_Date;
		this.partner_Mship_End_Date = partner_Mship_End_Date;
		this.partner_Mship_Inception_Date = partner_Mship_Inception_Date;
	}

}