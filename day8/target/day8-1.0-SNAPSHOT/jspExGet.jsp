<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>

<%!
  String connectedIp;
  String connectedUser;
%>

<%
  connectedIp = (String)application.getAttribute("connectedIP");
  connectedUser = (String)application.getAttribute("connectedUser");
%>

<p>connectedIP : <%=connectedIp%></p>
<p>connectedUser : <%=connectedUser%></p>

</body>
</html>
