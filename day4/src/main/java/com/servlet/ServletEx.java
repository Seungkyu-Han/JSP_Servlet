package com.servlet;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletEx", value = "/ServletEx")
public class ServletEx extends HttpServlet {

    //Servlet 실행
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        System.out.println("<-- doGet -->");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("<-- postConstruct() -->");
    }

    //servlet 생성, 생성되는 시점에 하고 싶은 작업 ex) data server 에 로그인 id와 passwd 를 담아두는 것
    @Override
    public void init() throws ServletException{
        System.out.println("<-- init() -->");
    }

    //servlet 종료, 사용을 마치고 자원을 해제하거나 반납할 때
    @Override
    public void destroy(){
        System.out.println("<-- destroy() -->");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("<-- preDestroy -->");
    }
}
