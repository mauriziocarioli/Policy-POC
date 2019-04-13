package com.citrix.policy_poc;

import java.io.Serializable;
import java.util.List;

@org.kie.api.definition.type.Label("Order")
public class Order implements Serializable {

	private static final long serialVersionUID = 6810510455129323181L;
	
	@org.kie.api.definition.type.Label("Order Header")
	private OrderHeader orderHeader;
	@org.kie.api.definition.type.Label("Order Line Items")
	private List<OrderLineItem> orderLineItems;

	public Order() {
	}

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public List<OrderLineItem> getOrderLineItems() {
		return this.orderLineItems;
	}

	public void setOrderLineItems(
			List<OrderLineItem> orderLineItems) {
		this.orderLineItems = orderLineItems;
	}

	public Order(OrderHeader orderHeader,
			List<OrderLineItem> orderLineItems) {
		this.orderHeader = orderHeader;
		this.orderLineItems = orderLineItems;
	}

}
