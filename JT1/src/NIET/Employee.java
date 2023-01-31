package NIET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
	public static void main (String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/exp2";
		String uname="root";
		String pass = "manager";
		String query = "select * from emp";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		String userData=" ";
		
		while(rs.next ())
		{
			userData=rs.getInt(1)+ " : "+rs.getString(2);
			System.out.println(userData);
		}

		st.close();
		con.close();
	}
}




	