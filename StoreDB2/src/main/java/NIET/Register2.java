package NIET;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register2
 */
@WebServlet("/Register2")
public class Register2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String pin=request.getParameter("pin");
		String dname=request.getParameter("dname");
		String position=request.getParameter("position");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/niet","root","manager");
			PreparedStatement ps=con.prepareStatement("insert into member2 values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, phone);
			ps.setString(5, address);
			ps.setString(6, pin);
			ps.setString(7, dname);
			ps.setString(8, position);
			ps.setString(9, uname);
			ps.setString(10, password);
			
			int i=ps.executeUpdate();
			if(i>0) {
				out.println("You are successfully registered");
				out.println("Go to login Page: <a href='formLogin.jsp'>Click me!</a>");
			}
	
				
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
