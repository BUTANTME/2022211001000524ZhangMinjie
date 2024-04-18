<%@ page import="com.model.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 24825
  Date: 2024/3/27
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>USER</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>username</th>
        <th>password</th>
        <th>email</th>
        <th>gender</th>
        <th>brithday</th>
    </tr>
    </thead>
    <tbody>
    <%
        ArrayList<User> list = (ArrayList<User>) request.getAttribute("list");
        for (User User : list) {
    %>
    <tr>
        <td><%=User.getUsername()%></td>
        <td><%=User.getPassword()%></td>
        <td><%=User.getEmail()%></td>
        <td><%=User.getGender()%></td>
        <td><%=User.getBrithday()%></td>
    </tr>
    <%
        }
    %>>
    </tbody>
</table>
</body>
</html>
