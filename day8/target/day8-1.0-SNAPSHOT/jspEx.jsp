<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="EUC-KR">
    <title>Insert title here</title>
</head>
<body>

<%!
    String adminId;
    String adminPw;

    String imgDir;
    String testServerIP;
%>

<%
    adminId = config.getInitParameter("adminId");
    adminPw = config.getInitParameter("adminPw");

    imgDir = application.getInitParameter("imgDir");
    testServerIP = application.getInitParameter("testServerIp");

%>

    <p>adminId : <%=adminId%></p>
    <p>adminPw : <%=adminPw%></p>

    <p>imgDir : <%=imgDir%></p>
    <p>testServerIp : <%=testServerIP%></p>

<%
    application.setAttribute("connectedIP", "165.62.58.2");
    application.setAttribute("connectedUser", "hong");
%>

<%
    out.print("<p>hello<p>");
%>

</body>
</html>
