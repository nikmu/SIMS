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
<link href="third-party/datatables/media/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="third-party/datatables/media/css/select.bootstrap.min.css" rel="stylesheet">
<!-- FormValidation CSS file -->
<link rel="stylesheet" href="third-party/FormValidation/dist/css/formValidation.min.css">
<link rel="stylesheet" href="third-party/FormValidation/vendor/bootstrap-datetimepicker.min.css"/>
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
						<li><a href="#">省份信息维护</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 省份信息维护
								</h2>

								<div class="box-icon">
									<a href="#" class="btn btn-minimize btn-round btn-default"><i
										class="glyphicon glyphicon-chevron-up"></i></a> <a href="#"
										class="btn btn-close btn-round btn-default"><i
										class="glyphicon glyphicon-remove"></i></a>
								</div>
							</div>
							<div class="box-content table-responsive">
								<div id="province-toolbar">
									<div class="form-inline" role="form">
										<input id="provincekeyword" name="keyword" class="form-control" type="text"
											placeholder="Search">
										<button id="province-search" type="submit"
											class="btn btn-default">查询</button>
										<button id="province-exact-search" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-province-modal">精确查询</button>
										<button id="province-create-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-province-modal">新增</button>
										<button id="province-modified-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-province-modal">修改</button>
										<button id="province-del-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#delete-modal">删除</button>
									</div>
								</div>
								<table id="provinceInfo"
									class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>省份编号</th>
											<th>省份名称</th>
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
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 地区信息维护
								</h2>

								<div class="box-icon">
									<a href="#" class="btn btn-minimize btn-round btn-default"><i
										class="glyphicon glyphicon-chevron-up"></i></a> <a href="#"
										class="btn btn-close btn-round btn-default"><i
										class="glyphicon glyphicon-remove"></i></a>
								</div>
							</div>
							<div class="box-content table-responsive">
								<div id="province-toolbar">
									<div class="form-inline" role="form">
										<input id="citykeyword" name="keyword" class="form-control" type="text"
											placeholder="Search">
										<button id="city-search" type="submit"
											class="btn btn-default">查询</button>
										<button id="city-exact-search" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-city-modal">精确查询</button>
										<button id="city-create-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-city-modal">新增</button>
										<button id="city-modified-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-city-modal">修改</button>
										<button id="city-del-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#delete-modal">删除</button>
									</div>
								</div>
								<table id="cityInfo"
									class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>地区编号</th>
											<th>所属省份名称</th>
											<th>地区名称</th>
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
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 县份信息维护
								</h2>

								<div class="box-icon">
									<a href="#" class="btn btn-minimize btn-round btn-default"><i
										class="glyphicon glyphicon-chevron-up"></i></a> <a href="#"
										class="btn btn-close btn-round btn-default"><i
										class="glyphicon glyphicon-remove"></i></a>
								</div>
							</div>
							<div class="box-content table-responsive">
								<div id="province-toolbar">
									<div class="form-inline" role="form">
										<input id="townkeyword" name="keyword" class="form-control" type="text"
											placeholder="Search">
										<button id="town-search" type="submit"
											class="btn btn-default">查询</button>
										<button id="town-exact-search" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-town-modal">精确查询</button>
										<button id="town-create-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-town-modal">新增</button>
										<button id="town-modified-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#create-town-modal">修改</button>
										<button id="town-del-button" type="button"
											class="btn btn-default" data-toggle="modal"
											data-target="#delete-modal">删除</button>
									</div>
								</div>
								<table id="townInfo"
									class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>县份编号</th>
											<th>所属地区名称</th>
											<th>县份名称</th>
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
	<div class="modal fade" id="create-province-modal" tabindex="-1" role="dialog" aria-labelledby="province-ModalLabel">
	    <div class="modal-dialog modal-sm" role="document">
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	          <h4 class="modal-title" id="province-ModalLabel">省份信息</h4>
	        </div>
	        <div class="modal-body" id="create-province-windows">
	          <form id="province-form" class="form-horizontal" method="post" 
	           style="border: 1px solid #ddd; padding:15px">
	            <div class="form-group">
	              <label for="province-id" class="col-sm-5 control-label my-label" >省份编号<sup>*</sup>：</label>
	              <div class="col-sm-7">
	                <input id="province-id" type="text" class="form-control my-input" name="id" autofocus>
	              </div>
	              <label for="province-name" class="col-sm-5 control-label my-label" >省份名称<sup>*</sup>：</label>
	              <div class="col-sm-7">
	                <input id="province-name" type="text" class="form-control my-input" name="name">
	              </div>
	              <label for="province-remark" class="col-sm-5 control-label my-label">备注：</label>
	              <div class="col-sm-7">
	                <textarea id="province-remark" class="form-control my-input" name="bz" style="resize: none;"></textarea>
	              </div>
	              <input type="reset" name="reset" style="display: none;">
	            </div>
	            <div class="modal-footer">
	            <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
	            <button type="submit" class="btn btn-primary" >确定</button>
	            <input type="reset" name="reset" style="display:none;">
	          </div>
	          </form>
	        </div>
	      </div>
	    </div>
  	</div>
  	<div class="modal fade" id="create-city-modal" tabindex="-1" role="dialog" aria-labelledby="city-ModalLabel">
	    <div class="modal-dialog" role="document">
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	          <h4 class="modal-title" id="city-ModalLabel">地区信息</h4>
	        </div>
	        <div class="modal-body" id="create-city-windows">
	          <form id="city-form" class="form-horizontal" method="post" 
	           style="border: 1px solid #ddd; padding:15px">
	           <table class="table">
	           	<tr><td class="form-group">
	              <label for="city-id" class="col-sm-4 control-label" >地区编号<sup>*</sup>：</label>
	              <div class="col-sm-8">
	                <input id="city-id" type="text" class="form-control" name="id" autofocus>
	              </div>
	           	</td></tr>
	           	<tr><td class="form-group">
	              <label for="city-belong" class="col-sm-4 control-label" >所属省份名称<sup>*</sup>：</label>
	              <div class="col-sm-8">
	              	<select id="city-belong" class="form-control" name="supId">
	              		<option value=''></option>
	              	</select>
	              </div>
	           	</td></tr>
	           	<tr><td class="form-group">
	              <label for="city-name" class="col-sm-4 control-label" >地区名称<sup>*</sup>：</label>
	              <div class="col-sm-8">
	                <input id="city-name" type="text" class="form-control" name="name">
	              </div>
	           	</td></tr>
	           	<tr><td class="form-group">
	              	<label for="city-remark" class="col-sm-4 control-label">备注：</label>
	              	<div class="col-sm-8">
	                <textarea id="city-remark" class="form-control" name="bz" style="resize: none;"></textarea>
                	</div>
	           	</td></tr>
	           </table>         
	            <div class="modal-footer">
	            <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
	            <button type="submit" class="btn btn-primary" >确定</button>
	            <input type="reset" name="reset" style="display:none;">
	          </div>
	          </form>
	        </div>
	      </div>
	    </div>
  	</div>
  	<div class="modal fade" id="create-town-modal" tabindex="-1" role="dialog" aria-labelledby="town-ModalLabel">
	    <div class="modal-dialog modal-md" role="document">
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	          <h4 class="modal-title" id="town-ModalLabel">县份信息</h4>
	        </div>
	        <div class="modal-body" id="create-town-windows">
	          <form id="town-form" class="form-horizontal" method="post" 
	           style="border: 1px solid #ddd; padding:15px">
	          <table class="table table-condensed">
	           	<tr><td class="form-group">
	              <label for="town-id" class="col-sm-5 control-label my-label" >县份编号<sup>*</sup>：</label>
	              <div class="col-sm-7">
	                <input id="town-id" type="text" class="form-control my-input" name="id" autofocus>
	              </div>
	            </td></tr>
	           	<tr><td class="form-group">
	              <label for="town-belong" class="col-sm-5 control-label my-label" >所属地区名称<sup>*</sup>：</label>
	              <div class="col-sm-7">
	              	<select id="town-belong" class="form-control my-input" name="supId">
	              	<option value=""></option>
	              	</select>
	              </div>
              </td></tr>
	           <tr><td class="form-group">
	              <label for="town-name" class="col-sm-5 control-label my-label" >县份名称<sup>*</sup>：</label>
	              <div class="col-sm-7">
	                <input id="town-name" type="text" class="form-control my-input" name="name">
	              </div>
              </td></tr>
	          <tr><td class="form-group">
	              <label for="town-remark" class="col-sm-5 control-label my-label">备注：</label>
	              <div class="col-sm-7">
	                <textarea id="town-remark" class="form-control my-input" name="bz" style="resize: none;"></textarea>
	              </div>
	          </td></tr>
	          </table>
	            <div class="modal-footer">
	            	<button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
	            	<button type="submit" class="btn btn-primary" >确定</button>
	            	<input type="reset" name="reset" style="display:none;">
	          	</div>
	          </form>
	        </div>
	      </div>
	    </div>
  	</div>
	<!-- 确认删除模态框 -->
	<div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="my-delete-ModalLabel">
	    <div class="modal-dialog modal-sm" role="document">
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	          <h4 class="modal-title" id="my-delete-ModalLabel">提示</h4>
	        </div>
	        <div class="modal-body" id="warning-windows">
	          <p>是否确定删除选中记录</p>
	          <div class="modal-footer">
	            <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
	            <button type="button" class="btn btn-primary" id="del-submit">确定</button>
	          </div>
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
	<!-- FormValidation插件，用于表单验证支持bootstrap -->
	<script src="third-party/FormValidation/dist/js/formValidation.min.js"></script>
	<script src="third-party/FormValidation/dist/js/framework/bootstrap.min.js"></script>
	<script src="third-party/FormValidation/dist/js/language/zh_CN.js"></script>
	<script src="third-party/FormValidation/vendor/moment.js"></script>
	<script src="third-party/FormValidation/vendor/bootstrap-datetimepicker.min.js"></script>
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
	<script src="basic/js/province.js"></script>
</body>
</html>