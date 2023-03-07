<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.03.2023
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Third JSP</title>
    <h1>
        Testing parameters
    </h1>
    <p>
        <%String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        %>
        <%= "Hello, " + name +" " + surname %>

    </p>>
</head>
<body>

</body>
</html>
