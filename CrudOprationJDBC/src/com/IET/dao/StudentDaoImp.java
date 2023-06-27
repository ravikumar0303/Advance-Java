package com.IET.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.IET.bean.Student;

public class StudentDaoImp implements StudentDao {

	private static Connection con;
	private static PreparedStatement psins, psget, psgetById,psdelid;

	static {

		try {
			con = DBUtil.getMyConnection();
			psins = con.prepareStatement("insert into Student values(?,?,?)");
			psget = con.prepareStatement("select * from student");
			psgetById = con.prepareStatement("select * from student where ID=?");
			psdelid=con.prepareStatement("delete from student where ID=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void save(Student st) {

		try {
			psins.setInt(1, st.getID());
			psins.setString(2, st.getNamefirst());
			psins.setString(3, st.getEmailID());
			psins.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		DBUtil.closeMyConnection();
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		try {
			List<Student> lst = new ArrayList();

			ResultSet rs = psget.executeQuery();
			while (rs.next()) {
				lst.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			return lst;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub

		try {
			psgetById.setInt(1, id);
		
		ResultSet rs = psgetById.executeQuery();
		if (rs.next()) {
			return new Student(rs.getInt(1), rs.getString(2), rs.getString(3));

		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		
		try {
			psdelid.setInt(1, id);
			int n=psdelid.executeUpdate();
			return n>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
