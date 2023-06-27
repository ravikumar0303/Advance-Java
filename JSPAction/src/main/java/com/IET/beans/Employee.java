package com.IET.beans;

public class Employee {
	
	private int eid;
	private String ename;
	private float sal;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, float sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}

	
	
	

}
