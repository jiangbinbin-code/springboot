$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/stkholdertrade/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'holderName', index: 'holder_name', width: 80 }, 			
			{ label: '', name: 'holderType', index: 'holder_type', width: 80 }, 			
			{ label: '', name: 'inDe', index: 'in_de', width: 80 }, 			
			{ label: '', name: 'changeVol', index: 'change_vol', width: 80 }, 			
			{ label: '', name: 'changeRatio', index: 'change_ratio', width: 80 }, 			
			{ label: '', name: 'afterShare', index: 'after_share', width: 80 }, 			
			{ label: '', name: 'afterRatio', index: 'after_ratio', width: 80 }, 			
			{ label: '', name: 'avgPrice', index: 'avg_price', width: 80 }, 			
			{ label: '', name: 'totalShare', index: 'total_share', width: 80 }, 			
			{ label: '', name: 'beginDate', index: 'begin_date', width: 80 }, 			
			{ label: '', name: 'closeDate', index: 'close_date', width: 80 }			
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
		stkHoldertrade: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.stkHoldertrade = {};
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
                var url = vm.stkHoldertrade.id == null ? "sys/stkholdertrade/save" : "sys/stkholdertrade/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.stkHoldertrade),
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
                        url: baseURL + "sys/stkholdertrade/delete",
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
			$.get(baseURL + "sys/stkholdertrade/info/"+id, function(r){
                vm.stkHoldertrade = r.stkHoldertrade;
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