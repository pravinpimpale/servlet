package com.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login1")
public class Login1 extends HttpServlet {
	
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
			RequestDispatcher rd1= req.getRequestDispatcher("/navigation.html");
			rd1.include(req, res);
			out.print("<h1> Hello&nbsp; "+s1+"&nbsp; Welcome to my page");
			out.print("<h3 style='margin-left:530px'>"+s5+"</h3>");
			Cookie c = new Cookie("uname",s1);
			res.addCookie(c);
		}
		else {
			String s5="<div style='color:red'>Invalid Login...Plz try again</div>";
			out.print("<h3 style='margin-left:530px'>"+s5+"</h3>");
			RequestDispatcher rd1= req.getRequestDispatcher("/Assignment.html");
			rd1.include(req, res);
		}
		
	}

}
