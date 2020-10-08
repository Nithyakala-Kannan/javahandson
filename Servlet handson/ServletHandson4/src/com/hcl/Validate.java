package com.hcl;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
	     PrintWriter pw=response.getWriter();
	     String eventName=request.getParameter("eventName");
	     String hallName=request.getParameter("hallName");
	     String eventType=request.getParameter("type");
	     String details=request.getParameter("details");
	     String ownerName=request.getParameter("owner");
	     String startDate=request.getParameter("startDate");
	     String endDate=request.getParameter("endDate");
	     if(eventName=="" || hallName=="" || eventType=="" || details=="" || ownerName=="" || startDate=="" || endDate=="")
	     {
	    	 RequestDispatcher rd=request.getRequestDispatcher("./index");
	    	 if(eventName.isEmpty()) {
	    		 pw.println("<h3>Event Name must not be empty</h3>");
	    	 }
	    	 if(hallName.isEmpty()) {
	    		 pw.println("<h3>Hall Name must not be empty</h3>");
	    	 }
	    	 if(eventType.isEmpty()) {
	    		 pw.println("<h3>Event Type must not be empty</h3>");
	    	 }
	    	 if(details.isEmpty()) {
	    		 pw.println("<h3>Event Details must not be empty</h3>");
	    	 }
	    	 if(ownerName.isEmpty()) {
	    		 pw.println("<h3>Owner Name must not be empty</h3>");
	    	 }
	    	 if(startDate.isEmpty()) {
	    		 pw.println("<h3>Start Date must not be empty</h3>");
	    	 }
	    	 if(endDate.isEmpty()) {
	    		 pw.println("<h3>End Date must not be empty</h3>");
	    	 }
	    	 rd.include(request, response);
	     }
	     else
	     {   
	    	 pw.println("<body style=text-align:center;>");
	    	 pw.println("<h1 style=color:green; >Events created sucessfully</h1>");
	    	 pw.println("<h2>Event Details</h2>");
	    	 pw.println("<table border='1' style= 'margin-left:auto; margin-right:auto;'>");
	    	 pw.println("<tr><td>Event Name</td><td>"+eventName+"</td></tr>");
	    	 pw.println("<tr><td>Hall Name</td><td>"+hallName+"</td></tr>");
	    	 pw.println("<tr><td>Event Type</td><td>"+eventType+"</td></tr>");
	    	 pw.println("<tr><td>Details</td><td>"+details+"</td></tr>");
	    	 pw.println("<tr><td>Owner Name</td><td>"+ownerName+"</td></tr>");
	    	 pw.println("<tr><td>Start Date</td><td>"+startDate+"</td></tr>");
	    	 pw.println("<tr><td>End Date</td><td>"+endDate+"</td></tr>");
	    	 pw.println("</table>");
	    	 pw.println("</body>");
	    	 
	     }
	     
		
	}

}
