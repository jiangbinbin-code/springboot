$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/ustbr/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'date', index: 'date', width: 80 }, 			
			{ label: '', name: 'w4Bd', index: 'w4_bd', width: 80 }, 			
			{ label: '', name: 'w4Ce', index: 'w4_ce', width: 80 }, 			
			{ label: '', name: 'w8Bd', index: 'w8_bd', width: 80 }, 			
			{ label: '', name: 'w8Ce', index: 'w8_ce', width: 80 }, 			
			{ label: '', name: 'w13Bd', index: 'w13_bd', width: 80 }, 			
			{ label: '', name: 'w13Ce', index: 'w13_ce', width: 80 }, 			
			{ label: '', name: 'w26Bd', index: 'w26_bd', width: 80 }, 			
			{ label: '', name: 'w26Ce', index: 'w26_ce', width: 80 }, 			
			{ label: '', name: 'w52Bd', index: 'w52_bd', width: 80 }, 			
			{ label: '', name: 'w52Ce', index: 'w52_ce', width: 80 }			
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
		usTbr: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.usTbr = {};
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
                var url = vm.usTbr.id == null ? "sys/ustbr/save" : "sys/ustbr/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.usTbr),
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
                        url: baseURL + "sys/ustbr/delete",
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
			$.get(baseURL + "sys/ustbr/info/"+id, function(r){
                vm.usTbr = r.usTbr;
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