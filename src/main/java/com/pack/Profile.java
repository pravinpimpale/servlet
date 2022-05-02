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

@WebServlet("/Profile")
public class Profile extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		boolean f=false;
		String vname="";
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		
		if(cookies==null){
			
			String s5="<div style='color:red'>You are new User...Plz Login</div>";
			out.print("<h3 style='margin-left:530px'>"+s5+"</h3>");
			RequestDispatcher rd= req.getRequestDispatcher("Assignment.html");
			rd.include(req, res);
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
			
			RequestDispatcher rd= req.getRequestDispatcher("navigation.html");
			rd.include(req, res);
			out.print("<h1 style='color:green'; style='margin-left:530px';>Hello &nbsp;"+vname+"&nbsp; Welcome to the my Profile...");
		}
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	}

}
