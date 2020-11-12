$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/futweeklydetail/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'exchange', index: 'exchange', width: 80 }, 			
			{ label: '', name: 'prd', index: 'prd', width: 80 }, 			
			{ label: '', name: 'name', index: 'name', width: 80 }, 			
			{ label: '', name: 'vol', index: 'vol', width: 80 }, 			
			{ label: '', name: 'volYoy', index: 'vol_yoy', width: 80 }, 			
			{ label: '', name: 'amount', index: 'amount', width: 80 }, 			
			{ label: '', name: 'amoutYoy', index: 'amout_yoy', width: 80 }, 			
			{ label: '', name: 'cumvol', index: 'cumvol', width: 80 }, 			
			{ label: '', name: 'cumvolYoy', index: 'cumvol_yoy', width: 80 }, 			
			{ label: '', name: 'cumamt', index: 'cumamt', width: 80 }, 			
			{ label: '', name: 'cumamtYoy', index: 'cumamt_yoy', width: 80 }, 			
			{ label: '', name: 'openInterest', index: 'open_interest', width: 80 }, 			
			{ label: '', name: 'interestWow', index: 'interest_wow', width: 80 }, 			
			{ label: '', name: 'mcClose', index: 'mc_close', width: 80 }, 			
			{ label: '', name: 'closeWow', index: 'close_wow', width: 80 }, 			
			{ label: '', name: 'week', index: 'week', width: 80 }, 			
			{ label: '', name: 'weekDate', index: 'week_date', width: 80 }			
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
		futWeeklyDetail: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.futWeeklyDetail = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
		    $('#btnSaveOrUpdate').button('loading').delay(1000).queue(function() {
                var url = vm.futWeeklyDetail.id == null ? "sys/futweeklydetail/save" : "sys/futweeklydetail/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.futWeeklyDetail),
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
			var ids = getSelectedRows();
			if(ids == null){
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
                        url: baseURL + "sys/futweeklydetail/delete",
                        contentType: "application/json",
                        data: JSON.stringify(ids),
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
		getInfo: function(id){
			$.get(baseURL + "sys/futweeklydetail/info/"+id, function(r){
                vm.futWeeklyDetail = r.futWeeklyDetail;
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