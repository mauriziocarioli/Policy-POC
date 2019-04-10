package com.citrix;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Order Header")
	private com.citrix.OrderHeader orderHeader;
	@org.kie.api.definition.type.Label(value = "Order Line Items")
	private java.util.List<com.citrix.OrderLineItem> orderLineItems;

	public Order() {
	}

	public com.citrix.OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(com.citrix.OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public java.util.List<com.citrix.OrderLineItem> getOrderLineItems() {
		return this.orderLineItems;
	}

	public void setOrderLineItems(
			java.util.List<com.citrix.OrderLineItem> orderLineItems) {
		this.orderLineItems = orderLineItems;
	}

	public Order(com.citrix.OrderHeader orderHeader,
			java.util.List<com.citrix.OrderLineItem> orderLineItems) {
		this.orderHeader = orderHeader;
		this.orderLineItems = orderLineItems;
	}

}