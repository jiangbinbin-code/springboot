$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/cncpi/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'month', index: 'month', width: 80 }, 			
			{ label: '', name: 'ntVal', index: 'nt_val', width: 80 }, 			
			{ label: '', name: 'ntYoy', index: 'nt_yoy', width: 80 }, 			
			{ label: '', name: 'ntMom', index: 'nt_mom', width: 80 }, 			
			{ label: '', name: 'ntAccu', index: 'nt_accu', width: 80 }, 			
			{ label: '', name: 'townVal', index: 'town_val', width: 80 }, 			
			{ label: '', name: 'townYoy', index: 'town_yoy', width: 80 }, 			
			{ label: '', name: 'townMom', index: 'town_mom', width: 80 }, 			
			{ label: '', name: 'townAccu', index: 'town_accu', width: 80 }, 			
			{ label: '', name: 'cntVal', index: 'cnt_val', width: 80 }, 			
			{ label: '', name: 'cntYoy', index: 'cnt_yoy', width: 80 }, 			
			{ label: '', name: 'cntMom', index: 'cnt_mom', width: 80 }, 			
			{ label: '', name: 'cntAccu', index: 'cnt_accu', width: 80 }			
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
		cnCpi: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.cnCpi = {};
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
                var url = vm.cnCpi.id == null ? "sys/cncpi/save" : "sys/cncpi/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.cnCpi),
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
                        url: baseURL + "sys/cncpi/delete",
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
			$.get(baseURL + "sys/cncpi/info/"+id, function(r){
                vm.cnCpi = r.cnCpi;
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