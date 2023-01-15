import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletGet", value = "/ServletGet")
public class ServletGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String connectedIP = (String)getServletContext().getAttribute("connectedIP");
        String connectedUser = (String)getServletContext().getAttribute("connectedUser");

        PrintWriter out = response.getWriter();
        out.print("<p>connectedIP: " + connectedIP + "</p>");
        out.print("<p>connectedIP: " + connectedUser + "</p>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
