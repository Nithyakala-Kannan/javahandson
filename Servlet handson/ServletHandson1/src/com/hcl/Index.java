package com.hcl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     response.setContentType("text/html");
	     PrintWriter pw=response.getWriter();
	     pw.println("<body style=text-align:center;>");
	     pw.println("<h1 style=color:red;>Welcome to Hall Paradise</h1>");
	     pw.println("<p>The types of events are</p>");
	     pw.println("<ul>");
	     pw.println("<li>Exhibition</li>");
	     pw.println("<li>Stage Show</li>");
	     pw.println("</ul>");
	     pw.println("</body>");
	     pw.close();
	     
	     
	}

	

}
