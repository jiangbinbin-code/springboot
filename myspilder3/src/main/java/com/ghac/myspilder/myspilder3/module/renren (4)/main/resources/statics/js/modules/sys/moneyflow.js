$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/moneyflow/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'tradeDate', index: 'trade_date', width: 80 }, 			
			{ label: '', name: 'buySmVol', index: 'buy_sm_vol', width: 80 }, 			
			{ label: '', name: 'buySmAmount', index: 'buy_sm_amount', width: 80 }, 			
			{ label: '', name: 'sellSmVol', index: 'sell_sm_vol', width: 80 }, 			
			{ label: '', name: 'sellSmAmount', index: 'sell_sm_amount', width: 80 }, 			
			{ label: '', name: 'buyMdVol', index: 'buy_md_vol', width: 80 }, 			
			{ label: '', name: 'buyMdAmount', index: 'buy_md_amount', width: 80 }, 			
			{ label: '', name: 'sellMdVol', index: 'sell_md_vol', width: 80 }, 			
			{ label: '', name: 'sellMdAmount', index: 'sell_md_amount', width: 80 }, 			
			{ label: '', name: 'buyLgVol', index: 'buy_lg_vol', width: 80 }, 			
			{ label: '', name: 'buyLgAmount', index: 'buy_lg_amount', width: 80 }, 			
			{ label: '', name: 'sellLgVol', index: 'sell_lg_vol', width: 80 }, 			
			{ label: '', name: 'sellLgAmount', index: 'sell_lg_amount', width: 80 }, 			
			{ label: '', name: 'buyElgVol', index: 'buy_elg_vol', width: 80 }, 			
			{ label: '', name: 'buyElgAmount', index: 'buy_elg_amount', width: 80 }, 			
			{ label: '', name: 'sellElgVol', index: 'sell_elg_vol', width: 80 }, 			
			{ label: '', name: 'sellElgAmount', index: 'sell_elg_amount', width: 80 }, 			
			{ label: '', name: 'netMfVol', index: 'net_mf_vol', width: 80 }, 			
			{ label: '', name: 'netMfAmount', index: 'net_mf_amount', width: 80 }			
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
		moneyflow: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.moneyflow = {};
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
                var url = vm.moneyflow.id == null ? "sys/moneyflow/save" : "sys/moneyflow/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.moneyflow),
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
                        url: baseURL + "sys/moneyflow/delete",
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
			$.get(baseURL + "sys/moneyflow/info/"+id, function(r){
                vm.moneyflow = r.moneyflow;
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