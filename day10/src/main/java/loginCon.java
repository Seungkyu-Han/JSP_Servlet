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

        String mId = request.getParameter("mID");
        String mPw = request.getParameter("mPW");

        out.print("mId: " + mId);
        out.print("mPw: " + mPw);

        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;

        for(Cookie c : cookies){
            System.out.println("c.getName(): " + c.getName() + "c.getValue()" + c.getValue());

            if(c.getName().equals("memberId")){
                cookie = c;
            }

        }

        if(cookie == null){
            System.out.println("cookie is null");
            cookie = new Cookie("memberId", mId);
        }

        response.addCookie(cookie);
        cookie.setMaxAge(60 * 60);

        response.sendRedirect("loginOk.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
