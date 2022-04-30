package com.pack;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class Emp1 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ServletConfig conf= getServletConfig();
		ServletContext conf1= getServletContext();
		String val=conf1.getInitParameter("EmpName");
		
		String val1 =conf.getInitParameter("empname");
		String val2 =conf.getInitParameter("empsalary");
		String val3 =conf.getInitParameter("empdepartment");
		String val4 =conf.getInitParameter("empid");
		
		out.print("<html>");
		out.print("<table border='2' width='600' cellspacing='0' cellpadding='0' border-spacing='0' style='margin-left:350px;padding:10px;'");
		out.print("<tr>");
		out.print("<th>");
		out.print("Emp Id");
		out.print("</th>");
		out.print("<th>");
		out.print("Emp Name");
		out.print("</th>");
		out.print("<th>");
		out.print("Emp Department");
		out.print("</th>");
		out.print("<th>");
		out.print("Emp Company");
		out.print("</th>");
		out.print("<th>");
		out.print("Emp Salary");
		out.print("</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>");
		out.print(val4);
		out.print("</td>");
		out.print("<td>");
		out.print(val1);
		out.print("</td>");
		out.print("<td>");
		out.print(val3);
		out.print("</td>");
		out.print("<td>");
		out.print(val);
		out.print("</td>");
		out.print("<td>");
		out.print(val2);
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<div><a href='emp.html'>Home</a><br>\r\n"
				+ "	<a href='emp2'>Employee 2</a><br>\r\n"
				+ "	<a href='emp3'>Employee 3</a><br></div>");
		out.print("</html>");
	}

}
