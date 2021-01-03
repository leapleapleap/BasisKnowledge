<%@ page import="_0426_cookie.cookie.GetTime" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //设置标记(当找到键名为lastTime的cookie是设置值为true，否在恒为false)
    Boolean flag = false;
    //获取客户端会话cookie数组
    Cookie[] cookies = request.getCookies();
    //当cookie数组存在(request中存在cookie)且cookie数组的长度大于0时
    if (cookies != null && cookies.length > 0) {
        //变量cookie数组
        for (Cookie cookie : cookies) {
            //当cookie数组中存在键名为lastTime的键时
            if ("lastTime".equals(cookie.getName())) {
                //将标签赋值为true
                flag = true;
                //获取上次访问的时间
                String before = cookie.getValue();
                //获取当前时间
                String time = new GetTime().getTime();
                //设置cookie的值
                cookie.setValue(time);
                //设置cookie的存活时间(正数为存活，单位为秒)
                cookie.setMaxAge(60 * 60 * 24 * 30);
                //将cookie添加到response中
                response.addCookie(cookie);
                //将获取到的上次访问时间使用utf-8解码
                before = URLDecoder.decode(before, "utf-8");
                //将结果写出到页面
%>
<h1>欢迎回来，您上次访问时间为:<%=before%></h1>

<%
                //跳出for循环
                break;
            }
        }
    }
    //如果cookies不存在或者其长度为0或者在获取的cookies中没有键值为lastTime的键值对
    if (cookies == null || cookies.length == 0 || flag == false) {
        //获取时间
        GetTime getTime = new GetTime();
        String time = getTime.getTime();
        //创建cookie并且将时间写入
        response.addCookie(new Cookie("lastTime", time));
%>
        <%--页面输出结果--%>
        <h1>您好，欢迎您首次访问</h1>
<%
    }
%>
</body>
</html>
