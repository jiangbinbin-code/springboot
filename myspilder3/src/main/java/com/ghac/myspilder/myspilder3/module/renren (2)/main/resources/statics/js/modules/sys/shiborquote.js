$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/shiborquote/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'date', index: 'date', width: 80 }, 			
			{ label: '', name: 'bank', index: 'bank', width: 80 }, 			
			{ label: '', name: 'onB', index: 'on_b', width: 80 }, 			
			{ label: '', name: 'onA', index: 'on_a', width: 80 }, 			
			{ label: '', name: 'w1B', index: 'w1_b', width: 80 }, 			
			{ label: '', name: 'w1A', index: 'w1_a', width: 80 }, 			
			{ label: '', name: 'w2B', index: 'w2_b', width: 80 }, 			
			{ label: '', name: 'w2A', index: 'w2_a', width: 80 }, 			
			{ label: '', name: 'm1B', index: 'm1_b', width: 80 }, 			
			{ label: '', name: 'm1A', index: 'm1_a', width: 80 }, 			
			{ label: '', name: 'm3B', index: 'm3_b', width: 80 }, 			
			{ label: '', name: 'm3A', index: 'm3_a', width: 80 }, 			
			{ label: '', name: 'm6B', index: 'm6_b', width: 80 }, 			
			{ label: '', name: 'm6A', index: 'm6_a', width: 80 }, 			
			{ label: '', name: 'm9B', index: 'm9_b', width: 80 }, 			
			{ label: '', name: 'm9A', index: 'm9_a', width: 80 }, 			
			{ label: '', name: 'y1B', index: 'y1_b', width: 80 }, 			
			{ label: '', name: 'y1A', index: 'y1_a', width: 80 }			
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
		shiborQuote: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.shiborQuote = {};
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
                var url = vm.shiborQuote.id == null ? "sys/shiborquote/save" : "sys/shiborquote/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.shiborQuote),
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
                        url: baseURL + "sys/shiborquote/delete",
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
			$.get(baseURL + "sys/shiborquote/info/"+id, function(r){
                vm.shiborQuote = r.shiborQuote;
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