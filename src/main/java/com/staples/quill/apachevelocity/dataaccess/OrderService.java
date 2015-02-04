package com.staples.quill.apachevelocity.dataaccess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.staples.quill.apachevelocity.bean.Order;
import com.staples.quill.apachevelocity.common.CommonUtility;
import com.staples.quill.apachevelocity.data.DataRepository;

import org.json.simple.JSONObject;

public class OrderService {

	private DataRepository _repository;
	private CommonUtility _commonUtility;
	
	public OrderService(){
	
		_repository = new DataRepository();
		_commonUtility = new CommonUtility();
		
	}
	
	public List<Order> GetImpendingOrders(){
		
		List<JSONObject> orders = _repository.GetImpendingOrders();
				
		return JsonToObject(orders);
	}
	
	public List<Order> JsonToObject(List<JSONObject> jsonList){
		
		List<Order> orderList = new ArrayList<Order>();
		
		for(Iterator<String> i = jsonList.iterator(); i.hasNext(); ) {
		    
		    Object obj =_commonUtility.JsonToPOJO(i.next());
		    
		    
		}
		
		
		
		return 
				
		
	}
	
	
}