package com.staples.quill.apachevelocity.dataaccess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.staples.quill.apachevelocity.bean.Order;
import com.staples.quill.apachevelocity.common.CommonUtility;
import com.staples.quill.apachevelocity.data.DataRepository;
import org.json.simple.JSONObject;

/*TODO*/
/*Put logging stuff here */

public class OrderService {

	private DataRepository _repository;
		
	public OrderService(){
	
		_repository = new DataRepository();
			
	}
	
	public List<Order> GetImpendingOrders(){
		
		List<JSONObject> orders = _repository.GetImpendingOrders();
				
		return JsonToObject(orders);
	}
	
	public List<Order> JsonToObject(List<JSONObject> jsonList){
		
		List<Order> orderList = new ArrayList<Order>();
		
		for(Iterator<JSONObject> i = jsonList.iterator(); i.hasNext(); ) {
		    
		    Object obj = CommonUtility.JsonToPOJO(i.next());
		    Order order = null;
		    
		    try{
		    	order = (Order) obj;	
		    }catch(Exception ex){
		    	
		    	ex.printStackTrace();
		    }
		    
		    if(order != null )
		    orderList.add(order);
		}
		
		
		
		return orderList;
				
		
	}
	
	
}
