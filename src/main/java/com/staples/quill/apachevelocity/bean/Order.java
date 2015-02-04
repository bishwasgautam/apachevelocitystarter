package com.staples.quill.apachevelocity.bean;

import java.util.Date;

public class Order {

	private String OrderNumber;
	public String getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}


	private String CustomerId;
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	private String TotalItems;
	public String getTotalItems() {
		return TotalItems;
	}
	public void setTotalItems(String totalItems) {
		TotalItems = totalItems;
	}


	private double OrderTotal;
	public double getOrderTotal() {
		return OrderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		OrderTotal = orderTotal;
	}

	private Date OrderTimestamp;
	public Date getOrderTimestamp() {
		return OrderTimestamp;
	}
	public void setOrderTimestamp(Date orderTimestamp) {
		OrderTimestamp = orderTimestamp;
	}
	
	private ShippingInfo shippingInfo;
	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(ShippingInfo shipInfo) {
		this.shippingInfo = shipInfo;
	}

	
	public Order(String orderNumber, String customerId, String totalItems,
			double orderTotal, Date orderTimestamp, ShippingInfo shippingInfo) {
		super();
		OrderNumber = orderNumber;
		CustomerId = customerId;
		TotalItems = totalItems;
		OrderTotal = orderTotal;
		OrderTimestamp = orderTimestamp;
		this.shippingInfo = shippingInfo;
	}
	
	/*Constructor*/
	public Order(){
	
		
	}
	
	@Override
	public String toString(){
		
		return "";
		
	}
	
	
}
