<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>Insert title here</title>
</head>
<body>
    <p>First Page!!</p>

    <%
        response.sendRedirect("secondPage.jsp");
    %>
</body>
</html>
