import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginCon")
public class loginCon extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String mID = request.getParameter("mID");
        String mPW = request.getParameter("mPW");

        out.print("mID : " + mID);
        out.print("mPW : " + mPW);

        HttpSession session = request.getSession();
        session.setAttribute("memberId", mID);

        response.sendRedirect("loginOk.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
