package Week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class text1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        writer.println("Name:Zhang Min jie");
        writer.println("Id:2022211001000524");
        writer.println("Date and Time Thurs Mar 14 13:21:30 CST 2024");

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }
}
