<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 06.03.2023
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second Jsp</title>
</head>
<body>
    <h1>Testing directives</h1>>
    <p>
       <%@ page import ="java.util.Date, logic.TestClass" %>

        <% TestClass test = new TestClass(); %>

        <%= test.getInfo() %>

    </p>
</body>
</html>
