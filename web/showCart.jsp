<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.03.2023
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@ page import="logic.Cart" %>

<%--// получаем аттрибут cart, он класса Оbject, поэтому надо сделать даункастинг--%>
<% Cart cart = (Cart) session.getAttribute("cart"); %>

<p> Наименование: <%= cart.getName() %></p>
<p> Количество: <%= cart.getQuantity() %></p>

</body>
</html>
