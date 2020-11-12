$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/express/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'revenue', index: 'revenue', width: 80 }, 			
			{ label: '', name: 'operateProfit', index: 'operate_profit', width: 80 }, 			
			{ label: '', name: 'totalProfit', index: 'total_profit', width: 80 }, 			
			{ label: '', name: 'nIncome', index: 'n_income', width: 80 }, 			
			{ label: '', name: 'totalAssets', index: 'total_assets', width: 80 }, 			
			{ label: '', name: 'totalHldrEqyExcMinInt', index: 'total_hldr_eqy_exc_min_int', width: 80 }, 			
			{ label: '', name: 'dilutedEps', index: 'diluted_eps', width: 80 }, 			
			{ label: '', name: 'dilutedRoe', index: 'diluted_roe', width: 80 }, 			
			{ label: '', name: 'yoyNetProfit', index: 'yoy_net_profit', width: 80 }, 			
			{ label: '', name: 'bps', index: 'bps', width: 80 }, 			
			{ label: '', name: 'yoySales', index: 'yoy_sales', width: 80 }, 			
			{ label: '', name: 'yoyOp', index: 'yoy_op', width: 80 }, 			
			{ label: '', name: 'yoyTp', index: 'yoy_tp', width: 80 }, 			
			{ label: '', name: 'yoyDeduNp', index: 'yoy_dedu_np', width: 80 }, 			
			{ label: '', name: 'yoyEps', index: 'yoy_eps', width: 80 }, 			
			{ label: '', name: 'yoyRoe', index: 'yoy_roe', width: 80 }, 			
			{ label: '', name: 'growthAssets', index: 'growth_assets', width: 80 }, 			
			{ label: '', name: 'yoyEquity', index: 'yoy_equity', width: 80 }, 			
			{ label: '', name: 'growthBps', index: 'growth_bps', width: 80 }, 			
			{ label: '', name: 'orLastYear', index: 'or_last_year', width: 80 }, 			
			{ label: '', name: 'opLastYear', index: 'op_last_year', width: 80 }, 			
			{ label: '', name: 'tpLastYear', index: 'tp_last_year', width: 80 }, 			
			{ label: '', name: 'npLastYear', index: 'np_last_year', width: 80 }, 			
			{ label: '', name: 'epsLastYear', index: 'eps_last_year', width: 80 }, 			
			{ label: '', name: 'openNetAssets', index: 'open_net_assets', width: 80 }, 			
			{ label: '', name: 'openBps', index: 'open_bps', width: 80 }, 			
			{ label: '', name: 'perfSummary', index: 'perf_summary', width: 80 }, 			
			{ label: '', name: 'isAudit', index: 'is_audit', width: 80 }, 			
			{ label: '', name: 'remark', index: 'remark', width: 80 }			
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
		express: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.express = {};
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
                var url = vm.express.id == null ? "sys/express/save" : "sys/express/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.express),
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
                        url: baseURL + "sys/express/delete",
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
			$.get(baseURL + "sys/express/info/"+id, function(r){
                vm.express = r.express;
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