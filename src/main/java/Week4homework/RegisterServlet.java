package Week4homework;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/Register"})
public class RegisterServlet extends HttpServlet {


    public Connection con = null;
    public void init(){
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
        String email = request.getParameter("email");
        String gender =  request.getParameter("gender");
        String brithday = request.getParameter("brithday");

        //Insert!
        try{
            String sql = "insert into tb_user values(?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,username);
            statement.setString(2,password);
            statement.setString(3,gender);
            statement.setString(4,email);
            statement.setString(5,brithday);
            if(statement.executeUpdate()>0){
                System.out.println("insert successfully");
            }
            else{
                System.out.println("fail");
            }
            statement.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
        //Print out!
        ArrayList<Week4homework.User> list = new ArrayList<>();
        String sql2 = "Select * from tb_user";
        try{
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql2);
            while(result.next()){
                String Username = result.getString("username");
                String Password =result.getString("password");
                String Gender = result.getString("gender");
                String Email = result.getString("email");
                String Brithday =  result.getString("brithday");
                Week4homework.User user = new User(Username,Password,Gender,Email,Brithday);
                list.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        //request.setAttribute("list",list);
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
}
