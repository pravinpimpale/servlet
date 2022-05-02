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

@WebServlet("/Cookies1")
public class Cookies1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("username");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
//		out.print("<h1> Hello &nbsp;"+name+"&nbsp;Welcome to my page");
		out.print("<h1>Thank You !!!!!</h1>");
		
		//getting all cookies from request object
		
		Cookie[] cookies=req.getCookies();
		boolean f=false;
		String vname="";
		
		if(cookies==null){
			RequestDispatcher rd= req.getRequestDispatcher("cookies.html");
			rd.forward(req, res);
			out.print("<h1>You are new User go to home page</h1>");
		}else {
			for(Cookie c1:cookies) {
				String cname=c1.getName();//fetch key name
				if(cname.equals("uname")) {
					f=true;
					 vname=c1.getValue();
				}
			}
		}
		
		if(f) {
			out.print("<h1>Hello &nbsp;"+vname+"&nbsp; Welcome back to my website");
		}
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
