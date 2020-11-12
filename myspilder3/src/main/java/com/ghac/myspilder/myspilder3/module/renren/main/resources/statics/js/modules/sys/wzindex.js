$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/wzindex/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'date', index: 'date', width: 80 }, 			
			{ label: '', name: 'compRate', index: 'comp_rate', width: 80 }, 			
			{ label: '', name: 'centerRate', index: 'center_rate', width: 80 }, 			
			{ label: '', name: 'microRate', index: 'micro_rate', width: 80 }, 			
			{ label: '', name: 'cmRate', index: 'cm_rate', width: 80 }, 			
			{ label: '', name: 'sdbRate', index: 'sdb_rate', width: 80 }, 			
			{ label: '', name: 'omRate', index: 'om_rate', width: 80 }, 			
			{ label: '', name: 'aaRate', index: 'aa_rate', width: 80 }, 			
			{ label: '', name: 'm1Rate', index: 'm1_rate', width: 80 }, 			
			{ label: '', name: 'm3Rate', index: 'm3_rate', width: 80 }, 			
			{ label: '', name: 'm6Rate', index: 'm6_rate', width: 80 }, 			
			{ label: '', name: 'm12Rate', index: 'm12_rate', width: 80 }, 			
			{ label: '', name: 'longRate', index: 'long_rate', width: 80 }			
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
		wzIndex: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.wzIndex = {};
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
                var url = vm.wzIndex.id == null ? "sys/wzindex/save" : "sys/wzindex/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.wzIndex),
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
                        url: baseURL + "sys/wzindex/delete",
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
			$.get(baseURL + "sys/wzindex/info/"+id, function(r){
                vm.wzIndex = r.wzIndex;
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