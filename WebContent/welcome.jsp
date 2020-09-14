<%@page import="oni.com.DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>



<body>


<p>Welcome to my main bank website!</p>
   
   
   
   <h2>
   
    <% 
    
    float money;
    String m;
    DAO dao=new DAO();
    
    String name= session.getAttribute("name").toString();
	
	out.println("<br>User : "+name);	
	
	//m=dao.getMoney(name);
	
	
	out.println("<br> money: "+dao.getMoney(name)+" $"); 
	
	
	%>
	
	</h2>
	
	
	
	
	
<form action="transfer_money.jsp">

<input type="submit" value="Transfer Money">

</form>
	
	<br>
	
<form action="templates_show.jsp">

<input type="submit" value="Payments History">

</form>
	
	
<br>
<br>
<br>
<form action="signin.jsp">

<input type="submit" value="logout">

</form>



</body>



</html>