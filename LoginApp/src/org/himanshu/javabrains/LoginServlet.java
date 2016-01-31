package org.himanshu.javabrains;
import org.himanshu.javabrains.dto.User;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.himanshu.javabrains.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId, password;
		
		userId =request.getParameter("userId");
		password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userId, password);
		if (result){
			User user = loginService.getUserDetails(userId);
			request.setAttribute("user", user);
			//request.getSession().setAttribute("user", user);
			//response.sendRedirect("success.jsp");
			RequestDispatcher view = request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
			return;
		}else{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
