package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	     PrintWriter pw=response.getWriter();
	     pw.println("<body style=text-align:center;>");
	     pw.println("<h1 style=color:green;>Event Creation</h1>");
	     pw.println("<table style='margin-left:auto; margin-right:auto;'>");
	     pw.println("<form action='./Validate' method='post'>");
	     pw.println("<tr><td>Event Name</td><td><input type='text' name='eventName'></td></tr>");
	     pw.println("<tr><td>Hall Name</td><td><input type='text' name='hallName'></td></tr>");
	     pw.println("<tr><td>Event Type</td><td><input type='radio' name='type'>Exhibition<br><input type='radio' name='type'>Stage Show</td></tr>");
	     pw.println("<tr><td>Details</td><td><input type='text' name='details'></td></tr>");
	     pw.println("<tr><td>Owner Name</td><td><input type='text' name='owner'></td></tr>");
	     pw.println("<tr><td>Start Date</td><td><input type='text' name='startDate'></td></tr>");
	     pw.println("<tr><td>End Date</td><td><input type='text' name='endDate'></td></tr>");
	     pw.println("<tr><td></td><td><input type='submit' name='submit' value='Submit'></td></tr>");
	     pw.println("</form>");
	     pw.println("</table>");
	     
	     pw.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
