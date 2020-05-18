<%--
  Created by IntelliJ IDEA.
  User: ASUS2018
  Date: 2020/5/17
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <script src="<%=request.getContextPath()%>/js/jquery-3.4.1.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.bundle.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<style>
    body{
        background-image: url(<%=request.getContextPath()%>/image/leaves-pattern.png);
    }
    #container{
        width: 350px;
        height: 400px;
        border-radius: 5px;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-left: -175px;
        margin-top: -175px;
        background-color: rgba(255,255,255,0.5);
        overflow: hidden;
        -webkit-box-shadow: 2px 2px 8px 1px #888888;
        -moz-box-shadow: 2px 2px 8px 1px #888888;
        box-shadow: 2px 2px 8px 1px #888888;
    }
    p{
        margin: 0px;
    }
</style>
<body>
<div id="container">
    <div class="container">
        <div class="row mt-3">
            <div class="col text-center">
                <p style="font-size: 40px;">人事管理系统</p>
                <p class="text-muted">Personnel management system</p>
            </div>
        </div>
        <br>
        <div class="row">
            <div class="col">
                <form method="post" action="/login">
                    <div class="form-group">
                        <label for="textinput">登录账号：</label>
                        <input class="form-control form-control" name="loginname" type="text" id="textinput" placeholder="登录账号"/>
                    </div>
                    <div class="form-group">
                        <label for="pawinput">登录密码：</label>
                        <input class="form-control form-control" name="pwd" type="password" id="pawinput" placeholder="登录密码"/>
                    </div>
                    <br>
                    <input type="submit" class="btn btn-primary text-white btn-block" value="登录"/>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
