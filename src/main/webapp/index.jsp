<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="MyServlet" method="post">
    Key: <input type="text" name="key"><br>
    Value: <input type="text" name="value"><br>
    Test: <input type="checkbox" name="test" value="true"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>