package niet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login1Servlet
 */
@WebServlet("/Login1Servlet")
public class Login1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/niet","root","manager");
			String n=request.getParameter("txtName");
			String p=request.getParameter("txtPwd");
			PreparedStatement ps=con.prepareStatement("Select uname from login where uname=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);

			}
			else
			{
				out.println("<font color=red size=18>Login failed!<br>");
				out.println("<a href=input.jsp>Try Again!!</a>");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}

