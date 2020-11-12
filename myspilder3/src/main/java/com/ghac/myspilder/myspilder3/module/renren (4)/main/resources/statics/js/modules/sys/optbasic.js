$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/optbasic/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'exchange', index: 'exchange', width: 80 }, 			
			{ label: '', name: 'name', index: 'name', width: 80 }, 			
			{ label: '', name: 'perUnit', index: 'per_unit', width: 80 }, 			
			{ label: '', name: 'optCode', index: 'opt_code', width: 80 }, 			
			{ label: '', name: 'optType', index: 'opt_type', width: 80 }, 			
			{ label: '', name: 'callPut', index: 'call_put', width: 80 }, 			
			{ label: '', name: 'exerciseType', index: 'exercise_type', width: 80 }, 			
			{ label: '', name: 'exercisePrice', index: 'exercise_price', width: 80 }, 			
			{ label: '', name: 'sMonth', index: 's_month', width: 80 }, 			
			{ label: '', name: 'maturityDate', index: 'maturity_date', width: 80 }, 			
			{ label: '', name: 'listPrice', index: 'list_price', width: 80 }, 			
			{ label: '', name: 'listDate', index: 'list_date', width: 80 }, 			
			{ label: '', name: 'delistDate', index: 'delist_date', width: 80 }, 			
			{ label: '', name: 'lastEdate', index: 'last_edate', width: 80 }, 			
			{ label: '', name: 'lastDdate', index: 'last_ddate', width: 80 }, 			
			{ label: '', name: 'quoteUnit', index: 'quote_unit', width: 80 }, 			
			{ label: '', name: 'minPriceChg', index: 'min_price_chg', width: 80 }			
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
		optBasic: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.optBasic = {};
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
                var url = vm.optBasic.id == null ? "sys/optbasic/save" : "sys/optbasic/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.optBasic),
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
                        url: baseURL + "sys/optbasic/delete",
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
			$.get(baseURL + "sys/optbasic/info/"+id, function(r){
                vm.optBasic = r.optBasic;
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