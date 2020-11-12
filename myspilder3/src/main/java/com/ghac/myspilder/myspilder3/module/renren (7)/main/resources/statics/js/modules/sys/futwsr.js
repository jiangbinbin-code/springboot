$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/futwsr/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tradeDate', index: 'trade_date', width: 80 }, 			
			{ label: '', name: 'symbol', index: 'symbol', width: 80 }, 			
			{ label: '', name: 'futName', index: 'fut_name', width: 80 }, 			
			{ label: '', name: 'warehouse', index: 'warehouse', width: 80 }, 			
			{ label: '', name: 'whId', index: 'wh_id', width: 80 }, 			
			{ label: '', name: 'preVol', index: 'pre_vol', width: 80 }, 			
			{ label: '', name: 'vol', index: 'vol', width: 80 }, 			
			{ label: '', name: 'volChg', index: 'vol_chg', width: 80 }, 			
			{ label: '', name: 'area', index: 'area', width: 80 }, 			
			{ label: '', name: 'year', index: 'year', width: 80 }, 			
			{ label: '', name: 'grade', index: 'grade', width: 80 }, 			
			{ label: '', name: 'brand', index: 'brand', width: 80 }, 			
			{ label: '', name: 'place', index: 'place', width: 80 }, 			
			{ label: '', name: 'pd', index: 'pd', width: 80 }, 			
			{ label: '', name: 'isCt', index: 'is_ct', width: 80 }, 			
			{ label: '', name: 'unit', index: 'unit', width: 80 }, 			
			{ label: '', name: 'exchange', index: 'exchange', width: 80 }			
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
		futWsr: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.futWsr = {};
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
                var url = vm.futWsr.id == null ? "sys/futwsr/save" : "sys/futwsr/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.futWsr),
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
                        url: baseURL + "sys/futwsr/delete",
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
			$.get(baseURL + "sys/futwsr/info/"+id, function(r){
                vm.futWsr = r.futWsr;
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