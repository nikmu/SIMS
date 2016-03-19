var selections;	
var insertOrModified;
var isExact = false;
var permission = $('#permission').val();

$(document).ready(
	function() {
		$('#datetimepicker').datetimepicker({
			weekStart: 1,
	        startDate: "1920-1-1",
	        startView: "year",
	        minView: "month",
	        maxView: "decade",
	        language: "zh-CN",
	        initialDate: "1984-1-1"
		});
		initTable("centre","Zxxxb");
	});

//初始化表格的各种功能，如：查询，添加，删除等。
function initTable(name, table){
	var $table = $("#"+name+"Info"),
		$search = $("#"+name+"-search"),
		searchUrl = name+"Infor/generalQuery"+table,
		parentUrl = name+"Infor/queryParent",
		insertUrl = name+"Infor/addZxxxb",
		delUrl = name+"Infor/deleteZxxxb",
		modifiedUrl = name+"Infor/updateZxxxb",
		managerUrl = name+"Infor/queryManager",
		$insertForm = $("#"+name+"-form"),
		$insertModal = $("#create-"+name+"-modal"),
		$createButton = $("#"+name+"-create-button"),
		$modifiedButton = $("#"+name+"-modified-button"),
		$delButton = $("#"+name+"-del-button"),
		$delSubmit = $("#"+name+"-del-submit"),
		$delModal = $("#delete-"+name+"-modal");

	//初始化时，修改，删除按钮不可用，只有表格中有列被选中时才能使用。
	if(!(permission == 'true')){
		$createButton.prop('disabled', true);
	}
	$delButton.prop('disabled', true);
	$modifiedButton.prop('disabled', true);

	var table = $table.DataTable({
		"bServerSide": true,
		"bSort":false,
		"sAjaxSource" : searchUrl,
		"fnServerData":function(sSource, aoData, fnCallback){
			aoData.push({"name":"offset","value":aoData[3].value});
			aoData.push({"name":"limit","value":aoData[4].value});
			aoData.push({"name":"query","value":$("#keyword").val()});
			aoData.push({"name":"sort","value":"id"});
		
        	var a = $('#exactQuery-form').serializeArray();
        	var o = {};
        	if(isExact){
	        	var url = "/SIMS/centreInfor/exactQueryZxxxb";
        	}else{
	        	var url = sSource;
        	}
        	$.each(a, function(){
        		if (o[this.name]) {
        	           if (!o[this.name].push) {
        	               o[this.name] = [o[this.name]];
        	           }
        	           o[this.name].push(this.value || '');
        	       } else {
        	           o[this.name] = this.value || ''; 
        	       }
        	});
        	//var query = 'paramPairs='+JSON.stringify(o);
        	aoData.push({"name":"paramPairs","value":JSON.stringify(o)});
        	
			$.ajax({
				type:'post',
				url:url,
				data:aoData,
				dataType:'Json',
				success:function(msg){
                  //重新构建table
                  fnCallback(msg);
                }
			});
		},
		"bFilter" : false,
		"dom":'<"top">tr<"bottom"lp><"clear">',
		"language":{
        	"url":"data/chinese.json"
        },
		"columns" : [ {
			"data" : "zxbh",
			'sClass': "text-center"
		}, {
			"data" : "zxmc",
			'sClass': "text-center"
		}, {
			"data" : "zxjb",
			'sClass': "text-center"
		}, {
			"data" : "sjzxmc",
			'sClass': "text-center"
		}, {
			"data" : "bz",
			'sClass': "text-center"
		} ]
	});

	$('#centreInfo tbody').on('click','tr',function() {
		$(this).toggleClass('selected');
		if(permission == 'true'){
			$('#centre-del-button').prop('disabled', !table.rows('.selected').data().length);
			$('#centre-modified-button').prop('disabled', table.rows('.selected').data().length != 1);
		}
		selections = table.rows('.selected').data();
		//console.log(table.rows('.selected').data()[0]);					
	});

	//表单验证
	function initFormValidation(){
		$insertForm.formValidation({
			icon: {
	            valid: 'glyphicon glyphicon-ok',
	            invalid: 'glyphicon glyphicon-remove',
	            validating: 'glyphicon glyphicon-refresh'
	        },
	        framework:'bootstrap',
	        fields: {
	        	"zxxxbModel.zxmc": {
	                row: '.col-sm-8',
	                validators: {
	                    notEmpty: {
	                        message: '中心名称不能为空'
	                    }
	                }
	            },
	            "zxxxbModel.bz":{
	            	validators:{
		            	stringLength: {
	                        max: 50,
	                        message: '备注不能超过50个字符'
	                    }
	            	}
	            },
	            "yhxxbModel.xm":{
	                row: '.col-sm-8',
	                validators: {
	                    notEmpty: {
	                        message: '用户名不能为空'
	                    }
	                }
	            },
	        	"yhxxbModel.qq":{
		            validators:{
		            	stringLength: {
	                        min: 4,
	                        max: 11,
	                        message: 'QQ号应该在4-11位之间'
	                    },
	                    regexp: {
	                        regexp: /^[0-9]+$/,
	                        message: 'QQ号码为数字'
	                    }
	            	}
	        	},
	        	"yhxxbModel.dhhm":{
		            validators:{
		            	stringLength: {
	                        min: 8,
	                        max: 13,
	                        message: '电话或手机号应该在8-13位之间'
	                    },
	                    regexp: {
	                        regexp: /^[0-9\-]+$/,
	                        message: '电话号码为数字'
	                    }
	            	}
	        	},
	            "yhxxbModel.bz":{
	            	validators:{
		            	stringLength: {
	                        max: 50,
	                        message: '备注不能超过50个字符'
	                    }
	            	}
	            }
	        },
		})
		.on('success.form.fv', function(e) {
	        // Prevent submit form
	        e.preventDefault();

	        var url;
			var op;
	        if(insertOrModified == "insert"){
	        	url = insertUrl;
	        	op = "创建";
	        }else{
		        url = modifiedUrl;
		        op = "修改";
	        }
	        
	        
	        $.post(url, $(this).serialize(),function(data){
		        if(data.success == true){
		        	$insertModal.modal('hide');
		        	alert(data.data.name+op+"成功！中心管理员为："+data.data.manager);
		        }
	        });

	        flushTable();
	        $delButton.prop('disabled', true);
			$modifiedButton.prop('disabled', true);
	        //$("input[name=reset]").click();
	        $(e.target).formValidation('disableSubmitButtons', false)
	        .formValidation('resetForm', true);
	    })
	    .on('err.form.fv', function(e) {
	        //console.log("error");
	        
	    });
	}
	
	//刷新功能
	function flushTable(){
		isExact = false;
        $table.dataTable().fnClearTable();   //将数据清除,刷新
         //$table.dataTable().fnAddData(msg.data,true);  //数据必须是json对象或json对象数组
	}
	
	//查询ajax
	$search.click(function(){
		flushTable();
	});

	//上级中心select标签初始化
	$(function(){
		$.ajax({
			type:"GET",
			dataType:"JSON",
			url:parentUrl,
			error:function(data){	
			},
			success:function(data){
				var rows = data.rows;
				for(var i = 0 ; i < data.rows.length; i++ ){
					var option	= '<option value="'+rows[i].zxbh+'">'+rows[i].zxmc+'</option>';
					$('#'+name+'-belong').append(option);
					$('#'+name+'-belong-exact').append(option);
				}
			},
		});
	});

	//点击新建按钮时清空表单
	$createButton.click(function(){
		insertOrModified = "insert";
		$("input[name=reset]").click();
		$insertForm.formValidation('destroy');
		initFormValidation();
	});

	//精确查询表格清空
	$("#centre-exact-search").click(function(){
		$("input[name=reset]").click();
	})
	
	//点击修改按钮时将选着的列，填入表单
	$modifiedButton.click(function(){
		insertOrModified = "modified";
		console.log(selections[0]);
		$('#'+name+'-id').val(selections[0].zxbh);
		$('#'+name+'-name').val(selections[0].zxmc);
		$('#'+name+'-level').val(selections[0].zxjb);
		$('#'+name+'-remark').val(selections[0].bz);
		$('#'+name+'-belong option:eq("")').attr('selected',true);
		$('#'+name+'-belong option:contains('+selections[0].sjzxmc+')').each(function() {
			if ($(this).text() == selections[0].sjzxmc) {
			     $(this).attr('selected', true);
		  	}
		});
		$.ajax({
			type:"POST",
			dataType:"JSON",
			url:managerUrl,
			data:{zxbh:selections[0].zxbh,gwmc:$("#job").val()},
			error:function(data){	
			},
			success:function(data){
				console.log(data.data);
				$('#userId').val(data.data[0][0]);
				$('#name').val(data.data[0][4]);
				$('#phoneNum').val(data.data[0][7]);
				//$('#datetimepicker').val(data.data[0][]);
			},
		});
		$insertForm.formValidation('destroy');
		initFormValidation();
	});

	$delSubmit.click(function(){
		var ids = "" ;
		for(var i = 0 ; i < selections.length; i++){
			ids = ids+selections[i].zxbh+',';
		}
	    
	    $.ajax({
			data:"primaryKeys="+ids,
			type:"POST",
			dataType:"JSON",
			url:delUrl,
			error:function(data){	
			},
			success:function(data){
			},
		});
	    $delModal.modal('hide');
	    flushTable();
	    $delButton.prop('disabled', true);
		$modifiedButton.prop('disabled', true);
	});

	//精确查找ajax
    $('#exactQuery-form').submit(function(e){
    	e.preventDefault();
    	isExact = true;
    	//var url = $(this).attr('action');
		$table.dataTable().fnClearTable();
        $('#exact-query-modal').modal('hide');
        $delButton.prop('disabled', true);
		$modifiedButton.prop('disabled', true);
    });
}



$(function(){
	//根据选择的中心变化中心级别
    $("#centre-belong").change(function(){
        if($(this).val() == ""){
        	$('#centre-level').val("1");
        }else{
        	$('#centre-level').val("2");
        }
    });
})