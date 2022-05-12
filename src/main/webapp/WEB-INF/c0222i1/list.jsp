<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/13/2022
  Time: 2:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/WEB-INF/navigation/nav.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Name</th>
        <th scope="col">Address</th>
    </tr>
    <c:forEach items='${requestScope["c0222i1"]}' var="c0222i1">
        <tr>
            <td>${c0222i1.getId()}</td>
            <td>${c0222i1.getName()}</td>
            <td>${c0222i1.getAddress()}</td>
        </tr>
    </c:forEach>
    </thead>

</table>
</body>
</html>
