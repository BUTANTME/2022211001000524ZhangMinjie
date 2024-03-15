<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Week2Homework2</title>

    <style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(to right, #ff7e5f, #feb47b); /* 渐变背景 */
        }

        #container1 {
            width: 300px;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3); /* 增强阴影效果 */
            transition: box-shadow 0.3s ease; /* 平滑过渡效果 */
        }

        #container1:hover {
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.5); /* 鼠标悬停时增强阴影效果 */
        }

        .r-input {
            margin-bottom: 10px;
            position: relative; /* 为输入框添加定位上下文 */
        }

        .r-input label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        .r-gender {
            margin-bottom: 10px;
        }

        input[type="radio"] {
            margin-right: 5px;
            cursor: pointer;
        }

        #submit {
            width: 100%;
            height: 40px;
            border: none;
            border-radius: 5px;
            background: #007bff;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2); /* 按钮阴影 */
            transition: background-color 0.3s ease, box-shadow 0.3s ease; /* 平滑过渡效果 */
        }

        #submit:hover {
            background: #0056b3;
            box-shadow: 0 5px 10px rgba(0, 0, 0, 0.3); /* 鼠标悬停时增强按钮阴影效果 */
        }
    </style>
</head>
<body>
<div id="container1">
    <form id="register">
        <div class="r-input">
            <label  >Name</label><br>
            <input Type="text" ><br>
        </div>
        <div class="r-input">
            <label >Password</label><br>
            <input Type="password" minlength="8"  name="password" ><br>
            <span id="p-limit">Password must larger than 8 characters</span>
        </div>
        <div class="r-input">
            <label >Email</label><br>
            <input Type="text"><br>

        </div>
        <div class="r-gender">
            <label>Gender</label><br>
            <ul >

                <li><input  type="radio" value="male" name="gender" checked="true" ><label>male</label></li>
                <li><input  type="radio"  value="female" name="gender"/><label>female</label></li>
            </ul>

        </div>
        <div class="r-input">
            <input Type="submit" id="submit" value="register"><br>
        </div>
        <div class="r-input">
            <label>Brithday</label><br>
            <input Type="text" id="brithday" placeholder="dd/mm/yyyy" required>
        </div>

    </form>
</div>

</body>
</html>