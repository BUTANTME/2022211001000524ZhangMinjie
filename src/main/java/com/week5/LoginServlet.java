package com.week5;

import com.week4.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(
        urlPatterns = {"/login"}
)
public class LoginServlet<user> extends HttpServlet {
    public Connection con = null;


    public void init()throws ServletException{
        ServletContext context = getServletConfig().getServletContext();
        String drivername = context.getInitParameter("drivername");
        String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        try{
            Class.forName(drivername);
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("-->connection"+con);
            this.con = con;
        }catch(Exception e){
            e.printStackTrace();
        }

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ArrayList<User> list = new ArrayList<>();
        String sql2 = "Select * from tb_user";
        try{
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql2);
            while(result.next()){
                String Username = result.getString("username");
                String Password =result.getString("password");
                String Gender = result.getString("gender");
                String Email = result.getString("email");
                String Brithdate =  result.getString("brithdate");
                User User = new User(Username,Password,Gender,Email,Brithdate);
                list.add(User);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }


        try{
            String sql ="Select * from tb_user where username = ? "+"and password = ?";
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1,username);
            stat.setString(2,password);
            ResultSet rs = stat.executeQuery();
            PrintWriter writer = response.getWriter();

            if(rs.next()){

                request.setAttribute("list",list);
                request.getRequestDispatcher("user.jsp").forward(request,response);
            }
            else{
                response.sendRedirect("login.jsp");

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
