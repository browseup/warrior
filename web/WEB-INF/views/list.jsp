<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<c:forEach items="${warrior}" var="warrior">
  <td>${warrior.getId()} </td>
  <td>${warrior.getName()} </td>
  <td>${warrior.getAge()} </td>
  <td>${warrior.getDescription()} </td>
  </br>
</c:forEach>
<c:forEach items="${magician}" var="magician">
  <td>${magician.getId()} </td>
  <td>${magician.getName()} </td>
  <td>${magician.getAge()} </td>
  <td>${magician.getDescription()} </td>
  </br>
</c:forEach>
  </body>
</html>
