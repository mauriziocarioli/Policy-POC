package net.citrite.pip.sfdc;

import java.io.Serializable;

@org.kie.api.definition.type.Label("Order Line Item")
public class OrderLineItem implements Serializable {

	private static final long serialVersionUID = 6096103652478769199L;
	
	@org.kie.api.definition.type.Label(value = "Order ID")
	private String order_ID;
	@org.kie.api.definition.type.Label(value = "OrderLine ID")
	private String orderLine_ID;
	@org.kie.api.definition.type.Label(value = "Product Type")
	private String product_Type;
	@org.kie.api.definition.type.Label(value = "Edition")
	private String edition;
	@org.kie.api.definition.type.Label(value = "SKU Marketing")
	private String SKU_Marketing;
	@org.kie.api.definition.type.Label(value = "Product Line ID")
	private String product_Line_ID;
	@org.kie.api.definition.type.Label(value = "Discount Program")
	private Double discount_Program;
	@org.kie.api.definition.type.Label(value = "Discount Channel")
	private Double discount_Channel;
	@org.kie.api.definition.type.Label(value = "Discount Program Amount")
	private Double discount_Program_Amount;
	@org.kie.api.definition.type.Label(value = "SRP USD")
	private Double SRP_USD;

	public OrderLineItem() {
	}

	public String getOrder_ID() {
		return this.order_ID;
	}

	public void setOrder_ID(String order_ID) {
		this.order_ID = order_ID;
	}

	public String getOrderLine_ID() {
		return this.orderLine_ID;
	}

	public void setOrderLine_ID(String orderLine_ID) {
		this.orderLine_ID = orderLine_ID;
	}

	public String getProduct_Type() {
		return this.product_Type;
	}

	public void setProduct_Type(String product_Type) {
		this.product_Type = product_Type;
	}

	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getSKU_Marketing() {
		return this.SKU_Marketing;
	}

	public void setSKU_Marketing(String SKU_Marketing) {
		this.SKU_Marketing = SKU_Marketing;
	}

	public String getProduct_Line_ID() {
		return this.product_Line_ID;
	}

	public void setProduct_Line_ID(String product_Line_ID) {
		this.product_Line_ID = product_Line_ID;
	}

	public Double getDiscount_Program() {
		return this.discount_Program;
	}

	public void setDiscount_Program(Double discount_Program) {
		this.discount_Program = discount_Program;
	}

	public Double getDiscount_Channel() {
		return this.discount_Channel;
	}

	public void setDiscount_Channel(Double discount_Channel) {
		this.discount_Channel = discount_Channel;
	}

	public Double getDiscount_Program_Amount() {
		return this.discount_Program_Amount;
	}

	public void setDiscount_Program_Amount(
			Double discount_Program_Amount) {
		this.discount_Program_Amount = discount_Program_Amount;
	}

	public Double getSRP_USD() {
		return this.SRP_USD;
	}

	public void setSRP_USD(Double SRP_USD) {
		this.SRP_USD = SRP_USD;
	}

	public OrderLineItem(String order_ID,
			String orderLine_ID, String product_Type,
			String edition, String SKU_Marketing,
			String product_Line_ID,
			Double discount_Program,
			Double discount_Channel,
			Double discount_Program_Amount, Double SRP_USD) {
		this.order_ID = order_ID;
		this.orderLine_ID = orderLine_ID;
		this.product_Type = product_Type;
		this.edition = edition;
		this.SKU_Marketing = SKU_Marketing;
		this.product_Line_ID = product_Line_ID;
		this.discount_Program = discount_Program;
		this.discount_Channel = discount_Channel;
		this.discount_Program_Amount = discount_Program_Amount;
		this.SRP_USD = SRP_USD;
	}

}