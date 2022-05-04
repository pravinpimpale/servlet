package com.pack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UrlRewriting1")
public class UrlRewriting1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String n=req.getParameter("uname");
		System.out.println(req.getParameter("uname"));
		out.print("<h3 style='color:blue; font-style:italic;'>Welcome &nbsp;"+ n +"</h3>");
	
//***************************************************************
		
		
		
		
		
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String n=req.getParameter("uname");
		System.out.println(req.getParameter("uname"));
		out.print("<h3 style='color:blue; font-style:italic;'>Welcome &nbsp;"+ n +"</h3>");
	}

}
