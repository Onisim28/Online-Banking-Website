<%@page import="java.util.ArrayList"%>
<%@page import="oni.com.Dao_Template"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <link href="template_show_style.css" rel='stylesheet' type='text/css' media="all">


<title>Payment History</title>


</head>



<body>



<%


String name= session.getAttribute("name").toString();
Dao_Template dao_Template=new Dao_Template();

ArrayList<String> a= dao_Template.getInformation(name, "sender");
ArrayList<String> c= dao_Template.getInformation(name, "val");
ArrayList<String> b= dao_Template.getInformation(name, "reciever");
ArrayList<String> d= dao_Template.getInformation(name, "ct");



if(!a.isEmpty()){
	
	
for (int i=0;i<a.size();i++){
	
	if(a.get(i).equals(name)){ %>
	<% 
	
	out.print("<p class=qwe> OUTCOME </p>");
	out.println("<p>"+(i+1)+": Sender:"+a.get(i)+"\tReciever:"+b.get(i)+"\tAmount:"+c.get(i)+"$\t Date:"+d.get(i)+"</p>");
	
	}
	
	else{
		
		out.print("<p class=qwert> INCOME </p>");
		out.println("<p class=wow>"+(i+1)+": Sender:"+a.get(i)+"\tReciever:"+b.get(i)+"\tAmount:"+c.get(i)+"$\t Date:"+d.get(i)+"</p>");
	}
	
	
}

}

else{ %>
	
	<p></p>
	
	<% 
} 

%>







<form action="welcome.jsp" method="post"><br>

<input type="submit" value="Back to main page">

</form>

<script type="text/javascript">


//alert("javascriptppppp");


</script>


</body>




</html>