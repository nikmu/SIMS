<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8">
  <title>登录：脑卒中信息管理系统</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="脑卒中">
  <meta name="author" content="BME">
  <!-- 样式 -->
  <link id="bs-css" href="css/bootstrap-cerulean.min.css" rel="stylesheet">
  <link href="css/login.css" rel="stylesheet">
  <!-- The fav icon -->
  <link rel="shortcut icon" href="images/favicon.ico">
</head>
<body>
  <div class="ch-container">
    <div class="row">
      <div class="row">
        <div class="col-md-12 center login-header">
          <h2>脑卒中信息管理系统</h2>
        </div>
      </div>
      <div class="row">
        <div class="well col-md-5 center login-box">
          <div class="alert alert-info">请输入您的登录用户名和密码.</div>
          <!-- 连接后台后，使用后台的重定向  -->
          <form class="form-horizontal" action="login/login" method="post">
            <fieldset>
              <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user red"></i></span> <input type="text"
                  class="form-control" placeholder="用户名">
              </div>
              <div class="clearfix"></div>
              <br>
              <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock red"></i></span> <input
                  type="password" class="form-control" placeholder="密码">
              </div>
              <div class="clearfix"></div>
              <div class="input-prepend">
                <label class="remember" for="remember"> <input type="checkbox" id="remember"> 记住我
                </label>
              </div>
              <div class="clearfix"></div>
              <p class="center col-md-5">
                <button type="submit" class="btn btn-primary" id="loginBtn">登 录</button>
              </p>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
  </div>
  <!-- external javascript -->
  <script src="third-party/jquery/jquery.min.js"></script>
  <script src="third-party/bootstrap/dist/js/bootstrap.min.js"></script>
  <script src="js/login.js"></script>
</body>
</html>
