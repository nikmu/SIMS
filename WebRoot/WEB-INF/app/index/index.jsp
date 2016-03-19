<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8">
  <title>脑卒中信息管理系统</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="脑卒中">
  <meta name="author" content="BME">
  <!-- 样式 -->
  <link id="bs-css" href="css/bootstrap-cerulean.min.css" rel="stylesheet">
  <link href="third-party/bootstrap-tour/build/css/bootstrap-tour.min.css" rel="stylesheet">
  <link href="css/frame.css" rel="stylesheet">
  <!-- The fav icon -->
  <link rel="shortcut icon" href="images/favicon.ico">
</head>
<body>
  <noscript>
    <div class="alert alert-block col-md-12">
      <h4 class="alert-heading">警告!</h4>
      <p>
        你必须对该网站启用 <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> 支持。
      </p>
    </div>
  </noscript>
  <!-- topbar starts -->
  <%@include file="/asserts/html/topbar.jsp" %>
  <!-- topbar ends -->
  <div class="ch-container">
    <div class="row">
      <!-- left menu starts -->
      <div class="col-sm-2 col-lg-2">
        <%@include file="/asserts/html/sidebar.jsp" %>
      </div>
      <!-- left menu ends -->
      <!-- content starts -->
      <div id="content" class="col-lg-10 col-sm-10">
        <!-- 其他页面这里都是用JSP引入，并且包括下面这个breadcrumb -->
        <div>
          <ul class="breadcrumb">
            <li><a href="#">主页</a></li>
            <li><a href="#">面板</a></li>
          </ul>
        </div>
      </div>
      <!-- content ends -->
    </div>
    <footer class="row center-footer navbar-fixed-bottom">
      <p class="col-md-12 col-sm-12 col-xs-12 copyright">
        &copy; <a href="http://www.kmust.edu.cn/" target="_blank">XXXX设计单位</a> 0000 - 2015
      </p>
    </footer>
  </div>
  <!-- external javascript -->
  <script src="third-party/jquery/jquery.min.js"></script>
  <script src="third-party/bootstrap/dist/js/bootstrap.min.js"></script>
  <!-- 增强cookie的插件 -->
  <script src="third-party/jquery/jquery.cookie.js"></script>
  <!-- 增强History的插件 -->
  <script src="third-party/jquery/jquery.history.js"></script>
  <!-- 页面引导的插件 -->
  <script src="third-party/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
  <!-- HTML模板的插件 -->
  <script src="third-party/handlebars/handlebars.js"></script>
  <!-- 整个框子所需要的JS文件 -->
  <script src="js/frame.js"></script>
  <!--[if lt IE 9]>
  <!--<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>-->
  <!--[endif] -->
</body>
</html>
