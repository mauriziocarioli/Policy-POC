package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.time.LocalDate;

public class PartnerInfo implements Serializable {

	private static final long serialVersionUID = 7348713232086389645L;
	
	@org.kie.api.definition.type.Label("Tags")
	private Tag Tags;
	@org.kie.api.definition.type.Label(value = "Partner Type")
	private String Partner_Type;
	@org.kie.api.definition.type.Label(value = "Partner Level")
	private String Partner_Level;
	@org.kie.api.definition.type.Label(value = "Partner Status")
	private String Partner_Status;
	@org.kie.api.definition.type.Label(value = "Partner Geo")
	private String Partner_Geo;
	@org.kie.api.definition.type.Label(value = "Partner Area")
	private String Partner_Area;
	@org.kie.api.definition.type.Label(value = "Partner Region")
	private String Partner_Region;
	@org.kie.api.definition.type.Label(value = "Partner_Territory")
	private String Partner_Territory;
	@org.kie.api.definition.type.Label(value = "Partner Compliance")
	private String Partner_Compliance;
	@org.kie.api.definition.type.Label(value = "Partner Membership Start Date")
	private LocalDate Partner_Mship_Start_Date;
	@org.kie.api.definition.type.Label(value = "Partner Membership End Date")
	private LocalDate Partner_Mship_End_Date;
	@org.kie.api.definition.type.Label(value = "Partner Membership Inception Date")
	private LocalDate Partner_Mship_Inception_Date;

	public Tag getTags() {
		return this.Tags;
	}

	public void setTags(Tag Tags) {
		this.Tags = Tags;
	}

	public String getPartner_Type() {
		return this.Partner_Type;
	}

	public void setPartner_Type(String Partner_Type) {
		this.Partner_Type = Partner_Type;
	}

	public String getPartner_Level() {
		return this.Partner_Level;
	}

	public void setPartner_Level(String Partner_Level) {
		this.Partner_Level = Partner_Level;
	}

	public String getPartner_Status() {
		return this.Partner_Status;
	}

	public void setPartner_Status(String Partner_Status) {
		this.Partner_Status = Partner_Status;
	}

	public String getPartner_Geo() {
		return this.Partner_Geo;
	}

	public void setPartner_Geo(String Partner_Geo) {
		this.Partner_Geo = Partner_Geo;
	}

	public String getPartner_Area() {
		return this.Partner_Area;
	}

	public void setPartner_Area(String Partner_Area) {
		this.Partner_Area = Partner_Area;
	}

	public String getPartner_Region() {
		return this.Partner_Region;
	}

	public void setPartner_Region(String Partner_Region) {
		this.Partner_Region = Partner_Region;
	}

	public String getPartner_Territory() {
		return this.Partner_Territory;
	}

	public void setPartner_Territory(String Partner_Territory) {
		this.Partner_Territory = Partner_Territory;
	}

	public String getPartner_Compliance() {
		return this.Partner_Compliance;
	}

	public void setPartner_Compliance(String Partner_Compliance) {
		this.Partner_Compliance = Partner_Compliance;
	}

	public LocalDate getPartner_Mship_Start_Date() {
		return this.Partner_Mship_Start_Date;
	}

	public void setPartner_Mship_Start_Date(LocalDate Partner_Mship_Start_Date) {
		this.Partner_Mship_Start_Date = Partner_Mship_Start_Date;
	}

	public LocalDate getPartner_Mship_End_Date() {
		return this.Partner_Mship_End_Date;
	}

	public void setPartner_Mship_End_Date(LocalDate Partner_Mship_End_Date) {
		this.Partner_Mship_End_Date = Partner_Mship_End_Date;
	}

	public LocalDate getPartner_Mship_Inception_Date() {
		return this.Partner_Mship_Inception_Date;
	}

	public void setPartner_Mship_Inception_Date(LocalDate Partner_Mship_Inception_Date) {
		this.Partner_Mship_Inception_Date = Partner_Mship_Inception_Date;
	}

	public PartnerInfo(Tag Tags, String Partner_Type, String Partner_Level, String Partner_Status, String Partner_Geo, String Partner_Area, String Partner_Region, String Partner_Territory, String Partner_Compliance, LocalDate Partner_Mship_Start_Date, LocalDate Partner_Mship_End_Date, LocalDate Partner_Mship_Inception_Date) {
		this.Tags = Tags;
		this.Partner_Type = Partner_Type;
		this.Partner_Level = Partner_Level;
		this.Partner_Status = Partner_Status;
		this.Partner_Geo = Partner_Geo;
		this.Partner_Area = Partner_Area;
		this.Partner_Region = Partner_Region;
		this.Partner_Territory = Partner_Territory;
		this.Partner_Compliance = Partner_Compliance;
		this.Partner_Mship_Start_Date = Partner_Mship_Start_Date;
		this.Partner_Mship_End_Date = Partner_Mship_End_Date;
		this.Partner_Mship_Inception_Date = Partner_Mship_Inception_Date;
	}

	public PartnerInfo() {
	}

}