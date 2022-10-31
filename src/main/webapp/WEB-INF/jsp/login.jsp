<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Page</title>
</head>
<%=request.getAttribute("errmsg")%>
<body>
    <form method="post">
        <tr><label for="user">UserName:</label></tr>
        <tr><input type="text" id="user" name="username" placeholder="UserName" required></tr><br><br>
        <tr><label for="pass">Password</label></tr>
        <tr><input type="password" id="pass" name="password" placeholder="Password"></tr><br><br>
        <tr><button name="submit" value="submit">Submit</button></tr>
    </form>
</body>
</html>