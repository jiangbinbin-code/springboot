$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/bakdaily/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'tradeDate', index: 'trade_date', width: 80 }, 			
			{ label: '', name: 'name', index: 'name', width: 80 }, 			
			{ label: '', name: 'pctChange', index: 'pct_change', width: 80 }, 			
			{ label: '', name: 'close', index: 'close', width: 80 }, 			
			{ label: '', name: 'change', index: 'change', width: 80 }, 			
			{ label: '', name: 'open', index: 'open', width: 80 }, 			
			{ label: '', name: 'high', index: 'high', width: 80 }, 			
			{ label: '', name: 'low', index: 'low', width: 80 }, 			
			{ label: '', name: 'preClose', index: 'pre_close', width: 80 }, 			
			{ label: '', name: 'volRatio', index: 'vol_ratio', width: 80 }, 			
			{ label: '', name: 'turnOver', index: 'turn_over', width: 80 }, 			
			{ label: '', name: 'swing', index: 'swing', width: 80 }, 			
			{ label: '', name: 'vol', index: 'vol', width: 80 }, 			
			{ label: '', name: 'amount', index: 'amount', width: 80 }, 			
			{ label: '', name: 'selling', index: 'selling', width: 80 }, 			
			{ label: '', name: 'buying', index: 'buying', width: 80 }, 			
			{ label: '', name: 'totalShare', index: 'total_share', width: 80 }, 			
			{ label: '', name: 'floatShare', index: 'float_share', width: 80 }, 			
			{ label: '', name: 'pe', index: 'pe', width: 80 }, 			
			{ label: '', name: 'industry', index: 'industry', width: 80 }, 			
			{ label: '', name: 'area', index: 'area', width: 80 }, 			
			{ label: '', name: 'floatMv', index: 'float_mv', width: 80 }, 			
			{ label: '', name: 'totalMv', index: 'total_mv', width: 80 }, 			
			{ label: '', name: 'avgPrice', index: 'avg_price', width: 80 }, 			
			{ label: '', name: 'strength', index: 'strength', width: 80 }, 			
			{ label: '', name: 'activity', index: 'activity', width: 80 }, 			
			{ label: '', name: 'avgTurnover', index: 'avg_turnover', width: 80 }, 			
			{ label: '', name: 'attack', index: 'attack', width: 80 }, 			
			{ label: '', name: 'interval3', index: 'interval_3', width: 80 }, 			
			{ label: '', name: 'interval6', index: 'interval_6', width: 80 }			
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
		bakDaily: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.bakDaily = {};
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
                var url = vm.bakDaily.id == null ? "sys/bakdaily/save" : "sys/bakdaily/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.bakDaily),
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
                        url: baseURL + "sys/bakdaily/delete",
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
			$.get(baseURL + "sys/bakdaily/info/"+id, function(r){
                vm.bakDaily = r.bakDaily;
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