<%--
  Created by IntelliJ IDEA.
  User: romeocohens
  Date: 7/15/22
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PIZZA PIZZA</title>
</head>
<body>

<form action="pizza-order" method="post">
  <select name="crust" id="crust">
    <option value="garlic-butter">Garlic Butter Crust</option>
    <option value="regular">Regular Crust</option>
    <option value="cheesy">Cheesy Crust</option>
  </select>
  <select name="sauce" id="sauce">
    <option value="marinara">Marinara Sauce</option>
    <option value="alfredo">Alfredo Sauce</option>
    <option value="nacho">Nacho Cheeese Sauce</option>
  </select>
  <select name="size" id="size">
    <option value="small">Small</option>
    <option value="medium">Medium</option>
    <option value="large">Large</option>
  </select>
</form>

</body>
</html>
