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
						<li><a href="#">单位信息维护</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 单位信息维护
								</h2>
							</div>
							<div class="box-content table-responsive">
								<div id="organization-toolbar">
									<div class="form-inline" role="form">
										<input id="keyword" name="keyword" class="form-control" type="text"
											placeholder="Search">
										<button id="organization-search" type="submit"
											class="btn btn-default">查询</button>
										<button id="organization-exact-search" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#exact-query-modal">精确查询</button>
										<button id="organization-create-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-organization-modal">新增</button>
										<button id="organization-modified-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-organization-modal">修改</button>
										<button id="organization-del-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#delete-organization-modal">删除</button>
									</div>
								</div>
								<table id="organizationInfo"
									class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>单位编号</th>
											<th>单位名称</th>
											<th>单位拼音码</th>
											<th>单位等级</th>
											<th>单位性质</th>
											<th>所属省份</th>
											<th>所属地州</th>
											<th>单位地址</th>
											<th>所属中心名称</th>
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
		<!-- row ends -->
	</div>
	<!-- 插入模态框 -->
	<div class="modal fade" id="create-organization-modal" tabindex="-1"
		role="dialog" aria-labelledby="create-organization-myModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="create-organization-myModalLabel">中心信息</h4>
				</div>
				<div class="modal-body" id="create-organization_window">
					<form id="organization-form" method="post"
						class="form-horizontal"
						style="border: 1px solid #ddd; padding: 15px">
						<div title="单位信息"
							style="padding: 8px; border: 1px solid #ddd; margin: -1px 0 15px 0"
							class="form-group">
							<div class="container">
								<h4 style="color: #2e6da4">
									<strong>单位信息</strong>
								</h4>
							</div>
							<div class="col-sm-6">
				                <label for="organization-id" class="col-sm-4 control-label my-label">单位编号：</label>
				                <div class="col-sm-8">
				                  <input type="text" class="form-control my-input" id="organization-id" name="dwxxbModel.dwbh" readonly>
				                </div>
				                <label for="organization-name" class="col-sm-4 control-label my-label">单位名称<sup>*</sup>：</label>
				                <div class="col-sm-8">
				                  <input type="text" class="form-control my-input" id="organization-name" name="dwxxbModel.dwmc">
				                </div>
				                <label for="organization-pym" class="col-sm-4 control-label my-label">单位名称拼音码：</label>
				                <div class="col-sm-8">
				                  <input type="text" class="form-control my-input" id="organization-pym" name="dwxxbModel.dwmcpym">
				                </div>
				                <label for="organization-level" class="col-sm-4 control-label my-label">单位等级：</label>
				                <div class="col-sm-8">
				                  <input type="text" class="form-control my-input" id="organization-level" name="dwxxbModel.dwdj">
				                </div>
				                <label for="organization-property" class="col-sm-4 control-label my-label">单位性质：</label>
				                <div class="col-sm-8">
				                  <input type="text" class="form-control my-input" id="organization-property" name="dwxxbModel.dwxz">
				                </div>
				                <label for="organization-belongProvince" class="col-sm-4 control-label my-label">所属省份：</label>
				                <div class="col-sm-8">
				                  <select class="form-control my-input" id="organization-belongProvince" name="dwxxbModel.sssf">
				                  	<option value=''>选择省份</option>
				                  </select>
				                </div>
				              </div>
						    <div class="col-sm-6">
				                <label for="organization-belongCity" class="col-sm-4 control-label my-label">所属地区：</label>
				                <div class="col-sm-8">
				                  <select class="form-control my-input" id="organization-belongCity" name="dwxxbModel.ssdq">
				                  	<option value=''>选择地区</option>
				                  </select>
				                </div>
				                <label for="organization-add" class="col-sm-4 control-label my-label">单位地址：</label>
				                <div class="col-sm-8">
				                  <textarea class="form-control my-input" id="organization-add" style="resize: none" name="dwxxbModel.dwdz"></textarea>
				                </div>
				                <label for="organization-belong" class="col-sm-4 control-label my-label">所属中心名称<sup>*</sup>：</label>
				                <div class="col-sm-8">
				                  <select class="form-control my-input" id="organization-belong" name="dwxxbModel.sszxbh">
				                  	<option value=''>选择所属中心</option>
				                  </select>
				                </div>
				                <label for="organization-remark" class="col-sm-4 control-label my-label">备注：</label>
				                <div class="col-sm-8">
				                  <textarea class="form-control my-input" id="organization-remark" style="resize: none" name="dwxxbModel.bz"></textarea>
				                </div>
				              </div>							
						</div>
						<div title="单位负责人信息"
							style="padding: 8px; border: 1px solid #ddd; margin: -1px 0 15px 0"
							class="form-group">
							<div class="container">
								<h4 style="color: #2e6da4;">
									<strong>单位负责人信息</strong>
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
								<label class="col-sm-4 control-label my-label">性别：</label>
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
	<div class="modal fade" id="delete-organization-modal" tabindex="-1" role="dialog" aria-labelledby="delete-center-ModalLabel">
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
	          <button id="organization-del-submit" type="button" class="btn btn-primary" data-target="">确定</button>
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
				action="<%=path %>/organizationInfor/exactQueryDwxxb"
				class="form-horizontal"
				style="border: 1px solid #ddd; padding: 15px">
				<div title="单位信息"
					style="padding: 8px; border: 1px solid #ddd; margin: -1px 0 15px 0"
					class="form-group">
					<div class="container">
						<h4 style="color: #2e6da4">
							<strong>单位信息</strong>
						</h4>
					</div>
					<div class="col-sm-12">
						<label for="organization-id" class="col-sm-4 control-label my-label">单位编号：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control my-input"
								name="dwbh" >
						</div>
						<label for="organization-name" class="col-sm-4 control-label my-label">单位名称：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control my-input"
								id="organization-name" name="dwmc">
						</div>
						<label for="organization-pym" class="col-sm-4 control-label my-label">单位名称拼音码：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control my-input"
								id="organization-pym" name="dwmcpym">
						</div>
						<label for="organization-level"
							class="col-sm-4 control-label my-label">单位等级：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control my-input"
								id="organization-level" name="dwdj">
						</div>
						<label for="organization-property"
							class="col-sm-4 control-label my-label">单位性质：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control my-input"
								id="organization-property" name="dwxz">
						</div>
						<label for="organization-belongProvince-exact" class="col-sm-4 control-label my-label">所属省份：</label>
		                <div class="col-sm-8">
		                  <select class="form-control my-input col-sm-8" id="organization-belongProvince-exact" name="sssf">
		                  	<option value=''>选择省份</option>
		                  </select>
		                </div>
		                <label for="organization-belongCity-exact" class="col-sm-4 control-label my-label">所属地区：</label>
		                <div class="col-sm-8">
		                  <select class="form-control my-input col-sm-8" id="organization-belongCity-exact" name="ssdq">
		                  	<option value=''>选择地区</option>
		                  </select>
		                </div>
		                <label for="organization-add" class="col-sm-4 control-label my-label">单位地址：</label>
		                <div class="col-sm-8">
		                  <textarea class="form-control my-input col-sm-8" id="organization-add" style="resize: none" name="dwdz"></textarea>
		                </div>
						<label for="suporganizationName"
							class="col-sm-4 control-label my-label">所属中心名称：</label>
						<div class="col-sm-8">
							<input class="form-control my-input"
								name="sszxmc">
							<!-- <input type="text" class="form-control my-input" id="supCenterName" name="sjzxmc"> -->
						</div>
						<label for="organization-remark"
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
	<script src="third-party/datatables/media/js/jquery.dataTables.js"></script>
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
	<script src="basic/js/organization.js"></script>
</body>
</html>