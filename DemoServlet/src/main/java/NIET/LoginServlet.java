package NIET;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("t1");
		String pwd = request.getParameter("t2");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if (n.equals("NIET") && pwd.equals("secret"))
		{
			response.sendRedirect("Login.jsp");
		}
		else
		{
			out.println("Sorry! user or password invalid");
			RequestDispatcher rd = request.getRequestDispatcher("Form.jsp");
			rd.include(request, response);
		}
	}

}
