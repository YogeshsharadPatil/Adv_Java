package com.ysp.Entity;

import java.util.List;

public class UserData {
	private List<User> userdata;

	public UserData() {
		super();
	}

	public UserData(List<User> userdata) {
		super();
		this.userdata = userdata;
	}

	public List<User> getUserdata() {
		return userdata;
	}

	public void setUserdata(List<User> userdata) {
		this.userdata = userdata;
	}
	
	
	
	
}
