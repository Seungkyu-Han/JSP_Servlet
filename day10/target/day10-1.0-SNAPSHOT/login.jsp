<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>Insert title here</title>
</head>
<body>
    <%
        Cookie[] cookies = request.getCookies();
        System.out.println("cookies : " + cookies);

        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("memberId")){
                    response.sendRedirect("loginOk.jsp");
                }
            }
        }
    %>


    <form action="loginCon" method="post">
        ID: <label>
        <input type = "text" name = "mID">
    </label><br>
        PW: <label>
        <input type = "password" name = "mPW">
    </label><br>
        <input type = "submit" value="login">
    </form>

</body>
</html>
