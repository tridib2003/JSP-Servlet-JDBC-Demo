/*
 * author : @tridib2003
 */

package com.login;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDAO;


@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// for debug purpose
		System.out.println("~~~~~ INFO: inside Login.java ~~~~~");
		
		// Fetch username and password
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		LoginDAO loginDao = new LoginDAO();
		
		if (loginDao.verifyUser(uname, pass)) {
			
			// for debug purpose
			System.out.println("~~~~~ INFO: verification successful ~~~~~");
			
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			
			// for debug purpose
			System.out.println("~~~~~ INFO: redirecting to welcome.jsp ~~~~~");
			
			response.sendRedirect("welcome.jsp");
			
		}
		else {
			// for debug purpose
			System.out.println("~~~~~ INFO: verification unsuccessful ~~~~~");
						
			response.sendRedirect("login.jsp");
		}
	
	}
	
}
