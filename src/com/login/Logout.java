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

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// for debug purpose
		System.out.println("~~~~~ INFO: inside Logout.java ~~~~~");
		
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
		
		// for debug purpose
		System.out.println("~~~~~ INFO: redirecting to login.jsp ~~~~~");
		
		response.sendRedirect("login.jsp");
	}

}
