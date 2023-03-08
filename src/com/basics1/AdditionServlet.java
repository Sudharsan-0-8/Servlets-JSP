package com.basics1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet("/addAction")

public class AdditionServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest req , HttpServletResponse res )  throws IOException, ServletException{
		// getting values from html page
//		int a = Integer.parseInt(req.getParameter("a"));
//		int b = Integer.parseInt(req.getParameter("b"));
		
		// getting servlet context parameters //a=555 b=1  // one servletContext can be there for all servlets
//		ServletContext ctx = req.getServletContext();
//		int a = Integer.parseInt(ctx.getInitParameter("a"));
//		int b = Integer.parseInt(ctx.getInitParameter("b"));
		
		// getting servlet config parameters  // a=666 b=1 // each servlet caan have own servletConfig
		ServletConfig cg = getServletConfig();
		int a = Integer.parseInt(cg.getInitParameter("a"));
		int b = Integer.parseInt(cg.getInitParameter("b"));
		
//		System.out.println("a+b : " + (a+b));
		
		PrintWriter w = res.getWriter();
		w.print("sum = "+ (a+b) +  "\n");
	
		res.getWriter().println("a + b = " + (a+b));
		
//		// Calling a another servlet by RequestDispatcher
//		RequestDispatcher rd = req.getRequestDispatcher("subractAction");
//		rd.forward(req, res);
		
//		// Calling another servlet by ridirecting and using url rewriting to pass values
//		// -- it workd only for GET
//		res.sendRedirect("productAction?a="+ a + "&b=" + b);
		
//		// calling another servelt by redirect but passing values by session
//		HttpSession session = req.getSession();
//		session.setAttribute("a", a);
//		session.setAttribute("b", b);
//		res.sendRedirect("productAction");
		
//		// above same but with cookies
//		Cookie cookie1  = new Cookie("a", a+""); // 2 String Arguments
//		Cookie cookie2  = new Cookie("b", b+"");
//		res.addCookie(cookie1);
//		res.addCookie(cookie2);
//		res.sendRedirect("productAction");
		
	}
	

//	public void service(HttpServletRequest req , HttpServletResponse res ){
//		
//	}
	
//	public void doGet(HttpServletRequest req , HttpServletResponse res ){
//		
//	}
	
}
