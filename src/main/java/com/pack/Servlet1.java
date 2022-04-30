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


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int n1=Integer.parseInt(req.getParameter("t1"));
		int n2=Integer.parseInt(req.getParameter("t1"));
		int n3=Integer.parseInt(req.getParameter("t1"));
		
		int sum=n1+n2+n3;
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		ServletContext conf=getServletContext();
		conf.setAttribute("val", sum);
		out.println("<a href='Servlet2'>Go to servlet 2</a>");
		
//		req.setAttribute("val", sum);
//		
//		RequestDispatcher rd= req.getRequestDispatcher("/Servlet2");
//		rd.forward(req, res);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
