<%--
  Created by IntelliJ IDEA.
  User: martinknyazyan
  Date: 5/10/18
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="/login" method="post">
    <input type="text" name="username" placeholder="Username"><br><br>
    <input type="password" name="password" placeholder="Password"><br><br>
    <input type="submit" value="Log In"/>
</form>

<br><br><br>
<form action="/signup">
    <input type="submit" value="Sign Up" style="width: 400px; height: 100px; font-size: 26px;"/>
</form>

</body>
</html>
