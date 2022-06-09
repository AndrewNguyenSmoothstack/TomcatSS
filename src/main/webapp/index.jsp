<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<form action ="LoginServlet" method="post">
    <input type="text" name="username_form_name">
    <input type="password" name="password_form_name">
    <button type="submit" name="login_button_form_name">Login</button>
</form>

<br/>
<a href="hello-servlet">Test Servlet</a> referencing servlet value name
</body>
</html>