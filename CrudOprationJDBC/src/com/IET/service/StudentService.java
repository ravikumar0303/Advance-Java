package com.IET.service;

import java.util.List;

import com.IET.bean.Student;

public interface StudentService {

	void getNewStudent();

	void closeConnection();

	List<Student> displayAll();

	Student displayById(int id);

	boolean deleteById(int id);

	List<Student> displaySorted();

}
