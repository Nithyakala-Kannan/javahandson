package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exhibition")
public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Exhibition() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	     PrintWriter pw=response.getWriter();
	     pw.println("<head>");
	     pw.println("<style>");
	     pw.println("table.center{");
	     pw.println("margin-left:auto;");
	     pw.println("margin-right:auto;");
	     pw.println("}");
	     pw.println("</style></head>");
	     pw.println("<body style=text-align:center;>");
	     pw.println("<h1 style=color:green;>TextFair 2018 Expo</h1>");
	     pw.println("<table class='center' id='exhibition' border=1 style=align-center;>");
	     pw.println("<tr><th>Name</th><th>TextFair 2017 Expo</th></tr>");
	     pw.println("<tr><td>HallName</td><td>PVR superplex</td></tr>");
	     pw.println("<tr><td>Start Date</td><td>10-10-2010</td></tr>");
	     pw.println("<tr><td>End Date</td><td>10-12-2019</td></tr>");
	     pw.println("</table>");
	     pw.println("</body>");
	     
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
