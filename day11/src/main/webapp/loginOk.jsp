<%@ page import="java.io.PrintWriter" %>
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
