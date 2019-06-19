package com.configcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigExample
 */
public class ServletConfigExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, 
    	      HttpServletResponse response)
    	        throws ServletException, IOException
    {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      
      ServletConfig sc=getServletConfig();
      String str=sc.getInitParameter("email");
      out.println(str);
      
      ServletContext context=getServletContext();  
      String st=context.getInitParameter("email");  
      out.println(st);  
    }
}