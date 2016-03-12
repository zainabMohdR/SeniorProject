package com.seniorproject.wichat.data;

public class PersonInfo {
	int id = -1;
	String name = "";
	String email = "";

	public PersonInfo() {
	}

	public PersonInfo(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	/* set and get id */
	public void setID(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}
	
	/* set and get name*/
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	/* set and get name*/
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
