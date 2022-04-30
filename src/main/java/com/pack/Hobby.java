package com.pack;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class Hobby extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Date d=new Date();
		out.print("Today's date is "+d);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String[] h=req.getParameterValues("hobby");
		
		for(int i=0;i<h.length;i++) {
			out.print("Hobbies:"+h[i]);
		}
		
		Date d=new Date();
		out.print("Today's date is "+d);
	}

}
