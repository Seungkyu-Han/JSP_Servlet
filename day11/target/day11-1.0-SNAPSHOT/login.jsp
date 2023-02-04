<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(session.getAttribute("memberId") != null)
        response.sendRedirect("loginOk.jsp");
%>
<form action="loginCon" method="post">
    ID : <input type="text" name="mID"><br>
    PW : <input type="password" name="mPW"><br>
    <input type="submit" value="login">
</form>

</body>
</html>
