package com.staples.quill.apachevelocity.common;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

public class CommonUtility {

	public static Object JsonToPOJO(JSONObject obj) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
				
		Object pojo = null;
		try {
			pojo = mapper.readValue(obj.toJSONString(), Object.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*TODO*/
		/*Cast object to type*/
		
		return pojo;
	}
	
	public static Object JsonToPojo(String filePath){
		
		ObjectMapper mapper = new ObjectMapper();
		Object pojo = null;
		
		try{
			
			pojo = mapper.readValue(new File(filePath), Object.class);
						
		}catch(Exception ex){
			
			
			
		}
		
		return pojo;
		
	}

}
