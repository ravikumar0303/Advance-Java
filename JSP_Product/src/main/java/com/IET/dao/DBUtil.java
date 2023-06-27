package com.IET.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection con;

	public static Connection getMyConnection() {

		try {
			if (con == null) {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

				String url = "jdbc:mysql://192.168.10.150:3306/dac57_campus?useSSL=false";

				con = DriverManager.getConnection(url, "dac57", "welcome");

				if (con != null) {
					System.out.println("Connection Done...");
				} else {
					System.out.println("Try Again..");
				}
			}
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public static void closeMyConnection() {
		try {
			if (con != null)

				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
