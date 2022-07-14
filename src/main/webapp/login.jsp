<%--
  Created by IntelliJ IDEA.
  User: romeocohens
  Date: 7/13/22
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>LOGIN</title>
    <%@ include file="partials/head.jsp" %>
</head>
<body>

<h1>LOGIN</h1>
<form action="login.jsp" method="post">
    <label for="username">USERNAME</label>
    <input name="username" type="text" id="username" placeholder="USERNAME">
    <label for="password">PASSWORD</label>
    <input name="password" type="text" id="password" placeholder="PASSWORD">
    <button type="submit">ENTER</button>
</form>

<c:if test="${(param.username != null) && (param.password != null)}">
    <c:choose>
        <c:when test='${(param.username.equalsIgnoreCase("admin")) && (param.password.equalsIgnoreCase("password"))}'>
           <% response.sendRedirect("profile.jsp"); %>
        </c:when>
        <c:otherwise>
            <% response.sendRedirect("login.jsp"); %>
        </c:otherwise>
    </c:choose>
</c:if>

</body>
</html>
