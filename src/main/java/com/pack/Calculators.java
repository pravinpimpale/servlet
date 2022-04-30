package com.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/Calculators")
public class Calculators extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		int n1=Integer.parseInt(req.getParameter("t1"));
		int n2=Integer.parseInt(req.getParameter("t2"));
		String opr=req.getParameter("opr");
		res.setContentType("text/tml");
		PrintWriter out=res.getWriter();
		int sum=0;
		
		if(opr.equalsIgnoreCase("add"))
		{
			sum=n1+n2;
			out.print(sum);
			RequestDispatcher rd1=req.getRequestDispatcher("cal.html");
			rd1.include(req, res);
		}else if(opr.equalsIgnoreCase("sub"))
		{
			sum=n1-n2;
			out.print(sum);
			RequestDispatcher rd1=req.getRequestDispatcher("cal.html");
			rd1.include(req, res);
		}else if(opr.equalsIgnoreCase("mul"))
		{
			sum=n1*n2;
			out.print(sum);
			RequestDispatcher rd1=req.getRequestDispatcher("cal.html");
			rd1.include(req, res);
		}else if(opr.equalsIgnoreCase("div"))
		{
			sum=n1/n2;
			out.print(sum);
			RequestDispatcher rd1=req.getRequestDispatcher("cal.html");
			rd1.include(req, res);
		}else {
			out.print("Invalid Inpute");
			RequestDispatcher rd=req.getRequestDispatcher("cal.html");
			rd.include(req, res);
		}
	}

}
