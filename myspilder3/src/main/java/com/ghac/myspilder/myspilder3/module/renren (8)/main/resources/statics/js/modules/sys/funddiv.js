$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/funddiv/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'impAnndate', index: 'imp_anndate', width: 80 }, 			
			{ label: '', name: 'baseDate', index: 'base_date', width: 80 }, 			
			{ label: '', name: 'divProc', index: 'div_proc', width: 80 }, 			
			{ label: '', name: 'recordDate', index: 'record_date', width: 80 }, 			
			{ label: '', name: 'exDate', index: 'ex_date', width: 80 }, 			
			{ label: '', name: 'payDate', index: 'pay_date', width: 80 }, 			
			{ label: '', name: 'earpayDate', index: 'earpay_date', width: 80 }, 			
			{ label: '', name: 'netExDate', index: 'net_ex_date', width: 80 }, 			
			{ label: '', name: 'divCash', index: 'div_cash', width: 80 }, 			
			{ label: '', name: 'baseUnit', index: 'base_unit', width: 80 }, 			
			{ label: '', name: 'earDistr', index: 'ear_distr', width: 80 }, 			
			{ label: '', name: 'earAmount', index: 'ear_amount', width: 80 }, 			
			{ label: '', name: 'accountDate', index: 'account_date', width: 80 }, 			
			{ label: '', name: 'baseYear', index: 'base_year', width: 80 }			
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
		fundDiv: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.fundDiv = {};
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
                var url = vm.fundDiv.id == null ? "sys/funddiv/save" : "sys/funddiv/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.fundDiv),
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
                        url: baseURL + "sys/funddiv/delete",
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
			$.get(baseURL + "sys/funddiv/info/"+id, function(r){
                vm.fundDiv = r.fundDiv;
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