package com.IET.beans;

public class UserInfo {

	private String uname;
	private String password;
	private String role;
	private String skills;

	public UserInfo() {
		super();
	}

	public UserInfo(String uname, String password, String role, String skills) {
		super();
		this.uname = uname;
		this.password = password;
		this.role = role;
		this.skills = skills;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "UserInfo [uname=" + uname + ", password=" + password + ", role=" + role + ", skills=" + skills + "]";
	}

	
}
