package com.pack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("username");
		String passwprd=req.getParameter("password");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<h1> Hello&nbsp; "+name+"&nbsp; Welcome to my page");
		out.print("<h1> Hello &nbsp;"+passwprd+"&nbsp;Welcome to my page &nbsp;");
		out.print("<a href='Cookies1'>Go to Cookies1</a>");
		
		Cookie c = new Cookie("uname",name);
		res.addCookie(c);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
