$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/qrtztriggers/list',
        datatype: "json",
        colModel: [			
			{ label: 'schedName', name: 'schedName', index: 'SCHED_NAME', width: 50, key: true },
			{ label: '', name: 'triggerName', index: 'TRIGGER_NAME', width: 80 }, 			
			{ label: '', name: 'triggerGroup', index: 'TRIGGER_GROUP', width: 80 }, 			
			{ label: '', name: 'jobName', index: 'JOB_NAME', width: 80 }, 			
			{ label: '', name: 'jobGroup', index: 'JOB_GROUP', width: 80 }, 			
			{ label: '', name: 'description', index: 'DESCRIPTION', width: 80 }, 			
			{ label: '', name: 'nextFireTime', index: 'NEXT_FIRE_TIME', width: 80 }, 			
			{ label: '', name: 'prevFireTime', index: 'PREV_FIRE_TIME', width: 80 }, 			
			{ label: '', name: 'priority', index: 'PRIORITY', width: 80 }, 			
			{ label: '', name: 'triggerState', index: 'TRIGGER_STATE', width: 80 }, 			
			{ label: '', name: 'triggerType', index: 'TRIGGER_TYPE', width: 80 }, 			
			{ label: '', name: 'startTime', index: 'START_TIME', width: 80 }, 			
			{ label: '', name: 'endTime', index: 'END_TIME', width: 80 }, 			
			{ label: '', name: 'calendarName', index: 'CALENDAR_NAME', width: 80 }, 			
			{ label: '', name: 'misfireInstr', index: 'MISFIRE_INSTR', width: 80 }, 			
			{ label: '', name: 'jobData', index: 'JOB_DATA', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		qrtzTriggers: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.qrtzTriggers = {};
		},
		update: function (event) {
			var schedName = getSelectedRow();
			if(schedName == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(schedName)
		},
		saveOrUpdate: function (event) {
		    $('#btnSaveOrUpdate').button('loading').delay(1000).queue(function() {
                var url = vm.qrtzTriggers.schedName == null ? "sys/qrtztriggers/save" : "sys/qrtztriggers/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.qrtzTriggers),
                    success: function(r){
                        if(r.code === 0){
                             layer.msg("操作成功", {icon: 1});
                             vm.reload();
                             $('#btnSaveOrUpdate').button('reset');
                             $('#btnSaveOrUpdate').dequeue();
                        }else{
                            layer.alert(r.msg);
                            $('#btnSaveOrUpdate').button('reset');
                            $('#btnSaveOrUpdate').dequeue();
                        }
                    }
                });
			});
		},
		del: function (event) {
			var schedNames = getSelectedRows();
			if(schedNames == null){
				return ;
			}
			var lock = false;
            layer.confirm('确定要删除选中的记录？', {
                btn: ['确定','取消'] //按钮
            }, function(){
               if(!lock) {
                    lock = true;
		            $.ajax({
                        type: "POST",
                        url: baseURL + "sys/qrtztriggers/delete",
                        contentType: "application/json",
                        data: JSON.stringify(schedNames),
                        success: function(r){
                            if(r.code == 0){
                                layer.msg("操作成功", {icon: 1});
                                $("#jqGrid").trigger("reloadGrid");
                            }else{
                                layer.alert(r.msg);
                            }
                        }
				    });
			    }
             }, function(){
             });
		},
		getInfo: function(schedName){
			$.get(baseURL + "sys/qrtztriggers/info/"+schedName, function(r){
                vm.qrtzTriggers = r.qrtzTriggers;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});