<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Your Profile</h1>
    <p>Username:<c:out value="${spitter.username}" /></p>
    <p>FirstName:<c:out value="${spitter.firstName}" /> LastName:<c:out value="${spitter.lastName}" /></p>
    <p>Email:<c:out value="${spitter.email}" /></p>
  </body>
</html>
