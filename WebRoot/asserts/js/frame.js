/**
 * 本文件中是整个框子中所需要的行为代码，包括topbar，sidebar，以及树的点击行为
 */
!function($){
	/**
	 * 初始化
	 */
	// 加载缓存的主题
	var defaultTheme = "cerulean";
	var currentTheme = $.cookie("currentTheme") == null ? defaultTheme : $.cookie("currentTheme");
	// 如果是IE浏览器需要特别的进行一定限制
	var msie = navigator.userAgent.match(/msie/i);
	$.browser = {};
	$.browser.msie = {};
	switchTheme(currentTheme);
	var History = window.History, State = History.getState(), $log = $("#log");
	// 修改页面浏览历史查看的行为
	History.Adapter.bind(window, "statechange", function() {
		var State = History.getState();
		$.ajax({
			url : State.url,
			success : function(msg) {
				// 将msg中返回的HTML中ID=content的元素填入本页面的content中
				console.log($(msg).find("#content"));
				$("#content").html($(msg).find("#content").html());
				$("#loading").remove();
				$("#content").fadeIn();
				var newTitle = $(msg).filter("title").text();
				$("title").text(newTitle);
				//页面刷新
				docReady();
			}
		});
	});
	/**
	 * 顶部工具条的行为
	 */
	// 指引
	$("#frametour").click(function(){
		doFrameTour();
	});
	// 主题切换
	$('#themes a').click(function (e) {
	    e.preventDefault();
	    currentTheme = $(this).attr('data-value');
	    $.cookie('currentTheme', currentTheme, {expires: 365});
	    switchTheme(currentTheme);
	});
	
	// 侧边导航显示
	$('.navbar-toggle').click(function (e) {
	    e.preventDefault();
	    $('.nav-sm').html($('.navbar-collapse').html());
	    $('.sidebar-nav').toggleClass('active');
	    $(this).toggleClass('active');
	});
	var $sidebarNav = $('.sidebar-nav');
	//点击其他位置隐藏悬浮侧边栏
	$(document).mouseup(function (e) {
	    if (!$sidebarNav.is(e.target) // if the target of the click isn't the container...
	        && $sidebarNav.has(e.target).length === 0
	        && !$('.navbar-toggle').is(e.target)
	        && $('.navbar-toggle').has(e.target).length === 0
	        && $sidebarNav.hasClass('active')
	        )// ... nor a descendant of the container
	    {
	        e.stopPropagation();
	        $('.navbar-toggle').click();
	    }
	});
	// 侧边菜单的加载
	$.ajax({
		url:"data/tree.json",
		cache:false,
		dataType:"json",
		error:function(xhr,error){
			console.log(error);
		},
		success:function(data){
			if(data && data.success && data.nodes){
			   var templateStr = [
			    "{{#each this}}",
			        "<li class=\"accordion\">",
			        	"<a href=\"#\">",
			        		"<i class=\"glyphicon glyphicon-plus\"></i>",
			        		"<span>{{this.text}}</span>",
			        	"</a>",
				        "<ul class=\"nav nav-pills nav-stacked\">",
					    "{{#each nodes}}",
				        	"<li><a href=\"{{this.href}}\">{{this.text}}</a></li>",
				        "{{/each}}",
				        "</ul>",
			        "</li>",
				"{{/each}}"].join("");
			   var template = Handlebars.compile(templateStr);
			   $(".main-menu").append(template(data.nodes));
			   /**
				 * 侧边菜单的行为
				 */
			  // 点击一级菜单
			  $('a.ajax-link').click(function (e) {
			      if (msie) e.which = 1;
			      // 通过条件---which需要为1，父元素不具有active的CSS
			      if (e.which != 1 || $(this).parent().hasClass('active')) return;
			      e.preventDefault();
			      // 侧边栏和导航切换按钮取消激活状态
			      $('.sidebar-nav').removeClass('active');
			      $('.navbar-toggle').removeClass('active');
			      $('#loading').remove();
			      // 主区域淡去---并显示加载
			      $('#content').fadeOut().parent().append('<div id="loading" class="center">加载中...<div class="center"></div></div>');
			      var $clink = $(this);
			      console.log( $clink.attr('href'));
			      History.pushState(null, null, $clink.attr('href'));
			      $('ul.main-menu li.active').removeClass('active');
			      $clink.parent('li').addClass('active');
			  });
			  // 点击父折叠菜单
			  $('.accordion > a').click(function (e) {
			      e.preventDefault();
			      var $ul = $(this).siblings('ul');
			      var $li = $(this).parent();
			      if ($ul.is(':visible')) $li.removeClass('active');
			      else                    $li.addClass('active');
			      $ul.slideToggle();
			  });
			  // 父折叠菜单展开
			  $('.accordion li.active:first').parents('ul').slideDown();
			  //页面刷新
			  docReady();
		   }
		}
	});
	// 使用指导---判断是否第一次使用来进行显示
    if($.cookie('currentTheme') == null){
    	// 主框架的网站指引
    	//doFrameTour();
    }
  
}(window.jQuery);

function docReady(){
	//高亮当前页面选中节点---使用URL匹配
   $('ul.main-menu li a').each(function () {
       if ($($(this))[0].href == String(window.location))
       {
    	   $(this).parent().addClass('active');
    	   // 如果是二级菜单，则打开一级
    	   if($(this).parents(".accordion").length > 0){
    		   $(this).parents('ul').slideDown();
    	   }
       }
   });
 	// 阻止#链接使页面回到顶端
   $('a[href="#"][data-top!=true]').click(function (e) {
       e.preventDefault();
   });
};

// 切换主题
function switchTheme(themeName) {
    if (themeName == 'classic') {
        $('#bs-css').attr('href', 'third-party/bootstrap/dist/css/bootstrap.min.css');
    } else {
        $('#bs-css').attr('href', 'css/bootstrap-' + themeName + '.min.css');
    }

    $('#themes i').removeClass('glyphicon glyphicon-ok whitespace').addClass('whitespace');
    $('#themes a[data-value=' + themeName + ']').find('i').removeClass('whitespace').addClass('glyphicon glyphicon-ok');
};

// 主框架的网站指引
function doFrameTour(){
	var frameTour = new Tour();
  frameTour.addStep({
      element: "#content", /* 弹出框所贴附的元素ID */
      placement: "top", /* 弹出框所在元素的方向*/
      title: "主功能区", /* 弹出标题 */
      content: "这里是主要显示区，主要的操作功能都在这里." /* 弹出内容 */
  });
  frameTour.addStep({
      element: ".main-menu",
      placement: "right",
      title: "导航",
      content: "在这里选择相应菜单，打开相应面板."
  });
  frameTour.addStep({
    element: ".theme-container",
    placement: "left",
    title: "主题",
    content: "你可以在这里改换主题皮肤."
  });
  frameTour.addStep({
    element: "#content", /* 弹出框所贴附的元素ID */
    placement: "top", /* 弹出框所在元素的方向 */
    title: "开始", /* 弹出标题 */
    content: "现在开始使用吧.=^_^=" /* 弹出内容 */
  });
  frameTour.restart();
}