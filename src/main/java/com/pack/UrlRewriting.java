package com.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UrlRewriting")
public class UrlRewriting extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		res.setContentType("text/html");
//		PrintWriter out=res.getWriter();
//		String name=req.getParameter("username");
//		String pass=req.getParameter("password");
//		if(pass.equals("1234")) {
//			res.sendRedirect("UrlRewriting1?uname"+name);
//		}else {
//			out.print("Invalid Credentials");
//			RequestDispatcher rd= req.getRequestDispatcher("urlrewriting.html");
//			rd.include(req,res);
//		}
		
//*******************************************************************		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String user=req.getParameter("username");
		out.print("<h3 style='color:blue; font-style:italic;'>Welcome &nbsp;"+ user +"</h3>");
		
		out.print("<form action='UrlRewriting1'>");
		out.print("<input type=\"hidden\" name='uname' value='"+user+"'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		
	}

}
