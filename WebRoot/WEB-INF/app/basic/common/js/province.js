$(document).ready(
	function() {
		initTable("province","Shfxxb","省份信息", "Dqxxb", "city");
		initTable("city","Dqxxb","地区信息", "Xfxxb", "town");
		initTable("town","Xfxxb","县份信息", null, null);
	});


//初始化表格的各种功能，如：查询，添加，删除等。
function initTable(name, table, title, subTable, subName){
	var $table = $("#"+name+"Info"),
		$subTable = $("#"+subName+"Info"),
		$search = $("#"+name+"-search"),
		$exactSearch = $("#"+name+"-exact-search"),
		searchUrl = "provinceInfor/generalQuery"+table,
		exactQueryUrl = "provinceInfor/exactQuery"+table,
		subExactQueryUrl = "provinceInfor/exactQuery"+subTable,
		parentUrl = "provinceInfor/"+name+"QueryParent",
		insertUrl = "provinceInfor/add"+table,
		delUrl = "provinceInfor/delete"+table,
		modifiedUrl = "provinceInfor/update"+table,
		$insertForm = $("#"+name+"-form"),
		$insertModal = $("#create-"+name+"-modal"),
		$createButton = $("#"+name+"-create-button"),
		$modifiedButton = $("#"+name+"-modified-button"),
		$delButton = $("#"+name+"-del-button"),
		$delSubmit = $("#del-submit"),
		$delModal = $("#delete-modal");
	var whoDel;
	var selections;
	var insertOrModified;
	var permission = $('#permission').val();

	//初始化时，修改，删除按钮不可用，只有表格中有列被选中时才能使用。
	if(!(permission == 'true')){
		$createButton.prop('disabled', true);
	}
	$delButton.prop('disabled', true);
	$modifiedButton.prop('disabled', true);
	
	//表初始化
	var provinceTable = $table.DataTable({
		"ajax" : "",
		"bLengthChange" : false,
		"bFilter" : false,
		"scrollY": 200,
        "scrollCollapse": true,
        "paging":  false,
        "bInfo": false,
        "bProcessing": true,
        "language":{
        	"url":"data/chinese.json"
        },
        "columnDefs":[
			 { "orderable":false, "targets":1},
			 { "orderable":false, "targets":2},
		 ],
		"columns" : eval(name+'()')
	});

	$('#'+name+'Info tbody').on('click','tr',function() {
		$(this).toggleClass('selected');
		if(permission == 'true'){
			$delButton.prop('disabled', !provinceTable.rows('.selected').data().length);
			$modifiedButton.prop('disabled', provinceTable.rows('.selected').data().length != 1);
		}				
		selections = provinceTable.rows('.selected').data();		
	});
	$('#'+name+'Info tbody').on('dblclick','tr',function() {
		var id = $(this).children("td:eq(0)").text();
		$.ajax({
			type:"post",
			data:'paramPairs={"supId":"'+id+'"}',
			url:subExactQueryUrl,
			dataType:'Json',
			error:function(data){	
			},
			success:function(data){
				var rows = data.data;
				$subTable.dataTable().fnClearTable();   //将数据清除
	            $subTable.dataTable().fnAddData(rows,true);  //数据必须是json对象或json对象数组
			},
		})
	});

	//表单验证初始化
	function initFormValidation(exact){
		$insertForm.formValidation({
			icon: {
	            valid: 'glyphicon glyphicon-ok',
	            invalid: 'glyphicon glyphicon-remove',
	            validating: 'glyphicon glyphicon-refresh'
	        },
	        framework:'bootstrap',
	        fields: validationOrNot(exact),
		})
		.on('success.form.fv', function(e) {
	        // Prevent submit form
			console.log("success");
			e.preventDefault();
			var url;
			var data;
	        if(insertOrModified == "insert"){
	        	url = insertUrl;
	        	data = $(this).serialize();
	        }else if(insertOrModified == "modified"){
		        url = modifiedUrl;
		        data = $(this).serialize();
	        }else{
		        url = exactQueryUrl;
		        var a = $(this).serializeArray();
	        	var o = {};
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
	        	data = "paramPairs="+JSON.stringify(o);
	        }
	        
	        
	        $.post(url, data,function(data){
		        if(insertOrModified != "exactQuery"){
		        	if(data.success == true){
			        	alert(data.msg);
			        }else{
			        	alert(data.msg);
		        	}
		        }else{
	        		//重新构建table
	              	$table.dataTable().fnClearTable();   //将数据清除
	              	$table.dataTable().fnAddData(data.data,true);  //数据必须是json对象或json对象数组
		        }
	        });

	        $insertModal.modal('hide');
	        $(e.target)
	        .formValidation('resetForm', true);
	    })
	    .on('err.form.fv', function(e) {
	        //console.log("error");
	        
	    });
	}
    
	//刷新功能
	function flushTable(keyword){
		$.ajax({
			type:'post',
			url:searchUrl,
			data:"query="+keyword,
			dataType:'Json',
			success:function(msg){
              //重新构建table
              $table.dataTable().fnClearTable();   //将数据清除
              $table.dataTable().fnAddData(msg.data,true);  //数据必须是json对象或json对象数组
              },
              error:function(){
                  alert('error');
              }  
  		});
	    $delButton.prop('disabled', true);
		$modifiedButton.prop('disabled', true);
	}
	
	//查询ajax
	$search.click(function(){
		flushTable($("#"+name+"keyword").val());
	});

	//精确查询
	$exactSearch.click(function(){
		$("#"+name+"-ModalLabel").html("精确查询");
		insertOrModified = "exactQuery";
		$("input[name=reset]").click();
		$insertForm.formValidation('destroy');
		initFormValidation(false);
	})
	//上级select标签初始化
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
					var option	= '<option value="'+rows[i].id+'">'+rows[i].name+'</option>';
					$('#'+name+'-belong').append(option);
				}
			},
		});
	});

	//点击新建按钮时清空表单
	$createButton.click(function(){
		$("#"+name+"-ModalLabel").html(title);
		
		insertOrModified = "insert";
		$("input[name=reset]").click();
		$insertForm.formValidation('destroy');
		initFormValidation(true);
		//$insertForm.formValidation('_init');
	});

	//点击修改按钮时将选着的列，填入表单
	$modifiedButton.click(function(){
		//var selections = eval(name+'Selections');
		$("#"+name+"-ModalLabel").html(title);
		insertOrModified = "modified";
		$('#'+name+'-id').val(selections[0].id);
		$('#'+name+'-name').val(selections[0].name);
		$('#'+name+'-remark').val(selections[0].bz);
		$('#'+name+'-id').attr("required","required");
		//$('#'+name+'-belong option:eq("")').remove();
		//$('#'+name+'-belong option[index="0"]').attr('selected',true);
		$('#'+name+'-belong option:contains('+selections[0].supName+')').each(function() {
			if ($(this).text() == selections[0].supName) {
			     $(this).attr('selected', true);
		  	}
		});
	});
	$delButton.click(function(){
		whoDel = true;
	})

	//确认删除
	$delSubmit.click(function(){
		var ids = "" ;
		//var selections = eval(name+'Selections');
		if(!whoDel) return;
		for(var i = 0 ; i < selections.length; i++){
			ids = ids+selections[i].id+',';
		}

	    $.ajax({
			data:"primaryKeys="+ids,
			type:"POST",
			dataType:"JSON",
			url:delUrl,
			error:function(data){	
			},
			success:function(data){
				if(data.success == true){
		        	alert(data.msg);
		        }else{
		        	alert(data.msg);
	        	}
			},
		});
	    whoDel = false;
	    $delModal.modal('hide');
	    //flushTable("");
	});
}

