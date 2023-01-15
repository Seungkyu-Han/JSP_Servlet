import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletEx extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminId = getServletConfig().getInitParameter("adminId");
        String adminPw = getServletConfig().getInitParameter("adminPw");

        PrintWriter out = response.getWriter();
        out.print("<p>adminId :" + adminId + "</p>");
        out.print("<p>adminPw :" + adminPw + "</p>");

        String imgDir = getServletContext().getInitParameter("imgDir");
        String testServerIp = getServletContext().getInitParameter("testServerIP");

        out.print("<p>imgDir :" + imgDir + "</p>");
        out.print("<p>testServerIP :" + testServerIp + "</p>");

        getServletContext().setAttribute("connectedIP", "165.62.58.33");
        getServletContext().setAttribute("connectedUser", "hong");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
