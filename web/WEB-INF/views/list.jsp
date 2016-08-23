<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<c:forEach items="${warrior}" var="warrior1">
  <td>${warrior1.getId()} </td>
  <td>${warrior1.getName()} </td>
  <td>${warrior1.getAge()} </td>
  <td>${warrior1.getDescription()} </td>
  </br>
</c:forEach>
  </body>
</html>
