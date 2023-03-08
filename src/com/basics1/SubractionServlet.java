package com.basics1;

import java.io.IOException;

import javax.servlet.http.*;

public class SubractionServlet extends HttpServlet {
	
	public void service(HttpServletRequest req ,  HttpServletResponse res) throws IOException{
		
//		int a = Integer.parseInt(req.getParameter("a"));
//		int b = Integer.parseInt(req.getParameter("b"));
		Cookie arr[] = req.getCookies();
		int a=0, b=0;
		for(Cookie c : arr ){
			if(c.getName().equals("a"))a=Integer.parseInt(c.getValue());
			if(c.getName().equals("b"))b=Integer.parseInt(c.getValue());
		} 
		System.out.println(a+ " " +b);
		
		res.getWriter().println("<h1>Difference = " + (a-b) + "<h1>");
	}
}
