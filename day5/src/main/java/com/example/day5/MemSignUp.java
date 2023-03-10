package com.example.day5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/mSignUp")
public class MemSignUp extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        System.out.println("<-- doGet -->");

        String m_name = request.getParameter("m_name");
        String m_pass = request.getParameter("m_pass");
        String m_gender = request.getParameter("m_gender");
        String[] m_hobbys = request.getParameterValues("m_hobby");
        String m_residence = request.getParameter("m_residence");

        System.out.println("m_name : " + m_name);
        System.out.println("m_pass : " + m_pass);
        System.out.println("m_gender : " + m_gender);
        System.out.println("m_hobbys : " + Arrays.toString(m_hobbys));
        System.out.println("m_residence : " + m_residence);

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()){
            String name = (String)names.nextElement();
            System.out.println("name : " + name);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("<-- doPost() -->");

        doGet(request, response);
    }
}
