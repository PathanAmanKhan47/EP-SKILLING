package student.Connections;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
	
	final static String forNameURL="com.mysql.jdbc.Driver";
	final static String dbURL="jdbc:mysql:@localhost:3306:student";
	final static String username="system";
	final static String password="123456";
	public static Connection DBConnection() throws SQLException,ClassNotFoundException
	{
		Class.forName(forNameURL);
		Connection con = DriverManager.getConnection(dbURL,username,password);
		return con;
	}

}
