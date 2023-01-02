<%@ page import="com.example.lunchweb.Lunch" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lunch randomizer</title>
</head>
<% String res = Lunch.RamdomLunch(); %>
<body>
<h1><%= "Vi ska äta här i dag: " + res

    %>

</h1>
<br/>
<!-- <a href="hello-servlet">Hello Servlet</a> -->
</body>
</html>