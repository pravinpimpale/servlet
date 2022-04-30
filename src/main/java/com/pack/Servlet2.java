package com.pack;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		int n1=Integer.parseInt(req.getParameter("t1"));
//		int n2=Integer.parseInt(req.getParameter("t1"));
//		int n3=Integer.parseInt(req.getParameter("t1"));
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
//		int mul=n1*n2*n3;
		
		ServletContext c=getServletContext();
		int sum=(int) c.getAttribute("val");
		c.setAttribute("val", sum);
		
//		int s= (int)req.getAttribute("val");
		out.print("<h3>Sum :-"+c.getAttribute("val")+"</h3>");
//		out.print("<h3>Mum :-"+mul+"</h3>");
		out.println("<a href='Servlet3'>Go to servlet 2</a>");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
