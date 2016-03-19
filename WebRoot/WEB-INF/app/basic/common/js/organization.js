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
		initTable("organization","Dwxxb");
	}
)
		

//初始化表格的各种功能，如：查询，添加，删除等。
function initTable(name, table){
	var $table = $("#"+name+"Info"),
		$search = $("#"+name+"-search"),
		searchUrl = name+"Infor/generalQuery"+table,
		parentUrl = name+"Infor/queryParent",
		insertUrl = name+"Infor/add"+table,
		delUrl = name+"Infor/delete"+table,
		modifiedUrl = name+"Infor/update"+table,
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
		"sAjaxSource" : searchUrl,
		"fnServerData":function(sSource, aoData, fnCallback){
			aoData.push({"name":"offset","value":aoData[3].value});
			aoData.push({"name":"limit","value":aoData[4].value});
			aoData.push({"name":"query","value":$("#keyword").val()});
			aoData.push({"name":"sort","value":"id"});
		
        	var a = $('#exactQuery-form').serializeArray();
        	var o = {};
        	if(isExact){
	        	var url = "/SIMS/organizationInfor/exactQueryDwxxb";
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
                  console.log(msg);
                  fnCallback(msg);
                }
			});
		},
		"language":{
        	"url":"data/chinese.json"
        },
		"bFilter" : false,
		"dom":'<"top">tr<"bottom"lp><"clear">',
		"bSort": false,
		"columns" : [ {
			"data" : "dwbh",
			'sClass': "text-center"
		}, {
			"data" : "dwmc",
			'sClass': "text-center"
		}, {
			"data" : "dwmcpym",
			'sClass': "text-center"
		}, {
			"data" : "dwdj",
			'sClass': "text-center"
		}, {
			"data" : "dwxz",
			'sClass': "text-center"
		}, {
			"data" : "sssf",
			'sClass': "text-center"
		}, {
			"data" : "ssdq",
			'sClass': "text-center"
		}, {
			"data" : "dwdz",
			'sClass': "text-center"
		}, {
			"data" : "sszxmc",
			'sClass': "text-center"
		}, {
			"data" : "bz",
			'sClass': "text-center"
		} ]
	});

	$('#organizationInfo tbody').on('click','tr',function() {
		$(this).toggleClass('selected');
		if(permission == 'true'){
			$('#organization-del-button').prop('disabled', !table.rows('.selected').data().length);
			$('#organization-modified-button').prop('disabled', table.rows('.selected').data().length != 1);
		}
		selections = table.rows('.selected').data();					
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
	        	"dwxxbModel.dwmc": {
	                row: '.col-sm-8',
	                validators: {
	                    notEmpty: {
	                        message: '单位名称不能为空'
	                    }
	                }
	            },
	            "dwxxbModel.bz":{
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
	            "dwxxbModel.sszxbh":{
	            	validators: {
	                    notEmpty: {
	                        message: '所属中心不能为空'
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
	        	url = "organizationInfor/addDwxxb";
	        	op = "创建";
	        }else{
		        url = modifiedUrl;
		        op = "修改";
	        }
	        
	        
	        $.post(url, $(this).serialize(),function(data){
		        if(data.success == true){
		        	$insertModal.modal('hide');
		        	alert(data.data.name+op+"成功！单位管理员为："+data.data.manager);
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

	//所属中心select标签初始化
	$(function(){
		$.ajax({
			type:"GET",
			dataType:"JSON",
			url:parentUrl,
			error:function(data){	
			},
			success:function(data){
				var rows = data.data;
				for(var i = 0 ; i < rows.length; i++ ){
					var option	= '<option value="'+rows[i].zxbh+'">'+rows[i].zxmc+'</option>';
					$('#'+name+'-belong').append(option);
				}
			},
		});
	});
	//所属省份select标签初始化
	$(function(){
		$.ajax({
			type:"GET",
			dataType:"JSON",
			url:"provinceInfor/generalQueryShfxxb",
			error:function(data){	
			},
			success:function(data){
				var rows = data.data;
				for(var i = 0 ; i < rows.length; i++ ){
					var option	= '<option value="'+rows[i].name+'">'+rows[i].name+'</option>';
					$('#'+name+'-belongProvince').append(option);
					$('#'+name+'-belongProvince-exact').append(option);
				}
			},
		});
	});
	//根据所选省份初始化所属地区select标签
	changeCitySelect($('#'+name+'-belongProvince'), $('#'+name+'-belongCity'));
	changeCitySelect($('#'+name+'-belongProvince-exact'), $('#'+name+'-belongCity-exact'));
	
	//点击新建按钮时清空表单
	$createButton.click(function(){
		insertOrModified = "insert";
		$("input[name=reset]").click();
		$insertForm.formValidation('destroy');
		initFormValidation();
	});

	//精确查询表格清空
	$("#organization-exact-search").click(function(){
		$("input[name=reset]").click();
	})
	//点击修改按钮时将选着的列，填入表单
	$modifiedButton.click(function(){
		insertOrModified = "modified";
		$('#'+name+'-id').val(selections[0].dwbh);
		$('#'+name+'-name').val(selections[0].dwmc);
		$('#'+name+'-level').val(selections[0].dwdj);
		$('#'+name+'-remark').val(selections[0].bz);
		$('#'+name+'-pym').val(selections[0].dwmcpym);
		$('#'+name+'-property').val(selections[0].dwxz);
		$('#'+name+'-add').val(selections[0].dwdz);
		//$insertForm.formValidation('resetForm', true);
		//$('#'+name+'-belong option:eq("")').attr('selected',true);
		$('#'+name+'-belong option:contains('+selections[0].sszxmc+')').each(function() {
			if ($(this).text() == selections[0].sszxmc) {
			     $(this).attr('selected', true);
		  	}
		});
		$('#'+name+'-belongProvince option:contains('+selections[0].sssf+')').each(function() {
			if ($(this).text() == selections[0].sssf) {
			     $(this).attr('selected', true);
		  	}
		});
		$.ajax({
			type:"POST",
			dataType:"JSON",
			data:"paramPairs={'supName':'"+$('#'+name+'-belongProvince').val()+"'}",
			url:"provinceInfor/exactQueryDqxxb",
			async:false,
			error:function(data){	
			},
			success:function(data){
				var rows = data.data;
				$('#'+name+'-belongCity').empty();
				$('#'+name+'-belongCity').append("<option value=''>选择地区</option>");
				for(var i = 0 ; i < rows.length; i++ ){
					var option	= '<option value="'+rows[i].name+'">'+rows[i].name+'</option>';
					$('#'+name+'-belongCity').append(option);
				}
			},
		});
		$('#'+name+'-belongCity option:contains('+selections[0].ssdq+')').each(function() {
			if ($(this).text() == selections[0].ssdq) {
			     $(this).attr('selected', true);
		  	}
		});
		
		$.ajax({
			type:"POST",
			dataType:"JSON",
			url:managerUrl,
			data:{dwbh:selections[0].dwbh,gwmc:$("#job").val()},
			error:function(data){	
			},
			success:function(data){
				$('#userId').val(data.data[0][0]);
				$('#name').val(data.data[0][4]);
				$('#phoneNum').val(data.data[0][7]);
			},
		});
		$insertForm.formValidation('destroy');
		initFormValidation();
	});

	$delSubmit.click(function(){
		var ids = "" ;
		for(var i = 0 ; i < selections.length; i++){
			ids = ids+selections[i].dwbh+',';
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

//根据选择的中心变化中心级别
//$(function(){
//    $("#organization-belong").change(function(){
//        if($(this).val() == ""){
//        	$('#organization-level').val("1");
//        }else{
//        	$('#organization-level').val("2");
//        }
//    })
//})

function changeCitySelect(provinceSelect, citySelect){
	provinceSelect.change(function(){
		$.ajax({
			type:"POST",
			dataType:"JSON",
			data:"paramPairs={'supName':'"+provinceSelect.val()+"'}",
			url:"provinceInfor/exactQueryDqxxb",
			error:function(data){	
			},
			success:function(data){
				var rows = data.data;
				citySelect.empty();
				citySelect.append("<option value=''>选择地区</option>");
				for(var i = 0 ; i < rows.length; i++ ){
					var option	= '<option value="'+rows[i].name+'">'+rows[i].name+'</option>';
					citySelect.append(option);
				}
			},
		});
	});
}