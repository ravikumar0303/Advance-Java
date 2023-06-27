package com.IET.service;

import java.util.List;
import java.util.Scanner;
import com.IET.dao.StudentDao;
import com.IET.dao.StudentDaoImp;
import com.IET.bean.Student;


public class StudentServiceImp implements StudentService {

	private StudentDao sdao;

	public StudentServiceImp() {
		super();
		this.sdao = new StudentDaoImp();
	}

	@Override
	public void getNewStudent() {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Student prn.");
		int prn = sc.nextInt();
		System.out.println("Enter First Name..");
		String fn = sc.next();
		System.out.println("Enter Std emailID..");
		String em = sc.next();
		Student st=new Student(prn,fn,em);
             
		sdao.save(st);
	}
	
	
	public void closeConnection() {
		sdao.closeConnection();
	}

	@Override
	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return sdao.getAllStudent();
	}

	@Override
	public Student displayById(int id) {
		// TODO Auto-generated method stub
		return sdao.getById(id);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return sdao.deleteById(id);
	}

	@Override
	public List<Student> displaySorted() {
		// TODO Auto-generated method stub
		return null;
	}

}
