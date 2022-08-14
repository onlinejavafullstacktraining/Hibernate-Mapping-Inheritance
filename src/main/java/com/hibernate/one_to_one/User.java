package com.hibernate.one_to_one;

import java.io.Serializable;


public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User() {

	}
	
	private Long id;
	private String userName;
	private Address address;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
