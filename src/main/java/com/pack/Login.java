package com.pack;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
		
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Hello dear&nbsp;" +name+ "You Have Successfully Login</h1>");
		out.println("<a href='welcome'>Click here to continue</a>");
		out.println("<hr>");
		
		ServletConfig conf= getServletConfig();
		ServletContext conf1= getServletContext();
		String val1=conf1.getInitParameter("UserName");
		String val =conf.getInitParameter("Developer");
		
		out.println("<h4 style='text-align:right;font-style:italic'>Developed by "+val1+"</h4>");
		
	}

}
