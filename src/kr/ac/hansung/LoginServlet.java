package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read 'index.html' form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Process: access to database, perform business login
		
		// Build HTML code
		PrintWriter out = response.getWriter();
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> Your username is " + username + ".</h2>";
		htmlResponse += "<h2> Your password is " + password + ".</h2>";
		htmlResponse += "<html>";
		
		out.println(htmlResponse);
	}

}
