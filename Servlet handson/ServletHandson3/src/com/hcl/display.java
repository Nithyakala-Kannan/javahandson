package com.hcl;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public display() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String phoneNumber=request.getParameter("phone");
		String email=request.getParameter("email");
		String city=request.getParameter("city");
		pw.println("<table style='border=1px; margin-left:auto; margin-right:auto;'>");
		pw.println("<tr><td>Name</td><td>"+name+"</td></tr>");
		pw.println("<tr><td>Phone Number</td><td>"+phoneNumber+"</td></tr>");
		pw.println("<tr><td>Email</td><td>"+email+"</td></tr>");
		pw.println("<tr><td>City</td><td>"+city+"</td></tr>");
		pw.println("</table>");
		
	}

}
