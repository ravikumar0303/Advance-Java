import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class CallableStatementTest {
  public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://192.168.10.150:3306/dac57","dac57","welcome");
	   
		
		int id=6001;
		
		CallableStatement cs=conn.prepareCall("call getstudent(?,?)");
		cs.setInt(1, id);
		cs.registerOutParameter(1, java.sql.Types.INTEGER);
		cs.execute();
		int c=cs.getInt(2);
		System.out.println(c);
		conn.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
