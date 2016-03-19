<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="navbar-inner">
      <button type="button" class="navbar-toggle pull-left animated flip">
        <span class="sr-only">导航</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span
          class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.html"> <img alt="Charisma Logo" src="images/logo20.png"
        class="hidden-xs" /> <span>某某某系统</span></a>
      <!-- user dropdown starts -->
      <div class="btn-group pull-right">
        <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
          <i class="glyphicon glyphicon-user"></i><span class="hidden-sm hidden-xs"> 管理员</span> <span class="caret"></span>
        </button>
        <ul class="dropdown-menu">
          <li><a href="#">个人信息</a></li>
          <li class="divider"></li>
          <li><a href="login.html">退出系统</a></li>
        </ul>
      </div>
      <!-- user dropdown ends -->
      <!-- theme selector starts -->
      <div class="btn-group pull-right theme-container animated tada">
        <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
          <i class="glyphicon glyphicon-tint"></i><span class="hidden-sm hidden-xs">改变主题/皮肤</span> <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" id="themes">
          <li><a data-value="classic" href="#"><i class="whitespace"></i> 经典</a></li>
          <li><a data-value="cerulean" href="#"><i class="whitespace"></i> Cerulean</a></li>
          <li><a data-value="cyborg" href="#"><i class="whitespace"></i> Cyborg</a></li>
          <li><a data-value="simplex" href="#"><i class="whitespace"></i> Simplex</a></li>
          <li><a data-value="darkly" href="#"><i class="whitespace"></i> Darkly</a></li>
          <li><a data-value="lumen" href="#"><i class="whitespace"></i> Lumen</a></li>
          <li><a data-value="slate" href="#"><i class="whitespace"></i> Slate</a></li>
          <li><a data-value="spacelab" href="#"><i class="whitespace"></i> Spacelab</a></li>
          <li><a data-value="united" href="#"><i class="whitespace"></i> United</a></li>
        </ul>
      </div>
      <!-- theme selector ends -->
      <ul class="collapse navbar-collapse nav navbar-nav top-menu">
        <li><a href="#"><i class="glyphicon glyphicon-globe"></i> 访问网站</a></li>
        <li><a id="frametour" href="#"><i class="glyphicon glyphicon-flag"></i> 网站指引</a></li>
        <li>
          <form class="navbar-search pull-left">
            <input placeholder="搜索本站" class="search-query form-control col-md-10" name="query" type="text">
          </form>
        </li>
      </ul>
    </div>
  </div>