<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="" %>
<%@ page import="java.util.Date" %>
<%@ page import="part_06.April29_EL_JSTL.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            margin: 0px;
            padding: 0px;
        }
        #h4title{
            font-family: 楷体;
            color: aqua;
            font-size: 25px;
        }
    </style>
</head>
<body>

<%--JSP--%>
<%
    List<String> list = new ArrayList<>();
    list.add("zhangsan");
    list.add("lisi");
    list.add("wangmazi");
    request.setAttribute("list", list);
    User user = new User();
    user.setName("zhangsan");
    user.setBirthday(new Date());
    request.setAttribute("user", user);
    request.setAttribute("number",3);
%>

<h3>Expression language</h3>
2<3 : ${2<3}<br/> <%-- true --%>
2+3==4+1 : ${2+3 == 4+1}<br/> <%-- true --%>

<b><h4 id="h4title">empty</h4></b>
not empty list : ${not empty list}<br/> <%-- true --%>
<hr color="red">
user.name:${user.name}<br/>
<%--zhangsan--%>
user.birthday:${user.birthday}<br/>
<%--Mon Apr 29 12:44:28 CST 2019--%>
user.dateLocal:${user.dateLocal}<br/>
<%--2019-04-29 12:44:28--%>
user.birthday.year:${user.birthday.year}<br/>
<%--119--%>
user.birthday.month:${user.birthday.month}<br/>
<%--3--%>
pageContext.request.contextPath:${pageContext.request.contextPath}
<%--/demo--%>

<h3>JavaServer Pages Standard Tag Library</h3>
<c:if test="${(user.birthday.month mod 2) == 1 && (user.birthday.year div 2) < 50}">
    ${user.dateLocal}
</c:if><br/>

<c:choose>
    <c:when test="${number==1}">星期1</c:when>
    <c:when test="${number==2}">星期2</c:when>
    <c:when test="${number==3}">星期3</c:when>
    <c:when test="${number==4}">星期4</c:when>
    <c:when test="${number==5}">星期5</c:when>
    <c:when test="${number==6}">星期6</c:when>
    <c:when test="${number==7}">星期天</c:when>
    <c:otherwise>${"数字有误"}</c:otherwise>
</c:choose><br>

<c:forEach begin="0" end="10" var="i" step="1" varStatus="s">
    ${i}<span> </span>${s.index}<span> </span>${s.count}<br>
</c:forEach><br><br>

<c:forEach items="${list}" var="str" varStatus="s">
    ${str}<span> </span>${s.index}<span> </span>${s.count}<br>
</c:forEach>
</body>
</html>
