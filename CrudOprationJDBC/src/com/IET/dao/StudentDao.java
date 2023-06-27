package com.IET.dao;

import java.util.List;

import com.IET.bean.Student;

public interface StudentDao {

	void save(Student st);

	void closeConnection();

	List<Student> getAllStudent();

	Student getById(int id);

	boolean deleteById(int id);

}
