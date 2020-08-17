package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {


	public boolean validate(LoginPojo loginpojo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String username=loginpojo.getUsername();
		String password=loginpojo.getPassword();
		
		ConnectionManager con=new ConnectionManager();
		Statement st= con.getconnection().createStatement();
		
		ResultSet rs=st.executeQuery("select * from USERDETAILS");
		
		boolean b=false;
		while(rs.next())
		{
			if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD")))
			{
				con.getconnection().close();
				return true;
			}
			else
			{
				con.getconnection().close();
				//return false;
			}
		}
		return false;
		
	}

}