package com.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validation1")
public class validation1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("username");
		String s2=req.getParameter("password");
		String s3="Admin";
		String s4="admin@123";
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		if(s1.equals(s3) && s2.equals(s4)) {
			String s5="<div style='color:green'>You are Successfull Login</div>";
			req.setAttribute("val", s5);
			RequestDispatcher rd= req.getRequestDispatcher("/validation2");
			rd.forward(req, res);
		}
		else {
			String s5="<div style='color:red'>Invalid Login...Plz try again</div>";
			req.setAttribute("val", s5);
			RequestDispatcher rd= req.getRequestDispatcher("/validation2");
			rd.forward(req, res);
			
			
			
		}
		
		
		
	}

}
