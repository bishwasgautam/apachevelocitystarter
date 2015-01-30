package com.staples.quill.apachevelocity.bean;
 
public class User {
 
    private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String address;
 
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User() {
    }
 
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }
 
    // other setter - getter
}