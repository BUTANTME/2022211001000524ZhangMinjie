package com.week6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt = request.getParameter("txt");
        String search = request.getParameter("search");

        if(txt == null || txt == ""){
            response.sendRedirect("index.jsp");
        }
        else{
            if(search.equals("baidu")){
                response.sendRedirect("https://www.baidu.com/s?wd="+txt);
            }
            else if(search.equals("bing")){
                response.sendRedirect("https://cn.bing.com/search?q="+txt);
            }
            else if(search.equals("google")){
                response.sendRedirect("https://www.google.cn/"+txt);
            }
        }

}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
