<%@ page import="_0429_EL_JSTL.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        #ids{
            text-align: center;
            vertical-align: center;
            color: #aaabbb;
            font-family: Inconsolata;
        }
    </style>
</head>
<body>

<%
    List list = new ArrayList();
    list.add(new Student("黄忠", "18", new Date()));
    list.add(new Student("关羽", "19", new Date()));
    list.add(new Student("刘备", "21", new Date()));
    list.add(new Student("赵云", "23", new Date()));
    list.add(new Student("张飞", "18", new Date()));
    request.setAttribute("list",list);
%>
<table border="1" align="center">
    <tr bgcolor="yellow">
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="student" varStatus="s">
        <c:if test="${s.count%2==0}">
            <tr bgcolor="aqua">
        </c:if>
        <c:if test="${s.count%2==1}">
            <tr bgcolor="lime">
        </c:if>
            <td id="ids">${s.count}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.dateLocal}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
