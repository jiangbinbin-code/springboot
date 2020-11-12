$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/dailybasic/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'tradeDate', index: 'trade_date', width: 80 }, 			
			{ label: '', name: 'close', index: 'close', width: 80 }, 			
			{ label: '', name: 'turnoverRate', index: 'turnover_rate', width: 80 }, 			
			{ label: '', name: 'turnoverRateF', index: 'turnover_rate_f', width: 80 }, 			
			{ label: '', name: 'volumeRatio', index: 'volume_ratio', width: 80 }, 			
			{ label: '', name: 'pe', index: 'pe', width: 80 }, 			
			{ label: '', name: 'peTtm', index: 'pe_ttm', width: 80 }, 			
			{ label: '', name: 'pb', index: 'pb', width: 80 }, 			
			{ label: '', name: 'ps', index: 'ps', width: 80 }, 			
			{ label: '', name: 'psTtm', index: 'ps_ttm', width: 80 }, 			
			{ label: '', name: 'dvRatio', index: 'dv_ratio', width: 80 }, 			
			{ label: '', name: 'dvTtm', index: 'dv_ttm', width: 80 }, 			
			{ label: '', name: 'totalShare', index: 'total_share', width: 80 }, 			
			{ label: '', name: 'floatShare', index: 'float_share', width: 80 }, 			
			{ label: '', name: 'freeShare', index: 'free_share', width: 80 }, 			
			{ label: '', name: 'totalMv', index: 'total_mv', width: 80 }, 			
			{ label: '', name: 'circMv', index: 'circ_mv', width: 80 }			
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
		dailyBasic: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.dailyBasic = {};
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
                var url = vm.dailyBasic.id == null ? "sys/dailybasic/save" : "sys/dailybasic/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.dailyBasic),
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
                        url: baseURL + "sys/dailybasic/delete",
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
			$.get(baseURL + "sys/dailybasic/info/"+id, function(r){
                vm.dailyBasic = r.dailyBasic;
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