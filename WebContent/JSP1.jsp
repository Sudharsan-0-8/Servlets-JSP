<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ page errorPage = "error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ page import="java.util.*" %>
	<%@ include file="JSP2.jsp" %>	
	<%! public static int s = 10; %>
	<%
		int e = 9/0; // error line  
		
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		out.println("Scriplet tag: Result="+ (a+b) +  "\n");

		out.println("Declarative tag variable=" + s);
		//RequestDispatcher rd = request.getRequestDispatcher("");
		//rd.forward(request, response);
		
	%>
	
	<%= "Expression Tag= "+a %>
</body>
</html>  