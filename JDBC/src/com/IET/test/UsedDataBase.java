package com.IET.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsedDataBase {
	public static void main(String[] args) {

//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());	 

//		String url="jdbc:mysql://localhost:3306/dac57","dac57","welcome";
//		Connection conn=DriverManager.getConnection(url,"root","root123");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.10.150:3306/dac57", "dac57", "welcome");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");

			while (rs.next()) {

				System.out.println("Emp empno.." + rs.getInt("empno"));

				String ravi = rs.getString("ename");
				System.out.println("Employee Name.." + ravi + "\n");
			}
			conn.close();

		}

//		   
//		if(conn!=null) {
//			System.out.println("Welcome To mySql Jdbc......");
//		}
//		else {
//			
//			System.out.println("Welcome To mySql Jdbc......");
//		}
//			
//		}

		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