//省份columns
function province(){
	return [ {
		"data" : "id",
		'sClass': "text-center"
	},{
		"data" : "name",
		'sClass': "text-center"
	},  {
		"data" : "bz",
		'sClass': "text-center"
	} ];
}
//地区columns
function city(){
	return [ {
		"data" : "id",
		"sClass": "text-center"
	},{
		"data" : "supName",
		"sClass" : "text-center",
	},{
		"data" : "name",
		'sClass': "text-center"
	},  {
		"data" : "bz",
		"sClass": "text-center"
	} ];
}
//县份columns
function town(){
	return [ {
		"data" : "id",
		"sClass": "text-center"
	},{
		"data" : "supName",
		"sClass" : "text-center",
	},{
		"data" : "name",
		'sClass': "text-center"
	},  {
		"data" : "bz",
		"sClass": "text-center"
	} ];
}

function validationOrNot(flag){
	if(flag){
		return {
        	id: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 6,
                        message: '编号为国家规定的6位'
                    },
                    regexp: {
                        regexp: /^[0-9]+$/,
                        message: '数字'
                    }
                }
            },
            name:{
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            supId:{
            	validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            }
        };
	}else{
		return {};
	}
}
//表格最小化和关闭
$('.btn-minimize').click(function (e) {
    e.preventDefault();
    var $target = $(this).parent().parent().next('.box-content');
    if ($target.is(':visible')) $('i', $(this)).removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');
    else                       $('i', $(this)).removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');
    $target.slideToggle();
});
$('.btn-close').click(function (e) {
    e.preventDefault();
    $(this).parent().parent().parent().fadeOut();
});
//动态获取表格高度
function getHeight() {
    return ($(window).height() - $('#title').outerHeight(true) - 20)/3;
}