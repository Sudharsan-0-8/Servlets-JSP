package com.basics1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/productAction")

// To perform url rewriting when redirecting to this servlet from addition Servlet
// This url rewriting will work only in GET meathod 
public class MultiplicationServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		// getting values from get or post
//		int a = Integer.parseInt(req.getParameter("a"));
//		int b = Integer.parseInt(req.getParameter("b"));
//		System.out.print("mul");
		
//		// getting values from session
//		HttpSession session = req.getSession();
//		int a = (int) session.getAttribute("a");
//		int b = (int) session.getAttribute("b");
		
		// getting values using Cookies
		Cookie arr[] = req.getCookies();
		int a=0, b=0;
		for(Cookie c : arr){
			if(c.getName().equals("a"))a=Integer.parseInt(c.getValue());
			if(c.getName().equals("b"))b=Integer.parseInt(c.getValue());
		} 
		System.out.println(a+ " " +b);
		res.getWriter().print("Product = " + a*b);
		
		res.sendRedirect("subractAction");
		
	}
}
