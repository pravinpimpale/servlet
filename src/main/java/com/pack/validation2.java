package com.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/validation2")
public class validation2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String s=(String) req.getAttribute("val");
		String s2="Admin";
		
		
			out.print("<h3 style='margin-left:530px'>"+s+"</h3>");
			RequestDispatcher rd1= req.getRequestDispatcher("/validationForm.html");
			rd1.include(req, res);
		
		
		
	}

}
