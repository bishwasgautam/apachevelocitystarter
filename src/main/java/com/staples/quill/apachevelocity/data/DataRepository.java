package com.staples.quill.apachevelocity.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONObject;

public class DataRepository {
	
	public List<JSONObject> GetImpendingOrders(){
		
		List<JSONObject> orders = new ArrayList<JSONObject>();  
		
		JSONObject obj = new JSONObject();

		      obj.put("order_num","100022");
		      obj.put("customer_id",new Integer(100));
		      obj.put("total_items",new Integer(5));
		      obj.put("order_total",new Double(1000.01));
		      obj.put("order_timestamp",new Date());
		      obj.put("shipping_info","deliver to my boat house please");
		      
		      orders.add(obj);
		      
		      return orders;
		     /* StringWriter out = new StringWriter();
		      obj.writeJSONString(out);
		      
		      String jsonText = out.toString();
		      System.out.print(jsonText);*/
		
	}

}
