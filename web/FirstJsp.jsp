<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 06.03.2023
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>
        <%
            java.util.Date now = new java.util.Date();
            String someString = "Текущая дата: " + now;
        %>

    <%= someString %>
    <%
        for (int i = 0; i < 10; i++) {
            out.println("<p>" + "Iteration number" + i + "</p>");
        }
    %>

</p>
</body>
</html>
