<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    String mName;
    String mLoc;
%>

<%
    mName = request.getParameter("m_name");
    mLoc = request.getParameter("m_location");
%>

이름 : <%= mName%> <br>
사는 곳: <%=mLoc%>

</body>
</html>
