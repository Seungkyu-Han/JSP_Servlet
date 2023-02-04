<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: hanseung-gyu
  Date: 2023/02/04
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        PrintWriter printWriter = response.getWriter();
        session = request.getSession();
        printWriter.print("memberId : " + session.getAttribute("memberId") + "<br>");
    %>

    <form action = "logoutCon" method="post">
        <input type = "submit" value="logout">
    </form>

</body>
</html>
