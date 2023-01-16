<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
  <%
    PrintWriter pout = response.getWriter();
    Cookie[] cookies = request.getCookies();
    for(Cookie c: cookies){
      pout.print("name : " + c.getName() + "<br>");
      pout.print("value : " + c.getValue() + "<br>");
      pout.print("-------------------<br>");
    }
  %>

</body>
</html>
