package com.week3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Regisiter.java", value = "/Regisiter.java")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender =  request.getParameter("gender");
        String brithday = request.getParameter("brithday");

        PrintWriter writer = response.getWriter();
        writer.println("username:"+username);
        writer.println("password:"+password);
        writer.println("email:"+email);
        writer.println("gender:"+gender);
        writer.println("brithday:"+brithday);

        writer.close();
    }
}
