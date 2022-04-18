package com.example.student.model;

import java.io.Serializable;

public class JwtResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String token;
	
	public JwtResponse() {
		super();
	}

	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "JwtResponse [token=" + token + "]";
	}
	
	

	
	

}
