package com.hcl;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<body style=text-align:center;>");
		pw.println("<h1 style=color:green;>Event Details><br>");
		pw.println("<table style='margin-left:auto; margin-right:auto>");
		pw.println("<th>Event Name</th><th>Hall Name</th><th>Price</th>");
		pw.println("</table>");
		pw.println("</body>");
		doGet(request, response);
	}

}
