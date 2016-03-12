package com.seniorproject.wichat.data;

public class UserInfo extends PersonInfo{
	String address = "";
	String phone = "";
	String deleobj = "";

	public String getDeleobj() {
		return deleobj;
	}

	public void setDeleobj(String deleobj) {
		this.deleobj = deleobj;
	}

	public UserInfo() {
		super();
	}

	public UserInfo(int id, String name, String email, String address, String phone) {
		super(id, name, email);
		this.address = address;
		this.phone = phone;
	}
	
	/* set and get address*/
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
	/* set and get phone*/
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}
}
