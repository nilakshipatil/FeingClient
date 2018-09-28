package com.FeignClient2;

public class User {

	private int id;
	private String first_name;
	private String last_name;
	private String avatar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(int id, String first_name, String last_name, String avatar) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.avatar = avatar;
	}
	public User(){}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", avatar=" + avatar
				+ "]";
	}
	
}
