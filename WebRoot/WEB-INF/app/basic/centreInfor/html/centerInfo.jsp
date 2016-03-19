<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<link href="third-party/datatables/media/css/dataTables.bootstrap.css" rel="stylesheet">
<link href="third-party/datatables/media/css/select.bootstrap.min.css" rel="stylesheet">
<!-- FormValidation CSS file -->
<link rel="stylesheet" href="third-party/FormValidation/dist/css/formValidation.min.css">
<link rel="stylesheet" href="third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"/>
<link href="css/frame.css" rel="stylesheet">
<link href='basic/css/basic.css' rel='stylesheet'>
<!-- The fav icon -->
<link rel="shortcut icon" href="images/favicon.ico">
</head>
<body>
	<noscript>
		<div class="alert alert-block col-md-12">
			<h4 class="alert-heading">警告!</h4>
			<p>
				你必须对该网站启用 <a href="http://en.wikipedia.org/wiki/JavaScript"
					target="_blank">JavaScript</a> 支持。
			</p>
		</div>
	</noscript>
	<!-- topbar starts -->
	<%@include file="/asserts/html/topbar.jsp"%>
	<!-- topbar ends -->
	<div class="ch-container">
		<div class="row">
			<!-- left menu starts -->
			<div class="col-sm-2 col-lg-2">
				<%@include file="/asserts/html/sidebar.jsp"%>
			</div>
			<!-- left menu ends -->
			<!-- content starts -->
			<input type="hidden" value="${permission}" id="permission">
			<div id="content" class="col-lg-10 col-sm-10">
				<!-- 其他页面这里都是用JSP引入，并且包括下面这个breadcrumb -->
				<div>
					<ul class="breadcrumb">
						<li><a href="#">主页</a></li>
						<li><a href="#">基础数据管理</a></li>
						<li><a href="#">中心信息维护</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 中心信息维护
								</h2>
							</div>
							<div class="box-content table-responsive">
								<div id="centre-toolbar">
									<div class="form-inline" role="form">
										<input id="keyword" name="keyword" class="form-control" type="text"
											placeholder="Search">
										<button id="centre-search" type="submit"
											class="btn btn-default">查询</button>
										<button id="centre-exact-search" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#exact-query-modal">精确查询</button>
										<button id="centre-create-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-centre-modal">新增</button>
										<button id="centre-modified-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-centre-modal">修改</button>
										<button id="centre-del-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#delete-centre-modal">删除</button>
									</div>
								</div>
								<table id="centreInfo"
									class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>中心编号</th>
											<th>中心名称</th>
											<th>中心级别</th>
											<th>上级中心名称</th>
											<th>备注</th>
										</tr>
									</thead>
								</table>
							</div>
						</div>
					</div>
					<!--/span-->
				</div>
				<!--/row-->
			</div>
			<!-- content ends -->
		</div>
	</div>
	<!-- 插入模态框 -->
	<div class="modal fade" id="create-centre-modal" tabindex="-1"
		role="dialog" aria-labelledby="create-centre-myModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="create-centre-myModalLabel">中心信息</h4>
				</div>
				<div class="modal-body" id="create-centre_window">
					<form id="centre-form" method="post"
						action="<%=path %>/centreInfor/addZxxxb"
						class="form-horizontal"
						style="border: 1px solid #ddd; padding: 15px">
						<div title="中心信息"
							style="padding: 8px; border: 1px solid #ddd; margin: -1px 0 15px 0"
							class="form-group">
							<div class="container">
								<h4 style="color: #2e6da4">
									<strong>中心信息</strong>
								</h4>
							</div>
							<div class="col-sm-6">
								<label for="centre-id" class="col-sm-4 control-label my-label">中心编号：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input" id="centre-id"
										name="zxxxbModel.zxbh" readonly>
								</div>
								<label for="centre-name" class="col-sm-4 control-label my-label">中心名称<sup>*</sup>：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input"
										id="centre-name" name="zxxxbModel.zxmc" required>
								</div>
								<label for="centre-level"
									class="col-sm-4 control-label my-label">中心级别：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input"
										id="centre-level" name="zxxxbModel.zxjb" value="1" readonly>
								</div>
							</div>
							<div class="col-sm-6">
								<label for="centre-belong"
									class="col-sm-4 control-label my-label">上级中心：</label>
								<div class="col-sm-8">
									<select class="form-control my-input" id="centre-belong"
										name="zxxxbModel.sjzxbh">
										<option value=""></option>
									</select>
								</div>
								<label for="centre-remark"
									class="col-sm-4 control-label my-label">备注：</label>
								<div class="col-sm-8">
									<textarea class="form-control my-input"
										name="zxxxbModel.bz" id="centre-remark"
										style="resize: none"></textarea>
								</div>
							</div>
						</div>
						<div title="中心负责人信息"
							style="padding: 8px; border: 1px solid #ddd; margin: -1px 0 15px 0"
							class="form-group">
							<div class="container">
								<h4 style="color: #2e6da4;">
									<strong>中心负责人信息</strong>
								</h4>
							</div>
							<div class="col-sm-6">
								<label for="userId" class="col-sm-4 control-label my-label">用户编号：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input" id="userId"
										name="yhxxbModel.yhbh" readonly>
								</div>
								<label for="name" class="col-sm-4 control-label my-label">姓名<sup>*</sup>：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input" id="name"
										name="yhxxbModel.xm">
								</div>
								<label class="col-sm-4 control-label my-label">性别<sup>*</sup>：</label>
								<div class="col-sm-8">
									<label class="radio-inline"> <input type="radio"
										name="yhxxbModel.xb" value="男" id="male" />男
									</label> <label class="radio-inline"> <input type="radio"
										name="yhxxbModel.xb" value="女" id="female" />女
									</label>
								</div>
								<label for="birthday" class="col-sm-4 control-label my-label">出生日期：</label>
								<div class="col-sm-8">
        							<input type="text" class="form-control" id="datetimepicker" data-date-format="yyyy-mm-dd" name="csrq">
								</div>
								<label for="job" class="col-sm-4 control-label my-label">岗位名称：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input" id="job"
										name="gwmc" readonly value="系统管理员">
								</div>
							</div>
							<div class="col-sm-6">
								<label for="phoneNum" class="col-sm-4 control-label my-label">电话号码：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input" id="phoneNum"
										name="yhxxbModel.dhhm">
								</div>
								<label for="email" class="col-sm-4 control-label my-label">Email：</label>
								<div class="col-sm-8">
									<input type="email" class="form-control my-input" id="email"
										name="yhxxbModel.email">
								</div>
								<label for="qq" class="col-sm-4 control-label my-label">QQ：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input" id="qq"
										name="yhxxbModel.qq">
								</div>
								<label for="userRemark" class="col-sm-4 control-label my-label">备注：</label>
								<div class="col-sm-8">
									<textarea class="form-control my-input"
										name="yhxxbModel.bz" id="userRemark"
										style="resize: none"></textarea>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">取消</button>
							<button type="submit" class="btn btn-primary">提交</button>
							<input type="reset" name="reset" style="display:none;">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- 确认删除模态框 -->
	<div class="modal fade" id="delete-centre-modal" tabindex="-1" role="dialog" aria-labelledby="delete-center-ModalLabel">
	  <div class="modal-dialog modal-sm" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="delete-center-ModalLabel">提示</h4>
	      </div>
	      <div class="modal-body" id="delete-center-windows">
	        <p>是否确定删除选中记录</p>
	        <div class="modal-footer">
	          <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
	          <button id="centre-del-submit" type="button" class="btn btn-primary" data-target="">确定</button>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- 精确查找模态框 -->
	<div class="modal fade" id="exact-query-modal" tabindex="-1"
		role="dialog" aria-labelledby="exact-query-ModalLabel">
	  <div class="modal-dialog modal-md" role="document">
		<div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="exact-query-ModalLabel">精确查找</h4>
	      </div>
	      <div class="modal-body" id="delete-center-windows">
	        <form id="exactQuery-form" method="post"
						action="<%=path %>/centreInfor/exactQueryZxxxb"
						class="form-horizontal"
						style="border: 1px solid #ddd; padding: 15px">
						<div title="中心信息"
							style="padding: 8px; border: 1px solid #ddd; margin: -1px 0 15px 0"
							class="form-group">
							<div class="container">
								<h4 style="color: #2e6da4">
									<strong>中心信息</strong>
								</h4>
							</div>
							<div class="col-sm-12">
								<label for="centre-id" class="col-sm-4 control-label my-label">中心编号：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input"
										name="zxbh" >
								</div>
								<label for="centre-name" class="col-sm-4 control-label my-label">中心名称：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input"
										name="zxmc">
								</div>
								<label for="centre-level"
									class="col-sm-4 control-label my-label">中心级别：</label>
								<div class="col-sm-8">
									<input type="text" class="form-control my-input"
										name="zxjb">
								</div>
								<label for="supcentreName"
									class="col-sm-4 control-label my-label">上级中心：</label>
								<div class="col-sm-8">
									<select class="form-control my-input" id="centre-belong-exact"
										name="sjzxbh">
										<option value=""></option>
									</select>
									<!-- <input class="form-control my-input"
										name="sjzxmc">  -->
									<!-- <input type="text" class="form-control my-input" id="supCenterName" name="sjzxmc"> -->
								</div>
								<label for="centre-remark"
									class="col-sm-4 control-label my-label">备注：</label>
								<div class="col-sm-8">
									<textarea class="form-control my-input"
										name="bz"
										style="resize: none"></textarea>
								</div>
							</div>
						</div>
						<div class="modal-footer">
	          				<button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
	          				<button id="exact-query-submit" type="submit" class="btn btn-primary">查询</button>
	          				<input type="reset" name="reset" style="display:none;">
	        			</div>
					</form>
	      </div>
	    </div>
      </div>
	</div>
	<footer class="row center-footer navbar-fixed-bottom">
		<p class="col-md-12 col-sm-12 col-xs-12 copyright">
			&copy; <a href="http://www.kmust.edu.cn/" target="_blank">XXXX设计单位</a>
			0000 - 2015
		</p>
	</footer>
	<!-- external javascript -->
	<script src="third-party/jquery/jquery.min.js"></script>
	<script src="third-party/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- 增强cookie的插件 -->
	<script src="third-party/jquery/jquery.cookie.js"></script>
	<!-- dataTable的插件 -->
	<script src="third-party/datatables/media/js/jquery.dataTables.min.js"></script>
	<script src="third-party/datatables/media/js/dataTables.bootstrap.min.js"></script>
	<!-- <script src="third-party/datatables/media/js/dataTables.select.min.js"></script>  -->
	<!-- FormValidation plugin and the class supports validating Bootstrap form -->
	<script src="third-party/FormValidation/dist/js/formValidation.min.js"></script>
	<script src="third-party/FormValidation/dist/js/framework/bootstrap.min.js"></script>
	<script src="third-party/FormValidation/dist/js/language/zh_CN.js"></script>
	<script src="third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
	<script src="third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
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
	<!-- 中心的JS -->
	<script src="basic/js/center.js"></script>
</body>
</html>