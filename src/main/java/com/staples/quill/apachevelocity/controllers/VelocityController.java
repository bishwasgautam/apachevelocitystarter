package com.staples.quill.apachevelocity.controllers;

import org.apache.velocity.tools.view.VelocityViewServlet;

public class VelocityController extends VelocityViewServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public void setContextObject(Object obj, String name){
		
		super.getServletContext().setAttribute(name, obj);
		
	}
	
	

}


