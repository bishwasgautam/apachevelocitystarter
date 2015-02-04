package com.staples.quill.apachevelocity.controllers;

import java.util.List;

import com.staples.quill.apachevelocity.bean.Order;
import com.staples.quill.apachevelocity.data.DataRepository;
import com.staples.quill.apachevelocity.dataaccess.OrderService;

public class OrderController extends VelocityController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OrderService _orderService;
	private List<Order> _pendingOrders; 
	
	public OrderController(){
		
		_orderService = new OrderService();		
	}
	
	
	

}
