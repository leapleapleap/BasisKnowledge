<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("hello jsp");
    int i = 5;

    String contextPath = request.getContextPath();
    out.print(contextPath);
%>

<%!
    int i = 3;
%>
<%= "hello" %>
</body>
</html>
