<%--
  Created by IntelliJ IDEA.
  User: 24825
  Date: 2024/4/4
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login.jsp</title>
    <style>
        .container {
            background: linear-gradient(#e66465, #9198e5);
            font-family: Roboto;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .login {
            background-color: #0b132b;
            width: 400px;
            color: #f8f9fa;
            padding: 40px;
            box-shadow: 10px 10px 25px #000000;
            text-align: center;
        }

        .login input {
            display: block;
            margin: 20px auto;
            text-align: center;
            background: none;
            padding: 12px;
            font-size: 15px;
            border-radius: 22px;
            outline: none;
            color: #f8f9fa;
        }

        .login input[type="text"],
        .login input[type="password"] {
            border: 2px solid #3498db;
            width: 220px;
        }

        .login input[type="submit"] {
            width：150px;
            border: 2px solid #2ecc71;
            cursor: pointer;
        }

        .login input[type="text"]:focus,
        .login input[type="password"]:focus {
            border-color: #2ecc71;
            width: 250px;
            translate: 0.5s;
        }

        .login input[type="submit"]:hover {
            background-color: #2ecc71;
            translate: 0.5s;
        }

    </style>
</head>
<body>
<div>
    <%@include file="header.jsp"%>
</div>
<div class="container">
    <form action="/2022211001000524ZhangMinjie_war_exploded/login" class="login" method="post">
        <h1>login登录</h1>
        <input type="text" name="username" placeholder="Username" />
        <input type="password" name="password" placeholder="Password" />
        <input type="submit" value="Login" />
    </form>
</div>
<div>
    <%@include file="footer.jsp"%>
</div>


</body>
</html>
