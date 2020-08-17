package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public Connection getconnection() throws SQLException, ClassNotFoundException {
		//Register the Driver class
		Class.forName("oracle.jdbc.OracleDriver");
		
		//create the connection Object
		Connection con=null;
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sa123"); //url for connecting database
		
		if(con!=null) 
			System.out.println("Established");
		
		return con;
		
	}
	
}
