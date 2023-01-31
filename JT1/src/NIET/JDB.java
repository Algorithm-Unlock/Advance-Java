package NIET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDB {

	public static void main (String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/exp2";
		String uname="root";
		String pass = "manager";
		String query = "select username from data where id=2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery (query);
		
		rs.next ();

		String name = rs.getString("username");

		System.out.println(name) ;

		st.close();
		con.close();
	}
}