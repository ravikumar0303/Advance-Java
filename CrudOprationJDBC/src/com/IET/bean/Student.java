package com.IET.bean;

public class Student {
	
	private int ID;
	private String namefirst;
	private String emailID;
	
	public Student() {
		super();
	}

	public Student(int iD, String namefirst, String emailID) {
		super();
		ID = iD;
		this.namefirst = namefirst;
		this.emailID = emailID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNamefirst() {
		return namefirst;
	}

	public void setNamefirst(String namefirst) {
		this.namefirst = namefirst;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Student [ID..> " + ID + ", namefirst..> " + namefirst + ", emailID..> " + emailID + "]";
	}

	
	

}
