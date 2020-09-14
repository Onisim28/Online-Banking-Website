<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make a transfer</title>
</head>


<body>


<form action="send_money_check" method="post"><br>

Enter owner's username :<br>
<input type="text" name="user"><br>

Enter owner's password :<br>
<input type="password" name="pass"><br>

Enter a value: :<br>
<input type="text" name="val"><br>


<input type="submit" value="Send Money">

</form>

<br>


<form action="welcome.jsp" method="post"><br>


<input type="submit" value="back">

</form>


</body>
</html>