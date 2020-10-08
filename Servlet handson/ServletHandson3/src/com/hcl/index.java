package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
	     PrintWriter pw=response.getWriter();
	     pw.println("<body style=text-align:center;>");
	     pw.println("<h1>User Details</h1>");
	     pw.println("<table style='margin-left:auto; margin-right:auto;'>");
	     pw.println("<form action='./display' method='post'>");
	     pw.println("<tr ><td>Name:</td><td><input type='text' name='name'></td></tr>");
	     pw.println("<tr ><td>Phone Number:</td><td><input type='text' name='phone'></td></tr>");
	     pw.println("<tr ><td>Email:</td><td><input type='text' name='email'></td></tr>");
	     pw.println("<tr ><td>City:</td><td><input type='text' name='city'></td></tr>");
	     pw.println("<tr><td></td><td><input type='submit' value='Submit' name='submit'></td></tr>");
	     pw.println("</form>");
	     pw.println("</table>");
	     pw.println("</body"); 
	     
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
