package com.ty.dto;

public class Cart {
	private int id;
	private String email;
	private String pwd;
	private String username;
	private String address;
	public Cart(int id, String email, String pwd, String username, String address) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
		this.username = username;
		this.address = address;
	}
	public Cart() {
	}
	
	public Cart(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", email=" + email + ", pwd=" + pwd + ", username=" + username + ", address="
				+ address + "]";
	}
	
	

}
