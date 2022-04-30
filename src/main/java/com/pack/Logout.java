package com.pack;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Hello dear You Have Successfully logout</h1>");
		out.println("<a href='welcome.html'>Click here for go to Home Page</a>");
		out.println("<hr>");
		
		ServletConfig conf= getServletConfig();
		ServletContext conf1= getServletContext();
		String val1=conf1.getInitParameter("UserName");
		String val =conf.getInitParameter("Developer");
		out.println("<h4 style='text-align:right;font-style:italic'>Developed by "+val1+"</h4>");
	}
		
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
